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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * Kms Config details
 */
@ApiModel(description = "Kms Config details")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-12T04:16:13.881Z")
public class KmsConfig {
  @SerializedName("aws_key_id")
  private String awsKeyId = null;

  @SerializedName("create_date")
  private OffsetDateTime createDate = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("key_name")
  private String keyName = null;

  @SerializedName("key_value")
  private String keyValue = null;

  @SerializedName("nucleus_client_id")
  private UUID nucleusClientId = null;

  @SerializedName("product")
  private String product = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("update_date")
  private OffsetDateTime updateDate = null;

  @SerializedName("vendor_id")
  private UUID vendorId = null;

  @SerializedName("vendor_name")
  private String vendorName = null;

  @SerializedName("wallet_id")
  private UUID walletId = null;

  public KmsConfig awsKeyId(String awsKeyId) {
    this.awsKeyId = awsKeyId;
    return this;
  }

   /**
   * Get awsKeyId
   * @return awsKeyId
  **/
  @ApiModelProperty(value = "")
  public String getAwsKeyId() {
    return awsKeyId;
  }

  public void setAwsKeyId(String awsKeyId) {
    this.awsKeyId = awsKeyId;
  }

  public KmsConfig createDate(OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }

  public KmsConfig id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public KmsConfig keyName(String keyName) {
    this.keyName = keyName;
    return this;
  }

   /**
   * keyName
   * @return keyName
  **/
  @ApiModelProperty(example = "username", required = true, value = "keyName")
  public String getKeyName() {
    return keyName;
  }

  public void setKeyName(String keyName) {
    this.keyName = keyName;
  }

  public KmsConfig keyValue(String keyValue) {
    this.keyValue = keyValue;
    return this;
  }

   /**
   * keyValue
   * @return keyValue
  **/
  @ApiModelProperty(example = "username", value = "keyValue")
  public String getKeyValue() {
    return keyValue;
  }

  public void setKeyValue(String keyValue) {
    this.keyValue = keyValue;
  }

  public KmsConfig nucleusClientId(UUID nucleusClientId) {
    this.nucleusClientId = nucleusClientId;
    return this;
  }

   /**
   * nucleusClientId
   * @return nucleusClientId
  **/
  @ApiModelProperty(example = "1c28dade-8679-4df5-9b9d-c508d04fcb0c", required = true, value = "nucleusClientId")
  public UUID getNucleusClientId() {
    return nucleusClientId;
  }

  public void setNucleusClientId(UUID nucleusClientId) {
    this.nucleusClientId = nucleusClientId;
  }

  public KmsConfig product(String product) {
    this.product = product;
    return this;
  }

   /**
   * product
   * @return product
  **/
  @ApiModelProperty(example = "atom", required = true, value = "product")
  public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }

  public KmsConfig secondaryId(String secondaryId) {
    this.secondaryId = secondaryId;
    return this;
  }

   /**
   * Get secondaryId
   * @return secondaryId
  **/
  @ApiModelProperty(value = "")
  public String getSecondaryId() {
    return secondaryId;
  }

  public void setSecondaryId(String secondaryId) {
    this.secondaryId = secondaryId;
  }

  public KmsConfig updateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
    return this;
  }

   /**
   * Get updateDate
   * @return updateDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
  }

  public KmsConfig vendorId(UUID vendorId) {
    this.vendorId = vendorId;
    return this;
  }

   /**
   * Get vendorId
   * @return vendorId
  **/
  @ApiModelProperty(value = "")
  public UUID getVendorId() {
    return vendorId;
  }

  public void setVendorId(UUID vendorId) {
    this.vendorId = vendorId;
  }

  public KmsConfig vendorName(String vendorName) {
    this.vendorName = vendorName;
    return this;
  }

   /**
   * vendorName
   * @return vendorName
  **/
  @ApiModelProperty(example = "vendor", required = true, value = "vendorName")
  public String getVendorName() {
    return vendorName;
  }

  public void setVendorName(String vendorName) {
    this.vendorName = vendorName;
  }

  public KmsConfig walletId(UUID walletId) {
    this.walletId = walletId;
    return this;
  }

   /**
   * walletId
   * @return walletId
  **/
  @ApiModelProperty(example = "1c28dade-8679-4df5-9b9d-c508d04fcb0c", value = "walletId")
  public UUID getWalletId() {
    return walletId;
  }

  public void setWalletId(UUID walletId) {
    this.walletId = walletId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KmsConfig kmsConfig = (KmsConfig) o;
    return Objects.equals(this.awsKeyId, kmsConfig.awsKeyId) &&
        Objects.equals(this.createDate, kmsConfig.createDate) &&
        Objects.equals(this.id, kmsConfig.id) &&
        Objects.equals(this.keyName, kmsConfig.keyName) &&
        Objects.equals(this.keyValue, kmsConfig.keyValue) &&
        Objects.equals(this.nucleusClientId, kmsConfig.nucleusClientId) &&
        Objects.equals(this.product, kmsConfig.product) &&
        Objects.equals(this.secondaryId, kmsConfig.secondaryId) &&
        Objects.equals(this.updateDate, kmsConfig.updateDate) &&
        Objects.equals(this.vendorId, kmsConfig.vendorId) &&
        Objects.equals(this.vendorName, kmsConfig.vendorName) &&
        Objects.equals(this.walletId, kmsConfig.walletId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awsKeyId, createDate, id, keyName, keyValue, nucleusClientId, product, secondaryId, updateDate, vendorId, vendorName, walletId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KmsConfig {\n");
    
    sb.append("    awsKeyId: ").append(toIndentedString(awsKeyId)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
    sb.append("    keyValue: ").append(toIndentedString(keyValue)).append("\n");
    sb.append("    nucleusClientId: ").append(toIndentedString(nucleusClientId)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
    sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
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

