<?php
/**
 * AggregationAccountHoldingAggregateDataVO
 *
 * PHP version 5
 *
 * @category Class
 * @package  com\hydrogen
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * Hydrogen Atom API
 *
 * The Hydrogen Atom API
 *
 * OpenAPI spec version: 1.7.0
 * Contact: info@hydrogenplatform.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 * Swagger Codegen version: 2.4.14
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace com\hydrogen\Model;

use \ArrayAccess;
use \com\hydrogen\ObjectSerializer;

/**
 * AggregationAccountHoldingAggregateDataVO Class Doc Comment
 *
 * @category Class
 * @package  com\hydrogen
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class AggregationAccountHoldingAggregateDataVO implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'AggregationAccountHoldingAggregateDataVO';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'aggregation_account_holding_id' => 'string',
        'amount' => 'double',
        'asset_class' => 'string',
        'cost_basis' => 'double',
        'create_date' => '\DateTime',
        'currency_code' => 'string',
        'cusip' => 'string',
        'exchange' => 'string',
        'holding_date' => '\DateTime',
        'holding_type' => 'string',
        'metadata' => 'map[string,string]',
        'price' => 'double',
        'shares' => 'double',
        'ticker' => 'string',
        'ticker_name' => 'string',
        'update_date' => '\DateTime'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'aggregation_account_holding_id' => 'uuid',
        'amount' => 'double',
        'asset_class' => null,
        'cost_basis' => 'double',
        'create_date' => 'date-time',
        'currency_code' => null,
        'cusip' => null,
        'exchange' => null,
        'holding_date' => 'date-time',
        'holding_type' => null,
        'metadata' => null,
        'price' => 'double',
        'shares' => 'double',
        'ticker' => null,
        'ticker_name' => null,
        'update_date' => 'date-time'
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
        'aggregation_account_holding_id' => 'aggregation_account_holding_id',
        'amount' => 'amount',
        'asset_class' => 'asset_class',
        'cost_basis' => 'cost_basis',
        'create_date' => 'create_date',
        'currency_code' => 'currency_code',
        'cusip' => 'cusip',
        'exchange' => 'exchange',
        'holding_date' => 'holding_date',
        'holding_type' => 'holding_type',
        'metadata' => 'metadata',
        'price' => 'price',
        'shares' => 'shares',
        'ticker' => 'ticker',
        'ticker_name' => 'ticker_name',
        'update_date' => 'update_date'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'aggregation_account_holding_id' => 'setAggregationAccountHoldingId',
        'amount' => 'setAmount',
        'asset_class' => 'setAssetClass',
        'cost_basis' => 'setCostBasis',
        'create_date' => 'setCreateDate',
        'currency_code' => 'setCurrencyCode',
        'cusip' => 'setCusip',
        'exchange' => 'setExchange',
        'holding_date' => 'setHoldingDate',
        'holding_type' => 'setHoldingType',
        'metadata' => 'setMetadata',
        'price' => 'setPrice',
        'shares' => 'setShares',
        'ticker' => 'setTicker',
        'ticker_name' => 'setTickerName',
        'update_date' => 'setUpdateDate'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'aggregation_account_holding_id' => 'getAggregationAccountHoldingId',
        'amount' => 'getAmount',
        'asset_class' => 'getAssetClass',
        'cost_basis' => 'getCostBasis',
        'create_date' => 'getCreateDate',
        'currency_code' => 'getCurrencyCode',
        'cusip' => 'getCusip',
        'exchange' => 'getExchange',
        'holding_date' => 'getHoldingDate',
        'holding_type' => 'getHoldingType',
        'metadata' => 'getMetadata',
        'price' => 'getPrice',
        'shares' => 'getShares',
        'ticker' => 'getTicker',
        'ticker_name' => 'getTickerName',
        'update_date' => 'getUpdateDate'
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
        $this->container['aggregation_account_holding_id'] = isset($data['aggregation_account_holding_id']) ? $data['aggregation_account_holding_id'] : null;
        $this->container['amount'] = isset($data['amount']) ? $data['amount'] : null;
        $this->container['asset_class'] = isset($data['asset_class']) ? $data['asset_class'] : null;
        $this->container['cost_basis'] = isset($data['cost_basis']) ? $data['cost_basis'] : null;
        $this->container['create_date'] = isset($data['create_date']) ? $data['create_date'] : null;
        $this->container['currency_code'] = isset($data['currency_code']) ? $data['currency_code'] : null;
        $this->container['cusip'] = isset($data['cusip']) ? $data['cusip'] : null;
        $this->container['exchange'] = isset($data['exchange']) ? $data['exchange'] : null;
        $this->container['holding_date'] = isset($data['holding_date']) ? $data['holding_date'] : null;
        $this->container['holding_type'] = isset($data['holding_type']) ? $data['holding_type'] : null;
        $this->container['metadata'] = isset($data['metadata']) ? $data['metadata'] : null;
        $this->container['price'] = isset($data['price']) ? $data['price'] : null;
        $this->container['shares'] = isset($data['shares']) ? $data['shares'] : null;
        $this->container['ticker'] = isset($data['ticker']) ? $data['ticker'] : null;
        $this->container['ticker_name'] = isset($data['ticker_name']) ? $data['ticker_name'] : null;
        $this->container['update_date'] = isset($data['update_date']) ? $data['update_date'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

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
     * Gets aggregation_account_holding_id
     *
     * @return string
     */
    public function getAggregationAccountHoldingId()
    {
        return $this->container['aggregation_account_holding_id'];
    }

    /**
     * Sets aggregation_account_holding_id
     *
     * @param string $aggregation_account_holding_id aggregation_account_holding_id
     *
     * @return $this
     */
    public function setAggregationAccountHoldingId($aggregation_account_holding_id)
    {
        $this->container['aggregation_account_holding_id'] = $aggregation_account_holding_id;

        return $this;
    }

    /**
     * Gets amount
     *
     * @return double
     */
    public function getAmount()
    {
        return $this->container['amount'];
    }

    /**
     * Sets amount
     *
     * @param double $amount amount
     *
     * @return $this
     */
    public function setAmount($amount)
    {
        $this->container['amount'] = $amount;

        return $this;
    }

    /**
     * Gets asset_class
     *
     * @return string
     */
    public function getAssetClass()
    {
        return $this->container['asset_class'];
    }

    /**
     * Sets asset_class
     *
     * @param string $asset_class asset_class
     *
     * @return $this
     */
    public function setAssetClass($asset_class)
    {
        $this->container['asset_class'] = $asset_class;

        return $this;
    }

    /**
     * Gets cost_basis
     *
     * @return double
     */
    public function getCostBasis()
    {
        return $this->container['cost_basis'];
    }

    /**
     * Sets cost_basis
     *
     * @param double $cost_basis cost_basis
     *
     * @return $this
     */
    public function setCostBasis($cost_basis)
    {
        $this->container['cost_basis'] = $cost_basis;

        return $this;
    }

    /**
     * Gets create_date
     *
     * @return \DateTime
     */
    public function getCreateDate()
    {
        return $this->container['create_date'];
    }

    /**
     * Sets create_date
     *
     * @param \DateTime $create_date create_date
     *
     * @return $this
     */
    public function setCreateDate($create_date)
    {
        $this->container['create_date'] = $create_date;

        return $this;
    }

    /**
     * Gets currency_code
     *
     * @return string
     */
    public function getCurrencyCode()
    {
        return $this->container['currency_code'];
    }

    /**
     * Sets currency_code
     *
     * @param string $currency_code currency_code
     *
     * @return $this
     */
    public function setCurrencyCode($currency_code)
    {
        $this->container['currency_code'] = $currency_code;

        return $this;
    }

    /**
     * Gets cusip
     *
     * @return string
     */
    public function getCusip()
    {
        return $this->container['cusip'];
    }

    /**
     * Sets cusip
     *
     * @param string $cusip cusip
     *
     * @return $this
     */
    public function setCusip($cusip)
    {
        $this->container['cusip'] = $cusip;

        return $this;
    }

    /**
     * Gets exchange
     *
     * @return string
     */
    public function getExchange()
    {
        return $this->container['exchange'];
    }

    /**
     * Sets exchange
     *
     * @param string $exchange exchange
     *
     * @return $this
     */
    public function setExchange($exchange)
    {
        $this->container['exchange'] = $exchange;

        return $this;
    }

    /**
     * Gets holding_date
     *
     * @return \DateTime
     */
    public function getHoldingDate()
    {
        return $this->container['holding_date'];
    }

    /**
     * Sets holding_date
     *
     * @param \DateTime $holding_date holding_date
     *
     * @return $this
     */
    public function setHoldingDate($holding_date)
    {
        $this->container['holding_date'] = $holding_date;

        return $this;
    }

    /**
     * Gets holding_type
     *
     * @return string
     */
    public function getHoldingType()
    {
        return $this->container['holding_type'];
    }

    /**
     * Sets holding_type
     *
     * @param string $holding_type holding_type
     *
     * @return $this
     */
    public function setHoldingType($holding_type)
    {
        $this->container['holding_type'] = $holding_type;

        return $this;
    }

    /**
     * Gets metadata
     *
     * @return map[string,string]
     */
    public function getMetadata()
    {
        return $this->container['metadata'];
    }

    /**
     * Sets metadata
     *
     * @param map[string,string] $metadata metadata
     *
     * @return $this
     */
    public function setMetadata($metadata)
    {
        $this->container['metadata'] = $metadata;

        return $this;
    }

    /**
     * Gets price
     *
     * @return double
     */
    public function getPrice()
    {
        return $this->container['price'];
    }

    /**
     * Sets price
     *
     * @param double $price price
     *
     * @return $this
     */
    public function setPrice($price)
    {
        $this->container['price'] = $price;

        return $this;
    }

    /**
     * Gets shares
     *
     * @return double
     */
    public function getShares()
    {
        return $this->container['shares'];
    }

    /**
     * Sets shares
     *
     * @param double $shares shares
     *
     * @return $this
     */
    public function setShares($shares)
    {
        $this->container['shares'] = $shares;

        return $this;
    }

    /**
     * Gets ticker
     *
     * @return string
     */
    public function getTicker()
    {
        return $this->container['ticker'];
    }

    /**
     * Sets ticker
     *
     * @param string $ticker ticker
     *
     * @return $this
     */
    public function setTicker($ticker)
    {
        $this->container['ticker'] = $ticker;

        return $this;
    }

    /**
     * Gets ticker_name
     *
     * @return string
     */
    public function getTickerName()
    {
        return $this->container['ticker_name'];
    }

    /**
     * Sets ticker_name
     *
     * @param string $ticker_name ticker_name
     *
     * @return $this
     */
    public function setTickerName($ticker_name)
    {
        $this->container['ticker_name'] = $ticker_name;

        return $this;
    }

    /**
     * Gets update_date
     *
     * @return \DateTime
     */
    public function getUpdateDate()
    {
        return $this->container['update_date'];
    }

    /**
     * Sets update_date
     *
     * @param \DateTime $update_date update_date
     *
     * @return $this
     */
    public function setUpdateDate($update_date)
    {
        $this->container['update_date'] = $update_date;

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

