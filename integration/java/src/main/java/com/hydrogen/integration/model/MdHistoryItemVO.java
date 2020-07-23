/*
 * Hydrogen Integration API
 * The Hydrogen Integration API
 *
 * OpenAPI spec version: 1.2.1
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.integration.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * MdHistoryItemVO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-11T07:03:53.789Z")
public class MdHistoryItemVO {
  @SerializedName("adjusted_price")
  private Double adjustedPrice = null;

  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("date")
  private OffsetDateTime date = null;

  @SerializedName("nucleus_security_id")
  private UUID nucleusSecurityId = null;

  @SerializedName("price")
  private Double price = null;

  @SerializedName("security_price_id")
  private UUID securityPriceId = null;

  @SerializedName("ticker")
  private String ticker = null;

  public MdHistoryItemVO adjustedPrice(Double adjustedPrice) {
    this.adjustedPrice = adjustedPrice;
    return this;
  }

   /**
   * Get adjustedPrice
   * @return adjustedPrice
  **/
  @ApiModelProperty(value = "")
  public Double getAdjustedPrice() {
    return adjustedPrice;
  }

  public void setAdjustedPrice(Double adjustedPrice) {
    this.adjustedPrice = adjustedPrice;
  }

  public MdHistoryItemVO currencyCode(String currencyCode) {
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

  public MdHistoryItemVO date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public MdHistoryItemVO nucleusSecurityId(UUID nucleusSecurityId) {
    this.nucleusSecurityId = nucleusSecurityId;
    return this;
  }

   /**
   * Get nucleusSecurityId
   * @return nucleusSecurityId
  **/
  @ApiModelProperty(value = "")
  public UUID getNucleusSecurityId() {
    return nucleusSecurityId;
  }

  public void setNucleusSecurityId(UUID nucleusSecurityId) {
    this.nucleusSecurityId = nucleusSecurityId;
  }

  public MdHistoryItemVO price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public MdHistoryItemVO securityPriceId(UUID securityPriceId) {
    this.securityPriceId = securityPriceId;
    return this;
  }

   /**
   * Get securityPriceId
   * @return securityPriceId
  **/
  @ApiModelProperty(value = "")
  public UUID getSecurityPriceId() {
    return securityPriceId;
  }

  public void setSecurityPriceId(UUID securityPriceId) {
    this.securityPriceId = securityPriceId;
  }

  public MdHistoryItemVO ticker(String ticker) {
    this.ticker = ticker;
    return this;
  }

   /**
   * Get ticker
   * @return ticker
  **/
  @ApiModelProperty(value = "")
  public String getTicker() {
    return ticker;
  }

  public void setTicker(String ticker) {
    this.ticker = ticker;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MdHistoryItemVO mdHistoryItemVO = (MdHistoryItemVO) o;
    return Objects.equals(this.adjustedPrice, mdHistoryItemVO.adjustedPrice) &&
        Objects.equals(this.currencyCode, mdHistoryItemVO.currencyCode) &&
        Objects.equals(this.date, mdHistoryItemVO.date) &&
        Objects.equals(this.nucleusSecurityId, mdHistoryItemVO.nucleusSecurityId) &&
        Objects.equals(this.price, mdHistoryItemVO.price) &&
        Objects.equals(this.securityPriceId, mdHistoryItemVO.securityPriceId) &&
        Objects.equals(this.ticker, mdHistoryItemVO.ticker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adjustedPrice, currencyCode, date, nucleusSecurityId, price, securityPriceId, ticker);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MdHistoryItemVO {\n");
    
    sb.append("    adjustedPrice: ").append(toIndentedString(adjustedPrice)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    nucleusSecurityId: ").append(toIndentedString(nucleusSecurityId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    securityPriceId: ").append(toIndentedString(securityPriceId)).append("\n");
    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
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
