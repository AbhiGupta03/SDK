/*
 * Hydrogen Proton API
 * Financial engineering module of Hydrogen Atom
 *
 * OpenAPI spec version: 1.8.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.16
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
    root.HydrogenProtonApi.DimensionalRiskScoreRequest = factory(root.HydrogenProtonApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * The DimensionalRiskScoreRequest model module.
   * @module model/DimensionalRiskScoreRequest
   * @version 1.8.0
   */

  /**
   * Constructs a new <code>DimensionalRiskScoreRequest</code>.
   * @alias module:model/DimensionalRiskScoreRequest
   * @class
   * @param dims {Array.<String>} 
   * @param maxAnswers {Array.<Number>} 
   * @param answerDims {Array.<Array.<String>>} 
   */
  var exports = function(dims, maxAnswers, answerDims) {
    this.dims = dims;
    this.maxAnswers = maxAnswers;
    this.answerDims = answerDims;
  };

  /**
   * Constructs a <code>DimensionalRiskScoreRequest</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/DimensionalRiskScoreRequest} obj Optional instance to populate.
   * @return {module:model/DimensionalRiskScoreRequest} The populated <code>DimensionalRiskScoreRequest</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('post_score'))
        obj.postScore = ApiClient.convertToType(data['post_score'], 'Boolean');
      if (data.hasOwnProperty('questionnaire_id'))
        obj.questionnaireId = ApiClient.convertToType(data['questionnaire_id'], 'String');
      if (data.hasOwnProperty('dims'))
        obj.dims = ApiClient.convertToType(data['dims'], ['String']);
      if (data.hasOwnProperty('max_answers'))
        obj.maxAnswers = ApiClient.convertToType(data['max_answers'], ['Number']);
      if (data.hasOwnProperty('client_id'))
        obj.clientId = ApiClient.convertToType(data['client_id'], 'String');
      if (data.hasOwnProperty('answer_weights'))
        obj.answerWeights = ApiClient.convertToType(data['answer_weights'], ['Number']);
      if (data.hasOwnProperty('answers'))
        obj.answers = ApiClient.convertToType(data['answers'], ['Number']);
      if (data.hasOwnProperty('answer_dims'))
        obj.answerDims = ApiClient.convertToType(data['answer_dims'], [['String']]);
      if (data.hasOwnProperty('dim_weights'))
        obj.dimWeights = ApiClient.convertToType(data['dim_weights'], ['Number']);
    }
    return obj;
  }

  /**
   * @member {Boolean} postScore
   * @default false
   */
  exports.prototype.postScore = false;

  /**
   * @member {String} questionnaireId
   */
  exports.prototype.questionnaireId = undefined;

  /**
   * @member {Array.<String>} dims
   */
  exports.prototype.dims = undefined;

  /**
   * @member {Array.<Number>} maxAnswers
   */
  exports.prototype.maxAnswers = undefined;

  /**
   * @member {String} clientId
   */
  exports.prototype.clientId = undefined;

  /**
   * @member {Array.<Number>} answerWeights
   */
  exports.prototype.answerWeights = undefined;

  /**
   * @member {Array.<Number>} answers
   */
  exports.prototype.answers = undefined;

  /**
   * @member {Array.<Array.<String>>} answerDims
   */
  exports.prototype.answerDims = undefined;

  /**
   * @member {Array.<Number>} dimWeights
   */
  exports.prototype.dimWeights = undefined;

  return exports;

}));
