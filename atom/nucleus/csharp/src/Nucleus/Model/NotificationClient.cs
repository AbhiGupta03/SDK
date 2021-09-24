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
    /// Notification Client Object
    /// </summary>
    [DataContract]
    public partial class NotificationClient :  IEquatable<NotificationClient>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="NotificationClient" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected NotificationClient() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="NotificationClient" /> class.
        /// </summary>
        /// <param name="clientId">client_id (required).</param>
        /// <param name="createDate">createDate.</param>
        /// <param name="id">id.</param>
        /// <param name="isRead">isRead.</param>
        /// <param name="isSent">isSent.</param>
        /// <param name="metadata">metadata.</param>
        /// <param name="notificationContent">notification_content (required).</param>
        /// <param name="notificationDate">notification_date (required).</param>
        /// <param name="notificationId">notification_id (required).</param>
        /// <param name="notificationImage">notification_image.</param>
        /// <param name="secondaryId">secondaryId.</param>
        /// <param name="updateDate">updateDate.</param>
        public NotificationClient(Guid? clientId = default(Guid?), DateTime? createDate = default(DateTime?), Guid? id = default(Guid?), bool? isRead = default(bool?), bool? isSent = default(bool?), Dictionary<string, string> metadata = default(Dictionary<string, string>), string notificationContent = default(string), DateTime? notificationDate = default(DateTime?), Guid? notificationId = default(Guid?), string notificationImage = default(string), string secondaryId = default(string), DateTime? updateDate = default(DateTime?))
        {
            // to ensure "clientId" is required (not null)
            if (clientId == null)
            {
                throw new InvalidDataException("clientId is a required property for NotificationClient and cannot be null");
            }
            else
            {
                this.ClientId = clientId;
            }
            // to ensure "notificationContent" is required (not null)
            if (notificationContent == null)
            {
                throw new InvalidDataException("notificationContent is a required property for NotificationClient and cannot be null");
            }
            else
            {
                this.NotificationContent = notificationContent;
            }
            // to ensure "notificationDate" is required (not null)
            if (notificationDate == null)
            {
                throw new InvalidDataException("notificationDate is a required property for NotificationClient and cannot be null");
            }
            else
            {
                this.NotificationDate = notificationDate;
            }
            // to ensure "notificationId" is required (not null)
            if (notificationId == null)
            {
                throw new InvalidDataException("notificationId is a required property for NotificationClient and cannot be null");
            }
            else
            {
                this.NotificationId = notificationId;
            }
            this.CreateDate = createDate;
            this.Id = id;
            this.IsRead = isRead;
            this.IsSent = isSent;
            this.Metadata = metadata;
            this.NotificationImage = notificationImage;
            this.SecondaryId = secondaryId;
            this.UpdateDate = updateDate;
        }
        
        /// <summary>
        /// client_id
        /// </summary>
        /// <value>client_id</value>
        [DataMember(Name="client_id", EmitDefaultValue=false)]
        public Guid? ClientId { get; set; }

        /// <summary>
        /// Gets or Sets CreateDate
        /// </summary>
        [DataMember(Name="create_date", EmitDefaultValue=false)]
        public DateTime? CreateDate { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public Guid? Id { get; set; }

        /// <summary>
        /// Gets or Sets IsRead
        /// </summary>
        [DataMember(Name="is_read", EmitDefaultValue=false)]
        public bool? IsRead { get; set; }

        /// <summary>
        /// Gets or Sets IsSent
        /// </summary>
        [DataMember(Name="is_sent", EmitDefaultValue=false)]
        public bool? IsSent { get; set; }

        /// <summary>
        /// metadata
        /// </summary>
        /// <value>metadata</value>
        [DataMember(Name="metadata", EmitDefaultValue=false)]
        public Dictionary<string, string> Metadata { get; set; }

        /// <summary>
        /// notification_content
        /// </summary>
        /// <value>notification_content</value>
        [DataMember(Name="notification_content", EmitDefaultValue=false)]
        public string NotificationContent { get; set; }

        /// <summary>
        /// notification_date
        /// </summary>
        /// <value>notification_date</value>
        [DataMember(Name="notification_date", EmitDefaultValue=false)]
        public DateTime? NotificationDate { get; set; }

        /// <summary>
        /// notification_id
        /// </summary>
        /// <value>notification_id</value>
        [DataMember(Name="notification_id", EmitDefaultValue=false)]
        public Guid? NotificationId { get; set; }

        /// <summary>
        /// notification_image
        /// </summary>
        /// <value>notification_image</value>
        [DataMember(Name="notification_image", EmitDefaultValue=false)]
        public string NotificationImage { get; set; }

        /// <summary>
        /// Gets or Sets SecondaryId
        /// </summary>
        [DataMember(Name="secondary_id", EmitDefaultValue=false)]
        public string SecondaryId { get; set; }

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
            sb.Append("class NotificationClient {\n");
            sb.Append("  ClientId: ").Append(ClientId).Append("\n");
            sb.Append("  CreateDate: ").Append(CreateDate).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  IsRead: ").Append(IsRead).Append("\n");
            sb.Append("  IsSent: ").Append(IsSent).Append("\n");
            sb.Append("  Metadata: ").Append(Metadata).Append("\n");
            sb.Append("  NotificationContent: ").Append(NotificationContent).Append("\n");
            sb.Append("  NotificationDate: ").Append(NotificationDate).Append("\n");
            sb.Append("  NotificationId: ").Append(NotificationId).Append("\n");
            sb.Append("  NotificationImage: ").Append(NotificationImage).Append("\n");
            sb.Append("  SecondaryId: ").Append(SecondaryId).Append("\n");
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
            return this.Equals(input as NotificationClient);
        }

        /// <summary>
        /// Returns true if NotificationClient instances are equal
        /// </summary>
        /// <param name="input">Instance of NotificationClient to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(NotificationClient input)
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
                    this.CreateDate == input.CreateDate ||
                    (this.CreateDate != null &&
                    this.CreateDate.Equals(input.CreateDate))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.IsRead == input.IsRead ||
                    (this.IsRead != null &&
                    this.IsRead.Equals(input.IsRead))
                ) && 
                (
                    this.IsSent == input.IsSent ||
                    (this.IsSent != null &&
                    this.IsSent.Equals(input.IsSent))
                ) && 
                (
                    this.Metadata == input.Metadata ||
                    this.Metadata != null &&
                    this.Metadata.SequenceEqual(input.Metadata)
                ) && 
                (
                    this.NotificationContent == input.NotificationContent ||
                    (this.NotificationContent != null &&
                    this.NotificationContent.Equals(input.NotificationContent))
                ) && 
                (
                    this.NotificationDate == input.NotificationDate ||
                    (this.NotificationDate != null &&
                    this.NotificationDate.Equals(input.NotificationDate))
                ) && 
                (
                    this.NotificationId == input.NotificationId ||
                    (this.NotificationId != null &&
                    this.NotificationId.Equals(input.NotificationId))
                ) && 
                (
                    this.NotificationImage == input.NotificationImage ||
                    (this.NotificationImage != null &&
                    this.NotificationImage.Equals(input.NotificationImage))
                ) && 
                (
                    this.SecondaryId == input.SecondaryId ||
                    (this.SecondaryId != null &&
                    this.SecondaryId.Equals(input.SecondaryId))
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
                if (this.ClientId != null)
                    hashCode = hashCode * 59 + this.ClientId.GetHashCode();
                if (this.CreateDate != null)
                    hashCode = hashCode * 59 + this.CreateDate.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.IsRead != null)
                    hashCode = hashCode * 59 + this.IsRead.GetHashCode();
                if (this.IsSent != null)
                    hashCode = hashCode * 59 + this.IsSent.GetHashCode();
                if (this.Metadata != null)
                    hashCode = hashCode * 59 + this.Metadata.GetHashCode();
                if (this.NotificationContent != null)
                    hashCode = hashCode * 59 + this.NotificationContent.GetHashCode();
                if (this.NotificationDate != null)
                    hashCode = hashCode * 59 + this.NotificationDate.GetHashCode();
                if (this.NotificationId != null)
                    hashCode = hashCode * 59 + this.NotificationId.GetHashCode();
                if (this.NotificationImage != null)
                    hashCode = hashCode * 59 + this.NotificationImage.GetHashCode();
                if (this.SecondaryId != null)
                    hashCode = hashCode * 59 + this.SecondaryId.GetHashCode();
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
