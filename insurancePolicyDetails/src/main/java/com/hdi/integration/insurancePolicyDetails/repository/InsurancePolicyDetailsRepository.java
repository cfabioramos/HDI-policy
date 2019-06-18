package com.hdi.integration.insurancePolicyDetails.repository;

import com.hdi.integration.insurancePolicyDetails.dto.PDocument;
import com.hdi.integration.insurancePolicyDetails.util.ObjectConverter;
import com.progress.open4gl.Open4GLException;
import com.progress.open4gl.javaproxy.Connection;
import com.progress.open4gl.javaproxy.OpenAppObject;
import com.progress.open4gl.javaproxy.ParamArray;
import com.progress.open4gl.javaproxy.ParamArrayMode;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.Map;

@Repository
public class InsurancePolicyDetailsRepository {

	@Value("${URI_PROGRESS}")
	private String URI_PROGRESS;
	
	private static String PROC_NAME = "msvc_det_documento.p";
	
	public Map<String, Object> findInsurancePolicyById(PDocument pDocument) throws Open4GLException, IOException {

		Connection progressConnection = null;

		try{
			progressConnection = new Connection(URI_PROGRESS, "", "", "");
			progressConnection.setSessionModel(1);
			OpenAppObject openAppObject = new OpenAppObject(progressConnection, "");

			ParamArray parameters = new ParamArray(2);
			parameters.addLongchar(0, ObjectConverter.getJsonFromObject(pDocument), ParamArrayMode.INPUT);
            parameters.addLongchar(1, "", ParamArrayMode.OUTPUT);

            openAppObject.runProc(PROC_NAME, parameters);

            String lSaidaDetApol = (String) parameters.getOutputParameter(1);

            return (new GsonJsonParser()).parseMap(lSaidaDetApol);
		}
		finally {
			progressConnection.finalize();
		}
	}
}
