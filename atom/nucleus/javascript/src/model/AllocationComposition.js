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
    root.HydrogenNucleusApi.AllocationComposition = factory(root.HydrogenNucleusApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The AllocationComposition model module.
   * @module model/AllocationComposition
   * @version 1.8.0
   */

  /**
   * Constructs a new <code>AllocationComposition</code>.
   * @alias module:model/AllocationComposition
   * @class
   * @param allocationId {String} allocationId
   * @param currentWeight {Number} currentWeight
   * @param _date {Date} date
   * @param modelId {String} modelId
   * @param strategicWeight {Number} strategicWeight
   */
  var exports = function(allocationId, currentWeight, _date, modelId, strategicWeight) {
    var _this = this;

    _this['allocation_id'] = allocationId;


    _this['current_weight'] = currentWeight;
    _this['date'] = _date;


    _this['model_id'] = modelId;

    _this['strategic_weight'] = strategicWeight;

  };

  /**
   * Constructs a <code>AllocationComposition</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AllocationComposition} obj Optional instance to populate.
   * @return {module:model/AllocationComposition} The populated <code>AllocationComposition</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('allocation_id')) {
        obj['allocation_id'] = ApiClient.convertToType(data['allocation_id'], 'String');
      }
      if (data.hasOwnProperty('core')) {
        obj['core'] = ApiClient.convertToType(data['core'], 'Boolean');
      }
      if (data.hasOwnProperty('create_date')) {
        obj['create_date'] = ApiClient.convertToType(data['create_date'], 'Date');
      }
      if (data.hasOwnProperty('current_weight')) {
        obj['current_weight'] = ApiClient.convertToType(data['current_weight'], 'Number');
      }
      if (data.hasOwnProperty('date')) {
        obj['date'] = ApiClient.convertToType(data['date'], 'Date');
      }
      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('metadata')) {
        obj['metadata'] = ApiClient.convertToType(data['metadata'], {'String': 'String'});
      }
      if (data.hasOwnProperty('model_id')) {
        obj['model_id'] = ApiClient.convertToType(data['model_id'], 'String');
      }
      if (data.hasOwnProperty('secondary_id')) {
        obj['secondary_id'] = ApiClient.convertToType(data['secondary_id'], 'String');
      }
      if (data.hasOwnProperty('strategic_weight')) {
        obj['strategic_weight'] = ApiClient.convertToType(data['strategic_weight'], 'Number');
      }
      if (data.hasOwnProperty('update_date')) {
        obj['update_date'] = ApiClient.convertToType(data['update_date'], 'Date');
      }
    }
    return obj;
  }

  /**
   * allocationId
   * @member {String} allocation_id
   */
  exports.prototype['allocation_id'] = undefined;
  /**
   * core
   * @member {Boolean} core
   */
  exports.prototype['core'] = undefined;
  /**
   * @member {Date} create_date
   */
  exports.prototype['create_date'] = undefined;
  /**
   * currentWeight
   * @member {Number} current_weight
   */
  exports.prototype['current_weight'] = undefined;
  /**
   * date
   * @member {Date} date
   */
  exports.prototype['date'] = undefined;
  /**
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * @member {Object.<String, String>} metadata
   */
  exports.prototype['metadata'] = undefined;
  /**
   * modelId
   * @member {String} model_id
   */
  exports.prototype['model_id'] = undefined;
  /**
   * @member {String} secondary_id
   */
  exports.prototype['secondary_id'] = undefined;
  /**
   * strategicWeight
   * @member {Number} strategic_weight
   */
  exports.prototype['strategic_weight'] = undefined;
  /**
   * @member {Date} update_date
   */
  exports.prototype['update_date'] = undefined;



  return exports;
}));


