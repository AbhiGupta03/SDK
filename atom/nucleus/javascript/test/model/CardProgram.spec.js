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
    instance = new HydrogenNucleusApi.CardProgram();
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

  describe('CardProgram', function() {
    it('should create an instance of CardProgram', function() {
      // uncomment below and update the code to test CardProgram
      //var instane = new HydrogenNucleusApi.CardProgram();
      //expect(instance).to.be.a(HydrogenNucleusApi.CardProgram);
    });

    it('should have the property cardNetwork (base name: "card_network")', function() {
      // uncomment below and update the code to test the property cardNetwork
      //var instane = new HydrogenNucleusApi.CardProgram();
      //expect(instance).to.be();
    });

    it('should have the property cardProcessor (base name: "card_processor")', function() {
      // uncomment below and update the code to test the property cardProcessor
      //var instane = new HydrogenNucleusApi.CardProgram();
      //expect(instance).to.be();
    });

    it('should have the property cardType (base name: "card_type")', function() {
      // uncomment below and update the code to test the property cardType
      //var instane = new HydrogenNucleusApi.CardProgram();
      //expect(instance).to.be();
    });

    it('should have the property clientId (base name: "client_id")', function() {
      // uncomment below and update the code to test the property clientId
      //var instane = new HydrogenNucleusApi.CardProgram();
      //expect(instance).to.be();
    });

    it('should have the property code (base name: "code")', function() {
      // uncomment below and update the code to test the property code
      //var instane = new HydrogenNucleusApi.CardProgram();
      //expect(instance).to.be();
    });

    it('should have the property createDate (base name: "create_date")', function() {
      // uncomment below and update the code to test the property createDate
      //var instane = new HydrogenNucleusApi.CardProgram();
      //expect(instance).to.be();
    });

    it('should have the property description (base name: "description")', function() {
      // uncomment below and update the code to test the property description
      //var instane = new HydrogenNucleusApi.CardProgram();
      //expect(instance).to.be();
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instane = new HydrogenNucleusApi.CardProgram();
      //expect(instance).to.be();
    });

    it('should have the property isActive (base name: "is_active")', function() {
      // uncomment below and update the code to test the property isActive
      //var instane = new HydrogenNucleusApi.CardProgram();
      //expect(instance).to.be();
    });

    it('should have the property isDelegatedAuthority (base name: "is_delegated_authority")', function() {
      // uncomment below and update the code to test the property isDelegatedAuthority
      //var instane = new HydrogenNucleusApi.CardProgram();
      //expect(instance).to.be();
    });

    it('should have the property issuingBank (base name: "issuing_bank")', function() {
      // uncomment below and update the code to test the property issuingBank
      //var instane = new HydrogenNucleusApi.CardProgram();
      //expect(instance).to.be();
    });

    it('should have the property metadata (base name: "metadata")', function() {
      // uncomment below and update the code to test the property metadata
      //var instane = new HydrogenNucleusApi.CardProgram();
      //expect(instance).to.be();
    });

    it('should have the property name (base name: "name")', function() {
      // uncomment below and update the code to test the property name
      //var instane = new HydrogenNucleusApi.CardProgram();
      //expect(instance).to.be();
    });

    it('should have the property programManager (base name: "program_manager")', function() {
      // uncomment below and update the code to test the property programManager
      //var instane = new HydrogenNucleusApi.CardProgram();
      //expect(instance).to.be();
    });

    it('should have the property secondaryId (base name: "secondary_id")', function() {
      // uncomment below and update the code to test the property secondaryId
      //var instane = new HydrogenNucleusApi.CardProgram();
      //expect(instance).to.be();
    });

    it('should have the property updateDate (base name: "update_date")', function() {
      // uncomment below and update the code to test the property updateDate
      //var instane = new HydrogenNucleusApi.CardProgram();
      //expect(instance).to.be();
    });

  });

}));
