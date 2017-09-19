package com.chaneinfo.eamp.apidoc.convert;

import java.util.Map;

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
	static String ERROR_CODE = "(错误码)";

	static String METHOD = "{POST,GET}";

	static String MUST_SYMBOL = "<code>【必填】</code>";
	
	/** 替换占位符 */
	static String REPLACE_HOLDER = "#==#";// {}

	static String SPACE = " "; // 空格
	static String SPACE3 = "   "; // 3个空格
	static String SPACE5 = "     "; // 5个空格
	static String SPACE8 = "        "; // 8个空格
	static String RN = "\r\n";// 换行
	static String RN_AND_STAR = "\r\n*"; // 换行并且加上首字符"*"
	static String RN_AND_STAR_AND_AT = "\r\n* @";

	static String STAR = "*";
	static String COMMENT_START = "/ ** \r\n*";
	static String COMMENT_END = "*/";

	public class GeneratorErrorOrSuccess {
		/** 错误示例 */
		public static String apiErrorExample = "";
		/** 错误码 */
		public static String apiError = "";
		
		/** 成功字段说明 */
		public static String apiSuccess = "";
		/** 成功示例 */
		@Deprecated
		public static StringBuilder apiSuccessExample = new StringBuilder();
		public static String apiSuccessExamplePrefix = "* @apiSuccessExample 请求成功返回数据示例:\r\n*" + SPACE3 + "Json  code=0 成功\r\n*" + SPACE8;
		
		private static StringBuilder res = new StringBuilder();
		static {
			res.append(STAR).append(SPACE).append(AT).append(ApiDocAnnotationEnum.apiErrorExample).append(SPACE)
					.append("求失败返回数据示例:").append(RN_AND_STAR).append(SPACE3).append("Json  errorCode =1 失败\r\n*")
					.append(SPACE5).append(BRACES_L).append(RN_AND_STAR).append(SPACE8).append("\"code\": \"1\",\r\n*")
					.append(SPACE8).append("\"msg\": \"参数错误\",\r\n*").append(SPACE8).append("\"jsonData\": {}\r\n*")
					.append(SPACE5 + BRACES_R);
			apiErrorExample = res.toString();

			res.delete(0, res.length()); // 清空
			String prefix = STAR + SPACE + AT + ApiDocAnnotationEnum.apiError + SPACE + ERROR_CODE + " {String} ";
			Map<String, String> sysMsg = ResultCode.sysMsg;
			for(Map.Entry<String, String> entry : sysMsg.entrySet()){
				String key = entry.getKey();
				String value = entry.getValue();
				res.append(prefix).append(key).append(SPACE).append(value).append(RN);
			}
			apiError = res.toString();
			
			res.delete(0, res.length()); // 清空
			prefix = STAR + SPACE + AT + ApiDocAnnotationEnum.apiSuccess;
			res.append(prefix).append(" {String} code 是否成功,0:成功;其他:失败.\r\n").append(prefix)
					.append(" {String} msg  返回码对应的描述.\r\n").append(prefix).append(" {Object} jsonData  返回数据对象.");
			apiSuccess = res.toString();
			
			// res.delete(0, res.length());
			apiSuccessExample.append(STAR).append(SPACE).append(AT).append(ApiDocAnnotationEnum.apiSuccessExample)
					.append(" 请求成功返回数据示例:\r\n*").append(SPACE3).append("Json  code=0 成功\r\n*").append(SPACE5)
					.append(BRACES_L).append(RN_AND_STAR).append(SPACE8).append("\"code\": \"0\",\r\n*").append(SPACE8)
					.append("\"msg\": \"成功\",\r\n*").append(SPACE8).append("\"jsonData\": {}\r\n*").append(SPACE5)
					.append("}");
			
		}

	}

}
