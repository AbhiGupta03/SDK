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
    ///  Class for testing SimulationsApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class SimulationsApiTests
    {
        private SimulationsApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new SimulationsApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of SimulationsApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' SimulationsApi
            //Assert.IsInstanceOfType(typeof(SimulationsApi), instance, "instance is a SimulationsApi");
        }

        
        /// <summary>
        /// Test Backtest
        /// </summary>
        [Test]
        public void BacktestTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //BacktestRequest backtestRequest = null;
            //var response = instance.Backtest(backtestRequest);
            //Assert.IsInstanceOf<Dictionary<string, Object>> (response, "response is Dictionary<string, Object>");
        }
        
        /// <summary>
        /// Test EventStudy
        /// </summary>
        [Test]
        public void EventStudyTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //EventStudyRequest eventStudyRequest = null;
            //var response = instance.EventStudy(eventStudyRequest);
            //Assert.IsInstanceOf<Dictionary<string, Object>> (response, "response is Dictionary<string, Object>");
        }
        
        /// <summary>
        /// Test MonteCarlo
        /// </summary>
        [Test]
        public void MonteCarloTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //MonteCarloRequest monteCarloRequest = null;
            //var response = instance.MonteCarlo(monteCarloRequest);
            //Assert.IsInstanceOf<Dictionary<string, Object>> (response, "response is Dictionary<string, Object>");
        }
        
        /// <summary>
        /// Test PortfolioWhatIf
        /// </summary>
        [Test]
        public void PortfolioWhatIfTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //PortfolioWhatIfRequest portfolioWhatIfRequest = null;
            //var response = instance.PortfolioWhatIf(portfolioWhatIfRequest);
            //Assert.IsInstanceOf<Dictionary<string, Object>> (response, "response is Dictionary<string, Object>");
        }
        
        /// <summary>
        /// Test SavingsCalculator
        /// </summary>
        [Test]
        public void SavingsCalculatorTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //SavingsCalculatorRequest savingsCalculatorRequest = null;
            //var response = instance.SavingsCalculator(savingsCalculatorRequest);
            //Assert.IsInstanceOf<Dictionary<string, Object>> (response, "response is Dictionary<string, Object>");
        }
        
        /// <summary>
        /// Test ScenarioAnalysis
        /// </summary>
        [Test]
        public void ScenarioAnalysisTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ScenarioAnalysisRequest scnearioAnalysisRequest = null;
            //var response = instance.ScenarioAnalysis(scnearioAnalysisRequest);
            //Assert.IsInstanceOf<Dictionary<string, Object>> (response, "response is Dictionary<string, Object>");
        }
        
        /// <summary>
        /// Test SensitivityAnalysis
        /// </summary>
        [Test]
        public void SensitivityAnalysisTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //SensitivityAnalysisRequest sensitivityAnalysisRequest = null;
            //var response = instance.SensitivityAnalysis(sensitivityAnalysisRequest);
            //Assert.IsInstanceOf<Dictionary<string, Object>> (response, "response is Dictionary<string, Object>");
        }
        
    }

}
