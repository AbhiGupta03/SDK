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
    /// ClientRelationship
    /// </summary>
    [DataContract]
    public partial class ClientRelationship :  IEquatable<ClientRelationship>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientRelationship" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ClientRelationship() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientRelationship" /> class.
        /// </summary>
        /// <param name="clientId">clientId (required).</param>
        /// <param name="member">member.</param>
        /// <param name="relationship">relationship (required).</param>
        public ClientRelationship(Guid? clientId = default(Guid?), Member member = default(Member), string relationship = default(string))
        {
            // to ensure "clientId" is required (not null)
            if (clientId == null)
            {
                throw new InvalidDataException("clientId is a required property for ClientRelationship and cannot be null");
            }
            else
            {
                this.ClientId = clientId;
            }
            // to ensure "relationship" is required (not null)
            if (relationship == null)
            {
                throw new InvalidDataException("relationship is a required property for ClientRelationship and cannot be null");
            }
            else
            {
                this.Relationship = relationship;
            }
            this.Member = member;
        }
        
        /// <summary>
        /// Gets or Sets ClientId
        /// </summary>
        [DataMember(Name="client_id", EmitDefaultValue=false)]
        public Guid? ClientId { get; set; }

        /// <summary>
        /// Gets or Sets Member
        /// </summary>
        [DataMember(Name="member", EmitDefaultValue=false)]
        public Member Member { get; set; }

        /// <summary>
        /// Gets or Sets Relationship
        /// </summary>
        [DataMember(Name="relationship", EmitDefaultValue=false)]
        public string Relationship { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ClientRelationship {\n");
            sb.Append("  ClientId: ").Append(ClientId).Append("\n");
            sb.Append("  Member: ").Append(Member).Append("\n");
            sb.Append("  Relationship: ").Append(Relationship).Append("\n");
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
            return this.Equals(input as ClientRelationship);
        }

        /// <summary>
        /// Returns true if ClientRelationship instances are equal
        /// </summary>
        /// <param name="input">Instance of ClientRelationship to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ClientRelationship input)
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
                    this.Member == input.Member ||
                    (this.Member != null &&
                    this.Member.Equals(input.Member))
                ) && 
                (
                    this.Relationship == input.Relationship ||
                    (this.Relationship != null &&
                    this.Relationship.Equals(input.Relationship))
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
                if (this.Member != null)
                    hashCode = hashCode * 59 + this.Member.GetHashCode();
                if (this.Relationship != null)
                    hashCode = hashCode * 59 + this.Relationship.GetHashCode();
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