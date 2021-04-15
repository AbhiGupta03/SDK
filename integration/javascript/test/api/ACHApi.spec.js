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

  beforeEach(function() {
    instance = new HydrogenIntegrationApi.ACHApi();
  });

  describe('(package)', function() {
    describe('ACHApi', function() {
      describe('cancelAchTransferUsingDelete', function() {
        it('should call cancelAchTransferUsingDelete successfully', function(done) {
          // TODO: uncomment, update parameter values for cancelAchTransferUsingDelete call and complete the assertions
          /*
          var nucleusFundingId = "nucleusFundingId_example";

          instance.cancelAchTransferUsingDelete(nucleusFundingId, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(HydrogenIntegrationApi.AchTransferResponseVO);
            expect(data.message).to.be.a('string');
            expect(data.message).to.be("");
            expect(data.nucleusFundingId).to.be.a('string');
            expect(data.nucleusFundingId).to.be("""00000000-0000-0000-0000-000000000000");
            expect(data.status).to.be.a('string');
            expect(data.status).to.be("");
            expect(data.statusDetails).to.be.a('string');
            expect(data.statusDetails).to.be("");
            expect(data.vendorName).to.be.a('string');
            expect(data.vendorName).to.be("");
            expect(data.vendorRequest).to.be.a(Object);
            expect(data.vendorRequest).to.be();
            expect(data.vendorResponse).to.be.a(Object);
            expect(data.vendorResponse).to.be();

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('createAchCardLinkUsingPost', function() {
        it('should call createAchCardLinkUsingPost successfully', function(done) {
          // TODO: uncomment, update parameter values for createAchCardLinkUsingPost call and complete the assertions
          /*
          var cardLinkRequestCO = new HydrogenIntegrationApi.AchCardLinkRequestCO();
          cardLinkRequestCO.nucleusClientId = """00000000-0000-0000-0000-000000000000";
          cardLinkRequestCO.vendorRequest = ;

          instance.createAchCardLinkUsingPost(cardLinkRequestCO, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(HydrogenIntegrationApi.AchCardLinkResponseVO);
            expect(data.message).to.be.a('string');
            expect(data.message).to.be("");
            expect(data.nucleusBankLinkId).to.be.a('string');
            expect(data.nucleusBankLinkId).to.be("""00000000-0000-0000-0000-000000000000");
            expect(data.nucleusClientId).to.be.a('string');
            expect(data.nucleusClientId).to.be("""00000000-0000-0000-0000-000000000000");
            expect(data.vendorName).to.be.a('string');
            expect(data.vendorName).to.be("");
            expect(data.vendorResponse).to.be.a(Object);
            expect(data.vendorResponse).to.be();

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('createBankLinkUsingPost', function() {
        it('should call createBankLinkUsingPost successfully', function(done) {
          // TODO: uncomment, update parameter values for createBankLinkUsingPost call and complete the assertions
          /*
          var achBankLinkRequestCO = new HydrogenIntegrationApi.AchBankLinkRequestCO();
          achBankLinkRequestCO.isReserve = false;
          achBankLinkRequestCO.nucleusBankLinkId = """00000000-0000-0000-0000-000000000000";
          achBankLinkRequestCO.vendorRequest = ;

          instance.createBankLinkUsingPost(achBankLinkRequestCO, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(HydrogenIntegrationApi.AchBankLinkResponseVO);
            expect(data.message).to.be.a('string');
            expect(data.message).to.be("");
            expect(data.nucleusBankLinkId).to.be.a('string');
            expect(data.nucleusBankLinkId).to.be("""00000000-0000-0000-0000-000000000000");
            expect(data.nucleusClientId).to.be.a('string');
            expect(data.nucleusClientId).to.be("""00000000-0000-0000-0000-000000000000");
            expect(data.status).to.be.a('string');
            expect(data.status).to.be("");
            expect(data.vendorName).to.be.a('string');
            expect(data.vendorName).to.be("");
            expect(data.vendorRequestData).to.be.a(HydrogenIntegrationApi.BankLinkVendorDataVO);
                  expect(data.vendorRequestData.bankAccountName).to.be.a('string');
              expect(data.vendorRequestData.bankAccountName).to.be("");
              expect(data.vendorRequestData.name).to.be.a('string');
              expect(data.vendorRequestData.name).to.be("");
            expect(data.vendorResponse).to.be.a(Object);
            expect(data.vendorResponse).to.be();

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('createBusinessUsingPost', function() {
        it('should call createBusinessUsingPost successfully', function(done) {
          // TODO: uncomment, update parameter values for createBusinessUsingPost call and complete the assertions
          /*
          var businessRequest = new HydrogenIntegrationApi.AchBusinessRequestCO();
          businessRequest.kycRequired = false;
          businessRequest.nucleusBusinessId = """00000000-0000-0000-0000-000000000000";
          businessRequest.vendorRequest = ;

          instance.createBusinessUsingPost(businessRequest, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(HydrogenIntegrationApi.BaseResponseVO);
            expect(data.message).to.be.a('string');
            expect(data.message).to.be("");
            expect(data.vendorName).to.be.a('string');
            expect(data.vendorName).to.be("");
            expect(data.vendorResponse).to.be.a(Object);
            expect(data.vendorResponse).to.be();

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('createClientUsingPost', function() {
        it('should call createClientUsingPost successfully', function(done) {
          // TODO: uncomment, update parameter values for createClientUsingPost call and complete the assertions
          /*
          var clientRequest = new HydrogenIntegrationApi.AchClientRequestCO();
          clientRequest.kycRequired = false;
          clientRequest.nucleusClientId = """00000000-0000-0000-0000-000000000000";
          clientRequest.vendorRequest = ;

          instance.createClientUsingPost(clientRequest, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(HydrogenIntegrationApi.AchClientResponseVO);
            expect(data.message).to.be.a('string');
            expect(data.message).to.be("");
            expect(data.nucleusClientId).to.be.a('string');
            expect(data.nucleusClientId).to.be("""00000000-0000-0000-0000-000000000000");
            expect(data.status).to.be.a('string');
            expect(data.status).to.be("");
            expect(data.vendorName).to.be.a('string');
            expect(data.vendorName).to.be("");
            expect(data.vendorResponse).to.be.a(Object);
            expect(data.vendorResponse).to.be();

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('deleteBankLinkUsingDelete', function() {
        it('should call deleteBankLinkUsingDelete successfully', function(done) {
          // TODO: uncomment, update parameter values for deleteBankLinkUsingDelete call and complete the assertions
          /*
          var nucleusBankLinkId = "nucleusBankLinkId_example";

          instance.deleteBankLinkUsingDelete(nucleusBankLinkId, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(HydrogenIntegrationApi.AchBankLinkResponseVO);
            expect(data.message).to.be.a('string');
            expect(data.message).to.be("");
            expect(data.nucleusBankLinkId).to.be.a('string');
            expect(data.nucleusBankLinkId).to.be("""00000000-0000-0000-0000-000000000000");
            expect(data.nucleusClientId).to.be.a('string');
            expect(data.nucleusClientId).to.be("""00000000-0000-0000-0000-000000000000");
            expect(data.status).to.be.a('string');
            expect(data.status).to.be("");
            expect(data.vendorName).to.be.a('string');
            expect(data.vendorName).to.be("");
            expect(data.vendorRequestData).to.be.a(HydrogenIntegrationApi.BankLinkVendorDataVO);
                  expect(data.vendorRequestData.bankAccountName).to.be.a('string');
              expect(data.vendorRequestData.bankAccountName).to.be("");
              expect(data.vendorRequestData.name).to.be.a('string');
              expect(data.vendorRequestData.name).to.be("");
            expect(data.vendorResponse).to.be.a(Object);
            expect(data.vendorResponse).to.be();

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('getAchTransferUsingGet', function() {
        it('should call getAchTransferUsingGet successfully', function(done) {
          // TODO: uncomment, update parameter values for getAchTransferUsingGet call and complete the assertions
          /*
          var nucleusFundingId = "nucleusFundingId_example";

          instance.getAchTransferUsingGet(nucleusFundingId, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(HydrogenIntegrationApi.AchTransferResponseVO);
            expect(data.message).to.be.a('string');
            expect(data.message).to.be("");
            expect(data.nucleusFundingId).to.be.a('string');
            expect(data.nucleusFundingId).to.be("""00000000-0000-0000-0000-000000000000");
            expect(data.status).to.be.a('string');
            expect(data.status).to.be("");
            expect(data.statusDetails).to.be.a('string');
            expect(data.statusDetails).to.be("");
            expect(data.vendorName).to.be.a('string');
            expect(data.vendorName).to.be("");
            expect(data.vendorRequest).to.be.a(Object);
            expect(data.vendorRequest).to.be();
            expect(data.vendorResponse).to.be.a(Object);
            expect(data.vendorResponse).to.be();

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('getBalanceUsingGet', function() {
        it('should call getBalanceUsingGet successfully', function(done) {
          // TODO: uncomment, update parameter values for getBalanceUsingGet call and complete the assertions
          /*
          var portfolioId = "portfolioId_example";
          var opts = {};
          opts.endDate = new Date("2013-10-20");
          opts.startDate = new Date("2013-10-20");

          instance.getBalanceUsingGet(portfolioId, opts, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(HydrogenIntegrationApi.AchBalanceResponseVO);
            expect(data.message).to.be.a('string');
            expect(data.message).to.be("");
            {
              let dataCtr = data.nucleusAssetSizesPosted;
              expect(dataCtr).to.be.an(Array);
              expect(dataCtr).to.not.be.empty();
              for (let p in dataCtr) {
                let data = dataCtr[p];
                expect(data).to.be.a(Object);
                expect(data).to.be();
              }
            }
            {
              let dataCtr = data.nucleusAssetSizesUpdated;
              expect(dataCtr).to.be.an(Array);
              expect(dataCtr).to.not.be.empty();
              for (let p in dataCtr) {
                let data = dataCtr[p];
                expect(data).to.be.a(Object);
                expect(data).to.be();
              }
            }
            expect(data.nucleusPortfolioId).to.be.a('string');
            expect(data.nucleusPortfolioId).to.be("""00000000-0000-0000-0000-000000000000");
            expect(data.vendorName).to.be.a('string');
            expect(data.vendorName).to.be("");
            expect(data.vendorResponse).to.be.a(Object);
            expect(data.vendorResponse).to.be();

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('getBankLinkUsingGet', function() {
        it('should call getBankLinkUsingGet successfully', function(done) {
          // TODO: uncomment, update parameter values for getBankLinkUsingGet call and complete the assertions
          /*
          var nucleusBankLinkId = "nucleusBankLinkId_example";

          instance.getBankLinkUsingGet(nucleusBankLinkId, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(HydrogenIntegrationApi.AchBankLinkResponseVO);
            expect(data.message).to.be.a('string');
            expect(data.message).to.be("");
            expect(data.nucleusBankLinkId).to.be.a('string');
            expect(data.nucleusBankLinkId).to.be("""00000000-0000-0000-0000-000000000000");
            expect(data.nucleusClientId).to.be.a('string');
            expect(data.nucleusClientId).to.be("""00000000-0000-0000-0000-000000000000");
            expect(data.status).to.be.a('string');
            expect(data.status).to.be("");
            expect(data.vendorName).to.be.a('string');
            expect(data.vendorName).to.be("");
            expect(data.vendorRequestData).to.be.a(HydrogenIntegrationApi.BankLinkVendorDataVO);
                  expect(data.vendorRequestData.bankAccountName).to.be.a('string');
              expect(data.vendorRequestData.bankAccountName).to.be("");
              expect(data.vendorRequestData.name).to.be.a('string');
              expect(data.vendorRequestData.name).to.be("");
            expect(data.vendorResponse).to.be.a(Object);
            expect(data.vendorResponse).to.be();

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('getBankLinksForReserveAccountUsingGet', function() {
        it('should call getBankLinksForReserveAccountUsingGet successfully', function(done) {
          // TODO: uncomment getBankLinksForReserveAccountUsingGet call and complete the assertions
          /*

          instance.getBankLinksForReserveAccountUsingGet(function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            let dataCtr = data;
            expect(dataCtr).to.be.an(Array);
            expect(dataCtr).to.not.be.empty();
            for (let p in dataCtr) {
              let data = dataCtr[p];
              expect(data).to.be.a(HydrogenIntegrationApi.AchBankLinkResponseVO);
              expect(data.message).to.be.a('string');
              expect(data.message).to.be("");
              expect(data.nucleusBankLinkId).to.be.a('string');
              expect(data.nucleusBankLinkId).to.be("""00000000-0000-0000-0000-000000000000");
              expect(data.nucleusClientId).to.be.a('string');
              expect(data.nucleusClientId).to.be("""00000000-0000-0000-0000-000000000000");
              expect(data.status).to.be.a('string');
              expect(data.status).to.be("");
              expect(data.vendorName).to.be.a('string');
              expect(data.vendorName).to.be("");
              expect(data.vendorRequestData).to.be.a(HydrogenIntegrationApi.BankLinkVendorDataVO);
                    expect(data.vendorRequestData.bankAccountName).to.be.a('string');
                expect(data.vendorRequestData.bankAccountName).to.be("");
                expect(data.vendorRequestData.name).to.be.a('string');
                expect(data.vendorRequestData.name).to.be("");
              expect(data.vendorResponse).to.be.a(Object);
              expect(data.vendorResponse).to.be();
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('getClientBankLinksUsingGet', function() {
        it('should call getClientBankLinksUsingGet successfully', function(done) {
          // TODO: uncomment, update parameter values for getClientBankLinksUsingGet call and complete the assertions
          /*
          var nucleusClientId = "nucleusClientId_example";

          instance.getClientBankLinksUsingGet(nucleusClientId, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            let dataCtr = data;
            expect(dataCtr).to.be.an(Array);
            expect(dataCtr).to.not.be.empty();
            for (let p in dataCtr) {
              let data = dataCtr[p];
              expect(data).to.be.a(HydrogenIntegrationApi.AchBankLinkResponseVO);
              expect(data.message).to.be.a('string');
              expect(data.message).to.be("");
              expect(data.nucleusBankLinkId).to.be.a('string');
              expect(data.nucleusBankLinkId).to.be("""00000000-0000-0000-0000-000000000000");
              expect(data.nucleusClientId).to.be.a('string');
              expect(data.nucleusClientId).to.be("""00000000-0000-0000-0000-000000000000");
              expect(data.status).to.be.a('string');
              expect(data.status).to.be("");
              expect(data.vendorName).to.be.a('string');
              expect(data.vendorName).to.be("");
              expect(data.vendorRequestData).to.be.a(HydrogenIntegrationApi.BankLinkVendorDataVO);
                    expect(data.vendorRequestData.bankAccountName).to.be.a('string');
                expect(data.vendorRequestData.bankAccountName).to.be("");
                expect(data.vendorRequestData.name).to.be.a('string');
                expect(data.vendorRequestData.name).to.be("");
              expect(data.vendorResponse).to.be.a(Object);
              expect(data.vendorResponse).to.be();
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('getListOfClientAchTransfersUsingGet', function() {
        it('should call getListOfClientAchTransfersUsingGet successfully', function(done) {
          // TODO: uncomment, update parameter values for getListOfClientAchTransfersUsingGet call and complete the assertions
          /*
          var nucleusClientId = "nucleusClientId_example";
          var opts = {};
          opts.page = 0;
          opts.size = 25;

          instance.getListOfClientAchTransfersUsingGet(nucleusClientId, opts, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(HydrogenIntegrationApi.PageAchTransferResponseVO);
            {
              let dataCtr = data.content;
              expect(dataCtr).to.be.an(Array);
              expect(dataCtr).to.not.be.empty();
              for (let p in dataCtr) {
                let data = dataCtr[p];
                expect(data).to.be.a(HydrogenIntegrationApi.AchTransferResponseVO);
                expect(data.message).to.be.a('string');
                expect(data.message).to.be("");
                expect(data.nucleusFundingId).to.be.a('string');
                expect(data.nucleusFundingId).to.be("""00000000-0000-0000-0000-000000000000");
                expect(data.status).to.be.a('string');
                expect(data.status).to.be("");
                expect(data.statusDetails).to.be.a('string');
                expect(data.statusDetails).to.be("");
                expect(data.vendorName).to.be.a('string');
                expect(data.vendorName).to.be("");
                expect(data.vendorRequest).to.be.a(Object);
                expect(data.vendorRequest).to.be();
                expect(data.vendorResponse).to.be.a(Object);
                expect(data.vendorResponse).to.be();

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
                expect(data).to.be.a(HydrogenIntegrationApi.Sort);
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
      describe('getListOfTenantAchTransfersUsingGet', function() {
        it('should call getListOfTenantAchTransfersUsingGet successfully', function(done) {
          // TODO: uncomment, update parameter values for getListOfTenantAchTransfersUsingGet call and complete the assertions
          /*
          var opts = {};
          opts.endDate = new Date("2013-10-20");
          opts.page = 0;
          opts.size = 25;
          opts.startDate = new Date("2013-10-20");
          opts.status = "status_example";

          instance.getListOfTenantAchTransfersUsingGet(opts, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(HydrogenIntegrationApi.PageAchTransferResponseVO);
            {
              let dataCtr = data.content;
              expect(dataCtr).to.be.an(Array);
              expect(dataCtr).to.not.be.empty();
              for (let p in dataCtr) {
                let data = dataCtr[p];
                expect(data).to.be.a(HydrogenIntegrationApi.AchTransferResponseVO);
                expect(data.message).to.be.a('string');
                expect(data.message).to.be("");
                expect(data.nucleusFundingId).to.be.a('string');
                expect(data.nucleusFundingId).to.be("""00000000-0000-0000-0000-000000000000");
                expect(data.status).to.be.a('string');
                expect(data.status).to.be("");
                expect(data.statusDetails).to.be.a('string');
                expect(data.statusDetails).to.be("");
                expect(data.vendorName).to.be.a('string');
                expect(data.vendorName).to.be("");
                expect(data.vendorRequest).to.be.a(Object);
                expect(data.vendorRequest).to.be();
                expect(data.vendorResponse).to.be.a(Object);
                expect(data.vendorResponse).to.be();

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
                expect(data).to.be.a(HydrogenIntegrationApi.Sort);
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
      describe('submitAchTransferUsingPost', function() {
        it('should call submitAchTransferUsingPost successfully', function(done) {
          // TODO: uncomment, update parameter values for submitAchTransferUsingPost call and complete the assertions
          /*
          var transferRequest = new HydrogenIntegrationApi.AchTransferRequestCO();
          transferRequest.isReserve = false;
          transferRequest.nucleusFundingId = """00000000-0000-0000-0000-000000000000";
          transferRequest.vendorRequest = ;

          instance.submitAchTransferUsingPost(transferRequest, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(HydrogenIntegrationApi.AchTransferResponseVO);
            expect(data.message).to.be.a('string');
            expect(data.message).to.be("");
            expect(data.nucleusFundingId).to.be.a('string');
            expect(data.nucleusFundingId).to.be("""00000000-0000-0000-0000-000000000000");
            expect(data.status).to.be.a('string');
            expect(data.status).to.be("");
            expect(data.statusDetails).to.be.a('string');
            expect(data.statusDetails).to.be("");
            expect(data.vendorName).to.be.a('string');
            expect(data.vendorName).to.be("");
            expect(data.vendorRequest).to.be.a(Object);
            expect(data.vendorRequest).to.be();
            expect(data.vendorResponse).to.be.a(Object);
            expect(data.vendorResponse).to.be();

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('updateBankLinkUsingPut', function() {
        it('should call updateBankLinkUsingPut successfully', function(done) {
          // TODO: uncomment, update parameter values for updateBankLinkUsingPut call and complete the assertions
          /*
          var nucleusBankLinkId = "nucleusBankLinkId_example";

          instance.updateBankLinkUsingPut(nucleusBankLinkId, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(HydrogenIntegrationApi.AchBankLinkResponseVO);
            expect(data.message).to.be.a('string');
            expect(data.message).to.be("");
            expect(data.nucleusBankLinkId).to.be.a('string');
            expect(data.nucleusBankLinkId).to.be("""00000000-0000-0000-0000-000000000000");
            expect(data.nucleusClientId).to.be.a('string');
            expect(data.nucleusClientId).to.be("""00000000-0000-0000-0000-000000000000");
            expect(data.status).to.be.a('string');
            expect(data.status).to.be("");
            expect(data.vendorName).to.be.a('string');
            expect(data.vendorName).to.be("");
            expect(data.vendorRequestData).to.be.a(HydrogenIntegrationApi.BankLinkVendorDataVO);
                  expect(data.vendorRequestData.bankAccountName).to.be.a('string');
              expect(data.vendorRequestData.bankAccountName).to.be("");
              expect(data.vendorRequestData.name).to.be.a('string');
              expect(data.vendorRequestData.name).to.be("");
            expect(data.vendorResponse).to.be.a(Object);
            expect(data.vendorResponse).to.be();

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