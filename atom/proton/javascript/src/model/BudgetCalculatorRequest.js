/*
 * Hydrogen Proton API
 * Financial engineering module of Hydrogen Atom
 *
 * OpenAPI spec version: 1.9.1
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
    define(['ApiClient', 'model/BudgetDetails'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./BudgetDetails'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenProtonApi) {
      root.HydrogenProtonApi = {};
    }
    root.HydrogenProtonApi.BudgetCalculatorRequest = factory(root.HydrogenProtonApi.ApiClient, root.HydrogenProtonApi.BudgetDetails);
  }
}(this, function(ApiClient, BudgetDetails) {
  'use strict';

  /**
   * The BudgetCalculatorRequest model module.
   * @module model/BudgetCalculatorRequest
   * @version 1.9.1
   */

  /**
   * Constructs a new <code>BudgetCalculatorRequest</code>.
   * @alias module:model/BudgetCalculatorRequest
   * @class
   */
  var exports = function() {
  };

  /**
   * Constructs a <code>BudgetCalculatorRequest</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/BudgetCalculatorRequest} obj Optional instance to populate.
   * @return {module:model/BudgetCalculatorRequest} The populated <code>BudgetCalculatorRequest</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('scope'))
        obj.scope = ApiClient.convertToType(data['scope'], 'String');
      if (data.hasOwnProperty('currency_conversion'))
        obj.currencyConversion = ApiClient.convertToType(data['currency_conversion'], 'String');
      if (data.hasOwnProperty('relative_lookback'))
        obj.relativeLookback = ApiClient.convertToType(data['relative_lookback'], 'Boolean');
      if (data.hasOwnProperty('budget_id'))
        obj.budgetId = ApiClient.convertToType(data['budget_id'], 'String');
      if (data.hasOwnProperty('as_of_date'))
        obj.asOfDate = ApiClient.convertToType(data['as_of_date'], 'Date');
      if (data.hasOwnProperty('show_average_spend'))
        obj.showAverageSpend = ApiClient.convertToType(data['show_average_spend'], 'Boolean');
      if (data.hasOwnProperty('lookback_periods'))
        obj.lookbackPeriods = ApiClient.convertToType(data['lookback_periods'], 'Number');
      if (data.hasOwnProperty('budget_details'))
        obj.budgetDetails = BudgetDetails.constructFromObject(data['budget_details']);
      if (data.hasOwnProperty('transaction_status_scope'))
        obj.transactionStatusScope = ApiClient.convertToType(data['transaction_status_scope'], ['String']);
      if (data.hasOwnProperty('only_cleansed'))
        obj.onlyCleansed = ApiClient.convertToType(data['only_cleansed'], 'Boolean');
      if (data.hasOwnProperty('show_budget_track'))
        obj.showBudgetTrack = ApiClient.convertToType(data['show_budget_track'], 'Boolean');
    }
    return obj;
  }

  /**
   * @member {module:model/BudgetCalculatorRequest.ScopeEnum} scope
   * @default 'all'
   */
  exports.prototype.scope = 'all';

  /**
   * @member {String} currencyConversion
   */
  exports.prototype.currencyConversion = undefined;

  /**
   * @member {Boolean} relativeLookback
   * @default true
   */
  exports.prototype.relativeLookback = true;

  /**
   * @member {String} budgetId
   */
  exports.prototype.budgetId = undefined;

  /**
   * @member {Date} asOfDate
   */
  exports.prototype.asOfDate = undefined;

  /**
   * @member {Boolean} showAverageSpend
   * @default false
   */
  exports.prototype.showAverageSpend = false;

  /**
   * @member {Number} lookbackPeriods
   * @default 1
   */
  exports.prototype.lookbackPeriods = 1;

  /**
   * @member {module:model/BudgetDetails} budgetDetails
   */
  exports.prototype.budgetDetails = undefined;

  /**
   * @member {Array.<String>} transactionStatusScope
   */
  exports.prototype.transactionStatusScope = undefined;

  /**
   * @member {Boolean} onlyCleansed
   * @default false
   */
  exports.prototype.onlyCleansed = false;

  /**
   * @member {Boolean} showBudgetTrack
   * @default true
   */
  exports.prototype.showBudgetTrack = true;



  /**
   * Allowed values for the <code>scope</code> property.
   * @enum {String}
   * @readonly
   */
  exports.ScopeEnum = {
    /**
     * value: "all"
     * @const
     */
    all: "all",

    /**
     * value: "external"
     * @const
     */
    external: "external",

    /**
     * value: "internal"
     * @const
     */
    internal: "internal"
  };

  return exports;

}));
