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
    /// AttachmentVO
    /// </summary>
    [DataContract]
    public partial class AttachmentVO :  IEquatable<AttachmentVO>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AttachmentVO" /> class.
        /// </summary>
        /// <param name="fileContent">fileContent.</param>
        /// <param name="fileName">fileName.</param>
        /// <param name="fileType">fileType.</param>
        public AttachmentVO(string fileContent = default(string), string fileName = default(string), string fileType = default(string))
        {
            this.FileContent = fileContent;
            this.FileName = fileName;
            this.FileType = fileType;
        }
        
        /// <summary>
        /// Gets or Sets FileContent
        /// </summary>
        [DataMember(Name="file_content", EmitDefaultValue=false)]
        public string FileContent { get; set; }

        /// <summary>
        /// Gets or Sets FileName
        /// </summary>
        [DataMember(Name="file_name", EmitDefaultValue=false)]
        public string FileName { get; set; }

        /// <summary>
        /// Gets or Sets FileType
        /// </summary>
        [DataMember(Name="file_type", EmitDefaultValue=false)]
        public string FileType { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AttachmentVO {\n");
            sb.Append("  FileContent: ").Append(FileContent).Append("\n");
            sb.Append("  FileName: ").Append(FileName).Append("\n");
            sb.Append("  FileType: ").Append(FileType).Append("\n");
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
            return this.Equals(input as AttachmentVO);
        }

        /// <summary>
        /// Returns true if AttachmentVO instances are equal
        /// </summary>
        /// <param name="input">Instance of AttachmentVO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AttachmentVO input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.FileContent == input.FileContent ||
                    (this.FileContent != null &&
                    this.FileContent.Equals(input.FileContent))
                ) && 
                (
                    this.FileName == input.FileName ||
                    (this.FileName != null &&
                    this.FileName.Equals(input.FileName))
                ) && 
                (
                    this.FileType == input.FileType ||
                    (this.FileType != null &&
                    this.FileType.Equals(input.FileType))
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
                if (this.FileContent != null)
                    hashCode = hashCode * 59 + this.FileContent.GetHashCode();
                if (this.FileName != null)
                    hashCode = hashCode * 59 + this.FileName.GetHashCode();
                if (this.FileType != null)
                    hashCode = hashCode * 59 + this.FileType.GetHashCode();
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
