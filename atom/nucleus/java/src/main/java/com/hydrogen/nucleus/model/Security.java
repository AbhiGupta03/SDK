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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * Security
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-12T11:03:26.704Z")



public class Security {
  @SerializedName("asset_class")
  private String assetClass = null;

  @SerializedName("brokers")
  private List<Brokers> brokers = null;

  @SerializedName("category")
  private String category = null;

  @SerializedName("create_date")
  private OffsetDateTime createDate = null;

  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("cusip")
  private String cusip = null;

  @SerializedName("exchange")
  private String exchange = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("industry")
  private String industry = null;

  @SerializedName("is_active")
  private Boolean isActive = null;

  @SerializedName("isin")
  private String isin = null;

  @SerializedName("metadata")
  private Map<String, String> metadata = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("proxy_id")
  private UUID proxyId = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("sector")
  private String sector = null;

  @SerializedName("security_class")
  private String securityClass = null;

  @SerializedName("security_composition")
  private List<SecuritiesComposition> securityComposition = null;

  @SerializedName("security_country")
  private List<SecuritiesCountry> securityCountry = null;

  @SerializedName("ticker")
  private String ticker = null;

  @SerializedName("total_expense_ratio")
  private Float totalExpenseRatio = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("update_date")
  private OffsetDateTime updateDate = null;

  public Security assetClass(String assetClass) {
    this.assetClass = assetClass;
    return this;
  }

   /**
   * Security asset class
   * @return assetClass
  **/
  @ApiModelProperty(example = "US Equity", value = "Security asset class")
  public String getAssetClass() {
    return assetClass;
  }

  public void setAssetClass(String assetClass) {
    this.assetClass = assetClass;
  }

  public Security brokers(List<Brokers> brokers) {
    this.brokers = brokers;
    return this;
  }

  public Security addBrokersItem(Brokers brokersItem) {
    if (this.brokers == null) {
      this.brokers = new ArrayList<Brokers>();
    }
    this.brokers.add(brokersItem);
    return this;
  }

   /**
   * brokers
   * @return brokers
  **/
  @ApiModelProperty(example = "[]", value = "brokers")
  public List<Brokers> getBrokers() {
    return brokers;
  }

  public void setBrokers(List<Brokers> brokers) {
    this.brokers = brokers;
  }

  public Security category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Security category
   * @return category
  **/
  @ApiModelProperty(example = "sample", value = "Security category")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @ApiModelProperty(example = "2018-06-28T18:17:23.579+0000", value = "")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public Security currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * currency_code
   * @return currencyCode
  **/
  @ApiModelProperty(example = "USD", value = "currency_code")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public Security cusip(String cusip) {
    this.cusip = cusip;
    return this;
  }

   /**
   * cusip
   * @return cusip
  **/
  @ApiModelProperty(example = "xyz", value = "cusip")
  public String getCusip() {
    return cusip;
  }

  public void setCusip(String cusip) {
    this.cusip = cusip;
  }

  public Security exchange(String exchange) {
    this.exchange = exchange;
    return this;
  }

   /**
   * Security exchange
   * @return exchange
  **/
  @ApiModelProperty(example = "sample", value = "Security exchange")
  public String getExchange() {
    return exchange;
  }

  public void setExchange(String exchange) {
    this.exchange = exchange;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "000183ac-2288-4564-a76b-119f4694be98", value = "")
  public UUID getId() {
    return id;
  }

  public Security industry(String industry) {
    this.industry = industry;
    return this;
  }

   /**
   * Security industry
   * @return industry
  **/
  @ApiModelProperty(example = "Heavy Construction", value = "Security industry")
  public String getIndustry() {
    return industry;
  }

  public void setIndustry(String industry) {
    this.industry = industry;
  }

  public Security isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Security is active
   * @return isActive
  **/
  @ApiModelProperty(example = "true", value = "Security is active")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public Security isin(String isin) {
    this.isin = isin;
    return this;
  }

   /**
   * isin
   * @return isin
  **/
  @ApiModelProperty(example = "xyz", value = "isin")
  public String getIsin() {
    return isin;
  }

  public void setIsin(String isin) {
    this.isin = isin;
  }

   /**
   * metadata
   * @return metadata
  **/
  @ApiModelProperty(example = "{}", value = "metadata")
  public Map<String, String> getMetadata() {
    return metadata;
  }

  public Security name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Security name
   * @return name
  **/
  @ApiModelProperty(example = "XYZ Holdings Limite", required = true, value = "Security name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Security proxyId(UUID proxyId) {
    this.proxyId = proxyId;
    return this;
  }

   /**
   * proxy_id
   * @return proxyId
  **/
  @ApiModelProperty(example = "000183ac-2288-4564-a76b-119f4694be98", value = "proxy_id")
  public UUID getProxyId() {
    return proxyId;
  }

  public void setProxyId(UUID proxyId) {
    this.proxyId = proxyId;
  }

   /**
   * Get secondaryId
   * @return secondaryId
  **/
  @ApiModelProperty(example = "7289243787238", value = "")
  public String getSecondaryId() {
    return secondaryId;
  }

  public Security sector(String sector) {
    this.sector = sector;
    return this;
  }

   /**
   * Security sector
   * @return sector
  **/
  @ApiModelProperty(example = "Industrial Goods", value = "Security sector")
  public String getSector() {
    return sector;
  }

  public void setSector(String sector) {
    this.sector = sector;
  }

  public Security securityClass(String securityClass) {
    this.securityClass = securityClass;
    return this;
  }

   /**
   * Security class
   * @return securityClass
  **/
  @ApiModelProperty(example = "Mutual Fund", value = "Security class")
  public String getSecurityClass() {
    return securityClass;
  }

  public void setSecurityClass(String securityClass) {
    this.securityClass = securityClass;
  }

  public Security securityComposition(List<SecuritiesComposition> securityComposition) {
    this.securityComposition = securityComposition;
    return this;
  }

  public Security addSecurityCompositionItem(SecuritiesComposition securityCompositionItem) {
    if (this.securityComposition == null) {
      this.securityComposition = new ArrayList<SecuritiesComposition>();
    }
    this.securityComposition.add(securityCompositionItem);
    return this;
  }

   /**
   * Get securityComposition
   * @return securityComposition
  **/
  @ApiModelProperty(value = "")
  public List<SecuritiesComposition> getSecurityComposition() {
    return securityComposition;
  }

  public void setSecurityComposition(List<SecuritiesComposition> securityComposition) {
    this.securityComposition = securityComposition;
  }

  public Security securityCountry(List<SecuritiesCountry> securityCountry) {
    this.securityCountry = securityCountry;
    return this;
  }

  public Security addSecurityCountryItem(SecuritiesCountry securityCountryItem) {
    if (this.securityCountry == null) {
      this.securityCountry = new ArrayList<SecuritiesCountry>();
    }
    this.securityCountry.add(securityCountryItem);
    return this;
  }

   /**
   * Get securityCountry
   * @return securityCountry
  **/
  @ApiModelProperty(value = "")
  public List<SecuritiesCountry> getSecurityCountry() {
    return securityCountry;
  }

  public void setSecurityCountry(List<SecuritiesCountry> securityCountry) {
    this.securityCountry = securityCountry;
  }

  public Security ticker(String ticker) {
    this.ticker = ticker;
    return this;
  }

   /**
   * Security ticker
   * @return ticker
  **/
  @ApiModelProperty(example = "JEITX", required = true, value = "Security ticker")
  public String getTicker() {
    return ticker;
  }

  public void setTicker(String ticker) {
    this.ticker = ticker;
  }

  public Security totalExpenseRatio(Float totalExpenseRatio) {
    this.totalExpenseRatio = totalExpenseRatio;
    return this;
  }

   /**
   * total_expense_ratio
   * @return totalExpenseRatio
  **/
  @ApiModelProperty(example = "10.0", value = "total_expense_ratio")
  public Float getTotalExpenseRatio() {
    return totalExpenseRatio;
  }

  public void setTotalExpenseRatio(Float totalExpenseRatio) {
    this.totalExpenseRatio = totalExpenseRatio;
  }

  public Security type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Security type
   * @return type
  **/
  @ApiModelProperty(example = "risky", value = "Security type")
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
    Security security = (Security) o;
    return Objects.equals(this.assetClass, security.assetClass) &&
        Objects.equals(this.brokers, security.brokers) &&
        Objects.equals(this.category, security.category) &&
        Objects.equals(this.createDate, security.createDate) &&
        Objects.equals(this.currencyCode, security.currencyCode) &&
        Objects.equals(this.cusip, security.cusip) &&
        Objects.equals(this.exchange, security.exchange) &&
        Objects.equals(this.id, security.id) &&
        Objects.equals(this.industry, security.industry) &&
        Objects.equals(this.isActive, security.isActive) &&
        Objects.equals(this.isin, security.isin) &&
        Objects.equals(this.metadata, security.metadata) &&
        Objects.equals(this.name, security.name) &&
        Objects.equals(this.proxyId, security.proxyId) &&
        Objects.equals(this.secondaryId, security.secondaryId) &&
        Objects.equals(this.sector, security.sector) &&
        Objects.equals(this.securityClass, security.securityClass) &&
        Objects.equals(this.securityComposition, security.securityComposition) &&
        Objects.equals(this.securityCountry, security.securityCountry) &&
        Objects.equals(this.ticker, security.ticker) &&
        Objects.equals(this.totalExpenseRatio, security.totalExpenseRatio) &&
        Objects.equals(this.type, security.type) &&
        Objects.equals(this.updateDate, security.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetClass, brokers, category, createDate, currencyCode, cusip, exchange, id, industry, isActive, isin, metadata, name, proxyId, secondaryId, sector, securityClass, securityComposition, securityCountry, ticker, totalExpenseRatio, type, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Security {\n");
    
    sb.append("    assetClass: ").append(toIndentedString(assetClass)).append("\n");
    sb.append("    brokers: ").append(toIndentedString(brokers)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    cusip: ").append(toIndentedString(cusip)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isin: ").append(toIndentedString(isin)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    proxyId: ").append(toIndentedString(proxyId)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
    sb.append("    sector: ").append(toIndentedString(sector)).append("\n");
    sb.append("    securityClass: ").append(toIndentedString(securityClass)).append("\n");
    sb.append("    securityComposition: ").append(toIndentedString(securityComposition)).append("\n");
    sb.append("    securityCountry: ").append(toIndentedString(securityCountry)).append("\n");
    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
    sb.append("    totalExpenseRatio: ").append(toIndentedString(totalExpenseRatio)).append("\n");
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

