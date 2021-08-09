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
    root.HydrogenIntegrationApi.AchBusinessRequestCO = factory(root.HydrogenIntegrationApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The AchBusinessRequestCO model module.
   * @module model/AchBusinessRequestCO
   * @version 1.3.1
   */

  /**
   * Constructs a new <code>AchBusinessRequestCO</code>.
   * @alias module:model/AchBusinessRequestCO
   * @class
   */
  var exports = function() {
    var _this = this;




  };

  /**
   * Constructs a <code>AchBusinessRequestCO</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AchBusinessRequestCO} obj Optional instance to populate.
   * @return {module:model/AchBusinessRequestCO} The populated <code>AchBusinessRequestCO</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('kyc_required')) {
        obj['kyc_required'] = ApiClient.convertToType(data['kyc_required'], 'Boolean');
      }
      if (data.hasOwnProperty('nucleus_business_id')) {
        obj['nucleus_business_id'] = ApiClient.convertToType(data['nucleus_business_id'], 'String');
      }
      if (data.hasOwnProperty('vendor_request')) {
        obj['vendor_request'] = ApiClient.convertToType(data['vendor_request'], Object);
      }
    }
    return obj;
  }

  /**
   * @member {Boolean} kyc_required
   */
  exports.prototype['kyc_required'] = undefined;
  /**
   * @member {String} nucleus_business_id
   */
  exports.prototype['nucleus_business_id'] = undefined;
  /**
   * @member {Object} vendor_request
   */
  exports.prototype['vendor_request'] = undefined;



  return exports;
}));


