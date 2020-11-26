<?php
/**
 * AvailableDateDoubleVO
 *
 * PHP version 5
 *
 * @category Class
 * @package  com\hydrogen\nucleus
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * Hydrogen Nucleus API
 *
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.8.0
 * Contact: info@hydrogenplatform.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 * Swagger Codegen version: 2.4.15
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace com\hydrogen\nucleus\Model;

use \ArrayAccess;
use \com\hydrogen\nucleus\ObjectSerializer;

/**
 * AvailableDateDoubleVO Class Doc Comment
 *
 * @category Class
 * @description Available Date-Double Mapping Object
 * @package  com\hydrogen\nucleus
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class AvailableDateDoubleVO implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'AvailableDateDoubleVO';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'additions' => 'double',
        'cash_flow' => 'double',
        'currency_code' => 'string',
        'date' => 'string',
        'value' => 'double',
        'value_available' => 'double',
        'value_pending' => 'double'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'additions' => 'double',
        'cash_flow' => 'double',
        'currency_code' => null,
        'date' => null,
        'value' => 'double',
        'value_available' => 'double',
        'value_pending' => 'double'
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
        'additions' => 'additions',
        'cash_flow' => 'cash_flow',
        'currency_code' => 'currency_code',
        'date' => 'date',
        'value' => 'value',
        'value_available' => 'value_available',
        'value_pending' => 'value_pending'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'additions' => 'setAdditions',
        'cash_flow' => 'setCashFlow',
        'currency_code' => 'setCurrencyCode',
        'date' => 'setDate',
        'value' => 'setValue',
        'value_available' => 'setValueAvailable',
        'value_pending' => 'setValuePending'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'additions' => 'getAdditions',
        'cash_flow' => 'getCashFlow',
        'currency_code' => 'getCurrencyCode',
        'date' => 'getDate',
        'value' => 'getValue',
        'value_available' => 'getValueAvailable',
        'value_pending' => 'getValuePending'
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
        $this->container['additions'] = isset($data['additions']) ? $data['additions'] : null;
        $this->container['cash_flow'] = isset($data['cash_flow']) ? $data['cash_flow'] : null;
        $this->container['currency_code'] = isset($data['currency_code']) ? $data['currency_code'] : null;
        $this->container['date'] = isset($data['date']) ? $data['date'] : null;
        $this->container['value'] = isset($data['value']) ? $data['value'] : null;
        $this->container['value_available'] = isset($data['value_available']) ? $data['value_available'] : null;
        $this->container['value_pending'] = isset($data['value_pending']) ? $data['value_pending'] : null;
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
     * Gets additions
     *
     * @return double
     */
    public function getAdditions()
    {
        return $this->container['additions'];
    }

    /**
     * Sets additions
     *
     * @param double $additions additions
     *
     * @return $this
     */
    public function setAdditions($additions)
    {
        $this->container['additions'] = $additions;

        return $this;
    }

    /**
     * Gets cash_flow
     *
     * @return double
     */
    public function getCashFlow()
    {
        return $this->container['cash_flow'];
    }

    /**
     * Sets cash_flow
     *
     * @param double $cash_flow cashFlow
     *
     * @return $this
     */
    public function setCashFlow($cash_flow)
    {
        $this->container['cash_flow'] = $cash_flow;

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
     * @param string $currency_code currencyCode
     *
     * @return $this
     */
    public function setCurrencyCode($currency_code)
    {
        $this->container['currency_code'] = $currency_code;

        return $this;
    }

    /**
     * Gets date
     *
     * @return string
     */
    public function getDate()
    {
        return $this->container['date'];
    }

    /**
     * Sets date
     *
     * @param string $date date
     *
     * @return $this
     */
    public function setDate($date)
    {
        $this->container['date'] = $date;

        return $this;
    }

    /**
     * Gets value
     *
     * @return double
     */
    public function getValue()
    {
        return $this->container['value'];
    }

    /**
     * Sets value
     *
     * @param double $value value
     *
     * @return $this
     */
    public function setValue($value)
    {
        $this->container['value'] = $value;

        return $this;
    }

    /**
     * Gets value_available
     *
     * @return double
     */
    public function getValueAvailable()
    {
        return $this->container['value_available'];
    }

    /**
     * Sets value_available
     *
     * @param double $value_available valueAvailable
     *
     * @return $this
     */
    public function setValueAvailable($value_available)
    {
        $this->container['value_available'] = $value_available;

        return $this;
    }

    /**
     * Gets value_pending
     *
     * @return double
     */
    public function getValuePending()
    {
        return $this->container['value_pending'];
    }

    /**
     * Sets value_pending
     *
     * @param double $value_pending valuePending
     *
     * @return $this
     */
    public function setValuePending($value_pending)
    {
        $this->container['value_pending'] = $value_pending;

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


