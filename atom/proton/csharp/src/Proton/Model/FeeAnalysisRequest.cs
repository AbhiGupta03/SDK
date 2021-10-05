/* 
 * Hydrogen Proton API
 *
 * Financial engineering module of Hydrogen Atom
 *
 * OpenAPI spec version: 1.9.2
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
using SwaggerDateConverter = Proton.Client.SwaggerDateConverter;

namespace Proton.ModelEntity
{
    /// <summary>
    /// FeeAnalysisRequest
    /// </summary>
    [DataContract]
    public partial class FeeAnalysisRequest :  IEquatable<FeeAnalysisRequest>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FeeAnalysisRequest" /> class.
        /// </summary>
        /// <param name="currencyCode">currencyCode.</param>
        /// <param name="clientId">clientId.</param>
        /// <param name="endDate">endDate.</param>
        /// <param name="currencyConversion">currencyConversion.</param>
        /// <param name="startDate">startDate.</param>
        /// <param name="transactionStatusScope">transactionStatusScope.</param>
        /// <param name="aggregationAccountIds">aggregationAccountIds.</param>
        public FeeAnalysisRequest(string currencyCode = default(string), Guid? clientId = default(Guid?), DateTime? endDate = default(DateTime?), string currencyConversion = default(string), DateTime? startDate = default(DateTime?), List<string> transactionStatusScope = default(List<string>), List<Guid?> aggregationAccountIds = default(List<Guid?>))
        {
            this.CurrencyCode = currencyCode;
            this.ClientId = clientId;
            this.EndDate = endDate;
            this.CurrencyConversion = currencyConversion;
            this.StartDate = startDate;
            this.TransactionStatusScope = transactionStatusScope;
            this.AggregationAccountIds = aggregationAccountIds;
        }
        
        /// <summary>
        /// Gets or Sets CurrencyCode
        /// </summary>
        [DataMember(Name="currency_code", EmitDefaultValue=false)]
        public string CurrencyCode { get; set; }

        /// <summary>
        /// Gets or Sets ClientId
        /// </summary>
        [DataMember(Name="client_id", EmitDefaultValue=false)]
        public Guid? ClientId { get; set; }

        /// <summary>
        /// Gets or Sets EndDate
        /// </summary>
        [DataMember(Name="end_date", EmitDefaultValue=false)]
        [JsonConverter(typeof(SwaggerDateConverter))]
        public DateTime? EndDate { get; set; }

        /// <summary>
        /// Gets or Sets CurrencyConversion
        /// </summary>
        [DataMember(Name="currency_conversion", EmitDefaultValue=false)]
        public string CurrencyConversion { get; set; }

        /// <summary>
        /// Gets or Sets StartDate
        /// </summary>
        [DataMember(Name="start_date", EmitDefaultValue=false)]
        [JsonConverter(typeof(SwaggerDateConverter))]
        public DateTime? StartDate { get; set; }

        /// <summary>
        /// Gets or Sets TransactionStatusScope
        /// </summary>
        [DataMember(Name="transaction_status_scope", EmitDefaultValue=false)]
        public List<string> TransactionStatusScope { get; set; }

        /// <summary>
        /// Gets or Sets AggregationAccountIds
        /// </summary>
        [DataMember(Name="aggregation_account_ids", EmitDefaultValue=false)]
        public List<Guid?> AggregationAccountIds { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class FeeAnalysisRequest {\n");
            sb.Append("  CurrencyCode: ").Append(CurrencyCode).Append("\n");
            sb.Append("  ClientId: ").Append(ClientId).Append("\n");
            sb.Append("  EndDate: ").Append(EndDate).Append("\n");
            sb.Append("  CurrencyConversion: ").Append(CurrencyConversion).Append("\n");
            sb.Append("  StartDate: ").Append(StartDate).Append("\n");
            sb.Append("  TransactionStatusScope: ").Append(TransactionStatusScope).Append("\n");
            sb.Append("  AggregationAccountIds: ").Append(AggregationAccountIds).Append("\n");
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
            return this.Equals(input as FeeAnalysisRequest);
        }

        /// <summary>
        /// Returns true if FeeAnalysisRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of FeeAnalysisRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FeeAnalysisRequest input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.CurrencyCode == input.CurrencyCode ||
                    (this.CurrencyCode != null &&
                    this.CurrencyCode.Equals(input.CurrencyCode))
                ) && 
                (
                    this.ClientId == input.ClientId ||
                    (this.ClientId != null &&
                    this.ClientId.Equals(input.ClientId))
                ) && 
                (
                    this.EndDate == input.EndDate ||
                    (this.EndDate != null &&
                    this.EndDate.Equals(input.EndDate))
                ) && 
                (
                    this.CurrencyConversion == input.CurrencyConversion ||
                    (this.CurrencyConversion != null &&
                    this.CurrencyConversion.Equals(input.CurrencyConversion))
                ) && 
                (
                    this.StartDate == input.StartDate ||
                    (this.StartDate != null &&
                    this.StartDate.Equals(input.StartDate))
                ) && 
                (
                    this.TransactionStatusScope == input.TransactionStatusScope ||
                    this.TransactionStatusScope != null &&
                    this.TransactionStatusScope.SequenceEqual(input.TransactionStatusScope)
                ) && 
                (
                    this.AggregationAccountIds == input.AggregationAccountIds ||
                    this.AggregationAccountIds != null &&
                    this.AggregationAccountIds.SequenceEqual(input.AggregationAccountIds)
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
                if (this.CurrencyCode != null)
                    hashCode = hashCode * 59 + this.CurrencyCode.GetHashCode();
                if (this.ClientId != null)
                    hashCode = hashCode * 59 + this.ClientId.GetHashCode();
                if (this.EndDate != null)
                    hashCode = hashCode * 59 + this.EndDate.GetHashCode();
                if (this.CurrencyConversion != null)
                    hashCode = hashCode * 59 + this.CurrencyConversion.GetHashCode();
                if (this.StartDate != null)
                    hashCode = hashCode * 59 + this.StartDate.GetHashCode();
                if (this.TransactionStatusScope != null)
                    hashCode = hashCode * 59 + this.TransactionStatusScope.GetHashCode();
                if (this.AggregationAccountIds != null)
                    hashCode = hashCode * 59 + this.AggregationAccountIds.GetHashCode();
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
