# coding: utf-8

"""
    Hydrogen Atom API

    The Hydrogen Atom API  # noqa: E501

    OpenAPI spec version: 1.7.0
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six


class AccountHoldingVO(object):
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
        'account_holding_date': 'datetime',
        'amount': 'float',
        'security_asset_class': 'str',
        'security_category': 'str',
        'security_id': 'str',
        'security_industry': 'str',
        'security_name': 'str',
        'security_sector': 'str',
        'security_ticker': 'str',
        'shares': 'float',
        'weight': 'float'
    }

    attribute_map = {
        'account_holding_date': 'account_holding_date',
        'amount': 'amount',
        'security_asset_class': 'security_asset_class',
        'security_category': 'security_category',
        'security_id': 'security_id',
        'security_industry': 'security_industry',
        'security_name': 'security_name',
        'security_sector': 'security_sector',
        'security_ticker': 'security_ticker',
        'shares': 'shares',
        'weight': 'weight'
    }

    def __init__(self, account_holding_date=None, amount=None, security_asset_class=None, security_category=None, security_id=None, security_industry=None, security_name=None, security_sector=None, security_ticker=None, shares=None, weight=None):  # noqa: E501
        """AccountHoldingVO - a model defined in Swagger"""  # noqa: E501

        self._account_holding_date = None
        self._amount = None
        self._security_asset_class = None
        self._security_category = None
        self._security_id = None
        self._security_industry = None
        self._security_name = None
        self._security_sector = None
        self._security_ticker = None
        self._shares = None
        self._weight = None
        self.discriminator = None

        if account_holding_date is not None:
            self.account_holding_date = account_holding_date
        if amount is not None:
            self.amount = amount
        if security_asset_class is not None:
            self.security_asset_class = security_asset_class
        if security_category is not None:
            self.security_category = security_category
        if security_id is not None:
            self.security_id = security_id
        if security_industry is not None:
            self.security_industry = security_industry
        if security_name is not None:
            self.security_name = security_name
        if security_sector is not None:
            self.security_sector = security_sector
        if security_ticker is not None:
            self.security_ticker = security_ticker
        if shares is not None:
            self.shares = shares
        if weight is not None:
            self.weight = weight

    @property
    def account_holding_date(self):
        """Gets the account_holding_date of this AccountHoldingVO.  # noqa: E501


        :return: The account_holding_date of this AccountHoldingVO.  # noqa: E501
        :rtype: datetime
        """
        return self._account_holding_date

    @account_holding_date.setter
    def account_holding_date(self, account_holding_date):
        """Sets the account_holding_date of this AccountHoldingVO.


        :param account_holding_date: The account_holding_date of this AccountHoldingVO.  # noqa: E501
        :type: datetime
        """

        self._account_holding_date = account_holding_date

    @property
    def amount(self):
        """Gets the amount of this AccountHoldingVO.  # noqa: E501


        :return: The amount of this AccountHoldingVO.  # noqa: E501
        :rtype: float
        """
        return self._amount

    @amount.setter
    def amount(self, amount):
        """Sets the amount of this AccountHoldingVO.


        :param amount: The amount of this AccountHoldingVO.  # noqa: E501
        :type: float
        """

        self._amount = amount

    @property
    def security_asset_class(self):
        """Gets the security_asset_class of this AccountHoldingVO.  # noqa: E501


        :return: The security_asset_class of this AccountHoldingVO.  # noqa: E501
        :rtype: str
        """
        return self._security_asset_class

    @security_asset_class.setter
    def security_asset_class(self, security_asset_class):
        """Sets the security_asset_class of this AccountHoldingVO.


        :param security_asset_class: The security_asset_class of this AccountHoldingVO.  # noqa: E501
        :type: str
        """

        self._security_asset_class = security_asset_class

    @property
    def security_category(self):
        """Gets the security_category of this AccountHoldingVO.  # noqa: E501


        :return: The security_category of this AccountHoldingVO.  # noqa: E501
        :rtype: str
        """
        return self._security_category

    @security_category.setter
    def security_category(self, security_category):
        """Sets the security_category of this AccountHoldingVO.


        :param security_category: The security_category of this AccountHoldingVO.  # noqa: E501
        :type: str
        """

        self._security_category = security_category

    @property
    def security_id(self):
        """Gets the security_id of this AccountHoldingVO.  # noqa: E501


        :return: The security_id of this AccountHoldingVO.  # noqa: E501
        :rtype: str
        """
        return self._security_id

    @security_id.setter
    def security_id(self, security_id):
        """Sets the security_id of this AccountHoldingVO.


        :param security_id: The security_id of this AccountHoldingVO.  # noqa: E501
        :type: str
        """

        self._security_id = security_id

    @property
    def security_industry(self):
        """Gets the security_industry of this AccountHoldingVO.  # noqa: E501


        :return: The security_industry of this AccountHoldingVO.  # noqa: E501
        :rtype: str
        """
        return self._security_industry

    @security_industry.setter
    def security_industry(self, security_industry):
        """Sets the security_industry of this AccountHoldingVO.


        :param security_industry: The security_industry of this AccountHoldingVO.  # noqa: E501
        :type: str
        """

        self._security_industry = security_industry

    @property
    def security_name(self):
        """Gets the security_name of this AccountHoldingVO.  # noqa: E501


        :return: The security_name of this AccountHoldingVO.  # noqa: E501
        :rtype: str
        """
        return self._security_name

    @security_name.setter
    def security_name(self, security_name):
        """Sets the security_name of this AccountHoldingVO.


        :param security_name: The security_name of this AccountHoldingVO.  # noqa: E501
        :type: str
        """

        self._security_name = security_name

    @property
    def security_sector(self):
        """Gets the security_sector of this AccountHoldingVO.  # noqa: E501


        :return: The security_sector of this AccountHoldingVO.  # noqa: E501
        :rtype: str
        """
        return self._security_sector

    @security_sector.setter
    def security_sector(self, security_sector):
        """Sets the security_sector of this AccountHoldingVO.


        :param security_sector: The security_sector of this AccountHoldingVO.  # noqa: E501
        :type: str
        """

        self._security_sector = security_sector

    @property
    def security_ticker(self):
        """Gets the security_ticker of this AccountHoldingVO.  # noqa: E501


        :return: The security_ticker of this AccountHoldingVO.  # noqa: E501
        :rtype: str
        """
        return self._security_ticker

    @security_ticker.setter
    def security_ticker(self, security_ticker):
        """Sets the security_ticker of this AccountHoldingVO.


        :param security_ticker: The security_ticker of this AccountHoldingVO.  # noqa: E501
        :type: str
        """

        self._security_ticker = security_ticker

    @property
    def shares(self):
        """Gets the shares of this AccountHoldingVO.  # noqa: E501


        :return: The shares of this AccountHoldingVO.  # noqa: E501
        :rtype: float
        """
        return self._shares

    @shares.setter
    def shares(self, shares):
        """Sets the shares of this AccountHoldingVO.


        :param shares: The shares of this AccountHoldingVO.  # noqa: E501
        :type: float
        """

        self._shares = shares

    @property
    def weight(self):
        """Gets the weight of this AccountHoldingVO.  # noqa: E501


        :return: The weight of this AccountHoldingVO.  # noqa: E501
        :rtype: float
        """
        return self._weight

    @weight.setter
    def weight(self, weight):
        """Sets the weight of this AccountHoldingVO.


        :param weight: The weight of this AccountHoldingVO.  # noqa: E501
        :type: float
        """

        self._weight = weight

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
        if issubclass(AccountHoldingVO, dict):
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
        if not isinstance(other, AccountHoldingVO):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other