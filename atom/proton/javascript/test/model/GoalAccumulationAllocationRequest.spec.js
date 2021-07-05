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
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.HydrogenProtonApi);
  }
}(this, function(expect, HydrogenProtonApi) {
  'use strict';

  var instance;

  describe('(package)', function() {
    describe('GoalAccumulationAllocationRequest', function() {
      beforeEach(function() {
        instance = new HydrogenProtonApi.GoalAccumulationAllocationRequest();
      });

      it('should create an instance of GoalAccumulationAllocationRequest', function() {
        // TODO: update the code to test GoalAccumulationAllocationRequest
        expect(instance).to.be.a(HydrogenProtonApi.GoalAccumulationAllocationRequest);
      });

      it('should have the property recommendationConfig (base name: "recommendation_config")', function() {
        // TODO: update the code to test the property recommendationConfig
        expect(instance).to.have.property('recommendationConfig');
        // expect(instance.recommendationConfig).to.be(expectedValueLiteral);
      });

      it('should have the property compoundingRate (base name: "compounding_rate")', function() {
        // TODO: update the code to test the property compoundingRate
        expect(instance).to.have.property('compoundingRate');
        // expect(instance.compoundingRate).to.be(expectedValueLiteral);
      });

      it('should have the property riskScore (base name: "risk_score")', function() {
        // TODO: update the code to test the property riskScore
        expect(instance).to.have.property('riskScore');
        // expect(instance.riskScore).to.be(expectedValueLiteral);
      });

      it('should have the property recommendType (base name: "recommend_type")', function() {
        // TODO: update the code to test the property recommendType
        expect(instance).to.have.property('recommendType');
        // expect(instance.recommendType).to.be(expectedValueLiteral);
      });

      it('should have the property createLog (base name: "create_log")', function() {
        // TODO: update the code to test the property createLog
        expect(instance).to.have.property('createLog');
        // expect(instance.createLog).to.be(expectedValueLiteral);
      });

      it('should have the property goalConfig (base name: "goal_config")', function() {
        // TODO: update the code to test the property goalConfig
        expect(instance).to.have.property('goalConfig');
        // expect(instance.goalConfig).to.be(expectedValueLiteral);
      });

      it('should have the property n (base name: "n")', function() {
        // TODO: update the code to test the property n
        expect(instance).to.have.property('n');
        // expect(instance.n).to.be(expectedValueLiteral);
      });

      it('should have the property allocationMethod (base name: "allocation_method")', function() {
        // TODO: update the code to test the property allocationMethod
        expect(instance).to.have.property('allocationMethod');
        // expect(instance.allocationMethod).to.be(expectedValueLiteral);
      });

      it('should have the property allocationPriority (base name: "allocation_priority")', function() {
        // TODO: update the code to test the property allocationPriority
        expect(instance).to.have.property('allocationPriority');
        // expect(instance.allocationPriority).to.be(expectedValueLiteral);
      });

      it('should have the property removeOutliers (base name: "remove_outliers")', function() {
        // TODO: update the code to test the property removeOutliers
        expect(instance).to.have.property('removeOutliers');
        // expect(instance.removeOutliers).to.be(expectedValueLiteral);
      });

      it('should have the property adjustForCompounding (base name: "adjust_for_compounding")', function() {
        // TODO: update the code to test the property adjustForCompounding
        expect(instance).to.have.property('adjustForCompounding');
        // expect(instance.adjustForCompounding).to.be(expectedValueLiteral);
      });

      it('should have the property goalId (base name: "goal_id")', function() {
        // TODO: update the code to test the property goalId
        expect(instance).to.have.property('goalId');
        // expect(instance.goalId).to.be(expectedValueLiteral);
      });

      it('should have the property confTgt (base name: "conf_tgt")', function() {
        // TODO: update the code to test the property confTgt
        expect(instance).to.have.property('confTgt');
        // expect(instance.confTgt).to.be(expectedValueLiteral);
      });

      it('should have the property tradingDaysPerYear (base name: "trading_days_per_year")', function() {
        // TODO: update the code to test the property tradingDaysPerYear
        expect(instance).to.have.property('tradingDaysPerYear');
        // expect(instance.tradingDaysPerYear).to.be(expectedValueLiteral);
      });

      it('should have the property useProxyData (base name: "use_proxy_data")', function() {
        // TODO: update the code to test the property useProxyData
        expect(instance).to.have.property('useProxyData');
        // expect(instance.useProxyData).to.be(expectedValueLiteral);
      });

      it('should have the property thresh (base name: "thresh")', function() {
        // TODO: update the code to test the property thresh
        expect(instance).to.have.property('thresh');
        // expect(instance.thresh).to.be(expectedValueLiteral);
      });

      it('should have the property withdrawalTax (base name: "withdrawal_tax")', function() {
        // TODO: update the code to test the property withdrawalTax
        expect(instance).to.have.property('withdrawalTax');
        // expect(instance.withdrawalTax).to.be(expectedValueLiteral);
      });

      it('should have the property clientId (base name: "client_id")', function() {
        // TODO: update the code to test the property clientId
        expect(instance).to.have.property('clientId');
        // expect(instance.clientId).to.be(expectedValueLiteral);
      });

      it('should have the property optConfig (base name: "opt_config")', function() {
        // TODO: update the code to test the property optConfig
        expect(instance).to.have.property('optConfig');
        // expect(instance.optConfig).to.be(expectedValueLiteral);
      });

      it('should have the property marketDataSource (base name: "market_data_source")', function() {
        // TODO: update the code to test the property marketDataSource
        expect(instance).to.have.property('marketDataSource');
        // expect(instance.marketDataSource).to.be(expectedValueLiteral);
      });

      it('should have the property threshType (base name: "thresh_type")', function() {
        // TODO: update the code to test the property threshType
        expect(instance).to.have.property('threshType');
        // expect(instance.threshType).to.be(expectedValueLiteral);
      });

      it('should have the property horizonFrequency (base name: "horizon_frequency")', function() {
        // TODO: update the code to test the property horizonFrequency
        expect(instance).to.have.property('horizonFrequency');
        // expect(instance.horizonFrequency).to.be(expectedValueLiteral);
      });

      it('should have the property horizon (base name: "horizon")', function() {
        // TODO: update the code to test the property horizon
        expect(instance).to.have.property('horizon');
        // expect(instance.horizon).to.be(expectedValueLiteral);
      });

      it('should have the property allocations (base name: "allocations")', function() {
        // TODO: update the code to test the property allocations
        expect(instance).to.have.property('allocations');
        // expect(instance.allocations).to.be(expectedValueLiteral);
      });

      it('should have the property currInv (base name: "curr_inv")', function() {
        // TODO: update the code to test the property currInv
        expect(instance).to.have.property('currInv');
        // expect(instance.currInv).to.be(expectedValueLiteral);
      });

      it('should have the property depositConfig (base name: "deposit_config")', function() {
        // TODO: update the code to test the property depositConfig
        expect(instance).to.have.property('depositConfig');
        // expect(instance.depositConfig).to.be(expectedValueLiteral);
      });

    });
  });

}));
