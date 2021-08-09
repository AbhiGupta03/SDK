/*
 * Hydrogen Integration API
 * The Hydrogen Integration API
 *
 * OpenAPI spec version: 1.3.1
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

import java.util.UUID;

/**
 * CardBaseRequestCO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-12T04:16:13.881Z")
public class CardBaseRequestCO {
  @SerializedName("nucleus_card_id")
  private UUID nucleusCardId = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("vendor_request")
  private Object vendorRequest = null;

  public CardBaseRequestCO nucleusCardId(UUID nucleusCardId) {
    this.nucleusCardId = nucleusCardId;
    return this;
  }

   /**
   * Get nucleusCardId
   * @return nucleusCardId
  **/
  @ApiModelProperty(value = "")
  public UUID getNucleusCardId() {
    return nucleusCardId;
  }

  public void setNucleusCardId(UUID nucleusCardId) {
    this.nucleusCardId = nucleusCardId;
  }

  public CardBaseRequestCO reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @ApiModelProperty(value = "")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public CardBaseRequestCO vendorRequest(Object vendorRequest) {
    this.vendorRequest = vendorRequest;
    return this;
  }

   /**
   * Get vendorRequest
   * @return vendorRequest
  **/
  @ApiModelProperty(value = "")
  public Object getVendorRequest() {
    return vendorRequest;
  }

  public void setVendorRequest(Object vendorRequest) {
    this.vendorRequest = vendorRequest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardBaseRequestCO cardBaseRequestCO = (CardBaseRequestCO) o;
    return Objects.equals(this.nucleusCardId, cardBaseRequestCO.nucleusCardId) &&
        Objects.equals(this.reason, cardBaseRequestCO.reason) &&
        Objects.equals(this.vendorRequest, cardBaseRequestCO.vendorRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nucleusCardId, reason, vendorRequest);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardBaseRequestCO {\n");
    
    sb.append("    nucleusCardId: ").append(toIndentedString(nucleusCardId)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    vendorRequest: ").append(toIndentedString(vendorRequest)).append("\n");
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

