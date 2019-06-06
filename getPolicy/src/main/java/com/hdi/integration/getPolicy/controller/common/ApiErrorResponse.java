package com.hdi.integration.getPolicy.controller.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

@ApiModel(description = "Error API responses")
public class ApiErrorResponse implements Serializable {

	private static final long serialVersionUID = 6081977791291391680L;
	
	@ApiModelProperty(value = "Internal error ID")
	private Integer code;
	@ApiModelProperty(value = "Basic message error")
	private String message = EnumExceptionCode.BUSINESS.getDescription();
	@ApiModelProperty(value = "Detailed error description")
	private String description;
	@ApiModelProperty(value = "List of errors")
    private final List<ObjectError> errors;
    
	public ApiErrorResponse(List<ObjectError> errors) {
		this.errors = errors;
	}
	
	public ApiErrorResponse(Integer code, String description, List<ObjectError> errors) {
		this.code = code;
		this.description = description;
		this.errors = errors;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMessage() {
		return message;
	}

	public List<ObjectError> getErrors() {
		return errors;
	} 
}
