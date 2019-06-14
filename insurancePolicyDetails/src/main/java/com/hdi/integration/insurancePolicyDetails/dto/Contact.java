package com.hdi.integration.insurancePolicyDetails.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.Objects;

/**
 * Contacts Entity
 */
@ApiModel(description = "Contacts Entity")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-06-13T13:47:58.708Z")

public class Contact   {

  public Contact(){}

  public Contact(String idType, String valor){
    this.type = new DomainData();
    this.type.setId(idType);
    this.valor = valor;
  }

  @JsonProperty("type")
  private DomainData type = null;

  @JsonProperty("valor")
  private String valor = null;

  public Contact type(DomainData type) {
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

  public Contact valor(String valor) {
    this.valor = valor;
    return this;
  }

  /**
   * Contact Data
   * @return valor
  **/
  @ApiModelProperty(value = "Contact Data")


  public String getValor() {
    return valor;
  }

  public void setValor(String valor) {
    this.valor = valor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contact contact = (Contact) o;
    return Objects.equals(this.type, contact.type) &&
        Objects.equals(this.valor, contact.valor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, valor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contact {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
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

