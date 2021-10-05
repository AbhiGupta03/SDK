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
    /// Aggregation Account Holding Object
    /// </summary>
    [DataContract]
    public partial class AggregationAccountHolding :  IEquatable<AggregationAccountHolding>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AggregationAccountHolding" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected AggregationAccountHolding() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="AggregationAccountHolding" /> class.
        /// </summary>
        /// <param name="aggregationAccountId">aggregationAccountId.</param>
        /// <param name="amount">amount.</param>
        /// <param name="assetClass">assetClass.</param>
        /// <param name="costBasis">costBasis.</param>
        /// <param name="createDate">createDate.</param>
        /// <param name="currencyCode">currencyCode.</param>
        /// <param name="cusip">cusip.</param>
        /// <param name="exchange">exchange.</param>
        /// <param name="holdingDate">holding_date.</param>
        /// <param name="holdingType">holdingType.</param>
        /// <param name="id">id.</param>
        /// <param name="isActive">isActive.</param>
        /// <param name="isin">isin.</param>
        /// <param name="metadata">metadata.</param>
        /// <param name="price">price.</param>
        /// <param name="secondaryId">secondaryId.</param>
        /// <param name="shares">shares (required).</param>
        /// <param name="ticker">ticker.</param>
        /// <param name="tickerName">tickerName.</param>
        /// <param name="updateDate">updateDate.</param>
        public AggregationAccountHolding(Guid? aggregationAccountId = default(Guid?), double? amount = default(double?), string assetClass = default(string), double? costBasis = default(double?), DateTime? createDate = default(DateTime?), string currencyCode = default(string), string cusip = default(string), string exchange = default(string), DateTime? holdingDate = default(DateTime?), string holdingType = default(string), Guid? id = default(Guid?), bool? isActive = default(bool?), string isin = default(string), Dictionary<string, string> metadata = default(Dictionary<string, string>), double? price = default(double?), string secondaryId = default(string), double? shares = default(double?), string ticker = default(string), string tickerName = default(string), DateTime? updateDate = default(DateTime?))
        {
            // to ensure "shares" is required (not null)
            if (shares == null)
            {
                throw new InvalidDataException("shares is a required property for AggregationAccountHolding and cannot be null");
            }
            else
            {
                this.Shares = shares;
            }
            this.AggregationAccountId = aggregationAccountId;
            this.Amount = amount;
            this.AssetClass = assetClass;
            this.CostBasis = costBasis;
            this.CreateDate = createDate;
            this.CurrencyCode = currencyCode;
            this.Cusip = cusip;
            this.Exchange = exchange;
            this.HoldingDate = holdingDate;
            this.HoldingType = holdingType;
            this.Id = id;
            this.IsActive = isActive;
            this.Isin = isin;
            this.Metadata = metadata;
            this.Price = price;
            this.SecondaryId = secondaryId;
            this.Ticker = ticker;
            this.TickerName = tickerName;
            this.UpdateDate = updateDate;
        }
        
        /// <summary>
        /// aggregationAccountId
        /// </summary>
        /// <value>aggregationAccountId</value>
        [DataMember(Name="aggregation_account_id", EmitDefaultValue=false)]
        public Guid? AggregationAccountId { get; set; }

        /// <summary>
        /// Gets or Sets Amount
        /// </summary>
        [DataMember(Name="amount", EmitDefaultValue=false)]
        public double? Amount { get; set; }

        /// <summary>
        /// Gets or Sets AssetClass
        /// </summary>
        [DataMember(Name="asset_class", EmitDefaultValue=false)]
        public string AssetClass { get; set; }

        /// <summary>
        /// Gets or Sets CostBasis
        /// </summary>
        [DataMember(Name="cost_basis", EmitDefaultValue=false)]
        public double? CostBasis { get; set; }

        /// <summary>
        /// createDate
        /// </summary>
        /// <value>createDate</value>
        [DataMember(Name="create_date", EmitDefaultValue=false)]
        public DateTime? CreateDate { get; set; }

        /// <summary>
        /// Gets or Sets CurrencyCode
        /// </summary>
        [DataMember(Name="currency_code", EmitDefaultValue=false)]
        public string CurrencyCode { get; set; }

        /// <summary>
        /// Gets or Sets Cusip
        /// </summary>
        [DataMember(Name="cusip", EmitDefaultValue=false)]
        public string Cusip { get; set; }

        /// <summary>
        /// Gets or Sets Exchange
        /// </summary>
        [DataMember(Name="exchange", EmitDefaultValue=false)]
        public string Exchange { get; set; }

        /// <summary>
        /// holding_date
        /// </summary>
        /// <value>holding_date</value>
        [DataMember(Name="holding_date", EmitDefaultValue=false)]
        public DateTime? HoldingDate { get; set; }

        /// <summary>
        /// Gets or Sets HoldingType
        /// </summary>
        [DataMember(Name="holding_type", EmitDefaultValue=false)]
        public string HoldingType { get; set; }

        /// <summary>
        /// id
        /// </summary>
        /// <value>id</value>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public Guid? Id { get; set; }

        /// <summary>
        /// isActive
        /// </summary>
        /// <value>isActive</value>
        [DataMember(Name="is_active", EmitDefaultValue=false)]
        public bool? IsActive { get; set; }

        /// <summary>
        /// isin
        /// </summary>
        /// <value>isin</value>
        [DataMember(Name="isin", EmitDefaultValue=false)]
        public string Isin { get; set; }

        /// <summary>
        /// Gets or Sets Metadata
        /// </summary>
        [DataMember(Name="metadata", EmitDefaultValue=false)]
        public Dictionary<string, string> Metadata { get; set; }

        /// <summary>
        /// Gets or Sets Price
        /// </summary>
        [DataMember(Name="price", EmitDefaultValue=false)]
        public double? Price { get; set; }

        /// <summary>
        /// Gets or Sets SecondaryId
        /// </summary>
        [DataMember(Name="secondary_id", EmitDefaultValue=false)]
        public string SecondaryId { get; set; }

        /// <summary>
        /// shares
        /// </summary>
        /// <value>shares</value>
        [DataMember(Name="shares", EmitDefaultValue=false)]
        public double? Shares { get; set; }

        /// <summary>
        /// ticker
        /// </summary>
        /// <value>ticker</value>
        [DataMember(Name="ticker", EmitDefaultValue=false)]
        public string Ticker { get; set; }

        /// <summary>
        /// tickerName
        /// </summary>
        /// <value>tickerName</value>
        [DataMember(Name="ticker_name", EmitDefaultValue=false)]
        public string TickerName { get; set; }

        /// <summary>
        /// updateDate
        /// </summary>
        /// <value>updateDate</value>
        [DataMember(Name="update_date", EmitDefaultValue=false)]
        public DateTime? UpdateDate { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AggregationAccountHolding {\n");
            sb.Append("  AggregationAccountId: ").Append(AggregationAccountId).Append("\n");
            sb.Append("  Amount: ").Append(Amount).Append("\n");
            sb.Append("  AssetClass: ").Append(AssetClass).Append("\n");
            sb.Append("  CostBasis: ").Append(CostBasis).Append("\n");
            sb.Append("  CreateDate: ").Append(CreateDate).Append("\n");
            sb.Append("  CurrencyCode: ").Append(CurrencyCode).Append("\n");
            sb.Append("  Cusip: ").Append(Cusip).Append("\n");
            sb.Append("  Exchange: ").Append(Exchange).Append("\n");
            sb.Append("  HoldingDate: ").Append(HoldingDate).Append("\n");
            sb.Append("  HoldingType: ").Append(HoldingType).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  IsActive: ").Append(IsActive).Append("\n");
            sb.Append("  Isin: ").Append(Isin).Append("\n");
            sb.Append("  Metadata: ").Append(Metadata).Append("\n");
            sb.Append("  Price: ").Append(Price).Append("\n");
            sb.Append("  SecondaryId: ").Append(SecondaryId).Append("\n");
            sb.Append("  Shares: ").Append(Shares).Append("\n");
            sb.Append("  Ticker: ").Append(Ticker).Append("\n");
            sb.Append("  TickerName: ").Append(TickerName).Append("\n");
            sb.Append("  UpdateDate: ").Append(UpdateDate).Append("\n");
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
            return this.Equals(input as AggregationAccountHolding);
        }

        /// <summary>
        /// Returns true if AggregationAccountHolding instances are equal
        /// </summary>
        /// <param name="input">Instance of AggregationAccountHolding to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AggregationAccountHolding input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.AggregationAccountId == input.AggregationAccountId ||
                    (this.AggregationAccountId != null &&
                    this.AggregationAccountId.Equals(input.AggregationAccountId))
                ) && 
                (
                    this.Amount == input.Amount ||
                    (this.Amount != null &&
                    this.Amount.Equals(input.Amount))
                ) && 
                (
                    this.AssetClass == input.AssetClass ||
                    (this.AssetClass != null &&
                    this.AssetClass.Equals(input.AssetClass))
                ) && 
                (
                    this.CostBasis == input.CostBasis ||
                    (this.CostBasis != null &&
                    this.CostBasis.Equals(input.CostBasis))
                ) && 
                (
                    this.CreateDate == input.CreateDate ||
                    (this.CreateDate != null &&
                    this.CreateDate.Equals(input.CreateDate))
                ) && 
                (
                    this.CurrencyCode == input.CurrencyCode ||
                    (this.CurrencyCode != null &&
                    this.CurrencyCode.Equals(input.CurrencyCode))
                ) && 
                (
                    this.Cusip == input.Cusip ||
                    (this.Cusip != null &&
                    this.Cusip.Equals(input.Cusip))
                ) && 
                (
                    this.Exchange == input.Exchange ||
                    (this.Exchange != null &&
                    this.Exchange.Equals(input.Exchange))
                ) && 
                (
                    this.HoldingDate == input.HoldingDate ||
                    (this.HoldingDate != null &&
                    this.HoldingDate.Equals(input.HoldingDate))
                ) && 
                (
                    this.HoldingType == input.HoldingType ||
                    (this.HoldingType != null &&
                    this.HoldingType.Equals(input.HoldingType))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.IsActive == input.IsActive ||
                    (this.IsActive != null &&
                    this.IsActive.Equals(input.IsActive))
                ) && 
                (
                    this.Isin == input.Isin ||
                    (this.Isin != null &&
                    this.Isin.Equals(input.Isin))
                ) && 
                (
                    this.Metadata == input.Metadata ||
                    this.Metadata != null &&
                    this.Metadata.SequenceEqual(input.Metadata)
                ) && 
                (
                    this.Price == input.Price ||
                    (this.Price != null &&
                    this.Price.Equals(input.Price))
                ) && 
                (
                    this.SecondaryId == input.SecondaryId ||
                    (this.SecondaryId != null &&
                    this.SecondaryId.Equals(input.SecondaryId))
                ) && 
                (
                    this.Shares == input.Shares ||
                    (this.Shares != null &&
                    this.Shares.Equals(input.Shares))
                ) && 
                (
                    this.Ticker == input.Ticker ||
                    (this.Ticker != null &&
                    this.Ticker.Equals(input.Ticker))
                ) && 
                (
                    this.TickerName == input.TickerName ||
                    (this.TickerName != null &&
                    this.TickerName.Equals(input.TickerName))
                ) && 
                (
                    this.UpdateDate == input.UpdateDate ||
                    (this.UpdateDate != null &&
                    this.UpdateDate.Equals(input.UpdateDate))
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
                if (this.AggregationAccountId != null)
                    hashCode = hashCode * 59 + this.AggregationAccountId.GetHashCode();
                if (this.Amount != null)
                    hashCode = hashCode * 59 + this.Amount.GetHashCode();
                if (this.AssetClass != null)
                    hashCode = hashCode * 59 + this.AssetClass.GetHashCode();
                if (this.CostBasis != null)
                    hashCode = hashCode * 59 + this.CostBasis.GetHashCode();
                if (this.CreateDate != null)
                    hashCode = hashCode * 59 + this.CreateDate.GetHashCode();
                if (this.CurrencyCode != null)
                    hashCode = hashCode * 59 + this.CurrencyCode.GetHashCode();
                if (this.Cusip != null)
                    hashCode = hashCode * 59 + this.Cusip.GetHashCode();
                if (this.Exchange != null)
                    hashCode = hashCode * 59 + this.Exchange.GetHashCode();
                if (this.HoldingDate != null)
                    hashCode = hashCode * 59 + this.HoldingDate.GetHashCode();
                if (this.HoldingType != null)
                    hashCode = hashCode * 59 + this.HoldingType.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.IsActive != null)
                    hashCode = hashCode * 59 + this.IsActive.GetHashCode();
                if (this.Isin != null)
                    hashCode = hashCode * 59 + this.Isin.GetHashCode();
                if (this.Metadata != null)
                    hashCode = hashCode * 59 + this.Metadata.GetHashCode();
                if (this.Price != null)
                    hashCode = hashCode * 59 + this.Price.GetHashCode();
                if (this.SecondaryId != null)
                    hashCode = hashCode * 59 + this.SecondaryId.GetHashCode();
                if (this.Shares != null)
                    hashCode = hashCode * 59 + this.Shares.GetHashCode();
                if (this.Ticker != null)
                    hashCode = hashCode * 59 + this.Ticker.GetHashCode();
                if (this.TickerName != null)
                    hashCode = hashCode * 59 + this.TickerName.GetHashCode();
                if (this.UpdateDate != null)
                    hashCode = hashCode * 59 + this.UpdateDate.GetHashCode();
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
