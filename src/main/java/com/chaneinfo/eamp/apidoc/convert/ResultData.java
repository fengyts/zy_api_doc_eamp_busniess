package com.chaneinfo.eamp.apidoc.convert;

import java.io.Serializable;

public class ResultData implements Serializable {

	private static final long serialVersionUID = 5113074652791256916L;

	private String name;
	private String code;
	private String type;
	private String desc;

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
