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
    /// RiskAllocationRequest
    /// </summary>
    [DataContract]
    public partial class RiskAllocationRequest :  IEquatable<RiskAllocationRequest>, IValidatableObject
    {
        /// <summary>
        /// Defines AllocationMethod
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum AllocationMethodEnum
        {
            
            /// <summary>
            /// Enum Select for value: select
            /// </summary>
            [EnumMember(Value = "select")]
            Select = 1,
            
            /// <summary>
            /// Enum Create for value: create
            /// </summary>
            [EnumMember(Value = "create")]
            Create = 2
        }

        /// <summary>
        /// Gets or Sets AllocationMethod
        /// </summary>
        [DataMember(Name="allocation_method", EmitDefaultValue=false)]
        public AllocationMethodEnum AllocationMethod { get; set; }
        /// <summary>
        /// Defines MarketDataSource
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum MarketDataSourceEnum
        {
            
            /// <summary>
            /// Enum Nucleus for value: nucleus
            /// </summary>
            [EnumMember(Value = "nucleus")]
            Nucleus = 1,
            
            /// <summary>
            /// Enum Integration for value: integration
            /// </summary>
            [EnumMember(Value = "integration")]
            Integration = 2
        }

        /// <summary>
        /// Gets or Sets MarketDataSource
        /// </summary>
        [DataMember(Name="market_data_source", EmitDefaultValue=false)]
        public MarketDataSourceEnum? MarketDataSource { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="RiskAllocationRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected RiskAllocationRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="RiskAllocationRequest" /> class.
        /// </summary>
        /// <param name="clientId">clientId.</param>
        /// <param name="allocationMethod">allocationMethod (required).</param>
        /// <param name="optConfig">optConfig.</param>
        /// <param name="marketDataSource">marketDataSource (default to MarketDataSourceEnum.Nucleus).</param>
        /// <param name="riskScore">riskScore.</param>
        /// <param name="useProxyData">useProxyData (default to false).</param>
        /// <param name="allocations">allocations.</param>
        public RiskAllocationRequest(Guid? clientId = default(Guid?), AllocationMethodEnum allocationMethod = default(AllocationMethodEnum), OptConfig optConfig = default(OptConfig), MarketDataSourceEnum? marketDataSource = MarketDataSourceEnum.Nucleus, decimal? riskScore = default(decimal?), bool? useProxyData = false, List<Guid?> allocations = default(List<Guid?>))
        {
            // to ensure "allocationMethod" is required (not null)
            if (allocationMethod == null)
            {
                throw new InvalidDataException("allocationMethod is a required property for RiskAllocationRequest and cannot be null");
            }
            else
            {
                this.AllocationMethod = allocationMethod;
            }
            this.ClientId = clientId;
            this.OptConfig = optConfig;
            // use default value if no "marketDataSource" provided
            if (marketDataSource == null)
            {
                this.MarketDataSource = MarketDataSourceEnum.Nucleus;
            }
            else
            {
                this.MarketDataSource = marketDataSource;
            }
            this.RiskScore = riskScore;
            // use default value if no "useProxyData" provided
            if (useProxyData == null)
            {
                this.UseProxyData = false;
            }
            else
            {
                this.UseProxyData = useProxyData;
            }
            this.Allocations = allocations;
        }
        
        /// <summary>
        /// Gets or Sets ClientId
        /// </summary>
        [DataMember(Name="client_id", EmitDefaultValue=false)]
        public Guid? ClientId { get; set; }


        /// <summary>
        /// Gets or Sets OptConfig
        /// </summary>
        [DataMember(Name="opt_config", EmitDefaultValue=false)]
        public OptConfig OptConfig { get; set; }


        /// <summary>
        /// Gets or Sets RiskScore
        /// </summary>
        [DataMember(Name="risk_score", EmitDefaultValue=false)]
        public decimal? RiskScore { get; set; }

        /// <summary>
        /// Gets or Sets UseProxyData
        /// </summary>
        [DataMember(Name="use_proxy_data", EmitDefaultValue=false)]
        public bool? UseProxyData { get; set; }

        /// <summary>
        /// Gets or Sets Allocations
        /// </summary>
        [DataMember(Name="allocations", EmitDefaultValue=false)]
        public List<Guid?> Allocations { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class RiskAllocationRequest {\n");
            sb.Append("  ClientId: ").Append(ClientId).Append("\n");
            sb.Append("  AllocationMethod: ").Append(AllocationMethod).Append("\n");
            sb.Append("  OptConfig: ").Append(OptConfig).Append("\n");
            sb.Append("  MarketDataSource: ").Append(MarketDataSource).Append("\n");
            sb.Append("  RiskScore: ").Append(RiskScore).Append("\n");
            sb.Append("  UseProxyData: ").Append(UseProxyData).Append("\n");
            sb.Append("  Allocations: ").Append(Allocations).Append("\n");
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
            return this.Equals(input as RiskAllocationRequest);
        }

        /// <summary>
        /// Returns true if RiskAllocationRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of RiskAllocationRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RiskAllocationRequest input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.ClientId == input.ClientId ||
                    (this.ClientId != null &&
                    this.ClientId.Equals(input.ClientId))
                ) && 
                (
                    this.AllocationMethod == input.AllocationMethod ||
                    (this.AllocationMethod != null &&
                    this.AllocationMethod.Equals(input.AllocationMethod))
                ) && 
                (
                    this.OptConfig == input.OptConfig ||
                    (this.OptConfig != null &&
                    this.OptConfig.Equals(input.OptConfig))
                ) && 
                (
                    this.MarketDataSource == input.MarketDataSource ||
                    (this.MarketDataSource != null &&
                    this.MarketDataSource.Equals(input.MarketDataSource))
                ) && 
                (
                    this.RiskScore == input.RiskScore ||
                    (this.RiskScore != null &&
                    this.RiskScore.Equals(input.RiskScore))
                ) && 
                (
                    this.UseProxyData == input.UseProxyData ||
                    (this.UseProxyData != null &&
                    this.UseProxyData.Equals(input.UseProxyData))
                ) && 
                (
                    this.Allocations == input.Allocations ||
                    this.Allocations != null &&
                    this.Allocations.SequenceEqual(input.Allocations)
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
                if (this.ClientId != null)
                    hashCode = hashCode * 59 + this.ClientId.GetHashCode();
                if (this.AllocationMethod != null)
                    hashCode = hashCode * 59 + this.AllocationMethod.GetHashCode();
                if (this.OptConfig != null)
                    hashCode = hashCode * 59 + this.OptConfig.GetHashCode();
                if (this.MarketDataSource != null)
                    hashCode = hashCode * 59 + this.MarketDataSource.GetHashCode();
                if (this.RiskScore != null)
                    hashCode = hashCode * 59 + this.RiskScore.GetHashCode();
                if (this.UseProxyData != null)
                    hashCode = hashCode * 59 + this.UseProxyData.GetHashCode();
                if (this.Allocations != null)
                    hashCode = hashCode * 59 + this.Allocations.GetHashCode();
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
            // RiskScore (decimal?) maximum
            if(this.RiskScore > (decimal?)100)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for RiskScore, must be a value less than or equal to 100.", new [] { "RiskScore" });
            }

            // RiskScore (decimal?) minimum
            if(this.RiskScore < (decimal?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for RiskScore, must be a value greater than or equal to 0.", new [] { "RiskScore" });
            }

            yield break;
        }
    }

}
