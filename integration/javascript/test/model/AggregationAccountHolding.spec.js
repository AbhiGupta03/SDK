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
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.HydrogenIntegrationApi);
  }
}(this, function(expect, HydrogenIntegrationApi) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new HydrogenIntegrationApi.AggregationAccountHolding();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('AggregationAccountHolding', function() {
    it('should create an instance of AggregationAccountHolding', function() {
      // uncomment below and update the code to test AggregationAccountHolding
      //var instane = new HydrogenIntegrationApi.AggregationAccountHolding();
      //expect(instance).to.be.a(HydrogenIntegrationApi.AggregationAccountHolding);
    });

    it('should have the property aggregationAccountId (base name: "aggregation_account_id")', function() {
      // uncomment below and update the code to test the property aggregationAccountId
      //var instane = new HydrogenIntegrationApi.AggregationAccountHolding();
      //expect(instance).to.be();
    });

    it('should have the property amount (base name: "amount")', function() {
      // uncomment below and update the code to test the property amount
      //var instane = new HydrogenIntegrationApi.AggregationAccountHolding();
      //expect(instance).to.be();
    });

    it('should have the property assetClass (base name: "asset_class")', function() {
      // uncomment below and update the code to test the property assetClass
      //var instane = new HydrogenIntegrationApi.AggregationAccountHolding();
      //expect(instance).to.be();
    });

    it('should have the property costBasis (base name: "cost_basis")', function() {
      // uncomment below and update the code to test the property costBasis
      //var instane = new HydrogenIntegrationApi.AggregationAccountHolding();
      //expect(instance).to.be();
    });

    it('should have the property createDate (base name: "create_date")', function() {
      // uncomment below and update the code to test the property createDate
      //var instane = new HydrogenIntegrationApi.AggregationAccountHolding();
      //expect(instance).to.be();
    });

    it('should have the property currencyCode (base name: "currency_code")', function() {
      // uncomment below and update the code to test the property currencyCode
      //var instane = new HydrogenIntegrationApi.AggregationAccountHolding();
      //expect(instance).to.be();
    });

    it('should have the property cusip (base name: "cusip")', function() {
      // uncomment below and update the code to test the property cusip
      //var instane = new HydrogenIntegrationApi.AggregationAccountHolding();
      //expect(instance).to.be();
    });

    it('should have the property exchange (base name: "exchange")', function() {
      // uncomment below and update the code to test the property exchange
      //var instane = new HydrogenIntegrationApi.AggregationAccountHolding();
      //expect(instance).to.be();
    });

    it('should have the property holdingDate (base name: "holding_date")', function() {
      // uncomment below and update the code to test the property holdingDate
      //var instane = new HydrogenIntegrationApi.AggregationAccountHolding();
      //expect(instance).to.be();
    });

    it('should have the property holdingType (base name: "holding_type")', function() {
      // uncomment below and update the code to test the property holdingType
      //var instane = new HydrogenIntegrationApi.AggregationAccountHolding();
      //expect(instance).to.be();
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instane = new HydrogenIntegrationApi.AggregationAccountHolding();
      //expect(instance).to.be();
    });

    it('should have the property isActive (base name: "is_active")', function() {
      // uncomment below and update the code to test the property isActive
      //var instane = new HydrogenIntegrationApi.AggregationAccountHolding();
      //expect(instance).to.be();
    });

    it('should have the property isin (base name: "isin")', function() {
      // uncomment below and update the code to test the property isin
      //var instane = new HydrogenIntegrationApi.AggregationAccountHolding();
      //expect(instance).to.be();
    });

    it('should have the property metadata (base name: "metadata")', function() {
      // uncomment below and update the code to test the property metadata
      //var instane = new HydrogenIntegrationApi.AggregationAccountHolding();
      //expect(instance).to.be();
    });

    it('should have the property price (base name: "price")', function() {
      // uncomment below and update the code to test the property price
      //var instane = new HydrogenIntegrationApi.AggregationAccountHolding();
      //expect(instance).to.be();
    });

    it('should have the property secondaryId (base name: "secondary_id")', function() {
      // uncomment below and update the code to test the property secondaryId
      //var instane = new HydrogenIntegrationApi.AggregationAccountHolding();
      //expect(instance).to.be();
    });

    it('should have the property shares (base name: "shares")', function() {
      // uncomment below and update the code to test the property shares
      //var instane = new HydrogenIntegrationApi.AggregationAccountHolding();
      //expect(instance).to.be();
    });

    it('should have the property ticker (base name: "ticker")', function() {
      // uncomment below and update the code to test the property ticker
      //var instane = new HydrogenIntegrationApi.AggregationAccountHolding();
      //expect(instance).to.be();
    });

    it('should have the property tickerName (base name: "ticker_name")', function() {
      // uncomment below and update the code to test the property tickerName
      //var instane = new HydrogenIntegrationApi.AggregationAccountHolding();
      //expect(instance).to.be();
    });

    it('should have the property updateDate (base name: "update_date")', function() {
      // uncomment below and update the code to test the property updateDate
      //var instane = new HydrogenIntegrationApi.AggregationAccountHolding();
      //expect(instance).to.be();
    });

  });

}));
