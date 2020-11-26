<?php
/**
 * GoalTrack
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
 * GoalTrack Class Doc Comment
 *
 * @category Class
 * @description Goal Simulation Result Object
 * @package  com\hydrogen\nucleus
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class GoalTrack implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'GoalTrack';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'accounts' => '\com\hydrogen\nucleus\Model\GoalTrackAccounts[]',
        'accumulation_horizon' => 'double',
        'client_id' => 'string',
        'create_date' => '\DateTime',
        'current_investment' => 'double',
        'decumulation_horizon' => 'double',
        'goal_achievement_score' => 'double',
        'goal_amount' => 'double',
        'goal_id' => 'string',
        'goal_probability' => 'double',
        'id' => 'string',
        'metadata' => 'map[string,string]',
        'on_track' => 'bool',
        'progress' => 'double',
        'projection_balance' => 'double',
        'projection_date' => '\DateTime',
        'secondary_id' => 'string',
        'status_time_stamp' => '\DateTime',
        'update_date' => '\DateTime'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'accounts' => null,
        'accumulation_horizon' => 'double',
        'client_id' => 'uuid',
        'create_date' => 'date-time',
        'current_investment' => 'double',
        'decumulation_horizon' => 'double',
        'goal_achievement_score' => 'double',
        'goal_amount' => 'double',
        'goal_id' => 'uuid',
        'goal_probability' => 'double',
        'id' => 'uuid',
        'metadata' => null,
        'on_track' => null,
        'progress' => 'double',
        'projection_balance' => 'double',
        'projection_date' => 'date',
        'secondary_id' => null,
        'status_time_stamp' => 'date-time',
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
        'accounts' => 'accounts',
        'accumulation_horizon' => 'accumulation_horizon',
        'client_id' => 'client_id',
        'create_date' => 'create_date',
        'current_investment' => 'current_investment',
        'decumulation_horizon' => 'decumulation_horizon',
        'goal_achievement_score' => 'goal_achievement_score',
        'goal_amount' => 'goal_amount',
        'goal_id' => 'goal_id',
        'goal_probability' => 'goal_probability',
        'id' => 'id',
        'metadata' => 'metadata',
        'on_track' => 'on_track',
        'progress' => 'progress',
        'projection_balance' => 'projection_balance',
        'projection_date' => 'projection_date',
        'secondary_id' => 'secondary_id',
        'status_time_stamp' => 'status_time_stamp',
        'update_date' => 'update_date'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'accounts' => 'setAccounts',
        'accumulation_horizon' => 'setAccumulationHorizon',
        'client_id' => 'setClientId',
        'create_date' => 'setCreateDate',
        'current_investment' => 'setCurrentInvestment',
        'decumulation_horizon' => 'setDecumulationHorizon',
        'goal_achievement_score' => 'setGoalAchievementScore',
        'goal_amount' => 'setGoalAmount',
        'goal_id' => 'setGoalId',
        'goal_probability' => 'setGoalProbability',
        'id' => 'setId',
        'metadata' => 'setMetadata',
        'on_track' => 'setOnTrack',
        'progress' => 'setProgress',
        'projection_balance' => 'setProjectionBalance',
        'projection_date' => 'setProjectionDate',
        'secondary_id' => 'setSecondaryId',
        'status_time_stamp' => 'setStatusTimeStamp',
        'update_date' => 'setUpdateDate'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'accounts' => 'getAccounts',
        'accumulation_horizon' => 'getAccumulationHorizon',
        'client_id' => 'getClientId',
        'create_date' => 'getCreateDate',
        'current_investment' => 'getCurrentInvestment',
        'decumulation_horizon' => 'getDecumulationHorizon',
        'goal_achievement_score' => 'getGoalAchievementScore',
        'goal_amount' => 'getGoalAmount',
        'goal_id' => 'getGoalId',
        'goal_probability' => 'getGoalProbability',
        'id' => 'getId',
        'metadata' => 'getMetadata',
        'on_track' => 'getOnTrack',
        'progress' => 'getProgress',
        'projection_balance' => 'getProjectionBalance',
        'projection_date' => 'getProjectionDate',
        'secondary_id' => 'getSecondaryId',
        'status_time_stamp' => 'getStatusTimeStamp',
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
        $this->container['accounts'] = isset($data['accounts']) ? $data['accounts'] : null;
        $this->container['accumulation_horizon'] = isset($data['accumulation_horizon']) ? $data['accumulation_horizon'] : null;
        $this->container['client_id'] = isset($data['client_id']) ? $data['client_id'] : null;
        $this->container['create_date'] = isset($data['create_date']) ? $data['create_date'] : null;
        $this->container['current_investment'] = isset($data['current_investment']) ? $data['current_investment'] : null;
        $this->container['decumulation_horizon'] = isset($data['decumulation_horizon']) ? $data['decumulation_horizon'] : null;
        $this->container['goal_achievement_score'] = isset($data['goal_achievement_score']) ? $data['goal_achievement_score'] : null;
        $this->container['goal_amount'] = isset($data['goal_amount']) ? $data['goal_amount'] : null;
        $this->container['goal_id'] = isset($data['goal_id']) ? $data['goal_id'] : null;
        $this->container['goal_probability'] = isset($data['goal_probability']) ? $data['goal_probability'] : null;
        $this->container['id'] = isset($data['id']) ? $data['id'] : null;
        $this->container['metadata'] = isset($data['metadata']) ? $data['metadata'] : null;
        $this->container['on_track'] = isset($data['on_track']) ? $data['on_track'] : null;
        $this->container['progress'] = isset($data['progress']) ? $data['progress'] : null;
        $this->container['projection_balance'] = isset($data['projection_balance']) ? $data['projection_balance'] : null;
        $this->container['projection_date'] = isset($data['projection_date']) ? $data['projection_date'] : null;
        $this->container['secondary_id'] = isset($data['secondary_id']) ? $data['secondary_id'] : null;
        $this->container['status_time_stamp'] = isset($data['status_time_stamp']) ? $data['status_time_stamp'] : null;
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

        if ($this->container['goal_id'] === null) {
            $invalidProperties[] = "'goal_id' can't be null";
        }
        if ($this->container['status_time_stamp'] === null) {
            $invalidProperties[] = "'status_time_stamp' can't be null";
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
     * Gets accounts
     *
     * @return \com\hydrogen\nucleus\Model\GoalTrackAccounts[]
     */
    public function getAccounts()
    {
        return $this->container['accounts'];
    }

    /**
     * Sets accounts
     *
     * @param \com\hydrogen\nucleus\Model\GoalTrackAccounts[] $accounts accounts
     *
     * @return $this
     */
    public function setAccounts($accounts)
    {
        $this->container['accounts'] = $accounts;

        return $this;
    }

    /**
     * Gets accumulation_horizon
     *
     * @return double
     */
    public function getAccumulationHorizon()
    {
        return $this->container['accumulation_horizon'];
    }

    /**
     * Sets accumulation_horizon
     *
     * @param double $accumulation_horizon accumulationHorizon
     *
     * @return $this
     */
    public function setAccumulationHorizon($accumulation_horizon)
    {
        $this->container['accumulation_horizon'] = $accumulation_horizon;

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
     * Gets current_investment
     *
     * @return double
     */
    public function getCurrentInvestment()
    {
        return $this->container['current_investment'];
    }

    /**
     * Sets current_investment
     *
     * @param double $current_investment currentInvestment
     *
     * @return $this
     */
    public function setCurrentInvestment($current_investment)
    {
        $this->container['current_investment'] = $current_investment;

        return $this;
    }

    /**
     * Gets decumulation_horizon
     *
     * @return double
     */
    public function getDecumulationHorizon()
    {
        return $this->container['decumulation_horizon'];
    }

    /**
     * Sets decumulation_horizon
     *
     * @param double $decumulation_horizon decumulationHorizon
     *
     * @return $this
     */
    public function setDecumulationHorizon($decumulation_horizon)
    {
        $this->container['decumulation_horizon'] = $decumulation_horizon;

        return $this;
    }

    /**
     * Gets goal_achievement_score
     *
     * @return double
     */
    public function getGoalAchievementScore()
    {
        return $this->container['goal_achievement_score'];
    }

    /**
     * Sets goal_achievement_score
     *
     * @param double $goal_achievement_score goalAchievementScore
     *
     * @return $this
     */
    public function setGoalAchievementScore($goal_achievement_score)
    {
        $this->container['goal_achievement_score'] = $goal_achievement_score;

        return $this;
    }

    /**
     * Gets goal_amount
     *
     * @return double
     */
    public function getGoalAmount()
    {
        return $this->container['goal_amount'];
    }

    /**
     * Sets goal_amount
     *
     * @param double $goal_amount goalAmount
     *
     * @return $this
     */
    public function setGoalAmount($goal_amount)
    {
        $this->container['goal_amount'] = $goal_amount;

        return $this;
    }

    /**
     * Gets goal_id
     *
     * @return string
     */
    public function getGoalId()
    {
        return $this->container['goal_id'];
    }

    /**
     * Sets goal_id
     *
     * @param string $goal_id goalId
     *
     * @return $this
     */
    public function setGoalId($goal_id)
    {
        $this->container['goal_id'] = $goal_id;

        return $this;
    }

    /**
     * Gets goal_probability
     *
     * @return double
     */
    public function getGoalProbability()
    {
        return $this->container['goal_probability'];
    }

    /**
     * Sets goal_probability
     *
     * @param double $goal_probability goalProbability
     *
     * @return $this
     */
    public function setGoalProbability($goal_probability)
    {
        $this->container['goal_probability'] = $goal_probability;

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
     * Gets on_track
     *
     * @return bool
     */
    public function getOnTrack()
    {
        return $this->container['on_track'];
    }

    /**
     * Sets on_track
     *
     * @param bool $on_track onTrack
     *
     * @return $this
     */
    public function setOnTrack($on_track)
    {
        $this->container['on_track'] = $on_track;

        return $this;
    }

    /**
     * Gets progress
     *
     * @return double
     */
    public function getProgress()
    {
        return $this->container['progress'];
    }

    /**
     * Sets progress
     *
     * @param double $progress progress
     *
     * @return $this
     */
    public function setProgress($progress)
    {
        $this->container['progress'] = $progress;

        return $this;
    }

    /**
     * Gets projection_balance
     *
     * @return double
     */
    public function getProjectionBalance()
    {
        return $this->container['projection_balance'];
    }

    /**
     * Sets projection_balance
     *
     * @param double $projection_balance projectionBalance
     *
     * @return $this
     */
    public function setProjectionBalance($projection_balance)
    {
        $this->container['projection_balance'] = $projection_balance;

        return $this;
    }

    /**
     * Gets projection_date
     *
     * @return \DateTime
     */
    public function getProjectionDate()
    {
        return $this->container['projection_date'];
    }

    /**
     * Sets projection_date
     *
     * @param \DateTime $projection_date projectionDate
     *
     * @return $this
     */
    public function setProjectionDate($projection_date)
    {
        $this->container['projection_date'] = $projection_date;

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
     * Gets status_time_stamp
     *
     * @return \DateTime
     */
    public function getStatusTimeStamp()
    {
        return $this->container['status_time_stamp'];
    }

    /**
     * Sets status_time_stamp
     *
     * @param \DateTime $status_time_stamp statusTimeStamp
     *
     * @return $this
     */
    public function setStatusTimeStamp($status_time_stamp)
    {
        $this->container['status_time_stamp'] = $status_time_stamp;

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


