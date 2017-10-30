package com.chaneinfo.eamp.apidoc.convert;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.xwpf.usermodel.IBodyElement;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

public class ExtractWord {

	private File file;

	public ExtractWord(File file) {
		this.file = file;
	}

	@SuppressWarnings({ "unchecked" })
	public Map<String, Object> extract() throws IOException {
		InputStream is = new FileInputStream(file);
		XWPFDocument doc = new XWPFDocument(is);
		try {
			List<IBodyElement> interEles = new ArrayList<IBodyElement>(); // 提取所需的内容
			List<IBodyElement> bodyElements = doc.getBodyElements();

			int i = 0;// 一级大纲视图计数器
			for (IBodyElement element : bodyElements) {
				if (element instanceof XWPFParagraph) {
					XWPFParagraph para = (XWPFParagraph) element;
					if (CollectionUtils.isEmpty(para.getRuns())) {
						continue;
					}
					String styleId = para.getStyleID();
					if ("1".equals(styleId)) {
						i++;
						continue;
					}
				}
				if (i > 3) {
					break;
				}
				if (i != 3) {
					continue;
				}

				interEles.add(element);
			}
			// doc.close();

			Map<String, Object> result = new HashMap<String, Object>();
			Map<String, Object> interN = null;
			int num = 0;
			int count = 0;
			for (IBodyElement element : interEles) {
				num = count / 11;
				XWPFParagraph para = null;
				XWPFTable table = null;
				if (element instanceof XWPFParagraph) {
					para = (XWPFParagraph) element;
					// String styleId = para.getStyleID();
				} else if (element instanceof XWPFTable) {
					table = (XWPFTable) element;
				} else {
				}
				if (0 == count % 11) {
					// inter.put("interName", para.getText());
					interN = new HashMap<String, Object>();
					interN.put("interName", para.getText());
					result.put(String.valueOf(num), interN);
				} else {
					interN = (Map<String, Object>) result.get(String.valueOf(num));
					switch (count % 11) {
					case 1:// 请求方式
						List<XWPFRun> runsM = para.getRuns();
						String method = "";
						for (int r = 2; r < runsM.size(); r++) {
							method += runsM.get(r).getText(0);
						}
						interN.put("requestMethod", method);
						break;
					case 2:// url
						String url = "";
						List<XWPFRun> runsU = para.getRuns();
						for (int ru = 1; ru < runsU.size(); ru++) {
							url += runsU.get(ru).getText(0);
						}
						interN.put("requestUrl", url);
						break;
					case 3:// 请求参数
							// interN.put("requestParam", null);
						break;
					case 4:// 请求参数table
						List<Param> listParams = new ArrayList<Param>();
						List<XWPFTableRow> rowsP = table.getRows();
						for (int c = 1; c < rowsP.size(); c++) {// 从1开始，忽略表头
							XWPFTableRow rowP = rowsP.get(c);
							XWPFTableCell cellName = rowP.getCell(0);
							String cellText = cellName.getText();
							if (StringUtils.isBlank(cellText)) { // 忽略空白表格行
								continue;
							}
							Param param = new Param();
							param.setName(cellText);
							param.setCode(rowP.getCell(1).getText());
							XWPFTableCell cellDesc = rowP.getCell(2);
							List<XWPFParagraph> paragraphs = cellDesc.getParagraphs();
							int size = paragraphs.size();
							String desc = "";
							for (int p = 0; p < size; p++) {
								XWPFParagraph paraP = paragraphs.get(p);
								if (0 == p) {
									param.setType(paraP.getText());
								} else if (1 == p) {
									param.setIsMust("M".equals(paraP.getText()));
								} else {
									desc += paraP.getText();
								}

							}
							param.setDesc(desc);

							listParams.add(param);
						}

						interN.put("params", listParams);
						break;
					case 5:// 响应参数列表
						break;
					case 6:// 响应参数列表table
						List<ResultData> res = new ArrayList<ResultData>();
						List<XWPFTableRow> rowsR = table.getRows();
						for (int r = 1; r < rowsR.size(); r++) { // 从1开始，忽略表头
							XWPFTableRow rowR = rowsR.get(r);
							XWPFTableCell cellName = rowR.getCell(0);
							String cellText = cellName.getText();
							if (StringUtils.isBlank(cellText)) { // 忽略空白表格行
								continue;
							}
							ResultData rd = new ResultData();
							rd.setName(cellText);
							rd.setCode(rowR.getCell(1).getText());
							List<XWPFParagraph> paragraphs = rowR.getCell(2).getParagraphs();
							int size = paragraphs.size();
							String desc = "";
							for (int rr = 0; rr < size; rr++) {
								XWPFParagraph paraR = paragraphs.get(rr);
								if (0 == rr) {
									rd.setType(paraR.getText());
								} else {
									desc += paraR.getText();
								}
							}
							rd.setDesc(desc);

							res.add(rd);
						}

						interN.put("resDatas", res);
						break;
					case 7:// 响应码
						break;
					case 8:// 响应码table
						List<ResultCodeParase> listResCode = new ArrayList<ResultCodeParase>();
						List<XWPFTableRow> rowsRC = table.getRows();
						for (int r = 1; r < rowsRC.size(); r++) { // 从1开始，忽略表头
							XWPFTableRow rowRC = rowsRC.get(r);
							XWPFTableCell cellName = rowRC.getCell(0);
							String cellText = cellName.getText();
							if (StringUtils.isBlank(cellText)) { // 忽略空白表格行
								continue;
							}
							ResultCodeParase rc = new ResultCodeParase();
							rc.setCode(rowRC.getCell(0).getText());
							rc.setMsg(rowRC.getCell(1).getText());
							rc.setDesc(rowRC.getCell(2).getText());

							listResCode.add(rc);
						}

						interN.put("resCodes", listResCode);
						break;
					case 9:// 响应参数样例
						break;
					case 10:// 响应参数样例table
						interN.put("resExample", table.getText());
						break;
					default:
						break;
					}

					result.put(String.valueOf(num), interN);
				}

				count++;
			}

			return result;

		} catch (Exception e) {
			// throw new IOException();
		} finally {
			is.close();
			doc.close();
		}
		return null;
	}

}
