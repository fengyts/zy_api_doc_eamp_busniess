package test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.chaneinfo.eamp.apidoc.convert.Constant;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.Version;

public class TestStr {

	@Test
	public void test() {
		String str = Constant.GeneratorError.apiErrorExample;
		System.out.println(str);
	}

	@Test
	public void testf() {
		try {
			String projectAbsPath = System.getProperty("user.dir");
			String templatePath = projectAbsPath + File.separator + "webapp" + File.separator + "template";
			Configuration config = new Configuration(new Version("2.3.0"));
			config.setDirectoryForTemplateLoading(new File(templatePath));
			Template template = config.getTemplate("apidoc.ftl", "UTF-8");
			Map<String, Object> dataModel = new HashMap<String, Object>();
			dataModel.put("packageName", "com.chaneinfo.eamp.apidoc");
			FileOutputStream fos = new FileOutputStream("src/main/java/com/chaneinfo/eamp/apidoc/TestApi1.java");
			Writer out = new OutputStreamWriter(fos, "UTF-8");
			template.process(dataModel, out);
			out.flush();
			out.close();
		} catch (IOException | TemplateException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
//		String str = Constant.GeneratorError.apiErrorExample;
//		System.out.println(str);
//		System.out.println(Constant.GeneratorError.apiError);
		
	}

}
