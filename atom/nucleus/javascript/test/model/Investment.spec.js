/**
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.8.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: unset
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
    factory(root.expect, root.HydrogenNucleusApi);
  }
}(this, function(expect, HydrogenNucleusApi) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new HydrogenNucleusApi.Investment();
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

  describe('Investment', function() {
    it('should create an instance of Investment', function() {
      // uncomment below and update the code to test Investment
      //var instane = new HydrogenNucleusApi.Investment();
      //expect(instance).to.be.a(HydrogenNucleusApi.Investment);
    });

    it('should have the property fee (base name: "fee")', function() {
      // uncomment below and update the code to test the property fee
      //var instane = new HydrogenNucleusApi.Investment();
      //expect(instance).to.be();
    });

    it('should have the property investmentType (base name: "investment_type")', function() {
      // uncomment below and update the code to test the property investmentType
      //var instane = new HydrogenNucleusApi.Investment();
      //expect(instance).to.be();
    });

    it('should have the property price (base name: "price")', function() {
      // uncomment below and update the code to test the property price
      //var instane = new HydrogenNucleusApi.Investment();
      //expect(instance).to.be();
    });

    it('should have the property quantity (base name: "quantity")', function() {
      // uncomment below and update the code to test the property quantity
      //var instane = new HydrogenNucleusApi.Investment();
      //expect(instance).to.be();
    });

    it('should have the property settleDate (base name: "settle_date")', function() {
      // uncomment below and update the code to test the property settleDate
      //var instane = new HydrogenNucleusApi.Investment();
      //expect(instance).to.be();
    });

    it('should have the property ticker (base name: "ticker")', function() {
      // uncomment below and update the code to test the property ticker
      //var instane = new HydrogenNucleusApi.Investment();
      //expect(instance).to.be();
    });

    it('should have the property tickerName (base name: "ticker_name")', function() {
      // uncomment below and update the code to test the property tickerName
      //var instane = new HydrogenNucleusApi.Investment();
      //expect(instance).to.be();
    });

    it('should have the property tradeSignal (base name: "trade_signal")', function() {
      // uncomment below and update the code to test the property tradeSignal
      //var instane = new HydrogenNucleusApi.Investment();
      //expect(instance).to.be();
    });

    it('should have the property value (base name: "value")', function() {
      // uncomment below and update the code to test the property value
      //var instane = new HydrogenNucleusApi.Investment();
      //expect(instance).to.be();
    });

  });

}));
