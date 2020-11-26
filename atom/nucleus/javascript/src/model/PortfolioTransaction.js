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
    define(['ApiClient', 'model/Check', 'model/Location'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./Check'), require('./Location'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenNucleusApi) {
      root.HydrogenNucleusApi = {};
    }
    root.HydrogenNucleusApi.PortfolioTransaction = factory(root.HydrogenNucleusApi.ApiClient, root.HydrogenNucleusApi.Check, root.HydrogenNucleusApi.Location);
  }
}(this, function(ApiClient, Check, Location) {
  'use strict';




  /**
   * The PortfolioTransaction model module.
   * @module model/PortfolioTransaction
   * @version 1.8.0
   */

  /**
   * Constructs a new <code>PortfolioTransaction</code>.
   * PortfolioTransaction Object
   * @alias module:model/PortfolioTransaction
   * @class
   * @param accountId {String} accountId
   * @param _date {Date} date
   * @param modelId {String} modelId
   * @param portfolioId {String} portfolioId
   * @param transactionCodeId {String} alertId
   */
  var exports = function(accountId, _date, modelId, portfolioId, transactionCodeId) {
    var _this = this;

    _this['account_id'] = accountId;






    _this['date'] = _date;










    _this['model_id'] = modelId;
    _this['portfolio_id'] = portfolioId;






    _this['transaction_code_id'] = transactionCodeId;

  };

  /**
   * Constructs a <code>PortfolioTransaction</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PortfolioTransaction} obj Optional instance to populate.
   * @return {module:model/PortfolioTransaction} The populated <code>PortfolioTransaction</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('account_id')) {
        obj['account_id'] = ApiClient.convertToType(data['account_id'], 'String');
      }
      if (data.hasOwnProperty('amount')) {
        obj['amount'] = ApiClient.convertToType(data['amount'], 'Number');
      }
      if (data.hasOwnProperty('balance')) {
        obj['balance'] = ApiClient.convertToType(data['balance'], 'Number');
      }
      if (data.hasOwnProperty('category')) {
        obj['category'] = ApiClient.convertToType(data['category'], 'String');
      }
      if (data.hasOwnProperty('check')) {
        obj['check'] = Check.constructFromObject(data['check']);
      }
      if (data.hasOwnProperty('create_date')) {
        obj['create_date'] = ApiClient.convertToType(data['create_date'], 'Date');
      }
      if (data.hasOwnProperty('currency_code')) {
        obj['currency_code'] = ApiClient.convertToType(data['currency_code'], 'String');
      }
      if (data.hasOwnProperty('date')) {
        obj['date'] = ApiClient.convertToType(data['date'], 'Date');
      }
      if (data.hasOwnProperty('date_available')) {
        obj['date_available'] = ApiClient.convertToType(data['date_available'], 'Date');
      }
      if (data.hasOwnProperty('description')) {
        obj['description'] = ApiClient.convertToType(data['description'], 'String');
      }
      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('is_cleansed')) {
        obj['is_cleansed'] = ApiClient.convertToType(data['is_cleansed'], 'Boolean');
      }
      if (data.hasOwnProperty('is_read')) {
        obj['is_read'] = ApiClient.convertToType(data['is_read'], 'Boolean');
      }
      if (data.hasOwnProperty('is_recurring')) {
        obj['is_recurring'] = ApiClient.convertToType(data['is_recurring'], 'Boolean');
      }
      if (data.hasOwnProperty('location')) {
        obj['location'] = Location.constructFromObject(data['location']);
      }
      if (data.hasOwnProperty('memo')) {
        obj['memo'] = ApiClient.convertToType(data['memo'], 'String');
      }
      if (data.hasOwnProperty('merchant')) {
        obj['merchant'] = ApiClient.convertToType(data['merchant'], 'String');
      }
      if (data.hasOwnProperty('merchant_category_code')) {
        obj['merchant_category_code'] = ApiClient.convertToType(data['merchant_category_code'], 'Number');
      }
      if (data.hasOwnProperty('model_id')) {
        obj['model_id'] = ApiClient.convertToType(data['model_id'], 'String');
      }
      if (data.hasOwnProperty('portfolio_id')) {
        obj['portfolio_id'] = ApiClient.convertToType(data['portfolio_id'], 'String');
      }
      if (data.hasOwnProperty('price')) {
        obj['price'] = ApiClient.convertToType(data['price'], 'Number');
      }
      if (data.hasOwnProperty('quantity')) {
        obj['quantity'] = ApiClient.convertToType(data['quantity'], 'Number');
      }
      if (data.hasOwnProperty('secondary_id')) {
        obj['secondary_id'] = ApiClient.convertToType(data['secondary_id'], 'String');
      }
      if (data.hasOwnProperty('security_id')) {
        obj['security_id'] = ApiClient.convertToType(data['security_id'], 'String');
      }
      if (data.hasOwnProperty('status')) {
        obj['status'] = ApiClient.convertToType(data['status'], 'String');
      }
      if (data.hasOwnProperty('subcategory')) {
        obj['subcategory'] = ApiClient.convertToType(data['subcategory'], 'String');
      }
      if (data.hasOwnProperty('transaction_code_id')) {
        obj['transaction_code_id'] = ApiClient.convertToType(data['transaction_code_id'], 'String');
      }
      if (data.hasOwnProperty('update_date')) {
        obj['update_date'] = ApiClient.convertToType(data['update_date'], 'Date');
      }
    }
    return obj;
  }

  /**
   * accountId
   * @member {String} account_id
   */
  exports.prototype['account_id'] = undefined;
  /**
   * amount
   * @member {Number} amount
   */
  exports.prototype['amount'] = undefined;
  /**
   * balance
   * @member {Number} balance
   */
  exports.prototype['balance'] = undefined;
  /**
   * category
   * @member {String} category
   */
  exports.prototype['category'] = undefined;
  /**
   * @member {module:model/Check} check
   */
  exports.prototype['check'] = undefined;
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
   * date
   * @member {Date} date
   */
  exports.prototype['date'] = undefined;
  /**
   * dateAvailable
   * @member {Date} date_available
   */
  exports.prototype['date_available'] = undefined;
  /**
   * description
   * @member {String} description
   */
  exports.prototype['description'] = undefined;
  /**
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * is_cleansed
   * @member {Boolean} is_cleansed
   */
  exports.prototype['is_cleansed'] = undefined;
  /**
   * isRead
   * @member {Boolean} is_read
   */
  exports.prototype['is_read'] = undefined;
  /**
   * is_recurring
   * @member {Boolean} is_recurring
   */
  exports.prototype['is_recurring'] = undefined;
  /**
   * location
   * @member {module:model/Location} location
   */
  exports.prototype['location'] = undefined;
  /**
   * memo
   * @member {String} memo
   */
  exports.prototype['memo'] = undefined;
  /**
   * merchant
   * @member {String} merchant
   */
  exports.prototype['merchant'] = undefined;
  /**
   * merchant_category_code
   * @member {Number} merchant_category_code
   */
  exports.prototype['merchant_category_code'] = undefined;
  /**
   * modelId
   * @member {String} model_id
   */
  exports.prototype['model_id'] = undefined;
  /**
   * portfolioId
   * @member {String} portfolio_id
   */
  exports.prototype['portfolio_id'] = undefined;
  /**
   * price
   * @member {Number} price
   */
  exports.prototype['price'] = undefined;
  /**
   * quantity
   * @member {Number} quantity
   */
  exports.prototype['quantity'] = undefined;
  /**
   * @member {String} secondary_id
   */
  exports.prototype['secondary_id'] = undefined;
  /**
   * securityId
   * @member {String} security_id
   */
  exports.prototype['security_id'] = undefined;
  /**
   * status
   * @member {String} status
   */
  exports.prototype['status'] = undefined;
  /**
   * subcategory
   * @member {String} subcategory
   */
  exports.prototype['subcategory'] = undefined;
  /**
   * alertId
   * @member {String} transaction_code_id
   */
  exports.prototype['transaction_code_id'] = undefined;
  /**
   * @member {Date} update_date
   */
  exports.prototype['update_date'] = undefined;



  return exports;
}));


