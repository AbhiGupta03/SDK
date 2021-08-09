/*
 * Hydrogen Integration API
 * The Hydrogen Integration API
 *
 * OpenAPI spec version: 1.3.1
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.integration.api;

import com.hydrogen.integration.ApiCallback;
import com.hydrogen.integration.ApiClient;
import com.hydrogen.integration.ApiException;
import com.hydrogen.integration.ApiResponse;
import com.hydrogen.integration.Configuration;
import com.hydrogen.integration.Pair;
import com.hydrogen.integration.ProgressRequestBody;
import com.hydrogen.integration.ProgressResponseBody;
import com.hydrogen.integration.model.PageKmsConfig;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.hydrogen.integration.model.KmsConfig;

import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KmsApi {
    private ApiClient apiClient;

    public KmsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public KmsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createKMSUsingPost
     * @param kmsConfig kmsConfig (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createKMSUsingPostCall(KmsConfig kmsConfig, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = kmsConfig;

        // create path and map variables
        String localVarPath = "/kms";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createKMSUsingPostValidateBeforeCall(KmsConfig kmsConfig, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'kmsConfig' is set
        if (kmsConfig == null) {
            throw new ApiException("Missing the required parameter 'kmsConfig' when calling createKMSUsingPost(Async)");
        }
        

        com.squareup.okhttp.Call call = createKMSUsingPostCall(kmsConfig, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create an secret key
     * Create an secret key.
     * @param kmsConfig kmsConfig (required)
     * @return KmsConfig
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public KmsConfig createKMSUsingPost(KmsConfig kmsConfig) throws ApiException {
        ApiResponse<KmsConfig> resp = createKMSUsingPostWithHttpInfo(kmsConfig);
        return resp.getData();
    }

    /**
     * Create an secret key
     * Create an secret key.
     * @param kmsConfig kmsConfig (required)
     * @return ApiResponse&lt;KmsConfig&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<KmsConfig> createKMSUsingPostWithHttpInfo(KmsConfig kmsConfig) throws ApiException {
        com.squareup.okhttp.Call call = createKMSUsingPostValidateBeforeCall(kmsConfig, null, null);
        Type localVarReturnType = new TypeToken<KmsConfig>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create an secret key (asynchronously)
     * Create an secret key.
     * @param kmsConfig kmsConfig (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createKMSUsingPostAsync(KmsConfig kmsConfig, final ApiCallback<KmsConfig> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createKMSUsingPostValidateBeforeCall(kmsConfig, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<KmsConfig>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteKMSUsingDelete
     * @param kmsId KMS Id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteKMSUsingDeleteCall(UUID kmsId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/kms/{kms_id}"
            .replaceAll("\\{" + "kms_id" + "\\}", apiClient.escapeString(kmsId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteKMSUsingDeleteValidateBeforeCall(UUID kmsId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'kmsId' is set
        if (kmsId == null) {
            throw new ApiException("Missing the required parameter 'kmsId' when calling deleteKMSUsingDelete(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteKMSUsingDeleteCall(kmsId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete an secret key value
     * Permanently delete an secret key value under a tenant.
     * @param kmsId KMS Id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteKMSUsingDelete(UUID kmsId) throws ApiException {
        deleteKMSUsingDeleteWithHttpInfo(kmsId);
    }

    /**
     * Delete an secret key value
     * Permanently delete an secret key value under a tenant.
     * @param kmsId KMS Id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteKMSUsingDeleteWithHttpInfo(UUID kmsId) throws ApiException {
        com.squareup.okhttp.Call call = deleteKMSUsingDeleteValidateBeforeCall(kmsId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete an secret key value (asynchronously)
     * Permanently delete an secret key value under a tenant.
     * @param kmsId KMS Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteKMSUsingDeleteAsync(UUID kmsId, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteKMSUsingDeleteValidateBeforeCall(kmsId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getKMSAllUsingGet
     * @param ascending ascending (optional, default to false)
     * @param filter filter (optional)
     * @param orderBy order_by (optional, default to update_date)
     * @param page page (optional, default to 0)
     * @param size size (optional, default to 25)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getKMSAllUsingGetCall(Boolean ascending, String filter, String orderBy, Integer page, Integer size, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/kms";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (ascending != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ascending", ascending));
        if (filter != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filter", filter));
        if (orderBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("order_by", orderBy));
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
        if (size != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("size", size));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getKMSAllUsingGetValidateBeforeCall(Boolean ascending, String filter, String orderBy, Integer page, Integer size, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getKMSAllUsingGetCall(ascending, filter, orderBy, page, size, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List all KMS Clients
     * Get details for all clients registered with your business.
     * @param ascending ascending (optional, default to false)
     * @param filter filter (optional)
     * @param orderBy order_by (optional, default to update_date)
     * @param page page (optional, default to 0)
     * @param size size (optional, default to 25)
     * @return PageKmsConfig
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PageKmsConfig getKMSAllUsingGet(Boolean ascending, String filter, String orderBy, Integer page, Integer size) throws ApiException {
        ApiResponse<PageKmsConfig> resp = getKMSAllUsingGetWithHttpInfo(ascending, filter, orderBy, page, size);
        return resp.getData();
    }

    /**
     * List all KMS Clients
     * Get details for all clients registered with your business.
     * @param ascending ascending (optional, default to false)
     * @param filter filter (optional)
     * @param orderBy order_by (optional, default to update_date)
     * @param page page (optional, default to 0)
     * @param size size (optional, default to 25)
     * @return ApiResponse&lt;PageKmsConfig&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PageKmsConfig> getKMSAllUsingGetWithHttpInfo(Boolean ascending, String filter, String orderBy, Integer page, Integer size) throws ApiException {
        com.squareup.okhttp.Call call = getKMSAllUsingGetValidateBeforeCall(ascending, filter, orderBy, page, size, null, null);
        Type localVarReturnType = new TypeToken<PageKmsConfig>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List all KMS Clients (asynchronously)
     * Get details for all clients registered with your business.
     * @param ascending ascending (optional, default to false)
     * @param filter filter (optional)
     * @param orderBy order_by (optional, default to update_date)
     * @param page page (optional, default to 0)
     * @param size size (optional, default to 25)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getKMSAllUsingGetAsync(Boolean ascending, String filter, String orderBy, Integer page, Integer size, final ApiCallback<PageKmsConfig> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getKMSAllUsingGetValidateBeforeCall(ascending, filter, orderBy, page, size, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PageKmsConfig>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getKMSUsingGet
     * @param kmsId KMS Id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getKMSUsingGetCall(UUID kmsId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/kms/{kms_id}"
            .replaceAll("\\{" + "kms_id" + "\\}", apiClient.escapeString(kmsId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getKMSUsingGetValidateBeforeCall(UUID kmsId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'kmsId' is set
        if (kmsId == null) {
            throw new ApiException("Missing the required parameter 'kmsId' when calling getKMSUsingGet(Async)");
        }
        

        com.squareup.okhttp.Call call = getKMSUsingGetCall(kmsId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieve an secret key value
     * Retrieve the information for a specific value associated with a Secret key.
     * @param kmsId KMS Id (required)
     * @return KmsConfig
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public KmsConfig getKMSUsingGet(UUID kmsId) throws ApiException {
        ApiResponse<KmsConfig> resp = getKMSUsingGetWithHttpInfo(kmsId);
        return resp.getData();
    }

    /**
     * Retrieve an secret key value
     * Retrieve the information for a specific value associated with a Secret key.
     * @param kmsId KMS Id (required)
     * @return ApiResponse&lt;KmsConfig&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<KmsConfig> getKMSUsingGetWithHttpInfo(UUID kmsId) throws ApiException {
        com.squareup.okhttp.Call call = getKMSUsingGetValidateBeforeCall(kmsId, null, null);
        Type localVarReturnType = new TypeToken<KmsConfig>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve an secret key value (asynchronously)
     * Retrieve the information for a specific value associated with a Secret key.
     * @param kmsId KMS Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getKMSUsingGetAsync(UUID kmsId, final ApiCallback<KmsConfig> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getKMSUsingGetValidateBeforeCall(kmsId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<KmsConfig>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateKMSUsingPut
     * @param kmsConfig kmsConfig (required)
     * @param kmsId kms_id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateKMSUsingPutCall(KmsConfig kmsConfig, UUID kmsId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = kmsConfig;

        // create path and map variables
        String localVarPath = "/kms/{kms_id}"
            .replaceAll("\\{" + "kms_id" + "\\}", apiClient.escapeString(kmsId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateKMSUsingPutValidateBeforeCall(KmsConfig kmsConfig, UUID kmsId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'kmsConfig' is set
        if (kmsConfig == null) {
            throw new ApiException("Missing the required parameter 'kmsConfig' when calling updateKMSUsingPut(Async)");
        }
        
        // verify the required parameter 'kmsId' is set
        if (kmsId == null) {
            throw new ApiException("Missing the required parameter 'kmsId' when calling updateKMSUsingPut(Async)");
        }
        

        com.squareup.okhttp.Call call = updateKMSUsingPutCall(kmsConfig, kmsId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update an Key Value
     * Update the information for an key value.
     * @param kmsConfig kmsConfig (required)
     * @param kmsId kms_id (required)
     * @return KmsConfig
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public KmsConfig updateKMSUsingPut(KmsConfig kmsConfig, UUID kmsId) throws ApiException {
        ApiResponse<KmsConfig> resp = updateKMSUsingPutWithHttpInfo(kmsConfig, kmsId);
        return resp.getData();
    }

    /**
     * Update an Key Value
     * Update the information for an key value.
     * @param kmsConfig kmsConfig (required)
     * @param kmsId kms_id (required)
     * @return ApiResponse&lt;KmsConfig&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<KmsConfig> updateKMSUsingPutWithHttpInfo(KmsConfig kmsConfig, UUID kmsId) throws ApiException {
        com.squareup.okhttp.Call call = updateKMSUsingPutValidateBeforeCall(kmsConfig, kmsId, null, null);
        Type localVarReturnType = new TypeToken<KmsConfig>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update an Key Value (asynchronously)
     * Update the information for an key value.
     * @param kmsConfig kmsConfig (required)
     * @param kmsId kms_id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateKMSUsingPutAsync(KmsConfig kmsConfig, UUID kmsId, final ApiCallback<KmsConfig> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateKMSUsingPutValidateBeforeCall(kmsConfig, kmsId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<KmsConfig>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
