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
    instance = new HydrogenIntegrationApi.AchBankLinkResponseVO();
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

  describe('AchBankLinkResponseVO', function() {
    it('should create an instance of AchBankLinkResponseVO', function() {
      // uncomment below and update the code to test AchBankLinkResponseVO
      //var instane = new HydrogenIntegrationApi.AchBankLinkResponseVO();
      //expect(instance).to.be.a(HydrogenIntegrationApi.AchBankLinkResponseVO);
    });

    it('should have the property message (base name: "message")', function() {
      // uncomment below and update the code to test the property message
      //var instane = new HydrogenIntegrationApi.AchBankLinkResponseVO();
      //expect(instance).to.be();
    });

    it('should have the property nucleusBankLinkId (base name: "nucleus_bank_link_id")', function() {
      // uncomment below and update the code to test the property nucleusBankLinkId
      //var instane = new HydrogenIntegrationApi.AchBankLinkResponseVO();
      //expect(instance).to.be();
    });

    it('should have the property nucleusClientId (base name: "nucleus_client_id")', function() {
      // uncomment below and update the code to test the property nucleusClientId
      //var instane = new HydrogenIntegrationApi.AchBankLinkResponseVO();
      //expect(instance).to.be();
    });

    it('should have the property status (base name: "status")', function() {
      // uncomment below and update the code to test the property status
      //var instane = new HydrogenIntegrationApi.AchBankLinkResponseVO();
      //expect(instance).to.be();
    });

    it('should have the property vendorName (base name: "vendor_name")', function() {
      // uncomment below and update the code to test the property vendorName
      //var instane = new HydrogenIntegrationApi.AchBankLinkResponseVO();
      //expect(instance).to.be();
    });

    it('should have the property vendorRequestData (base name: "vendor_request_data")', function() {
      // uncomment below and update the code to test the property vendorRequestData
      //var instane = new HydrogenIntegrationApi.AchBankLinkResponseVO();
      //expect(instance).to.be();
    });

    it('should have the property vendorResponse (base name: "vendor_response")', function() {
      // uncomment below and update the code to test the property vendorResponse
      //var instane = new HydrogenIntegrationApi.AchBankLinkResponseVO();
      //expect(instance).to.be();
    });

  });

}));
