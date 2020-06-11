# molecule_api

MoleculeApi - the Ruby gem for the Hydrogen Molecule API

The Hydrogen Molecule API

Full documentation: [Molecule](https://www.hydrogenplatform.com/docs/molecule/v1/)

This SDK is automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen) project:

- API version: 1.0.0
- Package version: 1.0.0
- Build package: io.swagger.codegen.languages.RubyClientCodegen
- For more information, please visit [https://www.hydrogenplatform.com/contact](https://www.hydrogenplatform.com/contact)

## Installation

*Recommended: Use [rbenv](https://github.com/rbenv/rbenv#table-of-contents) or [rvm](http://rvm.io/rvm/install) to create a Ruby environment for installation and usage of the gem*

### Build a gem

To build the Ruby code into a gem:

```shell
gem build molecule_api.gemspec
```

Then either install the gem locally:

```shell
gem install ./molecule_api-1.0.0.gem
```
(for development, run `gem install --dev ./molecule_api-1.0.0.gem` to install the development dependencies)

or publish the gem to a gem hosting service, e.g. [RubyGems](https://rubygems.org/).

Finally add this to the Gemfile:

    gem 'molecule_api', '~> 1.0.0'

### Install from Git

If the Ruby gem is hosted at a git repository: https://github.com/GIT_USER_ID/GIT_REPO_ID, then add the following in the Gemfile:

    gem 'molecule_api', :git => 'https://github.com/GIT_USER_ID/GIT_REPO_ID.git'

### Include the Ruby code directly

Include the Ruby code directly using `-I` as follows:

```shell
ruby -Ilib script.rb
```

## Getting Started

Full usage documentation is available: [Molecule](https://www.hydrogenplatform.com/docs/molecule/v1/)

Please follow the [installation](#installation) procedure and then run the following code:
```ruby
# Load the gem
require 'molecule_api'

# Configuration
MoleculeApi.configure do |config|
  # Set the environment (optional, defaults to sandbox)
  # This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
  config.set_environment("sandbox")

  # Configure OAuth2 access token for authorization: oauth
  # Method 1: Fetch and set access token with client_id and client_secret
  config.access_token = config.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
  # Method 2: Set access token using an existing token
  config.access_token = 'MYACCESSTOKEN'
end

api_instance = MoleculeApi::MoleculeApi.new

token_id = 'token_id_example' # String | UUID of a token


begin
  #Delete a token
  api_instance.delete_token(token_id)
rescue MoleculeApi::ApiError => e
  puts "Exception when calling MoleculeApi->delete_token: #{e}"
end

```

## Documentation for API Endpoints

All URIs are relative to *https://api.hydrogenplatform.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*MoleculeApi::MoleculeApi* | [**delete_token**](docs/MoleculeApi.md#delete_token) | **DELETE** /molecule/v1/token/{token_id}/ | Delete a token
*MoleculeApi::MoleculeApi* | [**delete_webhook**](docs/MoleculeApi.md#delete_webhook) | **DELETE** /molecule/v1/webhook/{webhook_id}/ | Delete a webhook
*MoleculeApi::MoleculeApi* | [**get_currencies**](docs/MoleculeApi.md#get_currencies) | **GET** /molecule/v1/currency | Get information for all currencies defined for your firm
*MoleculeApi::MoleculeApi* | [**get_currency**](docs/MoleculeApi.md#get_currency) | **GET** /molecule/v1/currency/{currency_id}/ | Retrieve a currency
*MoleculeApi::MoleculeApi* | [**get_currency_balance**](docs/MoleculeApi.md#get_currency_balance) | **GET** /molecule/v1/currency_balance/{currency_balance_id} | Retrieve a currency balance
*MoleculeApi::MoleculeApi* | [**get_currency_balances**](docs/MoleculeApi.md#get_currency_balances) | **GET** /molecule/v1/currency_balance | Get information for all currency balances recorded in your application.
*MoleculeApi::MoleculeApi* | [**get_currency_transfer**](docs/MoleculeApi.md#get_currency_transfer) | **GET** /molecule/v1/currency_transfer/{currency_transfer_id} | Retrieve a currency transfer
*MoleculeApi::MoleculeApi* | [**get_currency_transfers**](docs/MoleculeApi.md#get_currency_transfers) | **GET** /molecule/v1/currency_transfer | Get information for all currency transfers
*MoleculeApi::MoleculeApi* | [**get_token**](docs/MoleculeApi.md#get_token) | **GET** /molecule/v1/token/{token_id}/ | Retrieve a token
*MoleculeApi::MoleculeApi* | [**get_token_balance**](docs/MoleculeApi.md#get_token_balance) | **GET** /molecule/v1/token_balance/{token_balance_id} | Retrieve a token balance
*MoleculeApi::MoleculeApi* | [**get_token_balances**](docs/MoleculeApi.md#get_token_balances) | **GET** /molecule/v1/token_balance | Get information for all token balances defined for your application.
*MoleculeApi::MoleculeApi* | [**get_token_supplies**](docs/MoleculeApi.md#get_token_supplies) | **GET** /molecule/v1/token_supply | Get information for all token supplies defined for your application.
*MoleculeApi::MoleculeApi* | [**get_token_supply**](docs/MoleculeApi.md#get_token_supply) | **GET** /molecule/v1/token_supply/{token_supply_id} | Retrieve a token supply
*MoleculeApi::MoleculeApi* | [**get_token_transfer**](docs/MoleculeApi.md#get_token_transfer) | **GET** /molecule/v1/token_transfer/{token_transfer_id} | Retrieve a token transfer
*MoleculeApi::MoleculeApi* | [**get_token_transfers**](docs/MoleculeApi.md#get_token_transfers) | **GET** /molecule/v1/token_transfer | Get information for all token transfers
*MoleculeApi::MoleculeApi* | [**get_tokens**](docs/MoleculeApi.md#get_tokens) | **GET** /molecule/v1/token | Get information for all tokens defined for your firm
*MoleculeApi::MoleculeApi* | [**get_transaction_status**](docs/MoleculeApi.md#get_transaction_status) | **GET** /molecule/v1/transaction_status/{transaction_status_id} | Retrieve status information for a specific transaction
*MoleculeApi::MoleculeApi* | [**get_transaction_statuses**](docs/MoleculeApi.md#get_transaction_statuses) | **GET** /molecule/v1/transaction_status | Get status information for all transactions
*MoleculeApi::MoleculeApi* | [**get_wallet**](docs/MoleculeApi.md#get_wallet) | **GET** /molecule/v1/wallet/{wallet_id}/ | Retrieve a wallet
*MoleculeApi::MoleculeApi* | [**get_wallet_key**](docs/MoleculeApi.md#get_wallet_key) | **GET** /molecule/v1/wallet_key/{wallet_key_id}/ | Retrieve a wallet key
*MoleculeApi::MoleculeApi* | [**get_wallet_keys**](docs/MoleculeApi.md#get_wallet_keys) | **GET** /molecule/v1/wallet_key | Get all wallet keys associated with wallets defined for your firm.
*MoleculeApi::MoleculeApi* | [**get_wallets**](docs/MoleculeApi.md#get_wallets) | **GET** /molecule/v1/wallet | Get information for all wallets defined for your firm
*MoleculeApi::MoleculeApi* | [**get_webhook**](docs/MoleculeApi.md#get_webhook) | **GET** /molecule/v1/webhook/{webhook_id}/ | Retrieve a webhook
*MoleculeApi::MoleculeApi* | [**get_webhooks**](docs/MoleculeApi.md#get_webhooks) | **GET** /molecule/v1/webhook | Get information for all webhooks defined for your firm
*MoleculeApi::MoleculeApi* | [**post_crowdsale_deploy**](docs/MoleculeApi.md#post_crowdsale_deploy) | **POST** /molecule/v1/crowdsale/deploy | Deploy a token's crowdsale contract.
*MoleculeApi::MoleculeApi* | [**post_crowdsale_fund**](docs/MoleculeApi.md#post_crowdsale_fund) | **POST** /molecule/v1/crowdsale/fund | Transfer tokens to a token's crowdsale address.
*MoleculeApi::MoleculeApi* | [**post_crowdsale_purchase**](docs/MoleculeApi.md#post_crowdsale_purchase) | **POST** /molecule/v1/crowdsale/purchase | Purchase tokens from a crowdsale contract
*MoleculeApi::MoleculeApi* | [**post_currency_transfer**](docs/MoleculeApi.md#post_currency_transfer) | **POST** /molecule/v1/currency_transfer | Transfer currency between wallets
*MoleculeApi::MoleculeApi* | [**post_token**](docs/MoleculeApi.md#post_token) | **POST** /molecule/v1/token | Create a token under your firm.
*MoleculeApi::MoleculeApi* | [**post_token_deploy**](docs/MoleculeApi.md#post_token_deploy) | **POST** /molecule/v1/token/deploy | Deploy a security token contract to blockchain.
*MoleculeApi::MoleculeApi* | [**post_token_transfer**](docs/MoleculeApi.md#post_token_transfer) | **POST** /molecule/v1/token_transfer | Transfer tokens between wallets
*MoleculeApi::MoleculeApi* | [**post_token_whitelist**](docs/MoleculeApi.md#post_token_whitelist) | **POST** /molecule/v1/token/whitelist | Add an investor to a token's whitelist
*MoleculeApi::MoleculeApi* | [**post_wallet**](docs/MoleculeApi.md#post_wallet) | **POST** /molecule/v1/wallet | Create a wallet under your firm.
*MoleculeApi::MoleculeApi* | [**post_wallet_key**](docs/MoleculeApi.md#post_wallet_key) | **POST** /molecule/v1/wallet_key | Associate an existing key pair with a wallet defined for your firm.
*MoleculeApi::MoleculeApi* | [**post_wallet_key_generator**](docs/MoleculeApi.md#post_wallet_key_generator) | **POST** /molecule/v1/wallet_key/generator | Generate a wallet key using the Key Service and associate with a wallet defined for your firm.
*MoleculeApi::MoleculeApi* | [**post_webhook**](docs/MoleculeApi.md#post_webhook) | **POST** /molecule/v1/webhook | Create a webhook under your firm.
*MoleculeApi::MoleculeApi* | [**update_token**](docs/MoleculeApi.md#update_token) | **PUT** /molecule/v1/token/{token_id}/ | Update a token
*MoleculeApi::MoleculeApi* | [**update_wallet**](docs/MoleculeApi.md#update_wallet) | **PUT** /molecule/v1/wallet/{wallet_id}/ | Update a wallet
*MoleculeApi::MoleculeApi* | [**update_webhook**](docs/MoleculeApi.md#update_webhook) | **PUT** /molecule/v1/webhook/{webhook_id}/ | Update a webhook


## Documentation for Models

 - [MoleculeApi::CrowdsaleDeployPayload](docs/CrowdsaleDeployPayload.md)
 - [MoleculeApi::CrowdsaleFundPayload](docs/CrowdsaleFundPayload.md)
 - [MoleculeApi::CrowdsalePurchasePayload](docs/CrowdsalePurchasePayload.md)
 - [MoleculeApi::CurrencyBalanceSpecificResponse](docs/CurrencyBalanceSpecificResponse.md)
 - [MoleculeApi::CurrencySpecificResponse](docs/CurrencySpecificResponse.md)
 - [MoleculeApi::CurrencyTransferPayload](docs/CurrencyTransferPayload.md)
 - [MoleculeApi::CurrencyTransferSpecificResponse](docs/CurrencyTransferSpecificResponse.md)
 - [MoleculeApi::OfferingSettingsCreatePayload](docs/OfferingSettingsCreatePayload.md)
 - [MoleculeApi::OfferingSettingsUpdatePayload](docs/OfferingSettingsUpdatePayload.md)
 - [MoleculeApi::Pagination](docs/Pagination.md)
 - [MoleculeApi::PaginationSort](docs/PaginationSort.md)
 - [MoleculeApi::SecondaryId](docs/SecondaryId.md)
 - [MoleculeApi::TokenBalanceSpecificResponse](docs/TokenBalanceSpecificResponse.md)
 - [MoleculeApi::TokenCreatePayload](docs/TokenCreatePayload.md)
 - [MoleculeApi::TokenDeployPayload](docs/TokenDeployPayload.md)
 - [MoleculeApi::TokenRestrictionsPayload](docs/TokenRestrictionsPayload.md)
 - [MoleculeApi::TokenSupplySpecificResponse](docs/TokenSupplySpecificResponse.md)
 - [MoleculeApi::TokenTransferPayload](docs/TokenTransferPayload.md)
 - [MoleculeApi::TokenTransferSpecificResponse](docs/TokenTransferSpecificResponse.md)
 - [MoleculeApi::TokenUpdatePayload](docs/TokenUpdatePayload.md)
 - [MoleculeApi::TokenWhitelistPayload](docs/TokenWhitelistPayload.md)
 - [MoleculeApi::TransactionStatusSpecificResponse](docs/TransactionStatusSpecificResponse.md)
 - [MoleculeApi::WalletCreateClient](docs/WalletCreateClient.md)
 - [MoleculeApi::WalletCreatePayload](docs/WalletCreatePayload.md)
 - [MoleculeApi::WalletCreateWhitelist](docs/WalletCreateWhitelist.md)
 - [MoleculeApi::WalletKeyCreatePayload](docs/WalletKeyCreatePayload.md)
 - [MoleculeApi::WalletKeyCreateResponse](docs/WalletKeyCreateResponse.md)
 - [MoleculeApi::WalletKeyGeneratorPayload](docs/WalletKeyGeneratorPayload.md)
 - [MoleculeApi::WalletUpdatePayload](docs/WalletUpdatePayload.md)
 - [MoleculeApi::WebhookCreatePayload](docs/WebhookCreatePayload.md)
 - [MoleculeApi::WebhookUpdatePayload](docs/WebhookUpdatePayload.md)
 - [MoleculeApi::CurrencyBalanceGetResponse](docs/CurrencyBalanceGetResponse.md)
 - [MoleculeApi::CurrencyGetResponse](docs/CurrencyGetResponse.md)
 - [MoleculeApi::CurrencyTransferGetResponse](docs/CurrencyTransferGetResponse.md)
 - [MoleculeApi::TokenBalanceGetResponse](docs/TokenBalanceGetResponse.md)
 - [MoleculeApi::TokenCreateResponse](docs/TokenCreateResponse.md)
 - [MoleculeApi::TokenGetResponse](docs/TokenGetResponse.md)
 - [MoleculeApi::TokenSupplyGetResponse](docs/TokenSupplyGetResponse.md)
 - [MoleculeApi::TokenTransferGetResponse](docs/TokenTransferGetResponse.md)
 - [MoleculeApi::TransactionStatusGetResponse](docs/TransactionStatusGetResponse.md)
 - [MoleculeApi::WalletCreateResponse](docs/WalletCreateResponse.md)
 - [MoleculeApi::WalletGetResponse](docs/WalletGetResponse.md)
 - [MoleculeApi::WalletKeyGetResponse](docs/WalletKeyGetResponse.md)
 - [MoleculeApi::WalletKeySpecificResponse](docs/WalletKeySpecificResponse.md)
 - [MoleculeApi::WebhookCreateResponse](docs/WebhookCreateResponse.md)
 - [MoleculeApi::WebhookGetResponse](docs/WebhookGetResponse.md)
 - [MoleculeApi::TokenSpecificResponse](docs/TokenSpecificResponse.md)
 - [MoleculeApi::WalletSpecificResponse](docs/WalletSpecificResponse.md)
 - [MoleculeApi::WebhookSpecificResponse](docs/WebhookSpecificResponse.md)


## Documentation for Authorization

Please see [this page](https://www.hydrogenplatform.com/docs/proton/v1/#Authentication) for additional authorization information.


### oauth

- **Type**: OAuth
- **Flow**: application
- **Token URL**: https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials


## Author

[https://www.hydrogenplatform.com/](https://www.hydrogenplatform.com/)