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

import java.util.UUID;

/**
 * BrokeragePerformanceVO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-12T07:38:36.822Z")
public class BrokeragePerformanceVO {
  @SerializedName("holdings_performance")
  private Object holdingsPerformance = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("nucleus_portfolio_id")
  private UUID nucleusPortfolioId = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("vendor_name")
  private String vendorName = null;

  @SerializedName("vendor_response")
  private Object vendorResponse = null;

  public BrokeragePerformanceVO holdingsPerformance(Object holdingsPerformance) {
    this.holdingsPerformance = holdingsPerformance;
    return this;
  }

   /**
   * Get holdingsPerformance
   * @return holdingsPerformance
  **/
  @ApiModelProperty(value = "")
  public Object getHoldingsPerformance() {
    return holdingsPerformance;
  }

  public void setHoldingsPerformance(Object holdingsPerformance) {
    this.holdingsPerformance = holdingsPerformance;
  }

  public BrokeragePerformanceVO message(String message) {
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

  public BrokeragePerformanceVO nucleusPortfolioId(UUID nucleusPortfolioId) {
    this.nucleusPortfolioId = nucleusPortfolioId;
    return this;
  }

   /**
   * Get nucleusPortfolioId
   * @return nucleusPortfolioId
  **/
  @ApiModelProperty(value = "")
  public UUID getNucleusPortfolioId() {
    return nucleusPortfolioId;
  }

  public void setNucleusPortfolioId(UUID nucleusPortfolioId) {
    this.nucleusPortfolioId = nucleusPortfolioId;
  }

  public BrokeragePerformanceVO status(String status) {
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

  public BrokeragePerformanceVO vendorName(String vendorName) {
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

  public BrokeragePerformanceVO vendorResponse(Object vendorResponse) {
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
    BrokeragePerformanceVO brokeragePerformanceVO = (BrokeragePerformanceVO) o;
    return Objects.equals(this.holdingsPerformance, brokeragePerformanceVO.holdingsPerformance) &&
        Objects.equals(this.message, brokeragePerformanceVO.message) &&
        Objects.equals(this.nucleusPortfolioId, brokeragePerformanceVO.nucleusPortfolioId) &&
        Objects.equals(this.status, brokeragePerformanceVO.status) &&
        Objects.equals(this.vendorName, brokeragePerformanceVO.vendorName) &&
        Objects.equals(this.vendorResponse, brokeragePerformanceVO.vendorResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(holdingsPerformance, message, nucleusPortfolioId, status, vendorName, vendorResponse);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrokeragePerformanceVO {\n");
    
    sb.append("    holdingsPerformance: ").append(toIndentedString(holdingsPerformance)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    nucleusPortfolioId: ").append(toIndentedString(nucleusPortfolioId)).append("\n");
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
