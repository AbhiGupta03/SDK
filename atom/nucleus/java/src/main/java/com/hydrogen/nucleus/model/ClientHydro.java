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

import java.util.Map;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * ClientHydro Object
 */
@ApiModel(description = "ClientHydro Object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-12T11:03:26.704Z")



public class ClientHydro {
  @SerializedName("client_id")
  private UUID clientId = null;

  @SerializedName("create_date")
  private OffsetDateTime createDate = null;

  @SerializedName("hydro_id")
  private String hydroId = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("is_client_raindrop_enabled")
  private Boolean isClientRaindropEnabled = null;

  @SerializedName("is_client_raindrop_linked")
  private Boolean isClientRaindropLinked = null;

  @SerializedName("is_hydro_id_verified")
  private Boolean isHydroIdVerified = null;

  @SerializedName("metadata")
  private Map<String, String> metadata = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("update_date")
  private OffsetDateTime updateDate = null;

  public ClientHydro clientId(UUID clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * clientId
   * @return clientId
  **/
  @ApiModelProperty(example = "2035f52d-2c5b-4e07-8904-cb037bad7aff", required = true, value = "clientId")
  public UUID getClientId() {
    return clientId;
  }

  public void setClientId(UUID clientId) {
    this.clientId = clientId;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @ApiModelProperty(example = "2018-06-28T18:17:23.579+0000", value = "")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public ClientHydro hydroId(String hydroId) {
    this.hydroId = hydroId;
    return this;
  }

   /**
   * hydroId
   * @return hydroId
  **/
  @ApiModelProperty(example = "10lm4nz", required = true, value = "hydroId")
  public String getHydroId() {
    return hydroId;
  }

  public void setHydroId(String hydroId) {
    this.hydroId = hydroId;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "000183ac-2288-4564-a76b-119f4694be98", value = "")
  public UUID getId() {
    return id;
  }

  public ClientHydro isClientRaindropEnabled(Boolean isClientRaindropEnabled) {
    this.isClientRaindropEnabled = isClientRaindropEnabled;
    return this;
  }

   /**
   * Get isClientRaindropEnabled
   * @return isClientRaindropEnabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsClientRaindropEnabled() {
    return isClientRaindropEnabled;
  }

  public void setIsClientRaindropEnabled(Boolean isClientRaindropEnabled) {
    this.isClientRaindropEnabled = isClientRaindropEnabled;
  }

  public ClientHydro isClientRaindropLinked(Boolean isClientRaindropLinked) {
    this.isClientRaindropLinked = isClientRaindropLinked;
    return this;
  }

   /**
   * Get isClientRaindropLinked
   * @return isClientRaindropLinked
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsClientRaindropLinked() {
    return isClientRaindropLinked;
  }

  public void setIsClientRaindropLinked(Boolean isClientRaindropLinked) {
    this.isClientRaindropLinked = isClientRaindropLinked;
  }

  public ClientHydro isHydroIdVerified(Boolean isHydroIdVerified) {
    this.isHydroIdVerified = isHydroIdVerified;
    return this;
  }

   /**
   * isHydroIdVerified
   * @return isHydroIdVerified
  **/
  @ApiModelProperty(example = "false", value = "isHydroIdVerified")
  public Boolean isIsHydroIdVerified() {
    return isHydroIdVerified;
  }

  public void setIsHydroIdVerified(Boolean isHydroIdVerified) {
    this.isHydroIdVerified = isHydroIdVerified;
  }

   /**
   * metadata
   * @return metadata
  **/
  @ApiModelProperty(example = "{}", value = "metadata")
  public Map<String, String> getMetadata() {
    return metadata;
  }

   /**
   * Get secondaryId
   * @return secondaryId
  **/
  @ApiModelProperty(example = "7289243787238", value = "")
  public String getSecondaryId() {
    return secondaryId;
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
    ClientHydro clientHydro = (ClientHydro) o;
    return Objects.equals(this.clientId, clientHydro.clientId) &&
        Objects.equals(this.createDate, clientHydro.createDate) &&
        Objects.equals(this.hydroId, clientHydro.hydroId) &&
        Objects.equals(this.id, clientHydro.id) &&
        Objects.equals(this.isClientRaindropEnabled, clientHydro.isClientRaindropEnabled) &&
        Objects.equals(this.isClientRaindropLinked, clientHydro.isClientRaindropLinked) &&
        Objects.equals(this.isHydroIdVerified, clientHydro.isHydroIdVerified) &&
        Objects.equals(this.metadata, clientHydro.metadata) &&
        Objects.equals(this.secondaryId, clientHydro.secondaryId) &&
        Objects.equals(this.updateDate, clientHydro.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, createDate, hydroId, id, isClientRaindropEnabled, isClientRaindropLinked, isHydroIdVerified, metadata, secondaryId, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientHydro {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    hydroId: ").append(toIndentedString(hydroId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isClientRaindropEnabled: ").append(toIndentedString(isClientRaindropEnabled)).append("\n");
    sb.append("    isClientRaindropLinked: ").append(toIndentedString(isClientRaindropLinked)).append("\n");
    sb.append("    isHydroIdVerified: ").append(toIndentedString(isHydroIdVerified)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
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

