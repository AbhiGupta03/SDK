/**
 * Hydrogen Molecule API
 * The Hydrogen Molecule API
 *
 * OpenAPI spec version: 1.0.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.8-SNAPSHOT
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
    if (!root.molecule_api) {
      root.molecule_api = {};
    }
    root.molecule_api.CurrencyBalanceSpecificResponse = factory(root.molecule_api.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The CurrencyBalanceSpecificResponse model module.
   * @module model/CurrencyBalanceSpecificResponse
   * @version 1.0.0
   */

  /**
   * Constructs a new <code>CurrencyBalanceSpecificResponse</code>.
   * @alias module:model/CurrencyBalanceSpecificResponse
   * @class
   */
  var exports = function() {
    var _this = this;







  };

  /**
   * Constructs a <code>CurrencyBalanceSpecificResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CurrencyBalanceSpecificResponse} obj Optional instance to populate.
   * @return {module:model/CurrencyBalanceSpecificResponse} The populated <code>CurrencyBalanceSpecificResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('balance')) {
        obj['balance'] = ApiClient.convertToType(data['balance'], 'Number');
      }
      if (data.hasOwnProperty('wallet_id')) {
        obj['wallet_id'] = ApiClient.convertToType(data['wallet_id'], 'String');
      }
      if (data.hasOwnProperty('currency_id')) {
        obj['currency_id'] = ApiClient.convertToType(data['currency_id'], 'String');
      }
      if (data.hasOwnProperty('create_date')) {
        obj['create_date'] = ApiClient.convertToType(data['create_date'], 'String');
      }
      if (data.hasOwnProperty('update_date')) {
        obj['update_date'] = ApiClient.convertToType(data['update_date'], 'String');
      }
    }
    return obj;
  }

  /**
   * ID of the currency balance
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * Currency balance of the wallet
   * @member {Number} balance
   */
  exports.prototype['balance'] = undefined;
  /**
   * The ID of the associated wallet
   * @member {String} wallet_id
   */
  exports.prototype['wallet_id'] = undefined;
  /**
   * The ID of the currency.
   * @member {String} currency_id
   */
  exports.prototype['currency_id'] = undefined;
  /**
   * Datetime the currency balance record was created
   * @member {String} create_date
   */
  exports.prototype['create_date'] = undefined;
  /**
   * Datetime the currency balance record was updated
   * @member {String} update_date
   */
  exports.prototype['update_date'] = undefined;



  return exports;
}));


