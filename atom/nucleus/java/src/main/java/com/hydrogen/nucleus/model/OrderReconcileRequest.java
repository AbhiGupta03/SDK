/*
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.8.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.nucleus.model;

import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * OrderReconcileRequest Object
 */
@ApiModel(description = "OrderReconcileRequest Object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-12T11:03:26.704Z")



public class OrderReconcileRequest {
  @SerializedName("account_id")
  private UUID accountId = null;

  @SerializedName("non_fractional")
  private Boolean nonFractional = null;

  @SerializedName("order_track_ids")
  private List<UUID> orderTrackIds = null;

  @SerializedName("portfolio_id")
  private UUID portfolioId = null;

  @SerializedName("tenant_id")
  private UUID tenantId = null;

  public OrderReconcileRequest accountId(UUID accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @ApiModelProperty(value = "")
  public UUID getAccountId() {
    return accountId;
  }

  public void setAccountId(UUID accountId) {
    this.accountId = accountId;
  }

  public OrderReconcileRequest nonFractional(Boolean nonFractional) {
    this.nonFractional = nonFractional;
    return this;
  }

   /**
   * Get nonFractional
   * @return nonFractional
  **/
  @ApiModelProperty(value = "")
  public Boolean isNonFractional() {
    return nonFractional;
  }

  public void setNonFractional(Boolean nonFractional) {
    this.nonFractional = nonFractional;
  }

  public OrderReconcileRequest orderTrackIds(List<UUID> orderTrackIds) {
    this.orderTrackIds = orderTrackIds;
    return this;
  }

  public OrderReconcileRequest addOrderTrackIdsItem(UUID orderTrackIdsItem) {
    if (this.orderTrackIds == null) {
      this.orderTrackIds = new ArrayList<UUID>();
    }
    this.orderTrackIds.add(orderTrackIdsItem);
    return this;
  }

   /**
   * Get orderTrackIds
   * @return orderTrackIds
  **/
  @ApiModelProperty(value = "")
  public List<UUID> getOrderTrackIds() {
    return orderTrackIds;
  }

  public void setOrderTrackIds(List<UUID> orderTrackIds) {
    this.orderTrackIds = orderTrackIds;
  }

  public OrderReconcileRequest portfolioId(UUID portfolioId) {
    this.portfolioId = portfolioId;
    return this;
  }

   /**
   * Get portfolioId
   * @return portfolioId
  **/
  @ApiModelProperty(value = "")
  public UUID getPortfolioId() {
    return portfolioId;
  }

  public void setPortfolioId(UUID portfolioId) {
    this.portfolioId = portfolioId;
  }

  public OrderReconcileRequest tenantId(UUID tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Get tenantId
   * @return tenantId
  **/
  @ApiModelProperty(value = "")
  public UUID getTenantId() {
    return tenantId;
  }

  public void setTenantId(UUID tenantId) {
    this.tenantId = tenantId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderReconcileRequest orderReconcileRequest = (OrderReconcileRequest) o;
    return Objects.equals(this.accountId, orderReconcileRequest.accountId) &&
        Objects.equals(this.nonFractional, orderReconcileRequest.nonFractional) &&
        Objects.equals(this.orderTrackIds, orderReconcileRequest.orderTrackIds) &&
        Objects.equals(this.portfolioId, orderReconcileRequest.portfolioId) &&
        Objects.equals(this.tenantId, orderReconcileRequest.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, nonFractional, orderTrackIds, portfolioId, tenantId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderReconcileRequest {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    nonFractional: ").append(toIndentedString(nonFractional)).append("\n");
    sb.append("    orderTrackIds: ").append(toIndentedString(orderTrackIds)).append("\n");
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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

