/**
 * Hydrogen Integration API
 * The Hydrogen Integration API
 *
 * OpenAPI spec version: 1.3.1
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.2.3
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/KycVendorRequestDataVO'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./KycVendorRequestDataVO'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenIntegrationApi) {
      root.HydrogenIntegrationApi = {};
    }
    root.HydrogenIntegrationApi.KycResponseVo = factory(root.HydrogenIntegrationApi.ApiClient, root.HydrogenIntegrationApi.KycVendorRequestDataVO);
  }
}(this, function(ApiClient, KycVendorRequestDataVO) {
  'use strict';




  /**
   * The KycResponseVo model module.
   * @module model/KycResponseVo
   * @version 1.3.1
   */

  /**
   * Constructs a new <code>KycResponseVo</code>.
   * @alias module:model/KycResponseVo
   * @class
   */
  var exports = function() {
    var _this = this;












  };

  /**
   * Constructs a <code>KycResponseVo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/KycResponseVo} obj Optional instance to populate.
   * @return {module:model/KycResponseVo} The populated <code>KycResponseVo</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('create_date')) {
        obj['create_date'] = ApiClient.convertToType(data['create_date'], 'Date');
      }
      if (data.hasOwnProperty('kyc_status')) {
        obj['kyc_status'] = ApiClient.convertToType(data['kyc_status'], 'String');
      }
      if (data.hasOwnProperty('kyc_type')) {
        obj['kyc_type'] = ApiClient.convertToType(data['kyc_type'], 'String');
      }
      if (data.hasOwnProperty('nucleus_business_id')) {
        obj['nucleus_business_id'] = ApiClient.convertToType(data['nucleus_business_id'], 'String');
      }
      if (data.hasOwnProperty('nucleus_client_id')) {
        obj['nucleus_client_id'] = ApiClient.convertToType(data['nucleus_client_id'], 'String');
      }
      if (data.hasOwnProperty('nucleus_document_id')) {
        obj['nucleus_document_id'] = ApiClient.convertToType(data['nucleus_document_id'], 'String');
      }
      if (data.hasOwnProperty('product')) {
        obj['product'] = ApiClient.convertToType(data['product'], 'String');
      }
      if (data.hasOwnProperty('update_date')) {
        obj['update_date'] = ApiClient.convertToType(data['update_date'], 'Date');
      }
      if (data.hasOwnProperty('vendor_name')) {
        obj['vendor_name'] = ApiClient.convertToType(data['vendor_name'], 'String');
      }
      if (data.hasOwnProperty('vendor_request_data')) {
        obj['vendor_request_data'] = KycVendorRequestDataVO.constructFromObject(data['vendor_request_data']);
      }
      if (data.hasOwnProperty('vendor_response')) {
        obj['vendor_response'] = ApiClient.convertToType(data['vendor_response'], Object);
      }
    }
    return obj;
  }

  /**
   * @member {Date} create_date
   */
  exports.prototype['create_date'] = undefined;
  /**
   * @member {String} kyc_status
   */
  exports.prototype['kyc_status'] = undefined;
  /**
   * @member {String} kyc_type
   */
  exports.prototype['kyc_type'] = undefined;
  /**
   * @member {String} nucleus_business_id
   */
  exports.prototype['nucleus_business_id'] = undefined;
  /**
   * @member {String} nucleus_client_id
   */
  exports.prototype['nucleus_client_id'] = undefined;
  /**
   * @member {String} nucleus_document_id
   */
  exports.prototype['nucleus_document_id'] = undefined;
  /**
   * @member {String} product
   */
  exports.prototype['product'] = undefined;
  /**
   * @member {Date} update_date
   */
  exports.prototype['update_date'] = undefined;
  /**
   * @member {String} vendor_name
   */
  exports.prototype['vendor_name'] = undefined;
  /**
   * @member {module:model/KycVendorRequestDataVO} vendor_request_data
   */
  exports.prototype['vendor_request_data'] = undefined;
  /**
   * @member {Object} vendor_response
   */
  exports.prototype['vendor_response'] = undefined;



  return exports;
}));


