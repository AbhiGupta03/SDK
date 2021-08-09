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
    instance = new HydrogenIntegrationApi.AchCardLoadResponseVO();
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

  describe('AchCardLoadResponseVO', function() {
    it('should create an instance of AchCardLoadResponseVO', function() {
      // uncomment below and update the code to test AchCardLoadResponseVO
      //var instane = new HydrogenIntegrationApi.AchCardLoadResponseVO();
      //expect(instance).to.be.a(HydrogenIntegrationApi.AchCardLoadResponseVO);
    });

    it('should have the property cardLoad (base name: "card_load")', function() {
      // uncomment below and update the code to test the property cardLoad
      //var instane = new HydrogenIntegrationApi.AchCardLoadResponseVO();
      //expect(instance).to.be();
    });

    it('should have the property cardLoadStatusCode (base name: "card_load_status_code")', function() {
      // uncomment below and update the code to test the property cardLoadStatusCode
      //var instane = new HydrogenIntegrationApi.AchCardLoadResponseVO();
      //expect(instance).to.be();
    });

  });

}));
