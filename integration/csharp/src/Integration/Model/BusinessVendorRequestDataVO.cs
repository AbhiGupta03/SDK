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
    /// BusinessVendorRequestDataVO
    /// </summary>
    [DataContract]
    public partial class BusinessVendorRequestDataVO :  IEquatable<BusinessVendorRequestDataVO>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="BusinessVendorRequestDataVO" /> class.
        /// </summary>
        /// <param name="businessAddresses">businessAddresses.</param>
        /// <param name="dbaName">dbaName.</param>
        /// <param name="email">email.</param>
        /// <param name="identificationNumber">identificationNumber.</param>
        /// <param name="identificationNumberType">identificationNumberType.</param>
        /// <param name="incorporationDate">incorporationDate.</param>
        /// <param name="incorporationState">incorporationState.</param>
        /// <param name="isPublic">isPublic.</param>
        /// <param name="legalName">legalName.</param>
        /// <param name="legalStructure">legalStructure.</param>
        /// <param name="metadata">metadata.</param>
        /// <param name="owners">owners.</param>
        /// <param name="phoneNumber">phoneNumber.</param>
        /// <param name="ticker">ticker.</param>
        /// <param name="website">website.</param>
        public BusinessVendorRequestDataVO(List<BusinessAddress> businessAddresses = default(List<BusinessAddress>), string dbaName = default(string), string email = default(string), string identificationNumber = default(string), string identificationNumberType = default(string), DateTime? incorporationDate = default(DateTime?), string incorporationState = default(string), bool? isPublic = default(bool?), string legalName = default(string), string legalStructure = default(string), Dictionary<string, string> metadata = default(Dictionary<string, string>), List<Ownership> owners = default(List<Ownership>), string phoneNumber = default(string), string ticker = default(string), string website = default(string))
        {
            this.BusinessAddresses = businessAddresses;
            this.DbaName = dbaName;
            this.Email = email;
            this.IdentificationNumber = identificationNumber;
            this.IdentificationNumberType = identificationNumberType;
            this.IncorporationDate = incorporationDate;
            this.IncorporationState = incorporationState;
            this.IsPublic = isPublic;
            this.LegalName = legalName;
            this.LegalStructure = legalStructure;
            this.Metadata = metadata;
            this.Owners = owners;
            this.PhoneNumber = phoneNumber;
            this.Ticker = ticker;
            this.Website = website;
        }
        
        /// <summary>
        /// Gets or Sets BusinessAddresses
        /// </summary>
        [DataMember(Name="business_addresses", EmitDefaultValue=false)]
        public List<BusinessAddress> BusinessAddresses { get; set; }

        /// <summary>
        /// Gets or Sets DbaName
        /// </summary>
        [DataMember(Name="dba_name", EmitDefaultValue=false)]
        public string DbaName { get; set; }

        /// <summary>
        /// Gets or Sets Email
        /// </summary>
        [DataMember(Name="email", EmitDefaultValue=false)]
        public string Email { get; set; }

        /// <summary>
        /// Gets or Sets IdentificationNumber
        /// </summary>
        [DataMember(Name="identification_number", EmitDefaultValue=false)]
        public string IdentificationNumber { get; set; }

        /// <summary>
        /// Gets or Sets IdentificationNumberType
        /// </summary>
        [DataMember(Name="identification_number_type", EmitDefaultValue=false)]
        public string IdentificationNumberType { get; set; }

        /// <summary>
        /// Gets or Sets IncorporationDate
        /// </summary>
        [DataMember(Name="incorporation_date", EmitDefaultValue=false)]
        [JsonConverter(typeof(SwaggerDateConverter))]
        public DateTime? IncorporationDate { get; set; }

        /// <summary>
        /// Gets or Sets IncorporationState
        /// </summary>
        [DataMember(Name="incorporation_state", EmitDefaultValue=false)]
        public string IncorporationState { get; set; }

        /// <summary>
        /// Gets or Sets IsPublic
        /// </summary>
        [DataMember(Name="is_public", EmitDefaultValue=false)]
        public bool? IsPublic { get; set; }

        /// <summary>
        /// Gets or Sets LegalName
        /// </summary>
        [DataMember(Name="legal_name", EmitDefaultValue=false)]
        public string LegalName { get; set; }

        /// <summary>
        /// Gets or Sets LegalStructure
        /// </summary>
        [DataMember(Name="legal_structure", EmitDefaultValue=false)]
        public string LegalStructure { get; set; }

        /// <summary>
        /// Gets or Sets Metadata
        /// </summary>
        [DataMember(Name="metadata", EmitDefaultValue=false)]
        public Dictionary<string, string> Metadata { get; set; }

        /// <summary>
        /// Gets or Sets Owners
        /// </summary>
        [DataMember(Name="owners", EmitDefaultValue=false)]
        public List<Ownership> Owners { get; set; }

        /// <summary>
        /// Gets or Sets PhoneNumber
        /// </summary>
        [DataMember(Name="phone_number", EmitDefaultValue=false)]
        public string PhoneNumber { get; set; }

        /// <summary>
        /// Gets or Sets Ticker
        /// </summary>
        [DataMember(Name="ticker", EmitDefaultValue=false)]
        public string Ticker { get; set; }

        /// <summary>
        /// Gets or Sets Website
        /// </summary>
        [DataMember(Name="website", EmitDefaultValue=false)]
        public string Website { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class BusinessVendorRequestDataVO {\n");
            sb.Append("  BusinessAddresses: ").Append(BusinessAddresses).Append("\n");
            sb.Append("  DbaName: ").Append(DbaName).Append("\n");
            sb.Append("  Email: ").Append(Email).Append("\n");
            sb.Append("  IdentificationNumber: ").Append(IdentificationNumber).Append("\n");
            sb.Append("  IdentificationNumberType: ").Append(IdentificationNumberType).Append("\n");
            sb.Append("  IncorporationDate: ").Append(IncorporationDate).Append("\n");
            sb.Append("  IncorporationState: ").Append(IncorporationState).Append("\n");
            sb.Append("  IsPublic: ").Append(IsPublic).Append("\n");
            sb.Append("  LegalName: ").Append(LegalName).Append("\n");
            sb.Append("  LegalStructure: ").Append(LegalStructure).Append("\n");
            sb.Append("  Metadata: ").Append(Metadata).Append("\n");
            sb.Append("  Owners: ").Append(Owners).Append("\n");
            sb.Append("  PhoneNumber: ").Append(PhoneNumber).Append("\n");
            sb.Append("  Ticker: ").Append(Ticker).Append("\n");
            sb.Append("  Website: ").Append(Website).Append("\n");
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
            return this.Equals(input as BusinessVendorRequestDataVO);
        }

        /// <summary>
        /// Returns true if BusinessVendorRequestDataVO instances are equal
        /// </summary>
        /// <param name="input">Instance of BusinessVendorRequestDataVO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BusinessVendorRequestDataVO input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.BusinessAddresses == input.BusinessAddresses ||
                    this.BusinessAddresses != null &&
                    this.BusinessAddresses.SequenceEqual(input.BusinessAddresses)
                ) && 
                (
                    this.DbaName == input.DbaName ||
                    (this.DbaName != null &&
                    this.DbaName.Equals(input.DbaName))
                ) && 
                (
                    this.Email == input.Email ||
                    (this.Email != null &&
                    this.Email.Equals(input.Email))
                ) && 
                (
                    this.IdentificationNumber == input.IdentificationNumber ||
                    (this.IdentificationNumber != null &&
                    this.IdentificationNumber.Equals(input.IdentificationNumber))
                ) && 
                (
                    this.IdentificationNumberType == input.IdentificationNumberType ||
                    (this.IdentificationNumberType != null &&
                    this.IdentificationNumberType.Equals(input.IdentificationNumberType))
                ) && 
                (
                    this.IncorporationDate == input.IncorporationDate ||
                    (this.IncorporationDate != null &&
                    this.IncorporationDate.Equals(input.IncorporationDate))
                ) && 
                (
                    this.IncorporationState == input.IncorporationState ||
                    (this.IncorporationState != null &&
                    this.IncorporationState.Equals(input.IncorporationState))
                ) && 
                (
                    this.IsPublic == input.IsPublic ||
                    (this.IsPublic != null &&
                    this.IsPublic.Equals(input.IsPublic))
                ) && 
                (
                    this.LegalName == input.LegalName ||
                    (this.LegalName != null &&
                    this.LegalName.Equals(input.LegalName))
                ) && 
                (
                    this.LegalStructure == input.LegalStructure ||
                    (this.LegalStructure != null &&
                    this.LegalStructure.Equals(input.LegalStructure))
                ) && 
                (
                    this.Metadata == input.Metadata ||
                    this.Metadata != null &&
                    this.Metadata.SequenceEqual(input.Metadata)
                ) && 
                (
                    this.Owners == input.Owners ||
                    this.Owners != null &&
                    this.Owners.SequenceEqual(input.Owners)
                ) && 
                (
                    this.PhoneNumber == input.PhoneNumber ||
                    (this.PhoneNumber != null &&
                    this.PhoneNumber.Equals(input.PhoneNumber))
                ) && 
                (
                    this.Ticker == input.Ticker ||
                    (this.Ticker != null &&
                    this.Ticker.Equals(input.Ticker))
                ) && 
                (
                    this.Website == input.Website ||
                    (this.Website != null &&
                    this.Website.Equals(input.Website))
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
                if (this.BusinessAddresses != null)
                    hashCode = hashCode * 59 + this.BusinessAddresses.GetHashCode();
                if (this.DbaName != null)
                    hashCode = hashCode * 59 + this.DbaName.GetHashCode();
                if (this.Email != null)
                    hashCode = hashCode * 59 + this.Email.GetHashCode();
                if (this.IdentificationNumber != null)
                    hashCode = hashCode * 59 + this.IdentificationNumber.GetHashCode();
                if (this.IdentificationNumberType != null)
                    hashCode = hashCode * 59 + this.IdentificationNumberType.GetHashCode();
                if (this.IncorporationDate != null)
                    hashCode = hashCode * 59 + this.IncorporationDate.GetHashCode();
                if (this.IncorporationState != null)
                    hashCode = hashCode * 59 + this.IncorporationState.GetHashCode();
                if (this.IsPublic != null)
                    hashCode = hashCode * 59 + this.IsPublic.GetHashCode();
                if (this.LegalName != null)
                    hashCode = hashCode * 59 + this.LegalName.GetHashCode();
                if (this.LegalStructure != null)
                    hashCode = hashCode * 59 + this.LegalStructure.GetHashCode();
                if (this.Metadata != null)
                    hashCode = hashCode * 59 + this.Metadata.GetHashCode();
                if (this.Owners != null)
                    hashCode = hashCode * 59 + this.Owners.GetHashCode();
                if (this.PhoneNumber != null)
                    hashCode = hashCode * 59 + this.PhoneNumber.GetHashCode();
                if (this.Ticker != null)
                    hashCode = hashCode * 59 + this.Ticker.GetHashCode();
                if (this.Website != null)
                    hashCode = hashCode * 59 + this.Website.GetHashCode();
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
