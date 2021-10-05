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
    /// CalculatorDepositSchedule1
    /// </summary>
    [DataContract]
    public partial class CalculatorDepositSchedule1 :  IEquatable<CalculatorDepositSchedule1>, IValidatableObject
    {
        /// <summary>
        /// Defines DepositFrequencyInterval
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum DepositFrequencyIntervalEnum
        {
            
            /// <summary>
            /// Enum Year for value: year
            /// </summary>
            [EnumMember(Value = "year")]
            Year = 1,
            
            /// <summary>
            /// Enum Month for value: month
            /// </summary>
            [EnumMember(Value = "month")]
            Month = 2,
            
            /// <summary>
            /// Enum Quarter for value: quarter
            /// </summary>
            [EnumMember(Value = "quarter")]
            Quarter = 3,
            
            /// <summary>
            /// Enum Week for value: week
            /// </summary>
            [EnumMember(Value = "week")]
            Week = 4,
            
            /// <summary>
            /// Enum Day for value: day
            /// </summary>
            [EnumMember(Value = "day")]
            Day = 5
        }

        /// <summary>
        /// Gets or Sets DepositFrequencyInterval
        /// </summary>
        [DataMember(Name="deposit_frequency_interval", EmitDefaultValue=false)]
        public DepositFrequencyIntervalEnum? DepositFrequencyInterval { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="CalculatorDepositSchedule1" /> class.
        /// </summary>
        /// <param name="depositAmount">depositAmount (default to 0.0F).</param>
        /// <param name="depositFrequencyInterval">depositFrequencyInterval (default to DepositFrequencyIntervalEnum.Year).</param>
        /// <param name="adjustDepositForInflation">adjustDepositForInflation (default to true).</param>
        public CalculatorDepositSchedule1(float? depositAmount = 0.0F, DepositFrequencyIntervalEnum? depositFrequencyInterval = DepositFrequencyIntervalEnum.Year, bool? adjustDepositForInflation = true)
        {
            // use default value if no "depositAmount" provided
            if (depositAmount == null)
            {
                this.DepositAmount = 0.0F;
            }
            else
            {
                this.DepositAmount = depositAmount;
            }
            // use default value if no "depositFrequencyInterval" provided
            if (depositFrequencyInterval == null)
            {
                this.DepositFrequencyInterval = DepositFrequencyIntervalEnum.Year;
            }
            else
            {
                this.DepositFrequencyInterval = depositFrequencyInterval;
            }
            // use default value if no "adjustDepositForInflation" provided
            if (adjustDepositForInflation == null)
            {
                this.AdjustDepositForInflation = true;
            }
            else
            {
                this.AdjustDepositForInflation = adjustDepositForInflation;
            }
        }
        
        /// <summary>
        /// Gets or Sets DepositAmount
        /// </summary>
        [DataMember(Name="deposit_amount", EmitDefaultValue=false)]
        public float? DepositAmount { get; set; }


        /// <summary>
        /// Gets or Sets AdjustDepositForInflation
        /// </summary>
        [DataMember(Name="adjust_deposit_for_inflation", EmitDefaultValue=false)]
        public bool? AdjustDepositForInflation { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CalculatorDepositSchedule1 {\n");
            sb.Append("  DepositAmount: ").Append(DepositAmount).Append("\n");
            sb.Append("  DepositFrequencyInterval: ").Append(DepositFrequencyInterval).Append("\n");
            sb.Append("  AdjustDepositForInflation: ").Append(AdjustDepositForInflation).Append("\n");
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
            return this.Equals(input as CalculatorDepositSchedule1);
        }

        /// <summary>
        /// Returns true if CalculatorDepositSchedule1 instances are equal
        /// </summary>
        /// <param name="input">Instance of CalculatorDepositSchedule1 to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CalculatorDepositSchedule1 input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.DepositAmount == input.DepositAmount ||
                    (this.DepositAmount != null &&
                    this.DepositAmount.Equals(input.DepositAmount))
                ) && 
                (
                    this.DepositFrequencyInterval == input.DepositFrequencyInterval ||
                    (this.DepositFrequencyInterval != null &&
                    this.DepositFrequencyInterval.Equals(input.DepositFrequencyInterval))
                ) && 
                (
                    this.AdjustDepositForInflation == input.AdjustDepositForInflation ||
                    (this.AdjustDepositForInflation != null &&
                    this.AdjustDepositForInflation.Equals(input.AdjustDepositForInflation))
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
                if (this.DepositAmount != null)
                    hashCode = hashCode * 59 + this.DepositAmount.GetHashCode();
                if (this.DepositFrequencyInterval != null)
                    hashCode = hashCode * 59 + this.DepositFrequencyInterval.GetHashCode();
                if (this.AdjustDepositForInflation != null)
                    hashCode = hashCode * 59 + this.AdjustDepositForInflation.GetHashCode();
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
            // DepositAmount (float?) minimum
            if(this.DepositAmount < (float?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for DepositAmount, must be a value greater than or equal to 0.", new [] { "DepositAmount" });
            }

            yield break;
        }
    }

}
