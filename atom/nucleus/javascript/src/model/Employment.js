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
    root.HydrogenNucleusApi.Employment = factory(root.HydrogenNucleusApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The Employment model module.
   * @module model/Employment
   * @version 1.8.0
   */

  /**
   * Constructs a new <code>Employment</code>.
   * Employment Object
   * @alias module:model/Employment
   * @class
   */
  var exports = function() {
    var _this = this;





  };

  /**
   * Constructs a <code>Employment</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Employment} obj Optional instance to populate.
   * @return {module:model/Employment} The populated <code>Employment</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('employer')) {
        obj['employer'] = ApiClient.convertToType(data['employer'], 'String');
      }
      if (data.hasOwnProperty('employment_status')) {
        obj['employment_status'] = ApiClient.convertToType(data['employment_status'], 'String');
      }
      if (data.hasOwnProperty('job_title')) {
        obj['job_title'] = ApiClient.convertToType(data['job_title'], 'String');
      }
      if (data.hasOwnProperty('occupation')) {
        obj['occupation'] = ApiClient.convertToType(data['occupation'], 'String');
      }
    }
    return obj;
  }

  /**
   * employer
   * @member {String} employer
   */
  exports.prototype['employer'] = undefined;
  /**
   * employmentStatus
   * @member {String} employment_status
   */
  exports.prototype['employment_status'] = undefined;
  /**
   * jobTitle
   * @member {String} job_title
   */
  exports.prototype['job_title'] = undefined;
  /**
   * occupation
   * @member {String} occupation
   */
  exports.prototype['occupation'] = undefined;



  return exports;
}));


