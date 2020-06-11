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
import java.math.BigDecimal;

/**
 * AccumulationGoalDepositConfig
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-29T05:03:35.524Z")
public class AccumulationGoalDepositConfig {
  @SerializedName("dep_inflation")
  private Float depInflation = 0.0f;

  @SerializedName("dep_amount")
  private BigDecimal depAmount = null;

  /**
   * Gets or Sets depFrequency
   */
  @JsonAdapter(DepFrequencyEnum.Adapter.class)
  public enum DepFrequencyEnum {
    YEAR("year"),
    
    SIX_MONTHS("six_months"),
    
    QUARTER("quarter"),
    
    MONTH("month"),
    
    TWO_WEEKS("two_weeks"),
    
    WEEK("week"),
    
    DAY("day");

    private String value;

    DepFrequencyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DepFrequencyEnum fromValue(String text) {
      for (DepFrequencyEnum b : DepFrequencyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DepFrequencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DepFrequencyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DepFrequencyEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DepFrequencyEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("dep_frequency")
  private DepFrequencyEnum depFrequency = DepFrequencyEnum.YEAR;

  /**
   * Gets or Sets depStartReference
   */
  @JsonAdapter(DepStartReferenceEnum.Adapter.class)
  public enum DepStartReferenceEnum {
    START("a_start"),
    
    END("a_end");

    private String value;

    DepStartReferenceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DepStartReferenceEnum fromValue(String text) {
      for (DepStartReferenceEnum b : DepStartReferenceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DepStartReferenceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DepStartReferenceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DepStartReferenceEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DepStartReferenceEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("dep_start_reference")
  private DepStartReferenceEnum depStartReference = DepStartReferenceEnum.START;

  @SerializedName("dep_end_period")
  private Integer depEndPeriod = 0;

  @SerializedName("dep_start_period")
  private Integer depStartPeriod = 0;

  /**
   * Gets or Sets depEndReference
   */
  @JsonAdapter(DepEndReferenceEnum.Adapter.class)
  public enum DepEndReferenceEnum {
    START("a_start"),
    
    END("a_end");

    private String value;

    DepEndReferenceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DepEndReferenceEnum fromValue(String text) {
      for (DepEndReferenceEnum b : DepEndReferenceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DepEndReferenceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DepEndReferenceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DepEndReferenceEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DepEndReferenceEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("dep_end_reference")
  private DepEndReferenceEnum depEndReference = DepEndReferenceEnum.END;

  public AccumulationGoalDepositConfig depInflation(Float depInflation) {
    this.depInflation = depInflation;
    return this;
  }

   /**
   * Get depInflation
   * minimum: -1
   * @return depInflation
  **/
  @ApiModelProperty(value = "")
  public Float getDepInflation() {
    return depInflation;
  }

  public void setDepInflation(Float depInflation) {
    this.depInflation = depInflation;
  }

  public AccumulationGoalDepositConfig depAmount(BigDecimal depAmount) {
    this.depAmount = depAmount;
    return this;
  }

   /**
   * Get depAmount
   * minimum: 0
   * @return depAmount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getDepAmount() {
    return depAmount;
  }

  public void setDepAmount(BigDecimal depAmount) {
    this.depAmount = depAmount;
  }

  public AccumulationGoalDepositConfig depFrequency(DepFrequencyEnum depFrequency) {
    this.depFrequency = depFrequency;
    return this;
  }

   /**
   * Get depFrequency
   * @return depFrequency
  **/
  @ApiModelProperty(value = "")
  public DepFrequencyEnum getDepFrequency() {
    return depFrequency;
  }

  public void setDepFrequency(DepFrequencyEnum depFrequency) {
    this.depFrequency = depFrequency;
  }

  public AccumulationGoalDepositConfig depStartReference(DepStartReferenceEnum depStartReference) {
    this.depStartReference = depStartReference;
    return this;
  }

   /**
   * Get depStartReference
   * @return depStartReference
  **/
  @ApiModelProperty(value = "")
  public DepStartReferenceEnum getDepStartReference() {
    return depStartReference;
  }

  public void setDepStartReference(DepStartReferenceEnum depStartReference) {
    this.depStartReference = depStartReference;
  }

  public AccumulationGoalDepositConfig depEndPeriod(Integer depEndPeriod) {
    this.depEndPeriod = depEndPeriod;
    return this;
  }

   /**
   * Get depEndPeriod
   * @return depEndPeriod
  **/
  @ApiModelProperty(value = "")
  public Integer getDepEndPeriod() {
    return depEndPeriod;
  }

  public void setDepEndPeriod(Integer depEndPeriod) {
    this.depEndPeriod = depEndPeriod;
  }

  public AccumulationGoalDepositConfig depStartPeriod(Integer depStartPeriod) {
    this.depStartPeriod = depStartPeriod;
    return this;
  }

   /**
   * Get depStartPeriod
   * @return depStartPeriod
  **/
  @ApiModelProperty(value = "")
  public Integer getDepStartPeriod() {
    return depStartPeriod;
  }

  public void setDepStartPeriod(Integer depStartPeriod) {
    this.depStartPeriod = depStartPeriod;
  }

  public AccumulationGoalDepositConfig depEndReference(DepEndReferenceEnum depEndReference) {
    this.depEndReference = depEndReference;
    return this;
  }

   /**
   * Get depEndReference
   * @return depEndReference
  **/
  @ApiModelProperty(value = "")
  public DepEndReferenceEnum getDepEndReference() {
    return depEndReference;
  }

  public void setDepEndReference(DepEndReferenceEnum depEndReference) {
    this.depEndReference = depEndReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccumulationGoalDepositConfig accumulationGoalDepositConfig = (AccumulationGoalDepositConfig) o;
    return Objects.equals(this.depInflation, accumulationGoalDepositConfig.depInflation) &&
        Objects.equals(this.depAmount, accumulationGoalDepositConfig.depAmount) &&
        Objects.equals(this.depFrequency, accumulationGoalDepositConfig.depFrequency) &&
        Objects.equals(this.depStartReference, accumulationGoalDepositConfig.depStartReference) &&
        Objects.equals(this.depEndPeriod, accumulationGoalDepositConfig.depEndPeriod) &&
        Objects.equals(this.depStartPeriod, accumulationGoalDepositConfig.depStartPeriod) &&
        Objects.equals(this.depEndReference, accumulationGoalDepositConfig.depEndReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depInflation, depAmount, depFrequency, depStartReference, depEndPeriod, depStartPeriod, depEndReference);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccumulationGoalDepositConfig {\n");
    
    sb.append("    depInflation: ").append(toIndentedString(depInflation)).append("\n");
    sb.append("    depAmount: ").append(toIndentedString(depAmount)).append("\n");
    sb.append("    depFrequency: ").append(toIndentedString(depFrequency)).append("\n");
    sb.append("    depStartReference: ").append(toIndentedString(depStartReference)).append("\n");
    sb.append("    depEndPeriod: ").append(toIndentedString(depEndPeriod)).append("\n");
    sb.append("    depStartPeriod: ").append(toIndentedString(depStartPeriod)).append("\n");
    sb.append("    depEndReference: ").append(toIndentedString(depEndReference)).append("\n");
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
