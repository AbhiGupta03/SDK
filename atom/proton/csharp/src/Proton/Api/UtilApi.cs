/* 
 * Hydrogen Proton API
 *
 * Financial engineering module of Hydrogen Atom
 *
 * OpenAPI spec version: 1.9.2
 * Contact: info@hydrogenplatform.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using RestSharp;
using Proton.Client;
using Proton.ModelEntity;

namespace Proton.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IUtilApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Decision Tree Result
        /// </summary>
        /// <remarks>
        /// Traverse a decision tree and find the resulting leaf node
        /// </remarks>
        /// <exception cref="Proton.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="decisionTreeResultRequest">Request payload for Decision Tree Result</param>
        /// <returns>Dictionary&lt;string, Object&gt;</returns>
        Dictionary<string, Object> DecisionTreeResult (DecisionTreeResultRequest decisionTreeResultRequest);

        /// <summary>
        /// Decision Tree Result
        /// </summary>
        /// <remarks>
        /// Traverse a decision tree and find the resulting leaf node
        /// </remarks>
        /// <exception cref="Proton.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="decisionTreeResultRequest">Request payload for Decision Tree Result</param>
        /// <returns>ApiResponse of Dictionary&lt;string, Object&gt;</returns>
        ApiResponse<Dictionary<string, Object>> DecisionTreeResultWithHttpInfo (DecisionTreeResultRequest decisionTreeResultRequest);
        /// <summary>
        /// Order Rebalance
        /// </summary>
        /// <remarks>
        /// Create orders to rebalance client accounts or portfolios
        /// </remarks>
        /// <exception cref="Proton.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="orderRebalanceRequest">Request payload for Order Rebalance</param>
        /// <returns>Dictionary&lt;string, Object&gt;</returns>
        Dictionary<string, Object> OrderRebalance (OrderRebalanceRequest orderRebalanceRequest);

        /// <summary>
        /// Order Rebalance
        /// </summary>
        /// <remarks>
        /// Create orders to rebalance client accounts or portfolios
        /// </remarks>
        /// <exception cref="Proton.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="orderRebalanceRequest">Request payload for Order Rebalance</param>
        /// <returns>ApiResponse of Dictionary&lt;string, Object&gt;</returns>
        ApiResponse<Dictionary<string, Object>> OrderRebalanceWithHttpInfo (OrderRebalanceRequest orderRebalanceRequest);
        /// <summary>
        /// Performance Calculator
        /// </summary>
        /// <remarks>
        /// Calculate performance/risk metrics for a Nucleus entity
        /// </remarks>
        /// <exception cref="Proton.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="performanceCalculatorRequest">Request payload for Performance Calculator</param>
        /// <returns>Dictionary&lt;string, Object&gt;</returns>
        Dictionary<string, Object> PerformanceCalculator (PerformanceCalculatorRequest performanceCalculatorRequest);

        /// <summary>
        /// Performance Calculator
        /// </summary>
        /// <remarks>
        /// Calculate performance/risk metrics for a Nucleus entity
        /// </remarks>
        /// <exception cref="Proton.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="performanceCalculatorRequest">Request payload for Performance Calculator</param>
        /// <returns>ApiResponse of Dictionary&lt;string, Object&gt;</returns>
        ApiResponse<Dictionary<string, Object>> PerformanceCalculatorWithHttpInfo (PerformanceCalculatorRequest performanceCalculatorRequest);
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// Decision Tree Result
        /// </summary>
        /// <remarks>
        /// Traverse a decision tree and find the resulting leaf node
        /// </remarks>
        /// <exception cref="Proton.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="decisionTreeResultRequest">Request payload for Decision Tree Result</param>
        /// <returns>Task of Dictionary&lt;string, Object&gt;</returns>
        System.Threading.Tasks.Task<Dictionary<string, Object>> DecisionTreeResultAsync (DecisionTreeResultRequest decisionTreeResultRequest);

        /// <summary>
        /// Decision Tree Result
        /// </summary>
        /// <remarks>
        /// Traverse a decision tree and find the resulting leaf node
        /// </remarks>
        /// <exception cref="Proton.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="decisionTreeResultRequest">Request payload for Decision Tree Result</param>
        /// <returns>Task of ApiResponse (Dictionary&lt;string, Object&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<Dictionary<string, Object>>> DecisionTreeResultAsyncWithHttpInfo (DecisionTreeResultRequest decisionTreeResultRequest);
        /// <summary>
        /// Order Rebalance
        /// </summary>
        /// <remarks>
        /// Create orders to rebalance client accounts or portfolios
        /// </remarks>
        /// <exception cref="Proton.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="orderRebalanceRequest">Request payload for Order Rebalance</param>
        /// <returns>Task of Dictionary&lt;string, Object&gt;</returns>
        System.Threading.Tasks.Task<Dictionary<string, Object>> OrderRebalanceAsync (OrderRebalanceRequest orderRebalanceRequest);

        /// <summary>
        /// Order Rebalance
        /// </summary>
        /// <remarks>
        /// Create orders to rebalance client accounts or portfolios
        /// </remarks>
        /// <exception cref="Proton.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="orderRebalanceRequest">Request payload for Order Rebalance</param>
        /// <returns>Task of ApiResponse (Dictionary&lt;string, Object&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<Dictionary<string, Object>>> OrderRebalanceAsyncWithHttpInfo (OrderRebalanceRequest orderRebalanceRequest);
        /// <summary>
        /// Performance Calculator
        /// </summary>
        /// <remarks>
        /// Calculate performance/risk metrics for a Nucleus entity
        /// </remarks>
        /// <exception cref="Proton.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="performanceCalculatorRequest">Request payload for Performance Calculator</param>
        /// <returns>Task of Dictionary&lt;string, Object&gt;</returns>
        System.Threading.Tasks.Task<Dictionary<string, Object>> PerformanceCalculatorAsync (PerformanceCalculatorRequest performanceCalculatorRequest);

        /// <summary>
        /// Performance Calculator
        /// </summary>
        /// <remarks>
        /// Calculate performance/risk metrics for a Nucleus entity
        /// </remarks>
        /// <exception cref="Proton.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="performanceCalculatorRequest">Request payload for Performance Calculator</param>
        /// <returns>Task of ApiResponse (Dictionary&lt;string, Object&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<Dictionary<string, Object>>> PerformanceCalculatorAsyncWithHttpInfo (PerformanceCalculatorRequest performanceCalculatorRequest);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class UtilApi : IUtilApi
    {
        private Proton.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="UtilApi"/> class.
        /// </summary>
        /// <returns></returns>
        public UtilApi(String basePath)
        {
            this.Configuration = new Proton.Client.Configuration { BasePath = basePath };

            ExceptionFactory = Proton.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="UtilApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public UtilApi(Proton.Client.Configuration configuration = null)
        {
            if (configuration == null) // use the default one in Configuration
                this.Configuration = Proton.Client.Configuration.Default;
            else
                this.Configuration = configuration;

            ExceptionFactory = Proton.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public String GetBasePath()
        {
            return this.Configuration.ApiClient.RestClient.BaseUrl.ToString();
        }

        /// <summary>
        /// Sets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        [Obsolete("SetBasePath is deprecated, please do 'Configuration.ApiClient = new ApiClient(\"http://new-path\")' instead.")]
        public void SetBasePath(String basePath)
        {
            // do nothing
        }

        /// <summary>
        /// Gets or sets the configuration object
        /// </summary>
        /// <value>An instance of the Configuration</value>
        public Proton.Client.Configuration Configuration {get; set;}

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public Proton.Client.ExceptionFactory ExceptionFactory
        {
            get
            {
                if (_exceptionFactory != null && _exceptionFactory.GetInvocationList().Length > 1)
                {
                    throw new InvalidOperationException("Multicast delegate for ExceptionFactory is unsupported.");
                }
                return _exceptionFactory;
            }
            set { _exceptionFactory = value; }
        }

        /// <summary>
        /// Gets the default header.
        /// </summary>
        /// <returns>Dictionary of HTTP header</returns>
        [Obsolete("DefaultHeader is deprecated, please use Configuration.DefaultHeader instead.")]
        public IDictionary<String, String> DefaultHeader()
        {
            return new ReadOnlyDictionary<string, string>(this.Configuration.DefaultHeader);
        }

        /// <summary>
        /// Add default header.
        /// </summary>
        /// <param name="key">Header field name.</param>
        /// <param name="value">Header field value.</param>
        /// <returns></returns>
        [Obsolete("AddDefaultHeader is deprecated, please use Configuration.AddDefaultHeader instead.")]
        public void AddDefaultHeader(string key, string value)
        {
            this.Configuration.AddDefaultHeader(key, value);
        }

        /// <summary>
        /// Decision Tree Result Traverse a decision tree and find the resulting leaf node
        /// </summary>
        /// <exception cref="Proton.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="decisionTreeResultRequest">Request payload for Decision Tree Result</param>
        /// <returns>Dictionary&lt;string, Object&gt;</returns>
        public Dictionary<string, Object> DecisionTreeResult (DecisionTreeResultRequest decisionTreeResultRequest)
        {
             ApiResponse<Dictionary<string, Object>> localVarResponse = DecisionTreeResultWithHttpInfo(decisionTreeResultRequest);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Decision Tree Result Traverse a decision tree and find the resulting leaf node
        /// </summary>
        /// <exception cref="Proton.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="decisionTreeResultRequest">Request payload for Decision Tree Result</param>
        /// <returns>ApiResponse of Dictionary&lt;string, Object&gt;</returns>
        public ApiResponse< Dictionary<string, Object> > DecisionTreeResultWithHttpInfo (DecisionTreeResultRequest decisionTreeResultRequest)
        {
            // verify the required parameter 'decisionTreeResultRequest' is set
            if (decisionTreeResultRequest == null)
                throw new ApiException(400, "Missing required parameter 'decisionTreeResultRequest' when calling UtilApi->DecisionTreeResult");

            var localVarPath = "/decision_tree_result";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (decisionTreeResultRequest != null && decisionTreeResultRequest.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(decisionTreeResultRequest); // http body (model) parameter
            }
            else
            {
                localVarPostBody = decisionTreeResultRequest; // byte array
            }

            // authentication (oauth2) required
            // oauth required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("DecisionTreeResult", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Dictionary<string, Object>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (Dictionary<string, Object>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(Dictionary<string, Object>)));
        }

        /// <summary>
        /// Decision Tree Result Traverse a decision tree and find the resulting leaf node
        /// </summary>
        /// <exception cref="Proton.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="decisionTreeResultRequest">Request payload for Decision Tree Result</param>
        /// <returns>Task of Dictionary&lt;string, Object&gt;</returns>
        public async System.Threading.Tasks.Task<Dictionary<string, Object>> DecisionTreeResultAsync (DecisionTreeResultRequest decisionTreeResultRequest)
        {
             ApiResponse<Dictionary<string, Object>> localVarResponse = await DecisionTreeResultAsyncWithHttpInfo(decisionTreeResultRequest);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Decision Tree Result Traverse a decision tree and find the resulting leaf node
        /// </summary>
        /// <exception cref="Proton.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="decisionTreeResultRequest">Request payload for Decision Tree Result</param>
        /// <returns>Task of ApiResponse (Dictionary&lt;string, Object&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Dictionary<string, Object>>> DecisionTreeResultAsyncWithHttpInfo (DecisionTreeResultRequest decisionTreeResultRequest)
        {
            // verify the required parameter 'decisionTreeResultRequest' is set
            if (decisionTreeResultRequest == null)
                throw new ApiException(400, "Missing required parameter 'decisionTreeResultRequest' when calling UtilApi->DecisionTreeResult");

            var localVarPath = "/decision_tree_result";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (decisionTreeResultRequest != null && decisionTreeResultRequest.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(decisionTreeResultRequest); // http body (model) parameter
            }
            else
            {
                localVarPostBody = decisionTreeResultRequest; // byte array
            }

            // authentication (oauth2) required
            // oauth required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("DecisionTreeResult", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Dictionary<string, Object>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (Dictionary<string, Object>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(Dictionary<string, Object>)));
        }

        /// <summary>
        /// Order Rebalance Create orders to rebalance client accounts or portfolios
        /// </summary>
        /// <exception cref="Proton.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="orderRebalanceRequest">Request payload for Order Rebalance</param>
        /// <returns>Dictionary&lt;string, Object&gt;</returns>
        public Dictionary<string, Object> OrderRebalance (OrderRebalanceRequest orderRebalanceRequest)
        {
             ApiResponse<Dictionary<string, Object>> localVarResponse = OrderRebalanceWithHttpInfo(orderRebalanceRequest);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Order Rebalance Create orders to rebalance client accounts or portfolios
        /// </summary>
        /// <exception cref="Proton.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="orderRebalanceRequest">Request payload for Order Rebalance</param>
        /// <returns>ApiResponse of Dictionary&lt;string, Object&gt;</returns>
        public ApiResponse< Dictionary<string, Object> > OrderRebalanceWithHttpInfo (OrderRebalanceRequest orderRebalanceRequest)
        {
            // verify the required parameter 'orderRebalanceRequest' is set
            if (orderRebalanceRequest == null)
                throw new ApiException(400, "Missing required parameter 'orderRebalanceRequest' when calling UtilApi->OrderRebalance");

            var localVarPath = "/order_rebalance";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (orderRebalanceRequest != null && orderRebalanceRequest.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(orderRebalanceRequest); // http body (model) parameter
            }
            else
            {
                localVarPostBody = orderRebalanceRequest; // byte array
            }

            // authentication (oauth2) required
            // oauth required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("OrderRebalance", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Dictionary<string, Object>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (Dictionary<string, Object>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(Dictionary<string, Object>)));
        }

        /// <summary>
        /// Order Rebalance Create orders to rebalance client accounts or portfolios
        /// </summary>
        /// <exception cref="Proton.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="orderRebalanceRequest">Request payload for Order Rebalance</param>
        /// <returns>Task of Dictionary&lt;string, Object&gt;</returns>
        public async System.Threading.Tasks.Task<Dictionary<string, Object>> OrderRebalanceAsync (OrderRebalanceRequest orderRebalanceRequest)
        {
             ApiResponse<Dictionary<string, Object>> localVarResponse = await OrderRebalanceAsyncWithHttpInfo(orderRebalanceRequest);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Order Rebalance Create orders to rebalance client accounts or portfolios
        /// </summary>
        /// <exception cref="Proton.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="orderRebalanceRequest">Request payload for Order Rebalance</param>
        /// <returns>Task of ApiResponse (Dictionary&lt;string, Object&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Dictionary<string, Object>>> OrderRebalanceAsyncWithHttpInfo (OrderRebalanceRequest orderRebalanceRequest)
        {
            // verify the required parameter 'orderRebalanceRequest' is set
            if (orderRebalanceRequest == null)
                throw new ApiException(400, "Missing required parameter 'orderRebalanceRequest' when calling UtilApi->OrderRebalance");

            var localVarPath = "/order_rebalance";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (orderRebalanceRequest != null && orderRebalanceRequest.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(orderRebalanceRequest); // http body (model) parameter
            }
            else
            {
                localVarPostBody = orderRebalanceRequest; // byte array
            }

            // authentication (oauth2) required
            // oauth required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("OrderRebalance", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Dictionary<string, Object>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (Dictionary<string, Object>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(Dictionary<string, Object>)));
        }

        /// <summary>
        /// Performance Calculator Calculate performance/risk metrics for a Nucleus entity
        /// </summary>
        /// <exception cref="Proton.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="performanceCalculatorRequest">Request payload for Performance Calculator</param>
        /// <returns>Dictionary&lt;string, Object&gt;</returns>
        public Dictionary<string, Object> PerformanceCalculator (PerformanceCalculatorRequest performanceCalculatorRequest)
        {
             ApiResponse<Dictionary<string, Object>> localVarResponse = PerformanceCalculatorWithHttpInfo(performanceCalculatorRequest);
             return localVarResponse.Data;
        }

        /// <summary>
        /// Performance Calculator Calculate performance/risk metrics for a Nucleus entity
        /// </summary>
        /// <exception cref="Proton.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="performanceCalculatorRequest">Request payload for Performance Calculator</param>
        /// <returns>ApiResponse of Dictionary&lt;string, Object&gt;</returns>
        public ApiResponse< Dictionary<string, Object> > PerformanceCalculatorWithHttpInfo (PerformanceCalculatorRequest performanceCalculatorRequest)
        {
            // verify the required parameter 'performanceCalculatorRequest' is set
            if (performanceCalculatorRequest == null)
                throw new ApiException(400, "Missing required parameter 'performanceCalculatorRequest' when calling UtilApi->PerformanceCalculator");

            var localVarPath = "/performance_calculator";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (performanceCalculatorRequest != null && performanceCalculatorRequest.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(performanceCalculatorRequest); // http body (model) parameter
            }
            else
            {
                localVarPostBody = performanceCalculatorRequest; // byte array
            }

            // authentication (oauth2) required
            // oauth required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PerformanceCalculator", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Dictionary<string, Object>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (Dictionary<string, Object>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(Dictionary<string, Object>)));
        }

        /// <summary>
        /// Performance Calculator Calculate performance/risk metrics for a Nucleus entity
        /// </summary>
        /// <exception cref="Proton.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="performanceCalculatorRequest">Request payload for Performance Calculator</param>
        /// <returns>Task of Dictionary&lt;string, Object&gt;</returns>
        public async System.Threading.Tasks.Task<Dictionary<string, Object>> PerformanceCalculatorAsync (PerformanceCalculatorRequest performanceCalculatorRequest)
        {
             ApiResponse<Dictionary<string, Object>> localVarResponse = await PerformanceCalculatorAsyncWithHttpInfo(performanceCalculatorRequest);
             return localVarResponse.Data;

        }

        /// <summary>
        /// Performance Calculator Calculate performance/risk metrics for a Nucleus entity
        /// </summary>
        /// <exception cref="Proton.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="performanceCalculatorRequest">Request payload for Performance Calculator</param>
        /// <returns>Task of ApiResponse (Dictionary&lt;string, Object&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Dictionary<string, Object>>> PerformanceCalculatorAsyncWithHttpInfo (PerformanceCalculatorRequest performanceCalculatorRequest)
        {
            // verify the required parameter 'performanceCalculatorRequest' is set
            if (performanceCalculatorRequest == null)
                throw new ApiException(400, "Missing required parameter 'performanceCalculatorRequest' when calling UtilApi->PerformanceCalculator");

            var localVarPath = "/performance_calculator";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (performanceCalculatorRequest != null && performanceCalculatorRequest.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(performanceCalculatorRequest); // http body (model) parameter
            }
            else
            {
                localVarPostBody = performanceCalculatorRequest; // byte array
            }

            // authentication (oauth2) required
            // oauth required
            if (!String.IsNullOrEmpty(this.Configuration.AccessToken))
            {
                localVarHeaderParams["Authorization"] = "Bearer " + this.Configuration.AccessToken;
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("PerformanceCalculator", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Dictionary<string, Object>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (Dictionary<string, Object>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(Dictionary<string, Object>)));
        }

    }
}
