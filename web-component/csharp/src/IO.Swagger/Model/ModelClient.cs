/* 
 * Hydrogen Admin API
 *
 * The Hydrogen Admin API
 *
 * OpenAPI spec version: 1.0.0
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
using SwaggerDateConverter = IO.Swagger.Client.SwaggerDateConverter;

namespace IO.Swagger.Model
{
    /// <summary>
    /// Client Object
    /// </summary>
    [DataContract]
    public partial class ModelClient :  IEquatable<ModelClient>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModelClient" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModelClient() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModelClient" /> class.
        /// </summary>
        /// <param name="address">address.</param>
        /// <param name="businessId">business_id.</param>
        /// <param name="citizenshipStatus">citizenshipStatus.</param>
        /// <param name="clientType">clientTypeId (required).</param>
        /// <param name="countryOfCitizenship">countryOfCitizenship.</param>
        /// <param name="countryOfResidence">countryOfResidence.</param>
        /// <param name="createDate">createDate.</param>
        /// <param name="dateOfBirth">dateOfBirth.</param>
        /// <param name="email">email.</param>
        /// <param name="employment">employment.</param>
        /// <param name="firmName">firmName.</param>
        /// <param name="firmType">firmType.</param>
        /// <param name="firstName">firstName.</param>
        /// <param name="gender">gender.</param>
        /// <param name="group">group.</param>
        /// <param name="hydroId">hydroId.</param>
        /// <param name="id">id.</param>
        /// <param name="identificationNumber">identificationNumber.</param>
        /// <param name="identificationNumberType">identificationNumberType.</param>
        /// <param name="image">image.</param>
        /// <param name="income">income.</param>
        /// <param name="isActive">isActive.</param>
        /// <param name="isVerified">isVerified.</param>
        /// <param name="lastName">last_name.</param>
        /// <param name="liquidNetWorth">liquidNetWorth.</param>
        /// <param name="metadata">metadata.</param>
        /// <param name="middleName">middleName.</param>
        /// <param name="phoneNumber">phoneNumber.</param>
        /// <param name="secondaryId">secondaryId.</param>
        /// <param name="status">status.</param>
        /// <param name="suffix">suffix.</param>
        /// <param name="title">title.</param>
        /// <param name="totalNetWorth">totalNetWorth.</param>
        /// <param name="updateDate">updateDate.</param>
        /// <param name="username">username (required).</param>
        public ModelClient(List<ClientAddress> address = default(List<ClientAddress>), Guid? businessId = default(Guid?), string citizenshipStatus = default(string), string clientType = default(string), List<string> countryOfCitizenship = default(List<string>), string countryOfResidence = default(string), DateTime? createDate = default(DateTime?), string dateOfBirth = default(string), string email = default(string), Employment employment = default(Employment), string firmName = default(string), string firmType = default(string), string firstName = default(string), string gender = default(string), List<string> group = default(List<string>), string hydroId = default(string), Guid? id = default(Guid?), string identificationNumber = default(string), string identificationNumberType = default(string), string image = default(string), int? income = default(int?), bool? isActive = default(bool?), bool? isVerified = default(bool?), string lastName = default(string), double? liquidNetWorth = default(double?), Dictionary<string, string> metadata = default(Dictionary<string, string>), string middleName = default(string), string phoneNumber = default(string), string secondaryId = default(string), string status = default(string), string suffix = default(string), string title = default(string), double? totalNetWorth = default(double?), DateTime? updateDate = default(DateTime?), string username = default(string))
        {
            // to ensure "clientType" is required (not null)
            if (clientType == null)
            {
                throw new InvalidDataException("clientType is a required property for ModelClient and cannot be null");
            }
            else
            {
                this.ClientType = clientType;
            }
            // to ensure "username" is required (not null)
            if (username == null)
            {
                throw new InvalidDataException("username is a required property for ModelClient and cannot be null");
            }
            else
            {
                this.Username = username;
            }
            this.Address = address;
            this.BusinessId = businessId;
            this.CitizenshipStatus = citizenshipStatus;
            this.CountryOfCitizenship = countryOfCitizenship;
            this.CountryOfResidence = countryOfResidence;
            this.CreateDate = createDate;
            this.DateOfBirth = dateOfBirth;
            this.Email = email;
            this.Employment = employment;
            this.FirmName = firmName;
            this.FirmType = firmType;
            this.FirstName = firstName;
            this.Gender = gender;
            this.Group = group;
            this.HydroId = hydroId;
            this.Id = id;
            this.IdentificationNumber = identificationNumber;
            this.IdentificationNumberType = identificationNumberType;
            this.Image = image;
            this.Income = income;
            this.IsActive = isActive;
            this.IsVerified = isVerified;
            this.LastName = lastName;
            this.LiquidNetWorth = liquidNetWorth;
            this.Metadata = metadata;
            this.MiddleName = middleName;
            this.PhoneNumber = phoneNumber;
            this.SecondaryId = secondaryId;
            this.Status = status;
            this.Suffix = suffix;
            this.Title = title;
            this.TotalNetWorth = totalNetWorth;
            this.UpdateDate = updateDate;
        }
        
        /// <summary>
        /// Gets or Sets Address
        /// </summary>
        [DataMember(Name="address", EmitDefaultValue=false)]
        public List<ClientAddress> Address { get; set; }

        /// <summary>
        /// business_id
        /// </summary>
        /// <value>business_id</value>
        [DataMember(Name="business_id", EmitDefaultValue=false)]
        public Guid? BusinessId { get; set; }

        /// <summary>
        /// citizenshipStatus
        /// </summary>
        /// <value>citizenshipStatus</value>
        [DataMember(Name="citizenship_status", EmitDefaultValue=false)]
        public string CitizenshipStatus { get; set; }

        /// <summary>
        /// clientTypeId
        /// </summary>
        /// <value>clientTypeId</value>
        [DataMember(Name="client_type", EmitDefaultValue=false)]
        public string ClientType { get; set; }

        /// <summary>
        /// countryOfCitizenship
        /// </summary>
        /// <value>countryOfCitizenship</value>
        [DataMember(Name="country_of_citizenship", EmitDefaultValue=false)]
        public List<string> CountryOfCitizenship { get; set; }

        /// <summary>
        /// countryOfResidence
        /// </summary>
        /// <value>countryOfResidence</value>
        [DataMember(Name="country_of_residence", EmitDefaultValue=false)]
        public string CountryOfResidence { get; set; }

        /// <summary>
        /// Gets or Sets CreateDate
        /// </summary>
        [DataMember(Name="create_date", EmitDefaultValue=false)]
        public DateTime? CreateDate { get; set; }

        /// <summary>
        /// dateOfBirth
        /// </summary>
        /// <value>dateOfBirth</value>
        [DataMember(Name="date_of_birth", EmitDefaultValue=false)]
        public string DateOfBirth { get; set; }

        /// <summary>
        /// email
        /// </summary>
        /// <value>email</value>
        [DataMember(Name="email", EmitDefaultValue=false)]
        public string Email { get; set; }

        /// <summary>
        /// Gets or Sets Employment
        /// </summary>
        [DataMember(Name="employment", EmitDefaultValue=false)]
        public Employment Employment { get; set; }

        /// <summary>
        /// firmName
        /// </summary>
        /// <value>firmName</value>
        [DataMember(Name="firm_name", EmitDefaultValue=false)]
        public string FirmName { get; set; }

        /// <summary>
        /// firmType
        /// </summary>
        /// <value>firmType</value>
        [DataMember(Name="firm_type", EmitDefaultValue=false)]
        public string FirmType { get; set; }

        /// <summary>
        /// firstName
        /// </summary>
        /// <value>firstName</value>
        [DataMember(Name="first_name", EmitDefaultValue=false)]
        public string FirstName { get; set; }

        /// <summary>
        /// gender
        /// </summary>
        /// <value>gender</value>
        [DataMember(Name="gender", EmitDefaultValue=false)]
        public string Gender { get; set; }

        /// <summary>
        /// group
        /// </summary>
        /// <value>group</value>
        [DataMember(Name="group", EmitDefaultValue=false)]
        public List<string> Group { get; set; }

        /// <summary>
        /// hydroId
        /// </summary>
        /// <value>hydroId</value>
        [DataMember(Name="hydro_id", EmitDefaultValue=false)]
        public string HydroId { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public Guid? Id { get; set; }

        /// <summary>
        /// identificationNumber
        /// </summary>
        /// <value>identificationNumber</value>
        [DataMember(Name="identification_number", EmitDefaultValue=false)]
        public string IdentificationNumber { get; set; }

        /// <summary>
        /// identificationNumberType
        /// </summary>
        /// <value>identificationNumberType</value>
        [DataMember(Name="identification_number_type", EmitDefaultValue=false)]
        public string IdentificationNumberType { get; set; }

        /// <summary>
        /// image
        /// </summary>
        /// <value>image</value>
        [DataMember(Name="image", EmitDefaultValue=false)]
        public string Image { get; set; }

        /// <summary>
        /// income
        /// </summary>
        /// <value>income</value>
        [DataMember(Name="income", EmitDefaultValue=false)]
        public int? Income { get; set; }

        /// <summary>
        /// isActive
        /// </summary>
        /// <value>isActive</value>
        [DataMember(Name="is_active", EmitDefaultValue=false)]
        public bool? IsActive { get; set; }

        /// <summary>
        /// isVerified
        /// </summary>
        /// <value>isVerified</value>
        [DataMember(Name="is_verified", EmitDefaultValue=false)]
        public bool? IsVerified { get; set; }

        /// <summary>
        /// last_name
        /// </summary>
        /// <value>last_name</value>
        [DataMember(Name="last_name", EmitDefaultValue=false)]
        public string LastName { get; set; }

        /// <summary>
        /// liquidNetWorth
        /// </summary>
        /// <value>liquidNetWorth</value>
        [DataMember(Name="liquid_net_worth", EmitDefaultValue=false)]
        public double? LiquidNetWorth { get; set; }

        /// <summary>
        /// metadata
        /// </summary>
        /// <value>metadata</value>
        [DataMember(Name="metadata", EmitDefaultValue=false)]
        public Dictionary<string, string> Metadata { get; set; }

        /// <summary>
        /// middleName
        /// </summary>
        /// <value>middleName</value>
        [DataMember(Name="middle_name", EmitDefaultValue=false)]
        public string MiddleName { get; set; }

        /// <summary>
        /// phoneNumber
        /// </summary>
        /// <value>phoneNumber</value>
        [DataMember(Name="phone_number", EmitDefaultValue=false)]
        public string PhoneNumber { get; set; }

        /// <summary>
        /// Gets or Sets SecondaryId
        /// </summary>
        [DataMember(Name="secondary_id", EmitDefaultValue=false)]
        public string SecondaryId { get; set; }

        /// <summary>
        /// status
        /// </summary>
        /// <value>status</value>
        [DataMember(Name="status", EmitDefaultValue=false)]
        public string Status { get; set; }

        /// <summary>
        /// suffix
        /// </summary>
        /// <value>suffix</value>
        [DataMember(Name="suffix", EmitDefaultValue=false)]
        public string Suffix { get; set; }

        /// <summary>
        /// title
        /// </summary>
        /// <value>title</value>
        [DataMember(Name="title", EmitDefaultValue=false)]
        public string Title { get; set; }

        /// <summary>
        /// totalNetWorth
        /// </summary>
        /// <value>totalNetWorth</value>
        [DataMember(Name="total_net_worth", EmitDefaultValue=false)]
        public double? TotalNetWorth { get; set; }

        /// <summary>
        /// Gets or Sets UpdateDate
        /// </summary>
        [DataMember(Name="update_date", EmitDefaultValue=false)]
        public DateTime? UpdateDate { get; set; }

        /// <summary>
        /// username
        /// </summary>
        /// <value>username</value>
        [DataMember(Name="username", EmitDefaultValue=false)]
        public string Username { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ModelClient {\n");
            sb.Append("  Address: ").Append(Address).Append("\n");
            sb.Append("  BusinessId: ").Append(BusinessId).Append("\n");
            sb.Append("  CitizenshipStatus: ").Append(CitizenshipStatus).Append("\n");
            sb.Append("  ClientType: ").Append(ClientType).Append("\n");
            sb.Append("  CountryOfCitizenship: ").Append(CountryOfCitizenship).Append("\n");
            sb.Append("  CountryOfResidence: ").Append(CountryOfResidence).Append("\n");
            sb.Append("  CreateDate: ").Append(CreateDate).Append("\n");
            sb.Append("  DateOfBirth: ").Append(DateOfBirth).Append("\n");
            sb.Append("  Email: ").Append(Email).Append("\n");
            sb.Append("  Employment: ").Append(Employment).Append("\n");
            sb.Append("  FirmName: ").Append(FirmName).Append("\n");
            sb.Append("  FirmType: ").Append(FirmType).Append("\n");
            sb.Append("  FirstName: ").Append(FirstName).Append("\n");
            sb.Append("  Gender: ").Append(Gender).Append("\n");
            sb.Append("  Group: ").Append(Group).Append("\n");
            sb.Append("  HydroId: ").Append(HydroId).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  IdentificationNumber: ").Append(IdentificationNumber).Append("\n");
            sb.Append("  IdentificationNumberType: ").Append(IdentificationNumberType).Append("\n");
            sb.Append("  Image: ").Append(Image).Append("\n");
            sb.Append("  Income: ").Append(Income).Append("\n");
            sb.Append("  IsActive: ").Append(IsActive).Append("\n");
            sb.Append("  IsVerified: ").Append(IsVerified).Append("\n");
            sb.Append("  LastName: ").Append(LastName).Append("\n");
            sb.Append("  LiquidNetWorth: ").Append(LiquidNetWorth).Append("\n");
            sb.Append("  Metadata: ").Append(Metadata).Append("\n");
            sb.Append("  MiddleName: ").Append(MiddleName).Append("\n");
            sb.Append("  PhoneNumber: ").Append(PhoneNumber).Append("\n");
            sb.Append("  SecondaryId: ").Append(SecondaryId).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  Suffix: ").Append(Suffix).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
            sb.Append("  TotalNetWorth: ").Append(TotalNetWorth).Append("\n");
            sb.Append("  UpdateDate: ").Append(UpdateDate).Append("\n");
            sb.Append("  Username: ").Append(Username).Append("\n");
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
            return this.Equals(input as ModelClient);
        }

        /// <summary>
        /// Returns true if ModelClient instances are equal
        /// </summary>
        /// <param name="input">Instance of ModelClient to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ModelClient input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Address == input.Address ||
                    this.Address != null &&
                    this.Address.SequenceEqual(input.Address)
                ) && 
                (
                    this.BusinessId == input.BusinessId ||
                    (this.BusinessId != null &&
                    this.BusinessId.Equals(input.BusinessId))
                ) && 
                (
                    this.CitizenshipStatus == input.CitizenshipStatus ||
                    (this.CitizenshipStatus != null &&
                    this.CitizenshipStatus.Equals(input.CitizenshipStatus))
                ) && 
                (
                    this.ClientType == input.ClientType ||
                    (this.ClientType != null &&
                    this.ClientType.Equals(input.ClientType))
                ) && 
                (
                    this.CountryOfCitizenship == input.CountryOfCitizenship ||
                    this.CountryOfCitizenship != null &&
                    this.CountryOfCitizenship.SequenceEqual(input.CountryOfCitizenship)
                ) && 
                (
                    this.CountryOfResidence == input.CountryOfResidence ||
                    (this.CountryOfResidence != null &&
                    this.CountryOfResidence.Equals(input.CountryOfResidence))
                ) && 
                (
                    this.CreateDate == input.CreateDate ||
                    (this.CreateDate != null &&
                    this.CreateDate.Equals(input.CreateDate))
                ) && 
                (
                    this.DateOfBirth == input.DateOfBirth ||
                    (this.DateOfBirth != null &&
                    this.DateOfBirth.Equals(input.DateOfBirth))
                ) && 
                (
                    this.Email == input.Email ||
                    (this.Email != null &&
                    this.Email.Equals(input.Email))
                ) && 
                (
                    this.Employment == input.Employment ||
                    (this.Employment != null &&
                    this.Employment.Equals(input.Employment))
                ) && 
                (
                    this.FirmName == input.FirmName ||
                    (this.FirmName != null &&
                    this.FirmName.Equals(input.FirmName))
                ) && 
                (
                    this.FirmType == input.FirmType ||
                    (this.FirmType != null &&
                    this.FirmType.Equals(input.FirmType))
                ) && 
                (
                    this.FirstName == input.FirstName ||
                    (this.FirstName != null &&
                    this.FirstName.Equals(input.FirstName))
                ) && 
                (
                    this.Gender == input.Gender ||
                    (this.Gender != null &&
                    this.Gender.Equals(input.Gender))
                ) && 
                (
                    this.Group == input.Group ||
                    this.Group != null &&
                    this.Group.SequenceEqual(input.Group)
                ) && 
                (
                    this.HydroId == input.HydroId ||
                    (this.HydroId != null &&
                    this.HydroId.Equals(input.HydroId))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.IdentificationNumber == input.IdentificationNumber ||
                    (this.IdentificationNumber != null &&
                    this.IdentificationNumber.Equals(input.IdentificationNumber))
                ) && 
                (
                    this.IdentificationNumberType == input.IdentificationNumberType ||
                    (this.IdentificationNumberType != null &&
                    this.IdentificationNumberType.Equals(input.IdentificationNumberType))
                ) && 
                (
                    this.Image == input.Image ||
                    (this.Image != null &&
                    this.Image.Equals(input.Image))
                ) && 
                (
                    this.Income == input.Income ||
                    (this.Income != null &&
                    this.Income.Equals(input.Income))
                ) && 
                (
                    this.IsActive == input.IsActive ||
                    (this.IsActive != null &&
                    this.IsActive.Equals(input.IsActive))
                ) && 
                (
                    this.IsVerified == input.IsVerified ||
                    (this.IsVerified != null &&
                    this.IsVerified.Equals(input.IsVerified))
                ) && 
                (
                    this.LastName == input.LastName ||
                    (this.LastName != null &&
                    this.LastName.Equals(input.LastName))
                ) && 
                (
                    this.LiquidNetWorth == input.LiquidNetWorth ||
                    (this.LiquidNetWorth != null &&
                    this.LiquidNetWorth.Equals(input.LiquidNetWorth))
                ) && 
                (
                    this.Metadata == input.Metadata ||
                    this.Metadata != null &&
                    this.Metadata.SequenceEqual(input.Metadata)
                ) && 
                (
                    this.MiddleName == input.MiddleName ||
                    (this.MiddleName != null &&
                    this.MiddleName.Equals(input.MiddleName))
                ) && 
                (
                    this.PhoneNumber == input.PhoneNumber ||
                    (this.PhoneNumber != null &&
                    this.PhoneNumber.Equals(input.PhoneNumber))
                ) && 
                (
                    this.SecondaryId == input.SecondaryId ||
                    (this.SecondaryId != null &&
                    this.SecondaryId.Equals(input.SecondaryId))
                ) && 
                (
                    this.Status == input.Status ||
                    (this.Status != null &&
                    this.Status.Equals(input.Status))
                ) && 
                (
                    this.Suffix == input.Suffix ||
                    (this.Suffix != null &&
                    this.Suffix.Equals(input.Suffix))
                ) && 
                (
                    this.Title == input.Title ||
                    (this.Title != null &&
                    this.Title.Equals(input.Title))
                ) && 
                (
                    this.TotalNetWorth == input.TotalNetWorth ||
                    (this.TotalNetWorth != null &&
                    this.TotalNetWorth.Equals(input.TotalNetWorth))
                ) && 
                (
                    this.UpdateDate == input.UpdateDate ||
                    (this.UpdateDate != null &&
                    this.UpdateDate.Equals(input.UpdateDate))
                ) && 
                (
                    this.Username == input.Username ||
                    (this.Username != null &&
                    this.Username.Equals(input.Username))
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
                if (this.Address != null)
                    hashCode = hashCode * 59 + this.Address.GetHashCode();
                if (this.BusinessId != null)
                    hashCode = hashCode * 59 + this.BusinessId.GetHashCode();
                if (this.CitizenshipStatus != null)
                    hashCode = hashCode * 59 + this.CitizenshipStatus.GetHashCode();
                if (this.ClientType != null)
                    hashCode = hashCode * 59 + this.ClientType.GetHashCode();
                if (this.CountryOfCitizenship != null)
                    hashCode = hashCode * 59 + this.CountryOfCitizenship.GetHashCode();
                if (this.CountryOfResidence != null)
                    hashCode = hashCode * 59 + this.CountryOfResidence.GetHashCode();
                if (this.CreateDate != null)
                    hashCode = hashCode * 59 + this.CreateDate.GetHashCode();
                if (this.DateOfBirth != null)
                    hashCode = hashCode * 59 + this.DateOfBirth.GetHashCode();
                if (this.Email != null)
                    hashCode = hashCode * 59 + this.Email.GetHashCode();
                if (this.Employment != null)
                    hashCode = hashCode * 59 + this.Employment.GetHashCode();
                if (this.FirmName != null)
                    hashCode = hashCode * 59 + this.FirmName.GetHashCode();
                if (this.FirmType != null)
                    hashCode = hashCode * 59 + this.FirmType.GetHashCode();
                if (this.FirstName != null)
                    hashCode = hashCode * 59 + this.FirstName.GetHashCode();
                if (this.Gender != null)
                    hashCode = hashCode * 59 + this.Gender.GetHashCode();
                if (this.Group != null)
                    hashCode = hashCode * 59 + this.Group.GetHashCode();
                if (this.HydroId != null)
                    hashCode = hashCode * 59 + this.HydroId.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.IdentificationNumber != null)
                    hashCode = hashCode * 59 + this.IdentificationNumber.GetHashCode();
                if (this.IdentificationNumberType != null)
                    hashCode = hashCode * 59 + this.IdentificationNumberType.GetHashCode();
                if (this.Image != null)
                    hashCode = hashCode * 59 + this.Image.GetHashCode();
                if (this.Income != null)
                    hashCode = hashCode * 59 + this.Income.GetHashCode();
                if (this.IsActive != null)
                    hashCode = hashCode * 59 + this.IsActive.GetHashCode();
                if (this.IsVerified != null)
                    hashCode = hashCode * 59 + this.IsVerified.GetHashCode();
                if (this.LastName != null)
                    hashCode = hashCode * 59 + this.LastName.GetHashCode();
                if (this.LiquidNetWorth != null)
                    hashCode = hashCode * 59 + this.LiquidNetWorth.GetHashCode();
                if (this.Metadata != null)
                    hashCode = hashCode * 59 + this.Metadata.GetHashCode();
                if (this.MiddleName != null)
                    hashCode = hashCode * 59 + this.MiddleName.GetHashCode();
                if (this.PhoneNumber != null)
                    hashCode = hashCode * 59 + this.PhoneNumber.GetHashCode();
                if (this.SecondaryId != null)
                    hashCode = hashCode * 59 + this.SecondaryId.GetHashCode();
                if (this.Status != null)
                    hashCode = hashCode * 59 + this.Status.GetHashCode();
                if (this.Suffix != null)
                    hashCode = hashCode * 59 + this.Suffix.GetHashCode();
                if (this.Title != null)
                    hashCode = hashCode * 59 + this.Title.GetHashCode();
                if (this.TotalNetWorth != null)
                    hashCode = hashCode * 59 + this.TotalNetWorth.GetHashCode();
                if (this.UpdateDate != null)
                    hashCode = hashCode * 59 + this.UpdateDate.GetHashCode();
                if (this.Username != null)
                    hashCode = hashCode * 59 + this.Username.GetHashCode();
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
