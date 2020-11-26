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


class AccountPortfolioRebalanceRequest(object):
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
        'buy_threshold': 'float',
        'buy_transaction_code_id': 'str',
        'cash_portfolio_id': 'str',
        'cash_sec_id': 'str',
        'client_id': 'str',
        'commit_orders': 'bool',
        'non_fractional': 'bool',
        'port_threshold': 'float',
        'restrictions_on': 'bool',
        'sell_threshold': 'float',
        'sell_transaction_code_id': 'str',
        'tenant_id': 'str',
        'use_cash_available': 'bool',
        'use_strategic': 'bool'
    }

    attribute_map = {
        'buy_threshold': 'buy_threshold',
        'buy_transaction_code_id': 'buy_transaction_code_id',
        'cash_portfolio_id': 'cash_portfolio_id',
        'cash_sec_id': 'cash_sec_id',
        'client_id': 'client_id',
        'commit_orders': 'commit_orders',
        'non_fractional': 'non_fractional',
        'port_threshold': 'port_threshold',
        'restrictions_on': 'restrictions_on',
        'sell_threshold': 'sell_threshold',
        'sell_transaction_code_id': 'sell_transaction_code_id',
        'tenant_id': 'tenant_id',
        'use_cash_available': 'use_cash_available',
        'use_strategic': 'use_strategic'
    }

    def __init__(self, buy_threshold=None, buy_transaction_code_id=None, cash_portfolio_id=None, cash_sec_id=None, client_id=None, commit_orders=None, non_fractional=None, port_threshold=None, restrictions_on=None, sell_threshold=None, sell_transaction_code_id=None, tenant_id=None, use_cash_available=None, use_strategic=None):  # noqa: E501
        """AccountPortfolioRebalanceRequest - a model defined in Swagger"""  # noqa: E501

        self._buy_threshold = None
        self._buy_transaction_code_id = None
        self._cash_portfolio_id = None
        self._cash_sec_id = None
        self._client_id = None
        self._commit_orders = None
        self._non_fractional = None
        self._port_threshold = None
        self._restrictions_on = None
        self._sell_threshold = None
        self._sell_transaction_code_id = None
        self._tenant_id = None
        self._use_cash_available = None
        self._use_strategic = None
        self.discriminator = None

        if buy_threshold is not None:
            self.buy_threshold = buy_threshold
        if buy_transaction_code_id is not None:
            self.buy_transaction_code_id = buy_transaction_code_id
        if cash_portfolio_id is not None:
            self.cash_portfolio_id = cash_portfolio_id
        if cash_sec_id is not None:
            self.cash_sec_id = cash_sec_id
        if client_id is not None:
            self.client_id = client_id
        if commit_orders is not None:
            self.commit_orders = commit_orders
        if non_fractional is not None:
            self.non_fractional = non_fractional
        if port_threshold is not None:
            self.port_threshold = port_threshold
        if restrictions_on is not None:
            self.restrictions_on = restrictions_on
        if sell_threshold is not None:
            self.sell_threshold = sell_threshold
        if sell_transaction_code_id is not None:
            self.sell_transaction_code_id = sell_transaction_code_id
        if tenant_id is not None:
            self.tenant_id = tenant_id
        if use_cash_available is not None:
            self.use_cash_available = use_cash_available
        if use_strategic is not None:
            self.use_strategic = use_strategic

    @property
    def buy_threshold(self):
        """Gets the buy_threshold of this AccountPortfolioRebalanceRequest.  # noqa: E501

        buyThreshold  # noqa: E501

        :return: The buy_threshold of this AccountPortfolioRebalanceRequest.  # noqa: E501
        :rtype: float
        """
        return self._buy_threshold

    @buy_threshold.setter
    def buy_threshold(self, buy_threshold):
        """Sets the buy_threshold of this AccountPortfolioRebalanceRequest.

        buyThreshold  # noqa: E501

        :param buy_threshold: The buy_threshold of this AccountPortfolioRebalanceRequest.  # noqa: E501
        :type: float
        """

        self._buy_threshold = buy_threshold

    @property
    def buy_transaction_code_id(self):
        """Gets the buy_transaction_code_id of this AccountPortfolioRebalanceRequest.  # noqa: E501

        buyTransactionCodeId  # noqa: E501

        :return: The buy_transaction_code_id of this AccountPortfolioRebalanceRequest.  # noqa: E501
        :rtype: str
        """
        return self._buy_transaction_code_id

    @buy_transaction_code_id.setter
    def buy_transaction_code_id(self, buy_transaction_code_id):
        """Sets the buy_transaction_code_id of this AccountPortfolioRebalanceRequest.

        buyTransactionCodeId  # noqa: E501

        :param buy_transaction_code_id: The buy_transaction_code_id of this AccountPortfolioRebalanceRequest.  # noqa: E501
        :type: str
        """

        self._buy_transaction_code_id = buy_transaction_code_id

    @property
    def cash_portfolio_id(self):
        """Gets the cash_portfolio_id of this AccountPortfolioRebalanceRequest.  # noqa: E501

        cashPortfolioId  # noqa: E501

        :return: The cash_portfolio_id of this AccountPortfolioRebalanceRequest.  # noqa: E501
        :rtype: str
        """
        return self._cash_portfolio_id

    @cash_portfolio_id.setter
    def cash_portfolio_id(self, cash_portfolio_id):
        """Sets the cash_portfolio_id of this AccountPortfolioRebalanceRequest.

        cashPortfolioId  # noqa: E501

        :param cash_portfolio_id: The cash_portfolio_id of this AccountPortfolioRebalanceRequest.  # noqa: E501
        :type: str
        """

        self._cash_portfolio_id = cash_portfolio_id

    @property
    def cash_sec_id(self):
        """Gets the cash_sec_id of this AccountPortfolioRebalanceRequest.  # noqa: E501

        cashSecId  # noqa: E501

        :return: The cash_sec_id of this AccountPortfolioRebalanceRequest.  # noqa: E501
        :rtype: str
        """
        return self._cash_sec_id

    @cash_sec_id.setter
    def cash_sec_id(self, cash_sec_id):
        """Sets the cash_sec_id of this AccountPortfolioRebalanceRequest.

        cashSecId  # noqa: E501

        :param cash_sec_id: The cash_sec_id of this AccountPortfolioRebalanceRequest.  # noqa: E501
        :type: str
        """

        self._cash_sec_id = cash_sec_id

    @property
    def client_id(self):
        """Gets the client_id of this AccountPortfolioRebalanceRequest.  # noqa: E501

        clientId  # noqa: E501

        :return: The client_id of this AccountPortfolioRebalanceRequest.  # noqa: E501
        :rtype: str
        """
        return self._client_id

    @client_id.setter
    def client_id(self, client_id):
        """Sets the client_id of this AccountPortfolioRebalanceRequest.

        clientId  # noqa: E501

        :param client_id: The client_id of this AccountPortfolioRebalanceRequest.  # noqa: E501
        :type: str
        """

        self._client_id = client_id

    @property
    def commit_orders(self):
        """Gets the commit_orders of this AccountPortfolioRebalanceRequest.  # noqa: E501

        commitOrders  # noqa: E501

        :return: The commit_orders of this AccountPortfolioRebalanceRequest.  # noqa: E501
        :rtype: bool
        """
        return self._commit_orders

    @commit_orders.setter
    def commit_orders(self, commit_orders):
        """Sets the commit_orders of this AccountPortfolioRebalanceRequest.

        commitOrders  # noqa: E501

        :param commit_orders: The commit_orders of this AccountPortfolioRebalanceRequest.  # noqa: E501
        :type: bool
        """

        self._commit_orders = commit_orders

    @property
    def non_fractional(self):
        """Gets the non_fractional of this AccountPortfolioRebalanceRequest.  # noqa: E501

        nonFractional  # noqa: E501

        :return: The non_fractional of this AccountPortfolioRebalanceRequest.  # noqa: E501
        :rtype: bool
        """
        return self._non_fractional

    @non_fractional.setter
    def non_fractional(self, non_fractional):
        """Sets the non_fractional of this AccountPortfolioRebalanceRequest.

        nonFractional  # noqa: E501

        :param non_fractional: The non_fractional of this AccountPortfolioRebalanceRequest.  # noqa: E501
        :type: bool
        """

        self._non_fractional = non_fractional

    @property
    def port_threshold(self):
        """Gets the port_threshold of this AccountPortfolioRebalanceRequest.  # noqa: E501

        portThreshold  # noqa: E501

        :return: The port_threshold of this AccountPortfolioRebalanceRequest.  # noqa: E501
        :rtype: float
        """
        return self._port_threshold

    @port_threshold.setter
    def port_threshold(self, port_threshold):
        """Sets the port_threshold of this AccountPortfolioRebalanceRequest.

        portThreshold  # noqa: E501

        :param port_threshold: The port_threshold of this AccountPortfolioRebalanceRequest.  # noqa: E501
        :type: float
        """

        self._port_threshold = port_threshold

    @property
    def restrictions_on(self):
        """Gets the restrictions_on of this AccountPortfolioRebalanceRequest.  # noqa: E501

        restrictionsOn  # noqa: E501

        :return: The restrictions_on of this AccountPortfolioRebalanceRequest.  # noqa: E501
        :rtype: bool
        """
        return self._restrictions_on

    @restrictions_on.setter
    def restrictions_on(self, restrictions_on):
        """Sets the restrictions_on of this AccountPortfolioRebalanceRequest.

        restrictionsOn  # noqa: E501

        :param restrictions_on: The restrictions_on of this AccountPortfolioRebalanceRequest.  # noqa: E501
        :type: bool
        """

        self._restrictions_on = restrictions_on

    @property
    def sell_threshold(self):
        """Gets the sell_threshold of this AccountPortfolioRebalanceRequest.  # noqa: E501

        sellThreshold  # noqa: E501

        :return: The sell_threshold of this AccountPortfolioRebalanceRequest.  # noqa: E501
        :rtype: float
        """
        return self._sell_threshold

    @sell_threshold.setter
    def sell_threshold(self, sell_threshold):
        """Sets the sell_threshold of this AccountPortfolioRebalanceRequest.

        sellThreshold  # noqa: E501

        :param sell_threshold: The sell_threshold of this AccountPortfolioRebalanceRequest.  # noqa: E501
        :type: float
        """

        self._sell_threshold = sell_threshold

    @property
    def sell_transaction_code_id(self):
        """Gets the sell_transaction_code_id of this AccountPortfolioRebalanceRequest.  # noqa: E501

        sellTransactionCodeId  # noqa: E501

        :return: The sell_transaction_code_id of this AccountPortfolioRebalanceRequest.  # noqa: E501
        :rtype: str
        """
        return self._sell_transaction_code_id

    @sell_transaction_code_id.setter
    def sell_transaction_code_id(self, sell_transaction_code_id):
        """Sets the sell_transaction_code_id of this AccountPortfolioRebalanceRequest.

        sellTransactionCodeId  # noqa: E501

        :param sell_transaction_code_id: The sell_transaction_code_id of this AccountPortfolioRebalanceRequest.  # noqa: E501
        :type: str
        """

        self._sell_transaction_code_id = sell_transaction_code_id

    @property
    def tenant_id(self):
        """Gets the tenant_id of this AccountPortfolioRebalanceRequest.  # noqa: E501

        tenantId  # noqa: E501

        :return: The tenant_id of this AccountPortfolioRebalanceRequest.  # noqa: E501
        :rtype: str
        """
        return self._tenant_id

    @tenant_id.setter
    def tenant_id(self, tenant_id):
        """Sets the tenant_id of this AccountPortfolioRebalanceRequest.

        tenantId  # noqa: E501

        :param tenant_id: The tenant_id of this AccountPortfolioRebalanceRequest.  # noqa: E501
        :type: str
        """

        self._tenant_id = tenant_id

    @property
    def use_cash_available(self):
        """Gets the use_cash_available of this AccountPortfolioRebalanceRequest.  # noqa: E501

        useCashAvailable  # noqa: E501

        :return: The use_cash_available of this AccountPortfolioRebalanceRequest.  # noqa: E501
        :rtype: bool
        """
        return self._use_cash_available

    @use_cash_available.setter
    def use_cash_available(self, use_cash_available):
        """Sets the use_cash_available of this AccountPortfolioRebalanceRequest.

        useCashAvailable  # noqa: E501

        :param use_cash_available: The use_cash_available of this AccountPortfolioRebalanceRequest.  # noqa: E501
        :type: bool
        """

        self._use_cash_available = use_cash_available

    @property
    def use_strategic(self):
        """Gets the use_strategic of this AccountPortfolioRebalanceRequest.  # noqa: E501

        useStrategic  # noqa: E501

        :return: The use_strategic of this AccountPortfolioRebalanceRequest.  # noqa: E501
        :rtype: bool
        """
        return self._use_strategic

    @use_strategic.setter
    def use_strategic(self, use_strategic):
        """Sets the use_strategic of this AccountPortfolioRebalanceRequest.

        useStrategic  # noqa: E501

        :param use_strategic: The use_strategic of this AccountPortfolioRebalanceRequest.  # noqa: E501
        :type: bool
        """

        self._use_strategic = use_strategic

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
        if issubclass(AccountPortfolioRebalanceRequest, dict):
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
        if not isinstance(other, AccountPortfolioRebalanceRequest):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
