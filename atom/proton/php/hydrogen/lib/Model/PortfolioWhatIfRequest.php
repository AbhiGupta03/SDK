<?php
/**
 * PortfolioWhatIfRequest
 *
 * PHP version 5
 *
 * @category Class
 * @package  com\hydrogen\proton
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * Hydrogen Proton API
 *
 * Financial engineering module of Hydrogen Atom
 *
 * OpenAPI spec version: 1.8.0
 * Contact: info@hydrogenplatform.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 * Swagger Codegen version: 2.4.16
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace com\hydrogen\proton\Model;

use \ArrayAccess;
use \com\hydrogen\proton\ObjectSerializer;

/**
 * PortfolioWhatIfRequest Class Doc Comment
 *
 * @category Class
 * @package  com\hydrogen\proton
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class PortfolioWhatIfRequest implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'portfolioWhatIfRequest';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'altered_portfolio_weights' => 'float[]',
        'create_log' => 'bool',
        'aggregation_account_id' => 'string',
        'allocation_id' => 'string',
        'model_id' => 'string',
        'end_date' => 'string',
        'current_portfolio_tickers' => 'string[]',
        'use_proxy_data' => 'bool',
        'altered_portfolio_tickers' => 'string[]',
        'start_date' => 'string',
        'current_portfolio_weights' => 'float[]',
        'account_id' => 'string',
        'market_data_source' => 'string',
        'portfolio_id' => 'string'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'altered_portfolio_weights' => 'float',
        'create_log' => null,
        'aggregation_account_id' => 'uuid',
        'allocation_id' => 'uuid',
        'model_id' => 'uuid',
        'end_date' => null,
        'current_portfolio_tickers' => null,
        'use_proxy_data' => null,
        'altered_portfolio_tickers' => null,
        'start_date' => null,
        'current_portfolio_weights' => 'float',
        'account_id' => 'uuid',
        'market_data_source' => null,
        'portfolio_id' => 'uuid'
    ];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function swaggerTypes()
    {
        return self::$swaggerTypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function swaggerFormats()
    {
        return self::$swaggerFormats;
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'altered_portfolio_weights' => 'altered_portfolio_weights',
        'create_log' => 'create_log',
        'aggregation_account_id' => 'aggregation_account_id',
        'allocation_id' => 'allocation_id',
        'model_id' => 'model_id',
        'end_date' => 'end_date',
        'current_portfolio_tickers' => 'current_portfolio_tickers',
        'use_proxy_data' => 'use_proxy_data',
        'altered_portfolio_tickers' => 'altered_portfolio_tickers',
        'start_date' => 'start_date',
        'current_portfolio_weights' => 'current_portfolio_weights',
        'account_id' => 'account_id',
        'market_data_source' => 'market_data_source',
        'portfolio_id' => 'portfolio_id'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'altered_portfolio_weights' => 'setAlteredPortfolioWeights',
        'create_log' => 'setCreateLog',
        'aggregation_account_id' => 'setAggregationAccountId',
        'allocation_id' => 'setAllocationId',
        'model_id' => 'setModelId',
        'end_date' => 'setEndDate',
        'current_portfolio_tickers' => 'setCurrentPortfolioTickers',
        'use_proxy_data' => 'setUseProxyData',
        'altered_portfolio_tickers' => 'setAlteredPortfolioTickers',
        'start_date' => 'setStartDate',
        'current_portfolio_weights' => 'setCurrentPortfolioWeights',
        'account_id' => 'setAccountId',
        'market_data_source' => 'setMarketDataSource',
        'portfolio_id' => 'setPortfolioId'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'altered_portfolio_weights' => 'getAlteredPortfolioWeights',
        'create_log' => 'getCreateLog',
        'aggregation_account_id' => 'getAggregationAccountId',
        'allocation_id' => 'getAllocationId',
        'model_id' => 'getModelId',
        'end_date' => 'getEndDate',
        'current_portfolio_tickers' => 'getCurrentPortfolioTickers',
        'use_proxy_data' => 'getUseProxyData',
        'altered_portfolio_tickers' => 'getAlteredPortfolioTickers',
        'start_date' => 'getStartDate',
        'current_portfolio_weights' => 'getCurrentPortfolioWeights',
        'account_id' => 'getAccountId',
        'market_data_source' => 'getMarketDataSource',
        'portfolio_id' => 'getPortfolioId'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$swaggerModelName;
    }

    const MARKET_DATA_SOURCE_NUCLEUS = 'nucleus';
    const MARKET_DATA_SOURCE_INTEGRATION = 'integration';
    

    
    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getMarketDataSourceAllowableValues()
    {
        return [
            self::MARKET_DATA_SOURCE_NUCLEUS,
            self::MARKET_DATA_SOURCE_INTEGRATION,
        ];
    }
    

    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['altered_portfolio_weights'] = isset($data['altered_portfolio_weights']) ? $data['altered_portfolio_weights'] : null;
        $this->container['create_log'] = isset($data['create_log']) ? $data['create_log'] : false;
        $this->container['aggregation_account_id'] = isset($data['aggregation_account_id']) ? $data['aggregation_account_id'] : null;
        $this->container['allocation_id'] = isset($data['allocation_id']) ? $data['allocation_id'] : null;
        $this->container['model_id'] = isset($data['model_id']) ? $data['model_id'] : null;
        $this->container['end_date'] = isset($data['end_date']) ? $data['end_date'] : null;
        $this->container['current_portfolio_tickers'] = isset($data['current_portfolio_tickers']) ? $data['current_portfolio_tickers'] : null;
        $this->container['use_proxy_data'] = isset($data['use_proxy_data']) ? $data['use_proxy_data'] : false;
        $this->container['altered_portfolio_tickers'] = isset($data['altered_portfolio_tickers']) ? $data['altered_portfolio_tickers'] : null;
        $this->container['start_date'] = isset($data['start_date']) ? $data['start_date'] : null;
        $this->container['current_portfolio_weights'] = isset($data['current_portfolio_weights']) ? $data['current_portfolio_weights'] : null;
        $this->container['account_id'] = isset($data['account_id']) ? $data['account_id'] : null;
        $this->container['market_data_source'] = isset($data['market_data_source']) ? $data['market_data_source'] : 'nucleus';
        $this->container['portfolio_id'] = isset($data['portfolio_id']) ? $data['portfolio_id'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if ($this->container['altered_portfolio_weights'] === null) {
            $invalidProperties[] = "'altered_portfolio_weights' can't be null";
        }
        $allowedValues = $this->getMarketDataSourceAllowableValues();
        if (!is_null($this->container['market_data_source']) && !in_array($this->container['market_data_source'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value for 'market_data_source', must be one of '%s'",
                implode("', '", $allowedValues)
            );
        }

        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets altered_portfolio_weights
     *
     * @return float[]
     */
    public function getAlteredPortfolioWeights()
    {
        return $this->container['altered_portfolio_weights'];
    }

    /**
     * Sets altered_portfolio_weights
     *
     * @param float[] $altered_portfolio_weights altered_portfolio_weights
     *
     * @return $this
     */
    public function setAlteredPortfolioWeights($altered_portfolio_weights)
    {
        $this->container['altered_portfolio_weights'] = $altered_portfolio_weights;

        return $this;
    }

    /**
     * Gets create_log
     *
     * @return bool
     */
    public function getCreateLog()
    {
        return $this->container['create_log'];
    }

    /**
     * Sets create_log
     *
     * @param bool $create_log create_log
     *
     * @return $this
     */
    public function setCreateLog($create_log)
    {
        $this->container['create_log'] = $create_log;

        return $this;
    }

    /**
     * Gets aggregation_account_id
     *
     * @return string
     */
    public function getAggregationAccountId()
    {
        return $this->container['aggregation_account_id'];
    }

    /**
     * Sets aggregation_account_id
     *
     * @param string $aggregation_account_id aggregation_account_id
     *
     * @return $this
     */
    public function setAggregationAccountId($aggregation_account_id)
    {
        $this->container['aggregation_account_id'] = $aggregation_account_id;

        return $this;
    }

    /**
     * Gets allocation_id
     *
     * @return string
     */
    public function getAllocationId()
    {
        return $this->container['allocation_id'];
    }

    /**
     * Sets allocation_id
     *
     * @param string $allocation_id allocation_id
     *
     * @return $this
     */
    public function setAllocationId($allocation_id)
    {
        $this->container['allocation_id'] = $allocation_id;

        return $this;
    }

    /**
     * Gets model_id
     *
     * @return string
     */
    public function getModelId()
    {
        return $this->container['model_id'];
    }

    /**
     * Sets model_id
     *
     * @param string $model_id model_id
     *
     * @return $this
     */
    public function setModelId($model_id)
    {
        $this->container['model_id'] = $model_id;

        return $this;
    }

    /**
     * Gets end_date
     *
     * @return string
     */
    public function getEndDate()
    {
        return $this->container['end_date'];
    }

    /**
     * Sets end_date
     *
     * @param string $end_date end_date
     *
     * @return $this
     */
    public function setEndDate($end_date)
    {
        $this->container['end_date'] = $end_date;

        return $this;
    }

    /**
     * Gets current_portfolio_tickers
     *
     * @return string[]
     */
    public function getCurrentPortfolioTickers()
    {
        return $this->container['current_portfolio_tickers'];
    }

    /**
     * Sets current_portfolio_tickers
     *
     * @param string[] $current_portfolio_tickers current_portfolio_tickers
     *
     * @return $this
     */
    public function setCurrentPortfolioTickers($current_portfolio_tickers)
    {
        $this->container['current_portfolio_tickers'] = $current_portfolio_tickers;

        return $this;
    }

    /**
     * Gets use_proxy_data
     *
     * @return bool
     */
    public function getUseProxyData()
    {
        return $this->container['use_proxy_data'];
    }

    /**
     * Sets use_proxy_data
     *
     * @param bool $use_proxy_data use_proxy_data
     *
     * @return $this
     */
    public function setUseProxyData($use_proxy_data)
    {
        $this->container['use_proxy_data'] = $use_proxy_data;

        return $this;
    }

    /**
     * Gets altered_portfolio_tickers
     *
     * @return string[]
     */
    public function getAlteredPortfolioTickers()
    {
        return $this->container['altered_portfolio_tickers'];
    }

    /**
     * Sets altered_portfolio_tickers
     *
     * @param string[] $altered_portfolio_tickers altered_portfolio_tickers
     *
     * @return $this
     */
    public function setAlteredPortfolioTickers($altered_portfolio_tickers)
    {
        $this->container['altered_portfolio_tickers'] = $altered_portfolio_tickers;

        return $this;
    }

    /**
     * Gets start_date
     *
     * @return string
     */
    public function getStartDate()
    {
        return $this->container['start_date'];
    }

    /**
     * Sets start_date
     *
     * @param string $start_date start_date
     *
     * @return $this
     */
    public function setStartDate($start_date)
    {
        $this->container['start_date'] = $start_date;

        return $this;
    }

    /**
     * Gets current_portfolio_weights
     *
     * @return float[]
     */
    public function getCurrentPortfolioWeights()
    {
        return $this->container['current_portfolio_weights'];
    }

    /**
     * Sets current_portfolio_weights
     *
     * @param float[] $current_portfolio_weights current_portfolio_weights
     *
     * @return $this
     */
    public function setCurrentPortfolioWeights($current_portfolio_weights)
    {
        $this->container['current_portfolio_weights'] = $current_portfolio_weights;

        return $this;
    }

    /**
     * Gets account_id
     *
     * @return string
     */
    public function getAccountId()
    {
        return $this->container['account_id'];
    }

    /**
     * Sets account_id
     *
     * @param string $account_id account_id
     *
     * @return $this
     */
    public function setAccountId($account_id)
    {
        $this->container['account_id'] = $account_id;

        return $this;
    }

    /**
     * Gets market_data_source
     *
     * @return string
     */
    public function getMarketDataSource()
    {
        return $this->container['market_data_source'];
    }

    /**
     * Sets market_data_source
     *
     * @param string $market_data_source market_data_source
     *
     * @return $this
     */
    public function setMarketDataSource($market_data_source)
    {
        $allowedValues = $this->getMarketDataSourceAllowableValues();
        if (!is_null($market_data_source) && !in_array($market_data_source, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'market_data_source', must be one of '%s'",
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['market_data_source'] = $market_data_source;

        return $this;
    }

    /**
     * Gets portfolio_id
     *
     * @return string
     */
    public function getPortfolioId()
    {
        return $this->container['portfolio_id'];
    }

    /**
     * Sets portfolio_id
     *
     * @param string $portfolio_id portfolio_id
     *
     * @return $this
     */
    public function setPortfolioId($portfolio_id)
    {
        $this->container['portfolio_id'] = $portfolio_id;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed
     */
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     *
     * @param integer $offset Offset
     * @param mixed   $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        if (defined('JSON_PRETTY_PRINT')) { // use JSON pretty print
            return json_encode(
                ObjectSerializer::sanitizeForSerialization($this),
                JSON_PRETTY_PRINT
            );
        }

        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}


