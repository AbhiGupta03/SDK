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
    instance = new HydrogenNucleusApi.ScoreApi();
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

  describe('ScoreApi', function() {
    describe('createScoreUsingPost', function() {
      it('should call createScoreUsingPost successfully', function(done) {
        //uncomment below and update the code to test createScoreUsingPost
        //instance.createScoreUsingPost(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('deleteScoreUsingDelete', function() {
      it('should call deleteScoreUsingDelete successfully', function(done) {
        //uncomment below and update the code to test deleteScoreUsingDelete
        //instance.deleteScoreUsingDelete(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getScoreAllUsingGet', function() {
      it('should call getScoreAllUsingGet successfully', function(done) {
        //uncomment below and update the code to test getScoreAllUsingGet
        //instance.getScoreAllUsingGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getScoreUsingGet', function() {
      it('should call getScoreUsingGet successfully', function(done) {
        //uncomment below and update the code to test getScoreUsingGet
        //instance.getScoreUsingGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('updateScoreUsingPut', function() {
      it('should call updateScoreUsingPut successfully', function(done) {
        //uncomment below and update the code to test updateScoreUsingPut
        //instance.updateScoreUsingPut(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));
