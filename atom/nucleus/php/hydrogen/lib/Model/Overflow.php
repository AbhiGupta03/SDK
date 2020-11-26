<?php
/**
 * Overflow
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
 * Overflow Class Doc Comment
 *
 * @category Class
 * @description Overflow Object
 * @package  com\hydrogen\nucleus
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class Overflow implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'Overflow';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'account_id' => 'string',
        'client_id' => 'string',
        'create_date' => '\DateTime',
        'funding_requests' => '\com\hydrogen\nucleus\Model\FundingRequestMap[]',
        'id' => 'string',
        'overflow_setting_id' => 'string',
        'total_overflow_amount' => 'double',
        'update_balances' => 'bool',
        'update_date' => '\DateTime'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'account_id' => 'uuid',
        'client_id' => 'uuid',
        'create_date' => 'date-time',
        'funding_requests' => null,
        'id' => 'uuid',
        'overflow_setting_id' => 'uuid',
        'total_overflow_amount' => 'double',
        'update_balances' => null,
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
        'account_id' => 'account_id',
        'client_id' => 'client_id',
        'create_date' => 'create_date',
        'funding_requests' => 'funding_requests',
        'id' => 'id',
        'overflow_setting_id' => 'overflow_setting_id',
        'total_overflow_amount' => 'total_overflow_amount',
        'update_balances' => 'update_balances',
        'update_date' => 'update_date'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'account_id' => 'setAccountId',
        'client_id' => 'setClientId',
        'create_date' => 'setCreateDate',
        'funding_requests' => 'setFundingRequests',
        'id' => 'setId',
        'overflow_setting_id' => 'setOverflowSettingId',
        'total_overflow_amount' => 'setTotalOverflowAmount',
        'update_balances' => 'setUpdateBalances',
        'update_date' => 'setUpdateDate'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'account_id' => 'getAccountId',
        'client_id' => 'getClientId',
        'create_date' => 'getCreateDate',
        'funding_requests' => 'getFundingRequests',
        'id' => 'getId',
        'overflow_setting_id' => 'getOverflowSettingId',
        'total_overflow_amount' => 'getTotalOverflowAmount',
        'update_balances' => 'getUpdateBalances',
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
        $this->container['account_id'] = isset($data['account_id']) ? $data['account_id'] : null;
        $this->container['client_id'] = isset($data['client_id']) ? $data['client_id'] : null;
        $this->container['create_date'] = isset($data['create_date']) ? $data['create_date'] : null;
        $this->container['funding_requests'] = isset($data['funding_requests']) ? $data['funding_requests'] : null;
        $this->container['id'] = isset($data['id']) ? $data['id'] : null;
        $this->container['overflow_setting_id'] = isset($data['overflow_setting_id']) ? $data['overflow_setting_id'] : null;
        $this->container['total_overflow_amount'] = isset($data['total_overflow_amount']) ? $data['total_overflow_amount'] : null;
        $this->container['update_balances'] = isset($data['update_balances']) ? $data['update_balances'] : null;
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

        if ($this->container['account_id'] === null) {
            $invalidProperties[] = "'account_id' can't be null";
        }
        if ($this->container['client_id'] === null) {
            $invalidProperties[] = "'client_id' can't be null";
        }
        if ($this->container['overflow_setting_id'] === null) {
            $invalidProperties[] = "'overflow_setting_id' can't be null";
        }
        if ($this->container['total_overflow_amount'] === null) {
            $invalidProperties[] = "'total_overflow_amount' can't be null";
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
     * @param string $account_id accountId
     *
     * @return $this
     */
    public function setAccountId($account_id)
    {
        $this->container['account_id'] = $account_id;

        return $this;
    }

    /**
     * Gets client_id
     *
     * @return string
     */
    public function getClientId()
    {
        return $this->container['client_id'];
    }

    /**
     * Sets client_id
     *
     * @param string $client_id clientId
     *
     * @return $this
     */
    public function setClientId($client_id)
    {
        $this->container['client_id'] = $client_id;

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
     * Gets funding_requests
     *
     * @return \com\hydrogen\nucleus\Model\FundingRequestMap[]
     */
    public function getFundingRequests()
    {
        return $this->container['funding_requests'];
    }

    /**
     * Sets funding_requests
     *
     * @param \com\hydrogen\nucleus\Model\FundingRequestMap[] $funding_requests funding_requests
     *
     * @return $this
     */
    public function setFundingRequests($funding_requests)
    {
        $this->container['funding_requests'] = $funding_requests;

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
     * Gets overflow_setting_id
     *
     * @return string
     */
    public function getOverflowSettingId()
    {
        return $this->container['overflow_setting_id'];
    }

    /**
     * Sets overflow_setting_id
     *
     * @param string $overflow_setting_id overflowSettingId
     *
     * @return $this
     */
    public function setOverflowSettingId($overflow_setting_id)
    {
        $this->container['overflow_setting_id'] = $overflow_setting_id;

        return $this;
    }

    /**
     * Gets total_overflow_amount
     *
     * @return double
     */
    public function getTotalOverflowAmount()
    {
        return $this->container['total_overflow_amount'];
    }

    /**
     * Sets total_overflow_amount
     *
     * @param double $total_overflow_amount totalOverflowAmount
     *
     * @return $this
     */
    public function setTotalOverflowAmount($total_overflow_amount)
    {
        $this->container['total_overflow_amount'] = $total_overflow_amount;

        return $this;
    }

    /**
     * Gets update_balances
     *
     * @return bool
     */
    public function getUpdateBalances()
    {
        return $this->container['update_balances'];
    }

    /**
     * Sets update_balances
     *
     * @param bool $update_balances updateBalances
     *
     * @return $this
     */
    public function setUpdateBalances($update_balances)
    {
        $this->container['update_balances'] = $update_balances;

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


