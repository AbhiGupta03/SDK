<?php
/**
 * AuditLog
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
 * AuditLog Class Doc Comment
 *
 * @category Class
 * @description AuditLog Object
 * @package  com\hydrogen\nucleus
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class AuditLog implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'AuditLog';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'account_ids' => 'string[]',
        'aggregation_account_ids' => 'string[]',
        'allocation_ids' => 'string[]',
        'client_ids' => 'string[]',
        'create_date' => '\DateTime',
        'goal_ids' => 'string[]',
        'id' => 'string',
        'metadata' => 'map[string,string]',
        'model_ids' => 'string[]',
        'portfolio_ids' => 'string[]',
        'request' => 'string',
        'request_url' => 'string',
        'response' => 'string',
        'secondary_id' => 'string',
        'security_ids' => 'string[]',
        'update_date' => '\DateTime'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'account_ids' => 'uuid',
        'aggregation_account_ids' => 'uuid',
        'allocation_ids' => 'uuid',
        'client_ids' => 'uuid',
        'create_date' => 'date-time',
        'goal_ids' => 'uuid',
        'id' => 'uuid',
        'metadata' => null,
        'model_ids' => 'uuid',
        'portfolio_ids' => 'uuid',
        'request' => null,
        'request_url' => null,
        'response' => null,
        'secondary_id' => null,
        'security_ids' => 'uuid',
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
        'account_ids' => 'account_ids',
        'aggregation_account_ids' => 'aggregation_account_ids',
        'allocation_ids' => 'allocation_ids',
        'client_ids' => 'client_ids',
        'create_date' => 'create_date',
        'goal_ids' => 'goal_ids',
        'id' => 'id',
        'metadata' => 'metadata',
        'model_ids' => 'model_ids',
        'portfolio_ids' => 'portfolio_ids',
        'request' => 'request',
        'request_url' => 'request_url',
        'response' => 'response',
        'secondary_id' => 'secondary_id',
        'security_ids' => 'security_ids',
        'update_date' => 'update_date'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'account_ids' => 'setAccountIds',
        'aggregation_account_ids' => 'setAggregationAccountIds',
        'allocation_ids' => 'setAllocationIds',
        'client_ids' => 'setClientIds',
        'create_date' => 'setCreateDate',
        'goal_ids' => 'setGoalIds',
        'id' => 'setId',
        'metadata' => 'setMetadata',
        'model_ids' => 'setModelIds',
        'portfolio_ids' => 'setPortfolioIds',
        'request' => 'setRequest',
        'request_url' => 'setRequestUrl',
        'response' => 'setResponse',
        'secondary_id' => 'setSecondaryId',
        'security_ids' => 'setSecurityIds',
        'update_date' => 'setUpdateDate'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'account_ids' => 'getAccountIds',
        'aggregation_account_ids' => 'getAggregationAccountIds',
        'allocation_ids' => 'getAllocationIds',
        'client_ids' => 'getClientIds',
        'create_date' => 'getCreateDate',
        'goal_ids' => 'getGoalIds',
        'id' => 'getId',
        'metadata' => 'getMetadata',
        'model_ids' => 'getModelIds',
        'portfolio_ids' => 'getPortfolioIds',
        'request' => 'getRequest',
        'request_url' => 'getRequestUrl',
        'response' => 'getResponse',
        'secondary_id' => 'getSecondaryId',
        'security_ids' => 'getSecurityIds',
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
        $this->container['account_ids'] = isset($data['account_ids']) ? $data['account_ids'] : null;
        $this->container['aggregation_account_ids'] = isset($data['aggregation_account_ids']) ? $data['aggregation_account_ids'] : null;
        $this->container['allocation_ids'] = isset($data['allocation_ids']) ? $data['allocation_ids'] : null;
        $this->container['client_ids'] = isset($data['client_ids']) ? $data['client_ids'] : null;
        $this->container['create_date'] = isset($data['create_date']) ? $data['create_date'] : null;
        $this->container['goal_ids'] = isset($data['goal_ids']) ? $data['goal_ids'] : null;
        $this->container['id'] = isset($data['id']) ? $data['id'] : null;
        $this->container['metadata'] = isset($data['metadata']) ? $data['metadata'] : null;
        $this->container['model_ids'] = isset($data['model_ids']) ? $data['model_ids'] : null;
        $this->container['portfolio_ids'] = isset($data['portfolio_ids']) ? $data['portfolio_ids'] : null;
        $this->container['request'] = isset($data['request']) ? $data['request'] : null;
        $this->container['request_url'] = isset($data['request_url']) ? $data['request_url'] : null;
        $this->container['response'] = isset($data['response']) ? $data['response'] : null;
        $this->container['secondary_id'] = isset($data['secondary_id']) ? $data['secondary_id'] : null;
        $this->container['security_ids'] = isset($data['security_ids']) ? $data['security_ids'] : null;
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

        if ($this->container['request_url'] === null) {
            $invalidProperties[] = "'request_url' can't be null";
        }
        if ($this->container['response'] === null) {
            $invalidProperties[] = "'response' can't be null";
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
     * @param string[] $account_ids accountIds
     *
     * @return $this
     */
    public function setAccountIds($account_ids)
    {
        $this->container['account_ids'] = $account_ids;

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
     * @param string[] $aggregation_account_ids aggregationAccountIds
     *
     * @return $this
     */
    public function setAggregationAccountIds($aggregation_account_ids)
    {
        $this->container['aggregation_account_ids'] = $aggregation_account_ids;

        return $this;
    }

    /**
     * Gets allocation_ids
     *
     * @return string[]
     */
    public function getAllocationIds()
    {
        return $this->container['allocation_ids'];
    }

    /**
     * Sets allocation_ids
     *
     * @param string[] $allocation_ids allocationIds
     *
     * @return $this
     */
    public function setAllocationIds($allocation_ids)
    {
        $this->container['allocation_ids'] = $allocation_ids;

        return $this;
    }

    /**
     * Gets client_ids
     *
     * @return string[]
     */
    public function getClientIds()
    {
        return $this->container['client_ids'];
    }

    /**
     * Sets client_ids
     *
     * @param string[] $client_ids clientIds
     *
     * @return $this
     */
    public function setClientIds($client_ids)
    {
        $this->container['client_ids'] = $client_ids;

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
     * Gets goal_ids
     *
     * @return string[]
     */
    public function getGoalIds()
    {
        return $this->container['goal_ids'];
    }

    /**
     * Sets goal_ids
     *
     * @param string[] $goal_ids goalIds
     *
     * @return $this
     */
    public function setGoalIds($goal_ids)
    {
        $this->container['goal_ids'] = $goal_ids;

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
     * Gets model_ids
     *
     * @return string[]
     */
    public function getModelIds()
    {
        return $this->container['model_ids'];
    }

    /**
     * Sets model_ids
     *
     * @param string[] $model_ids modelIds
     *
     * @return $this
     */
    public function setModelIds($model_ids)
    {
        $this->container['model_ids'] = $model_ids;

        return $this;
    }

    /**
     * Gets portfolio_ids
     *
     * @return string[]
     */
    public function getPortfolioIds()
    {
        return $this->container['portfolio_ids'];
    }

    /**
     * Sets portfolio_ids
     *
     * @param string[] $portfolio_ids portfolioIds
     *
     * @return $this
     */
    public function setPortfolioIds($portfolio_ids)
    {
        $this->container['portfolio_ids'] = $portfolio_ids;

        return $this;
    }

    /**
     * Gets request
     *
     * @return string
     */
    public function getRequest()
    {
        return $this->container['request'];
    }

    /**
     * Sets request
     *
     * @param string $request request
     *
     * @return $this
     */
    public function setRequest($request)
    {
        $this->container['request'] = $request;

        return $this;
    }

    /**
     * Gets request_url
     *
     * @return string
     */
    public function getRequestUrl()
    {
        return $this->container['request_url'];
    }

    /**
     * Sets request_url
     *
     * @param string $request_url requestUrl
     *
     * @return $this
     */
    public function setRequestUrl($request_url)
    {
        $this->container['request_url'] = $request_url;

        return $this;
    }

    /**
     * Gets response
     *
     * @return string
     */
    public function getResponse()
    {
        return $this->container['response'];
    }

    /**
     * Sets response
     *
     * @param string $response response
     *
     * @return $this
     */
    public function setResponse($response)
    {
        $this->container['response'] = $response;

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
     * Gets security_ids
     *
     * @return string[]
     */
    public function getSecurityIds()
    {
        return $this->container['security_ids'];
    }

    /**
     * Sets security_ids
     *
     * @param string[] $security_ids securityIds
     *
     * @return $this
     */
    public function setSecurityIds($security_ids)
    {
        $this->container['security_ids'] = $security_ids;

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


