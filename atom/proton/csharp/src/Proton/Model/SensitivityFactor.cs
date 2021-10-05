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
    /// SensitivityFactor
    /// </summary>
    [DataContract]
    public partial class SensitivityFactor :  IEquatable<SensitivityFactor>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SensitivityFactor" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected SensitivityFactor() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="SensitivityFactor" /> class.
        /// </summary>
        /// <param name="changeAmount">changeAmount (required).</param>
        /// <param name="ticker">ticker (required).</param>
        /// <param name="changeDuration">changeDuration (required).</param>
        /// <param name="lag">lag (default to 0).</param>
        public SensitivityFactor(float? changeAmount = default(float?), string ticker = default(string), int? changeDuration = default(int?), int? lag = 0)
        {
            // to ensure "changeAmount" is required (not null)
            if (changeAmount == null)
            {
                throw new InvalidDataException("changeAmount is a required property for SensitivityFactor and cannot be null");
            }
            else
            {
                this.ChangeAmount = changeAmount;
            }
            // to ensure "ticker" is required (not null)
            if (ticker == null)
            {
                throw new InvalidDataException("ticker is a required property for SensitivityFactor and cannot be null");
            }
            else
            {
                this.Ticker = ticker;
            }
            // to ensure "changeDuration" is required (not null)
            if (changeDuration == null)
            {
                throw new InvalidDataException("changeDuration is a required property for SensitivityFactor and cannot be null");
            }
            else
            {
                this.ChangeDuration = changeDuration;
            }
            // use default value if no "lag" provided
            if (lag == null)
            {
                this.Lag = 0;
            }
            else
            {
                this.Lag = lag;
            }
        }
        
        /// <summary>
        /// Gets or Sets ChangeAmount
        /// </summary>
        [DataMember(Name="change_amount", EmitDefaultValue=false)]
        public float? ChangeAmount { get; set; }

        /// <summary>
        /// Gets or Sets Ticker
        /// </summary>
        [DataMember(Name="ticker", EmitDefaultValue=false)]
        public string Ticker { get; set; }

        /// <summary>
        /// Gets or Sets ChangeDuration
        /// </summary>
        [DataMember(Name="change_duration", EmitDefaultValue=false)]
        public int? ChangeDuration { get; set; }

        /// <summary>
        /// Gets or Sets Lag
        /// </summary>
        [DataMember(Name="lag", EmitDefaultValue=false)]
        public int? Lag { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SensitivityFactor {\n");
            sb.Append("  ChangeAmount: ").Append(ChangeAmount).Append("\n");
            sb.Append("  Ticker: ").Append(Ticker).Append("\n");
            sb.Append("  ChangeDuration: ").Append(ChangeDuration).Append("\n");
            sb.Append("  Lag: ").Append(Lag).Append("\n");
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
            return this.Equals(input as SensitivityFactor);
        }

        /// <summary>
        /// Returns true if SensitivityFactor instances are equal
        /// </summary>
        /// <param name="input">Instance of SensitivityFactor to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SensitivityFactor input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.ChangeAmount == input.ChangeAmount ||
                    (this.ChangeAmount != null &&
                    this.ChangeAmount.Equals(input.ChangeAmount))
                ) && 
                (
                    this.Ticker == input.Ticker ||
                    (this.Ticker != null &&
                    this.Ticker.Equals(input.Ticker))
                ) && 
                (
                    this.ChangeDuration == input.ChangeDuration ||
                    (this.ChangeDuration != null &&
                    this.ChangeDuration.Equals(input.ChangeDuration))
                ) && 
                (
                    this.Lag == input.Lag ||
                    (this.Lag != null &&
                    this.Lag.Equals(input.Lag))
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
                if (this.ChangeAmount != null)
                    hashCode = hashCode * 59 + this.ChangeAmount.GetHashCode();
                if (this.Ticker != null)
                    hashCode = hashCode * 59 + this.Ticker.GetHashCode();
                if (this.ChangeDuration != null)
                    hashCode = hashCode * 59 + this.ChangeDuration.GetHashCode();
                if (this.Lag != null)
                    hashCode = hashCode * 59 + this.Lag.GetHashCode();
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
            // ChangeAmount (float?) minimum
            if(this.ChangeAmount < (float?)-1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for ChangeAmount, must be a value greater than or equal to -1.", new [] { "ChangeAmount" });
            }

            // ChangeDuration (int?) minimum
            if(this.ChangeDuration < (int?)1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for ChangeDuration, must be a value greater than or equal to 1.", new [] { "ChangeDuration" });
            }

            // Lag (int?) minimum
            if(this.Lag < (int?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Lag, must be a value greater than or equal to 0.", new [] { "Lag" });
            }

            yield break;
        }
    }

}
