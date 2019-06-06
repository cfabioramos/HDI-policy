package com.hdi.integration.getPolicy.controller.common;

public enum EnumExceptionCode {
	
	BUSINESS(1, "A business exception occurred"),
	REQUIRED_FIELD(2, "Required fields are empty");

	EnumExceptionCode(int code, String description) {
		this.code = code;
		this.description = description;
	}
	
	private int code;
	private String description;
	
	public int getCode() {
		return code;
	}
	public String getDescription() {
		return description;
	}
	
	
}
