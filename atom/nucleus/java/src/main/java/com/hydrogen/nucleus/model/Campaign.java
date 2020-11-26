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

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

/**
 * Campaign Object
 */
@ApiModel(description = "Campaign Object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-12T11:03:26.704Z")



public class Campaign {
  @SerializedName("campaign_category")
  private String campaignCategory = null;

  @SerializedName("campaign_plan_id")
  private UUID campaignPlanId = null;

  @SerializedName("cookie_code")
  private String cookieCode = null;

  @SerializedName("create_date")
  private OffsetDateTime createDate = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("end_date")
  private LocalDate endDate = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("is_acquisition")
  private Boolean isAcquisition = null;

  @SerializedName("is_active")
  private Boolean isActive = null;

  @SerializedName("landing_page")
  private String landingPage = null;

  @SerializedName("metadata")
  private Map<String, String> metadata = null;

  @SerializedName("rate")
  private Double rate = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("start_date")
  private LocalDate startDate = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("update_date")
  private OffsetDateTime updateDate = null;

  @SerializedName("utm_campaign")
  private String utmCampaign = null;

  @SerializedName("utm_content")
  private String utmContent = null;

  @SerializedName("utm_medium")
  private String utmMedium = null;

  @SerializedName("utm_source")
  private String utmSource = null;

  @SerializedName("utm_term")
  private String utmTerm = null;

  public Campaign campaignCategory(String campaignCategory) {
    this.campaignCategory = campaignCategory;
    return this;
  }

   /**
   * Get campaignCategory
   * @return campaignCategory
  **/
  @ApiModelProperty(value = "")
  public String getCampaignCategory() {
    return campaignCategory;
  }

  public void setCampaignCategory(String campaignCategory) {
    this.campaignCategory = campaignCategory;
  }

  public Campaign campaignPlanId(UUID campaignPlanId) {
    this.campaignPlanId = campaignPlanId;
    return this;
  }

   /**
   * campaignPlanId
   * @return campaignPlanId
  **/
  @ApiModelProperty(example = "8961182f-577d-451a-9ff1-1a8ef792efe2", value = "campaignPlanId")
  public UUID getCampaignPlanId() {
    return campaignPlanId;
  }

  public void setCampaignPlanId(UUID campaignPlanId) {
    this.campaignPlanId = campaignPlanId;
  }

  public Campaign cookieCode(String cookieCode) {
    this.cookieCode = cookieCode;
    return this;
  }

   /**
   * cookieCode
   * @return cookieCode
  **/
  @ApiModelProperty(example = "sample", value = "cookieCode")
  public String getCookieCode() {
    return cookieCode;
  }

  public void setCookieCode(String cookieCode) {
    this.cookieCode = cookieCode;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @ApiModelProperty(example = "2018-06-28T18:17:23.579+0000", value = "")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public Campaign description(String description) {
    this.description = description;
    return this;
  }

   /**
   * description
   * @return description
  **/
  @ApiModelProperty(example = "get users from example.com", required = true, value = "description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Campaign endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * endDate
   * @return endDate
  **/
  @ApiModelProperty(example = "2018-01-09", required = true, value = "endDate")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "000183ac-2288-4564-a76b-119f4694be98", value = "")
  public UUID getId() {
    return id;
  }

  public Campaign isAcquisition(Boolean isAcquisition) {
    this.isAcquisition = isAcquisition;
    return this;
  }

   /**
   * isAcquisition
   * @return isAcquisition
  **/
  @ApiModelProperty(example = "true", value = "isAcquisition")
  public Boolean isIsAcquisition() {
    return isAcquisition;
  }

  public void setIsAcquisition(Boolean isAcquisition) {
    this.isAcquisition = isAcquisition;
  }

  public Campaign isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * isActive
   * @return isActive
  **/
  @ApiModelProperty(example = "true", value = "isActive")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public Campaign landingPage(String landingPage) {
    this.landingPage = landingPage;
    return this;
  }

   /**
   * landingPage
   * @return landingPage
  **/
  @ApiModelProperty(example = "Onboarding", value = "landingPage")
  public String getLandingPage() {
    return landingPage;
  }

  public void setLandingPage(String landingPage) {
    this.landingPage = landingPage;
  }

  public Campaign metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public Campaign putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String, String>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

  public Campaign rate(Double rate) {
    this.rate = rate;
    return this;
  }

   /**
   * rate
   * @return rate
  **/
  @ApiModelProperty(example = "100.0", value = "rate")
  public Double getRate() {
    return rate;
  }

  public void setRate(Double rate) {
    this.rate = rate;
  }

   /**
   * Get secondaryId
   * @return secondaryId
  **/
  @ApiModelProperty(example = "7289243787238", value = "")
  public String getSecondaryId() {
    return secondaryId;
  }

  public Campaign startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * startDate
   * @return startDate
  **/
  @ApiModelProperty(example = "2018-01-09", required = true, value = "startDate")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public Campaign title(String title) {
    this.title = title;
    return this;
  }

   /**
   * title
   * @return title
  **/
  @ApiModelProperty(example = "Summer Onboarding", required = true, value = "title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

   /**
   * Get updateDate
   * @return updateDate
  **/
  @ApiModelProperty(example = "2018-06-28T18:17:23.579+0000", value = "")
  public OffsetDateTime getUpdateDate() {
    return updateDate;
  }

  public Campaign utmCampaign(String utmCampaign) {
    this.utmCampaign = utmCampaign;
    return this;
  }

   /**
   * utmCampaign
   * @return utmCampaign
  **/
  @ApiModelProperty(example = "Summer-Onboarding", value = "utmCampaign")
  public String getUtmCampaign() {
    return utmCampaign;
  }

  public void setUtmCampaign(String utmCampaign) {
    this.utmCampaign = utmCampaign;
  }

  public Campaign utmContent(String utmContent) {
    this.utmContent = utmContent;
    return this;
  }

   /**
   * utmContent
   * @return utmContent
  **/
  @ApiModelProperty(example = "Want to save extra?", value = "utmContent")
  public String getUtmContent() {
    return utmContent;
  }

  public void setUtmContent(String utmContent) {
    this.utmContent = utmContent;
  }

  public Campaign utmMedium(String utmMedium) {
    this.utmMedium = utmMedium;
    return this;
  }

   /**
   * utmMedium
   * @return utmMedium
  **/
  @ApiModelProperty(example = "Social Media", value = "utmMedium")
  public String getUtmMedium() {
    return utmMedium;
  }

  public void setUtmMedium(String utmMedium) {
    this.utmMedium = utmMedium;
  }

  public Campaign utmSource(String utmSource) {
    this.utmSource = utmSource;
    return this;
  }

   /**
   * utmSource
   * @return utmSource
  **/
  @ApiModelProperty(example = "Banner Add", value = "utmSource")
  public String getUtmSource() {
    return utmSource;
  }

  public void setUtmSource(String utmSource) {
    this.utmSource = utmSource;
  }

  public Campaign utmTerm(String utmTerm) {
    this.utmTerm = utmTerm;
    return this;
  }

   /**
   * utmTerm
   * @return utmTerm
  **/
  @ApiModelProperty(example = "Sample Term", value = "utmTerm")
  public String getUtmTerm() {
    return utmTerm;
  }

  public void setUtmTerm(String utmTerm) {
    this.utmTerm = utmTerm;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Campaign campaign = (Campaign) o;
    return Objects.equals(this.campaignCategory, campaign.campaignCategory) &&
        Objects.equals(this.campaignPlanId, campaign.campaignPlanId) &&
        Objects.equals(this.cookieCode, campaign.cookieCode) &&
        Objects.equals(this.createDate, campaign.createDate) &&
        Objects.equals(this.description, campaign.description) &&
        Objects.equals(this.endDate, campaign.endDate) &&
        Objects.equals(this.id, campaign.id) &&
        Objects.equals(this.isAcquisition, campaign.isAcquisition) &&
        Objects.equals(this.isActive, campaign.isActive) &&
        Objects.equals(this.landingPage, campaign.landingPage) &&
        Objects.equals(this.metadata, campaign.metadata) &&
        Objects.equals(this.rate, campaign.rate) &&
        Objects.equals(this.secondaryId, campaign.secondaryId) &&
        Objects.equals(this.startDate, campaign.startDate) &&
        Objects.equals(this.title, campaign.title) &&
        Objects.equals(this.updateDate, campaign.updateDate) &&
        Objects.equals(this.utmCampaign, campaign.utmCampaign) &&
        Objects.equals(this.utmContent, campaign.utmContent) &&
        Objects.equals(this.utmMedium, campaign.utmMedium) &&
        Objects.equals(this.utmSource, campaign.utmSource) &&
        Objects.equals(this.utmTerm, campaign.utmTerm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignCategory, campaignPlanId, cookieCode, createDate, description, endDate, id, isAcquisition, isActive, landingPage, metadata, rate, secondaryId, startDate, title, updateDate, utmCampaign, utmContent, utmMedium, utmSource, utmTerm);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Campaign {\n");
    
    sb.append("    campaignCategory: ").append(toIndentedString(campaignCategory)).append("\n");
    sb.append("    campaignPlanId: ").append(toIndentedString(campaignPlanId)).append("\n");
    sb.append("    cookieCode: ").append(toIndentedString(cookieCode)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isAcquisition: ").append(toIndentedString(isAcquisition)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    landingPage: ").append(toIndentedString(landingPage)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
    sb.append("    utmCampaign: ").append(toIndentedString(utmCampaign)).append("\n");
    sb.append("    utmContent: ").append(toIndentedString(utmContent)).append("\n");
    sb.append("    utmMedium: ").append(toIndentedString(utmMedium)).append("\n");
    sb.append("    utmSource: ").append(toIndentedString(utmSource)).append("\n");
    sb.append("    utmTerm: ").append(toIndentedString(utmTerm)).append("\n");
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

