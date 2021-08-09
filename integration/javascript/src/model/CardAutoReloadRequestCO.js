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
    root.HydrogenIntegrationApi.CardAutoReloadRequestCO = factory(root.HydrogenIntegrationApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The CardAutoReloadRequestCO model module.
   * @module model/CardAutoReloadRequestCO
   * @version 1.3.1
   */

  /**
   * Constructs a new <code>CardAutoReloadRequestCO</code>.
   * @alias module:model/CardAutoReloadRequestCO
   * @class
   */
  var exports = function() {
    var _this = this;





  };

  /**
   * Constructs a <code>CardAutoReloadRequestCO</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CardAutoReloadRequestCO} obj Optional instance to populate.
   * @return {module:model/CardAutoReloadRequestCO} The populated <code>CardAutoReloadRequestCO</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('nucleus_bank_link_id')) {
        obj['nucleus_bank_link_id'] = ApiClient.convertToType(data['nucleus_bank_link_id'], 'String');
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
    }
    return obj;
  }

  /**
   * @member {String} nucleus_bank_link_id
   */
  exports.prototype['nucleus_bank_link_id'] = undefined;
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



  return exports;
}));


