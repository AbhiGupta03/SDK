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
import org.threeten.bp.OffsetDateTime;

/**
 * ModelTransaction
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-12T11:03:26.704Z")



public class ModelTransaction {
  @SerializedName("create_date")
  private OffsetDateTime createDate = null;

  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("model_id")
  private UUID modelId = null;

  @SerializedName("price")
  private Double price = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("security_id")
  private UUID securityId = null;

  @SerializedName("shares")
  private Double shares = null;

  @SerializedName("transaction_code_id")
  private UUID transactionCodeId = null;

  @SerializedName("update_date")
  private OffsetDateTime updateDate = null;

   /**
   * Get createDate
   * @return createDate
  **/
  @ApiModelProperty(example = "2018-06-28T18:17:23.579+0000", value = "")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public ModelTransaction date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Date
   * @return date
  **/
  @ApiModelProperty(example = "2018-01-09'T'12:00:00", required = true, value = "Date")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "000183ac-2288-4564-a76b-119f4694be98", value = "")
  public UUID getId() {
    return id;
  }

  public ModelTransaction modelId(UUID modelId) {
    this.modelId = modelId;
    return this;
  }

   /**
   * modelId
   * @return modelId
  **/
  @ApiModelProperty(example = "62fd0a9f-4bac-4b1d-94d2-2c5ea2adca3d", required = true, value = "modelId")
  public UUID getModelId() {
    return modelId;
  }

  public void setModelId(UUID modelId) {
    this.modelId = modelId;
  }

  public ModelTransaction price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * price
   * @return price
  **/
  @ApiModelProperty(example = "100.0", required = true, value = "price")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

   /**
   * Get secondaryId
   * @return secondaryId
  **/
  @ApiModelProperty(example = "7289243787238", value = "")
  public String getSecondaryId() {
    return secondaryId;
  }

  public ModelTransaction securityId(UUID securityId) {
    this.securityId = securityId;
    return this;
  }

   /**
   * securityId
   * @return securityId
  **/
  @ApiModelProperty(example = "29c3f995-bd45-4346-aea2-fd4476568d4c", required = true, value = "securityId")
  public UUID getSecurityId() {
    return securityId;
  }

  public void setSecurityId(UUID securityId) {
    this.securityId = securityId;
  }

  public ModelTransaction shares(Double shares) {
    this.shares = shares;
    return this;
  }

   /**
   * shares
   * @return shares
  **/
  @ApiModelProperty(example = "100.0", required = true, value = "shares")
  public Double getShares() {
    return shares;
  }

  public void setShares(Double shares) {
    this.shares = shares;
  }

  public ModelTransaction transactionCodeId(UUID transactionCodeId) {
    this.transactionCodeId = transactionCodeId;
    return this;
  }

   /**
   * transactionCodeId
   * @return transactionCodeId
  **/
  @ApiModelProperty(example = "f5af397b-7d22-433f-b01e-8202184a6386", required = true, value = "transactionCodeId")
  public UUID getTransactionCodeId() {
    return transactionCodeId;
  }

  public void setTransactionCodeId(UUID transactionCodeId) {
    this.transactionCodeId = transactionCodeId;
  }

   /**
   * Get updateDate
   * @return updateDate
  **/
  @ApiModelProperty(example = "2018-06-28T18:17:23.579+0000", value = "")
  public OffsetDateTime getUpdateDate() {
    return updateDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelTransaction modelTransaction = (ModelTransaction) o;
    return Objects.equals(this.createDate, modelTransaction.createDate) &&
        Objects.equals(this.date, modelTransaction.date) &&
        Objects.equals(this.id, modelTransaction.id) &&
        Objects.equals(this.modelId, modelTransaction.modelId) &&
        Objects.equals(this.price, modelTransaction.price) &&
        Objects.equals(this.secondaryId, modelTransaction.secondaryId) &&
        Objects.equals(this.securityId, modelTransaction.securityId) &&
        Objects.equals(this.shares, modelTransaction.shares) &&
        Objects.equals(this.transactionCodeId, modelTransaction.transactionCodeId) &&
        Objects.equals(this.updateDate, modelTransaction.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createDate, date, id, modelId, price, secondaryId, securityId, shares, transactionCodeId, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelTransaction {\n");
    
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
    sb.append("    securityId: ").append(toIndentedString(securityId)).append("\n");
    sb.append("    shares: ").append(toIndentedString(shares)).append("\n");
    sb.append("    transactionCodeId: ").append(toIndentedString(transactionCodeId)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
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

