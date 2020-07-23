/*
 * Molecule API Documentation
 * The Hydrogen Molecule API
 *
 * OpenAPI spec version: 1.3.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.14
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
    factory(root.expect, root.MoleculeApiDocumentation);
  }
}(this, function(expect, MoleculeApiDocumentation) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new MoleculeApiDocumentation.WalletKeyApi();
  });

  describe('(package)', function() {
    describe('WalletKeyApi', function() {
      describe('createWalletKeyUsingPost', function() {
        it('should call createWalletKeyUsingPost successfully', function(done) {
          // TODO: uncomment, update parameter values for createWalletKeyUsingPost call and complete the assertions
          /*
          var walletKeyParams = new MoleculeApiDocumentation.WalletKeyParams();
          walletKeyParams.walletId = """00000000-0000-0000-0000-000000000000";
          walletKeyParams.address = "";
          walletKeyParams.privateKey = "";
          walletKeyParams.keyId = "";
          walletKeyParams.keyServer = "";
          walletKeyParams.isActive = false;
          walletKeyParams.recordStatus = "";

          instance.createWalletKeyUsingPost(walletKeyParams, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(MoleculeApiDocumentation.WalletKeyResponse);
            expect(data.id).to.be.a('string');
            expect(data.id).to.be("""00000000-0000-0000-0000-000000000000");
            expect(data.keyId).to.be.a('string');
            expect(data.keyId).to.be("");
            expect(data.keyServer).to.be.a('string');
            expect(data.keyServer).to.be("");
            expect(data.privateKey).to.be.a('string');
            expect(data.privateKey).to.be("");
            expect(data.address).to.be.a('string');
            expect(data.address).to.be("");
            expect(data.recordStatus).to.be.a('string');
            expect(data.recordStatus).to.be("");
            expect(data.isActive).to.be.a('boolean');
            expect(data.isActive).to.be(false);
            expect(data.createDate).to.be.a(Date);
            expect(data.createDate).to.be(new Date());
            expect(data.updateDate).to.be.a(Date);
            expect(data.updateDate).to.be(new Date());

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('generateWalletKeyUsingPost', function() {
        it('should call generateWalletKeyUsingPost successfully', function(done) {
          // TODO: uncomment, update parameter values for generateWalletKeyUsingPost call and complete the assertions
          /*
          var walletKeyGenerateParams = new MoleculeApiDocumentation.WalletKeyGenerateParams();
          walletKeyGenerateParams.walletId = """00000000-0000-0000-0000-000000000000";
          walletKeyGenerateParams.keyId = "";
          walletKeyGenerateParams.keyServer = "";
          walletKeyGenerateParams.isActive = false;
          walletKeyGenerateParams.recordStatus = "";

          instance.generateWalletKeyUsingPost(walletKeyGenerateParams, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(MoleculeApiDocumentation.WalletKeyResponse);
            expect(data.id).to.be.a('string');
            expect(data.id).to.be("""00000000-0000-0000-0000-000000000000");
            expect(data.keyId).to.be.a('string');
            expect(data.keyId).to.be("");
            expect(data.keyServer).to.be.a('string');
            expect(data.keyServer).to.be("");
            expect(data.privateKey).to.be.a('string');
            expect(data.privateKey).to.be("");
            expect(data.address).to.be.a('string');
            expect(data.address).to.be("");
            expect(data.recordStatus).to.be.a('string');
            expect(data.recordStatus).to.be("");
            expect(data.isActive).to.be.a('boolean');
            expect(data.isActive).to.be(false);
            expect(data.createDate).to.be.a(Date);
            expect(data.createDate).to.be(new Date());
            expect(data.updateDate).to.be.a(Date);
            expect(data.updateDate).to.be(new Date());

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('getWalletKeyAllUsingGet', function() {
        it('should call getWalletKeyAllUsingGet successfully', function(done) {
          // TODO: uncomment, update parameter values for getWalletKeyAllUsingGet call and complete the assertions
          /*
          var opts = {};
          opts.page = 56;
          opts.size = 56;
          opts.orderBy = "orderBy_example";
          opts.ascending = true;
          opts.getLatest = true;

          instance.getWalletKeyAllUsingGet(opts, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(MoleculeApiDocumentation.PageWalletKeyResponse);
            {
              let dataCtr = data.content;
              expect(dataCtr).to.be.an(Array);
              expect(dataCtr).to.not.be.empty();
              for (let p in dataCtr) {
                let data = dataCtr[p];
                expect(data).to.be.a(MoleculeApiDocumentation.WalletKeyResponse);
                expect(data.id).to.be.a('string');
                expect(data.id).to.be("""00000000-0000-0000-0000-000000000000");
                expect(data.keyId).to.be.a('string');
                expect(data.keyId).to.be("");
                expect(data.keyServer).to.be.a('string');
                expect(data.keyServer).to.be("");
                expect(data.privateKey).to.be.a('string');
                expect(data.privateKey).to.be("");
                expect(data.address).to.be.a('string');
                expect(data.address).to.be("");
                expect(data.recordStatus).to.be.a('string');
                expect(data.recordStatus).to.be("");
                expect(data.isActive).to.be.a('boolean');
                expect(data.isActive).to.be(false);
                expect(data.createDate).to.be.a(Date);
                expect(data.createDate).to.be(new Date());
                expect(data.updateDate).to.be.a(Date);
                expect(data.updateDate).to.be(new Date());

                      }
            }
            expect(data.first).to.be.a('boolean');
            expect(data.first).to.be(false);
            expect(data.last).to.be.a('boolean');
            expect(data.last).to.be(false);
            expect(data._number).to.be.a('number');
            expect(data._number).to.be(0);
            expect(data.numberOfElements).to.be.a('number');
            expect(data.numberOfElements).to.be(0);
            expect(data.size).to.be.a('number');
            expect(data.size).to.be(0);
            {
              let dataCtr = data.sort;
              expect(dataCtr).to.be.an(Array);
              expect(dataCtr).to.not.be.empty();
              for (let p in dataCtr) {
                let data = dataCtr[p];
                expect(data).to.be.a(MoleculeApiDocumentation.Sort);
                expect(data.ascending).to.be.a('boolean');
                expect(data.ascending).to.be(true);
                expect(data.descending).to.be.a('boolean');
                expect(data.descending).to.be(false);
                expect(data.direction).to.be.a('string');
                expect(data.direction).to.be("DESC");
                expect(data.ignoreCase).to.be.a('boolean');
                expect(data.ignoreCase).to.be(false);
                expect(data.nullHandling).to.be.a('string');
                expect(data.nullHandling).to.be("NATIVE");
                expect(data.property).to.be.a('string');
                expect(data.property).to.be("updateDate");

                      }
            }
            expect(data.totalElements).to.be.a('number');
            expect(data.totalElements).to.be("0");
            expect(data.totalPages).to.be.a('number');
            expect(data.totalPages).to.be(0);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('getWalletKeyUsingGet', function() {
        it('should call getWalletKeyUsingGet successfully', function(done) {
          // TODO: uncomment, update parameter values for getWalletKeyUsingGet call and complete the assertions
          /*
          var walletKeyId = "walletKeyId_example";

          instance.getWalletKeyUsingGet(walletKeyId, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(MoleculeApiDocumentation.WalletKeyResponse);
            expect(data.id).to.be.a('string');
            expect(data.id).to.be("""00000000-0000-0000-0000-000000000000");
            expect(data.keyId).to.be.a('string');
            expect(data.keyId).to.be("");
            expect(data.keyServer).to.be.a('string');
            expect(data.keyServer).to.be("");
            expect(data.privateKey).to.be.a('string');
            expect(data.privateKey).to.be("");
            expect(data.address).to.be.a('string');
            expect(data.address).to.be("");
            expect(data.recordStatus).to.be.a('string');
            expect(data.recordStatus).to.be("");
            expect(data.isActive).to.be.a('boolean');
            expect(data.isActive).to.be(false);
            expect(data.createDate).to.be.a(Date);
            expect(data.createDate).to.be(new Date());
            expect(data.updateDate).to.be.a(Date);
            expect(data.updateDate).to.be(new Date());

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
    });
  });

}));