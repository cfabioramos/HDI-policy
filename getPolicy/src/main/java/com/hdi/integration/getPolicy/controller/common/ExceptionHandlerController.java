package com.hdi.integration.getPolicy.controller.common;

import com.hdi.elaw.legal.folder.process.enumaration.EnumExceptionCode;
import com.hdi.elaw.legal.folder.process.exception.BusinnesException;
import com.hdi.elaw.legal.folder.process.model.ObjectError;
import com.hdi.elaw.legal.folder.process.response.ApiErrorResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestControllerAdvice
public class ExceptionHandlerController extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(BusinnesException.class)
	public ResponseEntity<ApiErrorResponse> businnesExceptionHandler(BusinnesException ex, HttpServletRequest request) {
		ObjectError objectError = new ObjectError();
		ApiErrorResponse response = new ApiErrorResponse(EnumExceptionCode.BUSINESS.getCode(), ex.getMessage(), Arrays.asList(objectError));
		return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
	}
	
	@Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        List<ObjectError> errors = getErrors(ex);
        ApiErrorResponse response = new ApiErrorResponse(EnumExceptionCode.REQUIRED_FIELD.getCode(), EnumExceptionCode.REQUIRED_FIELD.getDescription(), errors);
        return new ResponseEntity<>(response, status);
    }

    private List<ObjectError> getErrors(MethodArgumentNotValidException ex) {
        return ex.getBindingResult().getFieldErrors().stream()
                .map(error -> new ObjectError(error.getDefaultMessage()))
                .collect(Collectors.toList());
    }
}
