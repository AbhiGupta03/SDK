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
 * OrderVoClone Object
 */
@ApiModel(description = "OrderVoClone Object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-12T11:03:26.704Z")



public class OrderVoClone {
  @SerializedName("account_id")
  private UUID accountId = null;

  @SerializedName("date")
  private OffsetDateTime date = null;

  @SerializedName("is_read")
  private Boolean isRead = null;

  @SerializedName("metadata")
  private Map<String, String> metadata = null;

  @SerializedName("model_id")
  private UUID modelId = null;

  @SerializedName("order_bulk_id")
  private UUID orderBulkId = null;

  @SerializedName("order_ticket_id")
  private UUID orderTicketId = null;

  @SerializedName("order_type")
  private String orderType = null;

  @SerializedName("portfolio_id")
  private UUID portfolioId = null;

  @SerializedName("price")
  private Double price = null;

  @SerializedName("quantity")
  private Double quantity = null;

  @SerializedName("security_id")
  private UUID securityId = null;

  @SerializedName("transaction_code_id")
  private UUID transactionCodeId = null;

  public OrderVoClone accountId(UUID accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * accountId
   * @return accountId
  **/
  @ApiModelProperty(example = "11c28dade-8679-4df5-9b9d-c508d04fcb0c", value = "accountId")
  public UUID getAccountId() {
    return accountId;
  }

  public void setAccountId(UUID accountId) {
    this.accountId = accountId;
  }

  public OrderVoClone date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

   /**
   * date
   * @return date
  **/
  @ApiModelProperty(example = "2018-06-28", value = "date")
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public OrderVoClone isRead(Boolean isRead) {
    this.isRead = isRead;
    return this;
  }

   /**
   * isRead
   * @return isRead
  **/
  @ApiModelProperty(example = "false", value = "isRead")
  public Boolean isIsRead() {
    return isRead;
  }

  public void setIsRead(Boolean isRead) {
    this.isRead = isRead;
  }

   /**
   * metadata
   * @return metadata
  **/
  @ApiModelProperty(example = "{}", value = "metadata")
  public Map<String, String> getMetadata() {
    return metadata;
  }

  public OrderVoClone modelId(UUID modelId) {
    this.modelId = modelId;
    return this;
  }

   /**
   * modelId
   * @return modelId
  **/
  @ApiModelProperty(example = "62fd0a9f-4bac-4b1d-94d2-2c5ea2adca3d", value = "modelId")
  public UUID getModelId() {
    return modelId;
  }

  public void setModelId(UUID modelId) {
    this.modelId = modelId;
  }

  public OrderVoClone orderBulkId(UUID orderBulkId) {
    this.orderBulkId = orderBulkId;
    return this;
  }

   /**
   * orderBulkId
   * @return orderBulkId
  **/
  @ApiModelProperty(example = "114556fe-ee78-431d-be5e-60ae08ddf9a7", value = "orderBulkId")
  public UUID getOrderBulkId() {
    return orderBulkId;
  }

  public void setOrderBulkId(UUID orderBulkId) {
    this.orderBulkId = orderBulkId;
  }

  public OrderVoClone orderTicketId(UUID orderTicketId) {
    this.orderTicketId = orderTicketId;
    return this;
  }

   /**
   * orderTicketId
   * @return orderTicketId
  **/
  @ApiModelProperty(example = "5da53a30-49e6-4162-8728-58d6348bfb24", value = "orderTicketId")
  public UUID getOrderTicketId() {
    return orderTicketId;
  }

  public void setOrderTicketId(UUID orderTicketId) {
    this.orderTicketId = orderTicketId;
  }

  public OrderVoClone orderType(String orderType) {
    this.orderType = orderType;
    return this;
  }

   /**
   * orderType
   * @return orderType
  **/
  @ApiModelProperty(example = "initial order", value = "orderType")
  public String getOrderType() {
    return orderType;
  }

  public void setOrderType(String orderType) {
    this.orderType = orderType;
  }

  public OrderVoClone portfolioId(UUID portfolioId) {
    this.portfolioId = portfolioId;
    return this;
  }

   /**
   * portfolioId
   * @return portfolioId
  **/
  @ApiModelProperty(example = "c34794e9-f927-468b-b47e-ea17c3d533c5", value = "portfolioId")
  public UUID getPortfolioId() {
    return portfolioId;
  }

  public void setPortfolioId(UUID portfolioId) {
    this.portfolioId = portfolioId;
  }

  public OrderVoClone price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public OrderVoClone quantity(Double quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * quantity
   * @return quantity
  **/
  @ApiModelProperty(example = "1.0", value = "quantity")
  public Double getQuantity() {
    return quantity;
  }

  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }

  public OrderVoClone securityId(UUID securityId) {
    this.securityId = securityId;
    return this;
  }

   /**
   * securityId
   * @return securityId
  **/
  @ApiModelProperty(example = "29c3f995-bd45-4346-aea2-fd4476568d4c", value = "securityId")
  public UUID getSecurityId() {
    return securityId;
  }

  public void setSecurityId(UUID securityId) {
    this.securityId = securityId;
  }

  public OrderVoClone transactionCodeId(UUID transactionCodeId) {
    this.transactionCodeId = transactionCodeId;
    return this;
  }

   /**
   * transactionCodeId
   * @return transactionCodeId
  **/
  @ApiModelProperty(example = "f5af397b-7d22-433f-b01e-8202184a6386", value = "transactionCodeId")
  public UUID getTransactionCodeId() {
    return transactionCodeId;
  }

  public void setTransactionCodeId(UUID transactionCodeId) {
    this.transactionCodeId = transactionCodeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderVoClone orderVoClone = (OrderVoClone) o;
    return Objects.equals(this.accountId, orderVoClone.accountId) &&
        Objects.equals(this.date, orderVoClone.date) &&
        Objects.equals(this.isRead, orderVoClone.isRead) &&
        Objects.equals(this.metadata, orderVoClone.metadata) &&
        Objects.equals(this.modelId, orderVoClone.modelId) &&
        Objects.equals(this.orderBulkId, orderVoClone.orderBulkId) &&
        Objects.equals(this.orderTicketId, orderVoClone.orderTicketId) &&
        Objects.equals(this.orderType, orderVoClone.orderType) &&
        Objects.equals(this.portfolioId, orderVoClone.portfolioId) &&
        Objects.equals(this.price, orderVoClone.price) &&
        Objects.equals(this.quantity, orderVoClone.quantity) &&
        Objects.equals(this.securityId, orderVoClone.securityId) &&
        Objects.equals(this.transactionCodeId, orderVoClone.transactionCodeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, date, isRead, metadata, modelId, orderBulkId, orderTicketId, orderType, portfolioId, price, quantity, securityId, transactionCodeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderVoClone {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    isRead: ").append(toIndentedString(isRead)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    orderBulkId: ").append(toIndentedString(orderBulkId)).append("\n");
    sb.append("    orderTicketId: ").append(toIndentedString(orderTicketId)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    securityId: ").append(toIndentedString(securityId)).append("\n");
    sb.append("    transactionCodeId: ").append(toIndentedString(transactionCodeId)).append("\n");
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

