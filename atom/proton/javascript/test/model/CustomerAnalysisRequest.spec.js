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
    describe('CustomerAnalysisRequest', function() {
      beforeEach(function() {
        instance = new HydrogenProtonApi.CustomerAnalysisRequest();
      });

      it('should create an instance of CustomerAnalysisRequest', function() {
        // TODO: update the code to test CustomerAnalysisRequest
        expect(instance).to.be.a(HydrogenProtonApi.CustomerAnalysisRequest);
      });

      it('should have the property customerIds (base name: "customer_ids")', function() {
        // TODO: update the code to test the property customerIds
        expect(instance).to.have.property('customerIds');
        // expect(instance.customerIds).to.be(expectedValueLiteral);
      });

      it('should have the property benchmarkStartDate (base name: "benchmark_start_date")', function() {
        // TODO: update the code to test the property benchmarkStartDate
        expect(instance).to.have.property('benchmarkStartDate');
        // expect(instance.benchmarkStartDate).to.be(expectedValueLiteral);
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

      it('should have the property responseLimit (base name: "response_limit")', function() {
        // TODO: update the code to test the property responseLimit
        expect(instance).to.have.property('responseLimit');
        // expect(instance.responseLimit).to.be(expectedValueLiteral);
      });

      it('should have the property endDate (base name: "end_date")', function() {
        // TODO: update the code to test the property endDate
        expect(instance).to.have.property('endDate');
        // expect(instance.endDate).to.be(expectedValueLiteral);
      });

      it('should have the property currencyCode (base name: "currency_code")', function() {
        // TODO: update the code to test the property currencyCode
        expect(instance).to.have.property('currencyCode');
        // expect(instance.currencyCode).to.be(expectedValueLiteral);
      });

      it('should have the property startDate (base name: "start_date")', function() {
        // TODO: update the code to test the property startDate
        expect(instance).to.have.property('startDate');
        // expect(instance.startDate).to.be(expectedValueLiteral);
      });

      it('should have the property benchmarkEndDate (base name: "benchmark_end_date")', function() {
        // TODO: update the code to test the property benchmarkEndDate
        expect(instance).to.have.property('benchmarkEndDate');
        // expect(instance.benchmarkEndDate).to.be(expectedValueLiteral);
      });

      it('should have the property onlyActiveCustomers (base name: "only_active_customers")', function() {
        // TODO: update the code to test the property onlyActiveCustomers
        expect(instance).to.have.property('onlyActiveCustomers');
        // expect(instance.onlyActiveCustomers).to.be(expectedValueLiteral);
      });

    });
  });

}));
