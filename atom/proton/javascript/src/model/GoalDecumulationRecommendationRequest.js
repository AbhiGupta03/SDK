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
    define(['ApiClient', 'model/DecumulationGoalDepositConfig', 'model/GoalWithdrawalConfig', 'model/RecommendationConfig1'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./DecumulationGoalDepositConfig'), require('./GoalWithdrawalConfig'), require('./RecommendationConfig1'));
  } else {
    // Browser globals (root is window)
    if (!root.HydrogenProtonApi) {
      root.HydrogenProtonApi = {};
    }
    root.HydrogenProtonApi.GoalDecumulationRecommendationRequest = factory(root.HydrogenProtonApi.ApiClient, root.HydrogenProtonApi.DecumulationGoalDepositConfig, root.HydrogenProtonApi.GoalWithdrawalConfig, root.HydrogenProtonApi.RecommendationConfig1);
  }
}(this, function(ApiClient, DecumulationGoalDepositConfig, GoalWithdrawalConfig, RecommendationConfig1) {
  'use strict';

  /**
   * The GoalDecumulationRecommendationRequest model module.
   * @module model/GoalDecumulationRecommendationRequest
   * @version 1.8.0
   */

  /**
   * Constructs a new <code>GoalDecumulationRecommendationRequest</code>.
   * @alias module:model/GoalDecumulationRecommendationRequest
   * @class
   * @param pRet {Array.<Number>} 
   * @param pRisk {Array.<Number>} 
   */
  var exports = function(pRet, pRisk) {
    this.pRet = pRet;
    this.pRisk = pRisk;
  };

  /**
   * Constructs a <code>GoalDecumulationRecommendationRequest</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/GoalDecumulationRecommendationRequest} obj Optional instance to populate.
   * @return {module:model/GoalDecumulationRecommendationRequest} The populated <code>GoalDecumulationRecommendationRequest</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('goal_id'))
        obj.goalId = ApiClient.convertToType(data['goal_id'], 'String');
      if (data.hasOwnProperty('curr_inv'))
        obj.currInv = ApiClient.convertToType(data['curr_inv'], 'Number');
      if (data.hasOwnProperty('d_horizon'))
        obj.dHorizon = ApiClient.convertToType(data['d_horizon'], 'Number');
      if (data.hasOwnProperty('n'))
        obj.n = ApiClient.convertToType(data['n'], 'Number');
      if (data.hasOwnProperty('horizon_frequency'))
        obj.horizonFrequency = ApiClient.convertToType(data['horizon_frequency'], 'String');
      if (data.hasOwnProperty('client_id'))
        obj.clientId = ApiClient.convertToType(data['client_id'], 'String');
      if (data.hasOwnProperty('remove_outliers'))
        obj.removeOutliers = ApiClient.convertToType(data['remove_outliers'], 'Boolean');
      if (data.hasOwnProperty('withdrawal_config'))
        obj.withdrawalConfig = ApiClient.convertToType(data['withdrawal_config'], [GoalWithdrawalConfig]);
      if (data.hasOwnProperty('a_horizon'))
        obj.aHorizon = ApiClient.convertToType(data['a_horizon'], 'Number');
      if (data.hasOwnProperty('conf_tgt'))
        obj.confTgt = ApiClient.convertToType(data['conf_tgt'], 'Number');
      if (data.hasOwnProperty('p_ret'))
        obj.pRet = ApiClient.convertToType(data['p_ret'], ['Number']);
      if (data.hasOwnProperty('thresh_type'))
        obj.threshType = ApiClient.convertToType(data['thresh_type'], 'String');
      if (data.hasOwnProperty('thresh'))
        obj.thresh = ApiClient.convertToType(data['thresh'], 'Number');
      if (data.hasOwnProperty('deposit_config'))
        obj.depositConfig = ApiClient.convertToType(data['deposit_config'], [DecumulationGoalDepositConfig]);
      if (data.hasOwnProperty('recommendation_config'))
        obj.recommendationConfig = RecommendationConfig1.constructFromObject(data['recommendation_config']);
      if (data.hasOwnProperty('compounding_rate'))
        obj.compoundingRate = ApiClient.convertToType(data['compounding_rate'], 'Number');
      if (data.hasOwnProperty('withdrawal_tax'))
        obj.withdrawalTax = ApiClient.convertToType(data['withdrawal_tax'], 'Number');
      if (data.hasOwnProperty('trading_days_per_year'))
        obj.tradingDaysPerYear = ApiClient.convertToType(data['trading_days_per_year'], 'Number');
      if (data.hasOwnProperty('adjust_for_compounding'))
        obj.adjustForCompounding = ApiClient.convertToType(data['adjust_for_compounding'], 'Boolean');
      if (data.hasOwnProperty('p_risk'))
        obj.pRisk = ApiClient.convertToType(data['p_risk'], ['Number']);
      if (data.hasOwnProperty('create_log'))
        obj.createLog = ApiClient.convertToType(data['create_log'], 'Boolean');
      if (data.hasOwnProperty('recommend_type'))
        obj.recommendType = ApiClient.convertToType(data['recommend_type'], 'String');
    }
    return obj;
  }

  /**
   * @member {String} goalId
   */
  exports.prototype.goalId = undefined;

  /**
   * @member {Number} currInv
   */
  exports.prototype.currInv = undefined;

  /**
   * @member {Number} dHorizon
   */
  exports.prototype.dHorizon = undefined;

  /**
   * @member {Number} n
   * @default 1000
   */
  exports.prototype.n = 1000;

  /**
   * @member {module:model/GoalDecumulationRecommendationRequest.HorizonFrequencyEnum} horizonFrequency
   * @default 'year'
   */
  exports.prototype.horizonFrequency = 'year';

  /**
   * @member {String} clientId
   */
  exports.prototype.clientId = undefined;

  /**
   * @member {Boolean} removeOutliers
   * @default true
   */
  exports.prototype.removeOutliers = true;

  /**
   * @member {Array.<module:model/GoalWithdrawalConfig>} withdrawalConfig
   */
  exports.prototype.withdrawalConfig = undefined;

  /**
   * @member {Number} aHorizon
   */
  exports.prototype.aHorizon = undefined;

  /**
   * @member {Number} confTgt
   * @default 0.9
   */
  exports.prototype.confTgt = 0.9;

  /**
   * @member {Array.<Number>} pRet
   */
  exports.prototype.pRet = undefined;

  /**
   * @member {module:model/GoalDecumulationRecommendationRequest.ThreshTypeEnum} threshType
   * @default 'perc'
   */
  exports.prototype.threshType = 'perc';

  /**
   * @member {Number} thresh
   */
  exports.prototype.thresh = undefined;

  /**
   * @member {Array.<module:model/DecumulationGoalDepositConfig>} depositConfig
   */
  exports.prototype.depositConfig = undefined;

  /**
   * @member {module:model/RecommendationConfig1} recommendationConfig
   */
  exports.prototype.recommendationConfig = undefined;

  /**
   * @member {Number} compoundingRate
   * @default 0.0
   */
  exports.prototype.compoundingRate = 0.0;

  /**
   * @member {Number} withdrawalTax
   * @default 0.0
   */
  exports.prototype.withdrawalTax = 0.0;

  /**
   * @member {Number} tradingDaysPerYear
   * @default 252
   */
  exports.prototype.tradingDaysPerYear = 252;

  /**
   * @member {Boolean} adjustForCompounding
   * @default false
   */
  exports.prototype.adjustForCompounding = false;

  /**
   * @member {Array.<Number>} pRisk
   */
  exports.prototype.pRisk = undefined;

  /**
   * @member {Boolean} createLog
   * @default false
   */
  exports.prototype.createLog = false;

  /**
   * @member {module:model/GoalDecumulationRecommendationRequest.RecommendTypeEnum} recommendType
   * @default 'horizon'
   */
  exports.prototype.recommendType = 'horizon';


  /**
   * Allowed values for the <code>horizonFrequency</code> property.
   * @enum {String}
   * @readonly
   */
  exports.HorizonFrequencyEnum = {
    /**
     * value: "year"
     * @const
     */
    year: "year",

    /**
     * value: "six_months"
     * @const
     */
    sixMonths: "six_months",

    /**
     * value: "quarter"
     * @const
     */
    quarter: "quarter",

    /**
     * value: "month"
     * @const
     */
    month: "month",

    /**
     * value: "two_weeks"
     * @const
     */
    twoWeeks: "two_weeks",

    /**
     * value: "week"
     * @const
     */
    week: "week",

    /**
     * value: "day"
     * @const
     */
    day: "day"
  };


  /**
   * Allowed values for the <code>threshType</code> property.
   * @enum {String}
   * @readonly
   */
  exports.ThreshTypeEnum = {
    /**
     * value: "amnt"
     * @const
     */
    amnt: "amnt",

    /**
     * value: "perc"
     * @const
     */
    perc: "perc"
  };


  /**
   * Allowed values for the <code>recommendType</code> property.
   * @enum {String}
   * @readonly
   */
  exports.RecommendTypeEnum = {
    /**
     * value: "recurring"
     * @const
     */
    recurring: "recurring",

    /**
     * value: "one-time"
     * @const
     */
    oneTime: "one-time",

    /**
     * value: "combo"
     * @const
     */
    combo: "combo",

    /**
     * value: "horizon"
     * @const
     */
    horizon: "horizon"
  };

  return exports;

}));
