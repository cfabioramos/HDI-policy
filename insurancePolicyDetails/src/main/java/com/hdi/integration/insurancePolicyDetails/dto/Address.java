package com.hdi.integration.insurancePolicyDetails.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.Objects;

/**
 * Address Entity
 */
@ApiModel(description = "Address Entity")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-06-13T13:47:58.708Z")

public class Address   {
  @JsonProperty("type")
  private DomainData type = null;

  @JsonProperty("streetName")
  private String streetName = null;

  @JsonProperty("number")
  private Integer number = null;

  @JsonProperty("complement")
  private String complement = null;

  @JsonProperty("district")
  private String district = null;

  @JsonProperty("city")
  private City city = null;

  @JsonProperty("referencePoint")
  private String referencePoint = null;

  @JsonProperty("postalCode")
  private String postalCode = null;

  public Address type(DomainData type) {
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

  public Address streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

  /**
   * street
   * @return streetName
  **/
  @ApiModelProperty(value = "street")


  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public Address number(Integer number) {
    this.number = number;
    return this;
  }

  /**
   * number
   * @return number
  **/
  @ApiModelProperty(value = "number")


  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public Address complement(String complement) {
    this.complement = complement;
    return this;
  }

  /**
   * Complement
   * @return complement
  **/
  @ApiModelProperty(value = "Complement")


  public String getComplement() {
    return complement;
  }

  public void setComplement(String complement) {
    this.complement = complement;
  }

  public Address district(String district) {
    this.district = district;
    return this;
  }

  /**
   * Neighborhood
   * @return district
  **/
  @ApiModelProperty(value = "Neighborhood")


  public String getDistrict() {
    return district;
  }

  public void setDistrict(String district) {
    this.district = district;
  }

  public Address city(City city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(value = "")

  @Valid

  public City getCity() {
    return city;
  }

  public void setCity(City city) {
    this.city = city;
  }

  public Address referencePoint(String referencePoint) {
    this.referencePoint = referencePoint;
    return this;
  }

  /**
   * Town Reference
   * @return referencePoint
  **/
  @ApiModelProperty(value = "Town Reference")


  public String getReferencePoint() {
    return referencePoint;
  }

  public void setReferencePoint(String referencePoint) {
    this.referencePoint = referencePoint;
  }

  public Address postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Posta Code
   * @return postalCode
  **/
  @ApiModelProperty(value = "Posta Code")


  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.type, address.type) &&
        Objects.equals(this.streetName, address.streetName) &&
        Objects.equals(this.number, address.number) &&
        Objects.equals(this.complement, address.complement) &&
        Objects.equals(this.district, address.district) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.referencePoint, address.referencePoint) &&
        Objects.equals(this.postalCode, address.postalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, streetName, number, complement, district, city, referencePoint, postalCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    complement: ").append(toIndentedString(complement)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    referencePoint: ").append(toIndentedString(referencePoint)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
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

