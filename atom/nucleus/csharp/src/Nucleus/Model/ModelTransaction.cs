/* 
 * Hydrogen Nucleus API
 *
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.4
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
using SwaggerDateConverter = Nucleus.Client.SwaggerDateConverter;

namespace Nucleus.ModelEntity
{
    /// <summary>
    /// ModelTransaction
    /// </summary>
    [DataContract]
    public partial class ModelTransaction :  IEquatable<ModelTransaction>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModelTransaction" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModelTransaction() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModelTransaction" /> class.
        /// </summary>
        /// <param name="createDate">createDate.</param>
        /// <param name="date">Date (required).</param>
        /// <param name="id">id.</param>
        /// <param name="modelId">modelId (required).</param>
        /// <param name="price">price (required).</param>
        /// <param name="secondaryId">secondaryId.</param>
        /// <param name="securityId">securityId (required).</param>
        /// <param name="shares">shares (required).</param>
        /// <param name="transactionCodeId">transactionCodeId (required).</param>
        /// <param name="updateDate">updateDate.</param>
        public ModelTransaction(DateTime? createDate = default(DateTime?), DateTime? date = default(DateTime?), Guid? id = default(Guid?), Guid? modelId = default(Guid?), double? price = default(double?), string secondaryId = default(string), Guid? securityId = default(Guid?), double? shares = default(double?), Guid? transactionCodeId = default(Guid?), DateTime? updateDate = default(DateTime?))
        {
            // to ensure "date" is required (not null)
            if (date == null)
            {
                throw new InvalidDataException("date is a required property for ModelTransaction and cannot be null");
            }
            else
            {
                this.Date = date;
            }
            // to ensure "modelId" is required (not null)
            if (modelId == null)
            {
                throw new InvalidDataException("modelId is a required property for ModelTransaction and cannot be null");
            }
            else
            {
                this.ModelId = modelId;
            }
            // to ensure "price" is required (not null)
            if (price == null)
            {
                throw new InvalidDataException("price is a required property for ModelTransaction and cannot be null");
            }
            else
            {
                this.Price = price;
            }
            // to ensure "securityId" is required (not null)
            if (securityId == null)
            {
                throw new InvalidDataException("securityId is a required property for ModelTransaction and cannot be null");
            }
            else
            {
                this.SecurityId = securityId;
            }
            // to ensure "shares" is required (not null)
            if (shares == null)
            {
                throw new InvalidDataException("shares is a required property for ModelTransaction and cannot be null");
            }
            else
            {
                this.Shares = shares;
            }
            // to ensure "transactionCodeId" is required (not null)
            if (transactionCodeId == null)
            {
                throw new InvalidDataException("transactionCodeId is a required property for ModelTransaction and cannot be null");
            }
            else
            {
                this.TransactionCodeId = transactionCodeId;
            }
            this.CreateDate = createDate;
            this.Id = id;
            this.SecondaryId = secondaryId;
            this.UpdateDate = updateDate;
        }
        
        /// <summary>
        /// Gets or Sets CreateDate
        /// </summary>
        [DataMember(Name="create_date", EmitDefaultValue=false)]
        public DateTime? CreateDate { get; set; }

        /// <summary>
        /// Date
        /// </summary>
        /// <value>Date</value>
        [DataMember(Name="date", EmitDefaultValue=false)]
        [JsonConverter(typeof(SwaggerDateConverter))]
        public DateTime? Date { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public Guid? Id { get; set; }

        /// <summary>
        /// modelId
        /// </summary>
        /// <value>modelId</value>
        [DataMember(Name="model_id", EmitDefaultValue=false)]
        public Guid? ModelId { get; set; }

        /// <summary>
        /// price
        /// </summary>
        /// <value>price</value>
        [DataMember(Name="price", EmitDefaultValue=false)]
        public double? Price { get; set; }

        /// <summary>
        /// Gets or Sets SecondaryId
        /// </summary>
        [DataMember(Name="secondary_id", EmitDefaultValue=false)]
        public string SecondaryId { get; set; }

        /// <summary>
        /// securityId
        /// </summary>
        /// <value>securityId</value>
        [DataMember(Name="security_id", EmitDefaultValue=false)]
        public Guid? SecurityId { get; set; }

        /// <summary>
        /// shares
        /// </summary>
        /// <value>shares</value>
        [DataMember(Name="shares", EmitDefaultValue=false)]
        public double? Shares { get; set; }

        /// <summary>
        /// transactionCodeId
        /// </summary>
        /// <value>transactionCodeId</value>
        [DataMember(Name="transaction_code_id", EmitDefaultValue=false)]
        public Guid? TransactionCodeId { get; set; }

        /// <summary>
        /// Gets or Sets UpdateDate
        /// </summary>
        [DataMember(Name="update_date", EmitDefaultValue=false)]
        public DateTime? UpdateDate { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ModelTransaction {\n");
            sb.Append("  CreateDate: ").Append(CreateDate).Append("\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  ModelId: ").Append(ModelId).Append("\n");
            sb.Append("  Price: ").Append(Price).Append("\n");
            sb.Append("  SecondaryId: ").Append(SecondaryId).Append("\n");
            sb.Append("  SecurityId: ").Append(SecurityId).Append("\n");
            sb.Append("  Shares: ").Append(Shares).Append("\n");
            sb.Append("  TransactionCodeId: ").Append(TransactionCodeId).Append("\n");
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
            return this.Equals(input as ModelTransaction);
        }

        /// <summary>
        /// Returns true if ModelTransaction instances are equal
        /// </summary>
        /// <param name="input">Instance of ModelTransaction to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ModelTransaction input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.CreateDate == input.CreateDate ||
                    (this.CreateDate != null &&
                    this.CreateDate.Equals(input.CreateDate))
                ) && 
                (
                    this.Date == input.Date ||
                    (this.Date != null &&
                    this.Date.Equals(input.Date))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.ModelId == input.ModelId ||
                    (this.ModelId != null &&
                    this.ModelId.Equals(input.ModelId))
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
                    this.SecurityId == input.SecurityId ||
                    (this.SecurityId != null &&
                    this.SecurityId.Equals(input.SecurityId))
                ) && 
                (
                    this.Shares == input.Shares ||
                    (this.Shares != null &&
                    this.Shares.Equals(input.Shares))
                ) && 
                (
                    this.TransactionCodeId == input.TransactionCodeId ||
                    (this.TransactionCodeId != null &&
                    this.TransactionCodeId.Equals(input.TransactionCodeId))
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
                if (this.CreateDate != null)
                    hashCode = hashCode * 59 + this.CreateDate.GetHashCode();
                if (this.Date != null)
                    hashCode = hashCode * 59 + this.Date.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.ModelId != null)
                    hashCode = hashCode * 59 + this.ModelId.GetHashCode();
                if (this.Price != null)
                    hashCode = hashCode * 59 + this.Price.GetHashCode();
                if (this.SecondaryId != null)
                    hashCode = hashCode * 59 + this.SecondaryId.GetHashCode();
                if (this.SecurityId != null)
                    hashCode = hashCode * 59 + this.SecurityId.GetHashCode();
                if (this.Shares != null)
                    hashCode = hashCode * 59 + this.Shares.GetHashCode();
                if (this.TransactionCodeId != null)
                    hashCode = hashCode * 59 + this.TransactionCodeId.GetHashCode();
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
