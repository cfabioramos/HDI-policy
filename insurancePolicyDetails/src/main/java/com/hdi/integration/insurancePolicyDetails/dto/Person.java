package com.hdi.integration.insurancePolicyDetails.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Person Entity
 */
@ApiModel(description = "Person Entity")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-06-13T13:47:58.708Z")

public class Person   {
  @JsonProperty("id")
  private Integer id = null;

  /**
   * Person Type
   */
  public enum TypeEnum {
    SEGURADO("Segurado"),
    
    TERCEIRO("Terceiro"),
    
    CORRETOR("Corretor"),
    
    ASSIST_NCIA("Assistência"),
    
    OFICINA("Oficina");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("fantasyName")
  private String fantasyName = null;

  @JsonProperty("nickName")
  private String nickName = null;

  @JsonProperty("documents")
  @Valid
  private List<Document> documents = null;

  @JsonProperty("contacts")
  @Valid
  private List<Contact> contacts = null;

  @JsonProperty("address")
  @Valid
  private List<Address> address = null;

  @JsonProperty("isActive")
  private Boolean isActive = null;

  public Person id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Person ID
   * @return id
  **/
  @ApiModelProperty(value = "Person ID")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Person type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Person Type
   * @return type
  **/
  @ApiModelProperty(value = "Person Type")


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Person name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name
   * @return name
  **/
  @ApiModelProperty(value = "Name")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Person fantasyName(String fantasyName) {
    this.fantasyName = fantasyName;
    return this;
  }

  /**
   * Business Name
   * @return fantasyName
  **/
  @ApiModelProperty(value = "Business Name")


  public String getFantasyName() {
    return fantasyName;
  }

  public void setFantasyName(String fantasyName) {
    this.fantasyName = fantasyName;
  }

  public Person nickName(String nickName) {
    this.nickName = nickName;
    return this;
  }

  /**
   * NickName
   * @return nickName
  **/
  @ApiModelProperty(value = "NickName")


  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  public Person documents(List<Document> documents) {
    this.documents = documents;
    return this;
  }

  public Person addDocumentsItem(Document documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<Document>();
    }
    this.documents.add(documentsItem);
    return this;
  }

  /**
   * Document Identification (CPF, RG, CNPJ, RNE)
   * @return documents
  **/
  @ApiModelProperty(value = "Document Identification (CPF, RG, CNPJ, RNE)")

  @Valid

  public List<Document> getDocuments() {
    return documents;
  }

  public void setDocuments(List<Document> documents) {
    this.documents = documents;
  }

  public Person contacts(List<Contact> contacts) {
    this.contacts = contacts;
    return this;
  }

  public Person addContactsItem(Contact contactsItem) {
    if (this.contacts == null) {
      this.contacts = new ArrayList<Contact>();
    }
    this.contacts.add(contactsItem);
    return this;
  }

  /**
   * contacts (e-mail e phones)
   * @return contacts
  **/
  @ApiModelProperty(value = "contacts (e-mail e phones)")

  @Valid

  public List<Contact> getContacts() {
    return contacts;
  }

  public void setContacts(List<Contact> contacts) {
    this.contacts = contacts;
  }

  public Person address(List<Address> address) {
    this.address = address;
    return this;
  }

  public Person addAddressItem(Address addressItem) {
    if (this.address == null) {
      this.address = new ArrayList<Address>();
    }
    this.address.add(addressItem);
    return this;
  }

  /**
   * Addresss (Payment, home, business, etc)
   * @return address
  **/
  @ApiModelProperty(value = "Addresss (Payment, home, business, etc)")

  @Valid

  public List<Address> getAddress() {
    return address;
  }

  public void setAddress(List<Address> address) {
    this.address = address;
  }

  public Person isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Active
   * @return isActive
  **/
  @ApiModelProperty(value = "Active")


  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Person person = (Person) o;
    return Objects.equals(this.id, person.id) &&
        Objects.equals(this.type, person.type) &&
        Objects.equals(this.name, person.name) &&
        Objects.equals(this.fantasyName, person.fantasyName) &&
        Objects.equals(this.nickName, person.nickName) &&
        Objects.equals(this.documents, person.documents) &&
        Objects.equals(this.contacts, person.contacts) &&
        Objects.equals(this.address, person.address) &&
        Objects.equals(this.isActive, person.isActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, name, fantasyName, nickName, documents, contacts, address, isActive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Person {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fantasyName: ").append(toIndentedString(fantasyName)).append("\n");
    sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
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

