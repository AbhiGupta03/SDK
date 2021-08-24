/*
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.4
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.nucleus.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.hydrogen.nucleus.model.OverflowBankLinkMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * Overflow Settings Object
 */
@ApiModel(description = "Overflow Settings Object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-24T10:39:20.203Z")
public class OverflowSettings {
  @SerializedName("account_id")
  private UUID accountId = null;

  @SerializedName("bank_links")
  private List<OverflowBankLinkMap> bankLinks = new ArrayList<OverflowBankLinkMap>();

  @SerializedName("client_id")
  private UUID clientId = null;

  @SerializedName("create_date")
  private OffsetDateTime createDate = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("is_active")
  private Boolean isActive = null;

  @SerializedName("metadata")
  private Map<String, String> metadata = null;

  @SerializedName("portfolio_id")
  private UUID portfolioId = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("update_date")
  private OffsetDateTime updateDate = null;

  public OverflowSettings accountId(UUID accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * account_id
   * @return accountId
  **/
  @ApiModelProperty(example = "099961da-7f41-4309-950f-2b51689a0033", required = true, value = "account_id")
  public UUID getAccountId() {
    return accountId;
  }

  public void setAccountId(UUID accountId) {
    this.accountId = accountId;
  }

  public OverflowSettings bankLinks(List<OverflowBankLinkMap> bankLinks) {
    this.bankLinks = bankLinks;
    return this;
  }

  public OverflowSettings addBankLinksItem(OverflowBankLinkMap bankLinksItem) {
    this.bankLinks.add(bankLinksItem);
    return this;
  }

   /**
   * Get bankLinks
   * @return bankLinks
  **/
  @ApiModelProperty(example = "[]", required = true, value = "")
  public List<OverflowBankLinkMap> getBankLinks() {
    return bankLinks;
  }

  public void setBankLinks(List<OverflowBankLinkMap> bankLinks) {
    this.bankLinks = bankLinks;
  }

  public OverflowSettings clientId(UUID clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * clientId
   * @return clientId
  **/
  @ApiModelProperty(example = "000183ac-2288-4564-a76b-119f4694be98", required = true, value = "clientId")
  public UUID getClientId() {
    return clientId;
  }

  public void setClientId(UUID clientId) {
    this.clientId = clientId;
  }

  public OverflowSettings createDate(OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @ApiModelProperty(example = "2018-06-28T18:17:23.579+0000", value = "")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }

  public OverflowSettings id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "000183ac-2288-4564-a76b-119f4694be98", value = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public OverflowSettings isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * is_active
   * @return isActive
  **/
  @ApiModelProperty(example = "true", value = "is_active")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public OverflowSettings metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public OverflowSettings putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String, String>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * metadata
   * @return metadata
  **/
  @ApiModelProperty(example = "{}", value = "metadata")
  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

  public OverflowSettings portfolioId(UUID portfolioId) {
    this.portfolioId = portfolioId;
    return this;
  }

   /**
   * portfolio_id
   * @return portfolioId
  **/
  @ApiModelProperty(example = "099961da-7f41-4309-950f-2b51689a0033", value = "portfolio_id")
  public UUID getPortfolioId() {
    return portfolioId;
  }

  public void setPortfolioId(UUID portfolioId) {
    this.portfolioId = portfolioId;
  }

  public OverflowSettings secondaryId(String secondaryId) {
    this.secondaryId = secondaryId;
    return this;
  }

   /**
   * Get secondaryId
   * @return secondaryId
  **/
  @ApiModelProperty(example = "7289243787238", value = "")
  public String getSecondaryId() {
    return secondaryId;
  }

  public void setSecondaryId(String secondaryId) {
    this.secondaryId = secondaryId;
  }

  public OverflowSettings updateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
    return this;
  }

   /**
   * Get updateDate
   * @return updateDate
  **/
  @ApiModelProperty(example = "2018-06-28T18:17:23.579+0000", value = "")
  public OffsetDateTime getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OverflowSettings overflowSettings = (OverflowSettings) o;
    return Objects.equals(this.accountId, overflowSettings.accountId) &&
        Objects.equals(this.bankLinks, overflowSettings.bankLinks) &&
        Objects.equals(this.clientId, overflowSettings.clientId) &&
        Objects.equals(this.createDate, overflowSettings.createDate) &&
        Objects.equals(this.id, overflowSettings.id) &&
        Objects.equals(this.isActive, overflowSettings.isActive) &&
        Objects.equals(this.metadata, overflowSettings.metadata) &&
        Objects.equals(this.portfolioId, overflowSettings.portfolioId) &&
        Objects.equals(this.secondaryId, overflowSettings.secondaryId) &&
        Objects.equals(this.updateDate, overflowSettings.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, bankLinks, clientId, createDate, id, isActive, metadata, portfolioId, secondaryId, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OverflowSettings {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    bankLinks: ").append(toIndentedString(bankLinks)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

