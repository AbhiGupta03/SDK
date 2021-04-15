/*
 * Hydrogen Integration API
 * The Hydrogen Integration API
 *
 * OpenAPI spec version: 1.2.1
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.18
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
    root.HydrogenIntegrationApi.CustomerRevenue = factory(root.HydrogenIntegrationApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * The CustomerRevenue model module.
   * @module model/CustomerRevenue
   * @version 1.2.1
   */

  /**
   * Constructs a new <code>CustomerRevenue</code>.
   * Customer Revenue Object
   * @alias module:model/CustomerRevenue
   * @class
   * @param accountingMethod {String} accounting_method
   * @param currencyCode {String} currency_code
   * @param customerId {String} customerId
   * @param _date {Date} date
   * @param revenue {Number} revenue
   */
  var exports = function(accountingMethod, currencyCode, customerId, _date, revenue) {
    this.accountingMethod = accountingMethod;
    this.currencyCode = currencyCode;
    this.customerId = customerId;
    this._date = _date;
    this.revenue = revenue;
  };

  /**
   * Constructs a <code>CustomerRevenue</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CustomerRevenue} obj Optional instance to populate.
   * @return {module:model/CustomerRevenue} The populated <code>CustomerRevenue</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('accounting_method'))
        obj.accountingMethod = ApiClient.convertToType(data['accounting_method'], 'String');
      if (data.hasOwnProperty('create_date'))
        obj.createDate = ApiClient.convertToType(data['create_date'], 'Date');
      if (data.hasOwnProperty('currency_code'))
        obj.currencyCode = ApiClient.convertToType(data['currency_code'], 'String');
      if (data.hasOwnProperty('customer_id'))
        obj.customerId = ApiClient.convertToType(data['customer_id'], 'String');
      if (data.hasOwnProperty('date'))
        obj._date = ApiClient.convertToType(data['date'], 'Date');
      if (data.hasOwnProperty('id'))
        obj.id = ApiClient.convertToType(data['id'], 'String');
      if (data.hasOwnProperty('revenue'))
        obj.revenue = ApiClient.convertToType(data['revenue'], 'Number');
      if (data.hasOwnProperty('secondary_id'))
        obj.secondaryId = ApiClient.convertToType(data['secondary_id'], 'String');
      if (data.hasOwnProperty('update_date'))
        obj.updateDate = ApiClient.convertToType(data['update_date'], 'Date');
    }
    return obj;
  }

  /**
   * accounting_method
   * @member {String} accountingMethod
   */
  exports.prototype.accountingMethod = undefined;

  /**
   * @member {Date} createDate
   */
  exports.prototype.createDate = undefined;

  /**
   * currency_code
   * @member {String} currencyCode
   */
  exports.prototype.currencyCode = undefined;

  /**
   * customerId
   * @member {String} customerId
   */
  exports.prototype.customerId = undefined;

  /**
   * date
   * @member {Date} _date
   */
  exports.prototype._date = undefined;

  /**
   * @member {String} id
   */
  exports.prototype.id = undefined;

  /**
   * revenue
   * @member {Number} revenue
   */
  exports.prototype.revenue = undefined;

  /**
   * @member {String} secondaryId
   */
  exports.prototype.secondaryId = undefined;

  /**
   * @member {Date} updateDate
   */
  exports.prototype.updateDate = undefined;


  return exports;

}));