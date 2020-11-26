# coding: utf-8

"""
    Hydrogen Nucleus API

    The Hydrogen Nucleus API  # noqa: E501

    OpenAPI spec version: 1.8.0
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six


class PortfolioHoldingLog(object):
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
        'amount': 'float',
        'cost_basis': 'float',
        'create_date': 'datetime',
        'currency_code': 'str',
        '_date': 'datetime',
        'id': 'str',
        'model_id': 'str',
        'portfolio_id': 'str',
        'secondary_id': 'str',
        'security_id': 'str',
        'shares': 'float',
        'update_date': 'datetime',
        'weight': 'float'
    }

    attribute_map = {
        'account_id': 'account_id',
        'amount': 'amount',
        'cost_basis': 'cost_basis',
        'create_date': 'create_date',
        'currency_code': 'currency_code',
        '_date': 'date',
        'id': 'id',
        'model_id': 'model_id',
        'portfolio_id': 'portfolio_id',
        'secondary_id': 'secondary_id',
        'security_id': 'security_id',
        'shares': 'shares',
        'update_date': 'update_date',
        'weight': 'weight'
    }

    def __init__(self, account_id=None, amount=None, cost_basis=None, create_date=None, currency_code=None, _date=None, id=None, model_id=None, portfolio_id=None, secondary_id=None, security_id=None, shares=None, update_date=None, weight=None):  # noqa: E501
        """PortfolioHoldingLog - a model defined in Swagger"""  # noqa: E501

        self._account_id = None
        self._amount = None
        self._cost_basis = None
        self._create_date = None
        self._currency_code = None
        self.__date = None
        self._id = None
        self._model_id = None
        self._portfolio_id = None
        self._secondary_id = None
        self._security_id = None
        self._shares = None
        self._update_date = None
        self._weight = None
        self.discriminator = None

        self.account_id = account_id
        if amount is not None:
            self.amount = amount
        if cost_basis is not None:
            self.cost_basis = cost_basis
        if create_date is not None:
            self.create_date = create_date
        if currency_code is not None:
            self.currency_code = currency_code
        self._date = _date
        if id is not None:
            self.id = id
        self.model_id = model_id
        self.portfolio_id = portfolio_id
        if secondary_id is not None:
            self.secondary_id = secondary_id
        self.security_id = security_id
        self.shares = shares
        if update_date is not None:
            self.update_date = update_date
        if weight is not None:
            self.weight = weight

    @property
    def account_id(self):
        """Gets the account_id of this PortfolioHoldingLog.  # noqa: E501

        accountId  # noqa: E501

        :return: The account_id of this PortfolioHoldingLog.  # noqa: E501
        :rtype: str
        """
        return self._account_id

    @account_id.setter
    def account_id(self, account_id):
        """Sets the account_id of this PortfolioHoldingLog.

        accountId  # noqa: E501

        :param account_id: The account_id of this PortfolioHoldingLog.  # noqa: E501
        :type: str
        """
        if account_id is None:
            raise ValueError("Invalid value for `account_id`, must not be `None`")  # noqa: E501

        self._account_id = account_id

    @property
    def amount(self):
        """Gets the amount of this PortfolioHoldingLog.  # noqa: E501

        amount  # noqa: E501

        :return: The amount of this PortfolioHoldingLog.  # noqa: E501
        :rtype: float
        """
        return self._amount

    @amount.setter
    def amount(self, amount):
        """Sets the amount of this PortfolioHoldingLog.

        amount  # noqa: E501

        :param amount: The amount of this PortfolioHoldingLog.  # noqa: E501
        :type: float
        """

        self._amount = amount

    @property
    def cost_basis(self):
        """Gets the cost_basis of this PortfolioHoldingLog.  # noqa: E501

        cost_basis  # noqa: E501

        :return: The cost_basis of this PortfolioHoldingLog.  # noqa: E501
        :rtype: float
        """
        return self._cost_basis

    @cost_basis.setter
    def cost_basis(self, cost_basis):
        """Sets the cost_basis of this PortfolioHoldingLog.

        cost_basis  # noqa: E501

        :param cost_basis: The cost_basis of this PortfolioHoldingLog.  # noqa: E501
        :type: float
        """

        self._cost_basis = cost_basis

    @property
    def create_date(self):
        """Gets the create_date of this PortfolioHoldingLog.  # noqa: E501


        :return: The create_date of this PortfolioHoldingLog.  # noqa: E501
        :rtype: datetime
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date):
        """Sets the create_date of this PortfolioHoldingLog.


        :param create_date: The create_date of this PortfolioHoldingLog.  # noqa: E501
        :type: datetime
        """

        self._create_date = create_date

    @property
    def currency_code(self):
        """Gets the currency_code of this PortfolioHoldingLog.  # noqa: E501

        currency_code  # noqa: E501

        :return: The currency_code of this PortfolioHoldingLog.  # noqa: E501
        :rtype: str
        """
        return self._currency_code

    @currency_code.setter
    def currency_code(self, currency_code):
        """Sets the currency_code of this PortfolioHoldingLog.

        currency_code  # noqa: E501

        :param currency_code: The currency_code of this PortfolioHoldingLog.  # noqa: E501
        :type: str
        """

        self._currency_code = currency_code

    @property
    def _date(self):
        """Gets the _date of this PortfolioHoldingLog.  # noqa: E501

        date  # noqa: E501

        :return: The _date of this PortfolioHoldingLog.  # noqa: E501
        :rtype: datetime
        """
        return self.__date

    @_date.setter
    def _date(self, _date):
        """Sets the _date of this PortfolioHoldingLog.

        date  # noqa: E501

        :param _date: The _date of this PortfolioHoldingLog.  # noqa: E501
        :type: datetime
        """
        if _date is None:
            raise ValueError("Invalid value for `_date`, must not be `None`")  # noqa: E501

        self.__date = _date

    @property
    def id(self):
        """Gets the id of this PortfolioHoldingLog.  # noqa: E501


        :return: The id of this PortfolioHoldingLog.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this PortfolioHoldingLog.


        :param id: The id of this PortfolioHoldingLog.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def model_id(self):
        """Gets the model_id of this PortfolioHoldingLog.  # noqa: E501

        modelId  # noqa: E501

        :return: The model_id of this PortfolioHoldingLog.  # noqa: E501
        :rtype: str
        """
        return self._model_id

    @model_id.setter
    def model_id(self, model_id):
        """Sets the model_id of this PortfolioHoldingLog.

        modelId  # noqa: E501

        :param model_id: The model_id of this PortfolioHoldingLog.  # noqa: E501
        :type: str
        """
        if model_id is None:
            raise ValueError("Invalid value for `model_id`, must not be `None`")  # noqa: E501

        self._model_id = model_id

    @property
    def portfolio_id(self):
        """Gets the portfolio_id of this PortfolioHoldingLog.  # noqa: E501

        portfolioId  # noqa: E501

        :return: The portfolio_id of this PortfolioHoldingLog.  # noqa: E501
        :rtype: str
        """
        return self._portfolio_id

    @portfolio_id.setter
    def portfolio_id(self, portfolio_id):
        """Sets the portfolio_id of this PortfolioHoldingLog.

        portfolioId  # noqa: E501

        :param portfolio_id: The portfolio_id of this PortfolioHoldingLog.  # noqa: E501
        :type: str
        """
        if portfolio_id is None:
            raise ValueError("Invalid value for `portfolio_id`, must not be `None`")  # noqa: E501

        self._portfolio_id = portfolio_id

    @property
    def secondary_id(self):
        """Gets the secondary_id of this PortfolioHoldingLog.  # noqa: E501


        :return: The secondary_id of this PortfolioHoldingLog.  # noqa: E501
        :rtype: str
        """
        return self._secondary_id

    @secondary_id.setter
    def secondary_id(self, secondary_id):
        """Sets the secondary_id of this PortfolioHoldingLog.


        :param secondary_id: The secondary_id of this PortfolioHoldingLog.  # noqa: E501
        :type: str
        """

        self._secondary_id = secondary_id

    @property
    def security_id(self):
        """Gets the security_id of this PortfolioHoldingLog.  # noqa: E501

        securityId  # noqa: E501

        :return: The security_id of this PortfolioHoldingLog.  # noqa: E501
        :rtype: str
        """
        return self._security_id

    @security_id.setter
    def security_id(self, security_id):
        """Sets the security_id of this PortfolioHoldingLog.

        securityId  # noqa: E501

        :param security_id: The security_id of this PortfolioHoldingLog.  # noqa: E501
        :type: str
        """
        if security_id is None:
            raise ValueError("Invalid value for `security_id`, must not be `None`")  # noqa: E501

        self._security_id = security_id

    @property
    def shares(self):
        """Gets the shares of this PortfolioHoldingLog.  # noqa: E501

        shares  # noqa: E501

        :return: The shares of this PortfolioHoldingLog.  # noqa: E501
        :rtype: float
        """
        return self._shares

    @shares.setter
    def shares(self, shares):
        """Sets the shares of this PortfolioHoldingLog.

        shares  # noqa: E501

        :param shares: The shares of this PortfolioHoldingLog.  # noqa: E501
        :type: float
        """
        if shares is None:
            raise ValueError("Invalid value for `shares`, must not be `None`")  # noqa: E501

        self._shares = shares

    @property
    def update_date(self):
        """Gets the update_date of this PortfolioHoldingLog.  # noqa: E501


        :return: The update_date of this PortfolioHoldingLog.  # noqa: E501
        :rtype: datetime
        """
        return self._update_date

    @update_date.setter
    def update_date(self, update_date):
        """Sets the update_date of this PortfolioHoldingLog.


        :param update_date: The update_date of this PortfolioHoldingLog.  # noqa: E501
        :type: datetime
        """

        self._update_date = update_date

    @property
    def weight(self):
        """Gets the weight of this PortfolioHoldingLog.  # noqa: E501

        weight  # noqa: E501

        :return: The weight of this PortfolioHoldingLog.  # noqa: E501
        :rtype: float
        """
        return self._weight

    @weight.setter
    def weight(self, weight):
        """Sets the weight of this PortfolioHoldingLog.

        weight  # noqa: E501

        :param weight: The weight of this PortfolioHoldingLog.  # noqa: E501
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
        if issubclass(PortfolioHoldingLog, dict):
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
        if not isinstance(other, PortfolioHoldingLog):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
