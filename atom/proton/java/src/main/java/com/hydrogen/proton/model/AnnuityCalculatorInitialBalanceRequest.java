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

/**
 * AnnuityCalculatorInitialBalanceRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-08T03:59:30.964Z")



public class AnnuityCalculatorInitialBalanceRequest {
  @SerializedName("inflation_rate")
  private Float inflationRate = 0.0f;

  /**
   * Gets or Sets annuityFrequencyInterval
   */
  @JsonAdapter(AnnuityFrequencyIntervalEnum.Adapter.class)
  public enum AnnuityFrequencyIntervalEnum {
    YEAR("year"),
    
    QUARTER("quarter"),
    
    MONTH("month"),
    
    WEEK("week"),
    
    DAY("day");

    private String value;

    AnnuityFrequencyIntervalEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AnnuityFrequencyIntervalEnum fromValue(String text) {
      for (AnnuityFrequencyIntervalEnum b : AnnuityFrequencyIntervalEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AnnuityFrequencyIntervalEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AnnuityFrequencyIntervalEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AnnuityFrequencyIntervalEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AnnuityFrequencyIntervalEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("annuity_frequency_interval")
  private AnnuityFrequencyIntervalEnum annuityFrequencyInterval = AnnuityFrequencyIntervalEnum.YEAR;

  @SerializedName("deposit_schedule")
  private AnnuityDepositSchedule depositSchedule = null;

  @SerializedName("portfolio_return")
  private Float portfolioReturn = null;

  @SerializedName("create_log")
  private Boolean createLog = false;

  @SerializedName("aggregation_account_ids")
  private List<UUID> aggregationAccountIds = null;

  @SerializedName("initial_balance")
  private Float initialBalance = 0.0f;

  @SerializedName("decumulation_horizon")
  private Integer decumulationHorizon = null;

  @SerializedName("tax_rate")
  private Float taxRate = 0.0f;

  @SerializedName("account_ids")
  private List<UUID> accountIds = null;

  @SerializedName("annuity_amount")
  private Float annuityAmount = null;

  @SerializedName("accumulation_horizon")
  private Integer accumulationHorizon = null;

  public AnnuityCalculatorInitialBalanceRequest inflationRate(Float inflationRate) {
    this.inflationRate = inflationRate;
    return this;
  }

   /**
   * Get inflationRate
   * minimum: -1
   * maximum: 20
   * @return inflationRate
  **/
  @ApiModelProperty(value = "")
  public Float getInflationRate() {
    return inflationRate;
  }

  public void setInflationRate(Float inflationRate) {
    this.inflationRate = inflationRate;
  }

  public AnnuityCalculatorInitialBalanceRequest annuityFrequencyInterval(AnnuityFrequencyIntervalEnum annuityFrequencyInterval) {
    this.annuityFrequencyInterval = annuityFrequencyInterval;
    return this;
  }

   /**
   * Get annuityFrequencyInterval
   * @return annuityFrequencyInterval
  **/
  @ApiModelProperty(value = "")
  public AnnuityFrequencyIntervalEnum getAnnuityFrequencyInterval() {
    return annuityFrequencyInterval;
  }

  public void setAnnuityFrequencyInterval(AnnuityFrequencyIntervalEnum annuityFrequencyInterval) {
    this.annuityFrequencyInterval = annuityFrequencyInterval;
  }

  public AnnuityCalculatorInitialBalanceRequest depositSchedule(AnnuityDepositSchedule depositSchedule) {
    this.depositSchedule = depositSchedule;
    return this;
  }

   /**
   * Get depositSchedule
   * @return depositSchedule
  **/
  @ApiModelProperty(value = "")
  public AnnuityDepositSchedule getDepositSchedule() {
    return depositSchedule;
  }

  public void setDepositSchedule(AnnuityDepositSchedule depositSchedule) {
    this.depositSchedule = depositSchedule;
  }

  public AnnuityCalculatorInitialBalanceRequest portfolioReturn(Float portfolioReturn) {
    this.portfolioReturn = portfolioReturn;
    return this;
  }

   /**
   * Get portfolioReturn
   * @return portfolioReturn
  **/
  @ApiModelProperty(required = true, value = "")
  public Float getPortfolioReturn() {
    return portfolioReturn;
  }

  public void setPortfolioReturn(Float portfolioReturn) {
    this.portfolioReturn = portfolioReturn;
  }

  public AnnuityCalculatorInitialBalanceRequest createLog(Boolean createLog) {
    this.createLog = createLog;
    return this;
  }

   /**
   * Get createLog
   * @return createLog
  **/
  @ApiModelProperty(value = "")
  public Boolean isCreateLog() {
    return createLog;
  }

  public void setCreateLog(Boolean createLog) {
    this.createLog = createLog;
  }

  public AnnuityCalculatorInitialBalanceRequest aggregationAccountIds(List<UUID> aggregationAccountIds) {
    this.aggregationAccountIds = aggregationAccountIds;
    return this;
  }

  public AnnuityCalculatorInitialBalanceRequest addAggregationAccountIdsItem(UUID aggregationAccountIdsItem) {
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

  public AnnuityCalculatorInitialBalanceRequest initialBalance(Float initialBalance) {
    this.initialBalance = initialBalance;
    return this;
  }

   /**
   * Get initialBalance
   * minimum: 0
   * @return initialBalance
  **/
  @ApiModelProperty(value = "")
  public Float getInitialBalance() {
    return initialBalance;
  }

  public void setInitialBalance(Float initialBalance) {
    this.initialBalance = initialBalance;
  }

  public AnnuityCalculatorInitialBalanceRequest decumulationHorizon(Integer decumulationHorizon) {
    this.decumulationHorizon = decumulationHorizon;
    return this;
  }

   /**
   * Get decumulationHorizon
   * minimum: 1
   * @return decumulationHorizon
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getDecumulationHorizon() {
    return decumulationHorizon;
  }

  public void setDecumulationHorizon(Integer decumulationHorizon) {
    this.decumulationHorizon = decumulationHorizon;
  }

  public AnnuityCalculatorInitialBalanceRequest taxRate(Float taxRate) {
    this.taxRate = taxRate;
    return this;
  }

   /**
   * Get taxRate
   * minimum: 0
   * maximum: 1
   * @return taxRate
  **/
  @ApiModelProperty(value = "")
  public Float getTaxRate() {
    return taxRate;
  }

  public void setTaxRate(Float taxRate) {
    this.taxRate = taxRate;
  }

  public AnnuityCalculatorInitialBalanceRequest accountIds(List<UUID> accountIds) {
    this.accountIds = accountIds;
    return this;
  }

  public AnnuityCalculatorInitialBalanceRequest addAccountIdsItem(UUID accountIdsItem) {
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

  public AnnuityCalculatorInitialBalanceRequest annuityAmount(Float annuityAmount) {
    this.annuityAmount = annuityAmount;
    return this;
  }

   /**
   * Get annuityAmount
   * minimum: 0
   * @return annuityAmount
  **/
  @ApiModelProperty(required = true, value = "")
  public Float getAnnuityAmount() {
    return annuityAmount;
  }

  public void setAnnuityAmount(Float annuityAmount) {
    this.annuityAmount = annuityAmount;
  }

  public AnnuityCalculatorInitialBalanceRequest accumulationHorizon(Integer accumulationHorizon) {
    this.accumulationHorizon = accumulationHorizon;
    return this;
  }

   /**
   * Get accumulationHorizon
   * minimum: 0
   * @return accumulationHorizon
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getAccumulationHorizon() {
    return accumulationHorizon;
  }

  public void setAccumulationHorizon(Integer accumulationHorizon) {
    this.accumulationHorizon = accumulationHorizon;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnnuityCalculatorInitialBalanceRequest annuityCalculatorInitialBalanceRequest = (AnnuityCalculatorInitialBalanceRequest) o;
    return Objects.equals(this.inflationRate, annuityCalculatorInitialBalanceRequest.inflationRate) &&
        Objects.equals(this.annuityFrequencyInterval, annuityCalculatorInitialBalanceRequest.annuityFrequencyInterval) &&
        Objects.equals(this.depositSchedule, annuityCalculatorInitialBalanceRequest.depositSchedule) &&
        Objects.equals(this.portfolioReturn, annuityCalculatorInitialBalanceRequest.portfolioReturn) &&
        Objects.equals(this.createLog, annuityCalculatorInitialBalanceRequest.createLog) &&
        Objects.equals(this.aggregationAccountIds, annuityCalculatorInitialBalanceRequest.aggregationAccountIds) &&
        Objects.equals(this.initialBalance, annuityCalculatorInitialBalanceRequest.initialBalance) &&
        Objects.equals(this.decumulationHorizon, annuityCalculatorInitialBalanceRequest.decumulationHorizon) &&
        Objects.equals(this.taxRate, annuityCalculatorInitialBalanceRequest.taxRate) &&
        Objects.equals(this.accountIds, annuityCalculatorInitialBalanceRequest.accountIds) &&
        Objects.equals(this.annuityAmount, annuityCalculatorInitialBalanceRequest.annuityAmount) &&
        Objects.equals(this.accumulationHorizon, annuityCalculatorInitialBalanceRequest.accumulationHorizon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inflationRate, annuityFrequencyInterval, depositSchedule, portfolioReturn, createLog, aggregationAccountIds, initialBalance, decumulationHorizon, taxRate, accountIds, annuityAmount, accumulationHorizon);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnuityCalculatorInitialBalanceRequest {\n");
    
    sb.append("    inflationRate: ").append(toIndentedString(inflationRate)).append("\n");
    sb.append("    annuityFrequencyInterval: ").append(toIndentedString(annuityFrequencyInterval)).append("\n");
    sb.append("    depositSchedule: ").append(toIndentedString(depositSchedule)).append("\n");
    sb.append("    portfolioReturn: ").append(toIndentedString(portfolioReturn)).append("\n");
    sb.append("    createLog: ").append(toIndentedString(createLog)).append("\n");
    sb.append("    aggregationAccountIds: ").append(toIndentedString(aggregationAccountIds)).append("\n");
    sb.append("    initialBalance: ").append(toIndentedString(initialBalance)).append("\n");
    sb.append("    decumulationHorizon: ").append(toIndentedString(decumulationHorizon)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    accountIds: ").append(toIndentedString(accountIds)).append("\n");
    sb.append("    annuityAmount: ").append(toIndentedString(annuityAmount)).append("\n");
    sb.append("    accumulationHorizon: ").append(toIndentedString(accumulationHorizon)).append("\n");
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

