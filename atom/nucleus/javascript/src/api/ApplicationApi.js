/**
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.8.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: unset
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/Application', 'model/PageApplication'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/Application'), require('../model/PageApplication'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenNucleusApi) {
      root.HydrogenNucleusApi = {};
    }
    root.HydrogenNucleusApi.ApplicationApi = factory(root.HydrogenNucleusApi.ApiClient, root.HydrogenNucleusApi.Application, root.HydrogenNucleusApi.PageApplication);
  }
}(this, function(ApiClient, Application, PageApplication) {
  'use strict';

  /**
   * Application service.
   * @module api/ApplicationApi
   * @version 1.8.0
   */

  /**
   * Constructs a new ApplicationApi. 
   * @alias module:api/ApplicationApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the createApplicationUsingPost operation.
     * @callback module:api/ApplicationApi~createApplicationUsingPostCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Application} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create an application
     * Create an application
     * @param {module:model/Application} application application
     * @param {module:api/ApplicationApi~createApplicationUsingPostCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Application}
     */
    this.createApplicationUsingPost = function(application, callback) {
      var postBody = application;

      // verify the required parameter 'application' is set
      if (application === undefined || application === null) {
        throw new Error("Missing the required parameter 'application' when calling createApplicationUsingPost");
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['oauth2'];
      var contentTypes = ['application/json'];
      var accepts = ['*/*'];
      var returnType = Application;

      return this.apiClient.callApi(
        '/application', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the deleteApplicationUsingDelete operation.
     * @callback module:api/ApplicationApi~deleteApplicationUsingDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Delete an Application
     * Permanently delete an Application.
     * @param {String} applicationId UUID application_id
     * @param {module:api/ApplicationApi~deleteApplicationUsingDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.deleteApplicationUsingDelete = function(applicationId, callback) {
      var postBody = null;

      // verify the required parameter 'applicationId' is set
      if (applicationId === undefined || applicationId === null) {
        throw new Error("Missing the required parameter 'applicationId' when calling deleteApplicationUsingDelete");
      }


      var pathParams = {
        'application_id': applicationId
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['oauth2'];
      var contentTypes = [];
      var accepts = ['*/*'];
      var returnType = null;

      return this.apiClient.callApi(
        '/application/{application_id}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getApplicationAllUsingGet operation.
     * @callback module:api/ApplicationApi~getApplicationAllUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/PageApplication} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * List all Application
     * Get details for all Application.
     * @param {Object} opts Optional parameters
     * @param {Boolean} opts.ascending ascending (default to false)
     * @param {String} opts.filter filter
     * @param {String} opts.orderBy order_by (default to update_date)
     * @param {Number} opts.page page (default to 0)
     * @param {Number} opts.size size (default to 25)
     * @param {module:api/ApplicationApi~getApplicationAllUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/PageApplication}
     */
    this.getApplicationAllUsingGet = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
        'ascending': opts['ascending'],
        'filter': opts['filter'],
        'order_by': opts['orderBy'],
        'page': opts['page'],
        'size': opts['size']
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['oauth2'];
      var contentTypes = [];
      var accepts = ['*/*'];
      var returnType = PageApplication;

      return this.apiClient.callApi(
        '/application', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getApplicationUsingGet operation.
     * @callback module:api/ApplicationApi~getApplicationUsingGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Application} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Retrieve an Application
     * Retrieve the information for an Application.
     * @param {String} applicationId UUID application_id
     * @param {module:api/ApplicationApi~getApplicationUsingGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Application}
     */
    this.getApplicationUsingGet = function(applicationId, callback) {
      var postBody = null;

      // verify the required parameter 'applicationId' is set
      if (applicationId === undefined || applicationId === null) {
        throw new Error("Missing the required parameter 'applicationId' when calling getApplicationUsingGet");
      }


      var pathParams = {
        'application_id': applicationId
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['oauth2'];
      var contentTypes = [];
      var accepts = ['*/*'];
      var returnType = Application;

      return this.apiClient.callApi(
        '/application/{application_id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the updateApplicationUsingPut operation.
     * @callback module:api/ApplicationApi~updateApplicationUsingPutCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Application} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Update an Application
     * Update the information for an Application
     * @param {module:model/Application} application application
     * @param {String} applicationId UUID application_id
     * @param {module:api/ApplicationApi~updateApplicationUsingPutCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Application}
     */
    this.updateApplicationUsingPut = function(application, applicationId, callback) {
      var postBody = application;

      // verify the required parameter 'application' is set
      if (application === undefined || application === null) {
        throw new Error("Missing the required parameter 'application' when calling updateApplicationUsingPut");
      }

      // verify the required parameter 'applicationId' is set
      if (applicationId === undefined || applicationId === null) {
        throw new Error("Missing the required parameter 'applicationId' when calling updateApplicationUsingPut");
      }


      var pathParams = {
        'application_id': applicationId
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['oauth2'];
      var contentTypes = ['application/json'];
      var accepts = ['*/*'];
      var returnType = Application;

      return this.apiClient.callApi(
        '/application/{application_id}', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
