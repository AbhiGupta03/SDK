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

/**
 * CalculatorDepositSchedule
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-08T03:59:30.964Z")



public class CalculatorDepositSchedule {
  @SerializedName("adjust_deposit_for_inflation")
  private Boolean adjustDepositForInflation = true;

  /**
   * Gets or Sets depositFrequencyInterval
   */
  @JsonAdapter(DepositFrequencyIntervalEnum.Adapter.class)
  public enum DepositFrequencyIntervalEnum {
    YEAR("year"),
    
    MONTH("month"),
    
    QUARTER("quarter"),
    
    WEEK("week"),
    
    DAY("day");

    private String value;

    DepositFrequencyIntervalEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DepositFrequencyIntervalEnum fromValue(String text) {
      for (DepositFrequencyIntervalEnum b : DepositFrequencyIntervalEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DepositFrequencyIntervalEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DepositFrequencyIntervalEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DepositFrequencyIntervalEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DepositFrequencyIntervalEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("deposit_frequency_interval")
  private DepositFrequencyIntervalEnum depositFrequencyInterval = DepositFrequencyIntervalEnum.YEAR;

  public CalculatorDepositSchedule adjustDepositForInflation(Boolean adjustDepositForInflation) {
    this.adjustDepositForInflation = adjustDepositForInflation;
    return this;
  }

   /**
   * Get adjustDepositForInflation
   * @return adjustDepositForInflation
  **/
  @ApiModelProperty(value = "")
  public Boolean isAdjustDepositForInflation() {
    return adjustDepositForInflation;
  }

  public void setAdjustDepositForInflation(Boolean adjustDepositForInflation) {
    this.adjustDepositForInflation = adjustDepositForInflation;
  }

  public CalculatorDepositSchedule depositFrequencyInterval(DepositFrequencyIntervalEnum depositFrequencyInterval) {
    this.depositFrequencyInterval = depositFrequencyInterval;
    return this;
  }

   /**
   * Get depositFrequencyInterval
   * @return depositFrequencyInterval
  **/
  @ApiModelProperty(value = "")
  public DepositFrequencyIntervalEnum getDepositFrequencyInterval() {
    return depositFrequencyInterval;
  }

  public void setDepositFrequencyInterval(DepositFrequencyIntervalEnum depositFrequencyInterval) {
    this.depositFrequencyInterval = depositFrequencyInterval;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalculatorDepositSchedule calculatorDepositSchedule = (CalculatorDepositSchedule) o;
    return Objects.equals(this.adjustDepositForInflation, calculatorDepositSchedule.adjustDepositForInflation) &&
        Objects.equals(this.depositFrequencyInterval, calculatorDepositSchedule.depositFrequencyInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adjustDepositForInflation, depositFrequencyInterval);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalculatorDepositSchedule {\n");
    
    sb.append("    adjustDepositForInflation: ").append(toIndentedString(adjustDepositForInflation)).append("\n");
    sb.append("    depositFrequencyInterval: ").append(toIndentedString(depositFrequencyInterval)).append("\n");
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

