<?php
/**
 * SavingsCalculatorRequest
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
 * SavingsCalculatorRequest Class Doc Comment
 *
 * @category Class
 * @package  com\hydrogen\proton
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class SavingsCalculatorRequest implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'savingsCalculatorRequest';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'inflation_rate' => 'float',
        'deposit_schedule' => '\com\hydrogen\proton\Model\SavingsDepositSchedule[]',
        'create_log' => 'bool',
        'aggregation_account_ids' => 'string[]',
        'initial_balance' => 'float',
        'horizon' => 'int',
        'horizon_frequency_interval' => 'string',
        'tax_rate' => 'float',
        'account_ids' => 'string[]',
        'return_schedule' => 'float[]'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'inflation_rate' => 'float',
        'deposit_schedule' => null,
        'create_log' => null,
        'aggregation_account_ids' => 'uuid',
        'initial_balance' => null,
        'horizon' => 'int32',
        'horizon_frequency_interval' => null,
        'tax_rate' => 'float',
        'account_ids' => 'uuid',
        'return_schedule' => 'float'
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
        'inflation_rate' => 'inflation_rate',
        'deposit_schedule' => 'deposit_schedule',
        'create_log' => 'create_log',
        'aggregation_account_ids' => 'aggregation_account_ids',
        'initial_balance' => 'initial_balance',
        'horizon' => 'horizon',
        'horizon_frequency_interval' => 'horizon_frequency_interval',
        'tax_rate' => 'tax_rate',
        'account_ids' => 'account_ids',
        'return_schedule' => 'return_schedule'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'inflation_rate' => 'setInflationRate',
        'deposit_schedule' => 'setDepositSchedule',
        'create_log' => 'setCreateLog',
        'aggregation_account_ids' => 'setAggregationAccountIds',
        'initial_balance' => 'setInitialBalance',
        'horizon' => 'setHorizon',
        'horizon_frequency_interval' => 'setHorizonFrequencyInterval',
        'tax_rate' => 'setTaxRate',
        'account_ids' => 'setAccountIds',
        'return_schedule' => 'setReturnSchedule'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'inflation_rate' => 'getInflationRate',
        'deposit_schedule' => 'getDepositSchedule',
        'create_log' => 'getCreateLog',
        'aggregation_account_ids' => 'getAggregationAccountIds',
        'initial_balance' => 'getInitialBalance',
        'horizon' => 'getHorizon',
        'horizon_frequency_interval' => 'getHorizonFrequencyInterval',
        'tax_rate' => 'getTaxRate',
        'account_ids' => 'getAccountIds',
        'return_schedule' => 'getReturnSchedule'
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

    const HORIZON_FREQUENCY_INTERVAL_YEAR = 'year';
    const HORIZON_FREQUENCY_INTERVAL_QUARTER = 'quarter';
    const HORIZON_FREQUENCY_INTERVAL_MONTH = 'month';
    const HORIZON_FREQUENCY_INTERVAL_WEEK = 'week';
    const HORIZON_FREQUENCY_INTERVAL_DAY = 'day';
    

    
    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getHorizonFrequencyIntervalAllowableValues()
    {
        return [
            self::HORIZON_FREQUENCY_INTERVAL_YEAR,
            self::HORIZON_FREQUENCY_INTERVAL_QUARTER,
            self::HORIZON_FREQUENCY_INTERVAL_MONTH,
            self::HORIZON_FREQUENCY_INTERVAL_WEEK,
            self::HORIZON_FREQUENCY_INTERVAL_DAY,
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
        $this->container['inflation_rate'] = isset($data['inflation_rate']) ? $data['inflation_rate'] : 0.0;
        $this->container['deposit_schedule'] = isset($data['deposit_schedule']) ? $data['deposit_schedule'] : null;
        $this->container['create_log'] = isset($data['create_log']) ? $data['create_log'] : false;
        $this->container['aggregation_account_ids'] = isset($data['aggregation_account_ids']) ? $data['aggregation_account_ids'] : null;
        $this->container['initial_balance'] = isset($data['initial_balance']) ? $data['initial_balance'] : null;
        $this->container['horizon'] = isset($data['horizon']) ? $data['horizon'] : null;
        $this->container['horizon_frequency_interval'] = isset($data['horizon_frequency_interval']) ? $data['horizon_frequency_interval'] : 'year';
        $this->container['tax_rate'] = isset($data['tax_rate']) ? $data['tax_rate'] : 0.0;
        $this->container['account_ids'] = isset($data['account_ids']) ? $data['account_ids'] : null;
        $this->container['return_schedule'] = isset($data['return_schedule']) ? $data['return_schedule'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if (!is_null($this->container['inflation_rate']) && ($this->container['inflation_rate'] < -1)) {
            $invalidProperties[] = "invalid value for 'inflation_rate', must be bigger than or equal to -1.";
        }

        if (!is_null($this->container['initial_balance']) && ($this->container['initial_balance'] < 0)) {
            $invalidProperties[] = "invalid value for 'initial_balance', must be bigger than or equal to 0.";
        }

        if ($this->container['horizon'] === null) {
            $invalidProperties[] = "'horizon' can't be null";
        }
        if (($this->container['horizon'] < 0)) {
            $invalidProperties[] = "invalid value for 'horizon', must be bigger than or equal to 0.";
        }

        $allowedValues = $this->getHorizonFrequencyIntervalAllowableValues();
        if (!is_null($this->container['horizon_frequency_interval']) && !in_array($this->container['horizon_frequency_interval'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value for 'horizon_frequency_interval', must be one of '%s'",
                implode("', '", $allowedValues)
            );
        }

        if (!is_null($this->container['tax_rate']) && ($this->container['tax_rate'] > 1)) {
            $invalidProperties[] = "invalid value for 'tax_rate', must be smaller than or equal to 1.";
        }

        if (!is_null($this->container['tax_rate']) && ($this->container['tax_rate'] < 0)) {
            $invalidProperties[] = "invalid value for 'tax_rate', must be bigger than or equal to 0.";
        }

        if ($this->container['return_schedule'] === null) {
            $invalidProperties[] = "'return_schedule' can't be null";
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
     * Gets inflation_rate
     *
     * @return float
     */
    public function getInflationRate()
    {
        return $this->container['inflation_rate'];
    }

    /**
     * Sets inflation_rate
     *
     * @param float $inflation_rate inflation_rate
     *
     * @return $this
     */
    public function setInflationRate($inflation_rate)
    {

        if (!is_null($inflation_rate) && ($inflation_rate < -1)) {
            throw new \InvalidArgumentException('invalid value for $inflation_rate when calling SavingsCalculatorRequest., must be bigger than or equal to -1.');
        }

        $this->container['inflation_rate'] = $inflation_rate;

        return $this;
    }

    /**
     * Gets deposit_schedule
     *
     * @return \com\hydrogen\proton\Model\SavingsDepositSchedule[]
     */
    public function getDepositSchedule()
    {
        return $this->container['deposit_schedule'];
    }

    /**
     * Sets deposit_schedule
     *
     * @param \com\hydrogen\proton\Model\SavingsDepositSchedule[] $deposit_schedule deposit_schedule
     *
     * @return $this
     */
    public function setDepositSchedule($deposit_schedule)
    {
        $this->container['deposit_schedule'] = $deposit_schedule;

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
     * Gets aggregation_account_ids
     *
     * @return string[]
     */
    public function getAggregationAccountIds()
    {
        return $this->container['aggregation_account_ids'];
    }

    /**
     * Sets aggregation_account_ids
     *
     * @param string[] $aggregation_account_ids aggregation_account_ids
     *
     * @return $this
     */
    public function setAggregationAccountIds($aggregation_account_ids)
    {
        $this->container['aggregation_account_ids'] = $aggregation_account_ids;

        return $this;
    }

    /**
     * Gets initial_balance
     *
     * @return float
     */
    public function getInitialBalance()
    {
        return $this->container['initial_balance'];
    }

    /**
     * Sets initial_balance
     *
     * @param float $initial_balance initial_balance
     *
     * @return $this
     */
    public function setInitialBalance($initial_balance)
    {

        if (!is_null($initial_balance) && ($initial_balance < 0)) {
            throw new \InvalidArgumentException('invalid value for $initial_balance when calling SavingsCalculatorRequest., must be bigger than or equal to 0.');
        }

        $this->container['initial_balance'] = $initial_balance;

        return $this;
    }

    /**
     * Gets horizon
     *
     * @return int
     */
    public function getHorizon()
    {
        return $this->container['horizon'];
    }

    /**
     * Sets horizon
     *
     * @param int $horizon horizon
     *
     * @return $this
     */
    public function setHorizon($horizon)
    {

        if (($horizon < 0)) {
            throw new \InvalidArgumentException('invalid value for $horizon when calling SavingsCalculatorRequest., must be bigger than or equal to 0.');
        }

        $this->container['horizon'] = $horizon;

        return $this;
    }

    /**
     * Gets horizon_frequency_interval
     *
     * @return string
     */
    public function getHorizonFrequencyInterval()
    {
        return $this->container['horizon_frequency_interval'];
    }

    /**
     * Sets horizon_frequency_interval
     *
     * @param string $horizon_frequency_interval horizon_frequency_interval
     *
     * @return $this
     */
    public function setHorizonFrequencyInterval($horizon_frequency_interval)
    {
        $allowedValues = $this->getHorizonFrequencyIntervalAllowableValues();
        if (!is_null($horizon_frequency_interval) && !in_array($horizon_frequency_interval, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'horizon_frequency_interval', must be one of '%s'",
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['horizon_frequency_interval'] = $horizon_frequency_interval;

        return $this;
    }

    /**
     * Gets tax_rate
     *
     * @return float
     */
    public function getTaxRate()
    {
        return $this->container['tax_rate'];
    }

    /**
     * Sets tax_rate
     *
     * @param float $tax_rate tax_rate
     *
     * @return $this
     */
    public function setTaxRate($tax_rate)
    {

        if (!is_null($tax_rate) && ($tax_rate > 1)) {
            throw new \InvalidArgumentException('invalid value for $tax_rate when calling SavingsCalculatorRequest., must be smaller than or equal to 1.');
        }
        if (!is_null($tax_rate) && ($tax_rate < 0)) {
            throw new \InvalidArgumentException('invalid value for $tax_rate when calling SavingsCalculatorRequest., must be bigger than or equal to 0.');
        }

        $this->container['tax_rate'] = $tax_rate;

        return $this;
    }

    /**
     * Gets account_ids
     *
     * @return string[]
     */
    public function getAccountIds()
    {
        return $this->container['account_ids'];
    }

    /**
     * Sets account_ids
     *
     * @param string[] $account_ids account_ids
     *
     * @return $this
     */
    public function setAccountIds($account_ids)
    {
        $this->container['account_ids'] = $account_ids;

        return $this;
    }

    /**
     * Gets return_schedule
     *
     * @return float[]
     */
    public function getReturnSchedule()
    {
        return $this->container['return_schedule'];
    }

    /**
     * Sets return_schedule
     *
     * @param float[] $return_schedule return_schedule
     *
     * @return $this
     */
    public function setReturnSchedule($return_schedule)
    {
        $this->container['return_schedule'] = $return_schedule;

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


