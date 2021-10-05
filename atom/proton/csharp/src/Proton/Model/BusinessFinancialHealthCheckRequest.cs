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
    /// BusinessFinancialHealthCheckRequest
    /// </summary>
    [DataContract]
    public partial class BusinessFinancialHealthCheckRequest :  IEquatable<BusinessFinancialHealthCheckRequest>, IValidatableObject
    {
        /// <summary>
        /// Defines AccountingMethod
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum AccountingMethodEnum
        {
            
            /// <summary>
            /// Enum Accrual for value: accrual
            /// </summary>
            [EnumMember(Value = "accrual")]
            Accrual = 1,
            
            /// <summary>
            /// Enum Cash for value: cash
            /// </summary>
            [EnumMember(Value = "cash")]
            Cash = 2
        }

        /// <summary>
        /// Gets or Sets AccountingMethod
        /// </summary>
        [DataMember(Name="accounting_method", EmitDefaultValue=false)]
        public AccountingMethodEnum? AccountingMethod { get; set; }
        /// <summary>
        /// Defines PeriodLength
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum PeriodLengthEnum
        {
            
            /// <summary>
            /// Enum Annual for value: annual
            /// </summary>
            [EnumMember(Value = "annual")]
            Annual = 1,
            
            /// <summary>
            /// Enum Quarterly for value: quarterly
            /// </summary>
            [EnumMember(Value = "quarterly")]
            Quarterly = 2,
            
            /// <summary>
            /// Enum Monthly for value: monthly
            /// </summary>
            [EnumMember(Value = "monthly")]
            Monthly = 3,
            
            /// <summary>
            /// Enum Ytd for value: ytd
            /// </summary>
            [EnumMember(Value = "ytd")]
            Ytd = 4,
            
            /// <summary>
            /// Enum Qtd for value: qtd
            /// </summary>
            [EnumMember(Value = "qtd")]
            Qtd = 5,
            
            /// <summary>
            /// Enum Mtd for value: mtd
            /// </summary>
            [EnumMember(Value = "mtd")]
            Mtd = 6
        }

        /// <summary>
        /// Gets or Sets PeriodLength
        /// </summary>
        [DataMember(Name="period_length", EmitDefaultValue=false)]
        public PeriodLengthEnum? PeriodLength { get; set; }
        /// <summary>
        /// Defines PeriodType
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum PeriodTypeEnum
        {
            
            /// <summary>
            /// Enum Calendar for value: calendar
            /// </summary>
            [EnumMember(Value = "calendar")]
            Calendar = 1,
            
            /// <summary>
            /// Enum Fiscal for value: fiscal
            /// </summary>
            [EnumMember(Value = "fiscal")]
            Fiscal = 2
        }

        /// <summary>
        /// Gets or Sets PeriodType
        /// </summary>
        [DataMember(Name="period_type", EmitDefaultValue=false)]
        public PeriodTypeEnum? PeriodType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="BusinessFinancialHealthCheckRequest" /> class.
        /// </summary>
        /// <param name="currencyCode">currencyCode.</param>
        /// <param name="clientId">clientId.</param>
        /// <param name="ratioTargets">ratioTargets.</param>
        /// <param name="accountingMethod">accountingMethod.</param>
        /// <param name="totalLiabilities">totalLiabilities.</param>
        /// <param name="totalAssets">totalAssets.</param>
        /// <param name="currencyConversion">currencyConversion.</param>
        /// <param name="periodQuarter">periodQuarter.</param>
        /// <param name="periodMonth">periodMonth.</param>
        /// <param name="totalEquity">totalEquity.</param>
        /// <param name="businessId">businessId.</param>
        /// <param name="periodYear">periodYear.</param>
        /// <param name="totalRevenue">totalRevenue.</param>
        /// <param name="periodLength">periodLength (default to PeriodLengthEnum.Quarterly).</param>
        /// <param name="netIncome">netIncome.</param>
        /// <param name="periodType">periodType.</param>
        public BusinessFinancialHealthCheckRequest(string currencyCode = default(string), Guid? clientId = default(Guid?), RatioTargets1 ratioTargets = default(RatioTargets1), AccountingMethodEnum? accountingMethod = default(AccountingMethodEnum?), float? totalLiabilities = default(float?), float? totalAssets = default(float?), string currencyConversion = default(string), int? periodQuarter = default(int?), int? periodMonth = default(int?), float? totalEquity = default(float?), Guid? businessId = default(Guid?), int? periodYear = default(int?), float? totalRevenue = default(float?), PeriodLengthEnum? periodLength = PeriodLengthEnum.Quarterly, float? netIncome = default(float?), PeriodTypeEnum? periodType = default(PeriodTypeEnum?))
        {
            this.CurrencyCode = currencyCode;
            this.ClientId = clientId;
            this.RatioTargets = ratioTargets;
            this.AccountingMethod = accountingMethod;
            this.TotalLiabilities = totalLiabilities;
            this.TotalAssets = totalAssets;
            this.CurrencyConversion = currencyConversion;
            this.PeriodQuarter = periodQuarter;
            this.PeriodMonth = periodMonth;
            this.TotalEquity = totalEquity;
            this.BusinessId = businessId;
            this.PeriodYear = periodYear;
            this.TotalRevenue = totalRevenue;
            // use default value if no "periodLength" provided
            if (periodLength == null)
            {
                this.PeriodLength = PeriodLengthEnum.Quarterly;
            }
            else
            {
                this.PeriodLength = periodLength;
            }
            this.NetIncome = netIncome;
            this.PeriodType = periodType;
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
        /// Gets or Sets RatioTargets
        /// </summary>
        [DataMember(Name="ratio_targets", EmitDefaultValue=false)]
        public RatioTargets1 RatioTargets { get; set; }


        /// <summary>
        /// Gets or Sets TotalLiabilities
        /// </summary>
        [DataMember(Name="total_liabilities", EmitDefaultValue=false)]
        public float? TotalLiabilities { get; set; }

        /// <summary>
        /// Gets or Sets TotalAssets
        /// </summary>
        [DataMember(Name="total_assets", EmitDefaultValue=false)]
        public float? TotalAssets { get; set; }

        /// <summary>
        /// Gets or Sets CurrencyConversion
        /// </summary>
        [DataMember(Name="currency_conversion", EmitDefaultValue=false)]
        public string CurrencyConversion { get; set; }

        /// <summary>
        /// Gets or Sets PeriodQuarter
        /// </summary>
        [DataMember(Name="period_quarter", EmitDefaultValue=false)]
        public int? PeriodQuarter { get; set; }

        /// <summary>
        /// Gets or Sets PeriodMonth
        /// </summary>
        [DataMember(Name="period_month", EmitDefaultValue=false)]
        public int? PeriodMonth { get; set; }

        /// <summary>
        /// Gets or Sets TotalEquity
        /// </summary>
        [DataMember(Name="total_equity", EmitDefaultValue=false)]
        public float? TotalEquity { get; set; }

        /// <summary>
        /// Gets or Sets BusinessId
        /// </summary>
        [DataMember(Name="business_id", EmitDefaultValue=false)]
        public Guid? BusinessId { get; set; }

        /// <summary>
        /// Gets or Sets PeriodYear
        /// </summary>
        [DataMember(Name="period_year", EmitDefaultValue=false)]
        public int? PeriodYear { get; set; }

        /// <summary>
        /// Gets or Sets TotalRevenue
        /// </summary>
        [DataMember(Name="total_revenue", EmitDefaultValue=false)]
        public float? TotalRevenue { get; set; }


        /// <summary>
        /// Gets or Sets NetIncome
        /// </summary>
        [DataMember(Name="net_income", EmitDefaultValue=false)]
        public float? NetIncome { get; set; }


        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class BusinessFinancialHealthCheckRequest {\n");
            sb.Append("  CurrencyCode: ").Append(CurrencyCode).Append("\n");
            sb.Append("  ClientId: ").Append(ClientId).Append("\n");
            sb.Append("  RatioTargets: ").Append(RatioTargets).Append("\n");
            sb.Append("  AccountingMethod: ").Append(AccountingMethod).Append("\n");
            sb.Append("  TotalLiabilities: ").Append(TotalLiabilities).Append("\n");
            sb.Append("  TotalAssets: ").Append(TotalAssets).Append("\n");
            sb.Append("  CurrencyConversion: ").Append(CurrencyConversion).Append("\n");
            sb.Append("  PeriodQuarter: ").Append(PeriodQuarter).Append("\n");
            sb.Append("  PeriodMonth: ").Append(PeriodMonth).Append("\n");
            sb.Append("  TotalEquity: ").Append(TotalEquity).Append("\n");
            sb.Append("  BusinessId: ").Append(BusinessId).Append("\n");
            sb.Append("  PeriodYear: ").Append(PeriodYear).Append("\n");
            sb.Append("  TotalRevenue: ").Append(TotalRevenue).Append("\n");
            sb.Append("  PeriodLength: ").Append(PeriodLength).Append("\n");
            sb.Append("  NetIncome: ").Append(NetIncome).Append("\n");
            sb.Append("  PeriodType: ").Append(PeriodType).Append("\n");
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
            return this.Equals(input as BusinessFinancialHealthCheckRequest);
        }

        /// <summary>
        /// Returns true if BusinessFinancialHealthCheckRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of BusinessFinancialHealthCheckRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BusinessFinancialHealthCheckRequest input)
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
                    this.RatioTargets == input.RatioTargets ||
                    (this.RatioTargets != null &&
                    this.RatioTargets.Equals(input.RatioTargets))
                ) && 
                (
                    this.AccountingMethod == input.AccountingMethod ||
                    (this.AccountingMethod != null &&
                    this.AccountingMethod.Equals(input.AccountingMethod))
                ) && 
                (
                    this.TotalLiabilities == input.TotalLiabilities ||
                    (this.TotalLiabilities != null &&
                    this.TotalLiabilities.Equals(input.TotalLiabilities))
                ) && 
                (
                    this.TotalAssets == input.TotalAssets ||
                    (this.TotalAssets != null &&
                    this.TotalAssets.Equals(input.TotalAssets))
                ) && 
                (
                    this.CurrencyConversion == input.CurrencyConversion ||
                    (this.CurrencyConversion != null &&
                    this.CurrencyConversion.Equals(input.CurrencyConversion))
                ) && 
                (
                    this.PeriodQuarter == input.PeriodQuarter ||
                    (this.PeriodQuarter != null &&
                    this.PeriodQuarter.Equals(input.PeriodQuarter))
                ) && 
                (
                    this.PeriodMonth == input.PeriodMonth ||
                    (this.PeriodMonth != null &&
                    this.PeriodMonth.Equals(input.PeriodMonth))
                ) && 
                (
                    this.TotalEquity == input.TotalEquity ||
                    (this.TotalEquity != null &&
                    this.TotalEquity.Equals(input.TotalEquity))
                ) && 
                (
                    this.BusinessId == input.BusinessId ||
                    (this.BusinessId != null &&
                    this.BusinessId.Equals(input.BusinessId))
                ) && 
                (
                    this.PeriodYear == input.PeriodYear ||
                    (this.PeriodYear != null &&
                    this.PeriodYear.Equals(input.PeriodYear))
                ) && 
                (
                    this.TotalRevenue == input.TotalRevenue ||
                    (this.TotalRevenue != null &&
                    this.TotalRevenue.Equals(input.TotalRevenue))
                ) && 
                (
                    this.PeriodLength == input.PeriodLength ||
                    (this.PeriodLength != null &&
                    this.PeriodLength.Equals(input.PeriodLength))
                ) && 
                (
                    this.NetIncome == input.NetIncome ||
                    (this.NetIncome != null &&
                    this.NetIncome.Equals(input.NetIncome))
                ) && 
                (
                    this.PeriodType == input.PeriodType ||
                    (this.PeriodType != null &&
                    this.PeriodType.Equals(input.PeriodType))
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
                if (this.RatioTargets != null)
                    hashCode = hashCode * 59 + this.RatioTargets.GetHashCode();
                if (this.AccountingMethod != null)
                    hashCode = hashCode * 59 + this.AccountingMethod.GetHashCode();
                if (this.TotalLiabilities != null)
                    hashCode = hashCode * 59 + this.TotalLiabilities.GetHashCode();
                if (this.TotalAssets != null)
                    hashCode = hashCode * 59 + this.TotalAssets.GetHashCode();
                if (this.CurrencyConversion != null)
                    hashCode = hashCode * 59 + this.CurrencyConversion.GetHashCode();
                if (this.PeriodQuarter != null)
                    hashCode = hashCode * 59 + this.PeriodQuarter.GetHashCode();
                if (this.PeriodMonth != null)
                    hashCode = hashCode * 59 + this.PeriodMonth.GetHashCode();
                if (this.TotalEquity != null)
                    hashCode = hashCode * 59 + this.TotalEquity.GetHashCode();
                if (this.BusinessId != null)
                    hashCode = hashCode * 59 + this.BusinessId.GetHashCode();
                if (this.PeriodYear != null)
                    hashCode = hashCode * 59 + this.PeriodYear.GetHashCode();
                if (this.TotalRevenue != null)
                    hashCode = hashCode * 59 + this.TotalRevenue.GetHashCode();
                if (this.PeriodLength != null)
                    hashCode = hashCode * 59 + this.PeriodLength.GetHashCode();
                if (this.NetIncome != null)
                    hashCode = hashCode * 59 + this.NetIncome.GetHashCode();
                if (this.PeriodType != null)
                    hashCode = hashCode * 59 + this.PeriodType.GetHashCode();
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
            // TotalLiabilities (float?) minimum
            if(this.TotalLiabilities < (float?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for TotalLiabilities, must be a value greater than or equal to 0.", new [] { "TotalLiabilities" });
            }

            // TotalAssets (float?) minimum
            if(this.TotalAssets < (float?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for TotalAssets, must be a value greater than or equal to 0.", new [] { "TotalAssets" });
            }

            // PeriodQuarter (int?) maximum
            if(this.PeriodQuarter > (int?)4)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for PeriodQuarter, must be a value less than or equal to 4.", new [] { "PeriodQuarter" });
            }

            // PeriodQuarter (int?) minimum
            if(this.PeriodQuarter < (int?)1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for PeriodQuarter, must be a value greater than or equal to 1.", new [] { "PeriodQuarter" });
            }

            // PeriodMonth (int?) maximum
            if(this.PeriodMonth > (int?)12)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for PeriodMonth, must be a value less than or equal to 12.", new [] { "PeriodMonth" });
            }

            // PeriodMonth (int?) minimum
            if(this.PeriodMonth < (int?)1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for PeriodMonth, must be a value greater than or equal to 1.", new [] { "PeriodMonth" });
            }

            // TotalEquity (float?) minimum
            if(this.TotalEquity < (float?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for TotalEquity, must be a value greater than or equal to 0.", new [] { "TotalEquity" });
            }

            // TotalRevenue (float?) minimum
            if(this.TotalRevenue < (float?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for TotalRevenue, must be a value greater than or equal to 0.", new [] { "TotalRevenue" });
            }

            yield break;
        }
    }

}
