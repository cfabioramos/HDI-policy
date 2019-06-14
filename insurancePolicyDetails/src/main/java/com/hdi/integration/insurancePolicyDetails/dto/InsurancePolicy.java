package com.hdi.integration.insurancePolicyDetails.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hdi.integration.insurancePolicyDetails.util.ObjectConverter;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Objects;

/**
 * InsurancePolicy
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-06-13T13:47:58.708Z")

public class InsurancePolicy {

  public InsurancePolicy(){}

  public InsurancePolicy(Object numeroApolice, Object cpfCnpj, Object nomeSegurado, Object emailSegurado,
                         Object vigenciaInicio, Object vigenciaFim, Object veiculoCancelado,
                         Object telefoneCliente, Object enderecoCorresp, Object cidadeCorresp, Object ufCorresp){

    this.insurancePolicyNumber = ObjectConverter.convert(numeroApolice, String.class);
    String[] nuApoliceArray = this.insurancePolicyNumber.split("\\.");
    this.companyID = nuApoliceArray[0];
    this.branchOfficeID = nuApoliceArray[1];
    this.portifolioCode = nuApoliceArray[2];
    this.endorsmentNumber = nuApoliceArray[4];

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    this.dateInitValidity = LocalDate.parse(ObjectConverter.convert(vigenciaInicio, String.class), formatter);
    this.dateEndValidity = LocalDate.parse(ObjectConverter.convert(vigenciaFim, String.class), formatter);

    this.customer = new Customer();
    this.customer.setDocuments(new ArrayList<>());
    this.customer.getDocuments().add(new Document(ObjectConverter.convert(cpfCnpj, String.class)));
    this.customer.setName(ObjectConverter.convert(nomeSegurado, String.class));
    this.customer.setContacts(new ArrayList<>());
    this.customer.getContacts().add(new Contact("0", ObjectConverter.convert(emailSegurado, String.class)));
    this.customer.getContacts().add(new Contact("1", ObjectConverter.convert(telefoneCliente, String.class)));
    Address address = new Address();
    address.setStreetName(ObjectConverter.convert(enderecoCorresp, String.class));
    address.setCity(new City());
    address.getCity().setName(ObjectConverter.convert(cidadeCorresp, String.class));
    State state = new State();
    state.setName(ObjectConverter.convert(ufCorresp, String.class));
    address.getCity().setState(state);
    this.customer.address(new ArrayList<>());

    Boolean isVeiculoCancelado = Boolean.valueOf(ObjectConverter.convert(veiculoCancelado, String.class));
    if (isVeiculoCancelado) {
      this.situation = new DomainData("0", "OK");
    }else {
      this.situation = new DomainData("1", "Cancelado");
    }

  }

  @JsonProperty("companyID")
  private String companyID = null;

  @JsonProperty("branchOfficeID")
  private String branchOfficeID = null;

  @JsonProperty("portifolioCode")
  private String portifolioCode = null;

  @JsonProperty("lineId")
  private String lineId = null;

  @JsonProperty("insurancePolicyNumber")
  private String insurancePolicyNumber = null;

  @JsonProperty("endorsmentNumber")
  private String endorsmentNumber = null;

  @JsonProperty("contractCode")
  private String contractCode = null;

  @JsonProperty("dateInitValidity")
  private LocalDate dateInitValidity = null;

  @JsonProperty("dateEndValidity")
  private LocalDate dateEndValidity = null;

  @JsonProperty("quotationBornID")
  private Long quotationBornID = null;

  @JsonProperty("situation")
  private DomainData situation = null;

  @JsonProperty("dateTransmission")
  private LocalDate dateTransmission = null;

  @JsonProperty("customer")
  private Customer customer = null;

  @JsonProperty("broker")
  private Broker broker = null;

  @JsonProperty("stipulating")
  private Stipulating stipulating = null;

  public InsurancePolicy companyID(String companyID) {
    this.companyID = companyID;
    return this;
  }

  /**
   * Company ID of insurance policy, ex: 01 - HDI, 04 - SantadnerAuto
   * @return companyID
  **/
  @ApiModelProperty(value = "Company ID of insurance policy, ex: 01 - HDI, 04 - SantadnerAuto")


  public String getCompanyID() {
    return companyID;
  }

  public void setCompanyID(String companyID) {
    this.companyID = companyID;
  }

  public InsurancePolicy branchOfficeID(String branchOfficeID) {
    this.branchOfficeID = branchOfficeID;
    return this;
  }

  /**
   * Branch Office ID, ex: 001 - Ibirapuera, 045 - SPO Interior
   * @return branchOfficeID
  **/
  @ApiModelProperty(value = "Branch Office ID, ex: 001 - Ibirapuera, 045 - SPO Interior")


  public String getBranchOfficeID() {
    return branchOfficeID;
  }

  public void setBranchOfficeID(String branchOfficeID) {
    this.branchOfficeID = branchOfficeID;
  }

  public InsurancePolicy portifolioCode(String portifolioCode) {
    this.portifolioCode = portifolioCode;
    return this;
  }

  /**
   * Portifolio of the company: ex: 431, 005, 432.
   * @return portifolioCode
  **/
  @ApiModelProperty(value = "Portifolio of the company: ex: 431, 005, 432.")


  public String getPortifolioCode() {
    return portifolioCode;
  }

  public void setPortifolioCode(String portifolioCode) {
    this.portifolioCode = portifolioCode;
  }

  public InsurancePolicy lineId(String lineId) {
    this.lineId = lineId;
    return this;
  }

  /**
   * Offshoot Id of the product: 31, 00
   * @return lineId
  **/
  @ApiModelProperty(value = "Offshoot Id of the product: 31, 00")


  public String getLineId() {
    return lineId;
  }

  public void setLineId(String lineId) {
    this.lineId = lineId;
  }

  public InsurancePolicy insurancePolicyNumber(String insurancePolicyNumber) {
    this.insurancePolicyNumber = insurancePolicyNumber;
    return this;
  }

  /**
   * insurance policy number: format (000000)
   * @return insurancePolicyNumber
  **/
  @ApiModelProperty(value = "insurance policy number: format (000000)")


  public String getInsurancePolicyNumber() {
    return insurancePolicyNumber;
  }

  public void setInsurancePolicyNumber(String insurancePolicyNumber) {
    this.insurancePolicyNumber = insurancePolicyNumber;
  }

  public InsurancePolicy endorsmentNumber(String endorsmentNumber) {
    this.endorsmentNumber = endorsmentNumber;
    return this;
  }

  /**
   * Endorsment number of insurance policy number: format (000000)
   * @return endorsmentNumber
  **/
  @ApiModelProperty(value = "Endorsment number of insurance policy number: format (000000)")


  public String getEndorsmentNumber() {
    return endorsmentNumber;
  }

  public void setEndorsmentNumber(String endorsmentNumber) {
    this.endorsmentNumber = endorsmentNumber;
  }

  public InsurancePolicy contractCode(String contractCode) {
    this.contractCode = contractCode;
    return this;
  }

  /**
   * Contract Code of insurance policy.
   * @return contractCode
  **/
  @ApiModelProperty(value = "Contract Code of insurance policy.")


  public String getContractCode() {
    return contractCode;
  }

  public void setContractCode(String contractCode) {
    this.contractCode = contractCode;
  }

  public InsurancePolicy dateInitValidity(LocalDate dateInitValidity) {
    this.dateInitValidity = dateInitValidity;
    return this;
  }

  /**
   * Date of Start of the insurance policy
   * @return dateInitValidity
  **/
  @ApiModelProperty(value = "Date of Start of the insurance policy")

  @Valid

  public LocalDate getDateInitValidity() {
    return dateInitValidity;
  }

  public void setDateInitValidity(LocalDate dateInitValidity) {
    this.dateInitValidity = dateInitValidity;
  }

  public InsurancePolicy dateEndValidity(LocalDate dateEndValidity) {
    this.dateEndValidity = dateEndValidity;
    return this;
  }

  /**
   * Date of End of the insurance policy
   * @return dateEndValidity
  **/
  @ApiModelProperty(value = "Date of End of the insurance policy")

  @Valid

  public LocalDate getDateEndValidity() {
    return dateEndValidity;
  }

  public void setDateEndValidity(LocalDate dateEndValidity) {
    this.dateEndValidity = dateEndValidity;
  }

  public InsurancePolicy quotationBornID(Long quotationBornID) {
    this.quotationBornID = quotationBornID;
    return this;
  }

  /**
   * Born quotation ID
   * @return quotationBornID
  **/
  @ApiModelProperty(value = "Born quotation ID")


  public Long getQuotationBornID() {
    return quotationBornID;
  }

  public void setQuotationBornID(Long quotationBornID) {
    this.quotationBornID = quotationBornID;
  }

  public InsurancePolicy situation(DomainData situation) {
    this.situation = situation;
    return this;
  }

  /**
   * Situation of state the insurance policy
   * @return situation
  **/
  @ApiModelProperty(value = "Situation of state the insurance policy")

  @Valid

  public DomainData getSituation() {
    return situation;
  }

  public void setSituation(DomainData situation) {
    this.situation = situation;
  }

  public InsurancePolicy dateTransmission(LocalDate dateTransmission) {
    this.dateTransmission = dateTransmission;
    return this;
  }

  /**
   * Date of transmission of the insurance policy
   * @return dateTransmission
  **/
  @ApiModelProperty(value = "Date of transmission of the insurance policy")

  @Valid

  public LocalDate getDateTransmission() {
    return dateTransmission;
  }

  public void setDateTransmission(LocalDate dateTransmission) {
    this.dateTransmission = dateTransmission;
  }

  public InsurancePolicy customer(Customer customer) {
    this.customer = customer;
    return this;
  }

  /**
   * Get customer
   * @return customer
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public InsurancePolicy broker(Broker broker) {
    this.broker = broker;
    return this;
  }

  /**
   * Get broker
   * @return broker
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Broker getBroker() {
    return broker;
  }

  public void setBroker(Broker broker) {
    this.broker = broker;
  }

  public InsurancePolicy stipulating(Stipulating stipulating) {
    this.stipulating = stipulating;
    return this;
  }

  /**
   * Get stipulating
   * @return stipulating
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Stipulating getStipulating() {
    return stipulating;
  }

  public void setStipulating(Stipulating stipulating) {
    this.stipulating = stipulating;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsurancePolicy insurancePolicy = (InsurancePolicy) o;
    return Objects.equals(this.companyID, insurancePolicy.companyID) &&
        Objects.equals(this.branchOfficeID, insurancePolicy.branchOfficeID) &&
        Objects.equals(this.portifolioCode, insurancePolicy.portifolioCode) &&
        Objects.equals(this.lineId, insurancePolicy.lineId) &&
        Objects.equals(this.insurancePolicyNumber, insurancePolicy.insurancePolicyNumber) &&
        Objects.equals(this.endorsmentNumber, insurancePolicy.endorsmentNumber) &&
        Objects.equals(this.contractCode, insurancePolicy.contractCode) &&
        Objects.equals(this.dateInitValidity, insurancePolicy.dateInitValidity) &&
        Objects.equals(this.dateEndValidity, insurancePolicy.dateEndValidity) &&
        Objects.equals(this.quotationBornID, insurancePolicy.quotationBornID) &&
        Objects.equals(this.situation, insurancePolicy.situation) &&
        Objects.equals(this.dateTransmission, insurancePolicy.dateTransmission) &&
        Objects.equals(this.customer, insurancePolicy.customer) &&
        Objects.equals(this.broker, insurancePolicy.broker) &&
        Objects.equals(this.stipulating, insurancePolicy.stipulating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyID, branchOfficeID, portifolioCode, lineId, insurancePolicyNumber, endorsmentNumber, contractCode, dateInitValidity, dateEndValidity, quotationBornID, situation, dateTransmission, customer, broker, stipulating);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsurancePolicy {\n");

    sb.append("    companyID: ").append(toIndentedString(companyID)).append("\n");
    sb.append("    branchOfficeID: ").append(toIndentedString(branchOfficeID)).append("\n");
    sb.append("    portifolioCode: ").append(toIndentedString(portifolioCode)).append("\n");
    sb.append("    lineId: ").append(toIndentedString(lineId)).append("\n");
    sb.append("    insurancePolicyNumber: ").append(toIndentedString(insurancePolicyNumber)).append("\n");
    sb.append("    endorsmentNumber: ").append(toIndentedString(endorsmentNumber)).append("\n");
    sb.append("    contractCode: ").append(toIndentedString(contractCode)).append("\n");
    sb.append("    dateInitValidity: ").append(toIndentedString(dateInitValidity)).append("\n");
    sb.append("    dateEndValidity: ").append(toIndentedString(dateEndValidity)).append("\n");
    sb.append("    quotationBornID: ").append(toIndentedString(quotationBornID)).append("\n");
    sb.append("    situation: ").append(toIndentedString(situation)).append("\n");
    sb.append("    dateTransmission: ").append(toIndentedString(dateTransmission)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    broker: ").append(toIndentedString(broker)).append("\n");
    sb.append("    stipulating: ").append(toIndentedString(stipulating)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

