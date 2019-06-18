package com.hdi.integration.insurancePolicyDetails.service;

import com.hdi.integration.insurancePolicyDetails.dto.InsurancePolicy;
import com.hdi.integration.insurancePolicyDetails.dto.PDocument;
import com.hdi.integration.insurancePolicyDetails.exception.BusinnesException;
import com.hdi.integration.insurancePolicyDetails.repository.InsurancePolicyDetailsRepository;
import com.hdi.integration.insurancePolicyDetails.util.ObjectConverter;
import com.progress.open4gl.Open4GLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@Service
public class InsurancePolicyDetailsService {

	@Autowired
	private InsurancePolicyDetailsRepository repository;

	public InsurancePolicy findInsurancePolicyById(Long idInsurancePolicy) throws Open4GLException, IOException {

        Map<String, Object> mapRet = repository.findInsurancePolicyById(new PDocument(idInsurancePolicy));
//        ((Map)((List)mapRet.get("tt_retorno")).get(0)).get("tipoProduto");
//        ((Map)((List)mapRet.get("tt_cobranca")).get(0)).get("numeroApolice");
//        ((Map)((List)mapRet.get("tt_cobranca")).get(1)).get("numeroApolice");
//        ((Map)((List)mapRet.get("tt_ramo_cob")).get(0)).get("cod_ramo");
//        ((Map)((List)mapRet.get("tt_condutor")).get(0)).get("codCondutor");

        this.validaRetError(mapRet);

        return this.getPolicyDetails(mapRet);

    }

    private void validaRetError(Map<String, Object> mapRet) {
	    List<Object> list = (List)mapRet.get("tt_mensagem");
        list.forEach(item -> {
            if (ObjectConverter.convert(((Map)item).get("errorCode"), Integer.class) != 0)
                throw new BusinnesException(ObjectConverter.convert(((Map)item).get("errorMessage"), String.class));
        });
    }

    private InsurancePolicy getPolicyDetails(Map<String, Object> mapRet) {

        Map<String, Object> mapPolicy = ((Map)((List)mapRet.get("tt_retorno")).get(0));

        InsurancePolicy insurancePolicy = new InsurancePolicy(
            mapPolicy.get("numeroApolice"),
            mapPolicy.get("cpfCnpj"),
            mapPolicy.get("nomeSegurado"),
            mapPolicy.get("emailSegurado"),
            mapPolicy.get("vigenciaInicio"),
            mapPolicy.get("vigenciaFim"),
            mapPolicy.get("veiculoCancelado"),
            mapPolicy.get("telefoneCliente"),
            mapPolicy.get("enderecoCorresp"),
            mapPolicy.get("cidadeCorresp"),
            mapPolicy.get("ufCorresp"));

        return insurancePolicy;

    }

}
