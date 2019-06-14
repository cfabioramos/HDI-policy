package com.hdi.integration.insurancePolicyDetails.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * State Entity
 */
@ApiModel(description = "State Entity")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-06-13T13:47:58.708Z")

public class State   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("country")
  private String country = null;

  public State name(String name) {
    this.name = name;
    return this;
  }

  /**
   * name description
   * @return name
  **/
  @ApiModelProperty(value = "name description")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public State country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Country Name
   * @return country
  **/
  @ApiModelProperty(value = "Country Name")


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    State state = (State) o;
    return Objects.equals(this.name, state.name) &&
        Objects.equals(this.country, state.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class State {\n");

    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

