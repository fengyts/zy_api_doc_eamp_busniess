package com.chaneinfo.eamp.apidoc.convert;

import java.io.Serializable;

public class ResultCodeParase implements Serializable {

	private static final long serialVersionUID = 8650334408194404152L;

	private String code;
	private String msg;
	private String desc;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
