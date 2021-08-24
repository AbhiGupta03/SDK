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
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenNucleusApi) {
      root.HydrogenNucleusApi = {};
    }
    root.HydrogenNucleusApi.AuditLog = factory(root.HydrogenNucleusApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The AuditLog model module.
   * @module model/AuditLog
   * @version 1.9.4
   */

  /**
   * Constructs a new <code>AuditLog</code>.
   * AuditLog Object
   * @alias module:model/AuditLog
   * @class
   * @param requestUrl {String} requestUrl
   * @param response {String} response
   */
  var exports = function(requestUrl, response) {
    var _this = this;












    _this['request_url'] = requestUrl;
    _this['response'] = response;



  };

  /**
   * Constructs a <code>AuditLog</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AuditLog} obj Optional instance to populate.
   * @return {module:model/AuditLog} The populated <code>AuditLog</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('account_ids')) {
        obj['account_ids'] = ApiClient.convertToType(data['account_ids'], ['String']);
      }
      if (data.hasOwnProperty('aggregation_account_ids')) {
        obj['aggregation_account_ids'] = ApiClient.convertToType(data['aggregation_account_ids'], ['String']);
      }
      if (data.hasOwnProperty('allocation_ids')) {
        obj['allocation_ids'] = ApiClient.convertToType(data['allocation_ids'], ['String']);
      }
      if (data.hasOwnProperty('client_ids')) {
        obj['client_ids'] = ApiClient.convertToType(data['client_ids'], ['String']);
      }
      if (data.hasOwnProperty('create_date')) {
        obj['create_date'] = ApiClient.convertToType(data['create_date'], 'Date');
      }
      if (data.hasOwnProperty('goal_ids')) {
        obj['goal_ids'] = ApiClient.convertToType(data['goal_ids'], ['String']);
      }
      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('metadata')) {
        obj['metadata'] = ApiClient.convertToType(data['metadata'], {'String': 'String'});
      }
      if (data.hasOwnProperty('model_ids')) {
        obj['model_ids'] = ApiClient.convertToType(data['model_ids'], ['String']);
      }
      if (data.hasOwnProperty('portfolio_ids')) {
        obj['portfolio_ids'] = ApiClient.convertToType(data['portfolio_ids'], ['String']);
      }
      if (data.hasOwnProperty('request')) {
        obj['request'] = ApiClient.convertToType(data['request'], 'String');
      }
      if (data.hasOwnProperty('request_url')) {
        obj['request_url'] = ApiClient.convertToType(data['request_url'], 'String');
      }
      if (data.hasOwnProperty('response')) {
        obj['response'] = ApiClient.convertToType(data['response'], 'String');
      }
      if (data.hasOwnProperty('secondary_id')) {
        obj['secondary_id'] = ApiClient.convertToType(data['secondary_id'], 'String');
      }
      if (data.hasOwnProperty('security_ids')) {
        obj['security_ids'] = ApiClient.convertToType(data['security_ids'], ['String']);
      }
      if (data.hasOwnProperty('update_date')) {
        obj['update_date'] = ApiClient.convertToType(data['update_date'], 'Date');
      }
    }
    return obj;
  }

  /**
   * accountIds
   * @member {Array.<String>} account_ids
   */
  exports.prototype['account_ids'] = undefined;
  /**
   * aggregationAccountIds
   * @member {Array.<String>} aggregation_account_ids
   */
  exports.prototype['aggregation_account_ids'] = undefined;
  /**
   * allocationIds
   * @member {Array.<String>} allocation_ids
   */
  exports.prototype['allocation_ids'] = undefined;
  /**
   * clientIds
   * @member {Array.<String>} client_ids
   */
  exports.prototype['client_ids'] = undefined;
  /**
   * @member {Date} create_date
   */
  exports.prototype['create_date'] = undefined;
  /**
   * goalIds
   * @member {Array.<String>} goal_ids
   */
  exports.prototype['goal_ids'] = undefined;
  /**
   * id
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * metadata
   * @member {Object.<String, String>} metadata
   */
  exports.prototype['metadata'] = undefined;
  /**
   * modelIds
   * @member {Array.<String>} model_ids
   */
  exports.prototype['model_ids'] = undefined;
  /**
   * portfolioIds
   * @member {Array.<String>} portfolio_ids
   */
  exports.prototype['portfolio_ids'] = undefined;
  /**
   * @member {String} request
   */
  exports.prototype['request'] = undefined;
  /**
   * requestUrl
   * @member {String} request_url
   */
  exports.prototype['request_url'] = undefined;
  /**
   * response
   * @member {String} response
   */
  exports.prototype['response'] = undefined;
  /**
   * @member {String} secondary_id
   */
  exports.prototype['secondary_id'] = undefined;
  /**
   * securityIds
   * @member {Array.<String>} security_ids
   */
  exports.prototype['security_ids'] = undefined;
  /**
   * @member {Date} update_date
   */
  exports.prototype['update_date'] = undefined;



  return exports;
}));


