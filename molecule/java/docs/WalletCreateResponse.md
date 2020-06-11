
# WalletCreateResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the wallet | 
**type** | **String** | Type of the wallet. Can be individual, business, trust, or contract | 
**clients** | [**List&lt;WalletCreateClient&gt;**](WalletCreateClient.md) | List of nucleus clients associated with the wallet and their association type | 
**tokenWhitelists** | [**List&lt;WalletCreateWhitelist&gt;**](WalletCreateWhitelist.md) | List of tokens where the wallet is whitelisted |  [optional]
**isActive** | **Boolean** | Indicates if the wallet is active. Defaults to true which indicates it is active and available to be used |  [optional]
**metadata** | **Object** | Custom information associated with the account in the format key:value |  [optional]
**secondaryId** | **String** |  |  [optional]
**id** | [**UUID**](UUID.md) | ID of the wallet record |  [optional]
**createDate** | **String** | Datetime the wallet record was created |  [optional]


