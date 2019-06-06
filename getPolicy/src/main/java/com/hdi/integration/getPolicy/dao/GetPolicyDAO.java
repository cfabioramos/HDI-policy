package com.hdi.integration.getPolicy.dao;

import com.progress.open4gl.ConnectException;
import com.progress.open4gl.Open4GLException;
import com.progress.open4gl.SystemErrorException;
import com.progress.open4gl.javaproxy.OpenAppObject;
import com.progress.open4gl.javaproxy.ParamArray;
import com.progress.open4gl.javaproxy.ParamArrayMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.IOException;

@Repository
@Transactional(readOnly = true)
public class GetPolicyDAO {

	@PersistenceContext
	EntityManager entityManager;
	
	private static String PROC_NAME = "msvc_det_apolice.p";
	
	public void getPolicyDetails(String idInsurancePolicy) throws ConnectException, SystemErrorException, Open4GLException, IOException {

		com.progress.open4gl.javaproxy.Connection connection = entityManager.unwrap(com.progress.open4gl.javaproxy.Connection.class);
		connection.setSessionModel(1);
		OpenAppObject openAppObject = new OpenAppObject(connection, "");

		ParamArray parameters = new ParamArray(2);
		parameters.addCharacter(0, idInsurancePolicy, ParamArrayMode.INPUT);
		openAppObject.runProc(PROC_NAME, parameters);
		
		String lSaidaDetApol = (String) parameters.getOutputParameter(1);
		// String messageError = (String) parameters.getOutputParameter(MESSAGE_ERROR.getCode());
		// boolean hasError = (boolean) parameters.getOutputParameter(HAS_ERROR.getCode());

		System.out.println(lSaidaDetApol);
		
//		if(hasError) {
//			connection.finalize();
//			throw new BusinnesException(messageError);
//		}
		connection.finalize();
	}
}
