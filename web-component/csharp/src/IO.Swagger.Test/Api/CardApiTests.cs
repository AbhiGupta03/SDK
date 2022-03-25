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
    ///  Class for testing CardApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class CardApiTests
    {
        private CardApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new CardApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of CardApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' CardApi
            //Assert.IsInstanceOfType(typeof(CardApi), instance, "instance is a CardApi");
        }

        
        /// <summary>
        /// Test CreateCardUsingPost
        /// </summary>
        [Test]
        public void CreateCardUsingPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Card cardRequest = null;
            //var response = instance.CreateCardUsingPost(cardRequest);
            //Assert.IsInstanceOf<Card> (response, "response is Card");
        }
        
        /// <summary>
        /// Test GetCardAllUsingGet
        /// </summary>
        [Test]
        public void GetCardAllUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //bool? ascending = null;
            //string filter = null;
            //string orderBy = null;
            //int? page = null;
            //int? size = null;
            //var response = instance.GetCardAllUsingGet(ascending, filter, orderBy, page, size);
            //Assert.IsInstanceOf<PageCard> (response, "response is PageCard");
        }
        
        /// <summary>
        /// Test GetCardUsingGet
        /// </summary>
        [Test]
        public void GetCardUsingGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? cardId = null;
            //var response = instance.GetCardUsingGet(cardId);
            //Assert.IsInstanceOf<Card> (response, "response is Card");
        }
        
        /// <summary>
        /// Test UpdateCardUsingPut
        /// </summary>
        [Test]
        public void UpdateCardUsingPutTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Object card = null;
            //Guid? cardId = null;
            //var response = instance.UpdateCardUsingPut(card, cardId);
            //Assert.IsInstanceOf<Card> (response, "response is Card");
        }
        
    }

}