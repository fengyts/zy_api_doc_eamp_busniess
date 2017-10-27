package com.chaneinfo.eamp.apidoc.convert;

import java.io.Serializable;

public class Param implements Serializable {

	private static final long serialVersionUID = -7434884484298434386L;

	/** 参数名称 */
	private String name;
	/** 参数代码(名称) */
	private String code;
	/** 参数类型 */
	private String type;
	/** 是否必须 */
	private boolean isMust;
	/** 参数说明 */
	private String desc;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public boolean isMust() {
		return isMust;
	}

	public void setIsMust(boolean isMust) {
		this.isMust = isMust;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
