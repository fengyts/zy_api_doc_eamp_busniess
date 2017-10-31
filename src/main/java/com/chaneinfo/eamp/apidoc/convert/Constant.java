package com.chaneinfo.eamp.apidoc.convert;

import java.lang.reflect.Field;

public interface Constant {

	static final String AT = "@";
	static final String COLON = ":";
	static final String BRACES_L = "{";
	static final String BRACES_R = "}";
	static final String BRACKETS_L = "[";
	static final String BRACKETS_R = "]";
	static final String DOUBLE_QUOTE = "\"";
	static final String SINGLE_QUOTE = "\'";

	static final String GROUP1 = "(系统参数)";
	static final String GROUP2 = "(业务参数)";
	static final String EROR_CODE_DESC = "(错误码)";

	@Deprecated
	static final String METHOD = "{POST,GET}";

	static final String MUST = "<code>【必填】</code>";

	static final String SPACE = " "; // 空格
	static final String SPACE3 = "   "; // 3个空格
	static final String SPACE5 = "     "; // 5个空格
	static final String SPACE8 = "        ";
	static final String RN = "\r\n";// 换行
	static final String RN_AND_STAR = "\r\n*"; // 换行并且加上首字符"*"

	static final String STAR = "*";
	static final String COMMENT_START = "/** \r\n *";
	static final String COMMENT_END = "*/";

	public class GeneratorElement {
		public static String apiErrorExample = ""; // 错误示例
		public static String apiSysError = ""; // 系统通用错误码
		public static String apiDescription = "";// 接口说明
		private static StringBuilder res = new StringBuilder();
		static {
			res.append(STAR).append(SPACE).append(AT);
			res.append(ApiDocAnnotationEnum.apiErrorExample.name()).append(SPACE)
					.append("求失败返回数据示例:").append(RN_AND_STAR).append(SPACE3).append("Json  errorCode =1 失败\r\n*")
					.append(SPACE5).append(BRACES_L).append(RN_AND_STAR).append(SPACE8).append("\"code\": \"1\",\r\n*")
					.append(SPACE8).append("\"msg\": \"参数错误\",\r\n*").append(SPACE8).append("\"jsonData\": {}\r\n*")
					.append(SPACE5 + BRACES_R);
			apiErrorExample = res.toString();

			res.delete(0, res.length()); // 清空

			Field[] fields = ResultCode.Sys.class.getDeclaredFields();
			for (Field field : fields) {
				try {
					String fieldName = field.getName();
					String fieldValue = (String) field.get(fieldName);
					res.append(STAR).append(SPACE).append(AT).append(ApiDocAnnotationEnum.apiError).append(SPACE);
					res.append(EROR_CODE_DESC).append(SPACE).append(BRACES_L).append(TypeEnum.String).append(BRACES_R)
							.append(SPACE);
					res.append(fieldValue).append(SPACE).append(ResultCode.getMsg(fieldValue));
					res.append(RN);
				} catch (IllegalArgumentException | IllegalAccessException e) {
					e.printStackTrace();
				}
			}
			apiSysError = res.toString();
			
			res.delete(3, res.length()); // 清空
			
			res.append(ApiDocAnnotationEnum.apiDescription).append(SPACE);
			res.append("<code>接口约定</code>");
			res.append(RN_AND_STAR).append(SPACE);
			res.append("1.	参数是大小写敏感的");
			res.append(RN_AND_STAR).append(SPACE);
			res.append("2.	所有接口为标准的 HTTP POST 协议");
			res.append(RN_AND_STAR).append(SPACE);
			res.append("3.	请求数据是以JSON字符串形式传输，数据以存放在http的body中传输，数据编码采用UTF-8");
			res.append(RN_AND_STAR).append(SPACE);
			res.append("4.	返回值为JSON对象格式");
			apiDescription = res.toString();

		}

	}

}
