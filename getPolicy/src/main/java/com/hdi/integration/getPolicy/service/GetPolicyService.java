package com.hdi.integration.getPolicy.service;

import com.hdi.integration.getPolicy.dao.GetPolicyDAO;
import com.progress.open4gl.ConnectException;
import com.progress.open4gl.Open4GLException;
import com.progress.open4gl.SystemErrorException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class GetPolicyService {
	
	@Autowired
	private GetPolicyDAO dao;

	public void getPolicyDetails(String idInsurancePolicy) throws ConnectException, SystemErrorException, Open4GLException, IOException {
		dao.getPolicyDetails(idInsurancePolicy);
	}
}
