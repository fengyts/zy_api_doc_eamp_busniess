package com.chaneinfo.eamp.apidoc.convert;

import java.io.Serializable;
import java.util.List;

public class ApiDocDO implements Serializable {

	private static final long serialVersionUID = -2509131751289310638L;

	private String interName;
	private String requestUrl;
	private String requestMethod;
	private List<Param> params;
	private List<ResultData> resDatas;
	private List<ResultCodeParase> resCodes;
	private String resExample;

	public String getInterName() {
		return interName;
	}

	public void setInterName(String interName) {
		this.interName = interName;
	}

	public String getRequestUrl() {
		return requestUrl;
	}

	public void setRequestUrl(String requestUrl) {
		this.requestUrl = requestUrl;
	}

	public String getRequestMethod() {
		return requestMethod;
	}

	public void setRequestMethod(String requestMethod) {
		this.requestMethod = requestMethod;
	}

	public List<Param> getParams() {
		return params;
	}

	public void setParams(List<Param> params) {
		this.params = params;
	}

	public List<ResultData> getResDatas() {
		return resDatas;
	}

	public void setResDatas(List<ResultData> resDatas) {
		this.resDatas = resDatas;
	}

	public List<ResultCodeParase> getResCodes() {
		return resCodes;
	}

	public void setResCodes(List<ResultCodeParase> resCodes) {
		this.resCodes = resCodes;
	}

	public String getResExample() {
		return resExample;
	}

	public void setResExample(String resExample) {
		this.resExample = resExample;
	}

}
