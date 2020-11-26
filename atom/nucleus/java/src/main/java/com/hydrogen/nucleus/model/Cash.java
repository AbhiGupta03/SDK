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

/**
 * Cash Object
 */
@ApiModel(description = "Cash Object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-12T11:03:26.704Z")



public class Cash {
  @SerializedName("amount")
  private Double amount = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("transaction_type")
  private String transactionType = null;

  public Cash amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * cashAmount
   * @return amount
  **/
  @ApiModelProperty(example = "30.89", required = true, value = "cashAmount")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public Cash name(String name) {
    this.name = name;
    return this;
  }

   /**
   * cashName
   * @return name
  **/
  @ApiModelProperty(example = "name", value = "cashName")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Cash transactionType(String transactionType) {
    this.transactionType = transactionType;
    return this;
  }

   /**
   * cashTransactionType
   * @return transactionType
  **/
  @ApiModelProperty(example = "deposit", required = true, value = "cashTransactionType")
  public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cash cash = (Cash) o;
    return Objects.equals(this.amount, cash.amount) &&
        Objects.equals(this.name, cash.name) &&
        Objects.equals(this.transactionType, cash.transactionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, name, transactionType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cash {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
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

