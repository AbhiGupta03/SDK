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
    /// WireBankLinkResponseVO
    /// </summary>
    [DataContract]
    public partial class WireBankLinkResponseVO :  IEquatable<WireBankLinkResponseVO>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="WireBankLinkResponseVO" /> class.
        /// </summary>
        /// <param name="message">message.</param>
        /// <param name="nucleusBankLinkId">nucleusBankLinkId.</param>
        /// <param name="nucleusClientId">nucleusClientId.</param>
        /// <param name="status">status.</param>
        /// <param name="vendorName">vendorName.</param>
        /// <param name="vendorRequestData">vendorRequestData.</param>
        /// <param name="vendorResponse">vendorResponse.</param>
        public WireBankLinkResponseVO(string message = default(string), Guid? nucleusBankLinkId = default(Guid?), Guid? nucleusClientId = default(Guid?), string status = default(string), string vendorName = default(string), BankLinkVendorDataVO vendorRequestData = default(BankLinkVendorDataVO), Object vendorResponse = default(Object))
        {
            this.Message = message;
            this.NucleusBankLinkId = nucleusBankLinkId;
            this.NucleusClientId = nucleusClientId;
            this.Status = status;
            this.VendorName = vendorName;
            this.VendorRequestData = vendorRequestData;
            this.VendorResponse = vendorResponse;
        }
        
        /// <summary>
        /// Gets or Sets Message
        /// </summary>
        [DataMember(Name="message", EmitDefaultValue=false)]
        public string Message { get; set; }

        /// <summary>
        /// Gets or Sets NucleusBankLinkId
        /// </summary>
        [DataMember(Name="nucleus_bank_link_id", EmitDefaultValue=false)]
        public Guid? NucleusBankLinkId { get; set; }

        /// <summary>
        /// Gets or Sets NucleusClientId
        /// </summary>
        [DataMember(Name="nucleus_client_id", EmitDefaultValue=false)]
        public Guid? NucleusClientId { get; set; }

        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [DataMember(Name="status", EmitDefaultValue=false)]
        public string Status { get; set; }

        /// <summary>
        /// Gets or Sets VendorName
        /// </summary>
        [DataMember(Name="vendor_name", EmitDefaultValue=false)]
        public string VendorName { get; set; }

        /// <summary>
        /// Gets or Sets VendorRequestData
        /// </summary>
        [DataMember(Name="vendor_request_data", EmitDefaultValue=false)]
        public BankLinkVendorDataVO VendorRequestData { get; set; }

        /// <summary>
        /// Gets or Sets VendorResponse
        /// </summary>
        [DataMember(Name="vendor_response", EmitDefaultValue=false)]
        public Object VendorResponse { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class WireBankLinkResponseVO {\n");
            sb.Append("  Message: ").Append(Message).Append("\n");
            sb.Append("  NucleusBankLinkId: ").Append(NucleusBankLinkId).Append("\n");
            sb.Append("  NucleusClientId: ").Append(NucleusClientId).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  VendorName: ").Append(VendorName).Append("\n");
            sb.Append("  VendorRequestData: ").Append(VendorRequestData).Append("\n");
            sb.Append("  VendorResponse: ").Append(VendorResponse).Append("\n");
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
            return this.Equals(input as WireBankLinkResponseVO);
        }

        /// <summary>
        /// Returns true if WireBankLinkResponseVO instances are equal
        /// </summary>
        /// <param name="input">Instance of WireBankLinkResponseVO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(WireBankLinkResponseVO input)
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
                    this.NucleusBankLinkId == input.NucleusBankLinkId ||
                    (this.NucleusBankLinkId != null &&
                    this.NucleusBankLinkId.Equals(input.NucleusBankLinkId))
                ) && 
                (
                    this.NucleusClientId == input.NucleusClientId ||
                    (this.NucleusClientId != null &&
                    this.NucleusClientId.Equals(input.NucleusClientId))
                ) && 
                (
                    this.Status == input.Status ||
                    (this.Status != null &&
                    this.Status.Equals(input.Status))
                ) && 
                (
                    this.VendorName == input.VendorName ||
                    (this.VendorName != null &&
                    this.VendorName.Equals(input.VendorName))
                ) && 
                (
                    this.VendorRequestData == input.VendorRequestData ||
                    (this.VendorRequestData != null &&
                    this.VendorRequestData.Equals(input.VendorRequestData))
                ) && 
                (
                    this.VendorResponse == input.VendorResponse ||
                    (this.VendorResponse != null &&
                    this.VendorResponse.Equals(input.VendorResponse))
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
                if (this.NucleusBankLinkId != null)
                    hashCode = hashCode * 59 + this.NucleusBankLinkId.GetHashCode();
                if (this.NucleusClientId != null)
                    hashCode = hashCode * 59 + this.NucleusClientId.GetHashCode();
                if (this.Status != null)
                    hashCode = hashCode * 59 + this.Status.GetHashCode();
                if (this.VendorName != null)
                    hashCode = hashCode * 59 + this.VendorName.GetHashCode();
                if (this.VendorRequestData != null)
                    hashCode = hashCode * 59 + this.VendorRequestData.GetHashCode();
                if (this.VendorResponse != null)
                    hashCode = hashCode * 59 + this.VendorResponse.GetHashCode();
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
