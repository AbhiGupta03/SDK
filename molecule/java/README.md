# hydrogen-molecule-api

Hydrogen Molecule API
- API version: 1.0.0
  - Build date: 2019-12-18T13:48:07.846-05:00

The Hydrogen Molecule API

  For more information, please visit [https://www.hydrogenplatform.com/contact](https://www.hydrogenplatform.com/contact)

Full documentation: [Molecule](https://www.hydrogenplatform.com/docs/molecule/v1/)

*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>hydrogenplatform</groupId>
  <artifactId>hydrogen-molecule-api</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "hydrogenplatform:hydrogen-molecule-api:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/hydrogen-molecule-api-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Full usage documentation is available: [Molecule](https://www.hydrogenplatform.com/docs/molecule/v1/)

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import molecule_api.*;
import molecule_api.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.MoleculeApi;

import java.io.File;
import java.util.*;

public class MoleculeApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        // Set the environment (optional, defaults to sandbox)
        // This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
        defaultClient.setEnvironment("sandbox");


        // Configure OAuth2 access token for authorization: oauth
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        // Method 1: Fetch and set access token with client_id and client_secret
        String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
        oauth.setAccessToken(token);
        // Method 2: Set access token using an existing token
        oauth.setAccessToken("MYACCESSTOKEN");

        MoleculeApi apiInstance = new MoleculeApi();
        UUID tokenId = new UUID(); // UUID | UUID of a token
        try {
            apiInstance.deleteToken(tokenId);
        } catch (ApiException e) {
            System.err.println("Exception when calling MoleculeApi#deleteToken");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

Full usage documentation is available: [Molecule](https://www.hydrogenplatform.com/docs/molecule/v1/)

All URIs are relative to *https://api.hydrogenplatform.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*MoleculeApi* | [**deleteToken**](docs/MoleculeApi.md#deleteToken) | **DELETE** /molecule/v1/token/{token_id}/ | Delete a token
*MoleculeApi* | [**deleteWebhook**](docs/MoleculeApi.md#deleteWebhook) | **DELETE** /molecule/v1/webhook/{webhook_id}/ | Delete a webhook
*MoleculeApi* | [**getCurrencies**](docs/MoleculeApi.md#getCurrencies) | **GET** /molecule/v1/currency | Get information for all currencies defined for your firm
*MoleculeApi* | [**getCurrency**](docs/MoleculeApi.md#getCurrency) | **GET** /molecule/v1/currency/{currency_id}/ | Retrieve a currency
*MoleculeApi* | [**getCurrencyBalance**](docs/MoleculeApi.md#getCurrencyBalance) | **GET** /molecule/v1/currency_balance/{currency_balance_id} | Retrieve a currency balance
*MoleculeApi* | [**getCurrencyBalances**](docs/MoleculeApi.md#getCurrencyBalances) | **GET** /molecule/v1/currency_balance | Get information for all currency balances recorded in your application.
*MoleculeApi* | [**getCurrencyTransfer**](docs/MoleculeApi.md#getCurrencyTransfer) | **GET** /molecule/v1/currency_transfer/{currency_transfer_id} | Retrieve a currency transfer
*MoleculeApi* | [**getCurrencyTransfers**](docs/MoleculeApi.md#getCurrencyTransfers) | **GET** /molecule/v1/currency_transfer | Get information for all currency transfers
*MoleculeApi* | [**getToken**](docs/MoleculeApi.md#getToken) | **GET** /molecule/v1/token/{token_id}/ | Retrieve a token
*MoleculeApi* | [**getTokenBalance**](docs/MoleculeApi.md#getTokenBalance) | **GET** /molecule/v1/token_balance/{token_balance_id} | Retrieve a token balance
*MoleculeApi* | [**getTokenBalances**](docs/MoleculeApi.md#getTokenBalances) | **GET** /molecule/v1/token_balance | Get information for all token balances defined for your application.
*MoleculeApi* | [**getTokenSupplies**](docs/MoleculeApi.md#getTokenSupplies) | **GET** /molecule/v1/token_supply | Get information for all token supplies defined for your application.
*MoleculeApi* | [**getTokenSupply**](docs/MoleculeApi.md#getTokenSupply) | **GET** /molecule/v1/token_supply/{token_supply_id} | Retrieve a token supply
*MoleculeApi* | [**getTokenTransfer**](docs/MoleculeApi.md#getTokenTransfer) | **GET** /molecule/v1/token_transfer/{token_transfer_id} | Retrieve a token transfer
*MoleculeApi* | [**getTokenTransfers**](docs/MoleculeApi.md#getTokenTransfers) | **GET** /molecule/v1/token_transfer | Get information for all token transfers
*MoleculeApi* | [**getTokens**](docs/MoleculeApi.md#getTokens) | **GET** /molecule/v1/token | Get information for all tokens defined for your firm
*MoleculeApi* | [**getTransactionStatus**](docs/MoleculeApi.md#getTransactionStatus) | **GET** /molecule/v1/transaction_status/{transaction_status_id} | Retrieve status information for a specific transaction
*MoleculeApi* | [**getTransactionStatuses**](docs/MoleculeApi.md#getTransactionStatuses) | **GET** /molecule/v1/transaction_status | Get status information for all transactions
*MoleculeApi* | [**getWallet**](docs/MoleculeApi.md#getWallet) | **GET** /molecule/v1/wallet/{wallet_id}/ | Retrieve a wallet
*MoleculeApi* | [**getWalletKey**](docs/MoleculeApi.md#getWalletKey) | **GET** /molecule/v1/wallet_key/{wallet_key_id}/ | Retrieve a wallet key
*MoleculeApi* | [**getWalletKeys**](docs/MoleculeApi.md#getWalletKeys) | **GET** /molecule/v1/wallet_key | Get all wallet keys associated with wallets defined for your firm.
*MoleculeApi* | [**getWallets**](docs/MoleculeApi.md#getWallets) | **GET** /molecule/v1/wallet | Get information for all wallets defined for your firm
*MoleculeApi* | [**getWebhook**](docs/MoleculeApi.md#getWebhook) | **GET** /molecule/v1/webhook/{webhook_id}/ | Retrieve a webhook
*MoleculeApi* | [**getWebhooks**](docs/MoleculeApi.md#getWebhooks) | **GET** /molecule/v1/webhook | Get information for all webhooks defined for your firm
*MoleculeApi* | [**postCrowdsaleDeploy**](docs/MoleculeApi.md#postCrowdsaleDeploy) | **POST** /molecule/v1/crowdsale/deploy | Deploy a token&#39;s crowdsale contract.
*MoleculeApi* | [**postCrowdsaleFund**](docs/MoleculeApi.md#postCrowdsaleFund) | **POST** /molecule/v1/crowdsale/fund | Transfer tokens to a token&#39;s crowdsale address.
*MoleculeApi* | [**postCrowdsalePurchase**](docs/MoleculeApi.md#postCrowdsalePurchase) | **POST** /molecule/v1/crowdsale/purchase | Purchase tokens from a crowdsale contract
*MoleculeApi* | [**postCurrencyTransfer**](docs/MoleculeApi.md#postCurrencyTransfer) | **POST** /molecule/v1/currency_transfer | Transfer currency between wallets
*MoleculeApi* | [**postToken**](docs/MoleculeApi.md#postToken) | **POST** /molecule/v1/token | Create a token under your firm.
*MoleculeApi* | [**postTokenDeploy**](docs/MoleculeApi.md#postTokenDeploy) | **POST** /molecule/v1/token/deploy | Deploy a security token contract to blockchain.
*MoleculeApi* | [**postTokenTransfer**](docs/MoleculeApi.md#postTokenTransfer) | **POST** /molecule/v1/token_transfer | Transfer tokens between wallets
*MoleculeApi* | [**postTokenWhitelist**](docs/MoleculeApi.md#postTokenWhitelist) | **POST** /molecule/v1/token/whitelist | Add an investor to a token&#39;s whitelist
*MoleculeApi* | [**postWallet**](docs/MoleculeApi.md#postWallet) | **POST** /molecule/v1/wallet | Create a wallet under your firm.
*MoleculeApi* | [**postWalletKey**](docs/MoleculeApi.md#postWalletKey) | **POST** /molecule/v1/wallet_key | Associate an existing key pair with a wallet defined for your firm.
*MoleculeApi* | [**postWalletKeyGenerator**](docs/MoleculeApi.md#postWalletKeyGenerator) | **POST** /molecule/v1/wallet_key/generator | Generate a wallet key using the Key Service and associate with a wallet defined for your firm.
*MoleculeApi* | [**postWebhook**](docs/MoleculeApi.md#postWebhook) | **POST** /molecule/v1/webhook | Create a webhook under your firm.
*MoleculeApi* | [**updateToken**](docs/MoleculeApi.md#updateToken) | **PUT** /molecule/v1/token/{token_id}/ | Update a token
*MoleculeApi* | [**updateWallet**](docs/MoleculeApi.md#updateWallet) | **PUT** /molecule/v1/wallet/{wallet_id}/ | Update a wallet
*MoleculeApi* | [**updateWebhook**](docs/MoleculeApi.md#updateWebhook) | **PUT** /molecule/v1/webhook/{webhook_id}/ | Update a webhook


## Documentation for Models

 - [CrowdsaleDeployPayload](docs/CrowdsaleDeployPayload.md)
 - [CrowdsaleFundPayload](docs/CrowdsaleFundPayload.md)
 - [CrowdsalePurchasePayload](docs/CrowdsalePurchasePayload.md)
 - [CurrencyBalanceSpecificResponse](docs/CurrencyBalanceSpecificResponse.md)
 - [CurrencySpecificResponse](docs/CurrencySpecificResponse.md)
 - [CurrencyTransferPayload](docs/CurrencyTransferPayload.md)
 - [CurrencyTransferSpecificResponse](docs/CurrencyTransferSpecificResponse.md)
 - [OfferingSettingsCreatePayload](docs/OfferingSettingsCreatePayload.md)
 - [OfferingSettingsUpdatePayload](docs/OfferingSettingsUpdatePayload.md)
 - [Pagination](docs/Pagination.md)
 - [PaginationSort](docs/PaginationSort.md)
 - [TokenBalanceSpecificResponse](docs/TokenBalanceSpecificResponse.md)
 - [TokenCreatePayload](docs/TokenCreatePayload.md)
 - [TokenDeployPayload](docs/TokenDeployPayload.md)
 - [TokenRestrictionsPayload](docs/TokenRestrictionsPayload.md)
 - [TokenSupplySpecificResponse](docs/TokenSupplySpecificResponse.md)
 - [TokenTransferPayload](docs/TokenTransferPayload.md)
 - [TokenTransferSpecificResponse](docs/TokenTransferSpecificResponse.md)
 - [TokenUpdatePayload](docs/TokenUpdatePayload.md)
 - [TokenWhitelistPayload](docs/TokenWhitelistPayload.md)
 - [TransactionStatusSpecificResponse](docs/TransactionStatusSpecificResponse.md)
 - [WalletCreateClient](docs/WalletCreateClient.md)
 - [WalletCreatePayload](docs/WalletCreatePayload.md)
 - [WalletCreateWhitelist](docs/WalletCreateWhitelist.md)
 - [WalletKeyCreatePayload](docs/WalletKeyCreatePayload.md)
 - [WalletKeyCreateResponse](docs/WalletKeyCreateResponse.md)
 - [WalletKeyGeneratorPayload](docs/WalletKeyGeneratorPayload.md)
 - [WalletUpdatePayload](docs/WalletUpdatePayload.md)
 - [WebhookCreatePayload](docs/WebhookCreatePayload.md)
 - [WebhookUpdatePayload](docs/WebhookUpdatePayload.md)
 - [CurrencyBalanceGetResponse](docs/CurrencyBalanceGetResponse.md)
 - [CurrencyGetResponse](docs/CurrencyGetResponse.md)
 - [CurrencyTransferGetResponse](docs/CurrencyTransferGetResponse.md)
 - [TokenBalanceGetResponse](docs/TokenBalanceGetResponse.md)
 - [TokenCreateResponse](docs/TokenCreateResponse.md)
 - [TokenGetResponse](docs/TokenGetResponse.md)
 - [TokenSupplyGetResponse](docs/TokenSupplyGetResponse.md)
 - [TokenTransferGetResponse](docs/TokenTransferGetResponse.md)
 - [TransactionStatusGetResponse](docs/TransactionStatusGetResponse.md)
 - [WalletCreateResponse](docs/WalletCreateResponse.md)
 - [WalletGetResponse](docs/WalletGetResponse.md)
 - [WalletKeyGetResponse](docs/WalletKeyGetResponse.md)
 - [WalletKeySpecificResponse](docs/WalletKeySpecificResponse.md)
 - [WebhookCreateResponse](docs/WebhookCreateResponse.md)
 - [WebhookGetResponse](docs/WebhookGetResponse.md)
 - [TokenSpecificResponse](docs/TokenSpecificResponse.md)
 - [WalletSpecificResponse](docs/WalletSpecificResponse.md)
 - [WebhookSpecificResponse](docs/WebhookSpecificResponse.md)


## Documentation for Authorization

Please see [this page](https://www.hydrogenplatform.com/docs/nucleus/v1/#Authentication) for additional authorization information.

Authentication schemes defined for the API:
### oauth

- **Type**: OAuth
- **Flow**: application
- **Token URL**: https://api.hydrogenplatform.com/authorization/v1/oauth/token?grant_type=client_credentials


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

[https://www.hydrogenplatform.com/](https://www.hydrogenplatform.com/)