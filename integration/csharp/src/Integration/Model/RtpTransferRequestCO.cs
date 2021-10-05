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
    /// RtpTransferRequestCO
    /// </summary>
    [DataContract]
    public partial class RtpTransferRequestCO :  IEquatable<RtpTransferRequestCO>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RtpTransferRequestCO" /> class.
        /// </summary>
        /// <param name="nucleusFundingId">nucleusFundingId.</param>
        /// <param name="vendorRequest">vendorRequest.</param>
        public RtpTransferRequestCO(Guid? nucleusFundingId = default(Guid?), Object vendorRequest = default(Object))
        {
            this.NucleusFundingId = nucleusFundingId;
            this.VendorRequest = vendorRequest;
        }
        
        /// <summary>
        /// Gets or Sets NucleusFundingId
        /// </summary>
        [DataMember(Name="nucleus_funding_id", EmitDefaultValue=false)]
        public Guid? NucleusFundingId { get; set; }

        /// <summary>
        /// Gets or Sets VendorRequest
        /// </summary>
        [DataMember(Name="vendor_request", EmitDefaultValue=false)]
        public Object VendorRequest { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class RtpTransferRequestCO {\n");
            sb.Append("  NucleusFundingId: ").Append(NucleusFundingId).Append("\n");
            sb.Append("  VendorRequest: ").Append(VendorRequest).Append("\n");
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
            return this.Equals(input as RtpTransferRequestCO);
        }

        /// <summary>
        /// Returns true if RtpTransferRequestCO instances are equal
        /// </summary>
        /// <param name="input">Instance of RtpTransferRequestCO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RtpTransferRequestCO input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.NucleusFundingId == input.NucleusFundingId ||
                    (this.NucleusFundingId != null &&
                    this.NucleusFundingId.Equals(input.NucleusFundingId))
                ) && 
                (
                    this.VendorRequest == input.VendorRequest ||
                    (this.VendorRequest != null &&
                    this.VendorRequest.Equals(input.VendorRequest))
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
                if (this.NucleusFundingId != null)
                    hashCode = hashCode * 59 + this.NucleusFundingId.GetHashCode();
                if (this.VendorRequest != null)
                    hashCode = hashCode * 59 + this.VendorRequest.GetHashCode();
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
