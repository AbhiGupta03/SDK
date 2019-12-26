/**
 * Hydrogen Molecule API
 * The Hydrogen Molecule API
 *
 * OpenAPI spec version: 1.0.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.8-SNAPSHOT
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
    factory(root.expect, root.molecule_api);
  }
}(this, function(expect, molecule_api) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new molecule_api.MoleculeApi();
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

  describe('MoleculeApi', function() {
    describe('deleteToken', function() {
      it('should call deleteToken successfully', function(done) {
        //uncomment below and update the code to test deleteToken
        //instance.deleteToken(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('deleteWebhook', function() {
      it('should call deleteWebhook successfully', function(done) {
        //uncomment below and update the code to test deleteWebhook
        //instance.deleteWebhook(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getCurrencies', function() {
      it('should call getCurrencies successfully', function(done) {
        //uncomment below and update the code to test getCurrencies
        //instance.getCurrencies(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getCurrency', function() {
      it('should call getCurrency successfully', function(done) {
        //uncomment below and update the code to test getCurrency
        //instance.getCurrency(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getCurrencyBalance', function() {
      it('should call getCurrencyBalance successfully', function(done) {
        //uncomment below and update the code to test getCurrencyBalance
        //instance.getCurrencyBalance(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getCurrencyBalances', function() {
      it('should call getCurrencyBalances successfully', function(done) {
        //uncomment below and update the code to test getCurrencyBalances
        //instance.getCurrencyBalances(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getCurrencyTransfer', function() {
      it('should call getCurrencyTransfer successfully', function(done) {
        //uncomment below and update the code to test getCurrencyTransfer
        //instance.getCurrencyTransfer(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getCurrencyTransfers', function() {
      it('should call getCurrencyTransfers successfully', function(done) {
        //uncomment below and update the code to test getCurrencyTransfers
        //instance.getCurrencyTransfers(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getToken', function() {
      it('should call getToken successfully', function(done) {
        //uncomment below and update the code to test getToken
        //instance.getToken(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getTokenBalance', function() {
      it('should call getTokenBalance successfully', function(done) {
        //uncomment below and update the code to test getTokenBalance
        //instance.getTokenBalance(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getTokenBalances', function() {
      it('should call getTokenBalances successfully', function(done) {
        //uncomment below and update the code to test getTokenBalances
        //instance.getTokenBalances(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getTokenSupplies', function() {
      it('should call getTokenSupplies successfully', function(done) {
        //uncomment below and update the code to test getTokenSupplies
        //instance.getTokenSupplies(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getTokenSupply', function() {
      it('should call getTokenSupply successfully', function(done) {
        //uncomment below and update the code to test getTokenSupply
        //instance.getTokenSupply(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getTokenTransfer', function() {
      it('should call getTokenTransfer successfully', function(done) {
        //uncomment below and update the code to test getTokenTransfer
        //instance.getTokenTransfer(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getTokenTransfers', function() {
      it('should call getTokenTransfers successfully', function(done) {
        //uncomment below and update the code to test getTokenTransfers
        //instance.getTokenTransfers(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getTokens', function() {
      it('should call getTokens successfully', function(done) {
        //uncomment below and update the code to test getTokens
        //instance.getTokens(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getTransactionStatus', function() {
      it('should call getTransactionStatus successfully', function(done) {
        //uncomment below and update the code to test getTransactionStatus
        //instance.getTransactionStatus(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getTransactionStatuses', function() {
      it('should call getTransactionStatuses successfully', function(done) {
        //uncomment below and update the code to test getTransactionStatuses
        //instance.getTransactionStatuses(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getWallet', function() {
      it('should call getWallet successfully', function(done) {
        //uncomment below and update the code to test getWallet
        //instance.getWallet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getWalletKey', function() {
      it('should call getWalletKey successfully', function(done) {
        //uncomment below and update the code to test getWalletKey
        //instance.getWalletKey(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getWalletKeys', function() {
      it('should call getWalletKeys successfully', function(done) {
        //uncomment below and update the code to test getWalletKeys
        //instance.getWalletKeys(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getWallets', function() {
      it('should call getWallets successfully', function(done) {
        //uncomment below and update the code to test getWallets
        //instance.getWallets(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getWebhook', function() {
      it('should call getWebhook successfully', function(done) {
        //uncomment below and update the code to test getWebhook
        //instance.getWebhook(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getWebhooks', function() {
      it('should call getWebhooks successfully', function(done) {
        //uncomment below and update the code to test getWebhooks
        //instance.getWebhooks(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('postCrowdsaleDeploy', function() {
      it('should call postCrowdsaleDeploy successfully', function(done) {
        //uncomment below and update the code to test postCrowdsaleDeploy
        //instance.postCrowdsaleDeploy(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('postCrowdsaleFund', function() {
      it('should call postCrowdsaleFund successfully', function(done) {
        //uncomment below and update the code to test postCrowdsaleFund
        //instance.postCrowdsaleFund(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('postCrowdsalePurchase', function() {
      it('should call postCrowdsalePurchase successfully', function(done) {
        //uncomment below and update the code to test postCrowdsalePurchase
        //instance.postCrowdsalePurchase(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('postCurrencyTransfer', function() {
      it('should call postCurrencyTransfer successfully', function(done) {
        //uncomment below and update the code to test postCurrencyTransfer
        //instance.postCurrencyTransfer(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('postToken', function() {
      it('should call postToken successfully', function(done) {
        //uncomment below and update the code to test postToken
        //instance.postToken(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('postTokenDeploy', function() {
      it('should call postTokenDeploy successfully', function(done) {
        //uncomment below and update the code to test postTokenDeploy
        //instance.postTokenDeploy(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('postTokenTransfer', function() {
      it('should call postTokenTransfer successfully', function(done) {
        //uncomment below and update the code to test postTokenTransfer
        //instance.postTokenTransfer(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('postTokenWhitelist', function() {
      it('should call postTokenWhitelist successfully', function(done) {
        //uncomment below and update the code to test postTokenWhitelist
        //instance.postTokenWhitelist(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('postWallet', function() {
      it('should call postWallet successfully', function(done) {
        //uncomment below and update the code to test postWallet
        //instance.postWallet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('postWalletKey', function() {
      it('should call postWalletKey successfully', function(done) {
        //uncomment below and update the code to test postWalletKey
        //instance.postWalletKey(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('postWalletKeyGenerator', function() {
      it('should call postWalletKeyGenerator successfully', function(done) {
        //uncomment below and update the code to test postWalletKeyGenerator
        //instance.postWalletKeyGenerator(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('postWebhook', function() {
      it('should call postWebhook successfully', function(done) {
        //uncomment below and update the code to test postWebhook
        //instance.postWebhook(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('updateToken', function() {
      it('should call updateToken successfully', function(done) {
        //uncomment below and update the code to test updateToken
        //instance.updateToken(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('updateWallet', function() {
      it('should call updateWallet successfully', function(done) {
        //uncomment below and update the code to test updateWallet
        //instance.updateWallet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('updateWebhook', function() {
      it('should call updateWebhook successfully', function(done) {
        //uncomment below and update the code to test updateWebhook
        //instance.updateWebhook(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));
