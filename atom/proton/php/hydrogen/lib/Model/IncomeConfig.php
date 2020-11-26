<?php
/**
 * IncomeConfig
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
 * IncomeConfig Class Doc Comment
 *
 * @category Class
 * @package  com\hydrogen\proton
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class IncomeConfig implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'IncomeConfig';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'income_benefit_duration' => 'int',
        'annual_net_take_home_pay' => 'float',
        'percentage_of_income_covered' => 'float'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'income_benefit_duration' => 'int32',
        'annual_net_take_home_pay' => null,
        'percentage_of_income_covered' => 'float'
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
        'income_benefit_duration' => 'income_benefit_duration',
        'annual_net_take_home_pay' => 'annual_net_take_home_pay',
        'percentage_of_income_covered' => 'percentage_of_income_covered'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'income_benefit_duration' => 'setIncomeBenefitDuration',
        'annual_net_take_home_pay' => 'setAnnualNetTakeHomePay',
        'percentage_of_income_covered' => 'setPercentageOfIncomeCovered'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'income_benefit_duration' => 'getIncomeBenefitDuration',
        'annual_net_take_home_pay' => 'getAnnualNetTakeHomePay',
        'percentage_of_income_covered' => 'getPercentageOfIncomeCovered'
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
        $this->container['income_benefit_duration'] = isset($data['income_benefit_duration']) ? $data['income_benefit_duration'] : 10;
        $this->container['annual_net_take_home_pay'] = isset($data['annual_net_take_home_pay']) ? $data['annual_net_take_home_pay'] : null;
        $this->container['percentage_of_income_covered'] = isset($data['percentage_of_income_covered']) ? $data['percentage_of_income_covered'] : 1.0;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if (!is_null($this->container['income_benefit_duration']) && ($this->container['income_benefit_duration'] < 1)) {
            $invalidProperties[] = "invalid value for 'income_benefit_duration', must be bigger than or equal to 1.";
        }

        if ($this->container['annual_net_take_home_pay'] === null) {
            $invalidProperties[] = "'annual_net_take_home_pay' can't be null";
        }
        if (($this->container['annual_net_take_home_pay'] < 0)) {
            $invalidProperties[] = "invalid value for 'annual_net_take_home_pay', must be bigger than or equal to 0.";
        }

        if (!is_null($this->container['percentage_of_income_covered']) && ($this->container['percentage_of_income_covered'] > 1)) {
            $invalidProperties[] = "invalid value for 'percentage_of_income_covered', must be smaller than or equal to 1.";
        }

        if (!is_null($this->container['percentage_of_income_covered']) && ($this->container['percentage_of_income_covered'] < 0)) {
            $invalidProperties[] = "invalid value for 'percentage_of_income_covered', must be bigger than or equal to 0.";
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
     * Gets income_benefit_duration
     *
     * @return int
     */
    public function getIncomeBenefitDuration()
    {
        return $this->container['income_benefit_duration'];
    }

    /**
     * Sets income_benefit_duration
     *
     * @param int $income_benefit_duration income_benefit_duration
     *
     * @return $this
     */
    public function setIncomeBenefitDuration($income_benefit_duration)
    {

        if (!is_null($income_benefit_duration) && ($income_benefit_duration < 1)) {
            throw new \InvalidArgumentException('invalid value for $income_benefit_duration when calling IncomeConfig., must be bigger than or equal to 1.');
        }

        $this->container['income_benefit_duration'] = $income_benefit_duration;

        return $this;
    }

    /**
     * Gets annual_net_take_home_pay
     *
     * @return float
     */
    public function getAnnualNetTakeHomePay()
    {
        return $this->container['annual_net_take_home_pay'];
    }

    /**
     * Sets annual_net_take_home_pay
     *
     * @param float $annual_net_take_home_pay annual_net_take_home_pay
     *
     * @return $this
     */
    public function setAnnualNetTakeHomePay($annual_net_take_home_pay)
    {

        if (($annual_net_take_home_pay < 0)) {
            throw new \InvalidArgumentException('invalid value for $annual_net_take_home_pay when calling IncomeConfig., must be bigger than or equal to 0.');
        }

        $this->container['annual_net_take_home_pay'] = $annual_net_take_home_pay;

        return $this;
    }

    /**
     * Gets percentage_of_income_covered
     *
     * @return float
     */
    public function getPercentageOfIncomeCovered()
    {
        return $this->container['percentage_of_income_covered'];
    }

    /**
     * Sets percentage_of_income_covered
     *
     * @param float $percentage_of_income_covered percentage_of_income_covered
     *
     * @return $this
     */
    public function setPercentageOfIncomeCovered($percentage_of_income_covered)
    {

        if (!is_null($percentage_of_income_covered) && ($percentage_of_income_covered > 1)) {
            throw new \InvalidArgumentException('invalid value for $percentage_of_income_covered when calling IncomeConfig., must be smaller than or equal to 1.');
        }
        if (!is_null($percentage_of_income_covered) && ($percentage_of_income_covered < 0)) {
            throw new \InvalidArgumentException('invalid value for $percentage_of_income_covered when calling IncomeConfig., must be bigger than or equal to 0.');
        }

        $this->container['percentage_of_income_covered'] = $percentage_of_income_covered;

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


