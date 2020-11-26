/*
 * Hydrogen Proton API
 * Financial engineering module of Hydrogen Atom
 *
 * OpenAPI spec version: 1.8.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.proton.model;

import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * WConfig
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-08T03:59:30.964Z")



public class WConfig {
  @SerializedName("w_min_minor")
  private Float wMinMinor = null;

  @SerializedName("w_max_major")
  private Float wMaxMajor = null;

  @SerializedName("w_min_major")
  private Float wMinMajor = null;

  @SerializedName("cash_amount")
  private Float cashAmount = null;

  @SerializedName("w_max_minor")
  private Float wMaxMinor = null;

  public WConfig wMinMinor(Float wMinMinor) {
    this.wMinMinor = wMinMinor;
    return this;
  }

   /**
   * Get wMinMinor
   * minimum: 0
   * maximum: 1
   * @return wMinMinor
  **/
  @ApiModelProperty(required = true, value = "")
  public Float getWMinMinor() {
    return wMinMinor;
  }

  public void setWMinMinor(Float wMinMinor) {
    this.wMinMinor = wMinMinor;
  }

  public WConfig wMaxMajor(Float wMaxMajor) {
    this.wMaxMajor = wMaxMajor;
    return this;
  }

   /**
   * Get wMaxMajor
   * minimum: 0
   * maximum: 1
   * @return wMaxMajor
  **/
  @ApiModelProperty(required = true, value = "")
  public Float getWMaxMajor() {
    return wMaxMajor;
  }

  public void setWMaxMajor(Float wMaxMajor) {
    this.wMaxMajor = wMaxMajor;
  }

  public WConfig wMinMajor(Float wMinMajor) {
    this.wMinMajor = wMinMajor;
    return this;
  }

   /**
   * Get wMinMajor
   * minimum: 0
   * maximum: 1
   * @return wMinMajor
  **/
  @ApiModelProperty(required = true, value = "")
  public Float getWMinMajor() {
    return wMinMajor;
  }

  public void setWMinMajor(Float wMinMajor) {
    this.wMinMajor = wMinMajor;
  }

  public WConfig cashAmount(Float cashAmount) {
    this.cashAmount = cashAmount;
    return this;
  }

   /**
   * Get cashAmount
   * minimum: 0
   * maximum: 1
   * @return cashAmount
  **/
  @ApiModelProperty(required = true, value = "")
  public Float getCashAmount() {
    return cashAmount;
  }

  public void setCashAmount(Float cashAmount) {
    this.cashAmount = cashAmount;
  }

  public WConfig wMaxMinor(Float wMaxMinor) {
    this.wMaxMinor = wMaxMinor;
    return this;
  }

   /**
   * Get wMaxMinor
   * minimum: 0
   * maximum: 1
   * @return wMaxMinor
  **/
  @ApiModelProperty(required = true, value = "")
  public Float getWMaxMinor() {
    return wMaxMinor;
  }

  public void setWMaxMinor(Float wMaxMinor) {
    this.wMaxMinor = wMaxMinor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WConfig wconfig = (WConfig) o;
    return Objects.equals(this.wMinMinor, wconfig.wMinMinor) &&
        Objects.equals(this.wMaxMajor, wconfig.wMaxMajor) &&
        Objects.equals(this.wMinMajor, wconfig.wMinMajor) &&
        Objects.equals(this.cashAmount, wconfig.cashAmount) &&
        Objects.equals(this.wMaxMinor, wconfig.wMaxMinor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wMinMinor, wMaxMajor, wMinMajor, cashAmount, wMaxMinor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WConfig {\n");
    
    sb.append("    wMinMinor: ").append(toIndentedString(wMinMinor)).append("\n");
    sb.append("    wMaxMajor: ").append(toIndentedString(wMaxMajor)).append("\n");
    sb.append("    wMinMajor: ").append(toIndentedString(wMinMajor)).append("\n");
    sb.append("    cashAmount: ").append(toIndentedString(cashAmount)).append("\n");
    sb.append("    wMaxMinor: ").append(toIndentedString(wMaxMinor)).append("\n");
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

