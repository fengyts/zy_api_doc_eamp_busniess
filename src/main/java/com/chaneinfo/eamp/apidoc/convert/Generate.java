package com.chaneinfo.eamp.apidoc.convert;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.Version;

public class Generate {
	
	private static void packageInter(Map<String, Object> interData, Map<String, Object> methodData) {
		for (Map.Entry<String, Object> entry : interData.entrySet()) {
			StringBuilder apidoc = new StringBuilder();
			String key = entry.getKey();
			// Map<String, Object> value = (Map<String, Object>)
			// entry.getValue();
			ApiDocDO apidocDO = (ApiDocDO) entry.getValue();
			apidoc.append(Constant.COMMENT_START);

			apidoc.append(Constant.SPACE5).append(Constant.RN_AND_STAR).append(Constant.SPACE).append(Constant.AT);
			apidoc.append(ApiDocAnnotationEnum.apiGroup).append(Constant.SPACE);
			apidoc.append("c端接口");

			apidoc.append(Constant.RN_AND_STAR).append(Constant.SPACE).append(Constant.AT);
			apidoc.append(ApiDocAnnotationEnum.api);
			apidoc.append(Constant.SPACE).append(Constant.BRACES_L);
			apidoc.append(apidocDO.getRequestMethod()).append(Constant.BRACES_R).append(Constant.SPACE);
			apidoc.append(apidocDO.getRequestUrl()).append(Constant.SPACE);
			apidoc.append(apidocDO.getInterName());

			apidoc.append(Constant.RN_AND_STAR).append(Constant.SPACE).append(Constant.AT);
			apidoc.append(ApiDocAnnotationEnum.apiName);
			apidoc.append(Constant.SPACE).append(apidocDO.getInterName());

			apidoc.append(Constant.RN_AND_STAR).append(Constant.SPACE).append(Constant.AT);
			apidoc.append(ApiDocAnnotationEnum.apiVersion);
			apidoc.append(Constant.SPACE).append("v1.0.0");

			apidoc.append(Constant.RN).append(Constant.GeneratorElement.apiDescription);

			List<Param> parames = apidocDO.getParams();
			StringBuilder paramTemp = new StringBuilder();
			for (Param param : parames) {
				paramTemp.append(Constant.RN_AND_STAR).append(Constant.SPACE).append(Constant.AT)
						.append(ApiDocAnnotationEnum.apiParam).append(Constant.SPACE);
				paramTemp.append("(业务参数) {");
				paramTemp.append(param.getType()).append("}").append(Constant.SPACE);
				paramTemp.append(param.getCode()).append(Constant.SPACE);
				paramTemp.append("<code>【必填】</code>").append(Constant.SPACE);
				paramTemp.append(param.getName());
			}
			apidoc.append(Constant.RN_AND_STAR);
			apidoc.append(paramTemp);

			apidoc.append(Constant.COMMENT_END);

			methodData.put("inter" + key, apidoc);
			
		}
	}

	public static Map<String, Object> paraseInter() {
		Map<String, Object> methodData = new HashMap<String, Object>();
		try {
			File file = new File("E:/test/testPOI.docx");
			ExtractWord extract = new ExtractWord(file);
			Map<String, Object> interData = extract.extract();
			packageInter(interData, methodData);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return methodData;

	}
	
	public static Map<String, Object> paraseInter1() {
		try {
			File file = new File("E:/test/testPOI.docx");
			ExtractWord extract = new ExtractWord(file);
			Map<String, Object> interData = extract.extract();
			return interData;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}
	
	public static void generate1(){
		try {
			String projectAbsPath = System.getProperty("user.dir");
			String templatePath = projectAbsPath + File.separator + "src" + File.separator + "main" + File.separator
					+ "webapp" + File.separator + "template";
			Configuration config = new Configuration(new Version("2.3.0"));
			config.setDirectoryForTemplateLoading(new File(templatePath));
			Template template = config.getTemplate("apidoc.ftl", "UTF-8");
			String className = "TestAPi";
			Map<String, Object> dataModel = new HashMap<String, Object>();
			dataModel.put("packageName", "com.chaneinfo.eamp.apidoc");
			dataModel.put("className", className);
			Map<String, Object> methodList = paraseInter();
			dataModel.put("methodData", methodList);
			FileOutputStream fos = new FileOutputStream(
					"src/main/java/com/chaneinfo/eamp/apidoc/" + className + ".java");
			Writer out = new OutputStreamWriter(fos, "UTF-8");
			template.process(dataModel, out);
			out.flush();
			out.close();
		} catch (IOException | TemplateException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void generate2(){
		try {
			String projectAbsPath = System.getProperty("user.dir");
			String templatePath = projectAbsPath + File.separator + "src" + File.separator + "main" + File.separator
					+ "webapp" + File.separator + "template";
			Configuration config = new Configuration(new Version("2.3.0"));
			config.setDirectoryForTemplateLoading(new File(templatePath));
			Template template = config.getTemplate("apidoc1.ftl", "UTF-8");
			String className = "TestAPi1";
			Map<String, Object> dataModel = new HashMap<String, Object>();
			dataModel.put("packageName", "com.chaneinfo.eamp.apidoc");
			dataModel.put("className", className);
			Map<String, Object> methodList = paraseInter1();
			dataModel.put("methodData", methodList);
			FileOutputStream fos = new FileOutputStream(
					"src/main/java/com/chaneinfo/eamp/apidoc/" + className + ".java");
			Writer out = new OutputStreamWriter(fos, "UTF-8");
			template.process(dataModel, out);
			out.flush();
			out.close();
		} catch (IOException | TemplateException e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) throws Exception {
		// paraseInter();
		generate2();
	}

}
