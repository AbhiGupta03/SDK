<?php
/**
 * KYCApi
 * PHP version 5
 *
 * @category Class
 * @package  com\hydrogen\integration
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * Hydrogen Integration API
 *
 * The Hydrogen Integration API
 *
 * OpenAPI spec version: 1.2.1
 * Contact: info@hydrogenplatform.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 * Swagger Codegen version: 2.4.14
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace com\hydrogen\integration\Api;

use GuzzleHttp\Client;
use GuzzleHttp\ClientInterface;
use GuzzleHttp\Exception\RequestException;
use GuzzleHttp\Psr7\MultipartStream;
use GuzzleHttp\Psr7\Request;
use GuzzleHttp\RequestOptions;
use com\hydrogen\integration\ApiException;
use com\hydrogen\integration\Configuration;
use com\hydrogen\integration\HeaderSelector;
use com\hydrogen\integration\ObjectSerializer;

/**
 * KYCApi Class Doc Comment
 *
 * @category Class
 * @package  com\hydrogen\integration
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class KYCApi
{
    /**
     * @var ClientInterface
     */
    protected $client;

    /**
     * @var Configuration
     */
    protected $config;

    /**
     * @var HeaderSelector
     */
    protected $headerSelector;

    /**
     * @param ClientInterface $client
     * @param Configuration   $config
     * @param HeaderSelector  $selector
     */
    public function __construct(
        ClientInterface $client = null,
        Configuration $config = null,
        HeaderSelector $selector = null
    ) {
        $this->client = $client ?: new Client();
        $this->config = $config ?: new Configuration();
        $this->headerSelector = $selector ?: new HeaderSelector();
    }

    /**
     * @return Configuration
     */
    public function getConfig()
    {
        return $this->config;
    }

    /**
     * Operation createKYCUsingPost
     *
     * Do kyc for the client.
     *
     * @param  \com\hydrogen\integration\Model\KycRequestCO $kyc_request_co kycRequestCO (required)
     *
     * @throws \com\hydrogen\integration\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \com\hydrogen\integration\Model\KycResponseVo
     */
    public function createKYCUsingPost($kyc_request_co)
    {
        list($response) = $this->createKYCUsingPostWithHttpInfo($kyc_request_co);
        return $response;
    }

    /**
     * Operation createKYCUsingPostWithHttpInfo
     *
     * Do kyc for the client.
     *
     * @param  \com\hydrogen\integration\Model\KycRequestCO $kyc_request_co kycRequestCO (required)
     *
     * @throws \com\hydrogen\integration\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \com\hydrogen\integration\Model\KycResponseVo, HTTP status code, HTTP response headers (array of strings)
     */
    public function createKYCUsingPostWithHttpInfo($kyc_request_co)
    {
        $returnType = '\com\hydrogen\integration\Model\KycResponseVo';
        $request = $this->createKYCUsingPostRequest($kyc_request_co);

        try {
            $options = $this->createHttpClientOption();
            try {
                $response = $this->client->send($request, $options);
            } catch (RequestException $e) {
                throw new ApiException(
                    "[{$e->getCode()}] {$e->getMessage()}",
                    $e->getCode(),
                    $e->getResponse() ? $e->getResponse()->getHeaders() : null,
                    $e->getResponse() ? $e->getResponse()->getBody()->getContents() : null
                );
            }

            $statusCode = $response->getStatusCode();

            if ($statusCode < 200 || $statusCode > 299) {
                throw new ApiException(
                    sprintf(
                        '[%d] Error connecting to the API (%s)',
                        $statusCode,
                        $request->getUri()
                    ),
                    $statusCode,
                    $response->getHeaders(),
                    $response->getBody()
                );
            }

            $responseBody = $response->getBody();
            if ($returnType === '\SplFileObject') {
                $content = $responseBody; //stream goes to serializer
            } else {
                $content = $responseBody->getContents();
                if ($returnType !== 'string') {
                    $content = json_decode($content);
                }
            }

            return [
                ObjectSerializer::deserialize($content, $returnType, []),
                $response->getStatusCode(),
                $response->getHeaders()
            ];

        } catch (ApiException $e) {
            switch ($e->getCode()) {
                case 200:
                    $data = ObjectSerializer::deserialize(
                        $e->getResponseBody(),
                        '\com\hydrogen\integration\Model\KycResponseVo',
                        $e->getResponseHeaders()
                    );
                    $e->setResponseObject($data);
                    break;
            }
            throw $e;
        }
    }

    /**
     * Operation createKYCUsingPostAsync
     *
     * Do kyc for the client.
     *
     * @param  \com\hydrogen\integration\Model\KycRequestCO $kyc_request_co kycRequestCO (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function createKYCUsingPostAsync($kyc_request_co)
    {
        return $this->createKYCUsingPostAsyncWithHttpInfo($kyc_request_co)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation createKYCUsingPostAsyncWithHttpInfo
     *
     * Do kyc for the client.
     *
     * @param  \com\hydrogen\integration\Model\KycRequestCO $kyc_request_co kycRequestCO (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function createKYCUsingPostAsyncWithHttpInfo($kyc_request_co)
    {
        $returnType = '\com\hydrogen\integration\Model\KycResponseVo';
        $request = $this->createKYCUsingPostRequest($kyc_request_co);

        return $this->client
            ->sendAsync($request, $this->createHttpClientOption())
            ->then(
                function ($response) use ($returnType) {
                    $responseBody = $response->getBody();
                    if ($returnType === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                        if ($returnType !== 'string') {
                            $content = json_decode($content);
                        }
                    }

                    return [
                        ObjectSerializer::deserialize($content, $returnType, []),
                        $response->getStatusCode(),
                        $response->getHeaders()
                    ];
                },
                function ($exception) {
                    $response = $exception->getResponse();
                    $statusCode = $response->getStatusCode();
                    throw new ApiException(
                        sprintf(
                            '[%d] Error connecting to the API (%s)',
                            $statusCode,
                            $exception->getRequest()->getUri()
                        ),
                        $statusCode,
                        $response->getHeaders(),
                        $response->getBody()
                    );
                }
            );
    }

    /**
     * Create request for operation 'createKYCUsingPost'
     *
     * @param  \com\hydrogen\integration\Model\KycRequestCO $kyc_request_co kycRequestCO (required)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function createKYCUsingPostRequest($kyc_request_co)
    {
        // verify the required parameter 'kyc_request_co' is set
        if ($kyc_request_co === null || (is_array($kyc_request_co) && count($kyc_request_co) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $kyc_request_co when calling createKYCUsingPost'
            );
        }

        $resourcePath = '/kyc';
        $formParams = [];
        $queryParams = [];
        $headerParams = [];
        $httpBody = '';
        $multipart = false;



        // body params
        $_tempBody = null;
        if (isset($kyc_request_co)) {
            $_tempBody = $kyc_request_co;
        }

        if ($multipart) {
            $headers = $this->headerSelector->selectHeadersForMultipart(
                ['*/*']
            );
        } else {
            $headers = $this->headerSelector->selectHeaders(
                ['*/*'],
                ['application/json']
            );
        }

        // for model (json/xml)
        if (isset($_tempBody)) {
            // $_tempBody is the method argument, if present
            $httpBody = $_tempBody;
            
            if($headers['Content-Type'] === 'application/json') {
                // \stdClass has no __toString(), so we should encode it manually
                if ($httpBody instanceof \stdClass) {
                    $httpBody = \GuzzleHttp\json_encode($httpBody);
                }
                // array has no __toString(), so we should encode it manually
                if(is_array($httpBody)) {
                    $httpBody = \GuzzleHttp\json_encode(ObjectSerializer::sanitizeForSerialization($httpBody));
                }
            }
        } elseif (count($formParams) > 0) {
            if ($multipart) {
                $multipartContents = [];
                foreach ($formParams as $formParamName => $formParamValue) {
                    $multipartContents[] = [
                        'name' => $formParamName,
                        'contents' => $formParamValue
                    ];
                }
                // for HTTP post (form)
                $httpBody = new MultipartStream($multipartContents);

            } elseif ($headers['Content-Type'] === 'application/json') {
                $httpBody = \GuzzleHttp\json_encode($formParams);

            } else {
                // for HTTP post (form)
                $httpBody = \GuzzleHttp\Psr7\build_query($formParams);
            }
        }

        // this endpoint requires OAuth (access token)
        if ($this->config->getAccessToken() !== null) {
            $headers['Authorization'] = 'Bearer ' . $this->config->getAccessToken();
        }

        $defaultHeaders = [];
        if ($this->config->getUserAgent()) {
            $defaultHeaders['User-Agent'] = $this->config->getUserAgent();
        }

        $headers = array_merge(
            $defaultHeaders,
            $headerParams,
            $headers
        );

        $query = \GuzzleHttp\Psr7\build_query($queryParams);
        return new Request(
            'POST',
            $this->config->getHost() . $resourcePath . ($query ? "?{$query}" : ''),
            $headers,
            $httpBody
        );
    }

    /**
     * Operation getKYCStatusUsingGet
     *
     * Fetch kyc_status for the given nucleus_client_id
     *
     * @param  string $nucleus_client_id nucleus_client_id (required)
     * @param  bool $get_latest get_latest (optional, default to false)
     * @param  string $kyc_type kyc_type (optional, default to all)
     * @param  string $product product (optional, default to atom)
     *
     * @throws \com\hydrogen\integration\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \com\hydrogen\integration\Model\KycResponseVo[]
     */
    public function getKYCStatusUsingGet($nucleus_client_id, $get_latest = 'false', $kyc_type = 'all', $product = 'atom')
    {
        list($response) = $this->getKYCStatusUsingGetWithHttpInfo($nucleus_client_id, $get_latest, $kyc_type, $product);
        return $response;
    }

    /**
     * Operation getKYCStatusUsingGetWithHttpInfo
     *
     * Fetch kyc_status for the given nucleus_client_id
     *
     * @param  string $nucleus_client_id nucleus_client_id (required)
     * @param  bool $get_latest get_latest (optional, default to false)
     * @param  string $kyc_type kyc_type (optional, default to all)
     * @param  string $product product (optional, default to atom)
     *
     * @throws \com\hydrogen\integration\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \com\hydrogen\integration\Model\KycResponseVo[], HTTP status code, HTTP response headers (array of strings)
     */
    public function getKYCStatusUsingGetWithHttpInfo($nucleus_client_id, $get_latest = 'false', $kyc_type = 'all', $product = 'atom')
    {
        $returnType = '\com\hydrogen\integration\Model\KycResponseVo[]';
        $request = $this->getKYCStatusUsingGetRequest($nucleus_client_id, $get_latest, $kyc_type, $product);

        try {
            $options = $this->createHttpClientOption();
            try {
                $response = $this->client->send($request, $options);
            } catch (RequestException $e) {
                throw new ApiException(
                    "[{$e->getCode()}] {$e->getMessage()}",
                    $e->getCode(),
                    $e->getResponse() ? $e->getResponse()->getHeaders() : null,
                    $e->getResponse() ? $e->getResponse()->getBody()->getContents() : null
                );
            }

            $statusCode = $response->getStatusCode();

            if ($statusCode < 200 || $statusCode > 299) {
                throw new ApiException(
                    sprintf(
                        '[%d] Error connecting to the API (%s)',
                        $statusCode,
                        $request->getUri()
                    ),
                    $statusCode,
                    $response->getHeaders(),
                    $response->getBody()
                );
            }

            $responseBody = $response->getBody();
            if ($returnType === '\SplFileObject') {
                $content = $responseBody; //stream goes to serializer
            } else {
                $content = $responseBody->getContents();
                if ($returnType !== 'string') {
                    $content = json_decode($content);
                }
            }

            return [
                ObjectSerializer::deserialize($content, $returnType, []),
                $response->getStatusCode(),
                $response->getHeaders()
            ];

        } catch (ApiException $e) {
            switch ($e->getCode()) {
                case 200:
                    $data = ObjectSerializer::deserialize(
                        $e->getResponseBody(),
                        '\com\hydrogen\integration\Model\KycResponseVo[]',
                        $e->getResponseHeaders()
                    );
                    $e->setResponseObject($data);
                    break;
            }
            throw $e;
        }
    }

    /**
     * Operation getKYCStatusUsingGetAsync
     *
     * Fetch kyc_status for the given nucleus_client_id
     *
     * @param  string $nucleus_client_id nucleus_client_id (required)
     * @param  bool $get_latest get_latest (optional, default to false)
     * @param  string $kyc_type kyc_type (optional, default to all)
     * @param  string $product product (optional, default to atom)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getKYCStatusUsingGetAsync($nucleus_client_id, $get_latest = 'false', $kyc_type = 'all', $product = 'atom')
    {
        return $this->getKYCStatusUsingGetAsyncWithHttpInfo($nucleus_client_id, $get_latest, $kyc_type, $product)
            ->then(
                function ($response) {
                    return $response[0];
                }
            );
    }

    /**
     * Operation getKYCStatusUsingGetAsyncWithHttpInfo
     *
     * Fetch kyc_status for the given nucleus_client_id
     *
     * @param  string $nucleus_client_id nucleus_client_id (required)
     * @param  bool $get_latest get_latest (optional, default to false)
     * @param  string $kyc_type kyc_type (optional, default to all)
     * @param  string $product product (optional, default to atom)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Promise\PromiseInterface
     */
    public function getKYCStatusUsingGetAsyncWithHttpInfo($nucleus_client_id, $get_latest = 'false', $kyc_type = 'all', $product = 'atom')
    {
        $returnType = '\com\hydrogen\integration\Model\KycResponseVo[]';
        $request = $this->getKYCStatusUsingGetRequest($nucleus_client_id, $get_latest, $kyc_type, $product);

        return $this->client
            ->sendAsync($request, $this->createHttpClientOption())
            ->then(
                function ($response) use ($returnType) {
                    $responseBody = $response->getBody();
                    if ($returnType === '\SplFileObject') {
                        $content = $responseBody; //stream goes to serializer
                    } else {
                        $content = $responseBody->getContents();
                        if ($returnType !== 'string') {
                            $content = json_decode($content);
                        }
                    }

                    return [
                        ObjectSerializer::deserialize($content, $returnType, []),
                        $response->getStatusCode(),
                        $response->getHeaders()
                    ];
                },
                function ($exception) {
                    $response = $exception->getResponse();
                    $statusCode = $response->getStatusCode();
                    throw new ApiException(
                        sprintf(
                            '[%d] Error connecting to the API (%s)',
                            $statusCode,
                            $exception->getRequest()->getUri()
                        ),
                        $statusCode,
                        $response->getHeaders(),
                        $response->getBody()
                    );
                }
            );
    }

    /**
     * Create request for operation 'getKYCStatusUsingGet'
     *
     * @param  string $nucleus_client_id nucleus_client_id (required)
     * @param  bool $get_latest get_latest (optional, default to false)
     * @param  string $kyc_type kyc_type (optional, default to all)
     * @param  string $product product (optional, default to atom)
     *
     * @throws \InvalidArgumentException
     * @return \GuzzleHttp\Psr7\Request
     */
    protected function getKYCStatusUsingGetRequest($nucleus_client_id, $get_latest = 'false', $kyc_type = 'all', $product = 'atom')
    {
        // verify the required parameter 'nucleus_client_id' is set
        if ($nucleus_client_id === null || (is_array($nucleus_client_id) && count($nucleus_client_id) === 0)) {
            throw new \InvalidArgumentException(
                'Missing the required parameter $nucleus_client_id when calling getKYCStatusUsingGet'
            );
        }

        $resourcePath = '/kyc_status/{nucleus_client_id}';
        $formParams = [];
        $queryParams = [];
        $headerParams = [];
        $httpBody = '';
        $multipart = false;

        // query params
        if ($get_latest !== null) {
            $queryParams['get_latest'] = ObjectSerializer::toQueryValue($get_latest);
        }
        // query params
        if ($kyc_type !== null) {
            $queryParams['kyc_type'] = ObjectSerializer::toQueryValue($kyc_type);
        }
        // query params
        if ($product !== null) {
            $queryParams['product'] = ObjectSerializer::toQueryValue($product);
        }

        // path params
        if ($nucleus_client_id !== null) {
            $resourcePath = str_replace(
                '{' . 'nucleus_client_id' . '}',
                ObjectSerializer::toPathValue($nucleus_client_id),
                $resourcePath
            );
        }

        // body params
        $_tempBody = null;

        if ($multipart) {
            $headers = $this->headerSelector->selectHeadersForMultipart(
                ['*/*']
            );
        } else {
            $headers = $this->headerSelector->selectHeaders(
                ['*/*'],
                []
            );
        }

        // for model (json/xml)
        if (isset($_tempBody)) {
            // $_tempBody is the method argument, if present
            $httpBody = $_tempBody;
            
            if($headers['Content-Type'] === 'application/json') {
                // \stdClass has no __toString(), so we should encode it manually
                if ($httpBody instanceof \stdClass) {
                    $httpBody = \GuzzleHttp\json_encode($httpBody);
                }
                // array has no __toString(), so we should encode it manually
                if(is_array($httpBody)) {
                    $httpBody = \GuzzleHttp\json_encode(ObjectSerializer::sanitizeForSerialization($httpBody));
                }
            }
        } elseif (count($formParams) > 0) {
            if ($multipart) {
                $multipartContents = [];
                foreach ($formParams as $formParamName => $formParamValue) {
                    $multipartContents[] = [
                        'name' => $formParamName,
                        'contents' => $formParamValue
                    ];
                }
                // for HTTP post (form)
                $httpBody = new MultipartStream($multipartContents);

            } elseif ($headers['Content-Type'] === 'application/json') {
                $httpBody = \GuzzleHttp\json_encode($formParams);

            } else {
                // for HTTP post (form)
                $httpBody = \GuzzleHttp\Psr7\build_query($formParams);
            }
        }

        // this endpoint requires OAuth (access token)
        if ($this->config->getAccessToken() !== null) {
            $headers['Authorization'] = 'Bearer ' . $this->config->getAccessToken();
        }

        $defaultHeaders = [];
        if ($this->config->getUserAgent()) {
            $defaultHeaders['User-Agent'] = $this->config->getUserAgent();
        }

        $headers = array_merge(
            $defaultHeaders,
            $headerParams,
            $headers
        );

        $query = \GuzzleHttp\Psr7\build_query($queryParams);
        return new Request(
            'GET',
            $this->config->getHost() . $resourcePath . ($query ? "?{$query}" : ''),
            $headers,
            $httpBody
        );
    }

    /**
     * Create http client option
     *
     * @throws \RuntimeException on file opening failure
     * @return array of http client options
     */
    protected function createHttpClientOption()
    {
        $options = [];
        if ($this->config->getDebug()) {
            $options[RequestOptions::DEBUG] = fopen($this->config->getDebugFile(), 'a');
            if (!$options[RequestOptions::DEBUG]) {
                throw new \RuntimeException('Failed to open the debug file: ' . $this->config->getDebugFile());
            }
        }

        return $options;
    }
}