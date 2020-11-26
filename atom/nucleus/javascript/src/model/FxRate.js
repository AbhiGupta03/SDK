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
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenNucleusApi) {
      root.HydrogenNucleusApi = {};
    }
    root.HydrogenNucleusApi.FxRate = factory(root.HydrogenNucleusApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The FxRate model module.
   * @module model/FxRate
   * @version 1.8.0
   */

  /**
   * Constructs a new <code>FxRate</code>.
   * FxRate Object
   * @alias module:model/FxRate
   * @class
   * @param currencyCodeFrom {String} currency_code_from
   * @param currencyCodeTo {String} currency_code_to
   * @param _date {Date} date
   * @param exchangeRate {Number} exchangeRate
   */
  var exports = function(currencyCodeFrom, currencyCodeTo, _date, exchangeRate) {
    var _this = this;

    _this['currency_code_from'] = currencyCodeFrom;
    _this['currency_code_to'] = currencyCodeTo;
    _this['date'] = _date;
    _this['exchange_rate'] = exchangeRate;
  };

  /**
   * Constructs a <code>FxRate</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FxRate} obj Optional instance to populate.
   * @return {module:model/FxRate} The populated <code>FxRate</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('currency_code_from')) {
        obj['currency_code_from'] = ApiClient.convertToType(data['currency_code_from'], 'String');
      }
      if (data.hasOwnProperty('currency_code_to')) {
        obj['currency_code_to'] = ApiClient.convertToType(data['currency_code_to'], 'String');
      }
      if (data.hasOwnProperty('date')) {
        obj['date'] = ApiClient.convertToType(data['date'], 'Date');
      }
      if (data.hasOwnProperty('exchange_rate')) {
        obj['exchange_rate'] = ApiClient.convertToType(data['exchange_rate'], 'Number');
      }
    }
    return obj;
  }

  /**
   * currency_code_from
   * @member {String} currency_code_from
   */
  exports.prototype['currency_code_from'] = undefined;
  /**
   * currency_code_to
   * @member {String} currency_code_to
   */
  exports.prototype['currency_code_to'] = undefined;
  /**
   * date
   * @member {Date} date
   */
  exports.prototype['date'] = undefined;
  /**
   * exchangeRate
   * @member {Number} exchange_rate
   */
  exports.prototype['exchange_rate'] = undefined;



  return exports;
}));


