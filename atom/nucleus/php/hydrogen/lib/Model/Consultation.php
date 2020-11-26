<?php
/**
 * Consultation
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
 * Consultation Class Doc Comment
 *
 * @category Class
 * @description Consultation Object
 * @package  com\hydrogen\nucleus
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class Consultation implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'Consultation';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'account_type_id' => 'string',
        'additional_questions' => 'string',
        'assets' => 'string',
        'assigned' => 'string',
        'calendar' => 'bool',
        'category' => 'string',
        'client_id' => 'string',
        'close_time' => '\DateTime',
        'closed_by' => 'string',
        'comments' => 'string',
        'completed' => 'bool',
        'create_date' => '\DateTime',
        'email' => 'string',
        'firmname' => 'string',
        'id' => 'string',
        'investment_allocation' => 'string',
        'investment_location' => 'string',
        'investment_objectives' => 'string',
        'is_active' => 'bool',
        'metadata' => 'map[string,string]',
        'name' => 'string',
        'phone' => 'string',
        'reminded' => 'bool',
        'secondary_id' => 'string',
        'source' => 'string',
        'time' => '\DateTime',
        'update_date' => '\DateTime'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'account_type_id' => 'uuid',
        'additional_questions' => null,
        'assets' => null,
        'assigned' => null,
        'calendar' => null,
        'category' => null,
        'client_id' => 'uuid',
        'close_time' => 'date',
        'closed_by' => null,
        'comments' => null,
        'completed' => null,
        'create_date' => 'date-time',
        'email' => null,
        'firmname' => null,
        'id' => 'uuid',
        'investment_allocation' => null,
        'investment_location' => null,
        'investment_objectives' => null,
        'is_active' => null,
        'metadata' => null,
        'name' => null,
        'phone' => null,
        'reminded' => null,
        'secondary_id' => null,
        'source' => null,
        'time' => 'date',
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
        'account_type_id' => 'account_type_id',
        'additional_questions' => 'additional_questions',
        'assets' => 'assets',
        'assigned' => 'assigned',
        'calendar' => 'calendar',
        'category' => 'category',
        'client_id' => 'client_id',
        'close_time' => 'close_time',
        'closed_by' => 'closed_by',
        'comments' => 'comments',
        'completed' => 'completed',
        'create_date' => 'create_date',
        'email' => 'email',
        'firmname' => 'firmname',
        'id' => 'id',
        'investment_allocation' => 'investment_allocation',
        'investment_location' => 'investment_location',
        'investment_objectives' => 'investment_objectives',
        'is_active' => 'is_active',
        'metadata' => 'metadata',
        'name' => 'name',
        'phone' => 'phone',
        'reminded' => 'reminded',
        'secondary_id' => 'secondary_id',
        'source' => 'source',
        'time' => 'time',
        'update_date' => 'update_date'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'account_type_id' => 'setAccountTypeId',
        'additional_questions' => 'setAdditionalQuestions',
        'assets' => 'setAssets',
        'assigned' => 'setAssigned',
        'calendar' => 'setCalendar',
        'category' => 'setCategory',
        'client_id' => 'setClientId',
        'close_time' => 'setCloseTime',
        'closed_by' => 'setClosedBy',
        'comments' => 'setComments',
        'completed' => 'setCompleted',
        'create_date' => 'setCreateDate',
        'email' => 'setEmail',
        'firmname' => 'setFirmname',
        'id' => 'setId',
        'investment_allocation' => 'setInvestmentAllocation',
        'investment_location' => 'setInvestmentLocation',
        'investment_objectives' => 'setInvestmentObjectives',
        'is_active' => 'setIsActive',
        'metadata' => 'setMetadata',
        'name' => 'setName',
        'phone' => 'setPhone',
        'reminded' => 'setReminded',
        'secondary_id' => 'setSecondaryId',
        'source' => 'setSource',
        'time' => 'setTime',
        'update_date' => 'setUpdateDate'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'account_type_id' => 'getAccountTypeId',
        'additional_questions' => 'getAdditionalQuestions',
        'assets' => 'getAssets',
        'assigned' => 'getAssigned',
        'calendar' => 'getCalendar',
        'category' => 'getCategory',
        'client_id' => 'getClientId',
        'close_time' => 'getCloseTime',
        'closed_by' => 'getClosedBy',
        'comments' => 'getComments',
        'completed' => 'getCompleted',
        'create_date' => 'getCreateDate',
        'email' => 'getEmail',
        'firmname' => 'getFirmname',
        'id' => 'getId',
        'investment_allocation' => 'getInvestmentAllocation',
        'investment_location' => 'getInvestmentLocation',
        'investment_objectives' => 'getInvestmentObjectives',
        'is_active' => 'getIsActive',
        'metadata' => 'getMetadata',
        'name' => 'getName',
        'phone' => 'getPhone',
        'reminded' => 'getReminded',
        'secondary_id' => 'getSecondaryId',
        'source' => 'getSource',
        'time' => 'getTime',
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
        $this->container['account_type_id'] = isset($data['account_type_id']) ? $data['account_type_id'] : null;
        $this->container['additional_questions'] = isset($data['additional_questions']) ? $data['additional_questions'] : null;
        $this->container['assets'] = isset($data['assets']) ? $data['assets'] : null;
        $this->container['assigned'] = isset($data['assigned']) ? $data['assigned'] : null;
        $this->container['calendar'] = isset($data['calendar']) ? $data['calendar'] : null;
        $this->container['category'] = isset($data['category']) ? $data['category'] : null;
        $this->container['client_id'] = isset($data['client_id']) ? $data['client_id'] : null;
        $this->container['close_time'] = isset($data['close_time']) ? $data['close_time'] : null;
        $this->container['closed_by'] = isset($data['closed_by']) ? $data['closed_by'] : null;
        $this->container['comments'] = isset($data['comments']) ? $data['comments'] : null;
        $this->container['completed'] = isset($data['completed']) ? $data['completed'] : null;
        $this->container['create_date'] = isset($data['create_date']) ? $data['create_date'] : null;
        $this->container['email'] = isset($data['email']) ? $data['email'] : null;
        $this->container['firmname'] = isset($data['firmname']) ? $data['firmname'] : null;
        $this->container['id'] = isset($data['id']) ? $data['id'] : null;
        $this->container['investment_allocation'] = isset($data['investment_allocation']) ? $data['investment_allocation'] : null;
        $this->container['investment_location'] = isset($data['investment_location']) ? $data['investment_location'] : null;
        $this->container['investment_objectives'] = isset($data['investment_objectives']) ? $data['investment_objectives'] : null;
        $this->container['is_active'] = isset($data['is_active']) ? $data['is_active'] : null;
        $this->container['metadata'] = isset($data['metadata']) ? $data['metadata'] : null;
        $this->container['name'] = isset($data['name']) ? $data['name'] : null;
        $this->container['phone'] = isset($data['phone']) ? $data['phone'] : null;
        $this->container['reminded'] = isset($data['reminded']) ? $data['reminded'] : null;
        $this->container['secondary_id'] = isset($data['secondary_id']) ? $data['secondary_id'] : null;
        $this->container['source'] = isset($data['source']) ? $data['source'] : null;
        $this->container['time'] = isset($data['time']) ? $data['time'] : null;
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
     * Gets account_type_id
     *
     * @return string
     */
    public function getAccountTypeId()
    {
        return $this->container['account_type_id'];
    }

    /**
     * Sets account_type_id
     *
     * @param string $account_type_id accountTypeId
     *
     * @return $this
     */
    public function setAccountTypeId($account_type_id)
    {
        $this->container['account_type_id'] = $account_type_id;

        return $this;
    }

    /**
     * Gets additional_questions
     *
     * @return string
     */
    public function getAdditionalQuestions()
    {
        return $this->container['additional_questions'];
    }

    /**
     * Sets additional_questions
     *
     * @param string $additional_questions additionalQuestions
     *
     * @return $this
     */
    public function setAdditionalQuestions($additional_questions)
    {
        $this->container['additional_questions'] = $additional_questions;

        return $this;
    }

    /**
     * Gets assets
     *
     * @return string
     */
    public function getAssets()
    {
        return $this->container['assets'];
    }

    /**
     * Sets assets
     *
     * @param string $assets assets
     *
     * @return $this
     */
    public function setAssets($assets)
    {
        $this->container['assets'] = $assets;

        return $this;
    }

    /**
     * Gets assigned
     *
     * @return string
     */
    public function getAssigned()
    {
        return $this->container['assigned'];
    }

    /**
     * Sets assigned
     *
     * @param string $assigned assigned
     *
     * @return $this
     */
    public function setAssigned($assigned)
    {
        $this->container['assigned'] = $assigned;

        return $this;
    }

    /**
     * Gets calendar
     *
     * @return bool
     */
    public function getCalendar()
    {
        return $this->container['calendar'];
    }

    /**
     * Sets calendar
     *
     * @param bool $calendar calendar
     *
     * @return $this
     */
    public function setCalendar($calendar)
    {
        $this->container['calendar'] = $calendar;

        return $this;
    }

    /**
     * Gets category
     *
     * @return string
     */
    public function getCategory()
    {
        return $this->container['category'];
    }

    /**
     * Sets category
     *
     * @param string $category category
     *
     * @return $this
     */
    public function setCategory($category)
    {
        $this->container['category'] = $category;

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
     * Gets close_time
     *
     * @return \DateTime
     */
    public function getCloseTime()
    {
        return $this->container['close_time'];
    }

    /**
     * Sets close_time
     *
     * @param \DateTime $close_time closeTime
     *
     * @return $this
     */
    public function setCloseTime($close_time)
    {
        $this->container['close_time'] = $close_time;

        return $this;
    }

    /**
     * Gets closed_by
     *
     * @return string
     */
    public function getClosedBy()
    {
        return $this->container['closed_by'];
    }

    /**
     * Sets closed_by
     *
     * @param string $closed_by closedBy
     *
     * @return $this
     */
    public function setClosedBy($closed_by)
    {
        $this->container['closed_by'] = $closed_by;

        return $this;
    }

    /**
     * Gets comments
     *
     * @return string
     */
    public function getComments()
    {
        return $this->container['comments'];
    }

    /**
     * Sets comments
     *
     * @param string $comments comments
     *
     * @return $this
     */
    public function setComments($comments)
    {
        $this->container['comments'] = $comments;

        return $this;
    }

    /**
     * Gets completed
     *
     * @return bool
     */
    public function getCompleted()
    {
        return $this->container['completed'];
    }

    /**
     * Sets completed
     *
     * @param bool $completed completed
     *
     * @return $this
     */
    public function setCompleted($completed)
    {
        $this->container['completed'] = $completed;

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
     * Gets email
     *
     * @return string
     */
    public function getEmail()
    {
        return $this->container['email'];
    }

    /**
     * Sets email
     *
     * @param string $email email
     *
     * @return $this
     */
    public function setEmail($email)
    {
        $this->container['email'] = $email;

        return $this;
    }

    /**
     * Gets firmname
     *
     * @return string
     */
    public function getFirmname()
    {
        return $this->container['firmname'];
    }

    /**
     * Sets firmname
     *
     * @param string $firmname firmname
     *
     * @return $this
     */
    public function setFirmname($firmname)
    {
        $this->container['firmname'] = $firmname;

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
     * Gets investment_allocation
     *
     * @return string
     */
    public function getInvestmentAllocation()
    {
        return $this->container['investment_allocation'];
    }

    /**
     * Sets investment_allocation
     *
     * @param string $investment_allocation investmentAllocation
     *
     * @return $this
     */
    public function setInvestmentAllocation($investment_allocation)
    {
        $this->container['investment_allocation'] = $investment_allocation;

        return $this;
    }

    /**
     * Gets investment_location
     *
     * @return string
     */
    public function getInvestmentLocation()
    {
        return $this->container['investment_location'];
    }

    /**
     * Sets investment_location
     *
     * @param string $investment_location investmentLocation
     *
     * @return $this
     */
    public function setInvestmentLocation($investment_location)
    {
        $this->container['investment_location'] = $investment_location;

        return $this;
    }

    /**
     * Gets investment_objectives
     *
     * @return string
     */
    public function getInvestmentObjectives()
    {
        return $this->container['investment_objectives'];
    }

    /**
     * Sets investment_objectives
     *
     * @param string $investment_objectives investmentObjectives
     *
     * @return $this
     */
    public function setInvestmentObjectives($investment_objectives)
    {
        $this->container['investment_objectives'] = $investment_objectives;

        return $this;
    }

    /**
     * Gets is_active
     *
     * @return bool
     */
    public function getIsActive()
    {
        return $this->container['is_active'];
    }

    /**
     * Sets is_active
     *
     * @param bool $is_active isActive
     *
     * @return $this
     */
    public function setIsActive($is_active)
    {
        $this->container['is_active'] = $is_active;

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
     * Gets name
     *
     * @return string
     */
    public function getName()
    {
        return $this->container['name'];
    }

    /**
     * Sets name
     *
     * @param string $name name
     *
     * @return $this
     */
    public function setName($name)
    {
        $this->container['name'] = $name;

        return $this;
    }

    /**
     * Gets phone
     *
     * @return string
     */
    public function getPhone()
    {
        return $this->container['phone'];
    }

    /**
     * Sets phone
     *
     * @param string $phone phone
     *
     * @return $this
     */
    public function setPhone($phone)
    {
        $this->container['phone'] = $phone;

        return $this;
    }

    /**
     * Gets reminded
     *
     * @return bool
     */
    public function getReminded()
    {
        return $this->container['reminded'];
    }

    /**
     * Sets reminded
     *
     * @param bool $reminded reminded
     *
     * @return $this
     */
    public function setReminded($reminded)
    {
        $this->container['reminded'] = $reminded;

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
     * Gets source
     *
     * @return string
     */
    public function getSource()
    {
        return $this->container['source'];
    }

    /**
     * Sets source
     *
     * @param string $source source
     *
     * @return $this
     */
    public function setSource($source)
    {
        $this->container['source'] = $source;

        return $this;
    }

    /**
     * Gets time
     *
     * @return \DateTime
     */
    public function getTime()
    {
        return $this->container['time'];
    }

    /**
     * Sets time
     *
     * @param \DateTime $time time
     *
     * @return $this
     */
    public function setTime($time)
    {
        $this->container['time'] = $time;

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


