<?php
/**
 * Order
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
 * Order Class Doc Comment
 *
 * @category Class
 * @description Order Object
 * @package  com\hydrogen\nucleus
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class Order implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'Order';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'account_id' => 'string',
        'create_date' => '\DateTime',
        'date' => '\DateTime',
        'id' => 'string',
        'is_read' => 'bool',
        'metadata' => 'map[string,string]',
        'model_id' => 'string',
        'order_bulk_id' => 'string',
        'order_ticket_id' => 'string',
        'order_type' => 'string',
        'portfolio_id' => 'string',
        'price' => 'double',
        'quantity' => 'double',
        'secondary_id' => 'string',
        'security_id' => 'string',
        'tmp_tracker_id' => 'string',
        'transaction_code_id' => 'string',
        'update_date' => '\DateTime'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'account_id' => 'uuid',
        'create_date' => 'date-time',
        'date' => 'date',
        'id' => 'uuid',
        'is_read' => null,
        'metadata' => null,
        'model_id' => 'uuid',
        'order_bulk_id' => 'uuid',
        'order_ticket_id' => 'uuid',
        'order_type' => null,
        'portfolio_id' => 'uuid',
        'price' => 'double',
        'quantity' => 'double',
        'secondary_id' => null,
        'security_id' => 'uuid',
        'tmp_tracker_id' => 'uuid',
        'transaction_code_id' => 'uuid',
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
        'create_date' => 'create_date',
        'date' => 'date',
        'id' => 'id',
        'is_read' => 'is_read',
        'metadata' => 'metadata',
        'model_id' => 'model_id',
        'order_bulk_id' => 'order_bulk_id',
        'order_ticket_id' => 'order_ticket_id',
        'order_type' => 'order_type',
        'portfolio_id' => 'portfolio_id',
        'price' => 'price',
        'quantity' => 'quantity',
        'secondary_id' => 'secondary_id',
        'security_id' => 'security_id',
        'tmp_tracker_id' => 'tmp_tracker_id',
        'transaction_code_id' => 'transaction_code_id',
        'update_date' => 'update_date'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'account_id' => 'setAccountId',
        'create_date' => 'setCreateDate',
        'date' => 'setDate',
        'id' => 'setId',
        'is_read' => 'setIsRead',
        'metadata' => 'setMetadata',
        'model_id' => 'setModelId',
        'order_bulk_id' => 'setOrderBulkId',
        'order_ticket_id' => 'setOrderTicketId',
        'order_type' => 'setOrderType',
        'portfolio_id' => 'setPortfolioId',
        'price' => 'setPrice',
        'quantity' => 'setQuantity',
        'secondary_id' => 'setSecondaryId',
        'security_id' => 'setSecurityId',
        'tmp_tracker_id' => 'setTmpTrackerId',
        'transaction_code_id' => 'setTransactionCodeId',
        'update_date' => 'setUpdateDate'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'account_id' => 'getAccountId',
        'create_date' => 'getCreateDate',
        'date' => 'getDate',
        'id' => 'getId',
        'is_read' => 'getIsRead',
        'metadata' => 'getMetadata',
        'model_id' => 'getModelId',
        'order_bulk_id' => 'getOrderBulkId',
        'order_ticket_id' => 'getOrderTicketId',
        'order_type' => 'getOrderType',
        'portfolio_id' => 'getPortfolioId',
        'price' => 'getPrice',
        'quantity' => 'getQuantity',
        'secondary_id' => 'getSecondaryId',
        'security_id' => 'getSecurityId',
        'tmp_tracker_id' => 'getTmpTrackerId',
        'transaction_code_id' => 'getTransactionCodeId',
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
        $this->container['create_date'] = isset($data['create_date']) ? $data['create_date'] : null;
        $this->container['date'] = isset($data['date']) ? $data['date'] : null;
        $this->container['id'] = isset($data['id']) ? $data['id'] : null;
        $this->container['is_read'] = isset($data['is_read']) ? $data['is_read'] : null;
        $this->container['metadata'] = isset($data['metadata']) ? $data['metadata'] : null;
        $this->container['model_id'] = isset($data['model_id']) ? $data['model_id'] : null;
        $this->container['order_bulk_id'] = isset($data['order_bulk_id']) ? $data['order_bulk_id'] : null;
        $this->container['order_ticket_id'] = isset($data['order_ticket_id']) ? $data['order_ticket_id'] : null;
        $this->container['order_type'] = isset($data['order_type']) ? $data['order_type'] : null;
        $this->container['portfolio_id'] = isset($data['portfolio_id']) ? $data['portfolio_id'] : null;
        $this->container['price'] = isset($data['price']) ? $data['price'] : null;
        $this->container['quantity'] = isset($data['quantity']) ? $data['quantity'] : null;
        $this->container['secondary_id'] = isset($data['secondary_id']) ? $data['secondary_id'] : null;
        $this->container['security_id'] = isset($data['security_id']) ? $data['security_id'] : null;
        $this->container['tmp_tracker_id'] = isset($data['tmp_tracker_id']) ? $data['tmp_tracker_id'] : null;
        $this->container['transaction_code_id'] = isset($data['transaction_code_id']) ? $data['transaction_code_id'] : null;
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

        if ($this->container['date'] === null) {
            $invalidProperties[] = "'date' can't be null";
        }
        if ($this->container['order_ticket_id'] === null) {
            $invalidProperties[] = "'order_ticket_id' can't be null";
        }
        if ($this->container['quantity'] === null) {
            $invalidProperties[] = "'quantity' can't be null";
        }
        if ($this->container['security_id'] === null) {
            $invalidProperties[] = "'security_id' can't be null";
        }
        if ($this->container['transaction_code_id'] === null) {
            $invalidProperties[] = "'transaction_code_id' can't be null";
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
     * Gets date
     *
     * @return \DateTime
     */
    public function getDate()
    {
        return $this->container['date'];
    }

    /**
     * Sets date
     *
     * @param \DateTime $date date
     *
     * @return $this
     */
    public function setDate($date)
    {
        $this->container['date'] = $date;

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
     * Gets is_read
     *
     * @return bool
     */
    public function getIsRead()
    {
        return $this->container['is_read'];
    }

    /**
     * Sets is_read
     *
     * @param bool $is_read isRead
     *
     * @return $this
     */
    public function setIsRead($is_read)
    {
        $this->container['is_read'] = $is_read;

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
     * Gets model_id
     *
     * @return string
     */
    public function getModelId()
    {
        return $this->container['model_id'];
    }

    /**
     * Sets model_id
     *
     * @param string $model_id modelId
     *
     * @return $this
     */
    public function setModelId($model_id)
    {
        $this->container['model_id'] = $model_id;

        return $this;
    }

    /**
     * Gets order_bulk_id
     *
     * @return string
     */
    public function getOrderBulkId()
    {
        return $this->container['order_bulk_id'];
    }

    /**
     * Sets order_bulk_id
     *
     * @param string $order_bulk_id orderBulkId
     *
     * @return $this
     */
    public function setOrderBulkId($order_bulk_id)
    {
        $this->container['order_bulk_id'] = $order_bulk_id;

        return $this;
    }

    /**
     * Gets order_ticket_id
     *
     * @return string
     */
    public function getOrderTicketId()
    {
        return $this->container['order_ticket_id'];
    }

    /**
     * Sets order_ticket_id
     *
     * @param string $order_ticket_id orderTicketId
     *
     * @return $this
     */
    public function setOrderTicketId($order_ticket_id)
    {
        $this->container['order_ticket_id'] = $order_ticket_id;

        return $this;
    }

    /**
     * Gets order_type
     *
     * @return string
     */
    public function getOrderType()
    {
        return $this->container['order_type'];
    }

    /**
     * Sets order_type
     *
     * @param string $order_type orderType
     *
     * @return $this
     */
    public function setOrderType($order_type)
    {
        $this->container['order_type'] = $order_type;

        return $this;
    }

    /**
     * Gets portfolio_id
     *
     * @return string
     */
    public function getPortfolioId()
    {
        return $this->container['portfolio_id'];
    }

    /**
     * Sets portfolio_id
     *
     * @param string $portfolio_id portfolioId
     *
     * @return $this
     */
    public function setPortfolioId($portfolio_id)
    {
        $this->container['portfolio_id'] = $portfolio_id;

        return $this;
    }

    /**
     * Gets price
     *
     * @return double
     */
    public function getPrice()
    {
        return $this->container['price'];
    }

    /**
     * Sets price
     *
     * @param double $price price
     *
     * @return $this
     */
    public function setPrice($price)
    {
        $this->container['price'] = $price;

        return $this;
    }

    /**
     * Gets quantity
     *
     * @return double
     */
    public function getQuantity()
    {
        return $this->container['quantity'];
    }

    /**
     * Sets quantity
     *
     * @param double $quantity quantity
     *
     * @return $this
     */
    public function setQuantity($quantity)
    {
        $this->container['quantity'] = $quantity;

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
     * Gets security_id
     *
     * @return string
     */
    public function getSecurityId()
    {
        return $this->container['security_id'];
    }

    /**
     * Sets security_id
     *
     * @param string $security_id securityId
     *
     * @return $this
     */
    public function setSecurityId($security_id)
    {
        $this->container['security_id'] = $security_id;

        return $this;
    }

    /**
     * Gets tmp_tracker_id
     *
     * @return string
     */
    public function getTmpTrackerId()
    {
        return $this->container['tmp_tracker_id'];
    }

    /**
     * Sets tmp_tracker_id
     *
     * @param string $tmp_tracker_id tmp_tracker_id
     *
     * @return $this
     */
    public function setTmpTrackerId($tmp_tracker_id)
    {
        $this->container['tmp_tracker_id'] = $tmp_tracker_id;

        return $this;
    }

    /**
     * Gets transaction_code_id
     *
     * @return string
     */
    public function getTransactionCodeId()
    {
        return $this->container['transaction_code_id'];
    }

    /**
     * Sets transaction_code_id
     *
     * @param string $transaction_code_id transactionCodeId
     *
     * @return $this
     */
    public function setTransactionCodeId($transaction_code_id)
    {
        $this->container['transaction_code_id'] = $transaction_code_id;

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


