# coding: utf-8

"""
    Molecule API Documentation

    The Hydrogen Molecule API  # noqa: E501

    OpenAPI spec version: 1.3.0
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six


class TokenParams(object):
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
        'name': 'str',
        'symbol': 'str',
        'total_supply': 'float',
        'nucleus_model_id': 'str',
        'owner_wallet_id': 'str',
        'is_mintable': 'bool',
        'is_burnable': 'bool',
        'whitelist_address': 'str',
        'contract_address': 'str',
        'crowdsale_address': 'str',
        'is_active': 'bool',
        'secondary_id': 'str',
        'record_status': 'str',
        'offering_settings': 'TokenParamsOfferingSettings',
        'metadata': 'object',
        'restrictions': 'object'
    }

    attribute_map = {
        'name': 'name',
        'symbol': 'symbol',
        'total_supply': 'total_supply',
        'nucleus_model_id': 'nucleus_model_id',
        'owner_wallet_id': 'owner_wallet_id',
        'is_mintable': 'is_mintable',
        'is_burnable': 'is_burnable',
        'whitelist_address': 'whitelist_address',
        'contract_address': 'contract_address',
        'crowdsale_address': 'crowdsale_address',
        'is_active': 'is_active',
        'secondary_id': 'secondary_id',
        'record_status': 'record_status',
        'offering_settings': 'offering_settings',
        'metadata': 'metadata',
        'restrictions': 'restrictions'
    }

    def __init__(self, name=None, symbol=None, total_supply=None, nucleus_model_id=None, owner_wallet_id=None, is_mintable=None, is_burnable=None, whitelist_address=None, contract_address=None, crowdsale_address=None, is_active=None, secondary_id=None, record_status=None, offering_settings=None, metadata=None, restrictions=None):  # noqa: E501
        """TokenParams - a model defined in Swagger"""  # noqa: E501

        self._name = None
        self._symbol = None
        self._total_supply = None
        self._nucleus_model_id = None
        self._owner_wallet_id = None
        self._is_mintable = None
        self._is_burnable = None
        self._whitelist_address = None
        self._contract_address = None
        self._crowdsale_address = None
        self._is_active = None
        self._secondary_id = None
        self._record_status = None
        self._offering_settings = None
        self._metadata = None
        self._restrictions = None
        self.discriminator = None

        self.name = name
        self.symbol = symbol
        self.total_supply = total_supply
        self.nucleus_model_id = nucleus_model_id
        self.owner_wallet_id = owner_wallet_id
        if is_mintable is not None:
            self.is_mintable = is_mintable
        if is_burnable is not None:
            self.is_burnable = is_burnable
        if whitelist_address is not None:
            self.whitelist_address = whitelist_address
        if contract_address is not None:
            self.contract_address = contract_address
        if crowdsale_address is not None:
            self.crowdsale_address = crowdsale_address
        if is_active is not None:
            self.is_active = is_active
        if secondary_id is not None:
            self.secondary_id = secondary_id
        if record_status is not None:
            self.record_status = record_status
        self.offering_settings = offering_settings
        if metadata is not None:
            self.metadata = metadata
        if restrictions is not None:
            self.restrictions = restrictions

    @property
    def name(self):
        """Gets the name of this TokenParams.  # noqa: E501


        :return: The name of this TokenParams.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this TokenParams.


        :param name: The name of this TokenParams.  # noqa: E501
        :type: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def symbol(self):
        """Gets the symbol of this TokenParams.  # noqa: E501


        :return: The symbol of this TokenParams.  # noqa: E501
        :rtype: str
        """
        return self._symbol

    @symbol.setter
    def symbol(self, symbol):
        """Sets the symbol of this TokenParams.


        :param symbol: The symbol of this TokenParams.  # noqa: E501
        :type: str
        """
        if symbol is None:
            raise ValueError("Invalid value for `symbol`, must not be `None`")  # noqa: E501

        self._symbol = symbol


    @property
    def total_supply(self):
        """Gets the total_supply of this TokenParams.  # noqa: E501


        :return: The total_supply of this TokenParams.  # noqa: E501
        :rtype: float
        """
        return self._total_supply

    @total_supply.setter
    def total_supply(self, total_supply):
        """Sets the total_supply of this TokenParams.


        :param total_supply: The total_supply of this TokenParams.  # noqa: E501
        :type: float
        """
        if total_supply is None:
            raise ValueError("Invalid value for `total_supply`, must not be `None`")  # noqa: E501

        self._total_supply = total_supply

    @property
    def nucleus_model_id(self):
        """Gets the nucleus_model_id of this TokenParams.  # noqa: E501


        :return: The nucleus_model_id of this TokenParams.  # noqa: E501
        :rtype: str
        """
        return self._nucleus_model_id

    @nucleus_model_id.setter
    def nucleus_model_id(self, nucleus_model_id):
        """Sets the nucleus_model_id of this TokenParams.


        :param nucleus_model_id: The nucleus_model_id of this TokenParams.  # noqa: E501
        :type: str
        """
        if nucleus_model_id is None:
            raise ValueError("Invalid value for `nucleus_model_id`, must not be `None`")  # noqa: E501

        self._nucleus_model_id = nucleus_model_id

    @property
    def owner_wallet_id(self):
        """Gets the owner_wallet_id of this TokenParams.  # noqa: E501


        :return: The owner_wallet_id of this TokenParams.  # noqa: E501
        :rtype: str
        """
        return self._owner_wallet_id

    @owner_wallet_id.setter
    def owner_wallet_id(self, owner_wallet_id):
        """Sets the owner_wallet_id of this TokenParams.


        :param owner_wallet_id: The owner_wallet_id of this TokenParams.  # noqa: E501
        :type: str
        """
        if owner_wallet_id is None:
            raise ValueError("Invalid value for `owner_wallet_id`, must not be `None`")  # noqa: E501

        self._owner_wallet_id = owner_wallet_id

    @property
    def is_mintable(self):
        """Gets the is_mintable of this TokenParams.  # noqa: E501


        :return: The is_mintable of this TokenParams.  # noqa: E501
        :rtype: bool
        """
        return self._is_mintable

    @is_mintable.setter
    def is_mintable(self, is_mintable):
        """Sets the is_mintable of this TokenParams.


        :param is_mintable: The is_mintable of this TokenParams.  # noqa: E501
        :type: bool
        """

        self._is_mintable = is_mintable

    @property
    def is_burnable(self):
        """Gets the is_burnable of this TokenParams.  # noqa: E501


        :return: The is_burnable of this TokenParams.  # noqa: E501
        :rtype: bool
        """
        return self._is_burnable

    @is_burnable.setter
    def is_burnable(self, is_burnable):
        """Sets the is_burnable of this TokenParams.


        :param is_burnable: The is_burnable of this TokenParams.  # noqa: E501
        :type: bool
        """

        self._is_burnable = is_burnable

    @property
    def whitelist_address(self):
        """Gets the whitelist_address of this TokenParams.  # noqa: E501


        :return: The whitelist_address of this TokenParams.  # noqa: E501
        :rtype: str
        """
        return self._whitelist_address

    @whitelist_address.setter
    def whitelist_address(self, whitelist_address):
        """Sets the whitelist_address of this TokenParams.


        :param whitelist_address: The whitelist_address of this TokenParams.  # noqa: E501
        :type: str
        """

        self._whitelist_address = whitelist_address

    @property
    def contract_address(self):
        """Gets the contract_address of this TokenParams.  # noqa: E501


        :return: The contract_address of this TokenParams.  # noqa: E501
        :rtype: str
        """
        return self._contract_address

    @contract_address.setter
    def contract_address(self, contract_address):
        """Sets the contract_address of this TokenParams.


        :param contract_address: The contract_address of this TokenParams.  # noqa: E501
        :type: str
        """

        self._contract_address = contract_address

    @property
    def crowdsale_address(self):
        """Gets the crowdsale_address of this TokenParams.  # noqa: E501


        :return: The crowdsale_address of this TokenParams.  # noqa: E501
        :rtype: str
        """
        return self._crowdsale_address

    @crowdsale_address.setter
    def crowdsale_address(self, crowdsale_address):
        """Sets the crowdsale_address of this TokenParams.


        :param crowdsale_address: The crowdsale_address of this TokenParams.  # noqa: E501
        :type: str
        """

        self._crowdsale_address = crowdsale_address

    @property
    def is_active(self):
        """Gets the is_active of this TokenParams.  # noqa: E501


        :return: The is_active of this TokenParams.  # noqa: E501
        :rtype: bool
        """
        return self._is_active

    @is_active.setter
    def is_active(self, is_active):
        """Sets the is_active of this TokenParams.


        :param is_active: The is_active of this TokenParams.  # noqa: E501
        :type: bool
        """

        self._is_active = is_active

    @property
    def secondary_id(self):
        """Gets the secondary_id of this TokenParams.  # noqa: E501


        :return: The secondary_id of this TokenParams.  # noqa: E501
        :rtype: str
        """
        return self._secondary_id

    @secondary_id.setter
    def secondary_id(self, secondary_id):
        """Sets the secondary_id of this TokenParams.


        :param secondary_id: The secondary_id of this TokenParams.  # noqa: E501
        :type: str
        """

        self._secondary_id = secondary_id

    @property
    def record_status(self):
        """Gets the record_status of this TokenParams.  # noqa: E501


        :return: The record_status of this TokenParams.  # noqa: E501
        :rtype: str
        """
        return self._record_status

    @record_status.setter
    def record_status(self, record_status):
        """Sets the record_status of this TokenParams.


        :param record_status: The record_status of this TokenParams.  # noqa: E501
        :type: str
        """

        self._record_status = record_status

    @property
    def offering_settings(self):
        """Gets the offering_settings of this TokenParams.  # noqa: E501


        :return: The offering_settings of this TokenParams.  # noqa: E501
        :rtype: TokenParamsOfferingSettings
        """
        return self._offering_settings

    @offering_settings.setter
    def offering_settings(self, offering_settings):
        """Sets the offering_settings of this TokenParams.


        :param offering_settings: The offering_settings of this TokenParams.  # noqa: E501
        :type: TokenParamsOfferingSettings
        """
        if offering_settings is None:
            raise ValueError("Invalid value for `offering_settings`, must not be `None`")  # noqa: E501

        self._offering_settings = offering_settings

    @property
    def metadata(self):
        """Gets the metadata of this TokenParams.  # noqa: E501


        :return: The metadata of this TokenParams.  # noqa: E501
        :rtype: object
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata):
        """Sets the metadata of this TokenParams.


        :param metadata: The metadata of this TokenParams.  # noqa: E501
        :type: object
        """

        self._metadata = metadata

    @property
    def restrictions(self):
        """Gets the restrictions of this TokenParams.  # noqa: E501


        :return: The restrictions of this TokenParams.  # noqa: E501
        :rtype: object
        """
        return self._restrictions

    @restrictions.setter
    def restrictions(self, restrictions):
        """Sets the restrictions of this TokenParams.


        :param restrictions: The restrictions of this TokenParams.  # noqa: E501
        :type: object
        """

        self._restrictions = restrictions

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
        if issubclass(TokenParams, dict):
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
        if not isinstance(other, TokenParams):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
