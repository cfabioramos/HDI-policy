package com.hdi.integration.getPolicy.controller;

import com.hdi.integration.getPolicy.service.GetPolicyService;
import com.progress.open4gl.Open4GLException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping(value = "/getPolicy")
@Api(description = "Legal Entity Management")
public class GetPolicyController {

	@Autowired
	private GetPolicyService service;

	@ApiOperation(value= "Add New Legal")
	@GetMapping(value = "/{idInsurancePolicy}", produces = {"application/json"})
	public ResponseEntity<?> getPolicyDetails(
            @ApiParam(value = "Company ID", required = true) @RequestHeader(value = "X-Company-Id", required = true) String xCompanyId,
            @ApiParam(value = "Application ID", required = true) @RequestHeader(value = "X-Application-Id", required = true) String xApplicationId,
            @ApiParam(value = "User ID", required = true) @RequestHeader(value = "X-User-Id", required = true) String xUserId,
            @ApiParam(value = "Policy ID", required = true) @PathVariable("idInsurancePolicy") String idInsurancePolicy)
			throws Open4GLException, IOException {

		this.service.getPolicyDetails(idInsurancePolicy);
		return new ResponseEntity<>(null, HttpStatus.OK);
	}
}
