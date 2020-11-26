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
    define(['ApiClient', 'model/SecurityCompositionVO', 'model/SecurityCountryVO'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./SecurityCompositionVO'), require('./SecurityCountryVO'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenNucleusApi) {
      root.HydrogenNucleusApi = {};
    }
    root.HydrogenNucleusApi.AllocationCompositionModelHoldingsVO = factory(root.HydrogenNucleusApi.ApiClient, root.HydrogenNucleusApi.SecurityCompositionVO, root.HydrogenNucleusApi.SecurityCountryVO);
  }
}(this, function(ApiClient, SecurityCompositionVO, SecurityCountryVO) {
  'use strict';




  /**
   * The AllocationCompositionModelHoldingsVO model module.
   * @module model/AllocationCompositionModelHoldingsVO
   * @version 1.8.0
   */

  /**
   * Constructs a new <code>AllocationCompositionModelHoldingsVO</code>.
   * @alias module:model/AllocationCompositionModelHoldingsVO
   * @class
   */
  var exports = function() {
    var _this = this;
















  };

  /**
   * Constructs a <code>AllocationCompositionModelHoldingsVO</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AllocationCompositionModelHoldingsVO} obj Optional instance to populate.
   * @return {module:model/AllocationCompositionModelHoldingsVO} The populated <code>AllocationCompositionModelHoldingsVO</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('model_holding_date')) {
        obj['model_holding_date'] = ApiClient.convertToType(data['model_holding_date'], 'Date');
      }
      if (data.hasOwnProperty('model_holding_id')) {
        obj['model_holding_id'] = ApiClient.convertToType(data['model_holding_id'], 'String');
      }
      if (data.hasOwnProperty('security_asset_class')) {
        obj['security_asset_class'] = ApiClient.convertToType(data['security_asset_class'], 'String');
      }
      if (data.hasOwnProperty('security_compositions')) {
        obj['security_compositions'] = ApiClient.convertToType(data['security_compositions'], [SecurityCompositionVO]);
      }
      if (data.hasOwnProperty('security_countries')) {
        obj['security_countries'] = ApiClient.convertToType(data['security_countries'], [SecurityCountryVO]);
      }
      if (data.hasOwnProperty('security_create_date')) {
        obj['security_create_date'] = ApiClient.convertToType(data['security_create_date'], 'Date');
      }
      if (data.hasOwnProperty('security_exchange')) {
        obj['security_exchange'] = ApiClient.convertToType(data['security_exchange'], 'String');
      }
      if (data.hasOwnProperty('security_id')) {
        obj['security_id'] = ApiClient.convertToType(data['security_id'], 'String');
      }
      if (data.hasOwnProperty('security_industry')) {
        obj['security_industry'] = ApiClient.convertToType(data['security_industry'], 'String');
      }
      if (data.hasOwnProperty('security_name')) {
        obj['security_name'] = ApiClient.convertToType(data['security_name'], 'String');
      }
      if (data.hasOwnProperty('security_secondary_id')) {
        obj['security_secondary_id'] = ApiClient.convertToType(data['security_secondary_id'], 'String');
      }
      if (data.hasOwnProperty('security_sector')) {
        obj['security_sector'] = ApiClient.convertToType(data['security_sector'], 'String');
      }
      if (data.hasOwnProperty('security_security_class')) {
        obj['security_security_class'] = ApiClient.convertToType(data['security_security_class'], 'String');
      }
      if (data.hasOwnProperty('security_ticker')) {
        obj['security_ticker'] = ApiClient.convertToType(data['security_ticker'], 'String');
      }
      if (data.hasOwnProperty('security_update_date')) {
        obj['security_update_date'] = ApiClient.convertToType(data['security_update_date'], 'Date');
      }
    }
    return obj;
  }

  /**
   * @member {Date} model_holding_date
   */
  exports.prototype['model_holding_date'] = undefined;
  /**
   * @member {String} model_holding_id
   */
  exports.prototype['model_holding_id'] = undefined;
  /**
   * @member {String} security_asset_class
   */
  exports.prototype['security_asset_class'] = undefined;
  /**
   * @member {Array.<module:model/SecurityCompositionVO>} security_compositions
   */
  exports.prototype['security_compositions'] = undefined;
  /**
   * @member {Array.<module:model/SecurityCountryVO>} security_countries
   */
  exports.prototype['security_countries'] = undefined;
  /**
   * @member {Date} security_create_date
   */
  exports.prototype['security_create_date'] = undefined;
  /**
   * @member {String} security_exchange
   */
  exports.prototype['security_exchange'] = undefined;
  /**
   * @member {String} security_id
   */
  exports.prototype['security_id'] = undefined;
  /**
   * @member {String} security_industry
   */
  exports.prototype['security_industry'] = undefined;
  /**
   * @member {String} security_name
   */
  exports.prototype['security_name'] = undefined;
  /**
   * @member {String} security_secondary_id
   */
  exports.prototype['security_secondary_id'] = undefined;
  /**
   * @member {String} security_sector
   */
  exports.prototype['security_sector'] = undefined;
  /**
   * @member {String} security_security_class
   */
  exports.prototype['security_security_class'] = undefined;
  /**
   * @member {String} security_ticker
   */
  exports.prototype['security_ticker'] = undefined;
  /**
   * @member {Date} security_update_date
   */
  exports.prototype['security_update_date'] = undefined;



  return exports;
}));


