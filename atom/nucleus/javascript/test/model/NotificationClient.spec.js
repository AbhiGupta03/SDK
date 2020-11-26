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
    instance = new HydrogenNucleusApi.NotificationClient();
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

  describe('NotificationClient', function() {
    it('should create an instance of NotificationClient', function() {
      // uncomment below and update the code to test NotificationClient
      //var instane = new HydrogenNucleusApi.NotificationClient();
      //expect(instance).to.be.a(HydrogenNucleusApi.NotificationClient);
    });

    it('should have the property clientId (base name: "client_id")', function() {
      // uncomment below and update the code to test the property clientId
      //var instane = new HydrogenNucleusApi.NotificationClient();
      //expect(instance).to.be();
    });

    it('should have the property createDate (base name: "create_date")', function() {
      // uncomment below and update the code to test the property createDate
      //var instane = new HydrogenNucleusApi.NotificationClient();
      //expect(instance).to.be();
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instane = new HydrogenNucleusApi.NotificationClient();
      //expect(instance).to.be();
    });

    it('should have the property isRead (base name: "is_read")', function() {
      // uncomment below and update the code to test the property isRead
      //var instane = new HydrogenNucleusApi.NotificationClient();
      //expect(instance).to.be();
    });

    it('should have the property isSent (base name: "is_sent")', function() {
      // uncomment below and update the code to test the property isSent
      //var instane = new HydrogenNucleusApi.NotificationClient();
      //expect(instance).to.be();
    });

    it('should have the property metadata (base name: "metadata")', function() {
      // uncomment below and update the code to test the property metadata
      //var instane = new HydrogenNucleusApi.NotificationClient();
      //expect(instance).to.be();
    });

    it('should have the property notificationContent (base name: "notification_content")', function() {
      // uncomment below and update the code to test the property notificationContent
      //var instane = new HydrogenNucleusApi.NotificationClient();
      //expect(instance).to.be();
    });

    it('should have the property notificationDate (base name: "notification_date")', function() {
      // uncomment below and update the code to test the property notificationDate
      //var instane = new HydrogenNucleusApi.NotificationClient();
      //expect(instance).to.be();
    });

    it('should have the property notificationId (base name: "notification_id")', function() {
      // uncomment below and update the code to test the property notificationId
      //var instane = new HydrogenNucleusApi.NotificationClient();
      //expect(instance).to.be();
    });

    it('should have the property notificationImage (base name: "notification_image")', function() {
      // uncomment below and update the code to test the property notificationImage
      //var instane = new HydrogenNucleusApi.NotificationClient();
      //expect(instance).to.be();
    });

    it('should have the property secondaryId (base name: "secondary_id")', function() {
      // uncomment below and update the code to test the property secondaryId
      //var instane = new HydrogenNucleusApi.NotificationClient();
      //expect(instance).to.be();
    });

    it('should have the property updateDate (base name: "update_date")', function() {
      // uncomment below and update the code to test the property updateDate
      //var instane = new HydrogenNucleusApi.NotificationClient();
      //expect(instance).to.be();
    });

  });

}));
