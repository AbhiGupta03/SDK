/* 
 * Hydrogen Integration API
 *
 * The Hydrogen Integration API
 *
 * OpenAPI spec version: 1.3.1
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
using SwaggerDateConverter = Integration.Client.SwaggerDateConverter;

namespace Integration.ModelEntity
{
    /// <summary>
    /// Aggregation Account Transaction Object
    /// </summary>
    [DataContract]
    public partial class AggregationAccountTransaction :  IEquatable<AggregationAccountTransaction>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AggregationAccountTransaction" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected AggregationAccountTransaction() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="AggregationAccountTransaction" /> class.
        /// </summary>
        /// <param name="aggregationAccountId">aggregationAccountId.</param>
        /// <param name="bankCredit">bankCredit.</param>
        /// <param name="cash">cash.</param>
        /// <param name="createDate">createDate.</param>
        /// <param name="currencyCode">currencyCode (required).</param>
        /// <param name="id">id.</param>
        /// <param name="investment">investment.</param>
        /// <param name="isActive">isActive.</param>
        /// <param name="isExcludedAnalysis">is_excluded_analysis.</param>
        /// <param name="isRecurring">isRecurring.</param>
        /// <param name="metadata">metadata.</param>
        /// <param name="secondaryId">secondaryId.</param>
        /// <param name="status">status.</param>
        /// <param name="transactionDate">transactionDate (required).</param>
        /// <param name="updateDate">updateDate.</param>
        public AggregationAccountTransaction(Guid? aggregationAccountId = default(Guid?), BankCredit bankCredit = default(BankCredit), Cash cash = default(Cash), DateTime? createDate = default(DateTime?), string currencyCode = default(string), Guid? id = default(Guid?), Investment investment = default(Investment), bool? isActive = default(bool?), bool? isExcludedAnalysis = default(bool?), bool? isRecurring = default(bool?), Dictionary<string, string> metadata = default(Dictionary<string, string>), string secondaryId = default(string), string status = default(string), DateTime? transactionDate = default(DateTime?), DateTime? updateDate = default(DateTime?))
        {
            // to ensure "currencyCode" is required (not null)
            if (currencyCode == null)
            {
                throw new InvalidDataException("currencyCode is a required property for AggregationAccountTransaction and cannot be null");
            }
            else
            {
                this.CurrencyCode = currencyCode;
            }
            // to ensure "transactionDate" is required (not null)
            if (transactionDate == null)
            {
                throw new InvalidDataException("transactionDate is a required property for AggregationAccountTransaction and cannot be null");
            }
            else
            {
                this.TransactionDate = transactionDate;
            }
            this.AggregationAccountId = aggregationAccountId;
            this.BankCredit = bankCredit;
            this.Cash = cash;
            this.CreateDate = createDate;
            this.Id = id;
            this.Investment = investment;
            this.IsActive = isActive;
            this.IsExcludedAnalysis = isExcludedAnalysis;
            this.IsRecurring = isRecurring;
            this.Metadata = metadata;
            this.SecondaryId = secondaryId;
            this.Status = status;
            this.UpdateDate = updateDate;
        }
        
        /// <summary>
        /// aggregationAccountId
        /// </summary>
        /// <value>aggregationAccountId</value>
        [DataMember(Name="aggregation_account_id", EmitDefaultValue=false)]
        public Guid? AggregationAccountId { get; set; }

        /// <summary>
        /// Gets or Sets BankCredit
        /// </summary>
        [DataMember(Name="bank_credit", EmitDefaultValue=false)]
        public BankCredit BankCredit { get; set; }

        /// <summary>
        /// Gets or Sets Cash
        /// </summary>
        [DataMember(Name="cash", EmitDefaultValue=false)]
        public Cash Cash { get; set; }

        /// <summary>
        /// createDate
        /// </summary>
        /// <value>createDate</value>
        [DataMember(Name="create_date", EmitDefaultValue=false)]
        public DateTime? CreateDate { get; set; }

        /// <summary>
        /// currencyCode
        /// </summary>
        /// <value>currencyCode</value>
        [DataMember(Name="currency_code", EmitDefaultValue=false)]
        public string CurrencyCode { get; set; }

        /// <summary>
        /// id
        /// </summary>
        /// <value>id</value>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public Guid? Id { get; set; }

        /// <summary>
        /// Gets or Sets Investment
        /// </summary>
        [DataMember(Name="investment", EmitDefaultValue=false)]
        public Investment Investment { get; set; }

        /// <summary>
        /// isActive
        /// </summary>
        /// <value>isActive</value>
        [DataMember(Name="is_active", EmitDefaultValue=false)]
        public bool? IsActive { get; set; }

        /// <summary>
        /// is_excluded_analysis
        /// </summary>
        /// <value>is_excluded_analysis</value>
        [DataMember(Name="is_excluded_analysis", EmitDefaultValue=false)]
        public bool? IsExcludedAnalysis { get; set; }

        /// <summary>
        /// Gets or Sets IsRecurring
        /// </summary>
        [DataMember(Name="is_recurring", EmitDefaultValue=false)]
        public bool? IsRecurring { get; set; }

        /// <summary>
        /// Gets or Sets Metadata
        /// </summary>
        [DataMember(Name="metadata", EmitDefaultValue=false)]
        public Dictionary<string, string> Metadata { get; set; }

        /// <summary>
        /// Gets or Sets SecondaryId
        /// </summary>
        [DataMember(Name="secondary_id", EmitDefaultValue=false)]
        public string SecondaryId { get; set; }

        /// <summary>
        /// status
        /// </summary>
        /// <value>status</value>
        [DataMember(Name="status", EmitDefaultValue=false)]
        public string Status { get; set; }

        /// <summary>
        /// transactionDate
        /// </summary>
        /// <value>transactionDate</value>
        [DataMember(Name="transaction_date", EmitDefaultValue=false)]
        public DateTime? TransactionDate { get; set; }

        /// <summary>
        /// updateDate
        /// </summary>
        /// <value>updateDate</value>
        [DataMember(Name="update_date", EmitDefaultValue=false)]
        public DateTime? UpdateDate { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AggregationAccountTransaction {\n");
            sb.Append("  AggregationAccountId: ").Append(AggregationAccountId).Append("\n");
            sb.Append("  BankCredit: ").Append(BankCredit).Append("\n");
            sb.Append("  Cash: ").Append(Cash).Append("\n");
            sb.Append("  CreateDate: ").Append(CreateDate).Append("\n");
            sb.Append("  CurrencyCode: ").Append(CurrencyCode).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Investment: ").Append(Investment).Append("\n");
            sb.Append("  IsActive: ").Append(IsActive).Append("\n");
            sb.Append("  IsExcludedAnalysis: ").Append(IsExcludedAnalysis).Append("\n");
            sb.Append("  IsRecurring: ").Append(IsRecurring).Append("\n");
            sb.Append("  Metadata: ").Append(Metadata).Append("\n");
            sb.Append("  SecondaryId: ").Append(SecondaryId).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  TransactionDate: ").Append(TransactionDate).Append("\n");
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
            return this.Equals(input as AggregationAccountTransaction);
        }

        /// <summary>
        /// Returns true if AggregationAccountTransaction instances are equal
        /// </summary>
        /// <param name="input">Instance of AggregationAccountTransaction to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AggregationAccountTransaction input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.AggregationAccountId == input.AggregationAccountId ||
                    (this.AggregationAccountId != null &&
                    this.AggregationAccountId.Equals(input.AggregationAccountId))
                ) && 
                (
                    this.BankCredit == input.BankCredit ||
                    (this.BankCredit != null &&
                    this.BankCredit.Equals(input.BankCredit))
                ) && 
                (
                    this.Cash == input.Cash ||
                    (this.Cash != null &&
                    this.Cash.Equals(input.Cash))
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
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Investment == input.Investment ||
                    (this.Investment != null &&
                    this.Investment.Equals(input.Investment))
                ) && 
                (
                    this.IsActive == input.IsActive ||
                    (this.IsActive != null &&
                    this.IsActive.Equals(input.IsActive))
                ) && 
                (
                    this.IsExcludedAnalysis == input.IsExcludedAnalysis ||
                    (this.IsExcludedAnalysis != null &&
                    this.IsExcludedAnalysis.Equals(input.IsExcludedAnalysis))
                ) && 
                (
                    this.IsRecurring == input.IsRecurring ||
                    (this.IsRecurring != null &&
                    this.IsRecurring.Equals(input.IsRecurring))
                ) && 
                (
                    this.Metadata == input.Metadata ||
                    this.Metadata != null &&
                    this.Metadata.SequenceEqual(input.Metadata)
                ) && 
                (
                    this.SecondaryId == input.SecondaryId ||
                    (this.SecondaryId != null &&
                    this.SecondaryId.Equals(input.SecondaryId))
                ) && 
                (
                    this.Status == input.Status ||
                    (this.Status != null &&
                    this.Status.Equals(input.Status))
                ) && 
                (
                    this.TransactionDate == input.TransactionDate ||
                    (this.TransactionDate != null &&
                    this.TransactionDate.Equals(input.TransactionDate))
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
                if (this.AggregationAccountId != null)
                    hashCode = hashCode * 59 + this.AggregationAccountId.GetHashCode();
                if (this.BankCredit != null)
                    hashCode = hashCode * 59 + this.BankCredit.GetHashCode();
                if (this.Cash != null)
                    hashCode = hashCode * 59 + this.Cash.GetHashCode();
                if (this.CreateDate != null)
                    hashCode = hashCode * 59 + this.CreateDate.GetHashCode();
                if (this.CurrencyCode != null)
                    hashCode = hashCode * 59 + this.CurrencyCode.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.Investment != null)
                    hashCode = hashCode * 59 + this.Investment.GetHashCode();
                if (this.IsActive != null)
                    hashCode = hashCode * 59 + this.IsActive.GetHashCode();
                if (this.IsExcludedAnalysis != null)
                    hashCode = hashCode * 59 + this.IsExcludedAnalysis.GetHashCode();
                if (this.IsRecurring != null)
                    hashCode = hashCode * 59 + this.IsRecurring.GetHashCode();
                if (this.Metadata != null)
                    hashCode = hashCode * 59 + this.Metadata.GetHashCode();
                if (this.SecondaryId != null)
                    hashCode = hashCode * 59 + this.SecondaryId.GetHashCode();
                if (this.Status != null)
                    hashCode = hashCode * 59 + this.Status.GetHashCode();
                if (this.TransactionDate != null)
                    hashCode = hashCode * 59 + this.TransactionDate.GetHashCode();
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
