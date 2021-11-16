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
    /// GoalAccumulationAllocationRequest
    /// </summary>
    [DataContract]
    public partial class GoalAccumulationAllocationRequest :  IEquatable<GoalAccumulationAllocationRequest>, IValidatableObject
    {
        /// <summary>
        /// Defines RecommendType
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum RecommendTypeEnum
        {
            
            /// <summary>
            /// Enum Recurring for value: recurring
            /// </summary>
            [EnumMember(Value = "recurring")]
            Recurring = 1,
            
            /// <summary>
            /// Enum OneTime for value: one-time
            /// </summary>
            [EnumMember(Value = "one-time")]
            OneTime = 2,
            
            /// <summary>
            /// Enum Combo for value: combo
            /// </summary>
            [EnumMember(Value = "combo")]
            Combo = 3,
            
            /// <summary>
            /// Enum Horizon for value: horizon
            /// </summary>
            [EnumMember(Value = "horizon")]
            Horizon = 4
        }

        /// <summary>
        /// Gets or Sets RecommendType
        /// </summary>
        [DataMember(Name="recommend_type", EmitDefaultValue=false)]
        public RecommendTypeEnum? RecommendType { get; set; }
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
        /// Defines AllocationPriority
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum AllocationPriorityEnum
        {
            
            /// <summary>
            /// Enum Goal for value: goal
            /// </summary>
            [EnumMember(Value = "goal")]
            Goal = 1,
            
            /// <summary>
            /// Enum Risk for value: risk
            /// </summary>
            [EnumMember(Value = "risk")]
            Risk = 2
        }

        /// <summary>
        /// Gets or Sets AllocationPriority
        /// </summary>
        [DataMember(Name="allocation_priority", EmitDefaultValue=false)]
        public AllocationPriorityEnum AllocationPriority { get; set; }
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
        /// Defines ThreshType
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum ThreshTypeEnum
        {
            
            /// <summary>
            /// Enum Amnt for value: amnt
            /// </summary>
            [EnumMember(Value = "amnt")]
            Amnt = 1,
            
            /// <summary>
            /// Enum Perc for value: perc
            /// </summary>
            [EnumMember(Value = "perc")]
            Perc = 2
        }

        /// <summary>
        /// Gets or Sets ThreshType
        /// </summary>
        [DataMember(Name="thresh_type", EmitDefaultValue=false)]
        public ThreshTypeEnum? ThreshType { get; set; }
        /// <summary>
        /// Defines HorizonFrequency
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum HorizonFrequencyEnum
        {
            
            /// <summary>
            /// Enum Year for value: year
            /// </summary>
            [EnumMember(Value = "year")]
            Year = 1,
            
            /// <summary>
            /// Enum Sixmonths for value: six_months
            /// </summary>
            [EnumMember(Value = "six_months")]
            Sixmonths = 2,
            
            /// <summary>
            /// Enum Quarter for value: quarter
            /// </summary>
            [EnumMember(Value = "quarter")]
            Quarter = 3,
            
            /// <summary>
            /// Enum Month for value: month
            /// </summary>
            [EnumMember(Value = "month")]
            Month = 4,
            
            /// <summary>
            /// Enum Twoweeks for value: two_weeks
            /// </summary>
            [EnumMember(Value = "two_weeks")]
            Twoweeks = 5,
            
            /// <summary>
            /// Enum Week for value: week
            /// </summary>
            [EnumMember(Value = "week")]
            Week = 6,
            
            /// <summary>
            /// Enum Day for value: day
            /// </summary>
            [EnumMember(Value = "day")]
            Day = 7
        }

        /// <summary>
        /// Gets or Sets HorizonFrequency
        /// </summary>
        [DataMember(Name="horizon_frequency", EmitDefaultValue=false)]
        public HorizonFrequencyEnum? HorizonFrequency { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="GoalAccumulationAllocationRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected GoalAccumulationAllocationRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="GoalAccumulationAllocationRequest" /> class.
        /// </summary>
        /// <param name="recommendationConfig">recommendationConfig.</param>
        /// <param name="compoundingRate">compoundingRate (default to 0.0F).</param>
        /// <param name="riskScore">riskScore.</param>
        /// <param name="recommendType">recommendType (default to RecommendTypeEnum.Horizon).</param>
        /// <param name="createLog">createLog (default to false).</param>
        /// <param name="goalConfig">goalConfig.</param>
        /// <param name="n">n (default to 1000).</param>
        /// <param name="allocationMethod">allocationMethod (required).</param>
        /// <param name="allocationPriority">allocationPriority (required).</param>
        /// <param name="removeOutliers">removeOutliers (default to true).</param>
        /// <param name="adjustForCompounding">adjustForCompounding (default to false).</param>
        /// <param name="goalId">goalId.</param>
        /// <param name="confTgt">confTgt (default to 0.9F).</param>
        /// <param name="tradingDaysPerYear">tradingDaysPerYear (default to 252).</param>
        /// <param name="useProxyData">useProxyData (default to false).</param>
        /// <param name="thresh">thresh.</param>
        /// <param name="withdrawalTax">withdrawalTax (default to 0.0F).</param>
        /// <param name="clientId">clientId.</param>
        /// <param name="optConfig">optConfig.</param>
        /// <param name="marketDataSource">marketDataSource (default to MarketDataSourceEnum.Nucleus).</param>
        /// <param name="threshType">threshType (default to ThreshTypeEnum.Perc).</param>
        /// <param name="horizonFrequency">horizonFrequency (default to HorizonFrequencyEnum.Year).</param>
        /// <param name="horizon">horizon.</param>
        /// <param name="allocations">allocations.</param>
        /// <param name="currInv">currInv.</param>
        /// <param name="depositConfig">depositConfig.</param>
        public GoalAccumulationAllocationRequest(RecommendationConfig recommendationConfig = default(RecommendationConfig), float? compoundingRate = 0.0F, decimal? riskScore = default(decimal?), RecommendTypeEnum? recommendType = RecommendTypeEnum.Horizon, bool? createLog = false, GoalConfig goalConfig = default(GoalConfig), int? n = 1000, AllocationMethodEnum allocationMethod = default(AllocationMethodEnum), AllocationPriorityEnum allocationPriority = default(AllocationPriorityEnum), bool? removeOutliers = true, bool? adjustForCompounding = false, Guid? goalId = default(Guid?), float? confTgt = 0.9F, int? tradingDaysPerYear = 252, bool? useProxyData = false, decimal? thresh = default(decimal?), float? withdrawalTax = 0.0F, Guid? clientId = default(Guid?), OptConfig optConfig = default(OptConfig), MarketDataSourceEnum? marketDataSource = MarketDataSourceEnum.Nucleus, ThreshTypeEnum? threshType = ThreshTypeEnum.Perc, HorizonFrequencyEnum? horizonFrequency = HorizonFrequencyEnum.Year, int? horizon = default(int?), List<Guid?> allocations = default(List<Guid?>), decimal? currInv = default(decimal?), List<AccumulationGoalDepositConfig> depositConfig = default(List<AccumulationGoalDepositConfig>))
        {
            // to ensure "allocationMethod" is required (not null)
            if (allocationMethod == null)
            {
                throw new InvalidDataException("allocationMethod is a required property for GoalAccumulationAllocationRequest and cannot be null");
            }
            else
            {
                this.AllocationMethod = allocationMethod;
            }
            // to ensure "allocationPriority" is required (not null)
            if (allocationPriority == null)
            {
                throw new InvalidDataException("allocationPriority is a required property for GoalAccumulationAllocationRequest and cannot be null");
            }
            else
            {
                this.AllocationPriority = allocationPriority;
            }
            this.RecommendationConfig = recommendationConfig;
            // use default value if no "compoundingRate" provided
            if (compoundingRate == null)
            {
                this.CompoundingRate = 0.0F;
            }
            else
            {
                this.CompoundingRate = compoundingRate;
            }
            this.RiskScore = riskScore;
            // use default value if no "recommendType" provided
            if (recommendType == null)
            {
                this.RecommendType = RecommendTypeEnum.Horizon;
            }
            else
            {
                this.RecommendType = recommendType;
            }
            // use default value if no "createLog" provided
            if (createLog == null)
            {
                this.CreateLog = false;
            }
            else
            {
                this.CreateLog = createLog;
            }
            this.GoalConfig = goalConfig;
            // use default value if no "n" provided
            if (n == null)
            {
                this.N = 1000;
            }
            else
            {
                this.N = n;
            }
            // use default value if no "removeOutliers" provided
            if (removeOutliers == null)
            {
                this.RemoveOutliers = true;
            }
            else
            {
                this.RemoveOutliers = removeOutliers;
            }
            // use default value if no "adjustForCompounding" provided
            if (adjustForCompounding == null)
            {
                this.AdjustForCompounding = false;
            }
            else
            {
                this.AdjustForCompounding = adjustForCompounding;
            }
            this.GoalId = goalId;
            // use default value if no "confTgt" provided
            if (confTgt == null)
            {
                this.ConfTgt = 0.9F;
            }
            else
            {
                this.ConfTgt = confTgt;
            }
            // use default value if no "tradingDaysPerYear" provided
            if (tradingDaysPerYear == null)
            {
                this.TradingDaysPerYear = 252;
            }
            else
            {
                this.TradingDaysPerYear = tradingDaysPerYear;
            }
            // use default value if no "useProxyData" provided
            if (useProxyData == null)
            {
                this.UseProxyData = false;
            }
            else
            {
                this.UseProxyData = useProxyData;
            }
            this.Thresh = thresh;
            // use default value if no "withdrawalTax" provided
            if (withdrawalTax == null)
            {
                this.WithdrawalTax = 0.0F;
            }
            else
            {
                this.WithdrawalTax = withdrawalTax;
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
            // use default value if no "threshType" provided
            if (threshType == null)
            {
                this.ThreshType = ThreshTypeEnum.Perc;
            }
            else
            {
                this.ThreshType = threshType;
            }
            // use default value if no "horizonFrequency" provided
            if (horizonFrequency == null)
            {
                this.HorizonFrequency = HorizonFrequencyEnum.Year;
            }
            else
            {
                this.HorizonFrequency = horizonFrequency;
            }
            this.Horizon = horizon;
            this.Allocations = allocations;
            this.CurrInv = currInv;
            this.DepositConfig = depositConfig;
        }
        
        /// <summary>
        /// Gets or Sets RecommendationConfig
        /// </summary>
        [DataMember(Name="recommendation_config", EmitDefaultValue=false)]
        public RecommendationConfig RecommendationConfig { get; set; }

        /// <summary>
        /// Gets or Sets CompoundingRate
        /// </summary>
        [DataMember(Name="compounding_rate", EmitDefaultValue=false)]
        public float? CompoundingRate { get; set; }

        /// <summary>
        /// Gets or Sets RiskScore
        /// </summary>
        [DataMember(Name="risk_score", EmitDefaultValue=false)]
        public decimal? RiskScore { get; set; }


        /// <summary>
        /// Gets or Sets CreateLog
        /// </summary>
        [DataMember(Name="create_log", EmitDefaultValue=false)]
        public bool? CreateLog { get; set; }

        /// <summary>
        /// Gets or Sets GoalConfig
        /// </summary>
        [DataMember(Name="goal_config", EmitDefaultValue=false)]
        public GoalConfig GoalConfig { get; set; }

        /// <summary>
        /// Gets or Sets N
        /// </summary>
        [DataMember(Name="n", EmitDefaultValue=false)]
        public int? N { get; set; }



        /// <summary>
        /// Gets or Sets RemoveOutliers
        /// </summary>
        [DataMember(Name="remove_outliers", EmitDefaultValue=false)]
        public bool? RemoveOutliers { get; set; }

        /// <summary>
        /// Gets or Sets AdjustForCompounding
        /// </summary>
        [DataMember(Name="adjust_for_compounding", EmitDefaultValue=false)]
        public bool? AdjustForCompounding { get; set; }

        /// <summary>
        /// Gets or Sets GoalId
        /// </summary>
        [DataMember(Name="goal_id", EmitDefaultValue=false)]
        public Guid? GoalId { get; set; }

        /// <summary>
        /// Gets or Sets ConfTgt
        /// </summary>
        [DataMember(Name="conf_tgt", EmitDefaultValue=false)]
        public float? ConfTgt { get; set; }

        /// <summary>
        /// Gets or Sets TradingDaysPerYear
        /// </summary>
        [DataMember(Name="trading_days_per_year", EmitDefaultValue=false)]
        public int? TradingDaysPerYear { get; set; }

        /// <summary>
        /// Gets or Sets UseProxyData
        /// </summary>
        [DataMember(Name="use_proxy_data", EmitDefaultValue=false)]
        public bool? UseProxyData { get; set; }

        /// <summary>
        /// Gets or Sets Thresh
        /// </summary>
        [DataMember(Name="thresh", EmitDefaultValue=false)]
        public decimal? Thresh { get; set; }

        /// <summary>
        /// Gets or Sets WithdrawalTax
        /// </summary>
        [DataMember(Name="withdrawal_tax", EmitDefaultValue=false)]
        public float? WithdrawalTax { get; set; }

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
        /// Gets or Sets Horizon
        /// </summary>
        [DataMember(Name="horizon", EmitDefaultValue=false)]
        public int? Horizon { get; set; }

        /// <summary>
        /// Gets or Sets Allocations
        /// </summary>
        [DataMember(Name="allocations", EmitDefaultValue=false)]
        public List<Guid?> Allocations { get; set; }

        /// <summary>
        /// Gets or Sets CurrInv
        /// </summary>
        [DataMember(Name="curr_inv", EmitDefaultValue=false)]
        public decimal? CurrInv { get; set; }

        /// <summary>
        /// Gets or Sets DepositConfig
        /// </summary>
        [DataMember(Name="deposit_config", EmitDefaultValue=false)]
        public List<AccumulationGoalDepositConfig> DepositConfig { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class GoalAccumulationAllocationRequest {\n");
            sb.Append("  RecommendationConfig: ").Append(RecommendationConfig).Append("\n");
            sb.Append("  CompoundingRate: ").Append(CompoundingRate).Append("\n");
            sb.Append("  RiskScore: ").Append(RiskScore).Append("\n");
            sb.Append("  RecommendType: ").Append(RecommendType).Append("\n");
            sb.Append("  CreateLog: ").Append(CreateLog).Append("\n");
            sb.Append("  GoalConfig: ").Append(GoalConfig).Append("\n");
            sb.Append("  N: ").Append(N).Append("\n");
            sb.Append("  AllocationMethod: ").Append(AllocationMethod).Append("\n");
            sb.Append("  AllocationPriority: ").Append(AllocationPriority).Append("\n");
            sb.Append("  RemoveOutliers: ").Append(RemoveOutliers).Append("\n");
            sb.Append("  AdjustForCompounding: ").Append(AdjustForCompounding).Append("\n");
            sb.Append("  GoalId: ").Append(GoalId).Append("\n");
            sb.Append("  ConfTgt: ").Append(ConfTgt).Append("\n");
            sb.Append("  TradingDaysPerYear: ").Append(TradingDaysPerYear).Append("\n");
            sb.Append("  UseProxyData: ").Append(UseProxyData).Append("\n");
            sb.Append("  Thresh: ").Append(Thresh).Append("\n");
            sb.Append("  WithdrawalTax: ").Append(WithdrawalTax).Append("\n");
            sb.Append("  ClientId: ").Append(ClientId).Append("\n");
            sb.Append("  OptConfig: ").Append(OptConfig).Append("\n");
            sb.Append("  MarketDataSource: ").Append(MarketDataSource).Append("\n");
            sb.Append("  ThreshType: ").Append(ThreshType).Append("\n");
            sb.Append("  HorizonFrequency: ").Append(HorizonFrequency).Append("\n");
            sb.Append("  Horizon: ").Append(Horizon).Append("\n");
            sb.Append("  Allocations: ").Append(Allocations).Append("\n");
            sb.Append("  CurrInv: ").Append(CurrInv).Append("\n");
            sb.Append("  DepositConfig: ").Append(DepositConfig).Append("\n");
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
            return this.Equals(input as GoalAccumulationAllocationRequest);
        }

        /// <summary>
        /// Returns true if GoalAccumulationAllocationRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of GoalAccumulationAllocationRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GoalAccumulationAllocationRequest input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.RecommendationConfig == input.RecommendationConfig ||
                    (this.RecommendationConfig != null &&
                    this.RecommendationConfig.Equals(input.RecommendationConfig))
                ) && 
                (
                    this.CompoundingRate == input.CompoundingRate ||
                    (this.CompoundingRate != null &&
                    this.CompoundingRate.Equals(input.CompoundingRate))
                ) && 
                (
                    this.RiskScore == input.RiskScore ||
                    (this.RiskScore != null &&
                    this.RiskScore.Equals(input.RiskScore))
                ) && 
                (
                    this.RecommendType == input.RecommendType ||
                    (this.RecommendType != null &&
                    this.RecommendType.Equals(input.RecommendType))
                ) && 
                (
                    this.CreateLog == input.CreateLog ||
                    (this.CreateLog != null &&
                    this.CreateLog.Equals(input.CreateLog))
                ) && 
                (
                    this.GoalConfig == input.GoalConfig ||
                    (this.GoalConfig != null &&
                    this.GoalConfig.Equals(input.GoalConfig))
                ) && 
                (
                    this.N == input.N ||
                    (this.N != null &&
                    this.N.Equals(input.N))
                ) && 
                (
                    this.AllocationMethod == input.AllocationMethod ||
                    (this.AllocationMethod != null &&
                    this.AllocationMethod.Equals(input.AllocationMethod))
                ) && 
                (
                    this.AllocationPriority == input.AllocationPriority ||
                    (this.AllocationPriority != null &&
                    this.AllocationPriority.Equals(input.AllocationPriority))
                ) && 
                (
                    this.RemoveOutliers == input.RemoveOutliers ||
                    (this.RemoveOutliers != null &&
                    this.RemoveOutliers.Equals(input.RemoveOutliers))
                ) && 
                (
                    this.AdjustForCompounding == input.AdjustForCompounding ||
                    (this.AdjustForCompounding != null &&
                    this.AdjustForCompounding.Equals(input.AdjustForCompounding))
                ) && 
                (
                    this.GoalId == input.GoalId ||
                    (this.GoalId != null &&
                    this.GoalId.Equals(input.GoalId))
                ) && 
                (
                    this.ConfTgt == input.ConfTgt ||
                    (this.ConfTgt != null &&
                    this.ConfTgt.Equals(input.ConfTgt))
                ) && 
                (
                    this.TradingDaysPerYear == input.TradingDaysPerYear ||
                    (this.TradingDaysPerYear != null &&
                    this.TradingDaysPerYear.Equals(input.TradingDaysPerYear))
                ) && 
                (
                    this.UseProxyData == input.UseProxyData ||
                    (this.UseProxyData != null &&
                    this.UseProxyData.Equals(input.UseProxyData))
                ) && 
                (
                    this.Thresh == input.Thresh ||
                    (this.Thresh != null &&
                    this.Thresh.Equals(input.Thresh))
                ) && 
                (
                    this.WithdrawalTax == input.WithdrawalTax ||
                    (this.WithdrawalTax != null &&
                    this.WithdrawalTax.Equals(input.WithdrawalTax))
                ) && 
                (
                    this.ClientId == input.ClientId ||
                    (this.ClientId != null &&
                    this.ClientId.Equals(input.ClientId))
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
                    this.ThreshType == input.ThreshType ||
                    (this.ThreshType != null &&
                    this.ThreshType.Equals(input.ThreshType))
                ) && 
                (
                    this.HorizonFrequency == input.HorizonFrequency ||
                    (this.HorizonFrequency != null &&
                    this.HorizonFrequency.Equals(input.HorizonFrequency))
                ) && 
                (
                    this.Horizon == input.Horizon ||
                    (this.Horizon != null &&
                    this.Horizon.Equals(input.Horizon))
                ) && 
                (
                    this.Allocations == input.Allocations ||
                    this.Allocations != null &&
                    this.Allocations.SequenceEqual(input.Allocations)
                ) && 
                (
                    this.CurrInv == input.CurrInv ||
                    (this.CurrInv != null &&
                    this.CurrInv.Equals(input.CurrInv))
                ) && 
                (
                    this.DepositConfig == input.DepositConfig ||
                    this.DepositConfig != null &&
                    this.DepositConfig.SequenceEqual(input.DepositConfig)
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
                if (this.RecommendationConfig != null)
                    hashCode = hashCode * 59 + this.RecommendationConfig.GetHashCode();
                if (this.CompoundingRate != null)
                    hashCode = hashCode * 59 + this.CompoundingRate.GetHashCode();
                if (this.RiskScore != null)
                    hashCode = hashCode * 59 + this.RiskScore.GetHashCode();
                if (this.RecommendType != null)
                    hashCode = hashCode * 59 + this.RecommendType.GetHashCode();
                if (this.CreateLog != null)
                    hashCode = hashCode * 59 + this.CreateLog.GetHashCode();
                if (this.GoalConfig != null)
                    hashCode = hashCode * 59 + this.GoalConfig.GetHashCode();
                if (this.N != null)
                    hashCode = hashCode * 59 + this.N.GetHashCode();
                if (this.AllocationMethod != null)
                    hashCode = hashCode * 59 + this.AllocationMethod.GetHashCode();
                if (this.AllocationPriority != null)
                    hashCode = hashCode * 59 + this.AllocationPriority.GetHashCode();
                if (this.RemoveOutliers != null)
                    hashCode = hashCode * 59 + this.RemoveOutliers.GetHashCode();
                if (this.AdjustForCompounding != null)
                    hashCode = hashCode * 59 + this.AdjustForCompounding.GetHashCode();
                if (this.GoalId != null)
                    hashCode = hashCode * 59 + this.GoalId.GetHashCode();
                if (this.ConfTgt != null)
                    hashCode = hashCode * 59 + this.ConfTgt.GetHashCode();
                if (this.TradingDaysPerYear != null)
                    hashCode = hashCode * 59 + this.TradingDaysPerYear.GetHashCode();
                if (this.UseProxyData != null)
                    hashCode = hashCode * 59 + this.UseProxyData.GetHashCode();
                if (this.Thresh != null)
                    hashCode = hashCode * 59 + this.Thresh.GetHashCode();
                if (this.WithdrawalTax != null)
                    hashCode = hashCode * 59 + this.WithdrawalTax.GetHashCode();
                if (this.ClientId != null)
                    hashCode = hashCode * 59 + this.ClientId.GetHashCode();
                if (this.OptConfig != null)
                    hashCode = hashCode * 59 + this.OptConfig.GetHashCode();
                if (this.MarketDataSource != null)
                    hashCode = hashCode * 59 + this.MarketDataSource.GetHashCode();
                if (this.ThreshType != null)
                    hashCode = hashCode * 59 + this.ThreshType.GetHashCode();
                if (this.HorizonFrequency != null)
                    hashCode = hashCode * 59 + this.HorizonFrequency.GetHashCode();
                if (this.Horizon != null)
                    hashCode = hashCode * 59 + this.Horizon.GetHashCode();
                if (this.Allocations != null)
                    hashCode = hashCode * 59 + this.Allocations.GetHashCode();
                if (this.CurrInv != null)
                    hashCode = hashCode * 59 + this.CurrInv.GetHashCode();
                if (this.DepositConfig != null)
                    hashCode = hashCode * 59 + this.DepositConfig.GetHashCode();
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
            // CompoundingRate (float?) minimum
            if(this.CompoundingRate < (float?)-1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for CompoundingRate, must be a value greater than or equal to -1.", new [] { "CompoundingRate" });
            }

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

            // N (int?) maximum
            if(this.N > (int?)10000)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for N, must be a value less than or equal to 10000.", new [] { "N" });
            }

            // N (int?) minimum
            if(this.N < (int?)1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for N, must be a value greater than or equal to 1.", new [] { "N" });
            }

            // ConfTgt (float?) maximum
            if(this.ConfTgt > (float?)1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for ConfTgt, must be a value less than or equal to 1.", new [] { "ConfTgt" });
            }

            // ConfTgt (float?) minimum
            if(this.ConfTgt < (float?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for ConfTgt, must be a value greater than or equal to 0.", new [] { "ConfTgt" });
            }

            // TradingDaysPerYear (int?) maximum
            if(this.TradingDaysPerYear > (int?)365)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for TradingDaysPerYear, must be a value less than or equal to 365.", new [] { "TradingDaysPerYear" });
            }

            // TradingDaysPerYear (int?) minimum
            if(this.TradingDaysPerYear < (int?)1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for TradingDaysPerYear, must be a value greater than or equal to 1.", new [] { "TradingDaysPerYear" });
            }

            // Thresh (decimal?) minimum
            if(this.Thresh < (decimal?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Thresh, must be a value greater than or equal to 0.", new [] { "Thresh" });
            }

            // WithdrawalTax (float?) maximum
            if(this.WithdrawalTax > (float?)1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for WithdrawalTax, must be a value less than or equal to 1.", new [] { "WithdrawalTax" });
            }

            // WithdrawalTax (float?) minimum
            if(this.WithdrawalTax < (float?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for WithdrawalTax, must be a value greater than or equal to 0.", new [] { "WithdrawalTax" });
            }

            // Horizon (int?) maximum
            if(this.Horizon > (int?)350)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Horizon, must be a value less than or equal to 350.", new [] { "Horizon" });
            }

            // Horizon (int?) minimum
            if(this.Horizon < (int?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Horizon, must be a value greater than or equal to 0.", new [] { "Horizon" });
            }

            // CurrInv (decimal?) minimum
            if(this.CurrInv < (decimal?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for CurrInv, must be a value greater than or equal to 0.", new [] { "CurrInv" });
            }

            yield break;
        }
    }

}