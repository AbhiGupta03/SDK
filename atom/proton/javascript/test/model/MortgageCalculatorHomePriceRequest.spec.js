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
    describe('MortgageCalculatorHomePriceRequest', function() {
      beforeEach(function() {
        instance = new HydrogenProtonApi.MortgageCalculatorHomePriceRequest();
      });

      it('should create an instance of MortgageCalculatorHomePriceRequest', function() {
        // TODO: update the code to test MortgageCalculatorHomePriceRequest
        expect(instance).to.be.a(HydrogenProtonApi.MortgageCalculatorHomePriceRequest);
      });

      it('should have the property periodicPayment (base name: "periodic_payment")', function() {
        // TODO: update the code to test the property periodicPayment
        expect(instance).to.have.property('periodicPayment');
        // expect(instance.periodicPayment).to.be(expectedValueLiteral);
      });

      it('should have the property downPayment (base name: "down_payment")', function() {
        // TODO: update the code to test the property downPayment
        expect(instance).to.have.property('downPayment');
        // expect(instance.downPayment).to.be(expectedValueLiteral);
      });

      it('should have the property mortgageTerm (base name: "mortgage_term")', function() {
        // TODO: update the code to test the property mortgageTerm
        expect(instance).to.have.property('mortgageTerm');
        // expect(instance.mortgageTerm).to.be(expectedValueLiteral);
      });

      it('should have the property interestRate (base name: "interest_rate")', function() {
        // TODO: update the code to test the property interestRate
        expect(instance).to.have.property('interestRate');
        // expect(instance.interestRate).to.be(expectedValueLiteral);
      });

    });
  });

}));
