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
    instance = new HydrogenNucleusApi.ClientApi();
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

  describe('ClientApi', function() {
    describe('createClientHydroUsingPost', function() {
      it('should call createClientHydroUsingPost successfully', function(done) {
        //uncomment below and update the code to test createClientHydroUsingPost
        //instance.createClientHydroUsingPost(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('createClientStatusUsingPost', function() {
      it('should call createClientStatusUsingPost successfully', function(done) {
        //uncomment below and update the code to test createClientStatusUsingPost
        //instance.createClientStatusUsingPost(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('createClientUsingPost', function() {
      it('should call createClientUsingPost successfully', function(done) {
        //uncomment below and update the code to test createClientUsingPost
        //instance.createClientUsingPost(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('deleteClientHydroUsingDelete', function() {
      it('should call deleteClientHydroUsingDelete successfully', function(done) {
        //uncomment below and update the code to test deleteClientHydroUsingDelete
        //instance.deleteClientHydroUsingDelete(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('deleteClientStatusUsingDelete', function() {
      it('should call deleteClientStatusUsingDelete successfully', function(done) {
        //uncomment below and update the code to test deleteClientStatusUsingDelete
        //instance.deleteClientStatusUsingDelete(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('deleteClientUsingDelete', function() {
      it('should call deleteClientUsingDelete successfully', function(done) {
        //uncomment below and update the code to test deleteClientUsingDelete
        //instance.deleteClientUsingDelete(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getClientAccountOverviewUsingGet', function() {
      it('should call getClientAccountOverviewUsingGet successfully', function(done) {
        //uncomment below and update the code to test getClientAccountOverviewUsingGet
        //instance.getClientAccountOverviewUsingGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getClientAdvisorOverviewUsingGet', function() {
      it('should call getClientAdvisorOverviewUsingGet successfully', function(done) {
        //uncomment below and update the code to test getClientAdvisorOverviewUsingGet
        //instance.getClientAdvisorOverviewUsingGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getClientAllUsingGet', function() {
      it('should call getClientAllUsingGet successfully', function(done) {
        //uncomment below and update the code to test getClientAllUsingGet
        //instance.getClientAllUsingGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getClientAssetSizeUsingGet', function() {
      it('should call getClientAssetSizeUsingGet successfully', function(done) {
        //uncomment below and update the code to test getClientAssetSizeUsingGet
        //instance.getClientAssetSizeUsingGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getClientGoalOverviewUsingGet', function() {
      it('should call getClientGoalOverviewUsingGet successfully', function(done) {
        //uncomment below and update the code to test getClientGoalOverviewUsingGet
        //instance.getClientGoalOverviewUsingGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getClientHoldingUsingGet', function() {
      it('should call getClientHoldingUsingGet successfully', function(done) {
        //uncomment below and update the code to test getClientHoldingUsingGet
        //instance.getClientHoldingUsingGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getClientHydroAllUsingGet', function() {
      it('should call getClientHydroAllUsingGet successfully', function(done) {
        //uncomment below and update the code to test getClientHydroAllUsingGet
        //instance.getClientHydroAllUsingGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getClientHydroUsingGet', function() {
      it('should call getClientHydroUsingGet successfully', function(done) {
        //uncomment below and update the code to test getClientHydroUsingGet
        //instance.getClientHydroUsingGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getClientStatusAllUsingGet', function() {
      it('should call getClientStatusAllUsingGet successfully', function(done) {
        //uncomment below and update the code to test getClientStatusAllUsingGet
        //instance.getClientStatusAllUsingGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getClientStatusUsingGet', function() {
      it('should call getClientStatusUsingGet successfully', function(done) {
        //uncomment below and update the code to test getClientStatusUsingGet
        //instance.getClientStatusUsingGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getClientTransactionAllUsingGet', function() {
      it('should call getClientTransactionAllUsingGet successfully', function(done) {
        //uncomment below and update the code to test getClientTransactionAllUsingGet
        //instance.getClientTransactionAllUsingGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getClientUsingGet', function() {
      it('should call getClientUsingGet successfully', function(done) {
        //uncomment below and update the code to test getClientUsingGet
        //instance.getClientUsingGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('updateClientHydroUsingPut', function() {
      it('should call updateClientHydroUsingPut successfully', function(done) {
        //uncomment below and update the code to test updateClientHydroUsingPut
        //instance.updateClientHydroUsingPut(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('updateClientStatusUsingPut', function() {
      it('should call updateClientStatusUsingPut successfully', function(done) {
        //uncomment below and update the code to test updateClientStatusUsingPut
        //instance.updateClientStatusUsingPut(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('updateClientUsingPut', function() {
      it('should call updateClientUsingPut successfully', function(done) {
        //uncomment below and update the code to test updateClientUsingPut
        //instance.updateClientUsingPut(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));
