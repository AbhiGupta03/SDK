# molecule_api.MoleculeApi

All URIs are relative to *https://api.hydrogenplatform.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_token**](MoleculeApi.md#delete_token) | **DELETE** /molecule/v1/token/{token_id}/ | Delete a token
[**delete_webhook**](MoleculeApi.md#delete_webhook) | **DELETE** /molecule/v1/webhook/{webhook_id}/ | Delete a webhook
[**get_currencies**](MoleculeApi.md#get_currencies) | **GET** /molecule/v1/currency | Get information for all currencies defined for your firm
[**get_currency**](MoleculeApi.md#get_currency) | **GET** /molecule/v1/currency/{currency_id}/ | Retrieve a currency
[**get_currency_balance**](MoleculeApi.md#get_currency_balance) | **GET** /molecule/v1/currency_balance/{currency_balance_id} | Retrieve a currency balance
[**get_currency_balances**](MoleculeApi.md#get_currency_balances) | **GET** /molecule/v1/currency_balance | Get information for all currency balances recorded in your application.
[**get_currency_transfer**](MoleculeApi.md#get_currency_transfer) | **GET** /molecule/v1/currency_transfer/{currency_transfer_id} | Retrieve a currency transfer
[**get_currency_transfers**](MoleculeApi.md#get_currency_transfers) | **GET** /molecule/v1/currency_transfer | Get information for all currency transfers
[**get_token**](MoleculeApi.md#get_token) | **GET** /molecule/v1/token/{token_id}/ | Retrieve a token
[**get_token_balance**](MoleculeApi.md#get_token_balance) | **GET** /molecule/v1/token_balance/{token_balance_id} | Retrieve a token balance
[**get_token_balances**](MoleculeApi.md#get_token_balances) | **GET** /molecule/v1/token_balance | Get information for all token balances defined for your application.
[**get_token_supplies**](MoleculeApi.md#get_token_supplies) | **GET** /molecule/v1/token_supply | Get information for all token supplies defined for your application.
[**get_token_supply**](MoleculeApi.md#get_token_supply) | **GET** /molecule/v1/token_supply/{token_supply_id} | Retrieve a token supply
[**get_token_transfer**](MoleculeApi.md#get_token_transfer) | **GET** /molecule/v1/token_transfer/{token_transfer_id} | Retrieve a token transfer
[**get_token_transfers**](MoleculeApi.md#get_token_transfers) | **GET** /molecule/v1/token_transfer | Get information for all token transfers
[**get_tokens**](MoleculeApi.md#get_tokens) | **GET** /molecule/v1/token | Get information for all tokens defined for your firm
[**get_transaction_status**](MoleculeApi.md#get_transaction_status) | **GET** /molecule/v1/transaction_status/{transaction_status_id} | Retrieve status information for a specific transaction
[**get_transaction_statuses**](MoleculeApi.md#get_transaction_statuses) | **GET** /molecule/v1/transaction_status | Get status information for all transactions
[**get_wallet**](MoleculeApi.md#get_wallet) | **GET** /molecule/v1/wallet/{wallet_id}/ | Retrieve a wallet
[**get_wallet_key**](MoleculeApi.md#get_wallet_key) | **GET** /molecule/v1/wallet_key/{wallet_key_id}/ | Retrieve a wallet key
[**get_wallet_keys**](MoleculeApi.md#get_wallet_keys) | **GET** /molecule/v1/wallet_key | Get all wallet keys associated with wallets defined for your firm.
[**get_wallets**](MoleculeApi.md#get_wallets) | **GET** /molecule/v1/wallet | Get information for all wallets defined for your firm
[**get_webhook**](MoleculeApi.md#get_webhook) | **GET** /molecule/v1/webhook/{webhook_id}/ | Retrieve a webhook
[**get_webhooks**](MoleculeApi.md#get_webhooks) | **GET** /molecule/v1/webhook | Get information for all webhooks defined for your firm
[**post_crowdsale_deploy**](MoleculeApi.md#post_crowdsale_deploy) | **POST** /molecule/v1/crowdsale/deploy | Deploy a token&#39;s crowdsale contract.
[**post_crowdsale_fund**](MoleculeApi.md#post_crowdsale_fund) | **POST** /molecule/v1/crowdsale/fund | Transfer tokens to a token&#39;s crowdsale address.
[**post_crowdsale_purchase**](MoleculeApi.md#post_crowdsale_purchase) | **POST** /molecule/v1/crowdsale/purchase | Purchase tokens from a crowdsale contract
[**post_currency_transfer**](MoleculeApi.md#post_currency_transfer) | **POST** /molecule/v1/currency_transfer | Transfer currency between wallets
[**post_token**](MoleculeApi.md#post_token) | **POST** /molecule/v1/token | Create a token under your firm.
[**post_token_deploy**](MoleculeApi.md#post_token_deploy) | **POST** /molecule/v1/token/deploy | Deploy a security token contract to blockchain.
[**post_token_transfer**](MoleculeApi.md#post_token_transfer) | **POST** /molecule/v1/token_transfer | Transfer tokens between wallets
[**post_token_whitelist**](MoleculeApi.md#post_token_whitelist) | **POST** /molecule/v1/token/whitelist | Add an investor to a token&#39;s whitelist
[**post_wallet**](MoleculeApi.md#post_wallet) | **POST** /molecule/v1/wallet | Create a wallet under your firm.
[**post_wallet_key**](MoleculeApi.md#post_wallet_key) | **POST** /molecule/v1/wallet_key | Associate an existing key pair with a wallet defined for your firm.
[**post_wallet_key_generator**](MoleculeApi.md#post_wallet_key_generator) | **POST** /molecule/v1/wallet_key/generator | Generate a wallet key using the Key Service and associate with a wallet defined for your firm.
[**post_webhook**](MoleculeApi.md#post_webhook) | **POST** /molecule/v1/webhook | Create a webhook under your firm.
[**update_token**](MoleculeApi.md#update_token) | **PUT** /molecule/v1/token/{token_id}/ | Update a token
[**update_wallet**](MoleculeApi.md#update_wallet) | **PUT** /molecule/v1/wallet/{wallet_id}/ | Update a wallet
[**update_webhook**](MoleculeApi.md#update_webhook) | **PUT** /molecule/v1/webhook/{webhook_id}/ | Update a webhook


# **delete_token**
> delete_token(token_id)

Delete a token

### Example
```python
from __future__ import print_function
import time
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = molecule_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = molecule_api.MoleculeApi(molecule_api.ApiClient(configuration))
token_id = 'token_id_example' # str | UUID of a token

try:
    # Delete a token
    api_instance.delete_token(token_id)
except ApiException as e:
    print("Exception when calling MoleculeApi->delete_token: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_id** | [**str**](.md)| UUID of a token | 

### Return type

void (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_webhook**
> delete_webhook(webhook_id)

Delete a webhook

### Example
```python
from __future__ import print_function
import time
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = molecule_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = molecule_api.MoleculeApi(molecule_api.ApiClient(configuration))
webhook_id = 'webhook_id_example' # str | UUID of a webhook

try:
    # Delete a webhook
    api_instance.delete_webhook(webhook_id)
except ApiException as e:
    print("Exception when calling MoleculeApi->delete_webhook: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhook_id** | [**str**](.md)| UUID of a webhook | 

### Return type

void (empty response body)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_currencies**
> CurrencyGetResponse get_currencies(page=page, size=size, order_by=order_by, ascending=ascending, get_latest=get_latest, symbol=symbol)

Get information for all currencies defined for your firm

### Example
```python
from __future__ import print_function
import time
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = molecule_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = molecule_api.MoleculeApi(molecule_api.ApiClient(configuration))
page = 0 # int | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 (optional) (default to 0)
size = 25 # int | The number or records to be included per page. The default is 25. There is no max value. (optional) (default to 25)
order_by = 'update_date' # str | The field in the response body to order the list by. Default is update_date. (optional) (default to update_date)
ascending = false # bool | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. (optional) (default to false)
get_latest = true # bool | Retrieves the latest entry (optional)
symbol = 'symbol_example' # str |  (optional)

try:
    # Get information for all currencies defined for your firm
    api_response = api_instance.get_currencies(page=page, size=size, order_by=order_by, ascending=ascending, get_latest=get_latest, symbol=symbol)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_currencies: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **int**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **order_by** | **str**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **bool**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **get_latest** | **bool**| Retrieves the latest entry | [optional] 
 **symbol** | **str**|  | [optional] 

### Return type

[**CurrencyGetResponse**](CurrencyGetResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_currency**
> CurrencySpecificResponse get_currency(currency_id)

Retrieve a currency

### Example
```python
from __future__ import print_function
import time
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = molecule_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = molecule_api.MoleculeApi(molecule_api.ApiClient(configuration))
currency_id = 'currency_id_example' # str | UUID of a currency

try:
    # Retrieve a currency
    api_response = api_instance.get_currency(currency_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_currency: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency_id** | [**str**](.md)| UUID of a currency | 

### Return type

[**CurrencySpecificResponse**](CurrencySpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_currency_balance**
> CurrencyBalanceSpecificResponse get_currency_balance(currency_balance_id)

Retrieve a currency balance

### Example
```python
from __future__ import print_function
import time
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = molecule_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = molecule_api.MoleculeApi(molecule_api.ApiClient(configuration))
currency_balance_id = 'currency_balance_id_example' # str | UUID of a currency balance

try:
    # Retrieve a currency balance
    api_response = api_instance.get_currency_balance(currency_balance_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_currency_balance: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency_balance_id** | [**str**](.md)| UUID of a currency balance | 

### Return type

[**CurrencyBalanceSpecificResponse**](CurrencyBalanceSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_currency_balances**
> CurrencyBalanceGetResponse get_currency_balances(page=page, size=size, order_by=order_by, ascending=ascending, get_latest=get_latest, currency_id=currency_id, wallet_id=wallet_id)

Get information for all currency balances recorded in your application.

### Example
```python
from __future__ import print_function
import time
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = molecule_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = molecule_api.MoleculeApi(molecule_api.ApiClient(configuration))
page = 0 # int | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 (optional) (default to 0)
size = 25 # int | The number or records to be included per page. The default is 25. There is no max value. (optional) (default to 25)
order_by = 'update_date' # str | The field in the response body to order the list by. Default is update_date. (optional) (default to update_date)
ascending = false # bool | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. (optional) (default to false)
get_latest = true # bool | Retrieves the latest entry (optional)
currency_id = 'currency_id_example' # str | Filters results by their currency ids (optional)
wallet_id = 'wallet_id_example' # str | Filters results by their wallet ids (optional)

try:
    # Get information for all currency balances recorded in your application.
    api_response = api_instance.get_currency_balances(page=page, size=size, order_by=order_by, ascending=ascending, get_latest=get_latest, currency_id=currency_id, wallet_id=wallet_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_currency_balances: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **int**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **order_by** | **str**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **bool**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **get_latest** | **bool**| Retrieves the latest entry | [optional] 
 **currency_id** | **str**| Filters results by their currency ids | [optional] 
 **wallet_id** | **str**| Filters results by their wallet ids | [optional] 

### Return type

[**CurrencyBalanceGetResponse**](CurrencyBalanceGetResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_currency_transfer**
> CurrencyTransferSpecificResponse get_currency_transfer(currency_transfer_id)

Retrieve a currency transfer

### Example
```python
from __future__ import print_function
import time
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = molecule_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = molecule_api.MoleculeApi(molecule_api.ApiClient(configuration))
currency_transfer_id = 'currency_transfer_id_example' # str | UUID of a currency transfer

try:
    # Retrieve a currency transfer
    api_response = api_instance.get_currency_transfer(currency_transfer_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_currency_transfer: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency_transfer_id** | [**str**](.md)| UUID of a currency transfer | 

### Return type

[**CurrencyTransferSpecificResponse**](CurrencyTransferSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_currency_transfers**
> CurrencyTransferGetResponse get_currency_transfers(page=page, size=size, order_by=order_by, ascending=ascending, get_latest=get_latest, currency_id=currency_id, wallet_id=wallet_id, sender_wallet_id=sender_wallet_id, receiver_wallet_id=receiver_wallet_id)

Get information for all currency transfers

### Example
```python
from __future__ import print_function
import time
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = molecule_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = molecule_api.MoleculeApi(molecule_api.ApiClient(configuration))
page = 0 # int | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 (optional) (default to 0)
size = 25 # int | The number or records to be included per page. The default is 25. There is no max value. (optional) (default to 25)
order_by = 'update_date' # str | The field in the response body to order the list by. Default is update_date. (optional) (default to update_date)
ascending = false # bool | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. (optional) (default to false)
get_latest = true # bool | Retrieves the latest entry (optional)
currency_id = 'currency_id_example' # str | Filters results by their currency ids (optional)
wallet_id = 'wallet_id_example' # str | Filters results by their wallet ids (optional)
sender_wallet_id = 'sender_wallet_id_example' # str | Filters results by their sender wallet ids (optional)
receiver_wallet_id = 'receiver_wallet_id_example' # str | Filters results by their receiver wallet ids (optional)

try:
    # Get information for all currency transfers
    api_response = api_instance.get_currency_transfers(page=page, size=size, order_by=order_by, ascending=ascending, get_latest=get_latest, currency_id=currency_id, wallet_id=wallet_id, sender_wallet_id=sender_wallet_id, receiver_wallet_id=receiver_wallet_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_currency_transfers: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **int**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **order_by** | **str**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **bool**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **get_latest** | **bool**| Retrieves the latest entry | [optional] 
 **currency_id** | **str**| Filters results by their currency ids | [optional] 
 **wallet_id** | **str**| Filters results by their wallet ids | [optional] 
 **sender_wallet_id** | **str**| Filters results by their sender wallet ids | [optional] 
 **receiver_wallet_id** | **str**| Filters results by their receiver wallet ids | [optional] 

### Return type

[**CurrencyTransferGetResponse**](CurrencyTransferGetResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_token**
> TokenSpecificResponse get_token(token_id)

Retrieve a token

### Example
```python
from __future__ import print_function
import time
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = molecule_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = molecule_api.MoleculeApi(molecule_api.ApiClient(configuration))
token_id = 'token_id_example' # str | UUID of a token

try:
    # Retrieve a token
    api_response = api_instance.get_token(token_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_token: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_id** | [**str**](.md)| UUID of a token | 

### Return type

[**TokenSpecificResponse**](TokenSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_token_balance**
> TokenBalanceSpecificResponse get_token_balance(token_balance_id)

Retrieve a token balance

### Example
```python
from __future__ import print_function
import time
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = molecule_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = molecule_api.MoleculeApi(molecule_api.ApiClient(configuration))
token_balance_id = 'token_balance_id_example' # str | UUID of a token balance

try:
    # Retrieve a token balance
    api_response = api_instance.get_token_balance(token_balance_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_token_balance: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_balance_id** | [**str**](.md)| UUID of a token balance | 

### Return type

[**TokenBalanceSpecificResponse**](TokenBalanceSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_token_balances**
> TokenBalanceGetResponse get_token_balances(page=page, size=size, order_by=order_by, ascending=ascending, get_latest=get_latest, token_id=token_id, wallet_id=wallet_id)

Get information for all token balances defined for your application.

### Example
```python
from __future__ import print_function
import time
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = molecule_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = molecule_api.MoleculeApi(molecule_api.ApiClient(configuration))
page = 0 # int | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 (optional) (default to 0)
size = 25 # int | The number or records to be included per page. The default is 25. There is no max value. (optional) (default to 25)
order_by = 'update_date' # str | The field in the response body to order the list by. Default is update_date. (optional) (default to update_date)
ascending = false # bool | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. (optional) (default to false)
get_latest = true # bool | Retrieves the latest entry (optional)
token_id = 'token_id_example' # str | Filters results by their token ids (optional)
wallet_id = 'wallet_id_example' # str | Filters results by their wallet ids (optional)

try:
    # Get information for all token balances defined for your application.
    api_response = api_instance.get_token_balances(page=page, size=size, order_by=order_by, ascending=ascending, get_latest=get_latest, token_id=token_id, wallet_id=wallet_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_token_balances: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **int**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **order_by** | **str**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **bool**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **get_latest** | **bool**| Retrieves the latest entry | [optional] 
 **token_id** | **str**| Filters results by their token ids | [optional] 
 **wallet_id** | **str**| Filters results by their wallet ids | [optional] 

### Return type

[**TokenBalanceGetResponse**](TokenBalanceGetResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_token_supplies**
> TokenSupplyGetResponse get_token_supplies(page=page, size=size, order_by=order_by, ascending=ascending, get_latest=get_latest, token_id=token_id)

Get information for all token supplies defined for your application.

### Example
```python
from __future__ import print_function
import time
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = molecule_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = molecule_api.MoleculeApi(molecule_api.ApiClient(configuration))
page = 0 # int | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 (optional) (default to 0)
size = 25 # int | The number or records to be included per page. The default is 25. There is no max value. (optional) (default to 25)
order_by = 'update_date' # str | The field in the response body to order the list by. Default is update_date. (optional) (default to update_date)
ascending = false # bool | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. (optional) (default to false)
get_latest = true # bool | Retrieves the latest entry (optional)
token_id = 'token_id_example' # str | Filters results by their token ids (optional)

try:
    # Get information for all token supplies defined for your application.
    api_response = api_instance.get_token_supplies(page=page, size=size, order_by=order_by, ascending=ascending, get_latest=get_latest, token_id=token_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_token_supplies: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **int**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **order_by** | **str**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **bool**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **get_latest** | **bool**| Retrieves the latest entry | [optional] 
 **token_id** | **str**| Filters results by their token ids | [optional] 

### Return type

[**TokenSupplyGetResponse**](TokenSupplyGetResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_token_supply**
> TokenSupplySpecificResponse get_token_supply(token_supply_id)

Retrieve a token supply

### Example
```python
from __future__ import print_function
import time
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = molecule_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = molecule_api.MoleculeApi(molecule_api.ApiClient(configuration))
token_supply_id = 'token_supply_id_example' # str | UUID of a token supply

try:
    # Retrieve a token supply
    api_response = api_instance.get_token_supply(token_supply_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_token_supply: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_supply_id** | [**str**](.md)| UUID of a token supply | 

### Return type

[**TokenSupplySpecificResponse**](TokenSupplySpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_token_transfer**
> TokenTransferSpecificResponse get_token_transfer(token_transfer_id)

Retrieve a token transfer

### Example
```python
from __future__ import print_function
import time
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = molecule_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = molecule_api.MoleculeApi(molecule_api.ApiClient(configuration))
token_transfer_id = 'token_transfer_id_example' # str | UUID of a token transfer

try:
    # Retrieve a token transfer
    api_response = api_instance.get_token_transfer(token_transfer_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_token_transfer: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_transfer_id** | [**str**](.md)| UUID of a token transfer | 

### Return type

[**TokenTransferSpecificResponse**](TokenTransferSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_token_transfers**
> TokenTransferGetResponse get_token_transfers(page=page, size=size, order_by=order_by, ascending=ascending, get_latest=get_latest, token_id=token_id, wallet_id=wallet_id, sender_wallet_id=sender_wallet_id, receiver_wallet_id=receiver_wallet_id)

Get information for all token transfers

### Example
```python
from __future__ import print_function
import time
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = molecule_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = molecule_api.MoleculeApi(molecule_api.ApiClient(configuration))
page = 0 # int | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 (optional) (default to 0)
size = 25 # int | The number or records to be included per page. The default is 25. There is no max value. (optional) (default to 25)
order_by = 'update_date' # str | The field in the response body to order the list by. Default is update_date. (optional) (default to update_date)
ascending = false # bool | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. (optional) (default to false)
get_latest = true # bool | Retrieves the latest entry (optional)
token_id = 'token_id_example' # str | Filters results by their token ids (optional)
wallet_id = 'wallet_id_example' # str | Filters results by their wallet ids (optional)
sender_wallet_id = 'sender_wallet_id_example' # str | Filters results by their sender wallet ids (optional)
receiver_wallet_id = 'receiver_wallet_id_example' # str | Filters results by their receiver wallet ids (optional)

try:
    # Get information for all token transfers
    api_response = api_instance.get_token_transfers(page=page, size=size, order_by=order_by, ascending=ascending, get_latest=get_latest, token_id=token_id, wallet_id=wallet_id, sender_wallet_id=sender_wallet_id, receiver_wallet_id=receiver_wallet_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_token_transfers: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **int**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **order_by** | **str**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **bool**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **get_latest** | **bool**| Retrieves the latest entry | [optional] 
 **token_id** | **str**| Filters results by their token ids | [optional] 
 **wallet_id** | **str**| Filters results by their wallet ids | [optional] 
 **sender_wallet_id** | **str**| Filters results by their sender wallet ids | [optional] 
 **receiver_wallet_id** | **str**| Filters results by their receiver wallet ids | [optional] 

### Return type

[**TokenTransferGetResponse**](TokenTransferGetResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_tokens**
> TokenGetResponse get_tokens(page=page, size=size, order_by=order_by, ascending=ascending, get_latest=get_latest)

Get information for all tokens defined for your firm

### Example
```python
from __future__ import print_function
import time
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = molecule_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = molecule_api.MoleculeApi(molecule_api.ApiClient(configuration))
page = 0 # int | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 (optional) (default to 0)
size = 25 # int | The number or records to be included per page. The default is 25. There is no max value. (optional) (default to 25)
order_by = 'update_date' # str | The field in the response body to order the list by. Default is update_date. (optional) (default to update_date)
ascending = false # bool | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. (optional) (default to false)
get_latest = true # bool | Retrieves the latest entry (optional)

try:
    # Get information for all tokens defined for your firm
    api_response = api_instance.get_tokens(page=page, size=size, order_by=order_by, ascending=ascending, get_latest=get_latest)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_tokens: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **int**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **order_by** | **str**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **bool**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **get_latest** | **bool**| Retrieves the latest entry | [optional] 

### Return type

[**TokenGetResponse**](TokenGetResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_transaction_status**
> TransactionStatusSpecificResponse get_transaction_status(transaction_status_id)

Retrieve status information for a specific transaction

### Example
```python
from __future__ import print_function
import time
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = molecule_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = molecule_api.MoleculeApi(molecule_api.ApiClient(configuration))
transaction_status_id = 'transaction_status_id_example' # str | UUID of a transaction status

try:
    # Retrieve status information for a specific transaction
    api_response = api_instance.get_transaction_status(transaction_status_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_transaction_status: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transaction_status_id** | [**str**](.md)| UUID of a transaction status | 

### Return type

[**TransactionStatusSpecificResponse**](TransactionStatusSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_transaction_statuses**
> TransactionStatusGetResponse get_transaction_statuses(page=page, size=size, order_by=order_by, ascending=ascending, get_latest=get_latest, wallet_id=wallet_id, hash=hash, status=status)

Get status information for all transactions

### Example
```python
from __future__ import print_function
import time
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = molecule_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = molecule_api.MoleculeApi(molecule_api.ApiClient(configuration))
page = 0 # int | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 (optional) (default to 0)
size = 25 # int | The number or records to be included per page. The default is 25. There is no max value. (optional) (default to 25)
order_by = 'update_date' # str | The field in the response body to order the list by. Default is update_date. (optional) (default to update_date)
ascending = false # bool | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. (optional) (default to false)
get_latest = true # bool | Retrieves the latest entry (optional)
wallet_id = 'wallet_id_example' # str | Filters results by their wallet ids (optional)
hash = 'hash_example' # str |  (optional)
status = 'status_example' # str |  (optional)

try:
    # Get status information for all transactions
    api_response = api_instance.get_transaction_statuses(page=page, size=size, order_by=order_by, ascending=ascending, get_latest=get_latest, wallet_id=wallet_id, hash=hash, status=status)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_transaction_statuses: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **int**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **order_by** | **str**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **bool**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **get_latest** | **bool**| Retrieves the latest entry | [optional] 
 **wallet_id** | **str**| Filters results by their wallet ids | [optional] 
 **hash** | **str**|  | [optional] 
 **status** | **str**|  | [optional] 

### Return type

[**TransactionStatusGetResponse**](TransactionStatusGetResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_wallet**
> WalletSpecificResponse get_wallet(wallet_id)

Retrieve a wallet

### Example
```python
from __future__ import print_function
import time
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = molecule_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = molecule_api.MoleculeApi(molecule_api.ApiClient(configuration))
wallet_id = 'wallet_id_example' # str | UUID of a wallet

try:
    # Retrieve a wallet
    api_response = api_instance.get_wallet(wallet_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_wallet: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_id** | [**str**](.md)| UUID of a wallet | 

### Return type

[**WalletSpecificResponse**](WalletSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_wallet_key**
> WalletKeySpecificResponse get_wallet_key(wallet_key_id)

Retrieve a wallet key

### Example
```python
from __future__ import print_function
import time
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = molecule_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = molecule_api.MoleculeApi(molecule_api.ApiClient(configuration))
wallet_key_id = 'wallet_key_id_example' # str | UUID of a wallet key

try:
    # Retrieve a wallet key
    api_response = api_instance.get_wallet_key(wallet_key_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_wallet_key: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_key_id** | [**str**](.md)| UUID of a wallet key | 

### Return type

[**WalletKeySpecificResponse**](WalletKeySpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_wallet_keys**
> WalletKeyGetResponse get_wallet_keys(page=page, size=size, order_by=order_by, ascending=ascending, get_latest=get_latest)

Get all wallet keys associated with wallets defined for your firm.

### Example
```python
from __future__ import print_function
import time
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = molecule_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = molecule_api.MoleculeApi(molecule_api.ApiClient(configuration))
page = 0 # int | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 (optional) (default to 0)
size = 25 # int | The number or records to be included per page. The default is 25. There is no max value. (optional) (default to 25)
order_by = 'update_date' # str | The field in the response body to order the list by. Default is update_date. (optional) (default to update_date)
ascending = false # bool | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. (optional) (default to false)
get_latest = true # bool | Retrieves the latest entry (optional)

try:
    # Get all wallet keys associated with wallets defined for your firm.
    api_response = api_instance.get_wallet_keys(page=page, size=size, order_by=order_by, ascending=ascending, get_latest=get_latest)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_wallet_keys: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **int**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **order_by** | **str**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **bool**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **get_latest** | **bool**| Retrieves the latest entry | [optional] 

### Return type

[**WalletKeyGetResponse**](WalletKeyGetResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_wallets**
> WalletGetResponse get_wallets(page=page, size=size, order_by=order_by, ascending=ascending, get_latest=get_latest, nucleus_client_id=nucleus_client_id, is_primary=is_primary)

Get information for all wallets defined for your firm

### Example
```python
from __future__ import print_function
import time
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = molecule_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = molecule_api.MoleculeApi(molecule_api.ApiClient(configuration))
page = 0 # int | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 (optional) (default to 0)
size = 25 # int | The number or records to be included per page. The default is 25. There is no max value. (optional) (default to 25)
order_by = 'update_date' # str | The field in the response body to order the list by. Default is update_date. (optional) (default to update_date)
ascending = false # bool | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. (optional) (default to false)
get_latest = true # bool | Retrieves the latest entry (optional)
nucleus_client_id = 'nucleus_client_id_example' # str |  (optional)
is_primary = true # bool |  (optional)

try:
    # Get information for all wallets defined for your firm
    api_response = api_instance.get_wallets(page=page, size=size, order_by=order_by, ascending=ascending, get_latest=get_latest, nucleus_client_id=nucleus_client_id, is_primary=is_primary)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_wallets: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **int**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **order_by** | **str**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **bool**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **get_latest** | **bool**| Retrieves the latest entry | [optional] 
 **nucleus_client_id** | **str**|  | [optional] 
 **is_primary** | **bool**|  | [optional] 

### Return type

[**WalletGetResponse**](WalletGetResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_webhook**
> WebhookSpecificResponse get_webhook(webhook_id)

Retrieve a webhook

### Example
```python
from __future__ import print_function
import time
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = molecule_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = molecule_api.MoleculeApi(molecule_api.ApiClient(configuration))
webhook_id = 'webhook_id_example' # str | UUID of a webhook

try:
    # Retrieve a webhook
    api_response = api_instance.get_webhook(webhook_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_webhook: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhook_id** | [**str**](.md)| UUID of a webhook | 

### Return type

[**WebhookSpecificResponse**](WebhookSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_webhooks**
> WebhookGetResponse get_webhooks(page=page, size=size, order_by=order_by, ascending=ascending, get_latest=get_latest)

Get information for all webhooks defined for your firm

### Example
```python
from __future__ import print_function
import time
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = molecule_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = molecule_api.MoleculeApi(molecule_api.ApiClient(configuration))
page = 0 # int | Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 (optional) (default to 0)
size = 25 # int | The number or records to be included per page. The default is 25. There is no max value. (optional) (default to 25)
order_by = 'update_date' # str | The field in the response body to order the list by. Default is update_date. (optional) (default to update_date)
ascending = false # bool | If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. (optional) (default to false)
get_latest = true # bool | Retrieves the latest entry (optional)

try:
    # Get information for all webhooks defined for your firm
    api_response = api_instance.get_webhooks(page=page, size=size, order_by=order_by, ascending=ascending, get_latest=get_latest)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->get_webhooks: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int**| Page number for the page that should be returned as the starting page. For example, if this is specified as 0, then the first page of the results will be the shown, if it is set as 3 then the third page of the results will be shown, and so on. The default is 0 | [optional] [default to 0]
 **size** | **int**| The number or records to be included per page. The default is 25. There is no max value. | [optional] [default to 25]
 **order_by** | **str**| The field in the response body to order the list by. Default is update_date. | [optional] [default to update_date]
 **ascending** | **bool**| If true, order the results in ascending order. For an alphabetical result this would be A-Z. If false, order the results in descending order. For an alphabetical result this would be Z-A. Default is false which would order by descending. | [optional] [default to false]
 **get_latest** | **bool**| Retrieves the latest entry | [optional] 

### Return type

[**WebhookGetResponse**](WebhookGetResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_crowdsale_deploy**
> TransactionStatusSpecificResponse post_crowdsale_deploy(payload)

Deploy a token's crowdsale contract.

### Example
```python
from __future__ import print_function
import time
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = molecule_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = molecule_api.MoleculeApi(molecule_api.ApiClient(configuration))
payload = molecule_api.CrowdsaleDeployPayload() # CrowdsaleDeployPayload | 

try:
    # Deploy a token's crowdsale contract.
    api_response = api_instance.post_crowdsale_deploy(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->post_crowdsale_deploy: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**CrowdsaleDeployPayload**](CrowdsaleDeployPayload.md)|  | 

### Return type

[**TransactionStatusSpecificResponse**](TransactionStatusSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_crowdsale_fund**
> TransactionStatusSpecificResponse post_crowdsale_fund(payload)

Transfer tokens to a token's crowdsale address.

### Example
```python
from __future__ import print_function
import time
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = molecule_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = molecule_api.MoleculeApi(molecule_api.ApiClient(configuration))
payload = molecule_api.CrowdsaleFundPayload() # CrowdsaleFundPayload | 

try:
    # Transfer tokens to a token's crowdsale address.
    api_response = api_instance.post_crowdsale_fund(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->post_crowdsale_fund: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**CrowdsaleFundPayload**](CrowdsaleFundPayload.md)|  | 

### Return type

[**TransactionStatusSpecificResponse**](TransactionStatusSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_crowdsale_purchase**
> TransactionStatusSpecificResponse post_crowdsale_purchase(payload)

Purchase tokens from a crowdsale contract

### Example
```python
from __future__ import print_function
import time
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = molecule_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = molecule_api.MoleculeApi(molecule_api.ApiClient(configuration))
payload = molecule_api.CrowdsalePurchasePayload() # CrowdsalePurchasePayload | 

try:
    # Purchase tokens from a crowdsale contract
    api_response = api_instance.post_crowdsale_purchase(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->post_crowdsale_purchase: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**CrowdsalePurchasePayload**](CrowdsalePurchasePayload.md)|  | 

### Return type

[**TransactionStatusSpecificResponse**](TransactionStatusSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_currency_transfer**
> TransactionStatusSpecificResponse post_currency_transfer(payload)

Transfer currency between wallets

### Example
```python
from __future__ import print_function
import time
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = molecule_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = molecule_api.MoleculeApi(molecule_api.ApiClient(configuration))
payload = molecule_api.CurrencyTransferPayload() # CurrencyTransferPayload | 

try:
    # Transfer currency between wallets
    api_response = api_instance.post_currency_transfer(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->post_currency_transfer: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**CurrencyTransferPayload**](CurrencyTransferPayload.md)|  | 

### Return type

[**TransactionStatusSpecificResponse**](TransactionStatusSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_token**
> TokenCreateResponse post_token(payload)

Create a token under your firm.

### Example
```python
from __future__ import print_function
import time
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = molecule_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = molecule_api.MoleculeApi(molecule_api.ApiClient(configuration))
payload = molecule_api.TokenCreatePayload() # TokenCreatePayload | 

try:
    # Create a token under your firm.
    api_response = api_instance.post_token(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->post_token: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**TokenCreatePayload**](TokenCreatePayload.md)|  | 

### Return type

[**TokenCreateResponse**](TokenCreateResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_token_deploy**
> TransactionStatusSpecificResponse post_token_deploy(payload)

Deploy a security token contract to blockchain.

### Example
```python
from __future__ import print_function
import time
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = molecule_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = molecule_api.MoleculeApi(molecule_api.ApiClient(configuration))
payload = molecule_api.TokenDeployPayload() # TokenDeployPayload | 

try:
    # Deploy a security token contract to blockchain.
    api_response = api_instance.post_token_deploy(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->post_token_deploy: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**TokenDeployPayload**](TokenDeployPayload.md)|  | 

### Return type

[**TransactionStatusSpecificResponse**](TransactionStatusSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_token_transfer**
> TransactionStatusSpecificResponse post_token_transfer(payload)

Transfer tokens between wallets

### Example
```python
from __future__ import print_function
import time
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = molecule_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = molecule_api.MoleculeApi(molecule_api.ApiClient(configuration))
payload = molecule_api.TokenTransferPayload() # TokenTransferPayload | 

try:
    # Transfer tokens between wallets
    api_response = api_instance.post_token_transfer(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->post_token_transfer: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**TokenTransferPayload**](TokenTransferPayload.md)|  | 

### Return type

[**TransactionStatusSpecificResponse**](TransactionStatusSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_token_whitelist**
> TransactionStatusSpecificResponse post_token_whitelist(payload)

Add an investor to a token's whitelist

### Example
```python
from __future__ import print_function
import time
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = molecule_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = molecule_api.MoleculeApi(molecule_api.ApiClient(configuration))
payload = molecule_api.TokenWhitelistPayload() # TokenWhitelistPayload | 

try:
    # Add an investor to a token's whitelist
    api_response = api_instance.post_token_whitelist(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->post_token_whitelist: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**TokenWhitelistPayload**](TokenWhitelistPayload.md)|  | 

### Return type

[**TransactionStatusSpecificResponse**](TransactionStatusSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_wallet**
> WalletCreateResponse post_wallet(payload)

Create a wallet under your firm.

### Example
```python
from __future__ import print_function
import time
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = molecule_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = molecule_api.MoleculeApi(molecule_api.ApiClient(configuration))
payload = molecule_api.WalletCreatePayload() # WalletCreatePayload | 

try:
    # Create a wallet under your firm.
    api_response = api_instance.post_wallet(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->post_wallet: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**WalletCreatePayload**](WalletCreatePayload.md)|  | 

### Return type

[**WalletCreateResponse**](WalletCreateResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_wallet_key**
> WalletKeyCreateResponse post_wallet_key(payload)

Associate an existing key pair with a wallet defined for your firm.

### Example
```python
from __future__ import print_function
import time
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = molecule_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = molecule_api.MoleculeApi(molecule_api.ApiClient(configuration))
payload = molecule_api.WalletKeyCreatePayload() # WalletKeyCreatePayload | 

try:
    # Associate an existing key pair with a wallet defined for your firm.
    api_response = api_instance.post_wallet_key(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->post_wallet_key: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**WalletKeyCreatePayload**](WalletKeyCreatePayload.md)|  | 

### Return type

[**WalletKeyCreateResponse**](WalletKeyCreateResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_wallet_key_generator**
> WalletKeyCreateResponse post_wallet_key_generator(payload)

Generate a wallet key using the Key Service and associate with a wallet defined for your firm.

### Example
```python
from __future__ import print_function
import time
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = molecule_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = molecule_api.MoleculeApi(molecule_api.ApiClient(configuration))
payload = molecule_api.WalletKeyGeneratorPayload() # WalletKeyGeneratorPayload | 

try:
    # Generate a wallet key using the Key Service and associate with a wallet defined for your firm.
    api_response = api_instance.post_wallet_key_generator(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->post_wallet_key_generator: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**WalletKeyGeneratorPayload**](WalletKeyGeneratorPayload.md)|  | 

### Return type

[**WalletKeyCreateResponse**](WalletKeyCreateResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_webhook**
> WebhookCreateResponse post_webhook(payload)

Create a webhook under your firm.

### Example
```python
from __future__ import print_function
import time
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = molecule_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = molecule_api.MoleculeApi(molecule_api.ApiClient(configuration))
payload = molecule_api.WebhookCreatePayload() # WebhookCreatePayload | 

try:
    # Create a webhook under your firm.
    api_response = api_instance.post_webhook(payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->post_webhook: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**WebhookCreatePayload**](WebhookCreatePayload.md)|  | 

### Return type

[**WebhookCreateResponse**](WebhookCreateResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_token**
> TokenSpecificResponse update_token(token_id, payload)

Update a token

### Example
```python
from __future__ import print_function
import time
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = molecule_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = molecule_api.MoleculeApi(molecule_api.ApiClient(configuration))
token_id = 'token_id_example' # str | UUID of a token
payload = molecule_api.TokenUpdatePayload() # TokenUpdatePayload | 

try:
    # Update a token
    api_response = api_instance.update_token(token_id, payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->update_token: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token_id** | [**str**](.md)| UUID of a token | 
 **payload** | [**TokenUpdatePayload**](TokenUpdatePayload.md)|  | 

### Return type

[**TokenSpecificResponse**](TokenSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_wallet**
> WalletSpecificResponse update_wallet(wallet_id, payload)

Update a wallet

### Example
```python
from __future__ import print_function
import time
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = molecule_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = molecule_api.MoleculeApi(molecule_api.ApiClient(configuration))
wallet_id = 'wallet_id_example' # str | UUID of a wallet
payload = molecule_api.WalletUpdatePayload() # WalletUpdatePayload | 

try:
    # Update a wallet
    api_response = api_instance.update_wallet(wallet_id, payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->update_wallet: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet_id** | [**str**](.md)| UUID of a wallet | 
 **payload** | [**WalletUpdatePayload**](WalletUpdatePayload.md)|  | 

### Return type

[**WalletSpecificResponse**](WalletSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_webhook**
> WebhookSpecificResponse update_webhook(webhook_id, payload)

Update a webhook

### Example
```python
from __future__ import print_function
import time
import molecule_api
from molecule_api.rest import ApiException
from pprint import pprint

# Initialize configuration
configuration = molecule_api.Configuration()

# Set the environment (optional, defaults to sandbox)
# This changes the URL for requests (including OAuth) to [environment].hydrogenplatform.com
configuration.set_environment("sandbox")


# Configure OAuth2 access token for authorization: oauth
# Method 1: Fetch and set access token with client_id and client_secret
configuration.access_token = configuration.get_oauth_token('MYCLIENTID', 'MYCLIENTSECRET')
# Method 2: Set access token using an existing token
configuration.access_token = 'MYACCESSTOKEN'

# create an instance of the API class
api_instance = molecule_api.MoleculeApi(molecule_api.ApiClient(configuration))
webhook_id = 'webhook_id_example' # str | UUID of a webhook
payload = molecule_api.WebhookUpdatePayload() # WebhookUpdatePayload | 

try:
    # Update a webhook
    api_response = api_instance.update_webhook(webhook_id, payload)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MoleculeApi->update_webhook: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhook_id** | [**str**](.md)| UUID of a webhook | 
 **payload** | [**WebhookUpdatePayload**](WebhookUpdatePayload.md)|  | 

### Return type

[**WebhookSpecificResponse**](WebhookSpecificResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
