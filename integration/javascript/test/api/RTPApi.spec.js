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
    instance = new HydrogenIntegrationApi.RTPApi();
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

  describe('RTPApi', function() {
    describe('cancelRtpTransferUsingDelete', function() {
      it('should call cancelRtpTransferUsingDelete successfully', function(done) {
        //uncomment below and update the code to test cancelRtpTransferUsingDelete
        //instance.cancelRtpTransferUsingDelete(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('createRTPBankLinkUsingPost', function() {
      it('should call createRTPBankLinkUsingPost successfully', function(done) {
        //uncomment below and update the code to test createRTPBankLinkUsingPost
        //instance.createRTPBankLinkUsingPost(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('deleteRTPBankLinkUsingDelete', function() {
      it('should call deleteRTPBankLinkUsingDelete successfully', function(done) {
        //uncomment below and update the code to test deleteRTPBankLinkUsingDelete
        //instance.deleteRTPBankLinkUsingDelete(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getListOfRtpTransfersUsingGet', function() {
      it('should call getListOfRtpTransfersUsingGet successfully', function(done) {
        //uncomment below and update the code to test getListOfRtpTransfersUsingGet
        //instance.getListOfRtpTransfersUsingGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getRTPBankLinkUsingGet', function() {
      it('should call getRTPBankLinkUsingGet successfully', function(done) {
        //uncomment below and update the code to test getRTPBankLinkUsingGet
        //instance.getRTPBankLinkUsingGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getRTPClientBankLinksUsingGet', function() {
      it('should call getRTPClientBankLinksUsingGet successfully', function(done) {
        //uncomment below and update the code to test getRTPClientBankLinksUsingGet
        //instance.getRTPClientBankLinksUsingGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getRtpTransferUsingGet', function() {
      it('should call getRtpTransferUsingGet successfully', function(done) {
        //uncomment below and update the code to test getRtpTransferUsingGet
        //instance.getRtpTransferUsingGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('submitRtpTransferUsingPost', function() {
      it('should call submitRtpTransferUsingPost successfully', function(done) {
        //uncomment below and update the code to test submitRtpTransferUsingPost
        //instance.submitRtpTransferUsingPost(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('updateRTPBankLinkUsingPut', function() {
      it('should call updateRTPBankLinkUsingPut successfully', function(done) {
        //uncomment below and update the code to test updateRTPBankLinkUsingPut
        //instance.updateRTPBankLinkUsingPut(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));
