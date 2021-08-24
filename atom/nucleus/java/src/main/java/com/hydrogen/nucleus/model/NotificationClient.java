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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * Notification Client Object
 */
@ApiModel(description = "Notification Client Object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-24T10:39:20.203Z")
public class NotificationClient {
  @SerializedName("client_id")
  private UUID clientId = null;

  @SerializedName("create_date")
  private OffsetDateTime createDate = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("is_read")
  private Boolean isRead = null;

  @SerializedName("is_sent")
  private Boolean isSent = null;

  @SerializedName("metadata")
  private Map<String, String> metadata = null;

  @SerializedName("notification_content")
  private String notificationContent = null;

  @SerializedName("notification_date")
  private OffsetDateTime notificationDate = null;

  @SerializedName("notification_id")
  private UUID notificationId = null;

  @SerializedName("notification_image")
  private String notificationImage = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("update_date")
  private OffsetDateTime updateDate = null;

  public NotificationClient clientId(UUID clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * client_id
   * @return clientId
  **/
  @ApiModelProperty(example = "04638eb3-d94d-45d6-b6f3-c685bb5a6009", required = true, value = "client_id")
  public UUID getClientId() {
    return clientId;
  }

  public void setClientId(UUID clientId) {
    this.clientId = clientId;
  }

  public NotificationClient createDate(OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @ApiModelProperty(example = "2018-06-28T18:17:23.579+0000", value = "")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }

  public NotificationClient id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "000183ac-2288-4564-a76b-119f4694be98", value = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public NotificationClient isRead(Boolean isRead) {
    this.isRead = isRead;
    return this;
  }

   /**
   * Get isRead
   * @return isRead
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isIsRead() {
    return isRead;
  }

  public void setIsRead(Boolean isRead) {
    this.isRead = isRead;
  }

  public NotificationClient isSent(Boolean isSent) {
    this.isSent = isSent;
    return this;
  }

   /**
   * Get isSent
   * @return isSent
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isIsSent() {
    return isSent;
  }

  public void setIsSent(Boolean isSent) {
    this.isSent = isSent;
  }

  public NotificationClient metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public NotificationClient putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String, String>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * metadata
   * @return metadata
  **/
  @ApiModelProperty(example = "{}", value = "metadata")
  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

  public NotificationClient notificationContent(String notificationContent) {
    this.notificationContent = notificationContent;
    return this;
  }

   /**
   * notification_content
   * @return notificationContent
  **/
  @ApiModelProperty(example = "notificationContent", required = true, value = "notification_content")
  public String getNotificationContent() {
    return notificationContent;
  }

  public void setNotificationContent(String notificationContent) {
    this.notificationContent = notificationContent;
  }

  public NotificationClient notificationDate(OffsetDateTime notificationDate) {
    this.notificationDate = notificationDate;
    return this;
  }

   /**
   * notification_date
   * @return notificationDate
  **/
  @ApiModelProperty(example = "2018-06-28T18:17:23.579+0000", required = true, value = "notification_date")
  public OffsetDateTime getNotificationDate() {
    return notificationDate;
  }

  public void setNotificationDate(OffsetDateTime notificationDate) {
    this.notificationDate = notificationDate;
  }

  public NotificationClient notificationId(UUID notificationId) {
    this.notificationId = notificationId;
    return this;
  }

   /**
   * notification_id
   * @return notificationId
  **/
  @ApiModelProperty(example = "04638eb3-d94d-45d6-b6f3-c685bb5a6009", required = true, value = "notification_id")
  public UUID getNotificationId() {
    return notificationId;
  }

  public void setNotificationId(UUID notificationId) {
    this.notificationId = notificationId;
  }

  public NotificationClient notificationImage(String notificationImage) {
    this.notificationImage = notificationImage;
    return this;
  }

   /**
   * notification_image
   * @return notificationImage
  **/
  @ApiModelProperty(example = "notification image", value = "notification_image")
  public String getNotificationImage() {
    return notificationImage;
  }

  public void setNotificationImage(String notificationImage) {
    this.notificationImage = notificationImage;
  }

  public NotificationClient secondaryId(String secondaryId) {
    this.secondaryId = secondaryId;
    return this;
  }

   /**
   * Get secondaryId
   * @return secondaryId
  **/
  @ApiModelProperty(example = "7289243787238", value = "")
  public String getSecondaryId() {
    return secondaryId;
  }

  public void setSecondaryId(String secondaryId) {
    this.secondaryId = secondaryId;
  }

  public NotificationClient updateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
    return this;
  }

   /**
   * Get updateDate
   * @return updateDate
  **/
  @ApiModelProperty(example = "2018-06-28T18:17:23.579+0000", value = "")
  public OffsetDateTime getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationClient notificationClient = (NotificationClient) o;
    return Objects.equals(this.clientId, notificationClient.clientId) &&
        Objects.equals(this.createDate, notificationClient.createDate) &&
        Objects.equals(this.id, notificationClient.id) &&
        Objects.equals(this.isRead, notificationClient.isRead) &&
        Objects.equals(this.isSent, notificationClient.isSent) &&
        Objects.equals(this.metadata, notificationClient.metadata) &&
        Objects.equals(this.notificationContent, notificationClient.notificationContent) &&
        Objects.equals(this.notificationDate, notificationClient.notificationDate) &&
        Objects.equals(this.notificationId, notificationClient.notificationId) &&
        Objects.equals(this.notificationImage, notificationClient.notificationImage) &&
        Objects.equals(this.secondaryId, notificationClient.secondaryId) &&
        Objects.equals(this.updateDate, notificationClient.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, createDate, id, isRead, isSent, metadata, notificationContent, notificationDate, notificationId, notificationImage, secondaryId, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationClient {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isRead: ").append(toIndentedString(isRead)).append("\n");
    sb.append("    isSent: ").append(toIndentedString(isSent)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    notificationContent: ").append(toIndentedString(notificationContent)).append("\n");
    sb.append("    notificationDate: ").append(toIndentedString(notificationDate)).append("\n");
    sb.append("    notificationId: ").append(toIndentedString(notificationId)).append("\n");
    sb.append("    notificationImage: ").append(toIndentedString(notificationImage)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
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

