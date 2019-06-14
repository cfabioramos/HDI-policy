package com.hdi.integration.insurancePolicyDetails.dto;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hdi.integration.insurancePolicyDetails.util.ObjectConverter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PDocument implements Serializable {

    public PDocument(Long documentId){
        this.dsEntradaDetDoc = new DsEntradaDetDoc(documentId);
    }

    private DsEntradaDetDoc dsEntradaDetDoc;

    public DsEntradaDetDoc getDsEntradaDetDoc() {
        return dsEntradaDetDoc;
    }

    private class DsEntradaDetDoc {

        public DsEntradaDetDoc(Long documentId) {
            this.ParamEntrada.add(new ParamEntrada(documentId));
        }

        private List<ParamEntrada> ParamEntrada = new ArrayList<>();

        public List<ParamEntrada> getParamEntrada() {
            return ParamEntrada;
        }

        public void setParamEntrada(List<ParamEntrada> paramEntrada) {
            this.ParamEntrada = paramEntrada;
        }
    }

    private class ParamEntrada {

        public ParamEntrada(Long documentId) {
            this.chave_doc = documentId;
        }

        private String id_cliente = "";
        private Long chave_doc;
        private String m_ambiente = "mobile";

        public String getId_cliente() {
            return id_cliente;
        }

        public Long getChave_doc() {
            return chave_doc;
        }

        public void setChave_doc(Long chave_doc) {
            this.chave_doc = chave_doc;
        }

        public String getM_ambiente() {
            return m_ambiente;
        }
    }

}
