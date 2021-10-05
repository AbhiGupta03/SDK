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
    /// AggregationAccountResponseVO
    /// </summary>
    [DataContract]
    public partial class AggregationAccountResponseVO :  IEquatable<AggregationAccountResponseVO>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AggregationAccountResponseVO" /> class.
        /// </summary>
        /// <param name="message">message.</param>
        /// <param name="nucleusAggregationAccount">nucleusAggregationAccount.</param>
        /// <param name="nucleusAggregationAccountId">nucleusAggregationAccountId.</param>
        /// <param name="vendorName">vendorName.</param>
        public AggregationAccountResponseVO(string message = default(string), AggregationAccountResponseInternalObjectVO nucleusAggregationAccount = default(AggregationAccountResponseInternalObjectVO), Guid? nucleusAggregationAccountId = default(Guid?), string vendorName = default(string))
        {
            this.Message = message;
            this.NucleusAggregationAccount = nucleusAggregationAccount;
            this.NucleusAggregationAccountId = nucleusAggregationAccountId;
            this.VendorName = vendorName;
        }
        
        /// <summary>
        /// Gets or Sets Message
        /// </summary>
        [DataMember(Name="message", EmitDefaultValue=false)]
        public string Message { get; set; }

        /// <summary>
        /// Gets or Sets NucleusAggregationAccount
        /// </summary>
        [DataMember(Name="nucleus_aggregation_account", EmitDefaultValue=false)]
        public AggregationAccountResponseInternalObjectVO NucleusAggregationAccount { get; set; }

        /// <summary>
        /// Gets or Sets NucleusAggregationAccountId
        /// </summary>
        [DataMember(Name="nucleus_aggregation_account_id", EmitDefaultValue=false)]
        public Guid? NucleusAggregationAccountId { get; set; }

        /// <summary>
        /// Gets or Sets VendorName
        /// </summary>
        [DataMember(Name="vendor_name", EmitDefaultValue=false)]
        public string VendorName { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AggregationAccountResponseVO {\n");
            sb.Append("  Message: ").Append(Message).Append("\n");
            sb.Append("  NucleusAggregationAccount: ").Append(NucleusAggregationAccount).Append("\n");
            sb.Append("  NucleusAggregationAccountId: ").Append(NucleusAggregationAccountId).Append("\n");
            sb.Append("  VendorName: ").Append(VendorName).Append("\n");
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
            return this.Equals(input as AggregationAccountResponseVO);
        }

        /// <summary>
        /// Returns true if AggregationAccountResponseVO instances are equal
        /// </summary>
        /// <param name="input">Instance of AggregationAccountResponseVO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AggregationAccountResponseVO input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Message == input.Message ||
                    (this.Message != null &&
                    this.Message.Equals(input.Message))
                ) && 
                (
                    this.NucleusAggregationAccount == input.NucleusAggregationAccount ||
                    (this.NucleusAggregationAccount != null &&
                    this.NucleusAggregationAccount.Equals(input.NucleusAggregationAccount))
                ) && 
                (
                    this.NucleusAggregationAccountId == input.NucleusAggregationAccountId ||
                    (this.NucleusAggregationAccountId != null &&
                    this.NucleusAggregationAccountId.Equals(input.NucleusAggregationAccountId))
                ) && 
                (
                    this.VendorName == input.VendorName ||
                    (this.VendorName != null &&
                    this.VendorName.Equals(input.VendorName))
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
                if (this.Message != null)
                    hashCode = hashCode * 59 + this.Message.GetHashCode();
                if (this.NucleusAggregationAccount != null)
                    hashCode = hashCode * 59 + this.NucleusAggregationAccount.GetHashCode();
                if (this.NucleusAggregationAccountId != null)
                    hashCode = hashCode * 59 + this.NucleusAggregationAccountId.GetHashCode();
                if (this.VendorName != null)
                    hashCode = hashCode * 59 + this.VendorName.GetHashCode();
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
