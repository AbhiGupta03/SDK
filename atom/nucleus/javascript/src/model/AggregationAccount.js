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
    root.HydrogenNucleusApi.AggregationAccount = factory(root.HydrogenNucleusApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The AggregationAccount model module.
   * @module model/AggregationAccount
   * @version 1.8.0
   */

  /**
   * Constructs a new <code>AggregationAccount</code>.
   * Aggregation Account Object
   * @alias module:model/AggregationAccount
   * @class
   * @param accountName {String} accountName
   * @param category {String} category
   * @param clientId {String} clientId
   * @param institutionName {String} institutionName
   */
  var exports = function(accountName, category, clientId, institutionName) {
    var _this = this;


    _this['account_name'] = accountName;


    _this['category'] = category;
    _this['client_id'] = clientId;




    _this['institution_name'] = institutionName;












  };

  /**
   * Constructs a <code>AggregationAccount</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AggregationAccount} obj Optional instance to populate.
   * @return {module:model/AggregationAccount} The populated <code>AggregationAccount</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('account_holder')) {
        obj['account_holder'] = ApiClient.convertToType(data['account_holder'], 'String');
      }
      if (data.hasOwnProperty('account_name')) {
        obj['account_name'] = ApiClient.convertToType(data['account_name'], 'String');
      }
      if (data.hasOwnProperty('account_number')) {
        obj['account_number'] = ApiClient.convertToType(data['account_number'], 'String');
      }
      if (data.hasOwnProperty('bank_link_id')) {
        obj['bank_link_id'] = ApiClient.convertToType(data['bank_link_id'], 'String');
      }
      if (data.hasOwnProperty('category')) {
        obj['category'] = ApiClient.convertToType(data['category'], 'String');
      }
      if (data.hasOwnProperty('client_id')) {
        obj['client_id'] = ApiClient.convertToType(data['client_id'], 'String');
      }
      if (data.hasOwnProperty('create_date')) {
        obj['create_date'] = ApiClient.convertToType(data['create_date'], 'Date');
      }
      if (data.hasOwnProperty('currency_code')) {
        obj['currency_code'] = ApiClient.convertToType(data['currency_code'], 'String');
      }
      if (data.hasOwnProperty('financial_offer_id')) {
        obj['financial_offer_id'] = ApiClient.convertToType(data['financial_offer_id'], 'String');
      }
      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('institution_name')) {
        obj['institution_name'] = ApiClient.convertToType(data['institution_name'], 'String');
      }
      if (data.hasOwnProperty('is_active')) {
        obj['is_active'] = ApiClient.convertToType(data['is_active'], 'Boolean');
      }
      if (data.hasOwnProperty('is_asset')) {
        obj['is_asset'] = ApiClient.convertToType(data['is_asset'], 'Boolean');
      }
      if (data.hasOwnProperty('is_business')) {
        obj['is_business'] = ApiClient.convertToType(data['is_business'], 'Boolean');
      }
      if (data.hasOwnProperty('is_cash')) {
        obj['is_cash'] = ApiClient.convertToType(data['is_cash'], 'Boolean');
      }
      if (data.hasOwnProperty('is_investment')) {
        obj['is_investment'] = ApiClient.convertToType(data['is_investment'], 'Boolean');
      }
      if (data.hasOwnProperty('is_link_verified')) {
        obj['is_link_verified'] = ApiClient.convertToType(data['is_link_verified'], 'Boolean');
      }
      if (data.hasOwnProperty('is_manual')) {
        obj['is_manual'] = ApiClient.convertToType(data['is_manual'], 'Boolean');
      }
      if (data.hasOwnProperty('mask')) {
        obj['mask'] = ApiClient.convertToType(data['mask'], 'String');
      }
      if (data.hasOwnProperty('metadata')) {
        obj['metadata'] = ApiClient.convertToType(data['metadata'], {'String': 'String'});
      }
      if (data.hasOwnProperty('secondary_id')) {
        obj['secondary_id'] = ApiClient.convertToType(data['secondary_id'], 'String');
      }
      if (data.hasOwnProperty('subcategory')) {
        obj['subcategory'] = ApiClient.convertToType(data['subcategory'], 'String');
      }
      if (data.hasOwnProperty('update_date')) {
        obj['update_date'] = ApiClient.convertToType(data['update_date'], 'Date');
      }
    }
    return obj;
  }

  /**
   * accountHolder
   * @member {String} account_holder
   */
  exports.prototype['account_holder'] = undefined;
  /**
   * accountName
   * @member {String} account_name
   */
  exports.prototype['account_name'] = undefined;
  /**
   * accountNumber
   * @member {String} account_number
   */
  exports.prototype['account_number'] = undefined;
  /**
   * bankLinkId
   * @member {String} bank_link_id
   */
  exports.prototype['bank_link_id'] = undefined;
  /**
   * category
   * @member {String} category
   */
  exports.prototype['category'] = undefined;
  /**
   * clientId
   * @member {String} client_id
   */
  exports.prototype['client_id'] = undefined;
  /**
   * @member {Date} create_date
   */
  exports.prototype['create_date'] = undefined;
  /**
   * currencyCode
   * @member {String} currency_code
   */
  exports.prototype['currency_code'] = undefined;
  /**
   * financialOfferId
   * @member {String} financial_offer_id
   */
  exports.prototype['financial_offer_id'] = undefined;
  /**
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * institutionName
   * @member {String} institution_name
   */
  exports.prototype['institution_name'] = undefined;
  /**
   * isActive
   * @member {Boolean} is_active
   */
  exports.prototype['is_active'] = undefined;
  /**
   * isAsset
   * @member {Boolean} is_asset
   */
  exports.prototype['is_asset'] = undefined;
  /**
   * isBusiness
   * @member {Boolean} is_business
   */
  exports.prototype['is_business'] = undefined;
  /**
   * isCash
   * @member {Boolean} is_cash
   */
  exports.prototype['is_cash'] = undefined;
  /**
   * isInvestment
   * @member {Boolean} is_investment
   */
  exports.prototype['is_investment'] = undefined;
  /**
   * isLinkVerified
   * @member {Boolean} is_link_verified
   */
  exports.prototype['is_link_verified'] = undefined;
  /**
   * isManual
   * @member {Boolean} is_manual
   */
  exports.prototype['is_manual'] = undefined;
  /**
   * mask
   * @member {String} mask
   */
  exports.prototype['mask'] = undefined;
  /**
   * @member {Object.<String, String>} metadata
   */
  exports.prototype['metadata'] = undefined;
  /**
   * @member {String} secondary_id
   */
  exports.prototype['secondary_id'] = undefined;
  /**
   * subcategory
   * @member {String} subcategory
   */
  exports.prototype['subcategory'] = undefined;
  /**
   * @member {Date} update_date
   */
  exports.prototype['update_date'] = undefined;



  return exports;
}));


