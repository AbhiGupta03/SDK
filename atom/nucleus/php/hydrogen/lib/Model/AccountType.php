<?php
/**
 * AccountType
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
 * AccountType Class Doc Comment
 *
 * @category Class
 * @description AccountType Object
 * @package  com\hydrogen\nucleus
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class AccountType implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'AccountType';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'category' => 'string',
        'code' => 'string',
        'create_date' => '\DateTime',
        'id' => 'string',
        'is_active' => 'bool',
        'is_asset' => 'bool',
        'is_business' => 'bool',
        'is_cash' => 'bool',
        'is_investment' => 'bool',
        'is_taxable' => 'bool',
        'metadata' => 'map[string,string]',
        'name' => 'string',
        'secondary_id' => 'string',
        'short_name' => 'string',
        'subcategory' => 'string',
        'update_date' => '\DateTime'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'category' => null,
        'code' => null,
        'create_date' => 'date-time',
        'id' => 'uuid',
        'is_active' => null,
        'is_asset' => null,
        'is_business' => null,
        'is_cash' => null,
        'is_investment' => null,
        'is_taxable' => null,
        'metadata' => null,
        'name' => null,
        'secondary_id' => null,
        'short_name' => null,
        'subcategory' => null,
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
        'category' => 'category',
        'code' => 'code',
        'create_date' => 'create_date',
        'id' => 'id',
        'is_active' => 'is_active',
        'is_asset' => 'is_asset',
        'is_business' => 'is_business',
        'is_cash' => 'is_cash',
        'is_investment' => 'is_investment',
        'is_taxable' => 'is_taxable',
        'metadata' => 'metadata',
        'name' => 'name',
        'secondary_id' => 'secondary_id',
        'short_name' => 'short_name',
        'subcategory' => 'subcategory',
        'update_date' => 'update_date'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'category' => 'setCategory',
        'code' => 'setCode',
        'create_date' => 'setCreateDate',
        'id' => 'setId',
        'is_active' => 'setIsActive',
        'is_asset' => 'setIsAsset',
        'is_business' => 'setIsBusiness',
        'is_cash' => 'setIsCash',
        'is_investment' => 'setIsInvestment',
        'is_taxable' => 'setIsTaxable',
        'metadata' => 'setMetadata',
        'name' => 'setName',
        'secondary_id' => 'setSecondaryId',
        'short_name' => 'setShortName',
        'subcategory' => 'setSubcategory',
        'update_date' => 'setUpdateDate'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'category' => 'getCategory',
        'code' => 'getCode',
        'create_date' => 'getCreateDate',
        'id' => 'getId',
        'is_active' => 'getIsActive',
        'is_asset' => 'getIsAsset',
        'is_business' => 'getIsBusiness',
        'is_cash' => 'getIsCash',
        'is_investment' => 'getIsInvestment',
        'is_taxable' => 'getIsTaxable',
        'metadata' => 'getMetadata',
        'name' => 'getName',
        'secondary_id' => 'getSecondaryId',
        'short_name' => 'getShortName',
        'subcategory' => 'getSubcategory',
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
        $this->container['category'] = isset($data['category']) ? $data['category'] : null;
        $this->container['code'] = isset($data['code']) ? $data['code'] : null;
        $this->container['create_date'] = isset($data['create_date']) ? $data['create_date'] : null;
        $this->container['id'] = isset($data['id']) ? $data['id'] : null;
        $this->container['is_active'] = isset($data['is_active']) ? $data['is_active'] : null;
        $this->container['is_asset'] = isset($data['is_asset']) ? $data['is_asset'] : null;
        $this->container['is_business'] = isset($data['is_business']) ? $data['is_business'] : null;
        $this->container['is_cash'] = isset($data['is_cash']) ? $data['is_cash'] : null;
        $this->container['is_investment'] = isset($data['is_investment']) ? $data['is_investment'] : null;
        $this->container['is_taxable'] = isset($data['is_taxable']) ? $data['is_taxable'] : null;
        $this->container['metadata'] = isset($data['metadata']) ? $data['metadata'] : null;
        $this->container['name'] = isset($data['name']) ? $data['name'] : null;
        $this->container['secondary_id'] = isset($data['secondary_id']) ? $data['secondary_id'] : null;
        $this->container['short_name'] = isset($data['short_name']) ? $data['short_name'] : null;
        $this->container['subcategory'] = isset($data['subcategory']) ? $data['subcategory'] : null;
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
     * Gets is_asset
     *
     * @return bool
     */
    public function getIsAsset()
    {
        return $this->container['is_asset'];
    }

    /**
     * Sets is_asset
     *
     * @param bool $is_asset isAsset
     *
     * @return $this
     */
    public function setIsAsset($is_asset)
    {
        $this->container['is_asset'] = $is_asset;

        return $this;
    }

    /**
     * Gets is_business
     *
     * @return bool
     */
    public function getIsBusiness()
    {
        return $this->container['is_business'];
    }

    /**
     * Sets is_business
     *
     * @param bool $is_business isBusiness
     *
     * @return $this
     */
    public function setIsBusiness($is_business)
    {
        $this->container['is_business'] = $is_business;

        return $this;
    }

    /**
     * Gets is_cash
     *
     * @return bool
     */
    public function getIsCash()
    {
        return $this->container['is_cash'];
    }

    /**
     * Sets is_cash
     *
     * @param bool $is_cash isCash
     *
     * @return $this
     */
    public function setIsCash($is_cash)
    {
        $this->container['is_cash'] = $is_cash;

        return $this;
    }

    /**
     * Gets is_investment
     *
     * @return bool
     */
    public function getIsInvestment()
    {
        return $this->container['is_investment'];
    }

    /**
     * Sets is_investment
     *
     * @param bool $is_investment isInvestment
     *
     * @return $this
     */
    public function setIsInvestment($is_investment)
    {
        $this->container['is_investment'] = $is_investment;

        return $this;
    }

    /**
     * Gets is_taxable
     *
     * @return bool
     */
    public function getIsTaxable()
    {
        return $this->container['is_taxable'];
    }

    /**
     * Sets is_taxable
     *
     * @param bool $is_taxable isTaxable
     *
     * @return $this
     */
    public function setIsTaxable($is_taxable)
    {
        $this->container['is_taxable'] = $is_taxable;

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
     * Gets short_name
     *
     * @return string
     */
    public function getShortName()
    {
        return $this->container['short_name'];
    }

    /**
     * Sets short_name
     *
     * @param string $short_name shortName
     *
     * @return $this
     */
    public function setShortName($short_name)
    {
        $this->container['short_name'] = $short_name;

        return $this;
    }

    /**
     * Gets subcategory
     *
     * @return string
     */
    public function getSubcategory()
    {
        return $this->container['subcategory'];
    }

    /**
     * Sets subcategory
     *
     * @param string $subcategory subcategory
     *
     * @return $this
     */
    public function setSubcategory($subcategory)
    {
        $this->container['subcategory'] = $subcategory;

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


