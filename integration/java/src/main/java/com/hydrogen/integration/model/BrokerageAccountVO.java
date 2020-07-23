/*
 * Hydrogen Integration API
 * The Hydrogen Integration API
 *
 * OpenAPI spec version: 1.2.1
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.integration.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * BrokerageAccountVO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-11T07:03:53.789Z")
public class BrokerageAccountVO {
  @SerializedName("electron_document_id")
  private List<UUID> electronDocumentId = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("nucleus_client_id")
  private UUID nucleusClientId = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("vendor_name")
  private String vendorName = null;

  @SerializedName("vendor_response")
  private Object vendorResponse = null;

  public BrokerageAccountVO electronDocumentId(List<UUID> electronDocumentId) {
    this.electronDocumentId = electronDocumentId;
    return this;
  }

  public BrokerageAccountVO addElectronDocumentIdItem(UUID electronDocumentIdItem) {
    if (this.electronDocumentId == null) {
      this.electronDocumentId = new ArrayList<UUID>();
    }
    this.electronDocumentId.add(electronDocumentIdItem);
    return this;
  }

   /**
   * Get electronDocumentId
   * @return electronDocumentId
  **/
  @ApiModelProperty(value = "")
  public List<UUID> getElectronDocumentId() {
    return electronDocumentId;
  }

  public void setElectronDocumentId(List<UUID> electronDocumentId) {
    this.electronDocumentId = electronDocumentId;
  }

  public BrokerageAccountVO message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public BrokerageAccountVO nucleusClientId(UUID nucleusClientId) {
    this.nucleusClientId = nucleusClientId;
    return this;
  }

   /**
   * Get nucleusClientId
   * @return nucleusClientId
  **/
  @ApiModelProperty(value = "")
  public UUID getNucleusClientId() {
    return nucleusClientId;
  }

  public void setNucleusClientId(UUID nucleusClientId) {
    this.nucleusClientId = nucleusClientId;
  }

  public BrokerageAccountVO status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public BrokerageAccountVO vendorName(String vendorName) {
    this.vendorName = vendorName;
    return this;
  }

   /**
   * Get vendorName
   * @return vendorName
  **/
  @ApiModelProperty(value = "")
  public String getVendorName() {
    return vendorName;
  }

  public void setVendorName(String vendorName) {
    this.vendorName = vendorName;
  }

  public BrokerageAccountVO vendorResponse(Object vendorResponse) {
    this.vendorResponse = vendorResponse;
    return this;
  }

   /**
   * Get vendorResponse
   * @return vendorResponse
  **/
  @ApiModelProperty(value = "")
  public Object getVendorResponse() {
    return vendorResponse;
  }

  public void setVendorResponse(Object vendorResponse) {
    this.vendorResponse = vendorResponse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrokerageAccountVO brokerageAccountVO = (BrokerageAccountVO) o;
    return Objects.equals(this.electronDocumentId, brokerageAccountVO.electronDocumentId) &&
        Objects.equals(this.message, brokerageAccountVO.message) &&
        Objects.equals(this.nucleusClientId, brokerageAccountVO.nucleusClientId) &&
        Objects.equals(this.status, brokerageAccountVO.status) &&
        Objects.equals(this.vendorName, brokerageAccountVO.vendorName) &&
        Objects.equals(this.vendorResponse, brokerageAccountVO.vendorResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(electronDocumentId, message, nucleusClientId, status, vendorName, vendorResponse);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrokerageAccountVO {\n");
    
    sb.append("    electronDocumentId: ").append(toIndentedString(electronDocumentId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    nucleusClientId: ").append(toIndentedString(nucleusClientId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
    sb.append("    vendorResponse: ").append(toIndentedString(vendorResponse)).append("\n");
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
