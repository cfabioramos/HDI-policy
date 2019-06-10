package com.hdi.integration.ensurancePolicyDetails.service;

import com.hdi.integration.ensurancePolicyDetails.dao.GetPolicyDAO;
import com.progress.open4gl.Open4GLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class GetPolicyService {
	
	@Autowired
	private GetPolicyDAO dao;

	public void getPolicyDetails(String idInsurancePolicy) throws Open4GLException, IOException {
		dao.getPolicyDetails(idInsurancePolicy);
	}
}
