package com.chaneinfo.eamp.apidoc.convert;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.usermodel.Bookmark;
import org.apache.poi.hwpf.usermodel.Bookmarks;
import org.apache.poi.hwpf.usermodel.Range;
import org.apache.poi.hwpf.usermodel.Section;
import org.apache.poi.hwpf.usermodel.Table;
import org.apache.poi.hwpf.usermodel.TableCell;
import org.apache.poi.hwpf.usermodel.TableIterator;
import org.apache.poi.hwpf.usermodel.TableRow;

public class Generator {

	public static void wordReader() throws Exception {
		File file = new File("E:/test/速发卡_B端（商户端）接口文档_v1.0.8.doc");
		InputStream is = new FileInputStream(file);
		HWPFDocument doc = new HWPFDocument(is);
//		WordExtractor extractor = new WordExtractor(is);
//		String str = extractor.getText();
//		System.out.println(str);
		//获取各个段落的文本
//		String[] pt=extractor.getParagraphText();
//		for(String pa : pt){
//			System.out.println(pa);
//		}
		
		Range range = doc.getRange();
		int nums = range.numSections();
		System.out.println(nums);
		Section section = range.getSection(0);
		System.out.println(section.text());  
		
		
//		int nump=range.numParagraphs();
//		System.out.println(nump);
//		Paragraph p = range.getParagraph(5000);
//		System.out.println(p.text());
//		for(int i=0;i< nump;i++){
//			Paragraph p = range.getParagraph(i);
//			System.out.println(p.text());
//		}
		
		
	}
	
	/** 
	    * 输出书签信息 
	    * @param bookmarks 
	    */  
	   private static void printBookMarks(Bookmarks bookmarks) {  
	      int count = bookmarks.getBookmarksCount();  
	      System.out.println("书签数量：" + count);  
	      Bookmark bookmark;  
	      for (int i=0; i<count; i++) {  
	         bookmark = bookmarks.getBookmark(i);  
	         System.out.println("书签" + (i+1) + "的名称是：" + bookmark.getName());  
	         System.out.println("开始位置：" + bookmark.getStart());  
	         System.out.println("结束位置：" + bookmark.getEnd());  
	      }  
	   }  
	
	 private static void readTable(Range range) {  
	      //遍历range范围内的table。  
	      TableIterator tableIter = new TableIterator(range);  
	      Table table;  
	      TableRow row;  
	      TableCell cell;  
	      while (tableIter.hasNext()) {  
	         table = tableIter.next();  
	         int rowNum = table.numRows();  
	         for (int j=0; j<rowNum; j++) {  
	            row = table.getRow(j);  
	            int cellNum = row.numCells();  
	            for (int k=0; k<cellNum; k++) {  
	                cell = row.getCell(k);  
	                //输出单元格的文本  
	                System.out.println(cell.text().trim());  
	            }  
	         }  
	      }  
	   }  

	public static void main(String[] args) {
		try {
			wordReader();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
