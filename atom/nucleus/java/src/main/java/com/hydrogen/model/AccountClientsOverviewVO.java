/*
 * Hydrogen Atom API
 * The Hydrogen Atom API
 *
 * OpenAPI spec version: 1.7.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.UUID;

/**
 * AccountClientsOverviewVO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-04T05:11:20.520Z")
public class AccountClientsOverviewVO {
  @SerializedName("client_account_association")
  private String clientAccountAssociation = null;

  @SerializedName("client_first_name")
  private String clientFirstName = null;

  @SerializedName("client_id")
  private UUID clientId = null;

  @SerializedName("client_last_name")
  private String clientLastName = null;

  public AccountClientsOverviewVO clientAccountAssociation(String clientAccountAssociation) {
    this.clientAccountAssociation = clientAccountAssociation;
    return this;
  }

   /**
   * Get clientAccountAssociation
   * @return clientAccountAssociation
  **/
  @ApiModelProperty(value = "")
  public String getClientAccountAssociation() {
    return clientAccountAssociation;
  }

  public void setClientAccountAssociation(String clientAccountAssociation) {
    this.clientAccountAssociation = clientAccountAssociation;
  }

  public AccountClientsOverviewVO clientFirstName(String clientFirstName) {
    this.clientFirstName = clientFirstName;
    return this;
  }

   /**
   * Get clientFirstName
   * @return clientFirstName
  **/
  @ApiModelProperty(value = "")
  public String getClientFirstName() {
    return clientFirstName;
  }

  public void setClientFirstName(String clientFirstName) {
    this.clientFirstName = clientFirstName;
  }

  public AccountClientsOverviewVO clientId(UUID clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @ApiModelProperty(value = "")
  public UUID getClientId() {
    return clientId;
  }

  public void setClientId(UUID clientId) {
    this.clientId = clientId;
  }

  public AccountClientsOverviewVO clientLastName(String clientLastName) {
    this.clientLastName = clientLastName;
    return this;
  }

   /**
   * Get clientLastName
   * @return clientLastName
  **/
  @ApiModelProperty(value = "")
  public String getClientLastName() {
    return clientLastName;
  }

  public void setClientLastName(String clientLastName) {
    this.clientLastName = clientLastName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountClientsOverviewVO accountClientsOverviewVO = (AccountClientsOverviewVO) o;
    return Objects.equals(this.clientAccountAssociation, accountClientsOverviewVO.clientAccountAssociation) &&
        Objects.equals(this.clientFirstName, accountClientsOverviewVO.clientFirstName) &&
        Objects.equals(this.clientId, accountClientsOverviewVO.clientId) &&
        Objects.equals(this.clientLastName, accountClientsOverviewVO.clientLastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientAccountAssociation, clientFirstName, clientId, clientLastName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountClientsOverviewVO {\n");
    
    sb.append("    clientAccountAssociation: ").append(toIndentedString(clientAccountAssociation)).append("\n");
    sb.append("    clientFirstName: ").append(toIndentedString(clientFirstName)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientLastName: ").append(toIndentedString(clientLastName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
