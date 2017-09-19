package com.chaneinfo.eamp.apidoc.convert;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFStyles;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR;

public class Generate {

	public static void test() {
		try {
			File file = new File("E:\\test\\jiekou.docx");
			InputStream is = new FileInputStream(file);

			// HWPFDocument doc = new HWPFDocument(is);
			// WordExtractor word= new WordExtractor(doc);

			XWPFDocument doc1 = new XWPFDocument(is);
			XWPFParagraph xp = doc1.getParagraphArray(0);
			List<XWPFParagraph> paras = doc1.getParagraphs();
			XWPFStyles styles = doc1.getStyles();
			
			int count13 = 0;
			for (XWPFParagraph para : paras) {
				String strStyle = para.getStyleID();
				if(null == strStyle){
					continue;
				}
				System.out.println(strStyle);
				if(StringUtils.isNumeric(strStyle) && 2 == Integer.valueOf(strStyle)){
					count13++;
					CTR c;
					XWPFRun run = para.getRun(CTR.class.newInstance());
				}
				String val = styles.getStyle(strStyle).getCTStyle().getName().getVal();
				System.out.println(val);
				System.out.println(count13);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		test();
	}

}
