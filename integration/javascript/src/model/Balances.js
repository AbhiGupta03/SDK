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
    root.HydrogenIntegrationApi.Balances = factory(root.HydrogenIntegrationApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The Balances model module.
   * @module model/Balances
   * @version 1.3.1
   */

  /**
   * Constructs a new <code>Balances</code>.
   * Balances Object
   * @alias module:model/Balances
   * @class
   */
  var exports = function() {
    var _this = this;






  };

  /**
   * Constructs a <code>Balances</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Balances} obj Optional instance to populate.
   * @return {module:model/Balances} The populated <code>Balances</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('currency_code')) {
        obj['currency_code'] = ApiClient.convertToType(data['currency_code'], 'String');
      }
      if (data.hasOwnProperty('payable_outstanding')) {
        obj['payable_outstanding'] = ApiClient.convertToType(data['payable_outstanding'], 'Number');
      }
      if (data.hasOwnProperty('payable_overdue')) {
        obj['payable_overdue'] = ApiClient.convertToType(data['payable_overdue'], 'Number');
      }
      if (data.hasOwnProperty('receivable_outstanding')) {
        obj['receivable_outstanding'] = ApiClient.convertToType(data['receivable_outstanding'], 'Number');
      }
      if (data.hasOwnProperty('receivable_overdue')) {
        obj['receivable_overdue'] = ApiClient.convertToType(data['receivable_overdue'], 'Number');
      }
    }
    return obj;
  }

  /**
   * currencyCode
   * @member {String} currency_code
   */
  exports.prototype['currency_code'] = undefined;
  /**
   * payableOutstanding
   * @member {Number} payable_outstanding
   */
  exports.prototype['payable_outstanding'] = undefined;
  /**
   * payableOverdue
   * @member {Number} payable_overdue
   */
  exports.prototype['payable_overdue'] = undefined;
  /**
   * receivableOutstanding
   * @member {Number} receivable_outstanding
   */
  exports.prototype['receivable_outstanding'] = undefined;
  /**
   * receivableOverdue
   * @member {Number} receivable_overdue
   */
  exports.prototype['receivable_overdue'] = undefined;



  return exports;
}));


