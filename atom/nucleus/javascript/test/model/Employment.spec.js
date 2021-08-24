/**
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.4
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
    factory(root.expect, root.HydrogenNucleusApi);
  }
}(this, function(expect, HydrogenNucleusApi) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new HydrogenNucleusApi.Employment();
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

  describe('Employment', function() {
    it('should create an instance of Employment', function() {
      // uncomment below and update the code to test Employment
      //var instane = new HydrogenNucleusApi.Employment();
      //expect(instance).to.be.a(HydrogenNucleusApi.Employment);
    });

    it('should have the property employer (base name: "employer")', function() {
      // uncomment below and update the code to test the property employer
      //var instane = new HydrogenNucleusApi.Employment();
      //expect(instance).to.be();
    });

    it('should have the property employmentStatus (base name: "employment_status")', function() {
      // uncomment below and update the code to test the property employmentStatus
      //var instane = new HydrogenNucleusApi.Employment();
      //expect(instance).to.be();
    });

    it('should have the property jobTitle (base name: "job_title")', function() {
      // uncomment below and update the code to test the property jobTitle
      //var instane = new HydrogenNucleusApi.Employment();
      //expect(instance).to.be();
    });

    it('should have the property occupation (base name: "occupation")', function() {
      // uncomment below and update the code to test the property occupation
      //var instane = new HydrogenNucleusApi.Employment();
      //expect(instance).to.be();
    });

  });

}));
