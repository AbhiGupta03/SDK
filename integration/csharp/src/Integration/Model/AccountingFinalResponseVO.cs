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
    /// AccountingFinalResponseVO
    /// </summary>
    [DataContract]
    public partial class AccountingFinalResponseVO :  IEquatable<AccountingFinalResponseVO>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AccountingFinalResponseVO" /> class.
        /// </summary>
        /// <param name="integrationType">integrationType.</param>
        /// <param name="message">message.</param>
        /// <param name="nucleusContacts">nucleusContacts.</param>
        /// <param name="nucleusCustomerRevenues">nucleusCustomerRevenues.</param>
        /// <param name="nucleusFinancialStatement">nucleusFinancialStatement.</param>
        /// <param name="nucleusInvoicePayments">nucleusInvoicePayments.</param>
        /// <param name="nucleusInvoices">nucleusInvoices.</param>
        /// <param name="vendorName">vendorName.</param>
        public AccountingFinalResponseVO(string integrationType = default(string), string message = default(string), List<AccountingCustomerResponseVO> nucleusContacts = default(List<AccountingCustomerResponseVO>), List<AccountingCustomerRevenueResponseVO> nucleusCustomerRevenues = default(List<AccountingCustomerRevenueResponseVO>), AccountingStatsResponseVO nucleusFinancialStatement = default(AccountingStatsResponseVO), List<AccountingInvoicePaymentResponseVO> nucleusInvoicePayments = default(List<AccountingInvoicePaymentResponseVO>), List<AccountingInvoiceResponseVO> nucleusInvoices = default(List<AccountingInvoiceResponseVO>), string vendorName = default(string))
        {
            this.IntegrationType = integrationType;
            this.Message = message;
            this.NucleusContacts = nucleusContacts;
            this.NucleusCustomerRevenues = nucleusCustomerRevenues;
            this.NucleusFinancialStatement = nucleusFinancialStatement;
            this.NucleusInvoicePayments = nucleusInvoicePayments;
            this.NucleusInvoices = nucleusInvoices;
            this.VendorName = vendorName;
        }
        
        /// <summary>
        /// Gets or Sets IntegrationType
        /// </summary>
        [DataMember(Name="integration_type", EmitDefaultValue=false)]
        public string IntegrationType { get; set; }

        /// <summary>
        /// Gets or Sets Message
        /// </summary>
        [DataMember(Name="message", EmitDefaultValue=false)]
        public string Message { get; set; }

        /// <summary>
        /// Gets or Sets NucleusContacts
        /// </summary>
        [DataMember(Name="nucleus_contacts", EmitDefaultValue=false)]
        public List<AccountingCustomerResponseVO> NucleusContacts { get; set; }

        /// <summary>
        /// Gets or Sets NucleusCustomerRevenues
        /// </summary>
        [DataMember(Name="nucleus_customer_revenues", EmitDefaultValue=false)]
        public List<AccountingCustomerRevenueResponseVO> NucleusCustomerRevenues { get; set; }

        /// <summary>
        /// Gets or Sets NucleusFinancialStatement
        /// </summary>
        [DataMember(Name="nucleus_financial_statement", EmitDefaultValue=false)]
        public AccountingStatsResponseVO NucleusFinancialStatement { get; set; }

        /// <summary>
        /// Gets or Sets NucleusInvoicePayments
        /// </summary>
        [DataMember(Name="nucleus_invoice_payments", EmitDefaultValue=false)]
        public List<AccountingInvoicePaymentResponseVO> NucleusInvoicePayments { get; set; }

        /// <summary>
        /// Gets or Sets NucleusInvoices
        /// </summary>
        [DataMember(Name="nucleus_invoices", EmitDefaultValue=false)]
        public List<AccountingInvoiceResponseVO> NucleusInvoices { get; set; }

        /// <summary>
        /// Gets or Sets VendorName
        /// </summary>
        [DataMember(Name="vendor_name", EmitDefaultValue=false)]
        public string VendorName { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AccountingFinalResponseVO {\n");
            sb.Append("  IntegrationType: ").Append(IntegrationType).Append("\n");
            sb.Append("  Message: ").Append(Message).Append("\n");
            sb.Append("  NucleusContacts: ").Append(NucleusContacts).Append("\n");
            sb.Append("  NucleusCustomerRevenues: ").Append(NucleusCustomerRevenues).Append("\n");
            sb.Append("  NucleusFinancialStatement: ").Append(NucleusFinancialStatement).Append("\n");
            sb.Append("  NucleusInvoicePayments: ").Append(NucleusInvoicePayments).Append("\n");
            sb.Append("  NucleusInvoices: ").Append(NucleusInvoices).Append("\n");
            sb.Append("  VendorName: ").Append(VendorName).Append("\n");
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
            return this.Equals(input as AccountingFinalResponseVO);
        }

        /// <summary>
        /// Returns true if AccountingFinalResponseVO instances are equal
        /// </summary>
        /// <param name="input">Instance of AccountingFinalResponseVO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AccountingFinalResponseVO input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.IntegrationType == input.IntegrationType ||
                    (this.IntegrationType != null &&
                    this.IntegrationType.Equals(input.IntegrationType))
                ) && 
                (
                    this.Message == input.Message ||
                    (this.Message != null &&
                    this.Message.Equals(input.Message))
                ) && 
                (
                    this.NucleusContacts == input.NucleusContacts ||
                    this.NucleusContacts != null &&
                    this.NucleusContacts.SequenceEqual(input.NucleusContacts)
                ) && 
                (
                    this.NucleusCustomerRevenues == input.NucleusCustomerRevenues ||
                    this.NucleusCustomerRevenues != null &&
                    this.NucleusCustomerRevenues.SequenceEqual(input.NucleusCustomerRevenues)
                ) && 
                (
                    this.NucleusFinancialStatement == input.NucleusFinancialStatement ||
                    (this.NucleusFinancialStatement != null &&
                    this.NucleusFinancialStatement.Equals(input.NucleusFinancialStatement))
                ) && 
                (
                    this.NucleusInvoicePayments == input.NucleusInvoicePayments ||
                    this.NucleusInvoicePayments != null &&
                    this.NucleusInvoicePayments.SequenceEqual(input.NucleusInvoicePayments)
                ) && 
                (
                    this.NucleusInvoices == input.NucleusInvoices ||
                    this.NucleusInvoices != null &&
                    this.NucleusInvoices.SequenceEqual(input.NucleusInvoices)
                ) && 
                (
                    this.VendorName == input.VendorName ||
                    (this.VendorName != null &&
                    this.VendorName.Equals(input.VendorName))
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
                if (this.IntegrationType != null)
                    hashCode = hashCode * 59 + this.IntegrationType.GetHashCode();
                if (this.Message != null)
                    hashCode = hashCode * 59 + this.Message.GetHashCode();
                if (this.NucleusContacts != null)
                    hashCode = hashCode * 59 + this.NucleusContacts.GetHashCode();
                if (this.NucleusCustomerRevenues != null)
                    hashCode = hashCode * 59 + this.NucleusCustomerRevenues.GetHashCode();
                if (this.NucleusFinancialStatement != null)
                    hashCode = hashCode * 59 + this.NucleusFinancialStatement.GetHashCode();
                if (this.NucleusInvoicePayments != null)
                    hashCode = hashCode * 59 + this.NucleusInvoicePayments.GetHashCode();
                if (this.NucleusInvoices != null)
                    hashCode = hashCode * 59 + this.NucleusInvoices.GetHashCode();
                if (this.VendorName != null)
                    hashCode = hashCode * 59 + this.VendorName.GetHashCode();
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
