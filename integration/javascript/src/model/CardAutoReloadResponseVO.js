/**
 * Hydrogen Integration API
 * The Hydrogen Integration API
 *
 * OpenAPI spec version: 1.3.1
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
    if (!root.HydrogenIntegrationApi) {
      root.HydrogenIntegrationApi = {};
    }
    root.HydrogenIntegrationApi.CardAutoReloadResponseVO = factory(root.HydrogenIntegrationApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The CardAutoReloadResponseVO model module.
   * @module model/CardAutoReloadResponseVO
   * @version 1.3.1
   */

  /**
   * Constructs a new <code>CardAutoReloadResponseVO</code>.
   * @alias module:model/CardAutoReloadResponseVO
   * @class
   */
  var exports = function() {
    var _this = this;







  };

  /**
   * Constructs a <code>CardAutoReloadResponseVO</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CardAutoReloadResponseVO} obj Optional instance to populate.
   * @return {module:model/CardAutoReloadResponseVO} The populated <code>CardAutoReloadResponseVO</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('message')) {
        obj['message'] = ApiClient.convertToType(data['message'], 'String');
      }
      if (data.hasOwnProperty('nucleus_client_id')) {
        obj['nucleus_client_id'] = ApiClient.convertToType(data['nucleus_client_id'], 'String');
      }
      if (data.hasOwnProperty('reload_amount')) {
        obj['reload_amount'] = ApiClient.convertToType(data['reload_amount'], 'Number');
      }
      if (data.hasOwnProperty('threshold_amount')) {
        obj['threshold_amount'] = ApiClient.convertToType(data['threshold_amount'], 'Number');
      }
      if (data.hasOwnProperty('vendor_name')) {
        obj['vendor_name'] = ApiClient.convertToType(data['vendor_name'], 'String');
      }
      if (data.hasOwnProperty('vendor_response')) {
        obj['vendor_response'] = ApiClient.convertToType(data['vendor_response'], Object);
      }
    }
    return obj;
  }

  /**
   * @member {String} message
   */
  exports.prototype['message'] = undefined;
  /**
   * @member {String} nucleus_client_id
   */
  exports.prototype['nucleus_client_id'] = undefined;
  /**
   * @member {Number} reload_amount
   */
  exports.prototype['reload_amount'] = undefined;
  /**
   * @member {Number} threshold_amount
   */
  exports.prototype['threshold_amount'] = undefined;
  /**
   * @member {String} vendor_name
   */
  exports.prototype['vendor_name'] = undefined;
  /**
   * @member {Object} vendor_response
   */
  exports.prototype['vendor_response'] = undefined;



  return exports;
}));


