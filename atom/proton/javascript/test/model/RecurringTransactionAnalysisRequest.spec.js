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

  describe('(package)', function() {
    describe('RecurringTransactionAnalysisRequest', function() {
      beforeEach(function() {
        instance = new HydrogenProtonApi.RecurringTransactionAnalysisRequest();
      });

      it('should create an instance of RecurringTransactionAnalysisRequest', function() {
        // TODO: update the code to test RecurringTransactionAnalysisRequest
        expect(instance).to.be.a(HydrogenProtonApi.RecurringTransactionAnalysisRequest);
      });

      it('should have the property scope (base name: "scope")', function() {
        // TODO: update the code to test the property scope
        expect(instance).to.have.property('scope');
        // expect(instance.scope).to.be(expectedValueLiteral);
      });

      it('should have the property amountDeviationThreshold (base name: "amount_deviation_threshold")', function() {
        // TODO: update the code to test the property amountDeviationThreshold
        expect(instance).to.have.property('amountDeviationThreshold');
        // expect(instance.amountDeviationThreshold).to.be(expectedValueLiteral);
      });

      it('should have the property analyzeTransactions (base name: "analyze_transactions")', function() {
        // TODO: update the code to test the property analyzeTransactions
        expect(instance).to.have.property('analyzeTransactions');
        // expect(instance.analyzeTransactions).to.be(expectedValueLiteral);
      });

      it('should have the property intervalDeviationThreshold (base name: "interval_deviation_threshold")', function() {
        // TODO: update the code to test the property intervalDeviationThreshold
        expect(instance).to.have.property('intervalDeviationThreshold');
        // expect(instance.intervalDeviationThreshold).to.be(expectedValueLiteral);
      });

      it('should have the property clientId (base name: "client_id")', function() {
        // TODO: update the code to test the property clientId
        expect(instance).to.have.property('clientId');
        // expect(instance.clientId).to.be(expectedValueLiteral);
      });

      it('should have the property currencyConversion (base name: "currency_conversion")', function() {
        // TODO: update the code to test the property currencyConversion
        expect(instance).to.have.property('currencyConversion');
        // expect(instance.currencyConversion).to.be(expectedValueLiteral);
      });

      it('should have the property startDate (base name: "start_date")', function() {
        // TODO: update the code to test the property startDate
        expect(instance).to.have.property('startDate');
        // expect(instance.startDate).to.be(expectedValueLiteral);
      });

      it('should have the property aggregationAccountIds (base name: "aggregation_account_ids")', function() {
        // TODO: update the code to test the property aggregationAccountIds
        expect(instance).to.have.property('aggregationAccountIds');
        // expect(instance.aggregationAccountIds).to.be(expectedValueLiteral);
      });

      it('should have the property endDate (base name: "end_date")', function() {
        // TODO: update the code to test the property endDate
        expect(instance).to.have.property('endDate');
        // expect(instance.endDate).to.be(expectedValueLiteral);
      });

      it('should have the property showRecurringDetails (base name: "show_recurring_details")', function() {
        // TODO: update the code to test the property showRecurringDetails
        expect(instance).to.have.property('showRecurringDetails');
        // expect(instance.showRecurringDetails).to.be(expectedValueLiteral);
      });

      it('should have the property currencyCode (base name: "currency_code")', function() {
        // TODO: update the code to test the property currencyCode
        expect(instance).to.have.property('currencyCode');
        // expect(instance.currencyCode).to.be(expectedValueLiteral);
      });

      it('should have the property accountIds (base name: "account_ids")', function() {
        // TODO: update the code to test the property accountIds
        expect(instance).to.have.property('accountIds');
        // expect(instance.accountIds).to.be(expectedValueLiteral);
      });

    });
  });

}));
