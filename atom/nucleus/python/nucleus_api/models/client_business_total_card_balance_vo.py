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


class ClientBusinessTotalCardBalanceVO(object):
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
        'currency_code': 'str',
        'total_balance': 'float',
        'total_balance_available': 'float'
    }

    attribute_map = {
        'currency_code': 'currency_code',
        'total_balance': 'total_balance',
        'total_balance_available': 'total_balance_available'
    }

    def __init__(self, currency_code=None, total_balance=None, total_balance_available=None, _configuration=None):  # noqa: E501
        """ClientBusinessTotalCardBalanceVO - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._currency_code = None
        self._total_balance = None
        self._total_balance_available = None
        self.discriminator = None

        if currency_code is not None:
            self.currency_code = currency_code
        if total_balance is not None:
            self.total_balance = total_balance
        if total_balance_available is not None:
            self.total_balance_available = total_balance_available

    @property
    def currency_code(self):
        """Gets the currency_code of this ClientBusinessTotalCardBalanceVO.  # noqa: E501

        currencyCode  # noqa: E501

        :return: The currency_code of this ClientBusinessTotalCardBalanceVO.  # noqa: E501
        :rtype: str
        """
        return self._currency_code

    @currency_code.setter
    def currency_code(self, currency_code):
        """Sets the currency_code of this ClientBusinessTotalCardBalanceVO.

        currencyCode  # noqa: E501

        :param currency_code: The currency_code of this ClientBusinessTotalCardBalanceVO.  # noqa: E501
        :type: str
        """

        self._currency_code = currency_code

    @property
    def total_balance(self):
        """Gets the total_balance of this ClientBusinessTotalCardBalanceVO.  # noqa: E501

        totalBalance  # noqa: E501

        :return: The total_balance of this ClientBusinessTotalCardBalanceVO.  # noqa: E501
        :rtype: float
        """
        return self._total_balance

    @total_balance.setter
    def total_balance(self, total_balance):
        """Sets the total_balance of this ClientBusinessTotalCardBalanceVO.

        totalBalance  # noqa: E501

        :param total_balance: The total_balance of this ClientBusinessTotalCardBalanceVO.  # noqa: E501
        :type: float
        """

        self._total_balance = total_balance

    @property
    def total_balance_available(self):
        """Gets the total_balance_available of this ClientBusinessTotalCardBalanceVO.  # noqa: E501

        totalBalanceAvailable  # noqa: E501

        :return: The total_balance_available of this ClientBusinessTotalCardBalanceVO.  # noqa: E501
        :rtype: float
        """
        return self._total_balance_available

    @total_balance_available.setter
    def total_balance_available(self, total_balance_available):
        """Sets the total_balance_available of this ClientBusinessTotalCardBalanceVO.

        totalBalanceAvailable  # noqa: E501

        :param total_balance_available: The total_balance_available of this ClientBusinessTotalCardBalanceVO.  # noqa: E501
        :type: float
        """

        self._total_balance_available = total_balance_available

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
        if issubclass(ClientBusinessTotalCardBalanceVO, dict):
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
        if not isinstance(other, ClientBusinessTotalCardBalanceVO):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, ClientBusinessTotalCardBalanceVO):
            return True

        return self.to_dict() != other.to_dict()
