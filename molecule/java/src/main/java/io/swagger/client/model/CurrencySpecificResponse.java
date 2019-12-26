/*
 * Hydrogen Molecule API
 * The Hydrogen Molecule API
 *
 * OpenAPI spec version: 1.0.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;

/**
 * CurrencySpecificResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-18T13:48:07.846-05:00")
public class CurrencySpecificResponse {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("decimal_points")
  private Integer decimalPoints = null;

  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("logo")
  private String logo = null;

  @SerializedName("network")
  private String network = null;

  @SerializedName("create_date")
  private String createDate = null;

  @SerializedName("update_date")
  private String updateDate = null;

  public CurrencySpecificResponse id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the currency
   * @return id
  **/
  @ApiModelProperty(value = "The id of the currency")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public CurrencySpecificResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the currency
   * @return name
  **/
  @ApiModelProperty(value = "The name of the currency")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CurrencySpecificResponse decimalPoints(Integer decimalPoints) {
    this.decimalPoints = decimalPoints;
    return this;
  }

   /**
   * Decimal points of the currency
   * @return decimalPoints
  **/
  @ApiModelProperty(value = "Decimal points of the currency")
  public Integer getDecimalPoints() {
    return decimalPoints;
  }

  public void setDecimalPoints(Integer decimalPoints) {
    this.decimalPoints = decimalPoints;
  }

  public CurrencySpecificResponse symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Symbol of the currency
   * @return symbol
  **/
  @ApiModelProperty(value = "Symbol of the currency")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public CurrencySpecificResponse address(String address) {
    this.address = address;
    return this;
  }

   /**
   * The blockchain contract address of the currency
   * @return address
  **/
  @ApiModelProperty(value = "The blockchain contract address of the currency")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public CurrencySpecificResponse logo(String logo) {
    this.logo = logo;
    return this;
  }

   /**
   * The url for the currency logo
   * @return logo
  **/
  @ApiModelProperty(value = "The url for the currency logo")
  public String getLogo() {
    return logo;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }

  public CurrencySpecificResponse network(String network) {
    this.network = network;
    return this;
  }

   /**
   * The network the currency is available on. Can be mainnet, ropsten etc.
   * @return network
  **/
  @ApiModelProperty(value = "The network the currency is available on. Can be mainnet, ropsten etc.")
  public String getNetwork() {
    return network;
  }

  public void setNetwork(String network) {
    this.network = network;
  }

  public CurrencySpecificResponse createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Datetime the currency record was created
   * @return createDate
  **/
  @ApiModelProperty(value = "Datetime the currency record was created")
  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }

  public CurrencySpecificResponse updateDate(String updateDate) {
    this.updateDate = updateDate;
    return this;
  }

   /**
   * Datetime the currency record was updated
   * @return updateDate
  **/
  @ApiModelProperty(value = "Datetime the currency record was updated")
  public String getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(String updateDate) {
    this.updateDate = updateDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrencySpecificResponse currencySpecificResponse = (CurrencySpecificResponse) o;
    return Objects.equals(this.id, currencySpecificResponse.id) &&
        Objects.equals(this.name, currencySpecificResponse.name) &&
        Objects.equals(this.decimalPoints, currencySpecificResponse.decimalPoints) &&
        Objects.equals(this.symbol, currencySpecificResponse.symbol) &&
        Objects.equals(this.address, currencySpecificResponse.address) &&
        Objects.equals(this.logo, currencySpecificResponse.logo) &&
        Objects.equals(this.network, currencySpecificResponse.network) &&
        Objects.equals(this.createDate, currencySpecificResponse.createDate) &&
        Objects.equals(this.updateDate, currencySpecificResponse.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, decimalPoints, symbol, address, logo, network, createDate, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencySpecificResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    decimalPoints: ").append(toIndentedString(decimalPoints)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
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

