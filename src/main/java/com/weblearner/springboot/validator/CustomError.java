package com.weblearner.springboot.validator;

import java.util.Map;

public class CustomError {

	private String httpCode;
	private Map<String,String> errorMsg;
	
	
	public String getHttpCode() {
		return httpCode;
	}
	public void setHttpCode(String httpCode) {
		this.httpCode = httpCode;
	}
	public Map<String, String> getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(Map<String, String> errorMsg) {
		this.errorMsg = errorMsg;
	}
	
	
	
	
	
	

	
	

}
