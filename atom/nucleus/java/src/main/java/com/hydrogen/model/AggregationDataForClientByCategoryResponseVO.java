/*
 * Hydrogen Atom API
 * The Hydrogen Atom API
 *
 * OpenAPI spec version: 1.7.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * AggregationDataForClientByCategoryResponseVO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-04T05:11:20.520Z")
public class AggregationDataForClientByCategoryResponseVO {
  @SerializedName("aggregation_account_details")
  private List<AggregateDataByCategoryForClientFromDbVO> aggregationAccountDetails = null;

  @SerializedName("category")
  private String category = null;

  @SerializedName("total_available_balance")
  private Double totalAvailableBalance = null;

  @SerializedName("total_balance")
  private Double totalBalance = null;

  public AggregationDataForClientByCategoryResponseVO aggregationAccountDetails(List<AggregateDataByCategoryForClientFromDbVO> aggregationAccountDetails) {
    this.aggregationAccountDetails = aggregationAccountDetails;
    return this;
  }

  public AggregationDataForClientByCategoryResponseVO addAggregationAccountDetailsItem(AggregateDataByCategoryForClientFromDbVO aggregationAccountDetailsItem) {
    if (this.aggregationAccountDetails == null) {
      this.aggregationAccountDetails = new ArrayList<AggregateDataByCategoryForClientFromDbVO>();
    }
    this.aggregationAccountDetails.add(aggregationAccountDetailsItem);
    return this;
  }

   /**
   * Get aggregationAccountDetails
   * @return aggregationAccountDetails
  **/
  @ApiModelProperty(value = "")
  public List<AggregateDataByCategoryForClientFromDbVO> getAggregationAccountDetails() {
    return aggregationAccountDetails;
  }

  public void setAggregationAccountDetails(List<AggregateDataByCategoryForClientFromDbVO> aggregationAccountDetails) {
    this.aggregationAccountDetails = aggregationAccountDetails;
  }

  public AggregationDataForClientByCategoryResponseVO category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(value = "")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public AggregationDataForClientByCategoryResponseVO totalAvailableBalance(Double totalAvailableBalance) {
    this.totalAvailableBalance = totalAvailableBalance;
    return this;
  }

   /**
   * Get totalAvailableBalance
   * @return totalAvailableBalance
  **/
  @ApiModelProperty(value = "")
  public Double getTotalAvailableBalance() {
    return totalAvailableBalance;
  }

  public void setTotalAvailableBalance(Double totalAvailableBalance) {
    this.totalAvailableBalance = totalAvailableBalance;
  }

  public AggregationDataForClientByCategoryResponseVO totalBalance(Double totalBalance) {
    this.totalBalance = totalBalance;
    return this;
  }

   /**
   * Get totalBalance
   * @return totalBalance
  **/
  @ApiModelProperty(value = "")
  public Double getTotalBalance() {
    return totalBalance;
  }

  public void setTotalBalance(Double totalBalance) {
    this.totalBalance = totalBalance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregationDataForClientByCategoryResponseVO aggregationDataForClientByCategoryResponseVO = (AggregationDataForClientByCategoryResponseVO) o;
    return Objects.equals(this.aggregationAccountDetails, aggregationDataForClientByCategoryResponseVO.aggregationAccountDetails) &&
        Objects.equals(this.category, aggregationDataForClientByCategoryResponseVO.category) &&
        Objects.equals(this.totalAvailableBalance, aggregationDataForClientByCategoryResponseVO.totalAvailableBalance) &&
        Objects.equals(this.totalBalance, aggregationDataForClientByCategoryResponseVO.totalBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregationAccountDetails, category, totalAvailableBalance, totalBalance);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregationDataForClientByCategoryResponseVO {\n");
    
    sb.append("    aggregationAccountDetails: ").append(toIndentedString(aggregationAccountDetails)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    totalAvailableBalance: ").append(toIndentedString(totalAvailableBalance)).append("\n");
    sb.append("    totalBalance: ").append(toIndentedString(totalBalance)).append("\n");
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
