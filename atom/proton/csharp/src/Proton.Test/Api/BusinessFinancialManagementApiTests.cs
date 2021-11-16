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
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using NUnit.Framework;

using Proton.Client;
using Proton.Api;

namespace Proton.Test
{
    /// <summary>
    ///  Class for testing BusinessFinancialManagementApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class BusinessFinancialManagementApiTests
    {
        private BusinessFinancialManagementApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new BusinessFinancialManagementApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of BusinessFinancialManagementApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' BusinessFinancialManagementApi
            //Assert.IsInstanceOfType(typeof(BusinessFinancialManagementApi), instance, "instance is a BusinessFinancialManagementApi");
        }

        
        /// <summary>
        /// Test BusinessFinancialHealthCheck
        /// </summary>
        [Test]
        public void BusinessFinancialHealthCheckTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //BusinessFinancialHealthCheckRequest businessFinancialHealthCheckRequest = null;
            //var response = instance.BusinessFinancialHealthCheck(businessFinancialHealthCheckRequest);
            //Assert.IsInstanceOf<Dictionary<string, Object>> (response, "response is Dictionary<string, Object>");
        }
        
        /// <summary>
        /// Test CashAnalysis
        /// </summary>
        [Test]
        public void CashAnalysisTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //CashAnalysisRequest cashAnalysisRequest = null;
            //var response = instance.CashAnalysis(cashAnalysisRequest);
            //Assert.IsInstanceOf<Dictionary<string, Object>> (response, "response is Dictionary<string, Object>");
        }
        
        /// <summary>
        /// Test CustomerAnalysis
        /// </summary>
        [Test]
        public void CustomerAnalysisTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //CustomerAnalysisRequest customerAnalysisRequest = null;
            //var response = instance.CustomerAnalysis(customerAnalysisRequest);
            //Assert.IsInstanceOf<Dictionary<string, Object>> (response, "response is Dictionary<string, Object>");
        }
        
        /// <summary>
        /// Test FinancialStatementAnalysis
        /// </summary>
        [Test]
        public void FinancialStatementAnalysisTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //FinancialStatementAnalysisRequest financialStatementAnalysisRequest = null;
            //var response = instance.FinancialStatementAnalysis(financialStatementAnalysisRequest);
            //Assert.IsInstanceOf<Dictionary<string, Object>> (response, "response is Dictionary<string, Object>");
        }
        
        /// <summary>
        /// Test InvoiceAnalysis
        /// </summary>
        [Test]
        public void InvoiceAnalysisTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //BusinessInvoiceAnalysisRequest invoiceAnalysisRequest = null;
            //var response = instance.InvoiceAnalysis(invoiceAnalysisRequest);
            //Assert.IsInstanceOf<Dictionary<string, Object>> (response, "response is Dictionary<string, Object>");
        }
        
    }

}