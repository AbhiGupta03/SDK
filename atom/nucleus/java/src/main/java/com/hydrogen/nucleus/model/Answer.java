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
import com.hydrogen.nucleus.model.Question;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * Answer
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-24T10:39:20.203Z")
public class Answer {
  @SerializedName("create_date")
  private OffsetDateTime createDate = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("image")
  private String image = null;

  @SerializedName("is_default")
  private Boolean isDefault = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("metadata")
  private Map<String, String> metadata = null;

  @SerializedName("order_index")
  private String orderIndex = null;

  @SerializedName("question")
  private Question question = null;

  @SerializedName("question_id")
  private UUID questionId = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("tooltip")
  private String tooltip = null;

  @SerializedName("update_date")
  private OffsetDateTime updateDate = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("weight")
  private Double weight = null;

  public Answer createDate(OffsetDateTime createDate) {
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

  public Answer id(UUID id) {
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

  public Answer image(String image) {
    this.image = image;
    return this;
  }

   /**
   * image
   * @return image
  **/
  @ApiModelProperty(example = "image", value = "image")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public Answer isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

   /**
   * isDefault
   * @return isDefault
  **/
  @ApiModelProperty(example = "false", value = "isDefault")
  public Boolean isIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public Answer label(String label) {
    this.label = label;
    return this;
  }

   /**
   * label
   * @return label
  **/
  @ApiModelProperty(example = "label", value = "label")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public Answer metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public Answer putMetadataItem(String key, String metadataItem) {
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

  public Answer orderIndex(String orderIndex) {
    this.orderIndex = orderIndex;
    return this;
  }

   /**
   * orderIndex
   * @return orderIndex
  **/
  @ApiModelProperty(example = "1", value = "orderIndex")
  public String getOrderIndex() {
    return orderIndex;
  }

  public void setOrderIndex(String orderIndex) {
    this.orderIndex = orderIndex;
  }

  public Answer question(Question question) {
    this.question = question;
    return this;
  }

   /**
   * Get question
   * @return question
  **/
  @ApiModelProperty(value = "")
  public Question getQuestion() {
    return question;
  }

  public void setQuestion(Question question) {
    this.question = question;
  }

  public Answer questionId(UUID questionId) {
    this.questionId = questionId;
    return this;
  }

   /**
   * questionId
   * @return questionId
  **/
  @ApiModelProperty(example = "2feae367-77be-4613-9cd0-f62fd5b3cff9", value = "questionId")
  public UUID getQuestionId() {
    return questionId;
  }

  public void setQuestionId(UUID questionId) {
    this.questionId = questionId;
  }

  public Answer secondaryId(String secondaryId) {
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

  public Answer tooltip(String tooltip) {
    this.tooltip = tooltip;
    return this;
  }

   /**
   * Get tooltip
   * @return tooltip
  **/
  @ApiModelProperty(value = "")
  public String getTooltip() {
    return tooltip;
  }

  public void setTooltip(String tooltip) {
    this.tooltip = tooltip;
  }

  public Answer updateDate(OffsetDateTime updateDate) {
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

  public Answer value(String value) {
    this.value = value;
    return this;
  }

   /**
   * value
   * @return value
  **/
  @ApiModelProperty(example = "0-40", required = true, value = "value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Answer weight(Double weight) {
    this.weight = weight;
    return this;
  }

   /**
   * weight
   * @return weight
  **/
  @ApiModelProperty(example = "10.0", value = "weight")
  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Answer answer = (Answer) o;
    return Objects.equals(this.createDate, answer.createDate) &&
        Objects.equals(this.id, answer.id) &&
        Objects.equals(this.image, answer.image) &&
        Objects.equals(this.isDefault, answer.isDefault) &&
        Objects.equals(this.label, answer.label) &&
        Objects.equals(this.metadata, answer.metadata) &&
        Objects.equals(this.orderIndex, answer.orderIndex) &&
        Objects.equals(this.question, answer.question) &&
        Objects.equals(this.questionId, answer.questionId) &&
        Objects.equals(this.secondaryId, answer.secondaryId) &&
        Objects.equals(this.tooltip, answer.tooltip) &&
        Objects.equals(this.updateDate, answer.updateDate) &&
        Objects.equals(this.value, answer.value) &&
        Objects.equals(this.weight, answer.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createDate, id, image, isDefault, label, metadata, orderIndex, question, questionId, secondaryId, tooltip, updateDate, value, weight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Answer {\n");
    
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    orderIndex: ").append(toIndentedString(orderIndex)).append("\n");
    sb.append("    question: ").append(toIndentedString(question)).append("\n");
    sb.append("    questionId: ").append(toIndentedString(questionId)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
    sb.append("    tooltip: ").append(toIndentedString(tooltip)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

