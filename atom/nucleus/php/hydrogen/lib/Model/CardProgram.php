<?php
/**
 * CardProgram
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
 * Swagger Codegen version: 2.4.16
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
 * CardProgram Class Doc Comment
 *
 * @category Class
 * @description CardProgram Object
 * @package  com\hydrogen\nucleus
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class CardProgram implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'CardProgram';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'card_issuer' => 'string',
        'card_network' => 'string',
        'card_processor' => 'string',
        'card_type' => 'string',
        'client_id' => 'string',
        'code' => 'string',
        'create_date' => '\DateTime',
        'description' => 'string',
        'id' => 'string',
        'is_delegated_authority' => 'bool',
        'issuing_bank' => 'string',
        'metadata' => 'map[string,string]',
        'name' => 'string',
        'secondary_id' => 'string',
        'update_date' => '\DateTime'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'card_issuer' => null,
        'card_network' => null,
        'card_processor' => null,
        'card_type' => null,
        'client_id' => 'uuid',
        'code' => null,
        'create_date' => 'date-time',
        'description' => null,
        'id' => 'uuid',
        'is_delegated_authority' => null,
        'issuing_bank' => null,
        'metadata' => null,
        'name' => null,
        'secondary_id' => null,
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
        'card_issuer' => 'card_issuer',
        'card_network' => 'card_network',
        'card_processor' => 'card_processor',
        'card_type' => 'card_type',
        'client_id' => 'client_id',
        'code' => 'code',
        'create_date' => 'create_date',
        'description' => 'description',
        'id' => 'id',
        'is_delegated_authority' => 'is_delegated_authority',
        'issuing_bank' => 'issuing_bank',
        'metadata' => 'metadata',
        'name' => 'name',
        'secondary_id' => 'secondary_id',
        'update_date' => 'update_date'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'card_issuer' => 'setCardIssuer',
        'card_network' => 'setCardNetwork',
        'card_processor' => 'setCardProcessor',
        'card_type' => 'setCardType',
        'client_id' => 'setClientId',
        'code' => 'setCode',
        'create_date' => 'setCreateDate',
        'description' => 'setDescription',
        'id' => 'setId',
        'is_delegated_authority' => 'setIsDelegatedAuthority',
        'issuing_bank' => 'setIssuingBank',
        'metadata' => 'setMetadata',
        'name' => 'setName',
        'secondary_id' => 'setSecondaryId',
        'update_date' => 'setUpdateDate'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'card_issuer' => 'getCardIssuer',
        'card_network' => 'getCardNetwork',
        'card_processor' => 'getCardProcessor',
        'card_type' => 'getCardType',
        'client_id' => 'getClientId',
        'code' => 'getCode',
        'create_date' => 'getCreateDate',
        'description' => 'getDescription',
        'id' => 'getId',
        'is_delegated_authority' => 'getIsDelegatedAuthority',
        'issuing_bank' => 'getIssuingBank',
        'metadata' => 'getMetadata',
        'name' => 'getName',
        'secondary_id' => 'getSecondaryId',
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
        $this->container['card_issuer'] = isset($data['card_issuer']) ? $data['card_issuer'] : null;
        $this->container['card_network'] = isset($data['card_network']) ? $data['card_network'] : null;
        $this->container['card_processor'] = isset($data['card_processor']) ? $data['card_processor'] : null;
        $this->container['card_type'] = isset($data['card_type']) ? $data['card_type'] : null;
        $this->container['client_id'] = isset($data['client_id']) ? $data['client_id'] : null;
        $this->container['code'] = isset($data['code']) ? $data['code'] : null;
        $this->container['create_date'] = isset($data['create_date']) ? $data['create_date'] : null;
        $this->container['description'] = isset($data['description']) ? $data['description'] : null;
        $this->container['id'] = isset($data['id']) ? $data['id'] : null;
        $this->container['is_delegated_authority'] = isset($data['is_delegated_authority']) ? $data['is_delegated_authority'] : null;
        $this->container['issuing_bank'] = isset($data['issuing_bank']) ? $data['issuing_bank'] : null;
        $this->container['metadata'] = isset($data['metadata']) ? $data['metadata'] : null;
        $this->container['name'] = isset($data['name']) ? $data['name'] : null;
        $this->container['secondary_id'] = isset($data['secondary_id']) ? $data['secondary_id'] : null;
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

        if ($this->container['card_issuer'] === null) {
            $invalidProperties[] = "'card_issuer' can't be null";
        }
        if ($this->container['card_network'] === null) {
            $invalidProperties[] = "'card_network' can't be null";
        }
        if ($this->container['card_processor'] === null) {
            $invalidProperties[] = "'card_processor' can't be null";
        }
        if ($this->container['card_type'] === null) {
            $invalidProperties[] = "'card_type' can't be null";
        }
        if ($this->container['issuing_bank'] === null) {
            $invalidProperties[] = "'issuing_bank' can't be null";
        }
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
     * Gets card_issuer
     *
     * @return string
     */
    public function getCardIssuer()
    {
        return $this->container['card_issuer'];
    }

    /**
     * Sets card_issuer
     *
     * @param string $card_issuer cardIssuer
     *
     * @return $this
     */
    public function setCardIssuer($card_issuer)
    {
        $this->container['card_issuer'] = $card_issuer;

        return $this;
    }

    /**
     * Gets card_network
     *
     * @return string
     */
    public function getCardNetwork()
    {
        return $this->container['card_network'];
    }

    /**
     * Sets card_network
     *
     * @param string $card_network cardNetwork
     *
     * @return $this
     */
    public function setCardNetwork($card_network)
    {
        $this->container['card_network'] = $card_network;

        return $this;
    }

    /**
     * Gets card_processor
     *
     * @return string
     */
    public function getCardProcessor()
    {
        return $this->container['card_processor'];
    }

    /**
     * Sets card_processor
     *
     * @param string $card_processor cardProcessor
     *
     * @return $this
     */
    public function setCardProcessor($card_processor)
    {
        $this->container['card_processor'] = $card_processor;

        return $this;
    }

    /**
     * Gets card_type
     *
     * @return string
     */
    public function getCardType()
    {
        return $this->container['card_type'];
    }

    /**
     * Sets card_type
     *
     * @param string $card_type cardType
     *
     * @return $this
     */
    public function setCardType($card_type)
    {
        $this->container['card_type'] = $card_type;

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
     * Gets code
     *
     * @return string
     */
    public function getCode()
    {
        return $this->container['code'];
    }

    /**
     * Sets code
     *
     * @param string $code code
     *
     * @return $this
     */
    public function setCode($code)
    {
        $this->container['code'] = $code;

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
     * Gets description
     *
     * @return string
     */
    public function getDescription()
    {
        return $this->container['description'];
    }

    /**
     * Sets description
     *
     * @param string $description description
     *
     * @return $this
     */
    public function setDescription($description)
    {
        $this->container['description'] = $description;

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
     * Gets is_delegated_authority
     *
     * @return bool
     */
    public function getIsDelegatedAuthority()
    {
        return $this->container['is_delegated_authority'];
    }

    /**
     * Sets is_delegated_authority
     *
     * @param bool $is_delegated_authority is_delegated_authority
     *
     * @return $this
     */
    public function setIsDelegatedAuthority($is_delegated_authority)
    {
        $this->container['is_delegated_authority'] = $is_delegated_authority;

        return $this;
    }

    /**
     * Gets issuing_bank
     *
     * @return string
     */
    public function getIssuingBank()
    {
        return $this->container['issuing_bank'];
    }

    /**
     * Sets issuing_bank
     *
     * @param string $issuing_bank issuingBank
     *
     * @return $this
     */
    public function setIssuingBank($issuing_bank)
    {
        $this->container['issuing_bank'] = $issuing_bank;

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


