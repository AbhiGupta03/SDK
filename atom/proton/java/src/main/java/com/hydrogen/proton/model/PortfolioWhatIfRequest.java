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
 * PortfolioWhatIfRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-08T03:59:30.964Z")



public class PortfolioWhatIfRequest {
  @SerializedName("altered_portfolio_weights")
  private List<Float> alteredPortfolioWeights = new ArrayList<Float>();

  @SerializedName("create_log")
  private Boolean createLog = false;

  @SerializedName("aggregation_account_id")
  private UUID aggregationAccountId = null;

  @SerializedName("allocation_id")
  private UUID allocationId = null;

  @SerializedName("model_id")
  private UUID modelId = null;

  @SerializedName("end_date")
  private String endDate = null;

  @SerializedName("current_portfolio_tickers")
  private List<String> currentPortfolioTickers = null;

  @SerializedName("use_proxy_data")
  private Boolean useProxyData = false;

  @SerializedName("altered_portfolio_tickers")
  private List<String> alteredPortfolioTickers = null;

  @SerializedName("start_date")
  private String startDate = null;

  @SerializedName("current_portfolio_weights")
  private List<Float> currentPortfolioWeights = null;

  @SerializedName("account_id")
  private UUID accountId = null;

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

  @SerializedName("portfolio_id")
  private UUID portfolioId = null;

  public PortfolioWhatIfRequest alteredPortfolioWeights(List<Float> alteredPortfolioWeights) {
    this.alteredPortfolioWeights = alteredPortfolioWeights;
    return this;
  }

  public PortfolioWhatIfRequest addAlteredPortfolioWeightsItem(Float alteredPortfolioWeightsItem) {
    this.alteredPortfolioWeights.add(alteredPortfolioWeightsItem);
    return this;
  }

   /**
   * Get alteredPortfolioWeights
   * @return alteredPortfolioWeights
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Float> getAlteredPortfolioWeights() {
    return alteredPortfolioWeights;
  }

  public void setAlteredPortfolioWeights(List<Float> alteredPortfolioWeights) {
    this.alteredPortfolioWeights = alteredPortfolioWeights;
  }

  public PortfolioWhatIfRequest createLog(Boolean createLog) {
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

  public PortfolioWhatIfRequest aggregationAccountId(UUID aggregationAccountId) {
    this.aggregationAccountId = aggregationAccountId;
    return this;
  }

   /**
   * Get aggregationAccountId
   * @return aggregationAccountId
  **/
  @ApiModelProperty(value = "")
  public UUID getAggregationAccountId() {
    return aggregationAccountId;
  }

  public void setAggregationAccountId(UUID aggregationAccountId) {
    this.aggregationAccountId = aggregationAccountId;
  }

  public PortfolioWhatIfRequest allocationId(UUID allocationId) {
    this.allocationId = allocationId;
    return this;
  }

   /**
   * Get allocationId
   * @return allocationId
  **/
  @ApiModelProperty(value = "")
  public UUID getAllocationId() {
    return allocationId;
  }

  public void setAllocationId(UUID allocationId) {
    this.allocationId = allocationId;
  }

  public PortfolioWhatIfRequest modelId(UUID modelId) {
    this.modelId = modelId;
    return this;
  }

   /**
   * Get modelId
   * @return modelId
  **/
  @ApiModelProperty(value = "")
  public UUID getModelId() {
    return modelId;
  }

  public void setModelId(UUID modelId) {
    this.modelId = modelId;
  }

  public PortfolioWhatIfRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @ApiModelProperty(value = "")
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public PortfolioWhatIfRequest currentPortfolioTickers(List<String> currentPortfolioTickers) {
    this.currentPortfolioTickers = currentPortfolioTickers;
    return this;
  }

  public PortfolioWhatIfRequest addCurrentPortfolioTickersItem(String currentPortfolioTickersItem) {
    if (this.currentPortfolioTickers == null) {
      this.currentPortfolioTickers = new ArrayList<String>();
    }
    this.currentPortfolioTickers.add(currentPortfolioTickersItem);
    return this;
  }

   /**
   * Get currentPortfolioTickers
   * @return currentPortfolioTickers
  **/
  @ApiModelProperty(value = "")
  public List<String> getCurrentPortfolioTickers() {
    return currentPortfolioTickers;
  }

  public void setCurrentPortfolioTickers(List<String> currentPortfolioTickers) {
    this.currentPortfolioTickers = currentPortfolioTickers;
  }

  public PortfolioWhatIfRequest useProxyData(Boolean useProxyData) {
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

  public PortfolioWhatIfRequest alteredPortfolioTickers(List<String> alteredPortfolioTickers) {
    this.alteredPortfolioTickers = alteredPortfolioTickers;
    return this;
  }

  public PortfolioWhatIfRequest addAlteredPortfolioTickersItem(String alteredPortfolioTickersItem) {
    if (this.alteredPortfolioTickers == null) {
      this.alteredPortfolioTickers = new ArrayList<String>();
    }
    this.alteredPortfolioTickers.add(alteredPortfolioTickersItem);
    return this;
  }

   /**
   * Get alteredPortfolioTickers
   * @return alteredPortfolioTickers
  **/
  @ApiModelProperty(value = "")
  public List<String> getAlteredPortfolioTickers() {
    return alteredPortfolioTickers;
  }

  public void setAlteredPortfolioTickers(List<String> alteredPortfolioTickers) {
    this.alteredPortfolioTickers = alteredPortfolioTickers;
  }

  public PortfolioWhatIfRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(value = "")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public PortfolioWhatIfRequest currentPortfolioWeights(List<Float> currentPortfolioWeights) {
    this.currentPortfolioWeights = currentPortfolioWeights;
    return this;
  }

  public PortfolioWhatIfRequest addCurrentPortfolioWeightsItem(Float currentPortfolioWeightsItem) {
    if (this.currentPortfolioWeights == null) {
      this.currentPortfolioWeights = new ArrayList<Float>();
    }
    this.currentPortfolioWeights.add(currentPortfolioWeightsItem);
    return this;
  }

   /**
   * Get currentPortfolioWeights
   * @return currentPortfolioWeights
  **/
  @ApiModelProperty(value = "")
  public List<Float> getCurrentPortfolioWeights() {
    return currentPortfolioWeights;
  }

  public void setCurrentPortfolioWeights(List<Float> currentPortfolioWeights) {
    this.currentPortfolioWeights = currentPortfolioWeights;
  }

  public PortfolioWhatIfRequest accountId(UUID accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @ApiModelProperty(value = "")
  public UUID getAccountId() {
    return accountId;
  }

  public void setAccountId(UUID accountId) {
    this.accountId = accountId;
  }

  public PortfolioWhatIfRequest marketDataSource(MarketDataSourceEnum marketDataSource) {
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

  public PortfolioWhatIfRequest portfolioId(UUID portfolioId) {
    this.portfolioId = portfolioId;
    return this;
  }

   /**
   * Get portfolioId
   * @return portfolioId
  **/
  @ApiModelProperty(value = "")
  public UUID getPortfolioId() {
    return portfolioId;
  }

  public void setPortfolioId(UUID portfolioId) {
    this.portfolioId = portfolioId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortfolioWhatIfRequest portfolioWhatIfRequest = (PortfolioWhatIfRequest) o;
    return Objects.equals(this.alteredPortfolioWeights, portfolioWhatIfRequest.alteredPortfolioWeights) &&
        Objects.equals(this.createLog, portfolioWhatIfRequest.createLog) &&
        Objects.equals(this.aggregationAccountId, portfolioWhatIfRequest.aggregationAccountId) &&
        Objects.equals(this.allocationId, portfolioWhatIfRequest.allocationId) &&
        Objects.equals(this.modelId, portfolioWhatIfRequest.modelId) &&
        Objects.equals(this.endDate, portfolioWhatIfRequest.endDate) &&
        Objects.equals(this.currentPortfolioTickers, portfolioWhatIfRequest.currentPortfolioTickers) &&
        Objects.equals(this.useProxyData, portfolioWhatIfRequest.useProxyData) &&
        Objects.equals(this.alteredPortfolioTickers, portfolioWhatIfRequest.alteredPortfolioTickers) &&
        Objects.equals(this.startDate, portfolioWhatIfRequest.startDate) &&
        Objects.equals(this.currentPortfolioWeights, portfolioWhatIfRequest.currentPortfolioWeights) &&
        Objects.equals(this.accountId, portfolioWhatIfRequest.accountId) &&
        Objects.equals(this.marketDataSource, portfolioWhatIfRequest.marketDataSource) &&
        Objects.equals(this.portfolioId, portfolioWhatIfRequest.portfolioId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alteredPortfolioWeights, createLog, aggregationAccountId, allocationId, modelId, endDate, currentPortfolioTickers, useProxyData, alteredPortfolioTickers, startDate, currentPortfolioWeights, accountId, marketDataSource, portfolioId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortfolioWhatIfRequest {\n");
    
    sb.append("    alteredPortfolioWeights: ").append(toIndentedString(alteredPortfolioWeights)).append("\n");
    sb.append("    createLog: ").append(toIndentedString(createLog)).append("\n");
    sb.append("    aggregationAccountId: ").append(toIndentedString(aggregationAccountId)).append("\n");
    sb.append("    allocationId: ").append(toIndentedString(allocationId)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    currentPortfolioTickers: ").append(toIndentedString(currentPortfolioTickers)).append("\n");
    sb.append("    useProxyData: ").append(toIndentedString(useProxyData)).append("\n");
    sb.append("    alteredPortfolioTickers: ").append(toIndentedString(alteredPortfolioTickers)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    currentPortfolioWeights: ").append(toIndentedString(currentPortfolioWeights)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    marketDataSource: ").append(toIndentedString(marketDataSource)).append("\n");
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
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

