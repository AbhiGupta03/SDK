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

import java.util.UUID;

/**
 * GoalAccountMapping Object
 */
@ApiModel(description = "GoalAccountMapping Object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-12T11:03:26.704Z")



public class GoalAccountMapping {
  @SerializedName("accumulation_horizon")
  private Double accumulationHorizon = null;

  @SerializedName("decumulation_horizon")
  private Double decumulationHorizon = null;

  @SerializedName("goal_amount")
  private Double goalAmount = null;

  @SerializedName("goal_id")
  private UUID goalId = null;

  public GoalAccountMapping accumulationHorizon(Double accumulationHorizon) {
    this.accumulationHorizon = accumulationHorizon;
    return this;
  }

   /**
   * accumulationHorizon
   * @return accumulationHorizon
  **/
  @ApiModelProperty(example = "15.0", value = "accumulationHorizon")
  public Double getAccumulationHorizon() {
    return accumulationHorizon;
  }

  public void setAccumulationHorizon(Double accumulationHorizon) {
    this.accumulationHorizon = accumulationHorizon;
  }

  public GoalAccountMapping decumulationHorizon(Double decumulationHorizon) {
    this.decumulationHorizon = decumulationHorizon;
    return this;
  }

   /**
   * decumulationHorizon
   * @return decumulationHorizon
  **/
  @ApiModelProperty(example = "15.0", value = "decumulationHorizon")
  public Double getDecumulationHorizon() {
    return decumulationHorizon;
  }

  public void setDecumulationHorizon(Double decumulationHorizon) {
    this.decumulationHorizon = decumulationHorizon;
  }

  public GoalAccountMapping goalAmount(Double goalAmount) {
    this.goalAmount = goalAmount;
    return this;
  }

   /**
   * goalAmount
   * @return goalAmount
  **/
  @ApiModelProperty(example = "100000.0", value = "goalAmount")
  public Double getGoalAmount() {
    return goalAmount;
  }

  public void setGoalAmount(Double goalAmount) {
    this.goalAmount = goalAmount;
  }

  public GoalAccountMapping goalId(UUID goalId) {
    this.goalId = goalId;
    return this;
  }

   /**
   * goalId
   * @return goalId
  **/
  @ApiModelProperty(example = "9a1c0a9f-c699-46a2-9710-8b2abe10526c", required = true, value = "goalId")
  public UUID getGoalId() {
    return goalId;
  }

  public void setGoalId(UUID goalId) {
    this.goalId = goalId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoalAccountMapping goalAccountMapping = (GoalAccountMapping) o;
    return Objects.equals(this.accumulationHorizon, goalAccountMapping.accumulationHorizon) &&
        Objects.equals(this.decumulationHorizon, goalAccountMapping.decumulationHorizon) &&
        Objects.equals(this.goalAmount, goalAccountMapping.goalAmount) &&
        Objects.equals(this.goalId, goalAccountMapping.goalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accumulationHorizon, decumulationHorizon, goalAmount, goalId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoalAccountMapping {\n");
    
    sb.append("    accumulationHorizon: ").append(toIndentedString(accumulationHorizon)).append("\n");
    sb.append("    decumulationHorizon: ").append(toIndentedString(decumulationHorizon)).append("\n");
    sb.append("    goalAmount: ").append(toIndentedString(goalAmount)).append("\n");
    sb.append("    goalId: ").append(toIndentedString(goalId)).append("\n");
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

