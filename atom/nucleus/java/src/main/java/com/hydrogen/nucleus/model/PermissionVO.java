/*
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.4
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.nucleus.model;

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
 * PermissionVO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-24T10:39:20.203Z")
public class PermissionVO {
  @SerializedName("client_id")
  private UUID clientId = null;

  /**
   * permissionType
   */
  @JsonAdapter(PermissionTypeEnum.Adapter.class)
  public enum PermissionTypeEnum {
    INQUIRY_ACCESS("INQUIRY_ACCESS"),
    
    LIMITED_AUTHORITY("LIMITED_AUTHORITY"),
    
    FULL_AUTHORITY("FULL_AUTHORITY"),
    
    POWER_OF_ATTORNEY("POWER_OF_ATTORNEY");

    private String value;

    PermissionTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PermissionTypeEnum fromValue(String text) {
      for (PermissionTypeEnum b : PermissionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PermissionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PermissionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PermissionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PermissionTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("permission_type")
  private PermissionTypeEnum permissionType = null;

  public PermissionVO clientId(UUID clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * clientId
   * @return clientId
  **/
  @ApiModelProperty(example = "3699e30f-8b2f-4727-9a84-603eac072d8c", value = "clientId")
  public UUID getClientId() {
    return clientId;
  }

  public void setClientId(UUID clientId) {
    this.clientId = clientId;
  }

  public PermissionVO permissionType(PermissionTypeEnum permissionType) {
    this.permissionType = permissionType;
    return this;
  }

   /**
   * permissionType
   * @return permissionType
  **/
  @ApiModelProperty(example = "INQUIRY_ACCESS", value = "permissionType")
  public PermissionTypeEnum getPermissionType() {
    return permissionType;
  }

  public void setPermissionType(PermissionTypeEnum permissionType) {
    this.permissionType = permissionType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionVO permissionVO = (PermissionVO) o;
    return Objects.equals(this.clientId, permissionVO.clientId) &&
        Objects.equals(this.permissionType, permissionVO.permissionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, permissionType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionVO {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    permissionType: ").append(toIndentedString(permissionType)).append("\n");
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

