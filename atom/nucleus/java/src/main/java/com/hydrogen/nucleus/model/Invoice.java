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
import com.hydrogen.nucleus.model.LineItems;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

/**
 * Invoice Object
 */
@ApiModel(description = "Invoice Object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-24T10:39:20.203Z")
public class Invoice {
  @SerializedName("business_id")
  private UUID businessId = null;

  @SerializedName("client_id")
  private UUID clientId = null;

  @SerializedName("contact_id")
  private UUID contactId = null;

  @SerializedName("create_date")
  private OffsetDateTime createDate = null;

  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("department")
  private String department = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("document_id")
  private UUID documentId = null;

  @SerializedName("due_date")
  private OffsetDateTime dueDate = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("invoice_date")
  private LocalDate invoiceDate = null;

  @SerializedName("invoice_name")
  private String invoiceName = null;

  @SerializedName("invoice_number")
  private String invoiceNumber = null;

  @SerializedName("is_active")
  private Boolean isActive = null;

  @SerializedName("is_bill")
  private Boolean isBill = null;

  @SerializedName("line_items")
  private List<LineItems> lineItems = null;

  @SerializedName("metadata")
  private Map<String, String> metadata = null;

  @SerializedName("payment_instructions")
  private String paymentInstructions = null;

  @SerializedName("payment_terms")
  private String paymentTerms = null;

  @SerializedName("secondary_id")
  private String secondaryId = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("total_amount")
  private Double totalAmount = null;

  @SerializedName("total_discount")
  private Double totalDiscount = null;

  @SerializedName("total_due")
  private Double totalDue = null;

  @SerializedName("total_subtotal")
  private Double totalSubtotal = null;

  @SerializedName("total_tax")
  private Double totalTax = null;

  @SerializedName("update_date")
  private OffsetDateTime updateDate = null;

  public Invoice businessId(UUID businessId) {
    this.businessId = businessId;
    return this;
  }

   /**
   * businessId
   * @return businessId
  **/
  @ApiModelProperty(example = "50d76212-0fcd-4d36-8633-e4a52cbcb79f", value = "businessId")
  public UUID getBusinessId() {
    return businessId;
  }

  public void setBusinessId(UUID businessId) {
    this.businessId = businessId;
  }

  public Invoice clientId(UUID clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * client_id
   * @return clientId
  **/
  @ApiModelProperty(example = "5cc48294-5f28-41f2-8eb4-898e83932327", value = "client_id")
  public UUID getClientId() {
    return clientId;
  }

  public void setClientId(UUID clientId) {
    this.clientId = clientId;
  }

  public Invoice contactId(UUID contactId) {
    this.contactId = contactId;
    return this;
  }

   /**
   * contact_id
   * @return contactId
  **/
  @ApiModelProperty(example = "14566616-6846-4090-beae-5b1568b82370", required = true, value = "contact_id")
  public UUID getContactId() {
    return contactId;
  }

  public void setContactId(UUID contactId) {
    this.contactId = contactId;
  }

  public Invoice createDate(OffsetDateTime createDate) {
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

  public Invoice currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * currency_code
   * @return currencyCode
  **/
  @ApiModelProperty(example = "USD", required = true, value = "currency_code")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public Invoice department(String department) {
    this.department = department;
    return this;
  }

   /**
   * department
   * @return department
  **/
  @ApiModelProperty(example = "invoice department", value = "department")
  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public Invoice description(String description) {
    this.description = description;
    return this;
  }

   /**
   * description
   * @return description
  **/
  @ApiModelProperty(example = "invoice description", value = "description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Invoice documentId(UUID documentId) {
    this.documentId = documentId;
    return this;
  }

   /**
   * document_id
   * @return documentId
  **/
  @ApiModelProperty(example = "ffec4069-f3bd-46f0-bf62-c7c77b400e37", value = "document_id")
  public UUID getDocumentId() {
    return documentId;
  }

  public void setDocumentId(UUID documentId) {
    this.documentId = documentId;
  }

  public Invoice dueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
    return this;
  }

   /**
   * due_date
   * @return dueDate
  **/
  @ApiModelProperty(example = "2020-03-18T18:17:23.579+0000", required = true, value = "due_date")
  public OffsetDateTime getDueDate() {
    return dueDate;
  }

  public void setDueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
  }

  public Invoice id(UUID id) {
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

  public Invoice invoiceDate(LocalDate invoiceDate) {
    this.invoiceDate = invoiceDate;
    return this;
  }

   /**
   * invoice_date
   * @return invoiceDate
  **/
  @ApiModelProperty(example = "2020-03-18", required = true, value = "invoice_date")
  public LocalDate getInvoiceDate() {
    return invoiceDate;
  }

  public void setInvoiceDate(LocalDate invoiceDate) {
    this.invoiceDate = invoiceDate;
  }

  public Invoice invoiceName(String invoiceName) {
    this.invoiceName = invoiceName;
    return this;
  }

   /**
   * invoice_name
   * @return invoiceName
  **/
  @ApiModelProperty(example = "Uber invoice", value = "invoice_name")
  public String getInvoiceName() {
    return invoiceName;
  }

  public void setInvoiceName(String invoiceName) {
    this.invoiceName = invoiceName;
  }

  public Invoice invoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * invoice_number
   * @return invoiceNumber
  **/
  @ApiModelProperty(example = "2334889", required = true, value = "invoice_number")
  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public Invoice isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * is_active
   * @return isActive
  **/
  @ApiModelProperty(example = "true", value = "is_active")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public Invoice isBill(Boolean isBill) {
    this.isBill = isBill;
    return this;
  }

   /**
   * is_bill
   * @return isBill
  **/
  @ApiModelProperty(example = "false", value = "is_bill")
  public Boolean isIsBill() {
    return isBill;
  }

  public void setIsBill(Boolean isBill) {
    this.isBill = isBill;
  }

  public Invoice lineItems(List<LineItems> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public Invoice addLineItemsItem(LineItems lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<LineItems>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * lineItems
   * @return lineItems
  **/
  @ApiModelProperty(example = "[]", value = "lineItems")
  public List<LineItems> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<LineItems> lineItems) {
    this.lineItems = lineItems;
  }

  public Invoice metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public Invoice putMetadataItem(String key, String metadataItem) {
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
  @ApiModelProperty(example = "{}", value = "")
  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

  public Invoice paymentInstructions(String paymentInstructions) {
    this.paymentInstructions = paymentInstructions;
    return this;
  }

   /**
   * paymentInstructions
   * @return paymentInstructions
  **/
  @ApiModelProperty(example = "payment instructions", value = "paymentInstructions")
  public String getPaymentInstructions() {
    return paymentInstructions;
  }

  public void setPaymentInstructions(String paymentInstructions) {
    this.paymentInstructions = paymentInstructions;
  }

  public Invoice paymentTerms(String paymentTerms) {
    this.paymentTerms = paymentTerms;
    return this;
  }

   /**
   * paymentTerms
   * @return paymentTerms
  **/
  @ApiModelProperty(example = "payment terms", value = "paymentTerms")
  public String getPaymentTerms() {
    return paymentTerms;
  }

  public void setPaymentTerms(String paymentTerms) {
    this.paymentTerms = paymentTerms;
  }

  public Invoice secondaryId(String secondaryId) {
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

  public Invoice status(String status) {
    this.status = status;
    return this;
  }

   /**
   * status
   * @return status
  **/
  @ApiModelProperty(example = "2020-03-18T18:17:23.579+0000", value = "status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Invoice totalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * totalAmount
   * @return totalAmount
  **/
  @ApiModelProperty(example = "12.0", required = true, value = "totalAmount")
  public Double getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
  }

  public Invoice totalDiscount(Double totalDiscount) {
    this.totalDiscount = totalDiscount;
    return this;
  }

   /**
   * totalDiscount
   * @return totalDiscount
  **/
  @ApiModelProperty(example = "10000.0", value = "totalDiscount")
  public Double getTotalDiscount() {
    return totalDiscount;
  }

  public void setTotalDiscount(Double totalDiscount) {
    this.totalDiscount = totalDiscount;
  }

  public Invoice totalDue(Double totalDue) {
    this.totalDue = totalDue;
    return this;
  }

   /**
   * totalDue
   * @return totalDue
  **/
  @ApiModelProperty(example = "10000.0", value = "totalDue")
  public Double getTotalDue() {
    return totalDue;
  }

  public void setTotalDue(Double totalDue) {
    this.totalDue = totalDue;
  }

  public Invoice totalSubtotal(Double totalSubtotal) {
    this.totalSubtotal = totalSubtotal;
    return this;
  }

   /**
   * totalSubtotal
   * @return totalSubtotal
  **/
  @ApiModelProperty(example = "10000.0", value = "totalSubtotal")
  public Double getTotalSubtotal() {
    return totalSubtotal;
  }

  public void setTotalSubtotal(Double totalSubtotal) {
    this.totalSubtotal = totalSubtotal;
  }

  public Invoice totalTax(Double totalTax) {
    this.totalTax = totalTax;
    return this;
  }

   /**
   * totalTax
   * @return totalTax
  **/
  @ApiModelProperty(example = "10000.0", value = "totalTax")
  public Double getTotalTax() {
    return totalTax;
  }

  public void setTotalTax(Double totalTax) {
    this.totalTax = totalTax;
  }

  public Invoice updateDate(OffsetDateTime updateDate) {
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
    Invoice invoice = (Invoice) o;
    return Objects.equals(this.businessId, invoice.businessId) &&
        Objects.equals(this.clientId, invoice.clientId) &&
        Objects.equals(this.contactId, invoice.contactId) &&
        Objects.equals(this.createDate, invoice.createDate) &&
        Objects.equals(this.currencyCode, invoice.currencyCode) &&
        Objects.equals(this.department, invoice.department) &&
        Objects.equals(this.description, invoice.description) &&
        Objects.equals(this.documentId, invoice.documentId) &&
        Objects.equals(this.dueDate, invoice.dueDate) &&
        Objects.equals(this.id, invoice.id) &&
        Objects.equals(this.invoiceDate, invoice.invoiceDate) &&
        Objects.equals(this.invoiceName, invoice.invoiceName) &&
        Objects.equals(this.invoiceNumber, invoice.invoiceNumber) &&
        Objects.equals(this.isActive, invoice.isActive) &&
        Objects.equals(this.isBill, invoice.isBill) &&
        Objects.equals(this.lineItems, invoice.lineItems) &&
        Objects.equals(this.metadata, invoice.metadata) &&
        Objects.equals(this.paymentInstructions, invoice.paymentInstructions) &&
        Objects.equals(this.paymentTerms, invoice.paymentTerms) &&
        Objects.equals(this.secondaryId, invoice.secondaryId) &&
        Objects.equals(this.status, invoice.status) &&
        Objects.equals(this.totalAmount, invoice.totalAmount) &&
        Objects.equals(this.totalDiscount, invoice.totalDiscount) &&
        Objects.equals(this.totalDue, invoice.totalDue) &&
        Objects.equals(this.totalSubtotal, invoice.totalSubtotal) &&
        Objects.equals(this.totalTax, invoice.totalTax) &&
        Objects.equals(this.updateDate, invoice.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessId, clientId, contactId, createDate, currencyCode, department, description, documentId, dueDate, id, invoiceDate, invoiceName, invoiceNumber, isActive, isBill, lineItems, metadata, paymentInstructions, paymentTerms, secondaryId, status, totalAmount, totalDiscount, totalDue, totalSubtotal, totalTax, updateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invoice {\n");
    
    sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    invoiceDate: ").append(toIndentedString(invoiceDate)).append("\n");
    sb.append("    invoiceName: ").append(toIndentedString(invoiceName)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isBill: ").append(toIndentedString(isBill)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    paymentInstructions: ").append(toIndentedString(paymentInstructions)).append("\n");
    sb.append("    paymentTerms: ").append(toIndentedString(paymentTerms)).append("\n");
    sb.append("    secondaryId: ").append(toIndentedString(secondaryId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    totalDiscount: ").append(toIndentedString(totalDiscount)).append("\n");
    sb.append("    totalDue: ").append(toIndentedString(totalDue)).append("\n");
    sb.append("    totalSubtotal: ").append(toIndentedString(totalSubtotal)).append("\n");
    sb.append("    totalTax: ").append(toIndentedString(totalTax)).append("\n");
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

