/* 
 * Hydrogen Nucleus API
 *
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.4
 * Contact: info@hydrogenplatform.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using SwaggerDateConverter = Nucleus.Client.SwaggerDateConverter;

namespace Nucleus.ModelEntity
{
    /// <summary>
    /// Funding Object
    /// </summary>
    [DataContract]
    public partial class Funding :  IEquatable<Funding>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Funding" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Funding() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Funding" /> class.
        /// </summary>
        /// <param name="accountId">accountId.</param>
        /// <param name="amount">amount.</param>
        /// <param name="bankLinkId">bankLinkId.</param>
        /// <param name="businessId">businessId.</param>
        /// <param name="cardId">cardId.</param>
        /// <param name="createDate">createDate.</param>
        /// <param name="currencyCode">currencyCode.</param>
        /// <param name="description">description.</param>
        /// <param name="endDate">endDate.</param>
        /// <param name="frequency">frequency.</param>
        /// <param name="frequencyUnit">frequencyUnit (required).</param>
        /// <param name="fundingStatus">fundingStatus (required).</param>
        /// <param name="fundingType">fundingType (required).</param>
        /// <param name="id">id.</param>
        /// <param name="isActive">isActive.</param>
        /// <param name="isDeposit">isDeposit (required).</param>
        /// <param name="lastRequestDate">lastRequestDate.</param>
        /// <param name="metadata">metadata.</param>
        /// <param name="nextRequestDate">nextRequestDate.</param>
        /// <param name="portfolioId">portfolioId.</param>
        /// <param name="receivingAccountId">receivingAccountId.</param>
        /// <param name="receivingBankLinkId">receivingBankLinkId.</param>
        /// <param name="receivingPortfolioId">receivingPortfolioId.</param>
        /// <param name="secondaryId">secondaryId.</param>
        /// <param name="startDate">startDate (required).</param>
        /// <param name="supportTicketId">supportTicketId.</param>
        /// <param name="thresholdAmount">thresholdAmount.</param>
        /// <param name="transferId">transferId.</param>
        /// <param name="transferSpeed">transferSpeed.</param>
        /// <param name="transferType">transferType.</param>
        /// <param name="updateDate">updateDate.</param>
        public Funding(Guid? accountId = default(Guid?), double? amount = default(double?), Guid? bankLinkId = default(Guid?), Guid? businessId = default(Guid?), Guid? cardId = default(Guid?), DateTime? createDate = default(DateTime?), string currencyCode = default(string), string description = default(string), DateTime? endDate = default(DateTime?), int? frequency = default(int?), string frequencyUnit = default(string), string fundingStatus = default(string), string fundingType = default(string), Guid? id = default(Guid?), bool? isActive = default(bool?), bool? isDeposit = default(bool?), DateTime? lastRequestDate = default(DateTime?), Dictionary<string, string> metadata = default(Dictionary<string, string>), DateTime? nextRequestDate = default(DateTime?), Guid? portfolioId = default(Guid?), Guid? receivingAccountId = default(Guid?), Guid? receivingBankLinkId = default(Guid?), Guid? receivingPortfolioId = default(Guid?), string secondaryId = default(string), DateTime? startDate = default(DateTime?), Guid? supportTicketId = default(Guid?), double? thresholdAmount = default(double?), Guid? transferId = default(Guid?), string transferSpeed = default(string), string transferType = default(string), DateTime? updateDate = default(DateTime?))
        {
            // to ensure "frequencyUnit" is required (not null)
            if (frequencyUnit == null)
            {
                throw new InvalidDataException("frequencyUnit is a required property for Funding and cannot be null");
            }
            else
            {
                this.FrequencyUnit = frequencyUnit;
            }
            // to ensure "fundingStatus" is required (not null)
            if (fundingStatus == null)
            {
                throw new InvalidDataException("fundingStatus is a required property for Funding and cannot be null");
            }
            else
            {
                this.FundingStatus = fundingStatus;
            }
            // to ensure "fundingType" is required (not null)
            if (fundingType == null)
            {
                throw new InvalidDataException("fundingType is a required property for Funding and cannot be null");
            }
            else
            {
                this.FundingType = fundingType;
            }
            // to ensure "isDeposit" is required (not null)
            if (isDeposit == null)
            {
                throw new InvalidDataException("isDeposit is a required property for Funding and cannot be null");
            }
            else
            {
                this.IsDeposit = isDeposit;
            }
            // to ensure "startDate" is required (not null)
            if (startDate == null)
            {
                throw new InvalidDataException("startDate is a required property for Funding and cannot be null");
            }
            else
            {
                this.StartDate = startDate;
            }
            this.AccountId = accountId;
            this.Amount = amount;
            this.BankLinkId = bankLinkId;
            this.BusinessId = businessId;
            this.CardId = cardId;
            this.CreateDate = createDate;
            this.CurrencyCode = currencyCode;
            this.Description = description;
            this.EndDate = endDate;
            this.Frequency = frequency;
            this.Id = id;
            this.IsActive = isActive;
            this.LastRequestDate = lastRequestDate;
            this.Metadata = metadata;
            this.NextRequestDate = nextRequestDate;
            this.PortfolioId = portfolioId;
            this.ReceivingAccountId = receivingAccountId;
            this.ReceivingBankLinkId = receivingBankLinkId;
            this.ReceivingPortfolioId = receivingPortfolioId;
            this.SecondaryId = secondaryId;
            this.SupportTicketId = supportTicketId;
            this.ThresholdAmount = thresholdAmount;
            this.TransferId = transferId;
            this.TransferSpeed = transferSpeed;
            this.TransferType = transferType;
            this.UpdateDate = updateDate;
        }
        
        /// <summary>
        /// accountId
        /// </summary>
        /// <value>accountId</value>
        [DataMember(Name="account_id", EmitDefaultValue=false)]
        public Guid? AccountId { get; set; }

        /// <summary>
        /// amount
        /// </summary>
        /// <value>amount</value>
        [DataMember(Name="amount", EmitDefaultValue=false)]
        public double? Amount { get; set; }

        /// <summary>
        /// bankLinkId
        /// </summary>
        /// <value>bankLinkId</value>
        [DataMember(Name="bank_link_id", EmitDefaultValue=false)]
        public Guid? BankLinkId { get; set; }

        /// <summary>
        /// businessId
        /// </summary>
        /// <value>businessId</value>
        [DataMember(Name="business_id", EmitDefaultValue=false)]
        public Guid? BusinessId { get; set; }

        /// <summary>
        /// cardId
        /// </summary>
        /// <value>cardId</value>
        [DataMember(Name="card_id", EmitDefaultValue=false)]
        public Guid? CardId { get; set; }

        /// <summary>
        /// Gets or Sets CreateDate
        /// </summary>
        [DataMember(Name="create_date", EmitDefaultValue=false)]
        public DateTime? CreateDate { get; set; }

        /// <summary>
        /// currencyCode
        /// </summary>
        /// <value>currencyCode</value>
        [DataMember(Name="currency_code", EmitDefaultValue=false)]
        public string CurrencyCode { get; set; }

        /// <summary>
        /// description
        /// </summary>
        /// <value>description</value>
        [DataMember(Name="description", EmitDefaultValue=false)]
        public string Description { get; set; }

        /// <summary>
        /// endDate
        /// </summary>
        /// <value>endDate</value>
        [DataMember(Name="end_date", EmitDefaultValue=false)]
        [JsonConverter(typeof(SwaggerDateConverter))]
        public DateTime? EndDate { get; set; }

        /// <summary>
        /// frequency
        /// </summary>
        /// <value>frequency</value>
        [DataMember(Name="frequency", EmitDefaultValue=false)]
        public int? Frequency { get; set; }

        /// <summary>
        /// frequencyUnit
        /// </summary>
        /// <value>frequencyUnit</value>
        [DataMember(Name="frequency_unit", EmitDefaultValue=false)]
        public string FrequencyUnit { get; set; }

        /// <summary>
        /// fundingStatus
        /// </summary>
        /// <value>fundingStatus</value>
        [DataMember(Name="funding_status", EmitDefaultValue=false)]
        public string FundingStatus { get; set; }

        /// <summary>
        /// fundingType
        /// </summary>
        /// <value>fundingType</value>
        [DataMember(Name="funding_type", EmitDefaultValue=false)]
        public string FundingType { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public Guid? Id { get; set; }

        /// <summary>
        /// isActive
        /// </summary>
        /// <value>isActive</value>
        [DataMember(Name="is_active", EmitDefaultValue=false)]
        public bool? IsActive { get; set; }

        /// <summary>
        /// isDeposit
        /// </summary>
        /// <value>isDeposit</value>
        [DataMember(Name="is_deposit", EmitDefaultValue=false)]
        public bool? IsDeposit { get; set; }

        /// <summary>
        /// lastRequestDate
        /// </summary>
        /// <value>lastRequestDate</value>
        [DataMember(Name="last_request_date", EmitDefaultValue=false)]
        [JsonConverter(typeof(SwaggerDateConverter))]
        public DateTime? LastRequestDate { get; set; }

        /// <summary>
        /// metadata
        /// </summary>
        /// <value>metadata</value>
        [DataMember(Name="metadata", EmitDefaultValue=false)]
        public Dictionary<string, string> Metadata { get; set; }

        /// <summary>
        /// nextRequestDate
        /// </summary>
        /// <value>nextRequestDate</value>
        [DataMember(Name="next_request_date", EmitDefaultValue=false)]
        [JsonConverter(typeof(SwaggerDateConverter))]
        public DateTime? NextRequestDate { get; set; }

        /// <summary>
        /// portfolioId
        /// </summary>
        /// <value>portfolioId</value>
        [DataMember(Name="portfolio_id", EmitDefaultValue=false)]
        public Guid? PortfolioId { get; set; }

        /// <summary>
        /// receivingAccountId
        /// </summary>
        /// <value>receivingAccountId</value>
        [DataMember(Name="receiving_account_id", EmitDefaultValue=false)]
        public Guid? ReceivingAccountId { get; set; }

        /// <summary>
        /// receivingBankLinkId
        /// </summary>
        /// <value>receivingBankLinkId</value>
        [DataMember(Name="receiving_bank_link_id", EmitDefaultValue=false)]
        public Guid? ReceivingBankLinkId { get; set; }

        /// <summary>
        /// receivingPortfolioId
        /// </summary>
        /// <value>receivingPortfolioId</value>
        [DataMember(Name="receiving_portfolio_id", EmitDefaultValue=false)]
        public Guid? ReceivingPortfolioId { get; set; }

        /// <summary>
        /// Gets or Sets SecondaryId
        /// </summary>
        [DataMember(Name="secondary_id", EmitDefaultValue=false)]
        public string SecondaryId { get; set; }

        /// <summary>
        /// startDate
        /// </summary>
        /// <value>startDate</value>
        [DataMember(Name="start_date", EmitDefaultValue=false)]
        [JsonConverter(typeof(SwaggerDateConverter))]
        public DateTime? StartDate { get; set; }

        /// <summary>
        /// supportTicketId
        /// </summary>
        /// <value>supportTicketId</value>
        [DataMember(Name="support_ticket_id", EmitDefaultValue=false)]
        public Guid? SupportTicketId { get; set; }

        /// <summary>
        /// thresholdAmount
        /// </summary>
        /// <value>thresholdAmount</value>
        [DataMember(Name="threshold_amount", EmitDefaultValue=false)]
        public double? ThresholdAmount { get; set; }

        /// <summary>
        /// transferId
        /// </summary>
        /// <value>transferId</value>
        [DataMember(Name="transfer_id", EmitDefaultValue=false)]
        public Guid? TransferId { get; set; }

        /// <summary>
        /// transferSpeed
        /// </summary>
        /// <value>transferSpeed</value>
        [DataMember(Name="transfer_speed", EmitDefaultValue=false)]
        public string TransferSpeed { get; set; }

        /// <summary>
        /// transferType
        /// </summary>
        /// <value>transferType</value>
        [DataMember(Name="transfer_type", EmitDefaultValue=false)]
        public string TransferType { get; set; }

        /// <summary>
        /// Gets or Sets UpdateDate
        /// </summary>
        [DataMember(Name="update_date", EmitDefaultValue=false)]
        public DateTime? UpdateDate { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Funding {\n");
            sb.Append("  AccountId: ").Append(AccountId).Append("\n");
            sb.Append("  Amount: ").Append(Amount).Append("\n");
            sb.Append("  BankLinkId: ").Append(BankLinkId).Append("\n");
            sb.Append("  BusinessId: ").Append(BusinessId).Append("\n");
            sb.Append("  CardId: ").Append(CardId).Append("\n");
            sb.Append("  CreateDate: ").Append(CreateDate).Append("\n");
            sb.Append("  CurrencyCode: ").Append(CurrencyCode).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  EndDate: ").Append(EndDate).Append("\n");
            sb.Append("  Frequency: ").Append(Frequency).Append("\n");
            sb.Append("  FrequencyUnit: ").Append(FrequencyUnit).Append("\n");
            sb.Append("  FundingStatus: ").Append(FundingStatus).Append("\n");
            sb.Append("  FundingType: ").Append(FundingType).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  IsActive: ").Append(IsActive).Append("\n");
            sb.Append("  IsDeposit: ").Append(IsDeposit).Append("\n");
            sb.Append("  LastRequestDate: ").Append(LastRequestDate).Append("\n");
            sb.Append("  Metadata: ").Append(Metadata).Append("\n");
            sb.Append("  NextRequestDate: ").Append(NextRequestDate).Append("\n");
            sb.Append("  PortfolioId: ").Append(PortfolioId).Append("\n");
            sb.Append("  ReceivingAccountId: ").Append(ReceivingAccountId).Append("\n");
            sb.Append("  ReceivingBankLinkId: ").Append(ReceivingBankLinkId).Append("\n");
            sb.Append("  ReceivingPortfolioId: ").Append(ReceivingPortfolioId).Append("\n");
            sb.Append("  SecondaryId: ").Append(SecondaryId).Append("\n");
            sb.Append("  StartDate: ").Append(StartDate).Append("\n");
            sb.Append("  SupportTicketId: ").Append(SupportTicketId).Append("\n");
            sb.Append("  ThresholdAmount: ").Append(ThresholdAmount).Append("\n");
            sb.Append("  TransferId: ").Append(TransferId).Append("\n");
            sb.Append("  TransferSpeed: ").Append(TransferSpeed).Append("\n");
            sb.Append("  TransferType: ").Append(TransferType).Append("\n");
            sb.Append("  UpdateDate: ").Append(UpdateDate).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as Funding);
        }

        /// <summary>
        /// Returns true if Funding instances are equal
        /// </summary>
        /// <param name="input">Instance of Funding to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Funding input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.AccountId == input.AccountId ||
                    (this.AccountId != null &&
                    this.AccountId.Equals(input.AccountId))
                ) && 
                (
                    this.Amount == input.Amount ||
                    (this.Amount != null &&
                    this.Amount.Equals(input.Amount))
                ) && 
                (
                    this.BankLinkId == input.BankLinkId ||
                    (this.BankLinkId != null &&
                    this.BankLinkId.Equals(input.BankLinkId))
                ) && 
                (
                    this.BusinessId == input.BusinessId ||
                    (this.BusinessId != null &&
                    this.BusinessId.Equals(input.BusinessId))
                ) && 
                (
                    this.CardId == input.CardId ||
                    (this.CardId != null &&
                    this.CardId.Equals(input.CardId))
                ) && 
                (
                    this.CreateDate == input.CreateDate ||
                    (this.CreateDate != null &&
                    this.CreateDate.Equals(input.CreateDate))
                ) && 
                (
                    this.CurrencyCode == input.CurrencyCode ||
                    (this.CurrencyCode != null &&
                    this.CurrencyCode.Equals(input.CurrencyCode))
                ) && 
                (
                    this.Description == input.Description ||
                    (this.Description != null &&
                    this.Description.Equals(input.Description))
                ) && 
                (
                    this.EndDate == input.EndDate ||
                    (this.EndDate != null &&
                    this.EndDate.Equals(input.EndDate))
                ) && 
                (
                    this.Frequency == input.Frequency ||
                    (this.Frequency != null &&
                    this.Frequency.Equals(input.Frequency))
                ) && 
                (
                    this.FrequencyUnit == input.FrequencyUnit ||
                    (this.FrequencyUnit != null &&
                    this.FrequencyUnit.Equals(input.FrequencyUnit))
                ) && 
                (
                    this.FundingStatus == input.FundingStatus ||
                    (this.FundingStatus != null &&
                    this.FundingStatus.Equals(input.FundingStatus))
                ) && 
                (
                    this.FundingType == input.FundingType ||
                    (this.FundingType != null &&
                    this.FundingType.Equals(input.FundingType))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.IsActive == input.IsActive ||
                    (this.IsActive != null &&
                    this.IsActive.Equals(input.IsActive))
                ) && 
                (
                    this.IsDeposit == input.IsDeposit ||
                    (this.IsDeposit != null &&
                    this.IsDeposit.Equals(input.IsDeposit))
                ) && 
                (
                    this.LastRequestDate == input.LastRequestDate ||
                    (this.LastRequestDate != null &&
                    this.LastRequestDate.Equals(input.LastRequestDate))
                ) && 
                (
                    this.Metadata == input.Metadata ||
                    this.Metadata != null &&
                    this.Metadata.SequenceEqual(input.Metadata)
                ) && 
                (
                    this.NextRequestDate == input.NextRequestDate ||
                    (this.NextRequestDate != null &&
                    this.NextRequestDate.Equals(input.NextRequestDate))
                ) && 
                (
                    this.PortfolioId == input.PortfolioId ||
                    (this.PortfolioId != null &&
                    this.PortfolioId.Equals(input.PortfolioId))
                ) && 
                (
                    this.ReceivingAccountId == input.ReceivingAccountId ||
                    (this.ReceivingAccountId != null &&
                    this.ReceivingAccountId.Equals(input.ReceivingAccountId))
                ) && 
                (
                    this.ReceivingBankLinkId == input.ReceivingBankLinkId ||
                    (this.ReceivingBankLinkId != null &&
                    this.ReceivingBankLinkId.Equals(input.ReceivingBankLinkId))
                ) && 
                (
                    this.ReceivingPortfolioId == input.ReceivingPortfolioId ||
                    (this.ReceivingPortfolioId != null &&
                    this.ReceivingPortfolioId.Equals(input.ReceivingPortfolioId))
                ) && 
                (
                    this.SecondaryId == input.SecondaryId ||
                    (this.SecondaryId != null &&
                    this.SecondaryId.Equals(input.SecondaryId))
                ) && 
                (
                    this.StartDate == input.StartDate ||
                    (this.StartDate != null &&
                    this.StartDate.Equals(input.StartDate))
                ) && 
                (
                    this.SupportTicketId == input.SupportTicketId ||
                    (this.SupportTicketId != null &&
                    this.SupportTicketId.Equals(input.SupportTicketId))
                ) && 
                (
                    this.ThresholdAmount == input.ThresholdAmount ||
                    (this.ThresholdAmount != null &&
                    this.ThresholdAmount.Equals(input.ThresholdAmount))
                ) && 
                (
                    this.TransferId == input.TransferId ||
                    (this.TransferId != null &&
                    this.TransferId.Equals(input.TransferId))
                ) && 
                (
                    this.TransferSpeed == input.TransferSpeed ||
                    (this.TransferSpeed != null &&
                    this.TransferSpeed.Equals(input.TransferSpeed))
                ) && 
                (
                    this.TransferType == input.TransferType ||
                    (this.TransferType != null &&
                    this.TransferType.Equals(input.TransferType))
                ) && 
                (
                    this.UpdateDate == input.UpdateDate ||
                    (this.UpdateDate != null &&
                    this.UpdateDate.Equals(input.UpdateDate))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.AccountId != null)
                    hashCode = hashCode * 59 + this.AccountId.GetHashCode();
                if (this.Amount != null)
                    hashCode = hashCode * 59 + this.Amount.GetHashCode();
                if (this.BankLinkId != null)
                    hashCode = hashCode * 59 + this.BankLinkId.GetHashCode();
                if (this.BusinessId != null)
                    hashCode = hashCode * 59 + this.BusinessId.GetHashCode();
                if (this.CardId != null)
                    hashCode = hashCode * 59 + this.CardId.GetHashCode();
                if (this.CreateDate != null)
                    hashCode = hashCode * 59 + this.CreateDate.GetHashCode();
                if (this.CurrencyCode != null)
                    hashCode = hashCode * 59 + this.CurrencyCode.GetHashCode();
                if (this.Description != null)
                    hashCode = hashCode * 59 + this.Description.GetHashCode();
                if (this.EndDate != null)
                    hashCode = hashCode * 59 + this.EndDate.GetHashCode();
                if (this.Frequency != null)
                    hashCode = hashCode * 59 + this.Frequency.GetHashCode();
                if (this.FrequencyUnit != null)
                    hashCode = hashCode * 59 + this.FrequencyUnit.GetHashCode();
                if (this.FundingStatus != null)
                    hashCode = hashCode * 59 + this.FundingStatus.GetHashCode();
                if (this.FundingType != null)
                    hashCode = hashCode * 59 + this.FundingType.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.IsActive != null)
                    hashCode = hashCode * 59 + this.IsActive.GetHashCode();
                if (this.IsDeposit != null)
                    hashCode = hashCode * 59 + this.IsDeposit.GetHashCode();
                if (this.LastRequestDate != null)
                    hashCode = hashCode * 59 + this.LastRequestDate.GetHashCode();
                if (this.Metadata != null)
                    hashCode = hashCode * 59 + this.Metadata.GetHashCode();
                if (this.NextRequestDate != null)
                    hashCode = hashCode * 59 + this.NextRequestDate.GetHashCode();
                if (this.PortfolioId != null)
                    hashCode = hashCode * 59 + this.PortfolioId.GetHashCode();
                if (this.ReceivingAccountId != null)
                    hashCode = hashCode * 59 + this.ReceivingAccountId.GetHashCode();
                if (this.ReceivingBankLinkId != null)
                    hashCode = hashCode * 59 + this.ReceivingBankLinkId.GetHashCode();
                if (this.ReceivingPortfolioId != null)
                    hashCode = hashCode * 59 + this.ReceivingPortfolioId.GetHashCode();
                if (this.SecondaryId != null)
                    hashCode = hashCode * 59 + this.SecondaryId.GetHashCode();
                if (this.StartDate != null)
                    hashCode = hashCode * 59 + this.StartDate.GetHashCode();
                if (this.SupportTicketId != null)
                    hashCode = hashCode * 59 + this.SupportTicketId.GetHashCode();
                if (this.ThresholdAmount != null)
                    hashCode = hashCode * 59 + this.ThresholdAmount.GetHashCode();
                if (this.TransferId != null)
                    hashCode = hashCode * 59 + this.TransferId.GetHashCode();
                if (this.TransferSpeed != null)
                    hashCode = hashCode * 59 + this.TransferSpeed.GetHashCode();
                if (this.TransferType != null)
                    hashCode = hashCode * 59 + this.TransferType.GetHashCode();
                if (this.UpdateDate != null)
                    hashCode = hashCode * 59 + this.UpdateDate.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}