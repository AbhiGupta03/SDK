<?php
/**
 * AnnuityCalculatorInitialBalanceRequest
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
 * AnnuityCalculatorInitialBalanceRequest Class Doc Comment
 *
 * @category Class
 * @package  com\hydrogen\proton
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class AnnuityCalculatorInitialBalanceRequest implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'annuityCalculatorInitialBalanceRequest';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'inflation_rate' => 'float',
        'annuity_frequency_interval' => 'string',
        'deposit_schedule' => '\com\hydrogen\proton\Model\AnnuityDepositSchedule',
        'portfolio_return' => 'float',
        'create_log' => 'bool',
        'aggregation_account_ids' => 'string[]',
        'initial_balance' => 'float',
        'decumulation_horizon' => 'int',
        'tax_rate' => 'float',
        'account_ids' => 'string[]',
        'annuity_amount' => 'float',
        'accumulation_horizon' => 'int'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'inflation_rate' => 'float',
        'annuity_frequency_interval' => null,
        'deposit_schedule' => null,
        'portfolio_return' => 'float',
        'create_log' => null,
        'aggregation_account_ids' => 'uuid',
        'initial_balance' => 'float',
        'decumulation_horizon' => 'int32',
        'tax_rate' => 'float',
        'account_ids' => 'uuid',
        'annuity_amount' => 'float',
        'accumulation_horizon' => 'int32'
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
        'annuity_frequency_interval' => 'annuity_frequency_interval',
        'deposit_schedule' => 'deposit_schedule',
        'portfolio_return' => 'portfolio_return',
        'create_log' => 'create_log',
        'aggregation_account_ids' => 'aggregation_account_ids',
        'initial_balance' => 'initial_balance',
        'decumulation_horizon' => 'decumulation_horizon',
        'tax_rate' => 'tax_rate',
        'account_ids' => 'account_ids',
        'annuity_amount' => 'annuity_amount',
        'accumulation_horizon' => 'accumulation_horizon'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'inflation_rate' => 'setInflationRate',
        'annuity_frequency_interval' => 'setAnnuityFrequencyInterval',
        'deposit_schedule' => 'setDepositSchedule',
        'portfolio_return' => 'setPortfolioReturn',
        'create_log' => 'setCreateLog',
        'aggregation_account_ids' => 'setAggregationAccountIds',
        'initial_balance' => 'setInitialBalance',
        'decumulation_horizon' => 'setDecumulationHorizon',
        'tax_rate' => 'setTaxRate',
        'account_ids' => 'setAccountIds',
        'annuity_amount' => 'setAnnuityAmount',
        'accumulation_horizon' => 'setAccumulationHorizon'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'inflation_rate' => 'getInflationRate',
        'annuity_frequency_interval' => 'getAnnuityFrequencyInterval',
        'deposit_schedule' => 'getDepositSchedule',
        'portfolio_return' => 'getPortfolioReturn',
        'create_log' => 'getCreateLog',
        'aggregation_account_ids' => 'getAggregationAccountIds',
        'initial_balance' => 'getInitialBalance',
        'decumulation_horizon' => 'getDecumulationHorizon',
        'tax_rate' => 'getTaxRate',
        'account_ids' => 'getAccountIds',
        'annuity_amount' => 'getAnnuityAmount',
        'accumulation_horizon' => 'getAccumulationHorizon'
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

    const ANNUITY_FREQUENCY_INTERVAL_YEAR = 'year';
    const ANNUITY_FREQUENCY_INTERVAL_QUARTER = 'quarter';
    const ANNUITY_FREQUENCY_INTERVAL_MONTH = 'month';
    const ANNUITY_FREQUENCY_INTERVAL_WEEK = 'week';
    const ANNUITY_FREQUENCY_INTERVAL_DAY = 'day';
    

    
    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getAnnuityFrequencyIntervalAllowableValues()
    {
        return [
            self::ANNUITY_FREQUENCY_INTERVAL_YEAR,
            self::ANNUITY_FREQUENCY_INTERVAL_QUARTER,
            self::ANNUITY_FREQUENCY_INTERVAL_MONTH,
            self::ANNUITY_FREQUENCY_INTERVAL_WEEK,
            self::ANNUITY_FREQUENCY_INTERVAL_DAY,
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
        $this->container['annuity_frequency_interval'] = isset($data['annuity_frequency_interval']) ? $data['annuity_frequency_interval'] : 'year';
        $this->container['deposit_schedule'] = isset($data['deposit_schedule']) ? $data['deposit_schedule'] : null;
        $this->container['portfolio_return'] = isset($data['portfolio_return']) ? $data['portfolio_return'] : null;
        $this->container['create_log'] = isset($data['create_log']) ? $data['create_log'] : false;
        $this->container['aggregation_account_ids'] = isset($data['aggregation_account_ids']) ? $data['aggregation_account_ids'] : null;
        $this->container['initial_balance'] = isset($data['initial_balance']) ? $data['initial_balance'] : 0.0;
        $this->container['decumulation_horizon'] = isset($data['decumulation_horizon']) ? $data['decumulation_horizon'] : null;
        $this->container['tax_rate'] = isset($data['tax_rate']) ? $data['tax_rate'] : 0.0;
        $this->container['account_ids'] = isset($data['account_ids']) ? $data['account_ids'] : null;
        $this->container['annuity_amount'] = isset($data['annuity_amount']) ? $data['annuity_amount'] : null;
        $this->container['accumulation_horizon'] = isset($data['accumulation_horizon']) ? $data['accumulation_horizon'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if (!is_null($this->container['inflation_rate']) && ($this->container['inflation_rate'] > 20)) {
            $invalidProperties[] = "invalid value for 'inflation_rate', must be smaller than or equal to 20.";
        }

        if (!is_null($this->container['inflation_rate']) && ($this->container['inflation_rate'] < -1)) {
            $invalidProperties[] = "invalid value for 'inflation_rate', must be bigger than or equal to -1.";
        }

        $allowedValues = $this->getAnnuityFrequencyIntervalAllowableValues();
        if (!is_null($this->container['annuity_frequency_interval']) && !in_array($this->container['annuity_frequency_interval'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value for 'annuity_frequency_interval', must be one of '%s'",
                implode("', '", $allowedValues)
            );
        }

        if ($this->container['portfolio_return'] === null) {
            $invalidProperties[] = "'portfolio_return' can't be null";
        }
        if (!is_null($this->container['initial_balance']) && ($this->container['initial_balance'] < 0)) {
            $invalidProperties[] = "invalid value for 'initial_balance', must be bigger than or equal to 0.";
        }

        if ($this->container['decumulation_horizon'] === null) {
            $invalidProperties[] = "'decumulation_horizon' can't be null";
        }
        if (($this->container['decumulation_horizon'] < 1)) {
            $invalidProperties[] = "invalid value for 'decumulation_horizon', must be bigger than or equal to 1.";
        }

        if (!is_null($this->container['tax_rate']) && ($this->container['tax_rate'] > 1)) {
            $invalidProperties[] = "invalid value for 'tax_rate', must be smaller than or equal to 1.";
        }

        if (!is_null($this->container['tax_rate']) && ($this->container['tax_rate'] < 0)) {
            $invalidProperties[] = "invalid value for 'tax_rate', must be bigger than or equal to 0.";
        }

        if ($this->container['annuity_amount'] === null) {
            $invalidProperties[] = "'annuity_amount' can't be null";
        }
        if (($this->container['annuity_amount'] < 0)) {
            $invalidProperties[] = "invalid value for 'annuity_amount', must be bigger than or equal to 0.";
        }

        if ($this->container['accumulation_horizon'] === null) {
            $invalidProperties[] = "'accumulation_horizon' can't be null";
        }
        if (($this->container['accumulation_horizon'] < 0)) {
            $invalidProperties[] = "invalid value for 'accumulation_horizon', must be bigger than or equal to 0.";
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

        if (!is_null($inflation_rate) && ($inflation_rate > 20)) {
            throw new \InvalidArgumentException('invalid value for $inflation_rate when calling AnnuityCalculatorInitialBalanceRequest., must be smaller than or equal to 20.');
        }
        if (!is_null($inflation_rate) && ($inflation_rate < -1)) {
            throw new \InvalidArgumentException('invalid value for $inflation_rate when calling AnnuityCalculatorInitialBalanceRequest., must be bigger than or equal to -1.');
        }

        $this->container['inflation_rate'] = $inflation_rate;

        return $this;
    }

    /**
     * Gets annuity_frequency_interval
     *
     * @return string
     */
    public function getAnnuityFrequencyInterval()
    {
        return $this->container['annuity_frequency_interval'];
    }

    /**
     * Sets annuity_frequency_interval
     *
     * @param string $annuity_frequency_interval annuity_frequency_interval
     *
     * @return $this
     */
    public function setAnnuityFrequencyInterval($annuity_frequency_interval)
    {
        $allowedValues = $this->getAnnuityFrequencyIntervalAllowableValues();
        if (!is_null($annuity_frequency_interval) && !in_array($annuity_frequency_interval, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'annuity_frequency_interval', must be one of '%s'",
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['annuity_frequency_interval'] = $annuity_frequency_interval;

        return $this;
    }

    /**
     * Gets deposit_schedule
     *
     * @return \com\hydrogen\proton\Model\AnnuityDepositSchedule
     */
    public function getDepositSchedule()
    {
        return $this->container['deposit_schedule'];
    }

    /**
     * Sets deposit_schedule
     *
     * @param \com\hydrogen\proton\Model\AnnuityDepositSchedule $deposit_schedule deposit_schedule
     *
     * @return $this
     */
    public function setDepositSchedule($deposit_schedule)
    {
        $this->container['deposit_schedule'] = $deposit_schedule;

        return $this;
    }

    /**
     * Gets portfolio_return
     *
     * @return float
     */
    public function getPortfolioReturn()
    {
        return $this->container['portfolio_return'];
    }

    /**
     * Sets portfolio_return
     *
     * @param float $portfolio_return portfolio_return
     *
     * @return $this
     */
    public function setPortfolioReturn($portfolio_return)
    {
        $this->container['portfolio_return'] = $portfolio_return;

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
            throw new \InvalidArgumentException('invalid value for $initial_balance when calling AnnuityCalculatorInitialBalanceRequest., must be bigger than or equal to 0.');
        }

        $this->container['initial_balance'] = $initial_balance;

        return $this;
    }

    /**
     * Gets decumulation_horizon
     *
     * @return int
     */
    public function getDecumulationHorizon()
    {
        return $this->container['decumulation_horizon'];
    }

    /**
     * Sets decumulation_horizon
     *
     * @param int $decumulation_horizon decumulation_horizon
     *
     * @return $this
     */
    public function setDecumulationHorizon($decumulation_horizon)
    {

        if (($decumulation_horizon < 1)) {
            throw new \InvalidArgumentException('invalid value for $decumulation_horizon when calling AnnuityCalculatorInitialBalanceRequest., must be bigger than or equal to 1.');
        }

        $this->container['decumulation_horizon'] = $decumulation_horizon;

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
            throw new \InvalidArgumentException('invalid value for $tax_rate when calling AnnuityCalculatorInitialBalanceRequest., must be smaller than or equal to 1.');
        }
        if (!is_null($tax_rate) && ($tax_rate < 0)) {
            throw new \InvalidArgumentException('invalid value for $tax_rate when calling AnnuityCalculatorInitialBalanceRequest., must be bigger than or equal to 0.');
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
     * Gets annuity_amount
     *
     * @return float
     */
    public function getAnnuityAmount()
    {
        return $this->container['annuity_amount'];
    }

    /**
     * Sets annuity_amount
     *
     * @param float $annuity_amount annuity_amount
     *
     * @return $this
     */
    public function setAnnuityAmount($annuity_amount)
    {

        if (($annuity_amount < 0)) {
            throw new \InvalidArgumentException('invalid value for $annuity_amount when calling AnnuityCalculatorInitialBalanceRequest., must be bigger than or equal to 0.');
        }

        $this->container['annuity_amount'] = $annuity_amount;

        return $this;
    }

    /**
     * Gets accumulation_horizon
     *
     * @return int
     */
    public function getAccumulationHorizon()
    {
        return $this->container['accumulation_horizon'];
    }

    /**
     * Sets accumulation_horizon
     *
     * @param int $accumulation_horizon accumulation_horizon
     *
     * @return $this
     */
    public function setAccumulationHorizon($accumulation_horizon)
    {

        if (($accumulation_horizon < 0)) {
            throw new \InvalidArgumentException('invalid value for $accumulation_horizon when calling AnnuityCalculatorInitialBalanceRequest., must be bigger than or equal to 0.');
        }

        $this->container['accumulation_horizon'] = $accumulation_horizon;

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


