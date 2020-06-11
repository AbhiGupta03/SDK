/*
 * Hydrogen Proton API
 * Financial engineering module of Hydrogen Atom
 *
 * OpenAPI spec version: 1.7.18
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.model;

import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * EmergencyFundCalculatorRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-29T05:03:35.524Z")
public class EmergencyFundCalculatorRequest {
  @SerializedName("telecom_payments")
  private Float telecomPayments = 0.0f;

  /**
   * Gets or Sets frequencyUnit
   */
  @JsonAdapter(FrequencyUnitEnum.Adapter.class)
  public enum FrequencyUnitEnum {
    YEAR("year"),
    
    SIX_MONTHS("six_months"),
    
    QUARTER("quarter"),
    
    MONTH("month"),
    
    TWO_WEEKS("two_weeks"),
    
    WEEK("week");

    private String value;

    FrequencyUnitEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FrequencyUnitEnum fromValue(String text) {
      for (FrequencyUnitEnum b : FrequencyUnitEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FrequencyUnitEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FrequencyUnitEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FrequencyUnitEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FrequencyUnitEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("frequency_unit")
  private FrequencyUnitEnum frequencyUnit = FrequencyUnitEnum.MONTH;

  @SerializedName("debt_payments")
  private Float debtPayments = 0.0f;

  @SerializedName("lookback_periods")
  private Integer lookbackPeriods = 3;

  @SerializedName("emergency_fund_duration")
  private Integer emergencyFundDuration = null;

  @SerializedName("housing_cost")
  private Float housingCost = 0.0f;

  @SerializedName("insurance_payments")
  private Float insurancePayments = 0.0f;

  @SerializedName("interest_rate")
  private Float interestRate = 0.0f;

  @SerializedName("other_expenses")
  private Object otherExpenses = null;

  @SerializedName("client_id")
  private UUID clientId = null;

  @SerializedName("current_emergency_fund_balance")
  private Float currentEmergencyFundBalance = 0.0f;

  @SerializedName("aggregation_account_ids")
  private List<UUID> aggregationAccountIds = null;

  @SerializedName("account_ids")
  private List<UUID> accountIds = null;

  @SerializedName("utility_payments")
  private Float utilityPayments = 0.0f;

  @SerializedName("savings_horizon")
  private List<Integer> savingsHorizon = null;

  @SerializedName("food_costs")
  private Float foodCosts = 0.0f;

  @SerializedName("transportation_costs")
  private Float transportationCosts = 0.0f;

  public EmergencyFundCalculatorRequest telecomPayments(Float telecomPayments) {
    this.telecomPayments = telecomPayments;
    return this;
  }

   /**
   * Get telecomPayments
   * minimum: 0
   * @return telecomPayments
  **/
  @ApiModelProperty(value = "")
  public Float getTelecomPayments() {
    return telecomPayments;
  }

  public void setTelecomPayments(Float telecomPayments) {
    this.telecomPayments = telecomPayments;
  }

  public EmergencyFundCalculatorRequest frequencyUnit(FrequencyUnitEnum frequencyUnit) {
    this.frequencyUnit = frequencyUnit;
    return this;
  }

   /**
   * Get frequencyUnit
   * @return frequencyUnit
  **/
  @ApiModelProperty(value = "")
  public FrequencyUnitEnum getFrequencyUnit() {
    return frequencyUnit;
  }

  public void setFrequencyUnit(FrequencyUnitEnum frequencyUnit) {
    this.frequencyUnit = frequencyUnit;
  }

  public EmergencyFundCalculatorRequest debtPayments(Float debtPayments) {
    this.debtPayments = debtPayments;
    return this;
  }

   /**
   * Get debtPayments
   * minimum: 0
   * @return debtPayments
  **/
  @ApiModelProperty(value = "")
  public Float getDebtPayments() {
    return debtPayments;
  }

  public void setDebtPayments(Float debtPayments) {
    this.debtPayments = debtPayments;
  }

  public EmergencyFundCalculatorRequest lookbackPeriods(Integer lookbackPeriods) {
    this.lookbackPeriods = lookbackPeriods;
    return this;
  }

   /**
   * Get lookbackPeriods
   * minimum: 1
   * @return lookbackPeriods
  **/
  @ApiModelProperty(value = "")
  public Integer getLookbackPeriods() {
    return lookbackPeriods;
  }

  public void setLookbackPeriods(Integer lookbackPeriods) {
    this.lookbackPeriods = lookbackPeriods;
  }

  public EmergencyFundCalculatorRequest emergencyFundDuration(Integer emergencyFundDuration) {
    this.emergencyFundDuration = emergencyFundDuration;
    return this;
  }

   /**
   * Get emergencyFundDuration
   * minimum: 1
   * @return emergencyFundDuration
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getEmergencyFundDuration() {
    return emergencyFundDuration;
  }

  public void setEmergencyFundDuration(Integer emergencyFundDuration) {
    this.emergencyFundDuration = emergencyFundDuration;
  }

  public EmergencyFundCalculatorRequest housingCost(Float housingCost) {
    this.housingCost = housingCost;
    return this;
  }

   /**
   * Get housingCost
   * minimum: 0
   * @return housingCost
  **/
  @ApiModelProperty(value = "")
  public Float getHousingCost() {
    return housingCost;
  }

  public void setHousingCost(Float housingCost) {
    this.housingCost = housingCost;
  }

  public EmergencyFundCalculatorRequest insurancePayments(Float insurancePayments) {
    this.insurancePayments = insurancePayments;
    return this;
  }

   /**
   * Get insurancePayments
   * minimum: 0
   * @return insurancePayments
  **/
  @ApiModelProperty(value = "")
  public Float getInsurancePayments() {
    return insurancePayments;
  }

  public void setInsurancePayments(Float insurancePayments) {
    this.insurancePayments = insurancePayments;
  }

  public EmergencyFundCalculatorRequest interestRate(Float interestRate) {
    this.interestRate = interestRate;
    return this;
  }

   /**
   * Get interestRate
   * minimum: -1
   * @return interestRate
  **/
  @ApiModelProperty(value = "")
  public Float getInterestRate() {
    return interestRate;
  }

  public void setInterestRate(Float interestRate) {
    this.interestRate = interestRate;
  }

  public EmergencyFundCalculatorRequest otherExpenses(Object otherExpenses) {
    this.otherExpenses = otherExpenses;
    return this;
  }

   /**
   * Get otherExpenses
   * @return otherExpenses
  **/
  @ApiModelProperty(value = "")
  public Object getOtherExpenses() {
    return otherExpenses;
  }

  public void setOtherExpenses(Object otherExpenses) {
    this.otherExpenses = otherExpenses;
  }

  public EmergencyFundCalculatorRequest clientId(UUID clientId) {
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

  public EmergencyFundCalculatorRequest currentEmergencyFundBalance(Float currentEmergencyFundBalance) {
    this.currentEmergencyFundBalance = currentEmergencyFundBalance;
    return this;
  }

   /**
   * Get currentEmergencyFundBalance
   * minimum: 0
   * @return currentEmergencyFundBalance
  **/
  @ApiModelProperty(value = "")
  public Float getCurrentEmergencyFundBalance() {
    return currentEmergencyFundBalance;
  }

  public void setCurrentEmergencyFundBalance(Float currentEmergencyFundBalance) {
    this.currentEmergencyFundBalance = currentEmergencyFundBalance;
  }

  public EmergencyFundCalculatorRequest aggregationAccountIds(List<UUID> aggregationAccountIds) {
    this.aggregationAccountIds = aggregationAccountIds;
    return this;
  }

  public EmergencyFundCalculatorRequest addAggregationAccountIdsItem(UUID aggregationAccountIdsItem) {
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

  public EmergencyFundCalculatorRequest accountIds(List<UUID> accountIds) {
    this.accountIds = accountIds;
    return this;
  }

  public EmergencyFundCalculatorRequest addAccountIdsItem(UUID accountIdsItem) {
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

  public EmergencyFundCalculatorRequest utilityPayments(Float utilityPayments) {
    this.utilityPayments = utilityPayments;
    return this;
  }

   /**
   * Get utilityPayments
   * minimum: 0
   * @return utilityPayments
  **/
  @ApiModelProperty(value = "")
  public Float getUtilityPayments() {
    return utilityPayments;
  }

  public void setUtilityPayments(Float utilityPayments) {
    this.utilityPayments = utilityPayments;
  }

  public EmergencyFundCalculatorRequest savingsHorizon(List<Integer> savingsHorizon) {
    this.savingsHorizon = savingsHorizon;
    return this;
  }

  public EmergencyFundCalculatorRequest addSavingsHorizonItem(Integer savingsHorizonItem) {
    if (this.savingsHorizon == null) {
      this.savingsHorizon = new ArrayList<Integer>();
    }
    this.savingsHorizon.add(savingsHorizonItem);
    return this;
  }

   /**
   * Get savingsHorizon
   * @return savingsHorizon
  **/
  @ApiModelProperty(value = "")
  public List<Integer> getSavingsHorizon() {
    return savingsHorizon;
  }

  public void setSavingsHorizon(List<Integer> savingsHorizon) {
    this.savingsHorizon = savingsHorizon;
  }

  public EmergencyFundCalculatorRequest foodCosts(Float foodCosts) {
    this.foodCosts = foodCosts;
    return this;
  }

   /**
   * Get foodCosts
   * minimum: 0
   * @return foodCosts
  **/
  @ApiModelProperty(value = "")
  public Float getFoodCosts() {
    return foodCosts;
  }

  public void setFoodCosts(Float foodCosts) {
    this.foodCosts = foodCosts;
  }

  public EmergencyFundCalculatorRequest transportationCosts(Float transportationCosts) {
    this.transportationCosts = transportationCosts;
    return this;
  }

   /**
   * Get transportationCosts
   * minimum: 0
   * @return transportationCosts
  **/
  @ApiModelProperty(value = "")
  public Float getTransportationCosts() {
    return transportationCosts;
  }

  public void setTransportationCosts(Float transportationCosts) {
    this.transportationCosts = transportationCosts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmergencyFundCalculatorRequest emergencyFundCalculatorRequest = (EmergencyFundCalculatorRequest) o;
    return Objects.equals(this.telecomPayments, emergencyFundCalculatorRequest.telecomPayments) &&
        Objects.equals(this.frequencyUnit, emergencyFundCalculatorRequest.frequencyUnit) &&
        Objects.equals(this.debtPayments, emergencyFundCalculatorRequest.debtPayments) &&
        Objects.equals(this.lookbackPeriods, emergencyFundCalculatorRequest.lookbackPeriods) &&
        Objects.equals(this.emergencyFundDuration, emergencyFundCalculatorRequest.emergencyFundDuration) &&
        Objects.equals(this.housingCost, emergencyFundCalculatorRequest.housingCost) &&
        Objects.equals(this.insurancePayments, emergencyFundCalculatorRequest.insurancePayments) &&
        Objects.equals(this.interestRate, emergencyFundCalculatorRequest.interestRate) &&
        Objects.equals(this.otherExpenses, emergencyFundCalculatorRequest.otherExpenses) &&
        Objects.equals(this.clientId, emergencyFundCalculatorRequest.clientId) &&
        Objects.equals(this.currentEmergencyFundBalance, emergencyFundCalculatorRequest.currentEmergencyFundBalance) &&
        Objects.equals(this.aggregationAccountIds, emergencyFundCalculatorRequest.aggregationAccountIds) &&
        Objects.equals(this.accountIds, emergencyFundCalculatorRequest.accountIds) &&
        Objects.equals(this.utilityPayments, emergencyFundCalculatorRequest.utilityPayments) &&
        Objects.equals(this.savingsHorizon, emergencyFundCalculatorRequest.savingsHorizon) &&
        Objects.equals(this.foodCosts, emergencyFundCalculatorRequest.foodCosts) &&
        Objects.equals(this.transportationCosts, emergencyFundCalculatorRequest.transportationCosts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(telecomPayments, frequencyUnit, debtPayments, lookbackPeriods, emergencyFundDuration, housingCost, insurancePayments, interestRate, otherExpenses, clientId, currentEmergencyFundBalance, aggregationAccountIds, accountIds, utilityPayments, savingsHorizon, foodCosts, transportationCosts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmergencyFundCalculatorRequest {\n");
    
    sb.append("    telecomPayments: ").append(toIndentedString(telecomPayments)).append("\n");
    sb.append("    frequencyUnit: ").append(toIndentedString(frequencyUnit)).append("\n");
    sb.append("    debtPayments: ").append(toIndentedString(debtPayments)).append("\n");
    sb.append("    lookbackPeriods: ").append(toIndentedString(lookbackPeriods)).append("\n");
    sb.append("    emergencyFundDuration: ").append(toIndentedString(emergencyFundDuration)).append("\n");
    sb.append("    housingCost: ").append(toIndentedString(housingCost)).append("\n");
    sb.append("    insurancePayments: ").append(toIndentedString(insurancePayments)).append("\n");
    sb.append("    interestRate: ").append(toIndentedString(interestRate)).append("\n");
    sb.append("    otherExpenses: ").append(toIndentedString(otherExpenses)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    currentEmergencyFundBalance: ").append(toIndentedString(currentEmergencyFundBalance)).append("\n");
    sb.append("    aggregationAccountIds: ").append(toIndentedString(aggregationAccountIds)).append("\n");
    sb.append("    accountIds: ").append(toIndentedString(accountIds)).append("\n");
    sb.append("    utilityPayments: ").append(toIndentedString(utilityPayments)).append("\n");
    sb.append("    savingsHorizon: ").append(toIndentedString(savingsHorizon)).append("\n");
    sb.append("    foodCosts: ").append(toIndentedString(foodCosts)).append("\n");
    sb.append("    transportationCosts: ").append(toIndentedString(transportationCosts)).append("\n");
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
