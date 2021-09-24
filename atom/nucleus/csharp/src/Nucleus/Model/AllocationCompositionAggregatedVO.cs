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
    /// AllocationCompositionAggregatedVO
    /// </summary>
    [DataContract]
    public partial class AllocationCompositionAggregatedVO :  IEquatable<AllocationCompositionAggregatedVO>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AllocationCompositionAggregatedVO" /> class.
        /// </summary>
        /// <param name="allocationCompositionCreateDate">allocationCompositionCreateDate.</param>
        /// <param name="allocationCompositionDate">allocationCompositionDate.</param>
        /// <param name="allocationCompositionId">allocationCompositionId.</param>
        /// <param name="allocationCompositionUpdateDate">allocationCompositionUpdateDate.</param>
        /// <param name="modelCategory">modelCategory.</param>
        /// <param name="modelCurrentWeight">modelCurrentWeight.</param>
        /// <param name="modelDescription">modelDescription.</param>
        /// <param name="modelHoldings">modelHoldings.</param>
        /// <param name="modelId">modelId.</param>
        /// <param name="modelName">modelName.</param>
        /// <param name="modelSecondaryId">modelSecondaryId.</param>
        /// <param name="modelStrategicWeight">modelStrategicWeight.</param>
        public AllocationCompositionAggregatedVO(DateTime? allocationCompositionCreateDate = default(DateTime?), DateTime? allocationCompositionDate = default(DateTime?), Guid? allocationCompositionId = default(Guid?), DateTime? allocationCompositionUpdateDate = default(DateTime?), string modelCategory = default(string), double? modelCurrentWeight = default(double?), string modelDescription = default(string), List<AllocationCompositionModelHoldingsVO> modelHoldings = default(List<AllocationCompositionModelHoldingsVO>), Guid? modelId = default(Guid?), string modelName = default(string), string modelSecondaryId = default(string), double? modelStrategicWeight = default(double?))
        {
            this.AllocationCompositionCreateDate = allocationCompositionCreateDate;
            this.AllocationCompositionDate = allocationCompositionDate;
            this.AllocationCompositionId = allocationCompositionId;
            this.AllocationCompositionUpdateDate = allocationCompositionUpdateDate;
            this.ModelCategory = modelCategory;
            this.ModelCurrentWeight = modelCurrentWeight;
            this.ModelDescription = modelDescription;
            this.ModelHoldings = modelHoldings;
            this.ModelId = modelId;
            this.ModelName = modelName;
            this.ModelSecondaryId = modelSecondaryId;
            this.ModelStrategicWeight = modelStrategicWeight;
        }
        
        /// <summary>
        /// Gets or Sets AllocationCompositionCreateDate
        /// </summary>
        [DataMember(Name="allocation_composition_create_date", EmitDefaultValue=false)]
        public DateTime? AllocationCompositionCreateDate { get; set; }

        /// <summary>
        /// Gets or Sets AllocationCompositionDate
        /// </summary>
        [DataMember(Name="allocation_composition_date", EmitDefaultValue=false)]
        [JsonConverter(typeof(SwaggerDateConverter))]
        public DateTime? AllocationCompositionDate { get; set; }

        /// <summary>
        /// Gets or Sets AllocationCompositionId
        /// </summary>
        [DataMember(Name="allocation_composition_id", EmitDefaultValue=false)]
        public Guid? AllocationCompositionId { get; set; }

        /// <summary>
        /// Gets or Sets AllocationCompositionUpdateDate
        /// </summary>
        [DataMember(Name="allocation_composition_update_date", EmitDefaultValue=false)]
        public DateTime? AllocationCompositionUpdateDate { get; set; }

        /// <summary>
        /// Gets or Sets ModelCategory
        /// </summary>
        [DataMember(Name="model_category", EmitDefaultValue=false)]
        public string ModelCategory { get; set; }

        /// <summary>
        /// Gets or Sets ModelCurrentWeight
        /// </summary>
        [DataMember(Name="model_current_weight", EmitDefaultValue=false)]
        public double? ModelCurrentWeight { get; set; }

        /// <summary>
        /// Gets or Sets ModelDescription
        /// </summary>
        [DataMember(Name="model_description", EmitDefaultValue=false)]
        public string ModelDescription { get; set; }

        /// <summary>
        /// Gets or Sets ModelHoldings
        /// </summary>
        [DataMember(Name="model_holdings", EmitDefaultValue=false)]
        public List<AllocationCompositionModelHoldingsVO> ModelHoldings { get; set; }

        /// <summary>
        /// Gets or Sets ModelId
        /// </summary>
        [DataMember(Name="model_id", EmitDefaultValue=false)]
        public Guid? ModelId { get; set; }

        /// <summary>
        /// Gets or Sets ModelName
        /// </summary>
        [DataMember(Name="model_name", EmitDefaultValue=false)]
        public string ModelName { get; set; }

        /// <summary>
        /// Gets or Sets ModelSecondaryId
        /// </summary>
        [DataMember(Name="model_secondary_id", EmitDefaultValue=false)]
        public string ModelSecondaryId { get; set; }

        /// <summary>
        /// Gets or Sets ModelStrategicWeight
        /// </summary>
        [DataMember(Name="model_strategic_weight", EmitDefaultValue=false)]
        public double? ModelStrategicWeight { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AllocationCompositionAggregatedVO {\n");
            sb.Append("  AllocationCompositionCreateDate: ").Append(AllocationCompositionCreateDate).Append("\n");
            sb.Append("  AllocationCompositionDate: ").Append(AllocationCompositionDate).Append("\n");
            sb.Append("  AllocationCompositionId: ").Append(AllocationCompositionId).Append("\n");
            sb.Append("  AllocationCompositionUpdateDate: ").Append(AllocationCompositionUpdateDate).Append("\n");
            sb.Append("  ModelCategory: ").Append(ModelCategory).Append("\n");
            sb.Append("  ModelCurrentWeight: ").Append(ModelCurrentWeight).Append("\n");
            sb.Append("  ModelDescription: ").Append(ModelDescription).Append("\n");
            sb.Append("  ModelHoldings: ").Append(ModelHoldings).Append("\n");
            sb.Append("  ModelId: ").Append(ModelId).Append("\n");
            sb.Append("  ModelName: ").Append(ModelName).Append("\n");
            sb.Append("  ModelSecondaryId: ").Append(ModelSecondaryId).Append("\n");
            sb.Append("  ModelStrategicWeight: ").Append(ModelStrategicWeight).Append("\n");
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
            return this.Equals(input as AllocationCompositionAggregatedVO);
        }

        /// <summary>
        /// Returns true if AllocationCompositionAggregatedVO instances are equal
        /// </summary>
        /// <param name="input">Instance of AllocationCompositionAggregatedVO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AllocationCompositionAggregatedVO input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.AllocationCompositionCreateDate == input.AllocationCompositionCreateDate ||
                    (this.AllocationCompositionCreateDate != null &&
                    this.AllocationCompositionCreateDate.Equals(input.AllocationCompositionCreateDate))
                ) && 
                (
                    this.AllocationCompositionDate == input.AllocationCompositionDate ||
                    (this.AllocationCompositionDate != null &&
                    this.AllocationCompositionDate.Equals(input.AllocationCompositionDate))
                ) && 
                (
                    this.AllocationCompositionId == input.AllocationCompositionId ||
                    (this.AllocationCompositionId != null &&
                    this.AllocationCompositionId.Equals(input.AllocationCompositionId))
                ) && 
                (
                    this.AllocationCompositionUpdateDate == input.AllocationCompositionUpdateDate ||
                    (this.AllocationCompositionUpdateDate != null &&
                    this.AllocationCompositionUpdateDate.Equals(input.AllocationCompositionUpdateDate))
                ) && 
                (
                    this.ModelCategory == input.ModelCategory ||
                    (this.ModelCategory != null &&
                    this.ModelCategory.Equals(input.ModelCategory))
                ) && 
                (
                    this.ModelCurrentWeight == input.ModelCurrentWeight ||
                    (this.ModelCurrentWeight != null &&
                    this.ModelCurrentWeight.Equals(input.ModelCurrentWeight))
                ) && 
                (
                    this.ModelDescription == input.ModelDescription ||
                    (this.ModelDescription != null &&
                    this.ModelDescription.Equals(input.ModelDescription))
                ) && 
                (
                    this.ModelHoldings == input.ModelHoldings ||
                    this.ModelHoldings != null &&
                    this.ModelHoldings.SequenceEqual(input.ModelHoldings)
                ) && 
                (
                    this.ModelId == input.ModelId ||
                    (this.ModelId != null &&
                    this.ModelId.Equals(input.ModelId))
                ) && 
                (
                    this.ModelName == input.ModelName ||
                    (this.ModelName != null &&
                    this.ModelName.Equals(input.ModelName))
                ) && 
                (
                    this.ModelSecondaryId == input.ModelSecondaryId ||
                    (this.ModelSecondaryId != null &&
                    this.ModelSecondaryId.Equals(input.ModelSecondaryId))
                ) && 
                (
                    this.ModelStrategicWeight == input.ModelStrategicWeight ||
                    (this.ModelStrategicWeight != null &&
                    this.ModelStrategicWeight.Equals(input.ModelStrategicWeight))
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
                if (this.AllocationCompositionCreateDate != null)
                    hashCode = hashCode * 59 + this.AllocationCompositionCreateDate.GetHashCode();
                if (this.AllocationCompositionDate != null)
                    hashCode = hashCode * 59 + this.AllocationCompositionDate.GetHashCode();
                if (this.AllocationCompositionId != null)
                    hashCode = hashCode * 59 + this.AllocationCompositionId.GetHashCode();
                if (this.AllocationCompositionUpdateDate != null)
                    hashCode = hashCode * 59 + this.AllocationCompositionUpdateDate.GetHashCode();
                if (this.ModelCategory != null)
                    hashCode = hashCode * 59 + this.ModelCategory.GetHashCode();
                if (this.ModelCurrentWeight != null)
                    hashCode = hashCode * 59 + this.ModelCurrentWeight.GetHashCode();
                if (this.ModelDescription != null)
                    hashCode = hashCode * 59 + this.ModelDescription.GetHashCode();
                if (this.ModelHoldings != null)
                    hashCode = hashCode * 59 + this.ModelHoldings.GetHashCode();
                if (this.ModelId != null)
                    hashCode = hashCode * 59 + this.ModelId.GetHashCode();
                if (this.ModelName != null)
                    hashCode = hashCode * 59 + this.ModelName.GetHashCode();
                if (this.ModelSecondaryId != null)
                    hashCode = hashCode * 59 + this.ModelSecondaryId.GetHashCode();
                if (this.ModelStrategicWeight != null)
                    hashCode = hashCode * 59 + this.ModelStrategicWeight.GetHashCode();
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
