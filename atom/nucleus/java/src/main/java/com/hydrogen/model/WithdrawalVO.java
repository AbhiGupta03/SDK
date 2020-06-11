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

import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * WithdrawalVO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-04T05:11:20.520Z")
public class WithdrawalVO {
  @SerializedName("withdrawal_amount")
  private Double withdrawalAmount = null;

  @SerializedName("withdrawal_date")
  private OffsetDateTime withdrawalDate = null;

  @SerializedName("withdrawal_direction")
  private String withdrawalDirection = null;

  @SerializedName("withdrawal_id")
  private UUID withdrawalId = null;

  public WithdrawalVO withdrawalAmount(Double withdrawalAmount) {
    this.withdrawalAmount = withdrawalAmount;
    return this;
  }

   /**
   * Get withdrawalAmount
   * @return withdrawalAmount
  **/
  @ApiModelProperty(value = "")
  public Double getWithdrawalAmount() {
    return withdrawalAmount;
  }

  public void setWithdrawalAmount(Double withdrawalAmount) {
    this.withdrawalAmount = withdrawalAmount;
  }

  public WithdrawalVO withdrawalDate(OffsetDateTime withdrawalDate) {
    this.withdrawalDate = withdrawalDate;
    return this;
  }

   /**
   * Get withdrawalDate
   * @return withdrawalDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getWithdrawalDate() {
    return withdrawalDate;
  }

  public void setWithdrawalDate(OffsetDateTime withdrawalDate) {
    this.withdrawalDate = withdrawalDate;
  }

  public WithdrawalVO withdrawalDirection(String withdrawalDirection) {
    this.withdrawalDirection = withdrawalDirection;
    return this;
  }

   /**
   * Get withdrawalDirection
   * @return withdrawalDirection
  **/
  @ApiModelProperty(value = "")
  public String getWithdrawalDirection() {
    return withdrawalDirection;
  }

  public void setWithdrawalDirection(String withdrawalDirection) {
    this.withdrawalDirection = withdrawalDirection;
  }

  public WithdrawalVO withdrawalId(UUID withdrawalId) {
    this.withdrawalId = withdrawalId;
    return this;
  }

   /**
   * Get withdrawalId
   * @return withdrawalId
  **/
  @ApiModelProperty(value = "")
  public UUID getWithdrawalId() {
    return withdrawalId;
  }

  public void setWithdrawalId(UUID withdrawalId) {
    this.withdrawalId = withdrawalId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WithdrawalVO withdrawalVO = (WithdrawalVO) o;
    return Objects.equals(this.withdrawalAmount, withdrawalVO.withdrawalAmount) &&
        Objects.equals(this.withdrawalDate, withdrawalVO.withdrawalDate) &&
        Objects.equals(this.withdrawalDirection, withdrawalVO.withdrawalDirection) &&
        Objects.equals(this.withdrawalId, withdrawalVO.withdrawalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(withdrawalAmount, withdrawalDate, withdrawalDirection, withdrawalId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WithdrawalVO {\n");
    
    sb.append("    withdrawalAmount: ").append(toIndentedString(withdrawalAmount)).append("\n");
    sb.append("    withdrawalDate: ").append(toIndentedString(withdrawalDate)).append("\n");
    sb.append("    withdrawalDirection: ").append(toIndentedString(withdrawalDirection)).append("\n");
    sb.append("    withdrawalId: ").append(toIndentedString(withdrawalId)).append("\n");
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
