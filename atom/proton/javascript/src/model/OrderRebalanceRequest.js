/*
 * Hydrogen Proton API
 * Financial engineering module of Hydrogen Atom
 *
 * OpenAPI spec version: 1.9.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.19
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
    if (!root.HydrogenProtonApi) {
      root.HydrogenProtonApi = {};
    }
    root.HydrogenProtonApi.OrderRebalanceRequest = factory(root.HydrogenProtonApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * The OrderRebalanceRequest model module.
   * @module model/OrderRebalanceRequest
   * @version 1.9.0
   */

  /**
   * Constructs a new <code>OrderRebalanceRequest</code>.
   * @alias module:model/OrderRebalanceRequest
   * @class
   * @param orderScope {module:model/OrderRebalanceRequest.OrderScopeEnum} 
   */
  var exports = function(orderScope) {
    this.orderScope = orderScope;
  };

  /**
   * Constructs a <code>OrderRebalanceRequest</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OrderRebalanceRequest} obj Optional instance to populate.
   * @return {module:model/OrderRebalanceRequest} The populated <code>OrderRebalanceRequest</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('non_fractional'))
        obj.nonFractional = ApiClient.convertToType(data['non_fractional'], 'Boolean');
      if (data.hasOwnProperty('order_scope'))
        obj.orderScope = ApiClient.convertToType(data['order_scope'], 'String');
      if (data.hasOwnProperty('buy_threshold'))
        obj.buyThreshold = ApiClient.convertToType(data['buy_threshold'], 'Number');
      if (data.hasOwnProperty('commit_orders'))
        obj.commitOrders = ApiClient.convertToType(data['commit_orders'], 'Boolean');
      if (data.hasOwnProperty('account_id'))
        obj.accountId = ApiClient.convertToType(data['account_id'], 'String');
      if (data.hasOwnProperty('port_threshold'))
        obj.portThreshold = ApiClient.convertToType(data['port_threshold'], 'Number');
      if (data.hasOwnProperty('use_cash_available'))
        obj.useCashAvailable = ApiClient.convertToType(data['use_cash_available'], 'Boolean');
      if (data.hasOwnProperty('use_strategic'))
        obj.useStrategic = ApiClient.convertToType(data['use_strategic'], 'Boolean');
      if (data.hasOwnProperty('sell_transaction_code_id'))
        obj.sellTransactionCodeId = ApiClient.convertToType(data['sell_transaction_code_id'], 'String');
      if (data.hasOwnProperty('buy_transaction_code_id'))
        obj.buyTransactionCodeId = ApiClient.convertToType(data['buy_transaction_code_id'], 'String');
      if (data.hasOwnProperty('cash_portfolio_id'))
        obj.cashPortfolioId = ApiClient.convertToType(data['cash_portfolio_id'], 'String');
      if (data.hasOwnProperty('restrictions_on'))
        obj.restrictionsOn = ApiClient.convertToType(data['restrictions_on'], 'Boolean');
      if (data.hasOwnProperty('sell_threshold'))
        obj.sellThreshold = ApiClient.convertToType(data['sell_threshold'], 'Number');
      if (data.hasOwnProperty('portfolio_id'))
        obj.portfolioId = ApiClient.convertToType(data['portfolio_id'], 'String');
    }
    return obj;
  }

  /**
   * @member {Boolean} nonFractional
   * @default false
   */
  exports.prototype.nonFractional = false;

  /**
   * @member {module:model/OrderRebalanceRequest.OrderScopeEnum} orderScope
   */
  exports.prototype.orderScope = undefined;

  /**
   * @member {Number} buyThreshold
   * @default 0.0
   */
  exports.prototype.buyThreshold = 0.0;

  /**
   * @member {Boolean} commitOrders
   * @default true
   */
  exports.prototype.commitOrders = true;

  /**
   * @member {String} accountId
   */
  exports.prototype.accountId = undefined;

  /**
   * @member {Number} portThreshold
   * @default 0.0
   */
  exports.prototype.portThreshold = 0.0;

  /**
   * @member {Boolean} useCashAvailable
   * @default false
   */
  exports.prototype.useCashAvailable = false;

  /**
   * @member {Boolean} useStrategic
   * @default false
   */
  exports.prototype.useStrategic = false;

  /**
   * @member {String} sellTransactionCodeId
   */
  exports.prototype.sellTransactionCodeId = undefined;

  /**
   * @member {String} buyTransactionCodeId
   */
  exports.prototype.buyTransactionCodeId = undefined;

  /**
   * @member {String} cashPortfolioId
   */
  exports.prototype.cashPortfolioId = undefined;

  /**
   * @member {Boolean} restrictionsOn
   * @default false
   */
  exports.prototype.restrictionsOn = false;

  /**
   * @member {Number} sellThreshold
   * @default 0.0
   */
  exports.prototype.sellThreshold = 0.0;

  /**
   * @member {String} portfolioId
   */
  exports.prototype.portfolioId = undefined;



  /**
   * Allowed values for the <code>orderScope</code> property.
   * @enum {String}
   * @readonly
   */
  exports.OrderScopeEnum = {
    /**
     * value: "all"
     * @const
     */
    all: "all",

    /**
     * value: "buy_only"
     * @const
     */
    buyOnly: "buy_only",

    /**
     * value: "sell_only"
     * @const
     */
    sellOnly: "sell_only"
  };

  return exports;

}));