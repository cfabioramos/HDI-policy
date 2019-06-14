package com.hdi.integration.insurancePolicyDetails.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * Dados de domínio. Código e nome/descrição
 */
@ApiModel(description = "Dados de domínio. Código e nome/descrição")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-06-13T13:47:58.708Z")

public class DomainData   {

  public DomainData(){}

  public DomainData(String id, String description){
    this.id = id;
    this.description = description;
  }

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("description")
  private String description = null;

  public DomainData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Código
   * @return id
  **/
  @ApiModelProperty(value = "Código")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DomainData description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Nome/descrição
   * @return description
  **/
  @ApiModelProperty(value = "Nome/descrição")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainData domainData = (DomainData) o;
    return Objects.equals(this.id, domainData.id) &&
        Objects.equals(this.description, domainData.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainData {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

