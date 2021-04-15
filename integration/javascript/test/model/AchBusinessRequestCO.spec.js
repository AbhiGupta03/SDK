/*
 * Hydrogen Integration API
 * The Hydrogen Integration API
 *
 * OpenAPI spec version: 1.2.1
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.18
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

  describe('(package)', function() {
    describe('AchBusinessRequestCO', function() {
      beforeEach(function() {
        instance = new HydrogenIntegrationApi.AchBusinessRequestCO();
      });

      it('should create an instance of AchBusinessRequestCO', function() {
        // TODO: update the code to test AchBusinessRequestCO
        expect(instance).to.be.a(HydrogenIntegrationApi.AchBusinessRequestCO);
      });

      it('should have the property kycRequired (base name: "kyc_required")', function() {
        // TODO: update the code to test the property kycRequired
        expect(instance).to.have.property('kycRequired');
        // expect(instance.kycRequired).to.be(expectedValueLiteral);
      });

      it('should have the property nucleusBusinessId (base name: "nucleus_business_id")', function() {
        // TODO: update the code to test the property nucleusBusinessId
        expect(instance).to.have.property('nucleusBusinessId');
        // expect(instance.nucleusBusinessId).to.be(expectedValueLiteral);
      });

      it('should have the property vendorRequest (base name: "vendor_request")', function() {
        // TODO: update the code to test the property vendorRequest
        expect(instance).to.have.property('vendorRequest');
        // expect(instance.vendorRequest).to.be(expectedValueLiteral);
      });

    });
  });

}));