package com.chaneinfo.eamp.apidoc.convert;

public interface Constant {

	static String AT = "@";
	static String COLON = ":";
	static String BRACES_L = "{";
	static String BRACES_R = "}";
	static String BRACKETS_L = "[";
	static String BRACKETS_R = "]";
	static String DOUBLE_QUOTE = "\"";
	static String SINGLE_QUOTE = "\'";

	static String GROUP1 = "(系统参数)";
	static String GROUP2 = "(业务参数)";
	static String erorCode = "(错误码)";

	static String METHOD = "{POST,GET}";

	static String MUST = "<code>【必填】</code>";

	static String SPACE = " "; // 空格
	static String SPACE3 = "   "; // 3个空格
	static String SPACE5 = "     "; // 5个空格
	static String SPACE8 = "        ";
	static String RN = "\r\n";// 换行
	static String RN_AND_STAR = "\r\n*"; // 换行并且加上首字符"*"

	static String STAR = "*";
	static String COMMENT_START = "/ ** \r\n*";
	static String COMMENT_END = "*/";

	public class GeneratorError {
		public static String apiErrorExample = "";
		private static StringBuilder res = new StringBuilder();
		static {
			res.append(STAR).append(SPACE).append(ApiDocAnnotationEnum.apiErrorExample.name()).append(SPACE)
					.append("求失败返回数据示例:").append(RN_AND_STAR).append(SPACE3).append("Json  errorCode =1 失败\r\n*")
					.append(SPACE5).append(BRACES_L).append(RN_AND_STAR).append(SPACE8).append("\"code\": \"1\",\r\n*")
					.append(SPACE8).append("\"msg\": \"参数错误\",\r\n*").append(SPACE8).append("\"jsonData\": {}\r\n*")
					.append(SPACE5 + BRACES_R);
			apiErrorExample = res.toString();

			res.delete(0, res.length()); // 清空
		}

		public static String apiError = res.toString();

	}

}
