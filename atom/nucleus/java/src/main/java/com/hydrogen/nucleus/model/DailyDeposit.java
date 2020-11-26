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

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

/**
 * DailyDeposit Object
 */
@ApiModel(description = "DailyDeposit Object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-12T11:03:26.704Z")



public class DailyDeposit {
  @SerializedName("account_id")
  private UUID accountId = null;

  @SerializedName("account_number")
  private String accountNumber = null;

  @SerializedName("amount")
  private Double amount = null;

  @SerializedName("comments")
  private String comments = null;

  @SerializedName("create_date")
  private OffsetDateTime createDate = null;

  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("direction")
  private String direction = null;

  @SerializedName("funding_id")
  private UUID fundingId = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("invested_date")
  private LocalDate investedDate = null;

  @SerializedName("last_request_date")
  private LocalDate lastRequestDate = null;

  @SerializedName("metadata")
  private Map<String, String> metadata = null;

  @SerializedName("notes")
  private String notes = null;

  @SerializedName("portfolio_id")
  private UUID portfolioId = null;

  @SerializedName("portfolio_transaction_id")
  private UUID portfolioTransactionId = null;

  @SerializedName("received_date")
  private LocalDate receivedDate = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("status_time_stamp")
  private OffsetDateTime statusTimeStamp = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("update_date")
  private OffsetDateTime updateDate = null;

  public DailyDeposit accountId(UUID accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * accountId
   * @return accountId
  **/
  @ApiModelProperty(example = "1c28dade-8679-4df5-9b9d-c508d04fcb0c", required = true, value = "accountId")
  public UUID getAccountId() {
    return accountId;
  }

  public void setAccountId(UUID accountId) {
    this.accountId = accountId;
  }

  public DailyDeposit accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * accountNumber
   * @return accountNumber
  **/
  @ApiModelProperty(example = "569347", value = "accountNumber")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public DailyDeposit amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * amount
   * @return amount
  **/
  @ApiModelProperty(example = "1004.0", required = true, value = "amount")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public DailyDeposit comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * comments
   * @return comments
  **/
  @ApiModelProperty(example = "Funded", value = "comments")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @ApiModelProperty(example = "2018-06-28T18:17:23.579+0000", value = "")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public DailyDeposit currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(example = "USD", value = "currencyCode")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public DailyDeposit direction(String direction) {
    this.direction = direction;
    return this;
  }

   /**
   * direction
   * @return direction
  **/
  @ApiModelProperty(example = "Incoming", value = "direction")
  public String getDirection() {
    return direction;
  }

  public void setDirection(String direction) {
    this.direction = direction;
  }

  public DailyDeposit fundingId(UUID fundingId) {
    this.fundingId = fundingId;
    return this;
  }

   /**
   * fundingId
   * @return fundingId
  **/
  @ApiModelProperty(example = "ea30e8b7-3946-46ed-975a-4870a57d119s", required = true, value = "fundingId")
  public UUID getFundingId() {
    return fundingId;
  }

  public void setFundingId(UUID fundingId) {
    this.fundingId = fundingId;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "000183ac-2288-4564-a76b-119f4694be98", value = "")
  public UUID getId() {
    return id;
  }

  public DailyDeposit investedDate(LocalDate investedDate) {
    this.investedDate = investedDate;
    return this;
  }

   /**
   * investedDate
   * @return investedDate
  **/
  @ApiModelProperty(example = "2018-01-29", value = "investedDate")
  public LocalDate getInvestedDate() {
    return investedDate;
  }

  public void setInvestedDate(LocalDate investedDate) {
    this.investedDate = investedDate;
  }

  public DailyDeposit lastRequestDate(LocalDate lastRequestDate) {
    this.lastRequestDate = lastRequestDate;
    return this;
  }

   /**
   * last_request_date
   * @return lastRequestDate
  **/
  @ApiModelProperty(example = "2018-01-29", value = "last_request_date")
  public LocalDate getLastRequestDate() {
    return lastRequestDate;
  }

  public void setLastRequestDate(LocalDate lastRequestDate) {
    this.lastRequestDate = lastRequestDate;
  }

  public DailyDeposit metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public DailyDeposit putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String, String>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

  public DailyDeposit notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * notes
   * @return notes
  **/
  @ApiModelProperty(example = "Sample", value = "notes")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public DailyDeposit portfolioId(UUID portfolioId) {
    this.portfolioId = portfolioId;
    return this;
  }

   /**
   * portfolio_id
   * @return portfolioId
  **/
  @ApiModelProperty(example = "ea30e8b7-3946-46ed-975a-4870a57d119s", value = "portfolio_id")
  public UUID getPortfolioId() {
    return portfolioId;
  }

  public void setPortfolioId(UUID portfolioId) {
    this.portfolioId = portfolioId;
  }

  public DailyDeposit portfolioTransactionId(UUID portfolioTransactionId) {
    this.portfolioTransactionId = portfolioTransactionId;
    return this;
  }

   /**
   * portfolioTransactionId
   * @return portfolioTransactionId
  **/
  @ApiModelProperty(example = "29c3f995-bd45-4346-aea2-fd4476568d4c", value = "portfolioTransactionId")
  public UUID getPortfolioTransactionId() {
    return portfolioTransactionId;
  }

  public void setPortfolioTransactionId(UUID portfolioTransactionId) {
    this.portfolioTransactionId = portfolioTransactionId;
  }

  public DailyDeposit receivedDate(LocalDate receivedDate) {
    this.receivedDate = receivedDate;
    return this;
  }

   /**
   * receivedDate
   * @return receivedDate
  **/
  @ApiModelProperty(example = "2018-01-29", value = "receivedDate")
  public LocalDate getReceivedDate() {
    return receivedDate;
  }

  public void setReceivedDate(LocalDate receivedDate) {
    this.receivedDate = receivedDate;
  }

   /**
   * Get secondaryId
   * @return secondaryId
  **/
  @ApiModelProperty(example = "7289243787238", value = "")
  public String getSecondaryId() {
    return secondaryId;
  }

  public DailyDeposit status(String status) {
    this.status = status;
    return this;
  }

   /**
   * status
   * @return status
  **/
  @ApiModelProperty(example = "in process", value = "status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public DailyDeposit statusTimeStamp(OffsetDateTime statusTimeStamp) {
    this.statusTimeStamp = statusTimeStamp;
    return this;
  }

   /**
   * statusTimeStamp
   * @return statusTimeStamp
  **/
  @ApiModelProperty(example = "2018-01-09'T'12:00:00", value = "statusTimeStamp")
  public OffsetDateTime getStatusTimeStamp() {
    return statusTimeStamp;
  }

  public void setStatusTimeStamp(OffsetDateTime statusTimeStamp) {
    this.statusTimeStamp = statusTimeStamp;
  }

  public DailyDeposit type(String type) {
    this.type = type;
    return this;
  }

   /**
   * type
   * @return type
  **/
  @ApiModelProperty(example = "one-time", value = "type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
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
    DailyDeposit dailyDeposit = (DailyDeposit) o;
    return Objects.equals(this.accountId, dailyDeposit.accountId) &&
        Objects.equals(this.accountNumber, dailyDeposit.accountNumber) &&
        Objects.equals(this.amount, dailyDeposit.amount) &&
        Objects.equals(this.comments, dailyDeposit.comments) &&
        Objects.equals(this.createDate, dailyDeposit.createDate) &&
        Objects.equals(this.currencyCode, dailyDeposit.currencyCode) &&
        Objects.equals(this.direction, dailyDeposit.direction) &&
        Objects.equals(this.fundingId, dailyDeposit.fundingId) &&
        Objects.equals(this.id, dailyDeposit.id) &&
        Objects.equals(this.investedDate, dailyDeposit.investedDate) &&
        Objects.equals(this.lastRequestDate, dailyDeposit.lastRequestDate) &&
        Objects.equals(this.metadata, dailyDeposit.metadata) &&
        Objects.equals(this.notes, dailyDeposit.notes) &&
        Objects.equals(this.portfolioId, dailyDeposit.portfolioId) &&
        Objects.equals(this.portfolioTransactionId, dailyDeposit.portfolioTransactionId) &&
        Objects.equals(this.receivedDate, dailyDeposit.receivedDate) &&
        Objects.equals(this.secondaryId, dailyDeposit.secondaryId) &&
        Objects.equals(this.status, dailyDeposit.status) &&
        Objects.equals(this.statusTimeStamp, dailyDeposit.statusTimeStamp) &&
        Objects.equals(this.type, dailyDeposit.type) &&
        Objects.equals(this.updateDate, dailyDeposit.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountNumber, amount, comments, createDate, currencyCode, direction, fundingId, id, investedDate, lastRequestDate, metadata, notes, portfolioId, portfolioTransactionId, receivedDate, secondaryId, status, statusTimeStamp, type, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DailyDeposit {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    fundingId: ").append(toIndentedString(fundingId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    investedDate: ").append(toIndentedString(investedDate)).append("\n");
    sb.append("    lastRequestDate: ").append(toIndentedString(lastRequestDate)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    portfolioTransactionId: ").append(toIndentedString(portfolioTransactionId)).append("\n");
    sb.append("    receivedDate: ").append(toIndentedString(receivedDate)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusTimeStamp: ").append(toIndentedString(statusTimeStamp)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

