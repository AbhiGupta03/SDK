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
    /// MortgageCalculatorDownPaymentRequest
    /// </summary>
    [DataContract]
    public partial class MortgageCalculatorDownPaymentRequest :  IEquatable<MortgageCalculatorDownPaymentRequest>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MortgageCalculatorDownPaymentRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected MortgageCalculatorDownPaymentRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="MortgageCalculatorDownPaymentRequest" /> class.
        /// </summary>
        /// <param name="periodicPayment">periodicPayment (required).</param>
        /// <param name="homePrice">homePrice (required).</param>
        /// <param name="interestRate">interestRate (default to 0.04F).</param>
        /// <param name="mortgageTerm">mortgageTerm (default to 360).</param>
        public MortgageCalculatorDownPaymentRequest(float? periodicPayment = default(float?), float? homePrice = default(float?), float? interestRate = 0.04F, int? mortgageTerm = 360)
        {
            // to ensure "periodicPayment" is required (not null)
            if (periodicPayment == null)
            {
                throw new InvalidDataException("periodicPayment is a required property for MortgageCalculatorDownPaymentRequest and cannot be null");
            }
            else
            {
                this.PeriodicPayment = periodicPayment;
            }
            // to ensure "homePrice" is required (not null)
            if (homePrice == null)
            {
                throw new InvalidDataException("homePrice is a required property for MortgageCalculatorDownPaymentRequest and cannot be null");
            }
            else
            {
                this.HomePrice = homePrice;
            }
            // use default value if no "interestRate" provided
            if (interestRate == null)
            {
                this.InterestRate = 0.04F;
            }
            else
            {
                this.InterestRate = interestRate;
            }
            // use default value if no "mortgageTerm" provided
            if (mortgageTerm == null)
            {
                this.MortgageTerm = 360;
            }
            else
            {
                this.MortgageTerm = mortgageTerm;
            }
        }
        
        /// <summary>
        /// Gets or Sets PeriodicPayment
        /// </summary>
        [DataMember(Name="periodic_payment", EmitDefaultValue=false)]
        public float? PeriodicPayment { get; set; }

        /// <summary>
        /// Gets or Sets HomePrice
        /// </summary>
        [DataMember(Name="home_price", EmitDefaultValue=false)]
        public float? HomePrice { get; set; }

        /// <summary>
        /// Gets or Sets InterestRate
        /// </summary>
        [DataMember(Name="interest_rate", EmitDefaultValue=false)]
        public float? InterestRate { get; set; }

        /// <summary>
        /// Gets or Sets MortgageTerm
        /// </summary>
        [DataMember(Name="mortgage_term", EmitDefaultValue=false)]
        public int? MortgageTerm { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MortgageCalculatorDownPaymentRequest {\n");
            sb.Append("  PeriodicPayment: ").Append(PeriodicPayment).Append("\n");
            sb.Append("  HomePrice: ").Append(HomePrice).Append("\n");
            sb.Append("  InterestRate: ").Append(InterestRate).Append("\n");
            sb.Append("  MortgageTerm: ").Append(MortgageTerm).Append("\n");
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
            return this.Equals(input as MortgageCalculatorDownPaymentRequest);
        }

        /// <summary>
        /// Returns true if MortgageCalculatorDownPaymentRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of MortgageCalculatorDownPaymentRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MortgageCalculatorDownPaymentRequest input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.PeriodicPayment == input.PeriodicPayment ||
                    (this.PeriodicPayment != null &&
                    this.PeriodicPayment.Equals(input.PeriodicPayment))
                ) && 
                (
                    this.HomePrice == input.HomePrice ||
                    (this.HomePrice != null &&
                    this.HomePrice.Equals(input.HomePrice))
                ) && 
                (
                    this.InterestRate == input.InterestRate ||
                    (this.InterestRate != null &&
                    this.InterestRate.Equals(input.InterestRate))
                ) && 
                (
                    this.MortgageTerm == input.MortgageTerm ||
                    (this.MortgageTerm != null &&
                    this.MortgageTerm.Equals(input.MortgageTerm))
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
                if (this.PeriodicPayment != null)
                    hashCode = hashCode * 59 + this.PeriodicPayment.GetHashCode();
                if (this.HomePrice != null)
                    hashCode = hashCode * 59 + this.HomePrice.GetHashCode();
                if (this.InterestRate != null)
                    hashCode = hashCode * 59 + this.InterestRate.GetHashCode();
                if (this.MortgageTerm != null)
                    hashCode = hashCode * 59 + this.MortgageTerm.GetHashCode();
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
            // PeriodicPayment (float?) minimum
            if(this.PeriodicPayment < (float?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for PeriodicPayment, must be a value greater than or equal to 0.", new [] { "PeriodicPayment" });
            }

            // HomePrice (float?) minimum
            if(this.HomePrice < (float?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for HomePrice, must be a value greater than or equal to 0.", new [] { "HomePrice" });
            }

            // InterestRate (float?) minimum
            if(this.InterestRate < (float?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for InterestRate, must be a value greater than or equal to 0.", new [] { "InterestRate" });
            }

            // MortgageTerm (int?) maximum
            if(this.MortgageTerm > (int?)600)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for MortgageTerm, must be a value less than or equal to 600.", new [] { "MortgageTerm" });
            }

            // MortgageTerm (int?) minimum
            if(this.MortgageTerm < (int?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for MortgageTerm, must be a value greater than or equal to 0.", new [] { "MortgageTerm" });
            }

            yield break;
        }
    }

}