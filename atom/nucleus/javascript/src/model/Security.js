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
    define(['ApiClient', 'model/SecuritiesComposition', 'model/SecuritiesCountry'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./SecuritiesComposition'), require('./SecuritiesCountry'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenNucleusApi) {
      root.HydrogenNucleusApi = {};
    }
    root.HydrogenNucleusApi.Security = factory(root.HydrogenNucleusApi.ApiClient, root.HydrogenNucleusApi.SecuritiesComposition, root.HydrogenNucleusApi.SecuritiesCountry);
  }
}(this, function(ApiClient, SecuritiesComposition, SecuritiesCountry) {
  'use strict';




  /**
   * The Security model module.
   * @module model/Security
   * @version 1.8.0
   */

  /**
   * Constructs a new <code>Security</code>.
   * @alias module:model/Security
   * @class
   * @param name {String} Security name
   * @param ticker {String} Security ticker
   */
  var exports = function(name, ticker) {
    var _this = this;












    _this['name'] = name;






    _this['ticker'] = ticker;



  };

  /**
   * Constructs a <code>Security</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Security} obj Optional instance to populate.
   * @return {module:model/Security} The populated <code>Security</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('asset_class')) {
        obj['asset_class'] = ApiClient.convertToType(data['asset_class'], 'String');
      }
      if (data.hasOwnProperty('category')) {
        obj['category'] = ApiClient.convertToType(data['category'], 'String');
      }
      if (data.hasOwnProperty('create_date')) {
        obj['create_date'] = ApiClient.convertToType(data['create_date'], 'Date');
      }
      if (data.hasOwnProperty('currency_code')) {
        obj['currency_code'] = ApiClient.convertToType(data['currency_code'], 'String');
      }
      if (data.hasOwnProperty('cusip')) {
        obj['cusip'] = ApiClient.convertToType(data['cusip'], 'String');
      }
      if (data.hasOwnProperty('exchange')) {
        obj['exchange'] = ApiClient.convertToType(data['exchange'], 'String');
      }
      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('industry')) {
        obj['industry'] = ApiClient.convertToType(data['industry'], 'String');
      }
      if (data.hasOwnProperty('is_active')) {
        obj['is_active'] = ApiClient.convertToType(data['is_active'], 'Boolean');
      }
      if (data.hasOwnProperty('isin')) {
        obj['isin'] = ApiClient.convertToType(data['isin'], 'String');
      }
      if (data.hasOwnProperty('metadata')) {
        obj['metadata'] = ApiClient.convertToType(data['metadata'], {'String': 'String'});
      }
      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }
      if (data.hasOwnProperty('proxy_id')) {
        obj['proxy_id'] = ApiClient.convertToType(data['proxy_id'], 'String');
      }
      if (data.hasOwnProperty('secondary_id')) {
        obj['secondary_id'] = ApiClient.convertToType(data['secondary_id'], 'String');
      }
      if (data.hasOwnProperty('sector')) {
        obj['sector'] = ApiClient.convertToType(data['sector'], 'String');
      }
      if (data.hasOwnProperty('security_class')) {
        obj['security_class'] = ApiClient.convertToType(data['security_class'], 'String');
      }
      if (data.hasOwnProperty('security_composition')) {
        obj['security_composition'] = ApiClient.convertToType(data['security_composition'], [SecuritiesComposition]);
      }
      if (data.hasOwnProperty('security_country')) {
        obj['security_country'] = ApiClient.convertToType(data['security_country'], [SecuritiesCountry]);
      }
      if (data.hasOwnProperty('ticker')) {
        obj['ticker'] = ApiClient.convertToType(data['ticker'], 'String');
      }
      if (data.hasOwnProperty('total_expense_ratio')) {
        obj['total_expense_ratio'] = ApiClient.convertToType(data['total_expense_ratio'], 'Number');
      }
      if (data.hasOwnProperty('type')) {
        obj['type'] = ApiClient.convertToType(data['type'], 'String');
      }
      if (data.hasOwnProperty('update_date')) {
        obj['update_date'] = ApiClient.convertToType(data['update_date'], 'Date');
      }
    }
    return obj;
  }

  /**
   * Security asset class
   * @member {String} asset_class
   */
  exports.prototype['asset_class'] = undefined;
  /**
   * Security category
   * @member {String} category
   */
  exports.prototype['category'] = undefined;
  /**
   * @member {Date} create_date
   */
  exports.prototype['create_date'] = undefined;
  /**
   * currency_code
   * @member {String} currency_code
   */
  exports.prototype['currency_code'] = undefined;
  /**
   * cusip
   * @member {String} cusip
   */
  exports.prototype['cusip'] = undefined;
  /**
   * Security exchange
   * @member {String} exchange
   */
  exports.prototype['exchange'] = undefined;
  /**
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * Security industry
   * @member {String} industry
   */
  exports.prototype['industry'] = undefined;
  /**
   * Security is active
   * @member {Boolean} is_active
   */
  exports.prototype['is_active'] = undefined;
  /**
   * isin
   * @member {String} isin
   */
  exports.prototype['isin'] = undefined;
  /**
   * metadata
   * @member {Object.<String, String>} metadata
   */
  exports.prototype['metadata'] = undefined;
  /**
   * Security name
   * @member {String} name
   */
  exports.prototype['name'] = undefined;
  /**
   * proxy_id
   * @member {String} proxy_id
   */
  exports.prototype['proxy_id'] = undefined;
  /**
   * @member {String} secondary_id
   */
  exports.prototype['secondary_id'] = undefined;
  /**
   * Security sector
   * @member {String} sector
   */
  exports.prototype['sector'] = undefined;
  /**
   * Security class
   * @member {String} security_class
   */
  exports.prototype['security_class'] = undefined;
  /**
   * @member {Array.<module:model/SecuritiesComposition>} security_composition
   */
  exports.prototype['security_composition'] = undefined;
  /**
   * @member {Array.<module:model/SecuritiesCountry>} security_country
   */
  exports.prototype['security_country'] = undefined;
  /**
   * Security ticker
   * @member {String} ticker
   */
  exports.prototype['ticker'] = undefined;
  /**
   * total_expense_ratio
   * @member {Number} total_expense_ratio
   */
  exports.prototype['total_expense_ratio'] = undefined;
  /**
   * Security type
   * @member {String} type
   */
  exports.prototype['type'] = undefined;
  /**
   * @member {Date} update_date
   */
  exports.prototype['update_date'] = undefined;



  return exports;
}));


