<?php
/**
 * Goal
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
 * Goal Class Doc Comment
 *
 * @category Class
 * @package  com\hydrogen\nucleus
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class Goal implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'Goal';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'accumulation_horizon' => 'double',
        'category' => 'string',
        'client_id' => 'string',
        'create_date' => '\DateTime',
        'decumulation_horizon' => 'double',
        'goal_amount' => 'double',
        'id' => 'string',
        'image' => 'string',
        'is_active' => 'bool',
        'is_decumulation' => 'bool',
        'metadata' => 'map[string,string]',
        'name' => 'string',
        'parent_goal_id' => 'string',
        'questionnaire_id' => 'string',
        'secondary_id' => 'string',
        'type' => 'string',
        'update_date' => '\DateTime'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'accumulation_horizon' => 'double',
        'category' => null,
        'client_id' => 'uuid',
        'create_date' => 'date-time',
        'decumulation_horizon' => 'double',
        'goal_amount' => 'double',
        'id' => 'uuid',
        'image' => null,
        'is_active' => null,
        'is_decumulation' => null,
        'metadata' => null,
        'name' => null,
        'parent_goal_id' => 'uuid',
        'questionnaire_id' => 'uuid',
        'secondary_id' => null,
        'type' => null,
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
        'accumulation_horizon' => 'accumulation_horizon',
        'category' => 'category',
        'client_id' => 'client_id',
        'create_date' => 'create_date',
        'decumulation_horizon' => 'decumulation_horizon',
        'goal_amount' => 'goal_amount',
        'id' => 'id',
        'image' => 'image',
        'is_active' => 'is_active',
        'is_decumulation' => 'is_decumulation',
        'metadata' => 'metadata',
        'name' => 'name',
        'parent_goal_id' => 'parent_goal_id',
        'questionnaire_id' => 'questionnaire_id',
        'secondary_id' => 'secondary_id',
        'type' => 'type',
        'update_date' => 'update_date'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'accumulation_horizon' => 'setAccumulationHorizon',
        'category' => 'setCategory',
        'client_id' => 'setClientId',
        'create_date' => 'setCreateDate',
        'decumulation_horizon' => 'setDecumulationHorizon',
        'goal_amount' => 'setGoalAmount',
        'id' => 'setId',
        'image' => 'setImage',
        'is_active' => 'setIsActive',
        'is_decumulation' => 'setIsDecumulation',
        'metadata' => 'setMetadata',
        'name' => 'setName',
        'parent_goal_id' => 'setParentGoalId',
        'questionnaire_id' => 'setQuestionnaireId',
        'secondary_id' => 'setSecondaryId',
        'type' => 'setType',
        'update_date' => 'setUpdateDate'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'accumulation_horizon' => 'getAccumulationHorizon',
        'category' => 'getCategory',
        'client_id' => 'getClientId',
        'create_date' => 'getCreateDate',
        'decumulation_horizon' => 'getDecumulationHorizon',
        'goal_amount' => 'getGoalAmount',
        'id' => 'getId',
        'image' => 'getImage',
        'is_active' => 'getIsActive',
        'is_decumulation' => 'getIsDecumulation',
        'metadata' => 'getMetadata',
        'name' => 'getName',
        'parent_goal_id' => 'getParentGoalId',
        'questionnaire_id' => 'getQuestionnaireId',
        'secondary_id' => 'getSecondaryId',
        'type' => 'getType',
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
        $this->container['accumulation_horizon'] = isset($data['accumulation_horizon']) ? $data['accumulation_horizon'] : null;
        $this->container['category'] = isset($data['category']) ? $data['category'] : null;
        $this->container['client_id'] = isset($data['client_id']) ? $data['client_id'] : null;
        $this->container['create_date'] = isset($data['create_date']) ? $data['create_date'] : null;
        $this->container['decumulation_horizon'] = isset($data['decumulation_horizon']) ? $data['decumulation_horizon'] : null;
        $this->container['goal_amount'] = isset($data['goal_amount']) ? $data['goal_amount'] : null;
        $this->container['id'] = isset($data['id']) ? $data['id'] : null;
        $this->container['image'] = isset($data['image']) ? $data['image'] : null;
        $this->container['is_active'] = isset($data['is_active']) ? $data['is_active'] : null;
        $this->container['is_decumulation'] = isset($data['is_decumulation']) ? $data['is_decumulation'] : null;
        $this->container['metadata'] = isset($data['metadata']) ? $data['metadata'] : null;
        $this->container['name'] = isset($data['name']) ? $data['name'] : null;
        $this->container['parent_goal_id'] = isset($data['parent_goal_id']) ? $data['parent_goal_id'] : null;
        $this->container['questionnaire_id'] = isset($data['questionnaire_id']) ? $data['questionnaire_id'] : null;
        $this->container['secondary_id'] = isset($data['secondary_id']) ? $data['secondary_id'] : null;
        $this->container['type'] = isset($data['type']) ? $data['type'] : null;
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

        if ($this->container['name'] === null) {
            $invalidProperties[] = "'name' can't be null";
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
     * @param double $accumulation_horizon accumulation_horizon
     *
     * @return $this
     */
    public function setAccumulationHorizon($accumulation_horizon)
    {
        $this->container['accumulation_horizon'] = $accumulation_horizon;

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
     * @param string $client_id client_id
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
     * @param double $decumulation_horizon decumulation_horizon
     *
     * @return $this
     */
    public function setDecumulationHorizon($decumulation_horizon)
    {
        $this->container['decumulation_horizon'] = $decumulation_horizon;

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
     * @param double $goal_amount goal_amount
     *
     * @return $this
     */
    public function setGoalAmount($goal_amount)
    {
        $this->container['goal_amount'] = $goal_amount;

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
     * Gets image
     *
     * @return string
     */
    public function getImage()
    {
        return $this->container['image'];
    }

    /**
     * Sets image
     *
     * @param string $image image
     *
     * @return $this
     */
    public function setImage($image)
    {
        $this->container['image'] = $image;

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
     * Gets is_decumulation
     *
     * @return bool
     */
    public function getIsDecumulation()
    {
        return $this->container['is_decumulation'];
    }

    /**
     * Sets is_decumulation
     *
     * @param bool $is_decumulation isDecumulation
     *
     * @return $this
     */
    public function setIsDecumulation($is_decumulation)
    {
        $this->container['is_decumulation'] = $is_decumulation;

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
     * @param string $name Goal name
     *
     * @return $this
     */
    public function setName($name)
    {
        $this->container['name'] = $name;

        return $this;
    }

    /**
     * Gets parent_goal_id
     *
     * @return string
     */
    public function getParentGoalId()
    {
        return $this->container['parent_goal_id'];
    }

    /**
     * Sets parent_goal_id
     *
     * @param string $parent_goal_id Goal Parent Goal Id
     *
     * @return $this
     */
    public function setParentGoalId($parent_goal_id)
    {
        $this->container['parent_goal_id'] = $parent_goal_id;

        return $this;
    }

    /**
     * Gets questionnaire_id
     *
     * @return string
     */
    public function getQuestionnaireId()
    {
        return $this->container['questionnaire_id'];
    }

    /**
     * Sets questionnaire_id
     *
     * @param string $questionnaire_id questionnaire_id
     *
     * @return $this
     */
    public function setQuestionnaireId($questionnaire_id)
    {
        $this->container['questionnaire_id'] = $questionnaire_id;

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
     * Gets type
     *
     * @return string
     */
    public function getType()
    {
        return $this->container['type'];
    }

    /**
     * Sets type
     *
     * @param string $type type
     *
     * @return $this
     */
    public function setType($type)
    {
        $this->container['type'] = $type;

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


