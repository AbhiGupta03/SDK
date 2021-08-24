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
import com.hydrogen.nucleus.model.Check;
import com.hydrogen.nucleus.model.Location;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * PortfolioTransaction Object
 */
@ApiModel(description = "PortfolioTransaction Object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-25T04:59:51.821Z")
public class PortfolioTransaction {
  @SerializedName("account_id")
  private UUID accountId = null;

  @SerializedName("amount")
  private Double amount = null;

  @SerializedName("balance")
  private Double balance = null;

  @SerializedName("category")
  private String category = null;

  @SerializedName("check")
  private Check check = null;

  @SerializedName("create_date")
  private OffsetDateTime createDate = null;

  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("date")
  private OffsetDateTime date = null;

  @SerializedName("date_available")
  private OffsetDateTime dateAvailable = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("funding_id")
  private UUID fundingId = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("is_cleansed")
  private Boolean isCleansed = null;

  @SerializedName("is_disputed")
  private Boolean isDisputed = null;

  @SerializedName("is_read")
  private Boolean isRead = null;

  @SerializedName("is_recurring")
  private Boolean isRecurring = null;

  @SerializedName("location")
  private Location location = null;

  @SerializedName("memo")
  private String memo = null;

  @SerializedName("merchant")
  private String merchant = null;

  @SerializedName("merchant_category_code")
  private Integer merchantCategoryCode = null;

  @SerializedName("merchant_id")
  private UUID merchantId = null;

  @SerializedName("metadata")
  private Map<String, String> metadata = null;

  @SerializedName("mid")
  private String mid = null;

  @SerializedName("model_id")
  private UUID modelId = null;

  @SerializedName("portfolio_id")
  private UUID portfolioId = null;

  @SerializedName("price")
  private Double price = null;

  @SerializedName("quantity")
  private Double quantity = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("security_id")
  private UUID securityId = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("subcategory")
  private String subcategory = null;

  @SerializedName("transaction_category_id")
  private UUID transactionCategoryId = null;

  @SerializedName("transaction_code_id")
  private UUID transactionCodeId = null;

  @SerializedName("update_date")
  private OffsetDateTime updateDate = null;

  public PortfolioTransaction accountId(UUID accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * accountId
   * @return accountId
  **/
  @ApiModelProperty(example = "1c28dade-8679-4df5-9b9d-c508d04fcb0c", required = true, value = "accountId")
  public UUID getAccountId() {
    return accountId;
  }

  public void setAccountId(UUID accountId) {
    this.accountId = accountId;
  }

  public PortfolioTransaction amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * amount
   * @return amount
  **/
  @ApiModelProperty(example = "100.0", value = "amount")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public PortfolioTransaction balance(Double balance) {
    this.balance = balance;
    return this;
  }

   /**
   * balance
   * @return balance
  **/
  @ApiModelProperty(example = "100000.0", value = "balance")
  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }

  public PortfolioTransaction category(String category) {
    this.category = category;
    return this;
  }

   /**
   * category
   * @return category
  **/
  @ApiModelProperty(example = "category", value = "category")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public PortfolioTransaction check(Check check) {
    this.check = check;
    return this;
  }

   /**
   * Get check
   * @return check
  **/
  @ApiModelProperty(value = "")
  public Check getCheck() {
    return check;
  }

  public void setCheck(Check check) {
    this.check = check;
  }

  public PortfolioTransaction createDate(OffsetDateTime createDate) {
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

  public PortfolioTransaction currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * currency_code
   * @return currencyCode
  **/
  @ApiModelProperty(example = "USD", value = "currency_code")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public PortfolioTransaction date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

   /**
   * date
   * @return date
  **/
  @ApiModelProperty(example = "2018-01-09'T'12:00:00", required = true, value = "date")
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public PortfolioTransaction dateAvailable(OffsetDateTime dateAvailable) {
    this.dateAvailable = dateAvailable;
    return this;
  }

   /**
   * dateAvailable
   * @return dateAvailable
  **/
  @ApiModelProperty(example = "2018-01-09'T'12:00:00", value = "dateAvailable")
  public OffsetDateTime getDateAvailable() {
    return dateAvailable;
  }

  public void setDateAvailable(OffsetDateTime dateAvailable) {
    this.dateAvailable = dateAvailable;
  }

  public PortfolioTransaction description(String description) {
    this.description = description;
    return this;
  }

   /**
   * description
   * @return description
  **/
  @ApiModelProperty(example = "description", value = "description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PortfolioTransaction fundingId(UUID fundingId) {
    this.fundingId = fundingId;
    return this;
  }

   /**
   * fundingId
   * @return fundingId
  **/
  @ApiModelProperty(example = "ea30e8b7-3946-46ed-975a-4870a57d119s", value = "fundingId")
  public UUID getFundingId() {
    return fundingId;
  }

  public void setFundingId(UUID fundingId) {
    this.fundingId = fundingId;
  }

  public PortfolioTransaction id(UUID id) {
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

  public PortfolioTransaction isCleansed(Boolean isCleansed) {
    this.isCleansed = isCleansed;
    return this;
  }

   /**
   * is_cleansed
   * @return isCleansed
  **/
  @ApiModelProperty(example = "false", value = "is_cleansed")
  public Boolean isIsCleansed() {
    return isCleansed;
  }

  public void setIsCleansed(Boolean isCleansed) {
    this.isCleansed = isCleansed;
  }

  public PortfolioTransaction isDisputed(Boolean isDisputed) {
    this.isDisputed = isDisputed;
    return this;
  }

   /**
   * is_disputed
   * @return isDisputed
  **/
  @ApiModelProperty(example = "false", value = "is_disputed")
  public Boolean isIsDisputed() {
    return isDisputed;
  }

  public void setIsDisputed(Boolean isDisputed) {
    this.isDisputed = isDisputed;
  }

  public PortfolioTransaction isRead(Boolean isRead) {
    this.isRead = isRead;
    return this;
  }

   /**
   * isRead
   * @return isRead
  **/
  @ApiModelProperty(example = "true", value = "isRead")
  public Boolean isIsRead() {
    return isRead;
  }

  public void setIsRead(Boolean isRead) {
    this.isRead = isRead;
  }

  public PortfolioTransaction isRecurring(Boolean isRecurring) {
    this.isRecurring = isRecurring;
    return this;
  }

   /**
   * is_recurring
   * @return isRecurring
  **/
  @ApiModelProperty(example = "false", value = "is_recurring")
  public Boolean isIsRecurring() {
    return isRecurring;
  }

  public void setIsRecurring(Boolean isRecurring) {
    this.isRecurring = isRecurring;
  }

  public PortfolioTransaction location(Location location) {
    this.location = location;
    return this;
  }

   /**
   * location
   * @return location
  **/
  @ApiModelProperty(value = "location")
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public PortfolioTransaction memo(String memo) {
    this.memo = memo;
    return this;
  }

   /**
   * memo
   * @return memo
  **/
  @ApiModelProperty(example = "memo", value = "memo")
  public String getMemo() {
    return memo;
  }

  public void setMemo(String memo) {
    this.memo = memo;
  }

  public PortfolioTransaction merchant(String merchant) {
    this.merchant = merchant;
    return this;
  }

   /**
   * merchant
   * @return merchant
  **/
  @ApiModelProperty(example = "merchant", value = "merchant")
  public String getMerchant() {
    return merchant;
  }

  public void setMerchant(String merchant) {
    this.merchant = merchant;
  }

  public PortfolioTransaction merchantCategoryCode(Integer merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
    return this;
  }

   /**
   * merchant_category_code
   * @return merchantCategoryCode
  **/
  @ApiModelProperty(example = "3099", value = "merchant_category_code")
  public Integer getMerchantCategoryCode() {
    return merchantCategoryCode;
  }

  public void setMerchantCategoryCode(Integer merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
  }

  public PortfolioTransaction merchantId(UUID merchantId) {
    this.merchantId = merchantId;
    return this;
  }

   /**
   * merchantId
   * @return merchantId
  **/
  @ApiModelProperty(example = "1c28dade-8679-4df5-9b9d-c508d04fcb0c", value = "merchantId")
  public UUID getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(UUID merchantId) {
    this.merchantId = merchantId;
  }

  public PortfolioTransaction metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public PortfolioTransaction putMetadataItem(String key, String metadataItem) {
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

  public PortfolioTransaction mid(String mid) {
    this.mid = mid;
    return this;
  }

   /**
   * mid
   * @return mid
  **/
  @ApiModelProperty(example = "3099", value = "mid")
  public String getMid() {
    return mid;
  }

  public void setMid(String mid) {
    this.mid = mid;
  }

  public PortfolioTransaction modelId(UUID modelId) {
    this.modelId = modelId;
    return this;
  }

   /**
   * modelId
   * @return modelId
  **/
  @ApiModelProperty(example = "62fd0a9f-4bac-4b1d-94d2-2c5ea2adca3d", required = true, value = "modelId")
  public UUID getModelId() {
    return modelId;
  }

  public void setModelId(UUID modelId) {
    this.modelId = modelId;
  }

  public PortfolioTransaction portfolioId(UUID portfolioId) {
    this.portfolioId = portfolioId;
    return this;
  }

   /**
   * portfolioId
   * @return portfolioId
  **/
  @ApiModelProperty(example = "b4c033db-9d05-4a33-8e28-40650d454487", required = true, value = "portfolioId")
  public UUID getPortfolioId() {
    return portfolioId;
  }

  public void setPortfolioId(UUID portfolioId) {
    this.portfolioId = portfolioId;
  }

  public PortfolioTransaction price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * price
   * @return price
  **/
  @ApiModelProperty(example = "100.0", value = "price")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public PortfolioTransaction quantity(Double quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * quantity
   * @return quantity
  **/
  @ApiModelProperty(example = "100.0", value = "quantity")
  public Double getQuantity() {
    return quantity;
  }

  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }

  public PortfolioTransaction secondaryId(String secondaryId) {
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

  public PortfolioTransaction securityId(UUID securityId) {
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

  public PortfolioTransaction status(String status) {
    this.status = status;
    return this;
  }

   /**
   * status
   * @return status
  **/
  @ApiModelProperty(example = "status", value = "status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PortfolioTransaction subcategory(String subcategory) {
    this.subcategory = subcategory;
    return this;
  }

   /**
   * subcategory
   * @return subcategory
  **/
  @ApiModelProperty(example = "subcategory", value = "subcategory")
  public String getSubcategory() {
    return subcategory;
  }

  public void setSubcategory(String subcategory) {
    this.subcategory = subcategory;
  }

  public PortfolioTransaction transactionCategoryId(UUID transactionCategoryId) {
    this.transactionCategoryId = transactionCategoryId;
    return this;
  }

   /**
   * transactionCategoryId
   * @return transactionCategoryId
  **/
  @ApiModelProperty(example = "1c28dade-8679-4df5-9b9d-c508d04fcb0c", value = "transactionCategoryId")
  public UUID getTransactionCategoryId() {
    return transactionCategoryId;
  }

  public void setTransactionCategoryId(UUID transactionCategoryId) {
    this.transactionCategoryId = transactionCategoryId;
  }

  public PortfolioTransaction transactionCodeId(UUID transactionCodeId) {
    this.transactionCodeId = transactionCodeId;
    return this;
  }

   /**
   * alertId
   * @return transactionCodeId
  **/
  @ApiModelProperty(example = "f5af397b-7d22-433f-b01e-8202184a6386", required = true, value = "alertId")
  public UUID getTransactionCodeId() {
    return transactionCodeId;
  }

  public void setTransactionCodeId(UUID transactionCodeId) {
    this.transactionCodeId = transactionCodeId;
  }

  public PortfolioTransaction updateDate(OffsetDateTime updateDate) {
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
    PortfolioTransaction portfolioTransaction = (PortfolioTransaction) o;
    return Objects.equals(this.accountId, portfolioTransaction.accountId) &&
        Objects.equals(this.amount, portfolioTransaction.amount) &&
        Objects.equals(this.balance, portfolioTransaction.balance) &&
        Objects.equals(this.category, portfolioTransaction.category) &&
        Objects.equals(this.check, portfolioTransaction.check) &&
        Objects.equals(this.createDate, portfolioTransaction.createDate) &&
        Objects.equals(this.currencyCode, portfolioTransaction.currencyCode) &&
        Objects.equals(this.date, portfolioTransaction.date) &&
        Objects.equals(this.dateAvailable, portfolioTransaction.dateAvailable) &&
        Objects.equals(this.description, portfolioTransaction.description) &&
        Objects.equals(this.fundingId, portfolioTransaction.fundingId) &&
        Objects.equals(this.id, portfolioTransaction.id) &&
        Objects.equals(this.isCleansed, portfolioTransaction.isCleansed) &&
        Objects.equals(this.isDisputed, portfolioTransaction.isDisputed) &&
        Objects.equals(this.isRead, portfolioTransaction.isRead) &&
        Objects.equals(this.isRecurring, portfolioTransaction.isRecurring) &&
        Objects.equals(this.location, portfolioTransaction.location) &&
        Objects.equals(this.memo, portfolioTransaction.memo) &&
        Objects.equals(this.merchant, portfolioTransaction.merchant) &&
        Objects.equals(this.merchantCategoryCode, portfolioTransaction.merchantCategoryCode) &&
        Objects.equals(this.merchantId, portfolioTransaction.merchantId) &&
        Objects.equals(this.metadata, portfolioTransaction.metadata) &&
        Objects.equals(this.mid, portfolioTransaction.mid) &&
        Objects.equals(this.modelId, portfolioTransaction.modelId) &&
        Objects.equals(this.portfolioId, portfolioTransaction.portfolioId) &&
        Objects.equals(this.price, portfolioTransaction.price) &&
        Objects.equals(this.quantity, portfolioTransaction.quantity) &&
        Objects.equals(this.secondaryId, portfolioTransaction.secondaryId) &&
        Objects.equals(this.securityId, portfolioTransaction.securityId) &&
        Objects.equals(this.status, portfolioTransaction.status) &&
        Objects.equals(this.subcategory, portfolioTransaction.subcategory) &&
        Objects.equals(this.transactionCategoryId, portfolioTransaction.transactionCategoryId) &&
        Objects.equals(this.transactionCodeId, portfolioTransaction.transactionCodeId) &&
        Objects.equals(this.updateDate, portfolioTransaction.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, amount, balance, category, check, createDate, currencyCode, date, dateAvailable, description, fundingId, id, isCleansed, isDisputed, isRead, isRecurring, location, memo, merchant, merchantCategoryCode, merchantId, metadata, mid, modelId, portfolioId, price, quantity, secondaryId, securityId, status, subcategory, transactionCategoryId, transactionCodeId, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortfolioTransaction {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    check: ").append(toIndentedString(check)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    dateAvailable: ").append(toIndentedString(dateAvailable)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fundingId: ").append(toIndentedString(fundingId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isCleansed: ").append(toIndentedString(isCleansed)).append("\n");
    sb.append("    isDisputed: ").append(toIndentedString(isDisputed)).append("\n");
    sb.append("    isRead: ").append(toIndentedString(isRead)).append("\n");
    sb.append("    isRecurring: ").append(toIndentedString(isRecurring)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    merchantCategoryCode: ").append(toIndentedString(merchantCategoryCode)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    mid: ").append(toIndentedString(mid)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
    sb.append("    securityId: ").append(toIndentedString(securityId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subcategory: ").append(toIndentedString(subcategory)).append("\n");
    sb.append("    transactionCategoryId: ").append(toIndentedString(transactionCategoryId)).append("\n");
    sb.append("    transactionCodeId: ").append(toIndentedString(transactionCodeId)).append("\n");
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

