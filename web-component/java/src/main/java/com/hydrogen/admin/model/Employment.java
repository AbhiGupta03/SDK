/*
 * Hydrogen Admin API
 * The Hydrogen Admin API
 *
 * OpenAPI spec version: 1.0.2
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */



package com.hydrogen.admin.model;

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

/**
 * Employment Object
 */
@ApiModel(description = "Employment Object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-04T04:58:31.048Z")
public class Employment {
  @SerializedName("employer")
  private String employer = null;

  @SerializedName("employment_status")
  private String employmentStatus = null;

  @SerializedName("job_title")
  private String jobTitle = null;

  @SerializedName("occupation")
  private String occupation = null;

  public Employment employer(String employer) {
    this.employer = employer;
    return this;
  }

   /**
   * employer
   * @return employer
  **/
  @ApiModelProperty(example = "xyz", value = "employer")
  public String getEmployer() {
    return employer;
  }

  public void setEmployer(String employer) {
    this.employer = employer;
  }

  public Employment employmentStatus(String employmentStatus) {
    this.employmentStatus = employmentStatus;
    return this;
  }

   /**
   * employmentStatus
   * @return employmentStatus
  **/
  @ApiModelProperty(example = "student", value = "employmentStatus")
  public String getEmploymentStatus() {
    return employmentStatus;
  }

  public void setEmploymentStatus(String employmentStatus) {
    this.employmentStatus = employmentStatus;
  }

  public Employment jobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

   /**
   * jobTitle
   * @return jobTitle
  **/
  @ApiModelProperty(example = "xyz", value = "jobTitle")
  public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  public Employment occupation(String occupation) {
    this.occupation = occupation;
    return this;
  }

   /**
   * occupation
   * @return occupation
  **/
  @ApiModelProperty(example = "xyz", value = "occupation")
  public String getOccupation() {
    return occupation;
  }

  public void setOccupation(String occupation) {
    this.occupation = occupation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Employment employment = (Employment) o;
    return Objects.equals(this.employer, employment.employer) &&
        Objects.equals(this.employmentStatus, employment.employmentStatus) &&
        Objects.equals(this.jobTitle, employment.jobTitle) &&
        Objects.equals(this.occupation, employment.occupation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employer, employmentStatus, jobTitle, occupation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Employment {\n");
    
    sb.append("    employer: ").append(toIndentedString(employer)).append("\n");
    sb.append("    employmentStatus: ").append(toIndentedString(employmentStatus)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    occupation: ").append(toIndentedString(occupation)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
