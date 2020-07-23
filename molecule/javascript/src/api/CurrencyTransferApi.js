/*
 * Molecule API Documentation
 * The Hydrogen Molecule API
 *
 * OpenAPI spec version: 1.3.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.14
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/CurrencyTransferParams', 'model/CurrencyTransferResponse', 'model/ErrorResponse', 'model/PageCurrencyTransferResponse', 'model/TransactionSuccessResponse'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/CurrencyTransferParams'), require('../model/CurrencyTransferResponse'), require('../model/ErrorResponse'), require('../model/PageCurrencyTransferResponse'), require('../model/TransactionSuccessResponse'));
  } else {
    // Browser globals (root is window)
    if (!root.MoleculeApiDocumentation) {
      root.MoleculeApiDocumentation = {};
    }
    root.MoleculeApiDocumentation.CurrencyTransferApi = factory(root.MoleculeApiDocumentation.ApiClient, root.MoleculeApiDocumentation.CurrencyTransferParams, root.MoleculeApiDocumentation.CurrencyTransferResponse, root.MoleculeApiDocumentation.ErrorResponse, root.MoleculeApiDocumentation.PageCurrencyTransferResponse, root.MoleculeApiDocumentation.TransactionSuccessResponse);
  }
}(this, function(ApiClient, CurrencyTransferParams, CurrencyTransferResponse, ErrorResponse, PageCurrencyTransferResponse, TransactionSuccessResponse) {
  'use strict';

  /**
   * CurrencyTransfer service.
   * @module api/CurrencyTransferApi
   * @version 1.3.0
   */

  /**
   * Constructs a new CurrencyTransferApi. 
   * @alias module:api/CurrencyTransferApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the createCurrencyTransferUsingPost operation.
     * @callback module:api/CurrencyTransferApi~createCurrencyTransferUsingPostCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TransactionSuccessResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Creates Currency Transfer record
     * @param {module:model/CurrencyTransferParams} currencyTransferParams It enables a user to transfer Currency
     * @param {module:api/CurrencyTransferApi~createCurrencyTransferUsingPostCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TransactionSuccessResponse}
     */
    this.createCurrencyTransferUsingPost = function(currencyTransferParams, callback) {
      var postBody = currencyTransferParams;

      // verify the required parameter 'currencyTransferParams' is set
      if (currencyTransferParams === undefined || currencyTransferParams === null) {
        throw new Error("Missing the required parameter 'currencyTransferParams' when calling createCurrencyTransferUsingPost");
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
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = TransactionSuccessResponse;

      return this.apiClient.callApi(
        '/currency_transfer', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getCurrencyTransferAllUsingGet operation.
     * @callback module:api/CurrencyTransferApi~getCurrencyTransferAllUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/PageCurrencyTransferResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Fetch Currency Transfer record list
     * @param {Object} opts Optional parameters
     * @param {String} opts.walletId To filter response Currency Transfer list by Wallet ID
     * @param {String} opts.currencyId To filter response Currency Transfer list by Currency ID
     * @param {Number} opts.page To filter response Currency Transfer list by page number
     * @param {Number} opts.size Number of records per page
     * @param {String} opts.orderBy Field to sort record list
     * @param {Boolean} opts.ascending Sorting order
     * @param {Boolean} opts.getLatest To fetch latest (one) record
     * @param {module:api/CurrencyTransferApi~getCurrencyTransferAllUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/PageCurrencyTransferResponse}
     */
    this.getCurrencyTransferAllUsingGet = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
        'wallet_id': opts['walletId'],
        'currency_id': opts['currencyId'],
        'page': opts['page'],
        'size': opts['size'],
        'order_by': opts['orderBy'],
        'ascending': opts['ascending'],
        'get_latest': opts['getLatest'],
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['oauth2'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = PageCurrencyTransferResponse;

      return this.apiClient.callApi(
        '/currency_transfer', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getCurrencyTransferUsingGet operation.
     * @callback module:api/CurrencyTransferApi~getCurrencyTransferUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/CurrencyTransferResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Fetch Currency Transfer record details
     * @param {String} currencyTransferId Currency Transfer ID
     * @param {module:api/CurrencyTransferApi~getCurrencyTransferUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/CurrencyTransferResponse}
     */
    this.getCurrencyTransferUsingGet = function(currencyTransferId, callback) {
      var postBody = null;

      // verify the required parameter 'currencyTransferId' is set
      if (currencyTransferId === undefined || currencyTransferId === null) {
        throw new Error("Missing the required parameter 'currencyTransferId' when calling getCurrencyTransferUsingGet");
      }


      var pathParams = {
        'currency_transfer_id': currencyTransferId
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
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = CurrencyTransferResponse;

      return this.apiClient.callApi(
        '/currency_transfer/{currency_transfer_id}', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));