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
    root.HydrogenIntegrationApi.BaasSubAccountCO = factory(root.HydrogenIntegrationApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The BaasSubAccountCO model module.
   * @module model/BaasSubAccountCO
   * @version 1.3.1
   */

  /**
   * Constructs a new <code>BaasSubAccountCO</code>.
   * @alias module:model/BaasSubAccountCO
   * @class
   */
  var exports = function() {
    var _this = this;


  };

  /**
   * Constructs a <code>BaasSubAccountCO</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/BaasSubAccountCO} obj Optional instance to populate.
   * @return {module:model/BaasSubAccountCO} The populated <code>BaasSubAccountCO</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('nucleus_portfolio_id')) {
        obj['nucleus_portfolio_id'] = ApiClient.convertToType(data['nucleus_portfolio_id'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} nucleus_portfolio_id
   */
  exports.prototype['nucleus_portfolio_id'] = undefined;



  return exports;
}));


