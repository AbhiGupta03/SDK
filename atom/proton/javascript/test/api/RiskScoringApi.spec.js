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

  beforeEach(function() {
    instance = new HydrogenProtonApi.RiskScoringApi();
  });

  describe('(package)', function() {
    describe('RiskScoringApi', function() {
      describe('dimensionalRiskScore', function() {
        it('should call dimensionalRiskScore successfully', function(done) {
          // TODO: uncomment, update parameter values for dimensionalRiskScore call and complete the assertions
          /*
          var dimensionalRiskScoreRequest = new HydrogenProtonApi.DimensionalRiskScoreRequest();
          dimensionalRiskScoreRequest.postScore = false;
          dimensionalRiskScoreRequest.questionnaireId = """00000000-0000-0000-0000-000000000000";
          dimensionalRiskScoreRequest.dims = [""];
          dimensionalRiskScoreRequest.maxAnswers = [];
          dimensionalRiskScoreRequest.clientId = """00000000-0000-0000-0000-000000000000";
          dimensionalRiskScoreRequest.answerWeights = [0.0];
          dimensionalRiskScoreRequest.answers = [];
          dimensionalRiskScoreRequest.answerDims = [[""]];
          dimensionalRiskScoreRequest.dimWeights = [0.0];

          instance.dimensionalRiskScore(dimensionalRiskScoreRequest, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            let dataCtr = data;
            expect(dataCtr).to.be.an(Object);
            expect(dataCtr).to.not.be.empty();
            for (let p in dataCtr) {
              let data = dataCtr[p];
              expect(data).to.be.a(Object);
              // expect(data).to.be(null);
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('riskAllocation', function() {
        it('should call riskAllocation successfully', function(done) {
          // TODO: uncomment, update parameter values for riskAllocation call and complete the assertions
          /*
          var riskAllocationRequest = new HydrogenProtonApi.RiskAllocationRequest();
          riskAllocationRequest.optConfig = new HydrogenProtonApi.OptConfig();
          riskAllocationRequest.optConfig.wAssetConfig = ;
          riskAllocationRequest.optConfig.minAssets = 0;
          riskAllocationRequest.optConfig.secTypes = ["major"]"major";
          riskAllocationRequest.optConfig.wConfig = new HydrogenProtonApi.WConfig();
          riskAllocationRequest.optConfig.wConfig.wMinMinor = 0.0;
          riskAllocationRequest.optConfig.wConfig.wMaxMajor = 0.0;
          riskAllocationRequest.optConfig.wConfig.wMinMajor = 0.0;
          riskAllocationRequest.optConfig.wConfig.cashAmount = 0.0;
          riskAllocationRequest.optConfig.wConfig.wMaxMinor = 0.0;
          riskAllocationRequest.optConfig.endDate = new Date();
          riskAllocationRequest.optConfig.startDate = new Date();
          riskAllocationRequest.optConfig.tickers = [""];
          riskAllocationRequest.allocations = ["""00000000-0000-0000-0000-000000000000"];
          riskAllocationRequest.clientId = """00000000-0000-0000-0000-000000000000";
          riskAllocationRequest.allocationMethod = "select";
          riskAllocationRequest.riskScore = ;
          riskAllocationRequest.useProxyData = false;
          riskAllocationRequest.marketDataSource = "nucleus";

          instance.riskAllocation(riskAllocationRequest, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            let dataCtr = data;
            expect(dataCtr).to.be.an(Object);
            expect(dataCtr).to.not.be.empty();
            for (let p in dataCtr) {
              let data = dataCtr[p];
              expect(data).to.be.a(Object);
              // expect(data).to.be(null);
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('riskScore', function() {
        it('should call riskScore successfully', function(done) {
          // TODO: uncomment, update parameter values for riskScore call and complete the assertions
          /*
          var riskScoreRequest = new HydrogenProtonApi.RiskScoreRequest();
          riskScoreRequest.postScore = false;
          riskScoreRequest.questionnaireId = """00000000-0000-0000-0000-000000000000";
          riskScoreRequest.maxAnswers = [];
          riskScoreRequest.clientId = """00000000-0000-0000-0000-000000000000";
          riskScoreRequest.answers = [];
          riskScoreRequest.weights = [0.0];

          instance.riskScore(riskScoreRequest, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            let dataCtr = data;
            expect(dataCtr).to.be.an(Object);
            expect(dataCtr).to.not.be.empty();
            for (let p in dataCtr) {
              let data = dataCtr[p];
              expect(data).to.be.a(Object);
              // expect(data).to.be(null);
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
    });
  });

}));
