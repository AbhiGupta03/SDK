# coding: utf-8

"""
    Hydrogen Nucleus API

    The Hydrogen Nucleus API  # noqa: E501

    OpenAPI spec version: 1.9.4
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from nucleus_api.configuration import Configuration


class BankLink(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'account_id': 'str',
        'available_balance': 'float',
        'balance': 'float',
        'bank_account_holder': 'str',
        'bank_account_name': 'str',
        'bank_account_number': 'str',
        'business_id': 'str',
        'client_id': 'str',
        'create_date': 'datetime',
        'currency_code': 'str',
        'id': 'str',
        'institution_id': 'str',
        'institution_name': 'str',
        'is_active': 'bool',
        'is_default': 'bool',
        'is_link_verified': 'bool',
        'link_verified_date': 'date',
        'mask': 'str',
        'metadata': 'dict(str, str)',
        'routing': 'str',
        'routing_wire': 'str',
        'secondary_id': 'str',
        'type': 'str',
        'update_date': 'datetime'
    }

    attribute_map = {
        'account_id': 'account_id',
        'available_balance': 'available_balance',
        'balance': 'balance',
        'bank_account_holder': 'bank_account_holder',
        'bank_account_name': 'bank_account_name',
        'bank_account_number': 'bank_account_number',
        'business_id': 'business_id',
        'client_id': 'client_id',
        'create_date': 'create_date',
        'currency_code': 'currency_code',
        'id': 'id',
        'institution_id': 'institution_id',
        'institution_name': 'institution_name',
        'is_active': 'is_active',
        'is_default': 'is_default',
        'is_link_verified': 'is_link_verified',
        'link_verified_date': 'link_verified_date',
        'mask': 'mask',
        'metadata': 'metadata',
        'routing': 'routing',
        'routing_wire': 'routing_wire',
        'secondary_id': 'secondary_id',
        'type': 'type',
        'update_date': 'update_date'
    }

    def __init__(self, account_id=None, available_balance=None, balance=None, bank_account_holder=None, bank_account_name=None, bank_account_number=None, business_id=None, client_id=None, create_date=None, currency_code=None, id=None, institution_id=None, institution_name=None, is_active=None, is_default=None, is_link_verified=None, link_verified_date=None, mask=None, metadata=None, routing=None, routing_wire=None, secondary_id=None, type=None, update_date=None, _configuration=None):  # noqa: E501
        """BankLink - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._account_id = None
        self._available_balance = None
        self._balance = None
        self._bank_account_holder = None
        self._bank_account_name = None
        self._bank_account_number = None
        self._business_id = None
        self._client_id = None
        self._create_date = None
        self._currency_code = None
        self._id = None
        self._institution_id = None
        self._institution_name = None
        self._is_active = None
        self._is_default = None
        self._is_link_verified = None
        self._link_verified_date = None
        self._mask = None
        self._metadata = None
        self._routing = None
        self._routing_wire = None
        self._secondary_id = None
        self._type = None
        self._update_date = None
        self.discriminator = None

        if account_id is not None:
            self.account_id = account_id
        if available_balance is not None:
            self.available_balance = available_balance
        if balance is not None:
            self.balance = balance
        self.bank_account_holder = bank_account_holder
        if bank_account_name is not None:
            self.bank_account_name = bank_account_name
        self.bank_account_number = bank_account_number
        if business_id is not None:
            self.business_id = business_id
        if client_id is not None:
            self.client_id = client_id
        if create_date is not None:
            self.create_date = create_date
        if currency_code is not None:
            self.currency_code = currency_code
        if id is not None:
            self.id = id
        if institution_id is not None:
            self.institution_id = institution_id
        self.institution_name = institution_name
        if is_active is not None:
            self.is_active = is_active
        if is_default is not None:
            self.is_default = is_default
        if is_link_verified is not None:
            self.is_link_verified = is_link_verified
        if link_verified_date is not None:
            self.link_verified_date = link_verified_date
        if mask is not None:
            self.mask = mask
        if metadata is not None:
            self.metadata = metadata
        self.routing = routing
        if routing_wire is not None:
            self.routing_wire = routing_wire
        if secondary_id is not None:
            self.secondary_id = secondary_id
        if type is not None:
            self.type = type
        if update_date is not None:
            self.update_date = update_date

    @property
    def account_id(self):
        """Gets the account_id of this BankLink.  # noqa: E501

        accountId  # noqa: E501

        :return: The account_id of this BankLink.  # noqa: E501
        :rtype: str
        """
        return self._account_id

    @account_id.setter
    def account_id(self, account_id):
        """Sets the account_id of this BankLink.

        accountId  # noqa: E501

        :param account_id: The account_id of this BankLink.  # noqa: E501
        :type: str
        """

        self._account_id = account_id

    @property
    def available_balance(self):
        """Gets the available_balance of this BankLink.  # noqa: E501

        availableBalance  # noqa: E501

        :return: The available_balance of this BankLink.  # noqa: E501
        :rtype: float
        """
        return self._available_balance

    @available_balance.setter
    def available_balance(self, available_balance):
        """Sets the available_balance of this BankLink.

        availableBalance  # noqa: E501

        :param available_balance: The available_balance of this BankLink.  # noqa: E501
        :type: float
        """

        self._available_balance = available_balance

    @property
    def balance(self):
        """Gets the balance of this BankLink.  # noqa: E501

        balance  # noqa: E501

        :return: The balance of this BankLink.  # noqa: E501
        :rtype: float
        """
        return self._balance

    @balance.setter
    def balance(self, balance):
        """Sets the balance of this BankLink.

        balance  # noqa: E501

        :param balance: The balance of this BankLink.  # noqa: E501
        :type: float
        """

        self._balance = balance

    @property
    def bank_account_holder(self):
        """Gets the bank_account_holder of this BankLink.  # noqa: E501

        bankAccountHolder  # noqa: E501

        :return: The bank_account_holder of this BankLink.  # noqa: E501
        :rtype: str
        """
        return self._bank_account_holder

    @bank_account_holder.setter
    def bank_account_holder(self, bank_account_holder):
        """Sets the bank_account_holder of this BankLink.

        bankAccountHolder  # noqa: E501

        :param bank_account_holder: The bank_account_holder of this BankLink.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and bank_account_holder is None:
            raise ValueError("Invalid value for `bank_account_holder`, must not be `None`")  # noqa: E501

        self._bank_account_holder = bank_account_holder

    @property
    def bank_account_name(self):
        """Gets the bank_account_name of this BankLink.  # noqa: E501

        bankAccountName  # noqa: E501

        :return: The bank_account_name of this BankLink.  # noqa: E501
        :rtype: str
        """
        return self._bank_account_name

    @bank_account_name.setter
    def bank_account_name(self, bank_account_name):
        """Sets the bank_account_name of this BankLink.

        bankAccountName  # noqa: E501

        :param bank_account_name: The bank_account_name of this BankLink.  # noqa: E501
        :type: str
        """

        self._bank_account_name = bank_account_name

    @property
    def bank_account_number(self):
        """Gets the bank_account_number of this BankLink.  # noqa: E501

        bankAccountNumber  # noqa: E501

        :return: The bank_account_number of this BankLink.  # noqa: E501
        :rtype: str
        """
        return self._bank_account_number

    @bank_account_number.setter
    def bank_account_number(self, bank_account_number):
        """Sets the bank_account_number of this BankLink.

        bankAccountNumber  # noqa: E501

        :param bank_account_number: The bank_account_number of this BankLink.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and bank_account_number is None:
            raise ValueError("Invalid value for `bank_account_number`, must not be `None`")  # noqa: E501

        self._bank_account_number = bank_account_number

    @property
    def business_id(self):
        """Gets the business_id of this BankLink.  # noqa: E501

        businessId  # noqa: E501

        :return: The business_id of this BankLink.  # noqa: E501
        :rtype: str
        """
        return self._business_id

    @business_id.setter
    def business_id(self, business_id):
        """Sets the business_id of this BankLink.

        businessId  # noqa: E501

        :param business_id: The business_id of this BankLink.  # noqa: E501
        :type: str
        """

        self._business_id = business_id

    @property
    def client_id(self):
        """Gets the client_id of this BankLink.  # noqa: E501

        clientId  # noqa: E501

        :return: The client_id of this BankLink.  # noqa: E501
        :rtype: str
        """
        return self._client_id

    @client_id.setter
    def client_id(self, client_id):
        """Sets the client_id of this BankLink.

        clientId  # noqa: E501

        :param client_id: The client_id of this BankLink.  # noqa: E501
        :type: str
        """

        self._client_id = client_id

    @property
    def create_date(self):
        """Gets the create_date of this BankLink.  # noqa: E501


        :return: The create_date of this BankLink.  # noqa: E501
        :rtype: datetime
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date):
        """Sets the create_date of this BankLink.


        :param create_date: The create_date of this BankLink.  # noqa: E501
        :type: datetime
        """

        self._create_date = create_date

    @property
    def currency_code(self):
        """Gets the currency_code of this BankLink.  # noqa: E501

        currencyCode  # noqa: E501

        :return: The currency_code of this BankLink.  # noqa: E501
        :rtype: str
        """
        return self._currency_code

    @currency_code.setter
    def currency_code(self, currency_code):
        """Sets the currency_code of this BankLink.

        currencyCode  # noqa: E501

        :param currency_code: The currency_code of this BankLink.  # noqa: E501
        :type: str
        """

        self._currency_code = currency_code

    @property
    def id(self):
        """Gets the id of this BankLink.  # noqa: E501


        :return: The id of this BankLink.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this BankLink.


        :param id: The id of this BankLink.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def institution_id(self):
        """Gets the institution_id of this BankLink.  # noqa: E501

        institutionId  # noqa: E501

        :return: The institution_id of this BankLink.  # noqa: E501
        :rtype: str
        """
        return self._institution_id

    @institution_id.setter
    def institution_id(self, institution_id):
        """Sets the institution_id of this BankLink.

        institutionId  # noqa: E501

        :param institution_id: The institution_id of this BankLink.  # noqa: E501
        :type: str
        """

        self._institution_id = institution_id

    @property
    def institution_name(self):
        """Gets the institution_name of this BankLink.  # noqa: E501

        institutionName  # noqa: E501

        :return: The institution_name of this BankLink.  # noqa: E501
        :rtype: str
        """
        return self._institution_name

    @institution_name.setter
    def institution_name(self, institution_name):
        """Sets the institution_name of this BankLink.

        institutionName  # noqa: E501

        :param institution_name: The institution_name of this BankLink.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and institution_name is None:
            raise ValueError("Invalid value for `institution_name`, must not be `None`")  # noqa: E501

        self._institution_name = institution_name

    @property
    def is_active(self):
        """Gets the is_active of this BankLink.  # noqa: E501

        isActive  # noqa: E501

        :return: The is_active of this BankLink.  # noqa: E501
        :rtype: bool
        """
        return self._is_active

    @is_active.setter
    def is_active(self, is_active):
        """Sets the is_active of this BankLink.

        isActive  # noqa: E501

        :param is_active: The is_active of this BankLink.  # noqa: E501
        :type: bool
        """

        self._is_active = is_active

    @property
    def is_default(self):
        """Gets the is_default of this BankLink.  # noqa: E501

        isDefault  # noqa: E501

        :return: The is_default of this BankLink.  # noqa: E501
        :rtype: bool
        """
        return self._is_default

    @is_default.setter
    def is_default(self, is_default):
        """Sets the is_default of this BankLink.

        isDefault  # noqa: E501

        :param is_default: The is_default of this BankLink.  # noqa: E501
        :type: bool
        """

        self._is_default = is_default

    @property
    def is_link_verified(self):
        """Gets the is_link_verified of this BankLink.  # noqa: E501

        isLinkVerified  # noqa: E501

        :return: The is_link_verified of this BankLink.  # noqa: E501
        :rtype: bool
        """
        return self._is_link_verified

    @is_link_verified.setter
    def is_link_verified(self, is_link_verified):
        """Sets the is_link_verified of this BankLink.

        isLinkVerified  # noqa: E501

        :param is_link_verified: The is_link_verified of this BankLink.  # noqa: E501
        :type: bool
        """

        self._is_link_verified = is_link_verified

    @property
    def link_verified_date(self):
        """Gets the link_verified_date of this BankLink.  # noqa: E501

        linkVerifiedDate  # noqa: E501

        :return: The link_verified_date of this BankLink.  # noqa: E501
        :rtype: date
        """
        return self._link_verified_date

    @link_verified_date.setter
    def link_verified_date(self, link_verified_date):
        """Sets the link_verified_date of this BankLink.

        linkVerifiedDate  # noqa: E501

        :param link_verified_date: The link_verified_date of this BankLink.  # noqa: E501
        :type: date
        """

        self._link_verified_date = link_verified_date

    @property
    def mask(self):
        """Gets the mask of this BankLink.  # noqa: E501

        mask  # noqa: E501

        :return: The mask of this BankLink.  # noqa: E501
        :rtype: str
        """
        return self._mask

    @mask.setter
    def mask(self, mask):
        """Sets the mask of this BankLink.

        mask  # noqa: E501

        :param mask: The mask of this BankLink.  # noqa: E501
        :type: str
        """

        self._mask = mask

    @property
    def metadata(self):
        """Gets the metadata of this BankLink.  # noqa: E501


        :return: The metadata of this BankLink.  # noqa: E501
        :rtype: dict(str, str)
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata):
        """Sets the metadata of this BankLink.


        :param metadata: The metadata of this BankLink.  # noqa: E501
        :type: dict(str, str)
        """

        self._metadata = metadata

    @property
    def routing(self):
        """Gets the routing of this BankLink.  # noqa: E501

        routing  # noqa: E501

        :return: The routing of this BankLink.  # noqa: E501
        :rtype: str
        """
        return self._routing

    @routing.setter
    def routing(self, routing):
        """Sets the routing of this BankLink.

        routing  # noqa: E501

        :param routing: The routing of this BankLink.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and routing is None:
            raise ValueError("Invalid value for `routing`, must not be `None`")  # noqa: E501

        self._routing = routing

    @property
    def routing_wire(self):
        """Gets the routing_wire of this BankLink.  # noqa: E501

        routingWire  # noqa: E501

        :return: The routing_wire of this BankLink.  # noqa: E501
        :rtype: str
        """
        return self._routing_wire

    @routing_wire.setter
    def routing_wire(self, routing_wire):
        """Sets the routing_wire of this BankLink.

        routingWire  # noqa: E501

        :param routing_wire: The routing_wire of this BankLink.  # noqa: E501
        :type: str
        """

        self._routing_wire = routing_wire

    @property
    def secondary_id(self):
        """Gets the secondary_id of this BankLink.  # noqa: E501


        :return: The secondary_id of this BankLink.  # noqa: E501
        :rtype: str
        """
        return self._secondary_id

    @secondary_id.setter
    def secondary_id(self, secondary_id):
        """Sets the secondary_id of this BankLink.


        :param secondary_id: The secondary_id of this BankLink.  # noqa: E501
        :type: str
        """

        self._secondary_id = secondary_id

    @property
    def type(self):
        """Gets the type of this BankLink.  # noqa: E501

        type  # noqa: E501

        :return: The type of this BankLink.  # noqa: E501
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this BankLink.

        type  # noqa: E501

        :param type: The type of this BankLink.  # noqa: E501
        :type: str
        """

        self._type = type

    @property
    def update_date(self):
        """Gets the update_date of this BankLink.  # noqa: E501


        :return: The update_date of this BankLink.  # noqa: E501
        :rtype: datetime
        """
        return self._update_date

    @update_date.setter
    def update_date(self, update_date):
        """Sets the update_date of this BankLink.


        :param update_date: The update_date of this BankLink.  # noqa: E501
        :type: datetime
        """

        self._update_date = update_date

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(BankLink, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, BankLink):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, BankLink):
            return True

        return self.to_dict() != other.to_dict()
