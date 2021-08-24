/**
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.4
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.2.3
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/BulkTransaction', 'model/BulkTransactionVO', 'model/JsonNode'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/BulkTransaction'), require('../model/BulkTransactionVO'), require('../model/JsonNode'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenNucleusApi) {
      root.HydrogenNucleusApi = {};
    }
    root.HydrogenNucleusApi.BulkApi = factory(root.HydrogenNucleusApi.ApiClient, root.HydrogenNucleusApi.BulkTransaction, root.HydrogenNucleusApi.BulkTransactionVO, root.HydrogenNucleusApi.JsonNode);
  }
}(this, function(ApiClient, BulkTransaction, BulkTransactionVO, JsonNode) {
  'use strict';

  /**
   * Bulk service.
   * @module api/BulkApi
   * @version 1.9.4
   */

  /**
   * Constructs a new BulkApi. 
   * @alias module:api/BulkApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the createBulkUsingPost operation.
     * @callback module:api/BulkApi~createBulkUsingPostCallback
     * @param {String} error Error message, if any.
     * @param {module:model/BulkTransaction} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create a bulk data
     * Create a new bulk data for your firm.
     * @param {module:model/JsonNode} data data
     * @param {String} entityUri UUID entity_uri
     * @param {module:api/BulkApi~createBulkUsingPostCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/BulkTransaction}
     */
    this.createBulkUsingPost = function(data, entityUri, callback) {
      var postBody = data;

      // verify the required parameter 'data' is set
      if (data === undefined || data === null) {
        throw new Error("Missing the required parameter 'data' when calling createBulkUsingPost");
      }

      // verify the required parameter 'entityUri' is set
      if (entityUri === undefined || entityUri === null) {
        throw new Error("Missing the required parameter 'entityUri' when calling createBulkUsingPost");
      }


      var pathParams = {
        'entity_uri': entityUri
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['oauth2'];
      var contentTypes = ['application/json'];
      var accepts = ['application/json'];
      var returnType = BulkTransaction;

      return this.apiClient.callApi(
        '/nucleus/v1/bulk/{entity_uri}', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the deleteBulkUsingDelete operation.
     * @callback module:api/BulkApi~deleteBulkUsingDeleteCallback
     * @param {String} error Error message, if any.
     * @param {module:model/BulkTransaction} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Delete a bulk data
     * Delete a bulk data for your firm.
     * @param {module:model/JsonNode} data data
     * @param {String} entityUri UUID entity_uri
     * @param {module:api/BulkApi~deleteBulkUsingDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/BulkTransaction}
     */
    this.deleteBulkUsingDelete = function(data, entityUri, callback) {
      var postBody = data;

      // verify the required parameter 'data' is set
      if (data === undefined || data === null) {
        throw new Error("Missing the required parameter 'data' when calling deleteBulkUsingDelete");
      }

      // verify the required parameter 'entityUri' is set
      if (entityUri === undefined || entityUri === null) {
        throw new Error("Missing the required parameter 'entityUri' when calling deleteBulkUsingDelete");
      }


      var pathParams = {
        'entity_uri': entityUri
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['oauth2'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = BulkTransaction;

      return this.apiClient.callApi(
        '/nucleus/v1/bulk/{entity_uri}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getBulkStatusUsingGet operation.
     * @callback module:api/BulkApi~getBulkStatusUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/BulkTransactionVO} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Status of bulk transaction
     * Get the status of bulk transaction.
     * @param {String} id UUID Bulk Transaction Id
     * @param {module:api/BulkApi~getBulkStatusUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/BulkTransactionVO}
     */
    this.getBulkStatusUsingGet = function(id, callback) {
      var postBody = null;

      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling getBulkStatusUsingGet");
      }


      var pathParams = {
        'id': id
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['oauth2'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = BulkTransactionVO;

      return this.apiClient.callApi(
        '/nucleus/v1/bulk/status/{id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the updateBulkUsingPut operation.
     * @callback module:api/BulkApi~updateBulkUsingPutCallback
     * @param {String} error Error message, if any.
     * @param {module:model/BulkTransaction} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Update a bulk data
     * Update a bulk data for your firm.
     * @param {module:model/JsonNode} data data
     * @param {String} entityUri UUID entity_uri
     * @param {module:api/BulkApi~updateBulkUsingPutCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/BulkTransaction}
     */
    this.updateBulkUsingPut = function(data, entityUri, callback) {
      var postBody = data;

      // verify the required parameter 'data' is set
      if (data === undefined || data === null) {
        throw new Error("Missing the required parameter 'data' when calling updateBulkUsingPut");
      }

      // verify the required parameter 'entityUri' is set
      if (entityUri === undefined || entityUri === null) {
        throw new Error("Missing the required parameter 'entityUri' when calling updateBulkUsingPut");
      }


      var pathParams = {
        'entity_uri': entityUri
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['oauth2'];
      var contentTypes = ['application/json'];
      var accepts = ['application/json'];
      var returnType = BulkTransaction;

      return this.apiClient.callApi(
        '/nucleus/v1/bulk/{entity_uri}', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
