<?php
/**
 * Client
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
 * Client Class Doc Comment
 *
 * @category Class
 * @description Client Object
 * @package  com\hydrogen\nucleus
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class Client implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'Client';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'address' => '\com\hydrogen\nucleus\Model\ClientAddress[]',
        'citizenship_status' => 'string',
        'client_type' => 'string',
        'country_of_citizenship' => 'string[]',
        'country_of_residence' => 'string',
        'create_date' => '\DateTime',
        'date_of_birth' => '\DateTime',
        'email' => 'string',
        'employment' => '\com\hydrogen\nucleus\Model\Employment',
        'firm_name' => 'string',
        'firm_type' => 'string',
        'first_name' => 'string',
        'gender' => 'string',
        'hydro_id' => 'string',
        'id' => 'string',
        'identification_number' => 'string',
        'identification_number_type' => 'string',
        'image' => 'string',
        'income' => 'int',
        'is_active' => 'bool',
        'is_verified' => 'bool',
        'last_name' => 'string',
        'liquid_net_worth' => 'double',
        'metadata' => 'map[string,string]',
        'middle_name' => 'string',
        'phone_number' => 'string',
        'secondary_id' => 'string',
        'status' => 'string',
        'suffix' => 'string',
        'title' => 'string',
        'total_net_worth' => 'double',
        'update_date' => '\DateTime',
        'username' => 'string'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'address' => null,
        'citizenship_status' => null,
        'client_type' => null,
        'country_of_citizenship' => null,
        'country_of_residence' => null,
        'create_date' => 'date-time',
        'date_of_birth' => 'date',
        'email' => null,
        'employment' => null,
        'firm_name' => null,
        'firm_type' => null,
        'first_name' => null,
        'gender' => null,
        'hydro_id' => null,
        'id' => 'uuid',
        'identification_number' => null,
        'identification_number_type' => null,
        'image' => null,
        'income' => 'int32',
        'is_active' => null,
        'is_verified' => null,
        'last_name' => null,
        'liquid_net_worth' => 'double',
        'metadata' => null,
        'middle_name' => null,
        'phone_number' => null,
        'secondary_id' => null,
        'status' => null,
        'suffix' => null,
        'title' => null,
        'total_net_worth' => 'double',
        'update_date' => 'date-time',
        'username' => null
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
        'address' => 'address',
        'citizenship_status' => 'citizenship_status',
        'client_type' => 'client_type',
        'country_of_citizenship' => 'country_of_citizenship',
        'country_of_residence' => 'country_of_residence',
        'create_date' => 'create_date',
        'date_of_birth' => 'date_of_birth',
        'email' => 'email',
        'employment' => 'employment',
        'firm_name' => 'firm_name',
        'firm_type' => 'firm_type',
        'first_name' => 'first_name',
        'gender' => 'gender',
        'hydro_id' => 'hydro_id',
        'id' => 'id',
        'identification_number' => 'identification_number',
        'identification_number_type' => 'identification_number_type',
        'image' => 'image',
        'income' => 'income',
        'is_active' => 'is_active',
        'is_verified' => 'is_verified',
        'last_name' => 'last_name',
        'liquid_net_worth' => 'liquid_net_worth',
        'metadata' => 'metadata',
        'middle_name' => 'middle_name',
        'phone_number' => 'phone_number',
        'secondary_id' => 'secondary_id',
        'status' => 'status',
        'suffix' => 'suffix',
        'title' => 'title',
        'total_net_worth' => 'total_net_worth',
        'update_date' => 'update_date',
        'username' => 'username'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'address' => 'setAddress',
        'citizenship_status' => 'setCitizenshipStatus',
        'client_type' => 'setClientType',
        'country_of_citizenship' => 'setCountryOfCitizenship',
        'country_of_residence' => 'setCountryOfResidence',
        'create_date' => 'setCreateDate',
        'date_of_birth' => 'setDateOfBirth',
        'email' => 'setEmail',
        'employment' => 'setEmployment',
        'firm_name' => 'setFirmName',
        'firm_type' => 'setFirmType',
        'first_name' => 'setFirstName',
        'gender' => 'setGender',
        'hydro_id' => 'setHydroId',
        'id' => 'setId',
        'identification_number' => 'setIdentificationNumber',
        'identification_number_type' => 'setIdentificationNumberType',
        'image' => 'setImage',
        'income' => 'setIncome',
        'is_active' => 'setIsActive',
        'is_verified' => 'setIsVerified',
        'last_name' => 'setLastName',
        'liquid_net_worth' => 'setLiquidNetWorth',
        'metadata' => 'setMetadata',
        'middle_name' => 'setMiddleName',
        'phone_number' => 'setPhoneNumber',
        'secondary_id' => 'setSecondaryId',
        'status' => 'setStatus',
        'suffix' => 'setSuffix',
        'title' => 'setTitle',
        'total_net_worth' => 'setTotalNetWorth',
        'update_date' => 'setUpdateDate',
        'username' => 'setUsername'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'address' => 'getAddress',
        'citizenship_status' => 'getCitizenshipStatus',
        'client_type' => 'getClientType',
        'country_of_citizenship' => 'getCountryOfCitizenship',
        'country_of_residence' => 'getCountryOfResidence',
        'create_date' => 'getCreateDate',
        'date_of_birth' => 'getDateOfBirth',
        'email' => 'getEmail',
        'employment' => 'getEmployment',
        'firm_name' => 'getFirmName',
        'firm_type' => 'getFirmType',
        'first_name' => 'getFirstName',
        'gender' => 'getGender',
        'hydro_id' => 'getHydroId',
        'id' => 'getId',
        'identification_number' => 'getIdentificationNumber',
        'identification_number_type' => 'getIdentificationNumberType',
        'image' => 'getImage',
        'income' => 'getIncome',
        'is_active' => 'getIsActive',
        'is_verified' => 'getIsVerified',
        'last_name' => 'getLastName',
        'liquid_net_worth' => 'getLiquidNetWorth',
        'metadata' => 'getMetadata',
        'middle_name' => 'getMiddleName',
        'phone_number' => 'getPhoneNumber',
        'secondary_id' => 'getSecondaryId',
        'status' => 'getStatus',
        'suffix' => 'getSuffix',
        'title' => 'getTitle',
        'total_net_worth' => 'getTotalNetWorth',
        'update_date' => 'getUpdateDate',
        'username' => 'getUsername'
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
        $this->container['address'] = isset($data['address']) ? $data['address'] : null;
        $this->container['citizenship_status'] = isset($data['citizenship_status']) ? $data['citizenship_status'] : null;
        $this->container['client_type'] = isset($data['client_type']) ? $data['client_type'] : null;
        $this->container['country_of_citizenship'] = isset($data['country_of_citizenship']) ? $data['country_of_citizenship'] : null;
        $this->container['country_of_residence'] = isset($data['country_of_residence']) ? $data['country_of_residence'] : null;
        $this->container['create_date'] = isset($data['create_date']) ? $data['create_date'] : null;
        $this->container['date_of_birth'] = isset($data['date_of_birth']) ? $data['date_of_birth'] : null;
        $this->container['email'] = isset($data['email']) ? $data['email'] : null;
        $this->container['employment'] = isset($data['employment']) ? $data['employment'] : null;
        $this->container['firm_name'] = isset($data['firm_name']) ? $data['firm_name'] : null;
        $this->container['firm_type'] = isset($data['firm_type']) ? $data['firm_type'] : null;
        $this->container['first_name'] = isset($data['first_name']) ? $data['first_name'] : null;
        $this->container['gender'] = isset($data['gender']) ? $data['gender'] : null;
        $this->container['hydro_id'] = isset($data['hydro_id']) ? $data['hydro_id'] : null;
        $this->container['id'] = isset($data['id']) ? $data['id'] : null;
        $this->container['identification_number'] = isset($data['identification_number']) ? $data['identification_number'] : null;
        $this->container['identification_number_type'] = isset($data['identification_number_type']) ? $data['identification_number_type'] : null;
        $this->container['image'] = isset($data['image']) ? $data['image'] : null;
        $this->container['income'] = isset($data['income']) ? $data['income'] : null;
        $this->container['is_active'] = isset($data['is_active']) ? $data['is_active'] : null;
        $this->container['is_verified'] = isset($data['is_verified']) ? $data['is_verified'] : null;
        $this->container['last_name'] = isset($data['last_name']) ? $data['last_name'] : null;
        $this->container['liquid_net_worth'] = isset($data['liquid_net_worth']) ? $data['liquid_net_worth'] : null;
        $this->container['metadata'] = isset($data['metadata']) ? $data['metadata'] : null;
        $this->container['middle_name'] = isset($data['middle_name']) ? $data['middle_name'] : null;
        $this->container['phone_number'] = isset($data['phone_number']) ? $data['phone_number'] : null;
        $this->container['secondary_id'] = isset($data['secondary_id']) ? $data['secondary_id'] : null;
        $this->container['status'] = isset($data['status']) ? $data['status'] : null;
        $this->container['suffix'] = isset($data['suffix']) ? $data['suffix'] : null;
        $this->container['title'] = isset($data['title']) ? $data['title'] : null;
        $this->container['total_net_worth'] = isset($data['total_net_worth']) ? $data['total_net_worth'] : null;
        $this->container['update_date'] = isset($data['update_date']) ? $data['update_date'] : null;
        $this->container['username'] = isset($data['username']) ? $data['username'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if ($this->container['client_type'] === null) {
            $invalidProperties[] = "'client_type' can't be null";
        }
        if ($this->container['username'] === null) {
            $invalidProperties[] = "'username' can't be null";
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
     * Gets address
     *
     * @return \com\hydrogen\nucleus\Model\ClientAddress[]
     */
    public function getAddress()
    {
        return $this->container['address'];
    }

    /**
     * Sets address
     *
     * @param \com\hydrogen\nucleus\Model\ClientAddress[] $address address
     *
     * @return $this
     */
    public function setAddress($address)
    {
        $this->container['address'] = $address;

        return $this;
    }

    /**
     * Gets citizenship_status
     *
     * @return string
     */
    public function getCitizenshipStatus()
    {
        return $this->container['citizenship_status'];
    }

    /**
     * Sets citizenship_status
     *
     * @param string $citizenship_status citizenshipStatus
     *
     * @return $this
     */
    public function setCitizenshipStatus($citizenship_status)
    {
        $this->container['citizenship_status'] = $citizenship_status;

        return $this;
    }

    /**
     * Gets client_type
     *
     * @return string
     */
    public function getClientType()
    {
        return $this->container['client_type'];
    }

    /**
     * Sets client_type
     *
     * @param string $client_type clientTypeId
     *
     * @return $this
     */
    public function setClientType($client_type)
    {
        $this->container['client_type'] = $client_type;

        return $this;
    }

    /**
     * Gets country_of_citizenship
     *
     * @return string[]
     */
    public function getCountryOfCitizenship()
    {
        return $this->container['country_of_citizenship'];
    }

    /**
     * Sets country_of_citizenship
     *
     * @param string[] $country_of_citizenship countryOfCitizenship
     *
     * @return $this
     */
    public function setCountryOfCitizenship($country_of_citizenship)
    {
        $this->container['country_of_citizenship'] = $country_of_citizenship;

        return $this;
    }

    /**
     * Gets country_of_residence
     *
     * @return string
     */
    public function getCountryOfResidence()
    {
        return $this->container['country_of_residence'];
    }

    /**
     * Sets country_of_residence
     *
     * @param string $country_of_residence countryOfResidence
     *
     * @return $this
     */
    public function setCountryOfResidence($country_of_residence)
    {
        $this->container['country_of_residence'] = $country_of_residence;

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
     * Gets date_of_birth
     *
     * @return \DateTime
     */
    public function getDateOfBirth()
    {
        return $this->container['date_of_birth'];
    }

    /**
     * Sets date_of_birth
     *
     * @param \DateTime $date_of_birth dateOfBirth
     *
     * @return $this
     */
    public function setDateOfBirth($date_of_birth)
    {
        $this->container['date_of_birth'] = $date_of_birth;

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
     * Gets employment
     *
     * @return \com\hydrogen\nucleus\Model\Employment
     */
    public function getEmployment()
    {
        return $this->container['employment'];
    }

    /**
     * Sets employment
     *
     * @param \com\hydrogen\nucleus\Model\Employment $employment employment
     *
     * @return $this
     */
    public function setEmployment($employment)
    {
        $this->container['employment'] = $employment;

        return $this;
    }

    /**
     * Gets firm_name
     *
     * @return string
     */
    public function getFirmName()
    {
        return $this->container['firm_name'];
    }

    /**
     * Sets firm_name
     *
     * @param string $firm_name firmName
     *
     * @return $this
     */
    public function setFirmName($firm_name)
    {
        $this->container['firm_name'] = $firm_name;

        return $this;
    }

    /**
     * Gets firm_type
     *
     * @return string
     */
    public function getFirmType()
    {
        return $this->container['firm_type'];
    }

    /**
     * Sets firm_type
     *
     * @param string $firm_type firmType
     *
     * @return $this
     */
    public function setFirmType($firm_type)
    {
        $this->container['firm_type'] = $firm_type;

        return $this;
    }

    /**
     * Gets first_name
     *
     * @return string
     */
    public function getFirstName()
    {
        return $this->container['first_name'];
    }

    /**
     * Sets first_name
     *
     * @param string $first_name firstName
     *
     * @return $this
     */
    public function setFirstName($first_name)
    {
        $this->container['first_name'] = $first_name;

        return $this;
    }

    /**
     * Gets gender
     *
     * @return string
     */
    public function getGender()
    {
        return $this->container['gender'];
    }

    /**
     * Sets gender
     *
     * @param string $gender gender
     *
     * @return $this
     */
    public function setGender($gender)
    {
        $this->container['gender'] = $gender;

        return $this;
    }

    /**
     * Gets hydro_id
     *
     * @return string
     */
    public function getHydroId()
    {
        return $this->container['hydro_id'];
    }

    /**
     * Sets hydro_id
     *
     * @param string $hydro_id hydroId
     *
     * @return $this
     */
    public function setHydroId($hydro_id)
    {
        $this->container['hydro_id'] = $hydro_id;

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
     * Gets identification_number
     *
     * @return string
     */
    public function getIdentificationNumber()
    {
        return $this->container['identification_number'];
    }

    /**
     * Sets identification_number
     *
     * @param string $identification_number identificationNumber
     *
     * @return $this
     */
    public function setIdentificationNumber($identification_number)
    {
        $this->container['identification_number'] = $identification_number;

        return $this;
    }

    /**
     * Gets identification_number_type
     *
     * @return string
     */
    public function getIdentificationNumberType()
    {
        return $this->container['identification_number_type'];
    }

    /**
     * Sets identification_number_type
     *
     * @param string $identification_number_type identificationNumberType
     *
     * @return $this
     */
    public function setIdentificationNumberType($identification_number_type)
    {
        $this->container['identification_number_type'] = $identification_number_type;

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
     * Gets income
     *
     * @return int
     */
    public function getIncome()
    {
        return $this->container['income'];
    }

    /**
     * Sets income
     *
     * @param int $income income
     *
     * @return $this
     */
    public function setIncome($income)
    {
        $this->container['income'] = $income;

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
     * Gets is_verified
     *
     * @return bool
     */
    public function getIsVerified()
    {
        return $this->container['is_verified'];
    }

    /**
     * Sets is_verified
     *
     * @param bool $is_verified isVerified
     *
     * @return $this
     */
    public function setIsVerified($is_verified)
    {
        $this->container['is_verified'] = $is_verified;

        return $this;
    }

    /**
     * Gets last_name
     *
     * @return string
     */
    public function getLastName()
    {
        return $this->container['last_name'];
    }

    /**
     * Sets last_name
     *
     * @param string $last_name last_name
     *
     * @return $this
     */
    public function setLastName($last_name)
    {
        $this->container['last_name'] = $last_name;

        return $this;
    }

    /**
     * Gets liquid_net_worth
     *
     * @return double
     */
    public function getLiquidNetWorth()
    {
        return $this->container['liquid_net_worth'];
    }

    /**
     * Sets liquid_net_worth
     *
     * @param double $liquid_net_worth liquidNetWorth
     *
     * @return $this
     */
    public function setLiquidNetWorth($liquid_net_worth)
    {
        $this->container['liquid_net_worth'] = $liquid_net_worth;

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
     * Gets middle_name
     *
     * @return string
     */
    public function getMiddleName()
    {
        return $this->container['middle_name'];
    }

    /**
     * Sets middle_name
     *
     * @param string $middle_name middleName
     *
     * @return $this
     */
    public function setMiddleName($middle_name)
    {
        $this->container['middle_name'] = $middle_name;

        return $this;
    }

    /**
     * Gets phone_number
     *
     * @return string
     */
    public function getPhoneNumber()
    {
        return $this->container['phone_number'];
    }

    /**
     * Sets phone_number
     *
     * @param string $phone_number phoneNumber
     *
     * @return $this
     */
    public function setPhoneNumber($phone_number)
    {
        $this->container['phone_number'] = $phone_number;

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
     * Gets status
     *
     * @return string
     */
    public function getStatus()
    {
        return $this->container['status'];
    }

    /**
     * Sets status
     *
     * @param string $status status
     *
     * @return $this
     */
    public function setStatus($status)
    {
        $this->container['status'] = $status;

        return $this;
    }

    /**
     * Gets suffix
     *
     * @return string
     */
    public function getSuffix()
    {
        return $this->container['suffix'];
    }

    /**
     * Sets suffix
     *
     * @param string $suffix suffix
     *
     * @return $this
     */
    public function setSuffix($suffix)
    {
        $this->container['suffix'] = $suffix;

        return $this;
    }

    /**
     * Gets title
     *
     * @return string
     */
    public function getTitle()
    {
        return $this->container['title'];
    }

    /**
     * Sets title
     *
     * @param string $title title
     *
     * @return $this
     */
    public function setTitle($title)
    {
        $this->container['title'] = $title;

        return $this;
    }

    /**
     * Gets total_net_worth
     *
     * @return double
     */
    public function getTotalNetWorth()
    {
        return $this->container['total_net_worth'];
    }

    /**
     * Sets total_net_worth
     *
     * @param double $total_net_worth totalNetWorth
     *
     * @return $this
     */
    public function setTotalNetWorth($total_net_worth)
    {
        $this->container['total_net_worth'] = $total_net_worth;

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
     * Gets username
     *
     * @return string
     */
    public function getUsername()
    {
        return $this->container['username'];
    }

    /**
     * Sets username
     *
     * @param string $username username
     *
     * @return $this
     */
    public function setUsername($username)
    {
        $this->container['username'] = $username;

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


