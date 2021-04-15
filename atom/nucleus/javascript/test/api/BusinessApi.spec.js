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
 * Swagger Codegen version: 2.3.0
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
    instance = new HydrogenNucleusApi.BusinessApi();
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

  describe('BusinessApi', function() {
    describe('createBusinessUsingPost', function() {
      it('should call createBusinessUsingPost successfully', function(done) {
        //uncomment below and update the code to test createBusinessUsingPost
        //instance.createBusinessUsingPost(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('deleteBusinessUsingDelete', function() {
      it('should call deleteBusinessUsingDelete successfully', function(done) {
        //uncomment below and update the code to test deleteBusinessUsingDelete
        //instance.deleteBusinessUsingDelete(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getBusinessAllUsingGet', function() {
      it('should call getBusinessAllUsingGet successfully', function(done) {
        //uncomment below and update the code to test getBusinessAllUsingGet
        //instance.getBusinessAllUsingGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getBusinessAssetSizeUsingGet', function() {
      it('should call getBusinessAssetSizeUsingGet successfully', function(done) {
        //uncomment below and update the code to test getBusinessAssetSizeUsingGet
        //instance.getBusinessAssetSizeUsingGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getBusinessClientTransactionAllUsingGet', function() {
      it('should call getBusinessClientTransactionAllUsingGet successfully', function(done) {
        //uncomment below and update the code to test getBusinessClientTransactionAllUsingGet
        //instance.getBusinessClientTransactionAllUsingGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getBusinessHoldingUsingGet', function() {
      it('should call getBusinessHoldingUsingGet successfully', function(done) {
        //uncomment below and update the code to test getBusinessHoldingUsingGet
        //instance.getBusinessHoldingUsingGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getBusinessUsingGet', function() {
      it('should call getBusinessUsingGet successfully', function(done) {
        //uncomment below and update the code to test getBusinessUsingGet
        //instance.getBusinessUsingGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('updateBusinessUsingPut', function() {
      it('should call updateBusinessUsingPut successfully', function(done) {
        //uncomment below and update the code to test updateBusinessUsingPut
        //instance.updateBusinessUsingPut(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));