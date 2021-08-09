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
    root.HydrogenIntegrationApi.AchCardLoadResponseVO = factory(root.HydrogenIntegrationApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The AchCardLoadResponseVO model module.
   * @module model/AchCardLoadResponseVO
   * @version 1.3.1
   */

  /**
   * Constructs a new <code>AchCardLoadResponseVO</code>.
   * @alias module:model/AchCardLoadResponseVO
   * @class
   */
  var exports = function() {
    var _this = this;



  };

  /**
   * Constructs a <code>AchCardLoadResponseVO</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AchCardLoadResponseVO} obj Optional instance to populate.
   * @return {module:model/AchCardLoadResponseVO} The populated <code>AchCardLoadResponseVO</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('card_load')) {
        obj['card_load'] = ApiClient.convertToType(data['card_load'], Object);
      }
      if (data.hasOwnProperty('card_load_status_code')) {
        obj['card_load_status_code'] = ApiClient.convertToType(data['card_load_status_code'], 'Number');
      }
    }
    return obj;
  }

  /**
   * @member {Object} card_load
   */
  exports.prototype['card_load'] = undefined;
  /**
   * @member {Number} card_load_status_code
   */
  exports.prototype['card_load_status_code'] = undefined;



  return exports;
}));


