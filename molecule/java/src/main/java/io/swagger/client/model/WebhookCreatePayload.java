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
import java.util.ArrayList;
import java.util.List;

/**
 * WebhookCreatePayload
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-18T13:48:07.846-05:00")
public class WebhookCreatePayload {
  @SerializedName("molecule_service")
  private List<String> moleculeService = new ArrayList<String>();

  @SerializedName("url")
  private String url = null;

  @SerializedName("is_active")
  private Boolean isActive = null;

  public WebhookCreatePayload moleculeService(List<String> moleculeService) {
    this.moleculeService = moleculeService;
    return this;
  }

  public WebhookCreatePayload addMoleculeServiceItem(String moleculeServiceItem) {
    this.moleculeService.add(moleculeServiceItem);
    return this;
  }

   /**
   * The array of molecule services for a webhook to notify.
   * @return moleculeService
  **/
  @ApiModelProperty(required = true, value = "The array of molecule services for a webhook to notify.")
  public List<String> getMoleculeService() {
    return moleculeService;
  }

  public void setMoleculeService(List<String> moleculeService) {
    this.moleculeService = moleculeService;
  }

  public WebhookCreatePayload url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The url you want to receive the payloads to.
   * @return url
  **/
  @ApiModelProperty(required = true, value = "The url you want to receive the payloads to.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public WebhookCreatePayload isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Indicates if this webhook is active.
   * @return isActive
  **/
  @ApiModelProperty(value = "Indicates if this webhook is active.")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookCreatePayload webhookCreatePayload = (WebhookCreatePayload) o;
    return Objects.equals(this.moleculeService, webhookCreatePayload.moleculeService) &&
        Objects.equals(this.url, webhookCreatePayload.url) &&
        Objects.equals(this.isActive, webhookCreatePayload.isActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(moleculeService, url, isActive);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookCreatePayload {\n");
    
    sb.append("    moleculeService: ").append(toIndentedString(moleculeService)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
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

