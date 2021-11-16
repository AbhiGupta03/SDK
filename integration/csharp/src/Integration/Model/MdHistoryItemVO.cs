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
    /// MdHistoryItemVO
    /// </summary>
    [DataContract]
    public partial class MdHistoryItemVO :  IEquatable<MdHistoryItemVO>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MdHistoryItemVO" /> class.
        /// </summary>
        /// <param name="adjustedPrice">adjustedPrice.</param>
        /// <param name="currencyCode">currencyCode.</param>
        /// <param name="date">date.</param>
        /// <param name="nucleusSecurityId">nucleusSecurityId.</param>
        /// <param name="price">price.</param>
        /// <param name="securityPriceId">securityPriceId.</param>
        /// <param name="ticker">ticker.</param>
        public MdHistoryItemVO(double? adjustedPrice = default(double?), string currencyCode = default(string), DateTime? date = default(DateTime?), Guid? nucleusSecurityId = default(Guid?), double? price = default(double?), Guid? securityPriceId = default(Guid?), string ticker = default(string))
        {
            this.AdjustedPrice = adjustedPrice;
            this.CurrencyCode = currencyCode;
            this.Date = date;
            this.NucleusSecurityId = nucleusSecurityId;
            this.Price = price;
            this.SecurityPriceId = securityPriceId;
            this.Ticker = ticker;
        }
        
        /// <summary>
        /// Gets or Sets AdjustedPrice
        /// </summary>
        [DataMember(Name="adjusted_price", EmitDefaultValue=false)]
        public double? AdjustedPrice { get; set; }

        /// <summary>
        /// Gets or Sets CurrencyCode
        /// </summary>
        [DataMember(Name="currency_code", EmitDefaultValue=false)]
        public string CurrencyCode { get; set; }

        /// <summary>
        /// Gets or Sets Date
        /// </summary>
        [DataMember(Name="date", EmitDefaultValue=false)]
        public DateTime? Date { get; set; }

        /// <summary>
        /// Gets or Sets NucleusSecurityId
        /// </summary>
        [DataMember(Name="nucleus_security_id", EmitDefaultValue=false)]
        public Guid? NucleusSecurityId { get; set; }

        /// <summary>
        /// Gets or Sets Price
        /// </summary>
        [DataMember(Name="price", EmitDefaultValue=false)]
        public double? Price { get; set; }

        /// <summary>
        /// Gets or Sets SecurityPriceId
        /// </summary>
        [DataMember(Name="security_price_id", EmitDefaultValue=false)]
        public Guid? SecurityPriceId { get; set; }

        /// <summary>
        /// Gets or Sets Ticker
        /// </summary>
        [DataMember(Name="ticker", EmitDefaultValue=false)]
        public string Ticker { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MdHistoryItemVO {\n");
            sb.Append("  AdjustedPrice: ").Append(AdjustedPrice).Append("\n");
            sb.Append("  CurrencyCode: ").Append(CurrencyCode).Append("\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  NucleusSecurityId: ").Append(NucleusSecurityId).Append("\n");
            sb.Append("  Price: ").Append(Price).Append("\n");
            sb.Append("  SecurityPriceId: ").Append(SecurityPriceId).Append("\n");
            sb.Append("  Ticker: ").Append(Ticker).Append("\n");
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
            return this.Equals(input as MdHistoryItemVO);
        }

        /// <summary>
        /// Returns true if MdHistoryItemVO instances are equal
        /// </summary>
        /// <param name="input">Instance of MdHistoryItemVO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MdHistoryItemVO input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.AdjustedPrice == input.AdjustedPrice ||
                    (this.AdjustedPrice != null &&
                    this.AdjustedPrice.Equals(input.AdjustedPrice))
                ) && 
                (
                    this.CurrencyCode == input.CurrencyCode ||
                    (this.CurrencyCode != null &&
                    this.CurrencyCode.Equals(input.CurrencyCode))
                ) && 
                (
                    this.Date == input.Date ||
                    (this.Date != null &&
                    this.Date.Equals(input.Date))
                ) && 
                (
                    this.NucleusSecurityId == input.NucleusSecurityId ||
                    (this.NucleusSecurityId != null &&
                    this.NucleusSecurityId.Equals(input.NucleusSecurityId))
                ) && 
                (
                    this.Price == input.Price ||
                    (this.Price != null &&
                    this.Price.Equals(input.Price))
                ) && 
                (
                    this.SecurityPriceId == input.SecurityPriceId ||
                    (this.SecurityPriceId != null &&
                    this.SecurityPriceId.Equals(input.SecurityPriceId))
                ) && 
                (
                    this.Ticker == input.Ticker ||
                    (this.Ticker != null &&
                    this.Ticker.Equals(input.Ticker))
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
                if (this.AdjustedPrice != null)
                    hashCode = hashCode * 59 + this.AdjustedPrice.GetHashCode();
                if (this.CurrencyCode != null)
                    hashCode = hashCode * 59 + this.CurrencyCode.GetHashCode();
                if (this.Date != null)
                    hashCode = hashCode * 59 + this.Date.GetHashCode();
                if (this.NucleusSecurityId != null)
                    hashCode = hashCode * 59 + this.NucleusSecurityId.GetHashCode();
                if (this.Price != null)
                    hashCode = hashCode * 59 + this.Price.GetHashCode();
                if (this.SecurityPriceId != null)
                    hashCode = hashCode * 59 + this.SecurityPriceId.GetHashCode();
                if (this.Ticker != null)
                    hashCode = hashCode * 59 + this.Ticker.GetHashCode();
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