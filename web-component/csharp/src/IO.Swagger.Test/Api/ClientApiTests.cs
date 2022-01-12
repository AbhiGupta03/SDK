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
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using NUnit.Framework;

using IO.Swagger.Client;
using IO.Swagger.Api;
using IO.Swagger.Model;

namespace IO.Swagger.Test
{
    /// <summary>
    ///  Class for testing ClientApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class ClientApiTests
    {
        private ClientApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new ClientApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of ClientApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' ClientApi
            //Assert.IsInstanceOfType(typeof(ClientApi), instance, "instance is a ClientApi");
        }

        
        /// <summary>
        /// Test CreateClientUsingPost
        /// </summary>
        [Test]
        public void CreateClientUsingPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ModelClient clientRequest = null;
            //var response = instance.CreateClientUsingPost(clientRequest);
            //Assert.IsInstanceOf<ModelClient> (response, "response is ModelClient");
        }
        
        /// <summary>
        /// Test GetClientAllUsingGet
        /// </summary>
        [Test]
        public void GetClientAllUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //bool? ascending = null;
            //string filter = null;
            //string orderBy = null;
            //int? page = null;
            //int? size = null;
            //var response = instance.GetClientAllUsingGet(ascending, filter, orderBy, page, size);
            //Assert.IsInstanceOf<PageClient> (response, "response is PageClient");
        }
        
        /// <summary>
        /// Test GetClientUsingGet
        /// </summary>
        [Test]
        public void GetClientUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? clientId = null;
            //var response = instance.GetClientUsingGet(clientId);
            //Assert.IsInstanceOf<ModelClient> (response, "response is ModelClient");
        }
        
        /// <summary>
        /// Test UpdateClientUsingPut
        /// </summary>
        [Test]
        public void UpdateClientUsingPutTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Object _client = null;
            //Guid? clientId = null;
            //var response = instance.UpdateClientUsingPut(_client, clientId);
            //Assert.IsInstanceOf<ModelClient> (response, "response is ModelClient");
        }
        
    }

}
