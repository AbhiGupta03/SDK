<?php
/**
 * SecurityPrice
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
 * OpenAPI spec version: 1.9.2
 * Contact: info@hydrogenplatform.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 * Swagger Codegen version: 2.4.19
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
 * SecurityPrice Class Doc Comment
 *
 * @category Class
 * @package  com\hydrogen\nucleus
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class SecurityPrice implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'SecurityPrice';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'adjusted_price' => 'double',
        'create_date' => '\DateTime',
        'currency_code' => 'string',
        'date' => '\DateTime',
        'high' => 'double',
        'id' => 'string',
        'low' => 'double',
        'open' => 'double',
        'price' => 'double',
        'secondary_id' => 'string',
        'security_id' => 'string',
        'update_date' => '\DateTime',
        'volume' => 'double'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'adjusted_price' => 'double',
        'create_date' => 'date-time',
        'currency_code' => null,
        'date' => 'date-time',
        'high' => 'double',
        'id' => 'uuid',
        'low' => 'double',
        'open' => 'double',
        'price' => 'double',
        'secondary_id' => null,
        'security_id' => 'uuid',
        'update_date' => 'date-time',
        'volume' => 'double'
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
        'adjusted_price' => 'adjusted_price',
        'create_date' => 'create_date',
        'currency_code' => 'currency_code',
        'date' => 'date',
        'high' => 'high',
        'id' => 'id',
        'low' => 'low',
        'open' => 'open',
        'price' => 'price',
        'secondary_id' => 'secondary_id',
        'security_id' => 'security_id',
        'update_date' => 'update_date',
        'volume' => 'volume'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'adjusted_price' => 'setAdjustedPrice',
        'create_date' => 'setCreateDate',
        'currency_code' => 'setCurrencyCode',
        'date' => 'setDate',
        'high' => 'setHigh',
        'id' => 'setId',
        'low' => 'setLow',
        'open' => 'setOpen',
        'price' => 'setPrice',
        'secondary_id' => 'setSecondaryId',
        'security_id' => 'setSecurityId',
        'update_date' => 'setUpdateDate',
        'volume' => 'setVolume'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'adjusted_price' => 'getAdjustedPrice',
        'create_date' => 'getCreateDate',
        'currency_code' => 'getCurrencyCode',
        'date' => 'getDate',
        'high' => 'getHigh',
        'id' => 'getId',
        'low' => 'getLow',
        'open' => 'getOpen',
        'price' => 'getPrice',
        'secondary_id' => 'getSecondaryId',
        'security_id' => 'getSecurityId',
        'update_date' => 'getUpdateDate',
        'volume' => 'getVolume'
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
        $this->container['adjusted_price'] = isset($data['adjusted_price']) ? $data['adjusted_price'] : null;
        $this->container['create_date'] = isset($data['create_date']) ? $data['create_date'] : null;
        $this->container['currency_code'] = isset($data['currency_code']) ? $data['currency_code'] : null;
        $this->container['date'] = isset($data['date']) ? $data['date'] : null;
        $this->container['high'] = isset($data['high']) ? $data['high'] : null;
        $this->container['id'] = isset($data['id']) ? $data['id'] : null;
        $this->container['low'] = isset($data['low']) ? $data['low'] : null;
        $this->container['open'] = isset($data['open']) ? $data['open'] : null;
        $this->container['price'] = isset($data['price']) ? $data['price'] : null;
        $this->container['secondary_id'] = isset($data['secondary_id']) ? $data['secondary_id'] : null;
        $this->container['security_id'] = isset($data['security_id']) ? $data['security_id'] : null;
        $this->container['update_date'] = isset($data['update_date']) ? $data['update_date'] : null;
        $this->container['volume'] = isset($data['volume']) ? $data['volume'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if ($this->container['date'] === null) {
            $invalidProperties[] = "'date' can't be null";
        }
        if ($this->container['price'] === null) {
            $invalidProperties[] = "'price' can't be null";
        }
        if ($this->container['security_id'] === null) {
            $invalidProperties[] = "'security_id' can't be null";
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
     * Gets adjusted_price
     *
     * @return double
     */
    public function getAdjustedPrice()
    {
        return $this->container['adjusted_price'];
    }

    /**
     * Sets adjusted_price
     *
     * @param double $adjusted_price Security adjusted price
     *
     * @return $this
     */
    public function setAdjustedPrice($adjusted_price)
    {
        $this->container['adjusted_price'] = $adjusted_price;

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
     * Gets date
     *
     * @return \DateTime
     */
    public function getDate()
    {
        return $this->container['date'];
    }

    /**
     * Sets date
     *
     * @param \DateTime $date Security date
     *
     * @return $this
     */
    public function setDate($date)
    {
        $this->container['date'] = $date;

        return $this;
    }

    /**
     * Gets high
     *
     * @return double
     */
    public function getHigh()
    {
        return $this->container['high'];
    }

    /**
     * Sets high
     *
     * @param double $high high
     *
     * @return $this
     */
    public function setHigh($high)
    {
        $this->container['high'] = $high;

        return $this;
    }

    /**
     * Gets id
     *
     * @return string
     */
    public function getId()
    {
        return $this->container['id'];
    }

    /**
     * Sets id
     *
     * @param string $id id
     *
     * @return $this
     */
    public function setId($id)
    {
        $this->container['id'] = $id;

        return $this;
    }

    /**
     * Gets low
     *
     * @return double
     */
    public function getLow()
    {
        return $this->container['low'];
    }

    /**
     * Sets low
     *
     * @param double $low low
     *
     * @return $this
     */
    public function setLow($low)
    {
        $this->container['low'] = $low;

        return $this;
    }

    /**
     * Gets open
     *
     * @return double
     */
    public function getOpen()
    {
        return $this->container['open'];
    }

    /**
     * Sets open
     *
     * @param double $open open
     *
     * @return $this
     */
    public function setOpen($open)
    {
        $this->container['open'] = $open;

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
     * @param double $price Security price
     *
     * @return $this
     */
    public function setPrice($price)
    {
        $this->container['price'] = $price;

        return $this;
    }

    /**
     * Gets secondary_id
     *
     * @return string
     */
    public function getSecondaryId()
    {
        return $this->container['secondary_id'];
    }

    /**
     * Sets secondary_id
     *
     * @param string $secondary_id secondary_id
     *
     * @return $this
     */
    public function setSecondaryId($secondary_id)
    {
        $this->container['secondary_id'] = $secondary_id;

        return $this;
    }

    /**
     * Gets security_id
     *
     * @return string
     */
    public function getSecurityId()
    {
        return $this->container['security_id'];
    }

    /**
     * Sets security_id
     *
     * @param string $security_id Security id
     *
     * @return $this
     */
    public function setSecurityId($security_id)
    {
        $this->container['security_id'] = $security_id;

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
     * Gets volume
     *
     * @return double
     */
    public function getVolume()
    {
        return $this->container['volume'];
    }

    /**
     * Sets volume
     *
     * @param double $volume volume
     *
     * @return $this
     */
    public function setVolume($volume)
    {
        $this->container['volume'] = $volume;

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


