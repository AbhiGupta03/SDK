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
    instance = new HydrogenNucleusApi.Roundup();
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

  describe('Roundup', function() {
    it('should create an instance of Roundup', function() {
      // uncomment below and update the code to test Roundup
      //var instane = new HydrogenNucleusApi.Roundup();
      //expect(instance).to.be.a(HydrogenNucleusApi.Roundup);
    });

    it('should have the property accountId (base name: "account_id")', function() {
      // uncomment below and update the code to test the property accountId
      //var instane = new HydrogenNucleusApi.Roundup();
      //expect(instance).to.be();
    });

    it('should have the property clientId (base name: "client_id")', function() {
      // uncomment below and update the code to test the property clientId
      //var instane = new HydrogenNucleusApi.Roundup();
      //expect(instance).to.be();
    });

    it('should have the property createDate (base name: "create_date")', function() {
      // uncomment below and update the code to test the property createDate
      //var instane = new HydrogenNucleusApi.Roundup();
      //expect(instance).to.be();
    });

    it('should have the property fundingRequests (base name: "funding_requests")', function() {
      // uncomment below and update the code to test the property fundingRequests
      //var instane = new HydrogenNucleusApi.Roundup();
      //expect(instance).to.be();
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instane = new HydrogenNucleusApi.Roundup();
      //expect(instance).to.be();
    });

    it('should have the property roundupSettingId (base name: "roundup_setting_id")', function() {
      // uncomment below and update the code to test the property roundupSettingId
      //var instane = new HydrogenNucleusApi.Roundup();
      //expect(instance).to.be();
    });

    it('should have the property totalRoundupAmount (base name: "total_roundup_amount")', function() {
      // uncomment below and update the code to test the property totalRoundupAmount
      //var instane = new HydrogenNucleusApi.Roundup();
      //expect(instance).to.be();
    });

    it('should have the property updateDate (base name: "update_date")', function() {
      // uncomment below and update the code to test the property updateDate
      //var instane = new HydrogenNucleusApi.Roundup();
      //expect(instance).to.be();
    });

  });

}));
