/*
 * Hydrogen Proton API
 * Financial engineering module of Hydrogen Atom
 *
 * OpenAPI spec version: 1.9.1
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.19
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/DiversificationScoreRequest', 'model/EmergencyFundCalculatorRequest', 'model/FinancialHealthCheckRequest', 'model/PortfolioOptimizationScoreRequest'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/DiversificationScoreRequest'), require('../model/EmergencyFundCalculatorRequest'), require('../model/FinancialHealthCheckRequest'), require('../model/PortfolioOptimizationScoreRequest'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenProtonApi) {
      root.HydrogenProtonApi = {};
    }
    root.HydrogenProtonApi.FinancialHealthApi = factory(root.HydrogenProtonApi.ApiClient, root.HydrogenProtonApi.DiversificationScoreRequest, root.HydrogenProtonApi.EmergencyFundCalculatorRequest, root.HydrogenProtonApi.FinancialHealthCheckRequest, root.HydrogenProtonApi.PortfolioOptimizationScoreRequest);
  }
}(this, function(ApiClient, DiversificationScoreRequest, EmergencyFundCalculatorRequest, FinancialHealthCheckRequest, PortfolioOptimizationScoreRequest) {
  'use strict';

  /**
   * FinancialHealth service.
   * @module api/FinancialHealthApi
   * @version 1.9.1
   */

  /**
   * Constructs a new FinancialHealthApi. 
   * @alias module:api/FinancialHealthApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the diversificationScore operation.
     * @callback module:api/FinancialHealthApi~diversificationScoreCallback
     * @param {String} error Error message, if any.
     * @param {Object.<String, {'String': Object}>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Diversification Score
     * Assess how well a group of investments is diversified
     * @param {module:model/DiversificationScoreRequest} diversificationScoreRequest Request payload for Diversification Score
     * @param {module:api/FinancialHealthApi~diversificationScoreCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object.<String, {'String': Object}>}
     */
    this.diversificationScore = function(diversificationScoreRequest, callback) {
      var postBody = diversificationScoreRequest;

      // verify the required parameter 'diversificationScoreRequest' is set
      if (diversificationScoreRequest === undefined || diversificationScoreRequest === null) {
        throw new Error("Missing the required parameter 'diversificationScoreRequest' when calling diversificationScore");
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['oauth2'];
      var contentTypes = ['application/json'];
      var accepts = ['application/json'];
      var returnType = {'String': Object};

      return this.apiClient.callApi(
        '/diversification_score', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the emergencyFundCalculator operation.
     * @callback module:api/FinancialHealthApi~emergencyFundCalculatorCallback
     * @param {String} error Error message, if any.
     * @param {Object.<String, {'String': Object}>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Emergency Fund Calculator
     * Calculate a target emergency fund amount and savings plan
     * @param {module:model/EmergencyFundCalculatorRequest} emergencyFundCalculatorRequest Request payload for Emergency Fund Calculator
     * @param {module:api/FinancialHealthApi~emergencyFundCalculatorCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object.<String, {'String': Object}>}
     */
    this.emergencyFundCalculator = function(emergencyFundCalculatorRequest, callback) {
      var postBody = emergencyFundCalculatorRequest;

      // verify the required parameter 'emergencyFundCalculatorRequest' is set
      if (emergencyFundCalculatorRequest === undefined || emergencyFundCalculatorRequest === null) {
        throw new Error("Missing the required parameter 'emergencyFundCalculatorRequest' when calling emergencyFundCalculator");
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['oauth2'];
      var contentTypes = ['application/json'];
      var accepts = ['application/json'];
      var returnType = {'String': Object};

      return this.apiClient.callApi(
        '/emergency_fund_calculator', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the financialHealthCheck operation.
     * @callback module:api/FinancialHealthApi~financialHealthCheckCallback
     * @param {String} error Error message, if any.
     * @param {Object.<String, {'String': Object}>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Financial Health Check
     * Calculate a series of financial ratios to assess financial health
     * @param {module:model/FinancialHealthCheckRequest} financialHealthCheckRequest Request payload for Financial Health Check
     * @param {module:api/FinancialHealthApi~financialHealthCheckCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object.<String, {'String': Object}>}
     */
    this.financialHealthCheck = function(financialHealthCheckRequest, callback) {
      var postBody = financialHealthCheckRequest;

      // verify the required parameter 'financialHealthCheckRequest' is set
      if (financialHealthCheckRequest === undefined || financialHealthCheckRequest === null) {
        throw new Error("Missing the required parameter 'financialHealthCheckRequest' when calling financialHealthCheck");
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['oauth2'];
      var contentTypes = ['application/json'];
      var accepts = ['application/json'];
      var returnType = {'String': Object};

      return this.apiClient.callApi(
        '/financial_health_check', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the portfolioOptimizationScore operation.
     * @callback module:api/FinancialHealthApi~portfolioOptimizationScoreCallback
     * @param {String} error Error message, if any.
     * @param {Object.<String, {'String': Object}>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Portfolio Optimization Score
     * Analyze a group of investments against the optimized result
     * @param {module:model/PortfolioOptimizationScoreRequest} portfolioOptimizationScoreRequest Request payload for Portfolio Optimization Score
     * @param {module:api/FinancialHealthApi~portfolioOptimizationScoreCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object.<String, {'String': Object}>}
     */
    this.portfolioOptimizationScore = function(portfolioOptimizationScoreRequest, callback) {
      var postBody = portfolioOptimizationScoreRequest;

      // verify the required parameter 'portfolioOptimizationScoreRequest' is set
      if (portfolioOptimizationScoreRequest === undefined || portfolioOptimizationScoreRequest === null) {
        throw new Error("Missing the required parameter 'portfolioOptimizationScoreRequest' when calling portfolioOptimizationScore");
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['oauth2'];
      var contentTypes = ['application/json'];
      var accepts = ['application/json'];
      var returnType = {'String': Object};

      return this.apiClient.callApi(
        '/portfolio_optimization_score', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
