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
    root.HydrogenNucleusApi.LineItems = factory(root.HydrogenNucleusApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The LineItems model module.
   * @module model/LineItems
   * @version 1.8.0
   */

  /**
   * Constructs a new <code>LineItems</code>.
   * LineItems Object
   * @alias module:model/LineItems
   * @class
   * @param amount {Number} amount
   * @param currencyCode {String} currency_code
   * @param description {String} description
   * @param quantity {Number} quantity
   * @param rate {Number} rate
   */
  var exports = function(amount, currencyCode, description, quantity, rate) {
    var _this = this;

    _this['amount'] = amount;
    _this['currency_code'] = currencyCode;
    _this['description'] = description;

    _this['quantity'] = quantity;
    _this['rate'] = rate;


  };

  /**
   * Constructs a <code>LineItems</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/LineItems} obj Optional instance to populate.
   * @return {module:model/LineItems} The populated <code>LineItems</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('amount')) {
        obj['amount'] = ApiClient.convertToType(data['amount'], 'Number');
      }
      if (data.hasOwnProperty('currency_code')) {
        obj['currency_code'] = ApiClient.convertToType(data['currency_code'], 'String');
      }
      if (data.hasOwnProperty('description')) {
        obj['description'] = ApiClient.convertToType(data['description'], 'String');
      }
      if (data.hasOwnProperty('line_item_id')) {
        obj['line_item_id'] = ApiClient.convertToType(data['line_item_id'], 'String');
      }
      if (data.hasOwnProperty('quantity')) {
        obj['quantity'] = ApiClient.convertToType(data['quantity'], 'Number');
      }
      if (data.hasOwnProperty('rate')) {
        obj['rate'] = ApiClient.convertToType(data['rate'], 'Number');
      }
      if (data.hasOwnProperty('subtotal')) {
        obj['subtotal'] = ApiClient.convertToType(data['subtotal'], 'Number');
      }
      if (data.hasOwnProperty('tax')) {
        obj['tax'] = ApiClient.convertToType(data['tax'], 'Number');
      }
    }
    return obj;
  }

  /**
   * amount
   * @member {Number} amount
   */
  exports.prototype['amount'] = undefined;
  /**
   * currency_code
   * @member {String} currency_code
   */
  exports.prototype['currency_code'] = undefined;
  /**
   * description
   * @member {String} description
   */
  exports.prototype['description'] = undefined;
  /**
   * lineItemId
   * @member {String} line_item_id
   */
  exports.prototype['line_item_id'] = undefined;
  /**
   * quantity
   * @member {Number} quantity
   */
  exports.prototype['quantity'] = undefined;
  /**
   * rate
   * @member {Number} rate
   */
  exports.prototype['rate'] = undefined;
  /**
   * subtotal
   * @member {Number} subtotal
   */
  exports.prototype['subtotal'] = undefined;
  /**
   * tax
   * @member {Number} tax
   */
  exports.prototype['tax'] = undefined;



  return exports;
}));


