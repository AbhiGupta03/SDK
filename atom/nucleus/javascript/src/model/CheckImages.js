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
 * Swagger Codegen version: 2.3.0
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
    root.HydrogenNucleusApi.CheckImages = factory(root.HydrogenNucleusApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The CheckImages model module.
   * @module model/CheckImages
   * @version 1.8.0
   */

  /**
   * Constructs a new <code>CheckImages</code>.
   * CheckImages Object
   * @alias module:model/CheckImages
   * @class
   * @param imageUrl {String} imageUrl
   */
  var exports = function(imageUrl) {
    var _this = this;


    _this['image_url'] = imageUrl;
  };

  /**
   * Constructs a <code>CheckImages</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CheckImages} obj Optional instance to populate.
   * @return {module:model/CheckImages} The populated <code>CheckImages</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('image_type')) {
        obj['image_type'] = ApiClient.convertToType(data['image_type'], 'String');
      }
      if (data.hasOwnProperty('image_url')) {
        obj['image_url'] = ApiClient.convertToType(data['image_url'], 'String');
      }
    }
    return obj;
  }

  /**
   * imageType
   * @member {String} image_type
   */
  exports.prototype['image_type'] = undefined;
  /**
   * imageUrl
   * @member {String} image_url
   */
  exports.prototype['image_url'] = undefined;



  return exports;
}));

