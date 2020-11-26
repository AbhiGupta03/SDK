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
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.threeten.bp.LocalDate;

/**
 * RecurringTransactionAnalysisRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-08T03:59:30.964Z")



public class RecurringTransactionAnalysisRequest {
  /**
   * Gets or Sets scope
   */
  @JsonAdapter(ScopeEnum.Adapter.class)
  public enum ScopeEnum {
    ALL("all"),
    
    EXTERNAL("external"),
    
    INTERNAL("internal");

    private String value;

    ScopeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ScopeEnum fromValue(String text) {
      for (ScopeEnum b : ScopeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ScopeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScopeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ScopeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ScopeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("scope")
  private ScopeEnum scope = ScopeEnum.ALL;

  @SerializedName("amount_deviation_threshold")
  private Float amountDeviationThreshold = 0.05f;

  @SerializedName("analyze_transactions")
  private Boolean analyzeTransactions = true;

  @SerializedName("interval_deviation_threshold")
  private Integer intervalDeviationThreshold = 3;

  @SerializedName("client_id")
  private UUID clientId = null;

  @SerializedName("currency_conversion")
  private String currencyConversion = null;

  @SerializedName("start_date")
  private LocalDate startDate = null;

  @SerializedName("aggregation_account_ids")
  private List<UUID> aggregationAccountIds = null;

  @SerializedName("end_date")
  private LocalDate endDate = null;

  @SerializedName("show_recurring_details")
  private Boolean showRecurringDetails = false;

  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("account_ids")
  private List<UUID> accountIds = null;

  public RecurringTransactionAnalysisRequest scope(ScopeEnum scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @ApiModelProperty(value = "")
  public ScopeEnum getScope() {
    return scope;
  }

  public void setScope(ScopeEnum scope) {
    this.scope = scope;
  }

  public RecurringTransactionAnalysisRequest amountDeviationThreshold(Float amountDeviationThreshold) {
    this.amountDeviationThreshold = amountDeviationThreshold;
    return this;
  }

   /**
   * Get amountDeviationThreshold
   * minimum: 0
   * maximum: 1
   * @return amountDeviationThreshold
  **/
  @ApiModelProperty(value = "")
  public Float getAmountDeviationThreshold() {
    return amountDeviationThreshold;
  }

  public void setAmountDeviationThreshold(Float amountDeviationThreshold) {
    this.amountDeviationThreshold = amountDeviationThreshold;
  }

  public RecurringTransactionAnalysisRequest analyzeTransactions(Boolean analyzeTransactions) {
    this.analyzeTransactions = analyzeTransactions;
    return this;
  }

   /**
   * Get analyzeTransactions
   * @return analyzeTransactions
  **/
  @ApiModelProperty(value = "")
  public Boolean isAnalyzeTransactions() {
    return analyzeTransactions;
  }

  public void setAnalyzeTransactions(Boolean analyzeTransactions) {
    this.analyzeTransactions = analyzeTransactions;
  }

  public RecurringTransactionAnalysisRequest intervalDeviationThreshold(Integer intervalDeviationThreshold) {
    this.intervalDeviationThreshold = intervalDeviationThreshold;
    return this;
  }

   /**
   * Get intervalDeviationThreshold
   * minimum: 0
   * @return intervalDeviationThreshold
  **/
  @ApiModelProperty(value = "")
  public Integer getIntervalDeviationThreshold() {
    return intervalDeviationThreshold;
  }

  public void setIntervalDeviationThreshold(Integer intervalDeviationThreshold) {
    this.intervalDeviationThreshold = intervalDeviationThreshold;
  }

  public RecurringTransactionAnalysisRequest clientId(UUID clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @ApiModelProperty(value = "")
  public UUID getClientId() {
    return clientId;
  }

  public void setClientId(UUID clientId) {
    this.clientId = clientId;
  }

  public RecurringTransactionAnalysisRequest currencyConversion(String currencyConversion) {
    this.currencyConversion = currencyConversion;
    return this;
  }

   /**
   * Get currencyConversion
   * @return currencyConversion
  **/
  @ApiModelProperty(value = "")
  public String getCurrencyConversion() {
    return currencyConversion;
  }

  public void setCurrencyConversion(String currencyConversion) {
    this.currencyConversion = currencyConversion;
  }

  public RecurringTransactionAnalysisRequest startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(value = "")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public RecurringTransactionAnalysisRequest aggregationAccountIds(List<UUID> aggregationAccountIds) {
    this.aggregationAccountIds = aggregationAccountIds;
    return this;
  }

  public RecurringTransactionAnalysisRequest addAggregationAccountIdsItem(UUID aggregationAccountIdsItem) {
    if (this.aggregationAccountIds == null) {
      this.aggregationAccountIds = new ArrayList<UUID>();
    }
    this.aggregationAccountIds.add(aggregationAccountIdsItem);
    return this;
  }

   /**
   * Get aggregationAccountIds
   * @return aggregationAccountIds
  **/
  @ApiModelProperty(value = "")
  public List<UUID> getAggregationAccountIds() {
    return aggregationAccountIds;
  }

  public void setAggregationAccountIds(List<UUID> aggregationAccountIds) {
    this.aggregationAccountIds = aggregationAccountIds;
  }

  public RecurringTransactionAnalysisRequest endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @ApiModelProperty(value = "")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public RecurringTransactionAnalysisRequest showRecurringDetails(Boolean showRecurringDetails) {
    this.showRecurringDetails = showRecurringDetails;
    return this;
  }

   /**
   * Get showRecurringDetails
   * @return showRecurringDetails
  **/
  @ApiModelProperty(value = "")
  public Boolean isShowRecurringDetails() {
    return showRecurringDetails;
  }

  public void setShowRecurringDetails(Boolean showRecurringDetails) {
    this.showRecurringDetails = showRecurringDetails;
  }

  public RecurringTransactionAnalysisRequest currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(value = "")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public RecurringTransactionAnalysisRequest accountIds(List<UUID> accountIds) {
    this.accountIds = accountIds;
    return this;
  }

  public RecurringTransactionAnalysisRequest addAccountIdsItem(UUID accountIdsItem) {
    if (this.accountIds == null) {
      this.accountIds = new ArrayList<UUID>();
    }
    this.accountIds.add(accountIdsItem);
    return this;
  }

   /**
   * Get accountIds
   * @return accountIds
  **/
  @ApiModelProperty(value = "")
  public List<UUID> getAccountIds() {
    return accountIds;
  }

  public void setAccountIds(List<UUID> accountIds) {
    this.accountIds = accountIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecurringTransactionAnalysisRequest recurringTransactionAnalysisRequest = (RecurringTransactionAnalysisRequest) o;
    return Objects.equals(this.scope, recurringTransactionAnalysisRequest.scope) &&
        Objects.equals(this.amountDeviationThreshold, recurringTransactionAnalysisRequest.amountDeviationThreshold) &&
        Objects.equals(this.analyzeTransactions, recurringTransactionAnalysisRequest.analyzeTransactions) &&
        Objects.equals(this.intervalDeviationThreshold, recurringTransactionAnalysisRequest.intervalDeviationThreshold) &&
        Objects.equals(this.clientId, recurringTransactionAnalysisRequest.clientId) &&
        Objects.equals(this.currencyConversion, recurringTransactionAnalysisRequest.currencyConversion) &&
        Objects.equals(this.startDate, recurringTransactionAnalysisRequest.startDate) &&
        Objects.equals(this.aggregationAccountIds, recurringTransactionAnalysisRequest.aggregationAccountIds) &&
        Objects.equals(this.endDate, recurringTransactionAnalysisRequest.endDate) &&
        Objects.equals(this.showRecurringDetails, recurringTransactionAnalysisRequest.showRecurringDetails) &&
        Objects.equals(this.currencyCode, recurringTransactionAnalysisRequest.currencyCode) &&
        Objects.equals(this.accountIds, recurringTransactionAnalysisRequest.accountIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scope, amountDeviationThreshold, analyzeTransactions, intervalDeviationThreshold, clientId, currencyConversion, startDate, aggregationAccountIds, endDate, showRecurringDetails, currencyCode, accountIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurringTransactionAnalysisRequest {\n");
    
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    amountDeviationThreshold: ").append(toIndentedString(amountDeviationThreshold)).append("\n");
    sb.append("    analyzeTransactions: ").append(toIndentedString(analyzeTransactions)).append("\n");
    sb.append("    intervalDeviationThreshold: ").append(toIndentedString(intervalDeviationThreshold)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    currencyConversion: ").append(toIndentedString(currencyConversion)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    aggregationAccountIds: ").append(toIndentedString(aggregationAccountIds)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    showRecurringDetails: ").append(toIndentedString(showRecurringDetails)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    accountIds: ").append(toIndentedString(accountIds)).append("\n");
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

