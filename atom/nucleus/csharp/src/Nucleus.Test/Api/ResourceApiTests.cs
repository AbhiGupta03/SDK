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
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using NUnit.Framework;

using Nucleus.Client;
using Nucleus.Api;
using Nucleus.ModelEntity;

namespace Nucleus.Test
{
    /// <summary>
    ///  Class for testing ResourceApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class ResourceApiTests
    {
        private ResourceApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new ResourceApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of ResourceApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' ResourceApi
            //Assert.IsInstanceOfType(typeof(ResourceApi), instance, "instance is a ResourceApi");
        }

        
        /// <summary>
        /// Test CreateFxRateBulkUsingPost
        /// </summary>
        [Test]
        public void CreateFxRateBulkUsingPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //List<FxRate> fxRateList = null;
            //var response = instance.CreateFxRateBulkUsingPost(fxRateList);
            //Assert.IsInstanceOf<List<FxRate>> (response, "response is List<FxRate>");
        }
        
        /// <summary>
        /// Test CreateInstitutionUsingPost
        /// </summary>
        [Test]
        public void CreateInstitutionUsingPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Institution institution = null;
            //var response = instance.CreateInstitutionUsingPost(institution);
            //Assert.IsInstanceOf<Institution> (response, "response is Institution");
        }
        
        /// <summary>
        /// Test DeleteInstitutionUsingDelete
        /// </summary>
        [Test]
        public void DeleteInstitutionUsingDeleteTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? institutionId = null;
            //instance.DeleteInstitutionUsingDelete(institutionId);
            
        }
        
        /// <summary>
        /// Test GetAccountResultForMapping
        /// </summary>
        [Test]
        public void GetAccountResultForMappingTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string filter = null;
            //Guid? hydrogenAccountCategoryId = null;
            //bool? matchPrimary = null;
            //string tenantName = null;
            //string vendorName = null;
            //var response = instance.GetAccountResultForMapping(filter, hydrogenAccountCategoryId, matchPrimary, tenantName, vendorName);
            //Assert.IsInstanceOf<List<Object>> (response, "response is List<Object>");
        }
        
        /// <summary>
        /// Test GetAllCountryUsingGet
        /// </summary>
        [Test]
        public void GetAllCountryUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.GetAllCountryUsingGet();
            //Assert.IsInstanceOf<List<Country>> (response, "response is List<Country>");
        }
        
        /// <summary>
        /// Test GetAllCurrencyUsingGet
        /// </summary>
        [Test]
        public void GetAllCurrencyUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.GetAllCurrencyUsingGet();
            //Assert.IsInstanceOf<List<Currency>> (response, "response is List<Currency>");
        }
        
        /// <summary>
        /// Test GetAllMerchantCategoryCodeUsingGet
        /// </summary>
        [Test]
        public void GetAllMerchantCategoryCodeUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string filter = null;
            //var response = instance.GetAllMerchantCategoryCodeUsingGet(filter);
            //Assert.IsInstanceOf<List<MerchantCategoryCode>> (response, "response is List<MerchantCategoryCode>");
        }
        
        /// <summary>
        /// Test GetAllStatesUsingGet
        /// </summary>
        [Test]
        public void GetAllStatesUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string countryCode = null;
            //var response = instance.GetAllStatesUsingGet(countryCode);
            //Assert.IsInstanceOf<List<State>> (response, "response is List<State>");
        }
        
        /// <summary>
        /// Test GetAllStatisticsUsingGet
        /// </summary>
        [Test]
        public void GetAllStatisticsUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.GetAllStatisticsUsingGet();
            //Assert.IsInstanceOf<Dictionary<string, List<StatisticResourceVO>>> (response, "response is Dictionary<string, List<StatisticResourceVO>>");
        }
        
        /// <summary>
        /// Test GetCurrencyExchangeRateAllUsingGet
        /// </summary>
        [Test]
        public void GetCurrencyExchangeRateAllUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string filter = null;
            //var response = instance.GetCurrencyExchangeRateAllUsingGet(filter);
            //Assert.IsInstanceOf<List<FxRateView>> (response, "response is List<FxRateView>");
        }
        
        /// <summary>
        /// Test GetInstitutionAllUsingGet
        /// </summary>
        [Test]
        public void GetInstitutionAllUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //bool? ascending = null;
            //string filter = null;
            //string orderBy = null;
            //int? page = null;
            //int? size = null;
            //var response = instance.GetInstitutionAllUsingGet(ascending, filter, orderBy, page, size);
            //Assert.IsInstanceOf<PageInstitution> (response, "response is PageInstitution");
        }
        
        /// <summary>
        /// Test GetInstitutionUsingGet
        /// </summary>
        [Test]
        public void GetInstitutionUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? institutionId = null;
            //var response = instance.GetInstitutionUsingGet(institutionId);
            //Assert.IsInstanceOf<Institution> (response, "response is Institution");
        }
        
        /// <summary>
        /// Test GetMerchantsAllUsingGet
        /// </summary>
        [Test]
        public void GetMerchantsAllUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //bool? ascending = null;
            //string filter = null;
            //string orderBy = null;
            //int? page = null;
            //int? size = null;
            //var response = instance.GetMerchantsAllUsingGet(ascending, filter, orderBy, page, size);
            //Assert.IsInstanceOf<MXMerchantRes> (response, "response is MXMerchantRes");
        }
        
        /// <summary>
        /// Test GetTransactionResultForMapping
        /// </summary>
        [Test]
        public void GetTransactionResultForMappingTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string filter = null;
            //Guid? hydrogenTransactionCategoryId = null;
            //bool? matchPrimary = null;
            //string tenantName = null;
            //string vendorName = null;
            //var response = instance.GetTransactionResultForMapping(filter, hydrogenTransactionCategoryId, matchPrimary, tenantName, vendorName);
            //Assert.IsInstanceOf<List<Object>> (response, "response is List<Object>");
        }
        
        /// <summary>
        /// Test UpdateInstitutionUsingPut
        /// </summary>
        [Test]
        public void UpdateInstitutionUsingPutTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Object institution = null;
            //Guid? institutionId = null;
            //var response = instance.UpdateInstitutionUsingPut(institution, institutionId);
            //Assert.IsInstanceOf<Institution> (response, "response is Institution");
        }
        
    }

}
