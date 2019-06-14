package com.hdi.integration.insurancePolicyDetails.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.Objects;

/**
 * Document Identification Entity
 */
@ApiModel(description = "Document Identification Entity")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-06-13T13:47:58.708Z")

public class Document   {

  public Document(){}

  public Document(String number){
    this.type = new DomainData();
    this.type.setId("0");
    this.number = number;
  }

  @JsonProperty("type")
  private DomainData type = null;

  @JsonProperty("number")
  private String number = null;

  @JsonProperty("issueDate")
  private LocalDate issueDate = null;

  @JsonProperty("issuer")
  private String issuer = null;

  @JsonProperty("expirationDate")
  private LocalDate expirationDate = null;

  public Document type(DomainData type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DomainData getType() {
    return type;
  }

  public void setType(DomainData type) {
    this.type = type;
  }

  public Document number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Value Number
   * @return number
  **/
  @ApiModelProperty(value = "Value Number")


  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Document issueDate(LocalDate issueDate) {
    this.issueDate = issueDate;
    return this;
  }

  /**
   * Oncy Date, the format YYYY-MM-DD. Ex.: 2018-11-14
   * @return issueDate
  **/
  @ApiModelProperty(value = "Oncy Date, the format YYYY-MM-DD. Ex.: 2018-11-14")

  @Valid

  public LocalDate getIssueDate() {
    return issueDate;
  }

  public void setIssueDate(LocalDate issueDate) {
    this.issueDate = issueDate;
  }

  public Document issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

  /**
   * Issuer
   * @return issuer
  **/
  @ApiModelProperty(value = "Issuer")


  public String getIssuer() {
    return issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  public Document expirationDate(LocalDate expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * Expiration Date, the format YYYY-MM-DD. Ex.: 2018-11-14
   * @return expirationDate
  **/
  @ApiModelProperty(value = "Expiration Date, the format YYYY-MM-DD. Ex.: 2018-11-14")

  @Valid

  public LocalDate getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(LocalDate expirationDate) {
    this.expirationDate = expirationDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Document document = (Document) o;
    return Objects.equals(this.type, document.type) &&
        Objects.equals(this.number, document.number) &&
        Objects.equals(this.issueDate, document.issueDate) &&
        Objects.equals(this.issuer, document.issuer) &&
        Objects.equals(this.expirationDate, document.expirationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, number, issueDate, issuer, expirationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Document {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
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

