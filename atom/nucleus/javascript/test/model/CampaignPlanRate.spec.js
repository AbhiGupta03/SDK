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
    instance = new HydrogenNucleusApi.CampaignPlanRate();
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

  describe('CampaignPlanRate', function() {
    it('should create an instance of CampaignPlanRate', function() {
      // uncomment below and update the code to test CampaignPlanRate
      //var instane = new HydrogenNucleusApi.CampaignPlanRate();
      //expect(instance).to.be.a(HydrogenNucleusApi.CampaignPlanRate);
    });

    it('should have the property maxAsset (base name: "max_asset")', function() {
      // uncomment below and update the code to test the property maxAsset
      //var instane = new HydrogenNucleusApi.CampaignPlanRate();
      //expect(instance).to.be();
    });

    it('should have the property minAsset (base name: "min_asset")', function() {
      // uncomment below and update the code to test the property minAsset
      //var instane = new HydrogenNucleusApi.CampaignPlanRate();
      //expect(instance).to.be();
    });

    it('should have the property rate (base name: "rate")', function() {
      // uncomment below and update the code to test the property rate
      //var instane = new HydrogenNucleusApi.CampaignPlanRate();
      //expect(instance).to.be();
    });

  });

}));
