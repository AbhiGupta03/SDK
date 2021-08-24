/*
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.4
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.nucleus.api;

import com.hydrogen.nucleus.ApiCallback;
import com.hydrogen.nucleus.ApiClient;
import com.hydrogen.nucleus.ApiException;
import com.hydrogen.nucleus.ApiResponse;
import com.hydrogen.nucleus.Configuration;
import com.hydrogen.nucleus.Pair;
import com.hydrogen.nucleus.ProgressRequestBody;
import com.hydrogen.nucleus.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.hydrogen.nucleus.model.AdminClient;
import com.hydrogen.nucleus.model.ClientCredentials;
import com.hydrogen.nucleus.model.PageAdminClient;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdminClientApi {
    private ApiClient apiClient;

    public AdminClientApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AdminClientApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createAdminClientUsingPOST
     * @param client client (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createAdminClientUsingPOSTCall(AdminClient client, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = client;

        // create path and map variables
        String localVarPath = "/admin/v1/client";

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
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
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
    private com.squareup.okhttp.Call createAdminClientUsingPOSTValidateBeforeCall(AdminClient client, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'client' is set
        if (client == null) {
            throw new ApiException("Missing the required parameter 'client' when calling createAdminClientUsingPOST(Async)");
        }
        

        com.squareup.okhttp.Call call = createAdminClientUsingPOSTCall(client, progressListener, progressRequestListener);
        return call;

    }

    /**
     * create
     * 
     * @param client client (required)
     * @return AdminClient
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AdminClient createAdminClientUsingPOST(AdminClient client) throws ApiException {
        ApiResponse<AdminClient> resp = createAdminClientUsingPOSTWithHttpInfo(client);
        return resp.getData();
    }

    /**
     * create
     * 
     * @param client client (required)
     * @return ApiResponse&lt;AdminClient&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AdminClient> createAdminClientUsingPOSTWithHttpInfo(AdminClient client) throws ApiException {
        com.squareup.okhttp.Call call = createAdminClientUsingPOSTValidateBeforeCall(client, null, null);
        Type localVarReturnType = new TypeToken<AdminClient>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * create (asynchronously)
     * 
     * @param client client (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createAdminClientUsingPOSTAsync(AdminClient client, final ApiCallback<AdminClient> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createAdminClientUsingPOSTValidateBeforeCall(client, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AdminClient>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteAdminClientUsingDELETE
     * @param clientId client_id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteAdminClientUsingDELETECall(Long clientId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/admin/v1/client/{client_id}"
            .replaceAll("\\{" + "client_id" + "\\}", apiClient.escapeString(clientId.toString()));

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
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
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
    private com.squareup.okhttp.Call deleteAdminClientUsingDELETEValidateBeforeCall(Long clientId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new ApiException("Missing the required parameter 'clientId' when calling deleteAdminClientUsingDELETE(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteAdminClientUsingDELETECall(clientId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * delete
     * 
     * @param clientId client_id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteAdminClientUsingDELETE(Long clientId) throws ApiException {
        deleteAdminClientUsingDELETEWithHttpInfo(clientId);
    }

    /**
     * delete
     * 
     * @param clientId client_id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteAdminClientUsingDELETEWithHttpInfo(Long clientId) throws ApiException {
        com.squareup.okhttp.Call call = deleteAdminClientUsingDELETEValidateBeforeCall(clientId, null, null);
        return apiClient.execute(call);
    }

    /**
     * delete (asynchronously)
     * 
     * @param clientId client_id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteAdminClientUsingDELETEAsync(Long clientId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteAdminClientUsingDELETEValidateBeforeCall(clientId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getAdminClientUsingGET
     * @param clientId client_id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAdminClientUsingGETCall(Long clientId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/admin/v1/client/{client_id}"
            .replaceAll("\\{" + "client_id" + "\\}", apiClient.escapeString(clientId.toString()));

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
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
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
    private com.squareup.okhttp.Call getAdminClientUsingGETValidateBeforeCall(Long clientId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new ApiException("Missing the required parameter 'clientId' when calling getAdminClientUsingGET(Async)");
        }
        

        com.squareup.okhttp.Call call = getAdminClientUsingGETCall(clientId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * get
     * 
     * @param clientId client_id (required)
     * @return AdminClient
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AdminClient getAdminClientUsingGET(Long clientId) throws ApiException {
        ApiResponse<AdminClient> resp = getAdminClientUsingGETWithHttpInfo(clientId);
        return resp.getData();
    }

    /**
     * get
     * 
     * @param clientId client_id (required)
     * @return ApiResponse&lt;AdminClient&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AdminClient> getAdminClientUsingGETWithHttpInfo(Long clientId) throws ApiException {
        com.squareup.okhttp.Call call = getAdminClientUsingGETValidateBeforeCall(clientId, null, null);
        Type localVarReturnType = new TypeToken<AdminClient>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * get (asynchronously)
     * 
     * @param clientId client_id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAdminClientUsingGETAsync(Long clientId, final ApiCallback<AdminClient> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAdminClientUsingGETValidateBeforeCall(clientId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AdminClient>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAllAdminClientUsingGET
     * @param ascending ascending (optional, default to false)
     * @param filter filter (optional)
     * @param orderBy order_by (optional, default to username)
     * @param page page (optional, default to 0)
     * @param size size (optional, default to 25)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAllAdminClientUsingGETCall(Boolean ascending, String filter, String orderBy, Integer page, Integer size, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/admin/v1/client";

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
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
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
    private com.squareup.okhttp.Call getAllAdminClientUsingGETValidateBeforeCall(Boolean ascending, String filter, String orderBy, Integer page, Integer size, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getAllAdminClientUsingGETCall(ascending, filter, orderBy, page, size, progressListener, progressRequestListener);
        return call;

    }

    /**
     * getAllAdminClient
     * 
     * @param ascending ascending (optional, default to false)
     * @param filter filter (optional)
     * @param orderBy order_by (optional, default to username)
     * @param page page (optional, default to 0)
     * @param size size (optional, default to 25)
     * @return PageAdminClient
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PageAdminClient getAllAdminClientUsingGET(Boolean ascending, String filter, String orderBy, Integer page, Integer size) throws ApiException {
        ApiResponse<PageAdminClient> resp = getAllAdminClientUsingGETWithHttpInfo(ascending, filter, orderBy, page, size);
        return resp.getData();
    }

    /**
     * getAllAdminClient
     * 
     * @param ascending ascending (optional, default to false)
     * @param filter filter (optional)
     * @param orderBy order_by (optional, default to username)
     * @param page page (optional, default to 0)
     * @param size size (optional, default to 25)
     * @return ApiResponse&lt;PageAdminClient&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PageAdminClient> getAllAdminClientUsingGETWithHttpInfo(Boolean ascending, String filter, String orderBy, Integer page, Integer size) throws ApiException {
        com.squareup.okhttp.Call call = getAllAdminClientUsingGETValidateBeforeCall(ascending, filter, orderBy, page, size, null, null);
        Type localVarReturnType = new TypeToken<PageAdminClient>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * getAllAdminClient (asynchronously)
     * 
     * @param ascending ascending (optional, default to false)
     * @param filter filter (optional)
     * @param orderBy order_by (optional, default to username)
     * @param page page (optional, default to 0)
     * @param size size (optional, default to 25)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllAdminClientUsingGETAsync(Boolean ascending, String filter, String orderBy, Integer page, Integer size, final ApiCallback<PageAdminClient> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAllAdminClientUsingGETValidateBeforeCall(ascending, filter, orderBy, page, size, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PageAdminClient>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateAdminClientUsingPUT
     * @param client client (required)
     * @param clientId client_id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateAdminClientUsingPUTCall(Object client, Long clientId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = client;

        // create path and map variables
        String localVarPath = "/admin/v1/client/{client_id}"
            .replaceAll("\\{" + "client_id" + "\\}", apiClient.escapeString(clientId.toString()));

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
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
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
    private com.squareup.okhttp.Call updateAdminClientUsingPUTValidateBeforeCall(Object client, Long clientId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'client' is set
        if (client == null) {
            throw new ApiException("Missing the required parameter 'client' when calling updateAdminClientUsingPUT(Async)");
        }
        
        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new ApiException("Missing the required parameter 'clientId' when calling updateAdminClientUsingPUT(Async)");
        }
        

        com.squareup.okhttp.Call call = updateAdminClientUsingPUTCall(client, clientId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * update
     * 
     * @param client client (required)
     * @param clientId client_id (required)
     * @return AdminClient
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AdminClient updateAdminClientUsingPUT(Object client, Long clientId) throws ApiException {
        ApiResponse<AdminClient> resp = updateAdminClientUsingPUTWithHttpInfo(client, clientId);
        return resp.getData();
    }

    /**
     * update
     * 
     * @param client client (required)
     * @param clientId client_id (required)
     * @return ApiResponse&lt;AdminClient&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AdminClient> updateAdminClientUsingPUTWithHttpInfo(Object client, Long clientId) throws ApiException {
        com.squareup.okhttp.Call call = updateAdminClientUsingPUTValidateBeforeCall(client, clientId, null, null);
        Type localVarReturnType = new TypeToken<AdminClient>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * update (asynchronously)
     * 
     * @param client client (required)
     * @param clientId client_id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateAdminClientUsingPUTAsync(Object client, Long clientId, final ApiCallback<AdminClient> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateAdminClientUsingPUTValidateBeforeCall(client, clientId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AdminClient>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateClientCredentialsUsingPOST
     * @param clientCredentials clientCredentials (required)
     * @param tenantName tenant-name (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateClientCredentialsUsingPOSTCall(ClientCredentials clientCredentials, String tenantName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = clientCredentials;

        // create path and map variables
        String localVarPath = "/admin/v1/client_credentials";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (tenantName != null)
        localVarHeaderParams.put("tenant-name", apiClient.parameterToString(tenantName));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
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
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
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
    private com.squareup.okhttp.Call updateClientCredentialsUsingPOSTValidateBeforeCall(ClientCredentials clientCredentials, String tenantName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'clientCredentials' is set
        if (clientCredentials == null) {
            throw new ApiException("Missing the required parameter 'clientCredentials' when calling updateClientCredentialsUsingPOST(Async)");
        }
        

        com.squareup.okhttp.Call call = updateClientCredentialsUsingPOSTCall(clientCredentials, tenantName, progressListener, progressRequestListener);
        return call;

    }

    /**
     * updateClientCredentials
     * 
     * @param clientCredentials clientCredentials (required)
     * @param tenantName tenant-name (optional)
     * @return AdminClient
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AdminClient updateClientCredentialsUsingPOST(ClientCredentials clientCredentials, String tenantName) throws ApiException {
        ApiResponse<AdminClient> resp = updateClientCredentialsUsingPOSTWithHttpInfo(clientCredentials, tenantName);
        return resp.getData();
    }

    /**
     * updateClientCredentials
     * 
     * @param clientCredentials clientCredentials (required)
     * @param tenantName tenant-name (optional)
     * @return ApiResponse&lt;AdminClient&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AdminClient> updateClientCredentialsUsingPOSTWithHttpInfo(ClientCredentials clientCredentials, String tenantName) throws ApiException {
        com.squareup.okhttp.Call call = updateClientCredentialsUsingPOSTValidateBeforeCall(clientCredentials, tenantName, null, null);
        Type localVarReturnType = new TypeToken<AdminClient>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * updateClientCredentials (asynchronously)
     * 
     * @param clientCredentials clientCredentials (required)
     * @param tenantName tenant-name (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateClientCredentialsUsingPOSTAsync(ClientCredentials clientCredentials, String tenantName, final ApiCallback<AdminClient> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateClientCredentialsUsingPOSTValidateBeforeCall(clientCredentials, tenantName, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AdminClient>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
