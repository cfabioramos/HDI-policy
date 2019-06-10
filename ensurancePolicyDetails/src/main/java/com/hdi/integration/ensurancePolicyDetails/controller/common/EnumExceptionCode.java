package com.hdi.integration.ensurancePolicyDetails.controller.common;

public enum EnumExceptionCode {

	BAD_REQUEST(400, "Bad Request"),
	UNAUTHORIZED(401, "Unauthorized"),
	FORBIDDEN(403, "Forbidden"),
	DATA_NOT_FOUND(404, "Data not found"),
	DATA_INVALID(405, "Data input not supplied or invalid"),

	INTERNAL_BUSINESS(500, "A business exception occurred");


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