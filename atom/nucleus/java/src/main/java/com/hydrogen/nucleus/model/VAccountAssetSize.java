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

import java.util.UUID;
import org.threeten.bp.LocalDate;

/**
 * VAccountAssetSize Object
 */
@ApiModel(description = "VAccountAssetSize Object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-12T11:03:26.704Z")



public class VAccountAssetSize {
  @SerializedName("account_id")
  private UUID accountId = null;

  @SerializedName("asset_size")
  private Double assetSize = null;

  @SerializedName("cash_flow")
  private Double cashFlow = null;

  @SerializedName("date")
  private LocalDate date = null;

  public VAccountAssetSize accountId(UUID accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * account_id
   * @return accountId
  **/
  @ApiModelProperty(example = "1c28dade-8679-4df5-9b9d-c508d04fcb0c", value = "account_id")
  public UUID getAccountId() {
    return accountId;
  }

  public void setAccountId(UUID accountId) {
    this.accountId = accountId;
  }

  public VAccountAssetSize assetSize(Double assetSize) {
    this.assetSize = assetSize;
    return this;
  }

   /**
   * asset_size
   * @return assetSize
  **/
  @ApiModelProperty(example = "1.0", value = "asset_size")
  public Double getAssetSize() {
    return assetSize;
  }

  public void setAssetSize(Double assetSize) {
    this.assetSize = assetSize;
  }

  public VAccountAssetSize cashFlow(Double cashFlow) {
    this.cashFlow = cashFlow;
    return this;
  }

   /**
   * cash_flow
   * @return cashFlow
  **/
  @ApiModelProperty(example = "1.0", value = "cash_flow")
  public Double getCashFlow() {
    return cashFlow;
  }

  public void setCashFlow(Double cashFlow) {
    this.cashFlow = cashFlow;
  }

  public VAccountAssetSize date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VAccountAssetSize vaccountAssetSize = (VAccountAssetSize) o;
    return Objects.equals(this.accountId, vaccountAssetSize.accountId) &&
        Objects.equals(this.assetSize, vaccountAssetSize.assetSize) &&
        Objects.equals(this.cashFlow, vaccountAssetSize.cashFlow) &&
        Objects.equals(this.date, vaccountAssetSize.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, assetSize, cashFlow, date);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VAccountAssetSize {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    assetSize: ").append(toIndentedString(assetSize)).append("\n");
    sb.append("    cashFlow: ").append(toIndentedString(cashFlow)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

