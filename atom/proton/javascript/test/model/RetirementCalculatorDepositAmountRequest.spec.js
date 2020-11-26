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
    describe('RetirementCalculatorDepositAmountRequest', function() {
      beforeEach(function() {
        instance = new HydrogenProtonApi.RetirementCalculatorDepositAmountRequest();
      });

      it('should create an instance of RetirementCalculatorDepositAmountRequest', function() {
        // TODO: update the code to test RetirementCalculatorDepositAmountRequest
        expect(instance).to.be.a(HydrogenProtonApi.RetirementCalculatorDepositAmountRequest);
      });

      it('should have the property inflationRate (base name: "inflation_rate")', function() {
        // TODO: update the code to test the property inflationRate
        expect(instance).to.have.property('inflationRate');
        // expect(instance.inflationRate).to.be(expectedValueLiteral);
      });

      it('should have the property currentAge (base name: "current_age")', function() {
        // TODO: update the code to test the property currentAge
        expect(instance).to.have.property('currentAge');
        // expect(instance.currentAge).to.be(expectedValueLiteral);
      });

      it('should have the property depositSchedule (base name: "deposit_schedule")', function() {
        // TODO: update the code to test the property depositSchedule
        expect(instance).to.have.property('depositSchedule');
        // expect(instance.depositSchedule).to.be(expectedValueLiteral);
      });

      it('should have the property portfolioReturn (base name: "portfolio_return")', function() {
        // TODO: update the code to test the property portfolioReturn
        expect(instance).to.have.property('portfolioReturn');
        // expect(instance.portfolioReturn).to.be(expectedValueLiteral);
      });

      it('should have the property retirementIncome (base name: "retirement_income")', function() {
        // TODO: update the code to test the property retirementIncome
        expect(instance).to.have.property('retirementIncome');
        // expect(instance.retirementIncome).to.be(expectedValueLiteral);
      });

      it('should have the property aggregationAccountIds (base name: "aggregation_account_ids")', function() {
        // TODO: update the code to test the property aggregationAccountIds
        expect(instance).to.have.property('aggregationAccountIds');
        // expect(instance.aggregationAccountIds).to.be(expectedValueLiteral);
      });

      it('should have the property retirementExpenses (base name: "retirement_expenses")', function() {
        // TODO: update the code to test the property retirementExpenses
        expect(instance).to.have.property('retirementExpenses');
        // expect(instance.retirementExpenses).to.be(expectedValueLiteral);
      });

      it('should have the property percentOfExpensesCovered (base name: "percent_of_expenses_covered")', function() {
        // TODO: update the code to test the property percentOfExpensesCovered
        expect(instance).to.have.property('percentOfExpensesCovered');
        // expect(instance.percentOfExpensesCovered).to.be(expectedValueLiteral);
      });

      it('should have the property retirementTax (base name: "retirement_tax")', function() {
        // TODO: update the code to test the property retirementTax
        expect(instance).to.have.property('retirementTax');
        // expect(instance.retirementTax).to.be(expectedValueLiteral);
      });

      it('should have the property accountIds (base name: "account_ids")', function() {
        // TODO: update the code to test the property accountIds
        expect(instance).to.have.property('accountIds');
        // expect(instance.accountIds).to.be(expectedValueLiteral);
      });

      it('should have the property retirementAge (base name: "retirement_age")', function() {
        // TODO: update the code to test the property retirementAge
        expect(instance).to.have.property('retirementAge');
        // expect(instance.retirementAge).to.be(expectedValueLiteral);
      });

      it('should have the property deathAge (base name: "death_age")', function() {
        // TODO: update the code to test the property deathAge
        expect(instance).to.have.property('deathAge');
        // expect(instance.deathAge).to.be(expectedValueLiteral);
      });

      it('should have the property retirementSavings (base name: "retirement_savings")', function() {
        // TODO: update the code to test the property retirementSavings
        expect(instance).to.have.property('retirementSavings');
        // expect(instance.retirementSavings).to.be(expectedValueLiteral);
      });

    });
  });

}));
