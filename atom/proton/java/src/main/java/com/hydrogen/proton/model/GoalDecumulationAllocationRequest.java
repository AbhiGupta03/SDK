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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * GoalDecumulationAllocationRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-08T03:59:30.964Z")



public class GoalDecumulationAllocationRequest {
  @SerializedName("goal_id")
  private UUID goalId = null;

  /**
   * Gets or Sets allocationMethod
   */
  @JsonAdapter(AllocationMethodEnum.Adapter.class)
  public enum AllocationMethodEnum {
    SELECT("select"),
    
    CREATE("create");

    private String value;

    AllocationMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AllocationMethodEnum fromValue(String text) {
      for (AllocationMethodEnum b : AllocationMethodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AllocationMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AllocationMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AllocationMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AllocationMethodEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("allocation_method")
  private AllocationMethodEnum allocationMethod = null;

  @SerializedName("curr_inv")
  private BigDecimal currInv = null;

  @SerializedName("risk_score")
  private BigDecimal riskScore = null;

  @SerializedName("d_horizon")
  private Integer dHorizon = null;

  @SerializedName("n")
  private Integer n = 1000;

  /**
   * Gets or Sets allocationPriority
   */
  @JsonAdapter(AllocationPriorityEnum.Adapter.class)
  public enum AllocationPriorityEnum {
    GOAL("goal"),
    
    RISK("risk");

    private String value;

    AllocationPriorityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AllocationPriorityEnum fromValue(String text) {
      for (AllocationPriorityEnum b : AllocationPriorityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AllocationPriorityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AllocationPriorityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AllocationPriorityEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AllocationPriorityEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("allocation_priority")
  private AllocationPriorityEnum allocationPriority = null;

  /**
   * Gets or Sets horizonFrequency
   */
  @JsonAdapter(HorizonFrequencyEnum.Adapter.class)
  public enum HorizonFrequencyEnum {
    YEAR("year"),
    
    SIX_MONTHS("six_months"),
    
    QUARTER("quarter"),
    
    MONTH("month"),
    
    TWO_WEEKS("two_weeks"),
    
    WEEK("week"),
    
    DAY("day");

    private String value;

    HorizonFrequencyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static HorizonFrequencyEnum fromValue(String text) {
      for (HorizonFrequencyEnum b : HorizonFrequencyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<HorizonFrequencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HorizonFrequencyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HorizonFrequencyEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return HorizonFrequencyEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("horizon_frequency")
  private HorizonFrequencyEnum horizonFrequency = HorizonFrequencyEnum.YEAR;

  @SerializedName("allocations")
  private List<UUID> allocations = null;

  @SerializedName("client_id")
  private UUID clientId = null;

  @SerializedName("remove_outliers")
  private Boolean removeOutliers = true;

  @SerializedName("withdrawal_config")
  private List<GoalWithdrawalConfig> withdrawalConfig = null;

  @SerializedName("a_horizon")
  private Integer aHorizon = null;

  @SerializedName("use_proxy_data")
  private Boolean useProxyData = false;

  @SerializedName("conf_tgt")
  private Float confTgt = 0.9f;

  /**
   * Gets or Sets threshType
   */
  @JsonAdapter(ThreshTypeEnum.Adapter.class)
  public enum ThreshTypeEnum {
    AMNT("amnt"),
    
    PERC("perc");

    private String value;

    ThreshTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ThreshTypeEnum fromValue(String text) {
      for (ThreshTypeEnum b : ThreshTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ThreshTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ThreshTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ThreshTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ThreshTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("thresh_type")
  private ThreshTypeEnum threshType = ThreshTypeEnum.PERC;

  @SerializedName("thresh")
  private BigDecimal thresh = null;

  @SerializedName("deposit_config")
  private List<DecumulationGoalDepositConfig> depositConfig = null;

  /**
   * Gets or Sets marketDataSource
   */
  @JsonAdapter(MarketDataSourceEnum.Adapter.class)
  public enum MarketDataSourceEnum {
    NUCLEUS("nucleus"),
    
    INTEGRATION("integration");

    private String value;

    MarketDataSourceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MarketDataSourceEnum fromValue(String text) {
      for (MarketDataSourceEnum b : MarketDataSourceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MarketDataSourceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MarketDataSourceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MarketDataSourceEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MarketDataSourceEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("market_data_source")
  private MarketDataSourceEnum marketDataSource = MarketDataSourceEnum.NUCLEUS;

  @SerializedName("recommendation_config")
  private RecommendationConfig recommendationConfig = null;

  @SerializedName("opt_config")
  private OptConfig optConfig = null;

  @SerializedName("withdrawal_tax")
  private Float withdrawalTax = 0.0f;

  @SerializedName("trading_days_per_year")
  private Integer tradingDaysPerYear = 252;

  @SerializedName("compounding_rate")
  private Float compoundingRate = 0.0f;

  @SerializedName("adjust_for_compounding")
  private Boolean adjustForCompounding = false;

  @SerializedName("create_log")
  private Boolean createLog = false;

  /**
   * Gets or Sets recommendType
   */
  @JsonAdapter(RecommendTypeEnum.Adapter.class)
  public enum RecommendTypeEnum {
    RECURRING("recurring"),
    
    ONE_TIME("one-time"),
    
    COMBO("combo"),
    
    HORIZON("horizon");

    private String value;

    RecommendTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RecommendTypeEnum fromValue(String text) {
      for (RecommendTypeEnum b : RecommendTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RecommendTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RecommendTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RecommendTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RecommendTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("recommend_type")
  private RecommendTypeEnum recommendType = RecommendTypeEnum.HORIZON;

  public GoalDecumulationAllocationRequest goalId(UUID goalId) {
    this.goalId = goalId;
    return this;
  }

   /**
   * Get goalId
   * @return goalId
  **/
  @ApiModelProperty(value = "")
  public UUID getGoalId() {
    return goalId;
  }

  public void setGoalId(UUID goalId) {
    this.goalId = goalId;
  }

  public GoalDecumulationAllocationRequest allocationMethod(AllocationMethodEnum allocationMethod) {
    this.allocationMethod = allocationMethod;
    return this;
  }

   /**
   * Get allocationMethod
   * @return allocationMethod
  **/
  @ApiModelProperty(required = true, value = "")
  public AllocationMethodEnum getAllocationMethod() {
    return allocationMethod;
  }

  public void setAllocationMethod(AllocationMethodEnum allocationMethod) {
    this.allocationMethod = allocationMethod;
  }

  public GoalDecumulationAllocationRequest currInv(BigDecimal currInv) {
    this.currInv = currInv;
    return this;
  }

   /**
   * Get currInv
   * minimum: 0
   * @return currInv
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getCurrInv() {
    return currInv;
  }

  public void setCurrInv(BigDecimal currInv) {
    this.currInv = currInv;
  }

  public GoalDecumulationAllocationRequest riskScore(BigDecimal riskScore) {
    this.riskScore = riskScore;
    return this;
  }

   /**
   * Get riskScore
   * minimum: 0
   * maximum: 100
   * @return riskScore
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getRiskScore() {
    return riskScore;
  }

  public void setRiskScore(BigDecimal riskScore) {
    this.riskScore = riskScore;
  }

  public GoalDecumulationAllocationRequest dHorizon(Integer dHorizon) {
    this.dHorizon = dHorizon;
    return this;
  }

   /**
   * Get dHorizon
   * minimum: 0
   * maximum: 350
   * @return dHorizon
  **/
  @ApiModelProperty(value = "")
  public Integer getDHorizon() {
    return dHorizon;
  }

  public void setDHorizon(Integer dHorizon) {
    this.dHorizon = dHorizon;
  }

  public GoalDecumulationAllocationRequest n(Integer n) {
    this.n = n;
    return this;
  }

   /**
   * Get n
   * minimum: 1
   * maximum: 10000
   * @return n
  **/
  @ApiModelProperty(value = "")
  public Integer getN() {
    return n;
  }

  public void setN(Integer n) {
    this.n = n;
  }

  public GoalDecumulationAllocationRequest allocationPriority(AllocationPriorityEnum allocationPriority) {
    this.allocationPriority = allocationPriority;
    return this;
  }

   /**
   * Get allocationPriority
   * @return allocationPriority
  **/
  @ApiModelProperty(required = true, value = "")
  public AllocationPriorityEnum getAllocationPriority() {
    return allocationPriority;
  }

  public void setAllocationPriority(AllocationPriorityEnum allocationPriority) {
    this.allocationPriority = allocationPriority;
  }

  public GoalDecumulationAllocationRequest horizonFrequency(HorizonFrequencyEnum horizonFrequency) {
    this.horizonFrequency = horizonFrequency;
    return this;
  }

   /**
   * Get horizonFrequency
   * @return horizonFrequency
  **/
  @ApiModelProperty(value = "")
  public HorizonFrequencyEnum getHorizonFrequency() {
    return horizonFrequency;
  }

  public void setHorizonFrequency(HorizonFrequencyEnum horizonFrequency) {
    this.horizonFrequency = horizonFrequency;
  }

  public GoalDecumulationAllocationRequest allocations(List<UUID> allocations) {
    this.allocations = allocations;
    return this;
  }

  public GoalDecumulationAllocationRequest addAllocationsItem(UUID allocationsItem) {
    if (this.allocations == null) {
      this.allocations = new ArrayList<UUID>();
    }
    this.allocations.add(allocationsItem);
    return this;
  }

   /**
   * Get allocations
   * @return allocations
  **/
  @ApiModelProperty(value = "")
  public List<UUID> getAllocations() {
    return allocations;
  }

  public void setAllocations(List<UUID> allocations) {
    this.allocations = allocations;
  }

  public GoalDecumulationAllocationRequest clientId(UUID clientId) {
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

  public GoalDecumulationAllocationRequest removeOutliers(Boolean removeOutliers) {
    this.removeOutliers = removeOutliers;
    return this;
  }

   /**
   * Get removeOutliers
   * @return removeOutliers
  **/
  @ApiModelProperty(value = "")
  public Boolean isRemoveOutliers() {
    return removeOutliers;
  }

  public void setRemoveOutliers(Boolean removeOutliers) {
    this.removeOutliers = removeOutliers;
  }

  public GoalDecumulationAllocationRequest withdrawalConfig(List<GoalWithdrawalConfig> withdrawalConfig) {
    this.withdrawalConfig = withdrawalConfig;
    return this;
  }

  public GoalDecumulationAllocationRequest addWithdrawalConfigItem(GoalWithdrawalConfig withdrawalConfigItem) {
    if (this.withdrawalConfig == null) {
      this.withdrawalConfig = new ArrayList<GoalWithdrawalConfig>();
    }
    this.withdrawalConfig.add(withdrawalConfigItem);
    return this;
  }

   /**
   * Get withdrawalConfig
   * @return withdrawalConfig
  **/
  @ApiModelProperty(value = "")
  public List<GoalWithdrawalConfig> getWithdrawalConfig() {
    return withdrawalConfig;
  }

  public void setWithdrawalConfig(List<GoalWithdrawalConfig> withdrawalConfig) {
    this.withdrawalConfig = withdrawalConfig;
  }

  public GoalDecumulationAllocationRequest aHorizon(Integer aHorizon) {
    this.aHorizon = aHorizon;
    return this;
  }

   /**
   * Get aHorizon
   * minimum: 0
   * maximum: 350
   * @return aHorizon
  **/
  @ApiModelProperty(value = "")
  public Integer getAHorizon() {
    return aHorizon;
  }

  public void setAHorizon(Integer aHorizon) {
    this.aHorizon = aHorizon;
  }

  public GoalDecumulationAllocationRequest useProxyData(Boolean useProxyData) {
    this.useProxyData = useProxyData;
    return this;
  }

   /**
   * Get useProxyData
   * @return useProxyData
  **/
  @ApiModelProperty(value = "")
  public Boolean isUseProxyData() {
    return useProxyData;
  }

  public void setUseProxyData(Boolean useProxyData) {
    this.useProxyData = useProxyData;
  }

  public GoalDecumulationAllocationRequest confTgt(Float confTgt) {
    this.confTgt = confTgt;
    return this;
  }

   /**
   * Get confTgt
   * minimum: 0
   * maximum: 1
   * @return confTgt
  **/
  @ApiModelProperty(value = "")
  public Float getConfTgt() {
    return confTgt;
  }

  public void setConfTgt(Float confTgt) {
    this.confTgt = confTgt;
  }

  public GoalDecumulationAllocationRequest threshType(ThreshTypeEnum threshType) {
    this.threshType = threshType;
    return this;
  }

   /**
   * Get threshType
   * @return threshType
  **/
  @ApiModelProperty(value = "")
  public ThreshTypeEnum getThreshType() {
    return threshType;
  }

  public void setThreshType(ThreshTypeEnum threshType) {
    this.threshType = threshType;
  }

  public GoalDecumulationAllocationRequest thresh(BigDecimal thresh) {
    this.thresh = thresh;
    return this;
  }

   /**
   * Get thresh
   * minimum: 0
   * @return thresh
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getThresh() {
    return thresh;
  }

  public void setThresh(BigDecimal thresh) {
    this.thresh = thresh;
  }

  public GoalDecumulationAllocationRequest depositConfig(List<DecumulationGoalDepositConfig> depositConfig) {
    this.depositConfig = depositConfig;
    return this;
  }

  public GoalDecumulationAllocationRequest addDepositConfigItem(DecumulationGoalDepositConfig depositConfigItem) {
    if (this.depositConfig == null) {
      this.depositConfig = new ArrayList<DecumulationGoalDepositConfig>();
    }
    this.depositConfig.add(depositConfigItem);
    return this;
  }

   /**
   * Get depositConfig
   * @return depositConfig
  **/
  @ApiModelProperty(value = "")
  public List<DecumulationGoalDepositConfig> getDepositConfig() {
    return depositConfig;
  }

  public void setDepositConfig(List<DecumulationGoalDepositConfig> depositConfig) {
    this.depositConfig = depositConfig;
  }

  public GoalDecumulationAllocationRequest marketDataSource(MarketDataSourceEnum marketDataSource) {
    this.marketDataSource = marketDataSource;
    return this;
  }

   /**
   * Get marketDataSource
   * @return marketDataSource
  **/
  @ApiModelProperty(value = "")
  public MarketDataSourceEnum getMarketDataSource() {
    return marketDataSource;
  }

  public void setMarketDataSource(MarketDataSourceEnum marketDataSource) {
    this.marketDataSource = marketDataSource;
  }

  public GoalDecumulationAllocationRequest recommendationConfig(RecommendationConfig recommendationConfig) {
    this.recommendationConfig = recommendationConfig;
    return this;
  }

   /**
   * Get recommendationConfig
   * @return recommendationConfig
  **/
  @ApiModelProperty(value = "")
  public RecommendationConfig getRecommendationConfig() {
    return recommendationConfig;
  }

  public void setRecommendationConfig(RecommendationConfig recommendationConfig) {
    this.recommendationConfig = recommendationConfig;
  }

  public GoalDecumulationAllocationRequest optConfig(OptConfig optConfig) {
    this.optConfig = optConfig;
    return this;
  }

   /**
   * Get optConfig
   * @return optConfig
  **/
  @ApiModelProperty(value = "")
  public OptConfig getOptConfig() {
    return optConfig;
  }

  public void setOptConfig(OptConfig optConfig) {
    this.optConfig = optConfig;
  }

  public GoalDecumulationAllocationRequest withdrawalTax(Float withdrawalTax) {
    this.withdrawalTax = withdrawalTax;
    return this;
  }

   /**
   * Get withdrawalTax
   * minimum: 0
   * maximum: 1
   * @return withdrawalTax
  **/
  @ApiModelProperty(value = "")
  public Float getWithdrawalTax() {
    return withdrawalTax;
  }

  public void setWithdrawalTax(Float withdrawalTax) {
    this.withdrawalTax = withdrawalTax;
  }

  public GoalDecumulationAllocationRequest tradingDaysPerYear(Integer tradingDaysPerYear) {
    this.tradingDaysPerYear = tradingDaysPerYear;
    return this;
  }

   /**
   * Get tradingDaysPerYear
   * minimum: 1
   * maximum: 365
   * @return tradingDaysPerYear
  **/
  @ApiModelProperty(value = "")
  public Integer getTradingDaysPerYear() {
    return tradingDaysPerYear;
  }

  public void setTradingDaysPerYear(Integer tradingDaysPerYear) {
    this.tradingDaysPerYear = tradingDaysPerYear;
  }

  public GoalDecumulationAllocationRequest compoundingRate(Float compoundingRate) {
    this.compoundingRate = compoundingRate;
    return this;
  }

   /**
   * Get compoundingRate
   * minimum: -1
   * @return compoundingRate
  **/
  @ApiModelProperty(value = "")
  public Float getCompoundingRate() {
    return compoundingRate;
  }

  public void setCompoundingRate(Float compoundingRate) {
    this.compoundingRate = compoundingRate;
  }

  public GoalDecumulationAllocationRequest adjustForCompounding(Boolean adjustForCompounding) {
    this.adjustForCompounding = adjustForCompounding;
    return this;
  }

   /**
   * Get adjustForCompounding
   * @return adjustForCompounding
  **/
  @ApiModelProperty(value = "")
  public Boolean isAdjustForCompounding() {
    return adjustForCompounding;
  }

  public void setAdjustForCompounding(Boolean adjustForCompounding) {
    this.adjustForCompounding = adjustForCompounding;
  }

  public GoalDecumulationAllocationRequest createLog(Boolean createLog) {
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

  public GoalDecumulationAllocationRequest recommendType(RecommendTypeEnum recommendType) {
    this.recommendType = recommendType;
    return this;
  }

   /**
   * Get recommendType
   * @return recommendType
  **/
  @ApiModelProperty(value = "")
  public RecommendTypeEnum getRecommendType() {
    return recommendType;
  }

  public void setRecommendType(RecommendTypeEnum recommendType) {
    this.recommendType = recommendType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoalDecumulationAllocationRequest goalDecumulationAllocationRequest = (GoalDecumulationAllocationRequest) o;
    return Objects.equals(this.goalId, goalDecumulationAllocationRequest.goalId) &&
        Objects.equals(this.allocationMethod, goalDecumulationAllocationRequest.allocationMethod) &&
        Objects.equals(this.currInv, goalDecumulationAllocationRequest.currInv) &&
        Objects.equals(this.riskScore, goalDecumulationAllocationRequest.riskScore) &&
        Objects.equals(this.dHorizon, goalDecumulationAllocationRequest.dHorizon) &&
        Objects.equals(this.n, goalDecumulationAllocationRequest.n) &&
        Objects.equals(this.allocationPriority, goalDecumulationAllocationRequest.allocationPriority) &&
        Objects.equals(this.horizonFrequency, goalDecumulationAllocationRequest.horizonFrequency) &&
        Objects.equals(this.allocations, goalDecumulationAllocationRequest.allocations) &&
        Objects.equals(this.clientId, goalDecumulationAllocationRequest.clientId) &&
        Objects.equals(this.removeOutliers, goalDecumulationAllocationRequest.removeOutliers) &&
        Objects.equals(this.withdrawalConfig, goalDecumulationAllocationRequest.withdrawalConfig) &&
        Objects.equals(this.aHorizon, goalDecumulationAllocationRequest.aHorizon) &&
        Objects.equals(this.useProxyData, goalDecumulationAllocationRequest.useProxyData) &&
        Objects.equals(this.confTgt, goalDecumulationAllocationRequest.confTgt) &&
        Objects.equals(this.threshType, goalDecumulationAllocationRequest.threshType) &&
        Objects.equals(this.thresh, goalDecumulationAllocationRequest.thresh) &&
        Objects.equals(this.depositConfig, goalDecumulationAllocationRequest.depositConfig) &&
        Objects.equals(this.marketDataSource, goalDecumulationAllocationRequest.marketDataSource) &&
        Objects.equals(this.recommendationConfig, goalDecumulationAllocationRequest.recommendationConfig) &&
        Objects.equals(this.optConfig, goalDecumulationAllocationRequest.optConfig) &&
        Objects.equals(this.withdrawalTax, goalDecumulationAllocationRequest.withdrawalTax) &&
        Objects.equals(this.tradingDaysPerYear, goalDecumulationAllocationRequest.tradingDaysPerYear) &&
        Objects.equals(this.compoundingRate, goalDecumulationAllocationRequest.compoundingRate) &&
        Objects.equals(this.adjustForCompounding, goalDecumulationAllocationRequest.adjustForCompounding) &&
        Objects.equals(this.createLog, goalDecumulationAllocationRequest.createLog) &&
        Objects.equals(this.recommendType, goalDecumulationAllocationRequest.recommendType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(goalId, allocationMethod, currInv, riskScore, dHorizon, n, allocationPriority, horizonFrequency, allocations, clientId, removeOutliers, withdrawalConfig, aHorizon, useProxyData, confTgt, threshType, thresh, depositConfig, marketDataSource, recommendationConfig, optConfig, withdrawalTax, tradingDaysPerYear, compoundingRate, adjustForCompounding, createLog, recommendType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoalDecumulationAllocationRequest {\n");
    
    sb.append("    goalId: ").append(toIndentedString(goalId)).append("\n");
    sb.append("    allocationMethod: ").append(toIndentedString(allocationMethod)).append("\n");
    sb.append("    currInv: ").append(toIndentedString(currInv)).append("\n");
    sb.append("    riskScore: ").append(toIndentedString(riskScore)).append("\n");
    sb.append("    dHorizon: ").append(toIndentedString(dHorizon)).append("\n");
    sb.append("    n: ").append(toIndentedString(n)).append("\n");
    sb.append("    allocationPriority: ").append(toIndentedString(allocationPriority)).append("\n");
    sb.append("    horizonFrequency: ").append(toIndentedString(horizonFrequency)).append("\n");
    sb.append("    allocations: ").append(toIndentedString(allocations)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    removeOutliers: ").append(toIndentedString(removeOutliers)).append("\n");
    sb.append("    withdrawalConfig: ").append(toIndentedString(withdrawalConfig)).append("\n");
    sb.append("    aHorizon: ").append(toIndentedString(aHorizon)).append("\n");
    sb.append("    useProxyData: ").append(toIndentedString(useProxyData)).append("\n");
    sb.append("    confTgt: ").append(toIndentedString(confTgt)).append("\n");
    sb.append("    threshType: ").append(toIndentedString(threshType)).append("\n");
    sb.append("    thresh: ").append(toIndentedString(thresh)).append("\n");
    sb.append("    depositConfig: ").append(toIndentedString(depositConfig)).append("\n");
    sb.append("    marketDataSource: ").append(toIndentedString(marketDataSource)).append("\n");
    sb.append("    recommendationConfig: ").append(toIndentedString(recommendationConfig)).append("\n");
    sb.append("    optConfig: ").append(toIndentedString(optConfig)).append("\n");
    sb.append("    withdrawalTax: ").append(toIndentedString(withdrawalTax)).append("\n");
    sb.append("    tradingDaysPerYear: ").append(toIndentedString(tradingDaysPerYear)).append("\n");
    sb.append("    compoundingRate: ").append(toIndentedString(compoundingRate)).append("\n");
    sb.append("    adjustForCompounding: ").append(toIndentedString(adjustForCompounding)).append("\n");
    sb.append("    createLog: ").append(toIndentedString(createLog)).append("\n");
    sb.append("    recommendType: ").append(toIndentedString(recommendType)).append("\n");
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

