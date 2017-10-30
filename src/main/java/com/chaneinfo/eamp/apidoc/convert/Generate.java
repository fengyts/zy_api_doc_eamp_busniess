package com.chaneinfo.eamp.apidoc.convert;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Map;

public class Generate {

	public static String paraseInter() {
		try {
			File file = new File("E:/test/testPOI.docx");
			ExtractWord extract = new ExtractWord(file);
			Map<String, Object> interData = extract.extract();
			StringBuilder apidoc = new StringBuilder();
			for (Map.Entry<String, Object> entry : interData.entrySet()) {
				String key = entry.getKey();
				Map<String, Object> value = (Map<String, Object>) entry.getValue();
				
				apidoc.append("apidocInter").append(key).append("(){}\r\n");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	public static void main(String[] args) throws Exception {
		// paraseInter();

		// File file = new File("src/main/java/test.properties");
		// FileInputStream fis = new FileInputStream(file);
		// BufferedReader reader = new BufferedReader(new FileReader(file));
		// String res = reader.readLine();
		// System.out.println(res);

		final String rootPath = "src/main/java/com/chaneinfo/eamp/apidoc/";
		final String packageName = "package com.chaneinfo.eamp.apidoc;";

		FileOutputStream fos = new FileOutputStream(rootPath + "TestApi.java");
		StringBuilder javaContent = new StringBuilder();
		javaContent.append(packageName).append("\r\n\n");
		javaContent.append("public class TestApi {}");
		fos.write(javaContent.toString().getBytes());
		fos.flush();
		fos.close();
	}

}
