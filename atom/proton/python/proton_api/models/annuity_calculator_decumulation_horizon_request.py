# coding: utf-8

"""
    Hydrogen Proton API

    Financial engineering module of Hydrogen Atom  # noqa: E501

    OpenAPI spec version: 1.8.0
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six


class AnnuityCalculatorDecumulationHorizonRequest(object):
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
        'inflation_rate': 'float',
        'annuity_frequency_interval': 'str',
        'deposit_schedule': 'AnnuityDepositSchedule',
        'portfolio_return': 'float',
        'create_log': 'bool',
        'aggregation_account_ids': 'list[str]',
        'initial_balance': 'float',
        'decumulation_horizon': 'int',
        'tax_rate': 'float',
        'account_ids': 'list[str]',
        'annuity_amount': 'float',
        'accumulation_horizon': 'int'
    }

    attribute_map = {
        'inflation_rate': 'inflation_rate',
        'annuity_frequency_interval': 'annuity_frequency_interval',
        'deposit_schedule': 'deposit_schedule',
        'portfolio_return': 'portfolio_return',
        'create_log': 'create_log',
        'aggregation_account_ids': 'aggregation_account_ids',
        'initial_balance': 'initial_balance',
        'decumulation_horizon': 'decumulation_horizon',
        'tax_rate': 'tax_rate',
        'account_ids': 'account_ids',
        'annuity_amount': 'annuity_amount',
        'accumulation_horizon': 'accumulation_horizon'
    }

    def __init__(self, inflation_rate=0.0, annuity_frequency_interval='year', deposit_schedule=None, portfolio_return=None, create_log=False, aggregation_account_ids=None, initial_balance=0.0, decumulation_horizon=None, tax_rate=0.0, account_ids=None, annuity_amount=None, accumulation_horizon=None):  # noqa: E501
        """AnnuityCalculatorDecumulationHorizonRequest - a model defined in Swagger"""  # noqa: E501

        self._inflation_rate = None
        self._annuity_frequency_interval = None
        self._deposit_schedule = None
        self._portfolio_return = None
        self._create_log = None
        self._aggregation_account_ids = None
        self._initial_balance = None
        self._decumulation_horizon = None
        self._tax_rate = None
        self._account_ids = None
        self._annuity_amount = None
        self._accumulation_horizon = None
        self.discriminator = None

        if inflation_rate is not None:
            self.inflation_rate = inflation_rate
        if annuity_frequency_interval is not None:
            self.annuity_frequency_interval = annuity_frequency_interval
        if deposit_schedule is not None:
            self.deposit_schedule = deposit_schedule
        self.portfolio_return = portfolio_return
        if create_log is not None:
            self.create_log = create_log
        if aggregation_account_ids is not None:
            self.aggregation_account_ids = aggregation_account_ids
        if initial_balance is not None:
            self.initial_balance = initial_balance
        if decumulation_horizon is not None:
            self.decumulation_horizon = decumulation_horizon
        if tax_rate is not None:
            self.tax_rate = tax_rate
        if account_ids is not None:
            self.account_ids = account_ids
        self.annuity_amount = annuity_amount
        self.accumulation_horizon = accumulation_horizon

    @property
    def inflation_rate(self):
        """Gets the inflation_rate of this AnnuityCalculatorDecumulationHorizonRequest.  # noqa: E501


        :return: The inflation_rate of this AnnuityCalculatorDecumulationHorizonRequest.  # noqa: E501
        :rtype: float
        """
        return self._inflation_rate

    @inflation_rate.setter
    def inflation_rate(self, inflation_rate):
        """Sets the inflation_rate of this AnnuityCalculatorDecumulationHorizonRequest.


        :param inflation_rate: The inflation_rate of this AnnuityCalculatorDecumulationHorizonRequest.  # noqa: E501
        :type: float
        """
        if inflation_rate is not None and inflation_rate > 20:  # noqa: E501
            raise ValueError("Invalid value for `inflation_rate`, must be a value less than or equal to `20`")  # noqa: E501
        if inflation_rate is not None and inflation_rate < -1:  # noqa: E501
            raise ValueError("Invalid value for `inflation_rate`, must be a value greater than or equal to `-1`")  # noqa: E501

        self._inflation_rate = inflation_rate

    @property
    def annuity_frequency_interval(self):
        """Gets the annuity_frequency_interval of this AnnuityCalculatorDecumulationHorizonRequest.  # noqa: E501


        :return: The annuity_frequency_interval of this AnnuityCalculatorDecumulationHorizonRequest.  # noqa: E501
        :rtype: str
        """
        return self._annuity_frequency_interval

    @annuity_frequency_interval.setter
    def annuity_frequency_interval(self, annuity_frequency_interval):
        """Sets the annuity_frequency_interval of this AnnuityCalculatorDecumulationHorizonRequest.


        :param annuity_frequency_interval: The annuity_frequency_interval of this AnnuityCalculatorDecumulationHorizonRequest.  # noqa: E501
        :type: str
        """
        allowed_values = ["year", "quarter", "month", "week", "day"]  # noqa: E501
        if annuity_frequency_interval not in allowed_values:
            raise ValueError(
                "Invalid value for `annuity_frequency_interval` ({0}), must be one of {1}"  # noqa: E501
                .format(annuity_frequency_interval, allowed_values)
            )

        self._annuity_frequency_interval = annuity_frequency_interval

    @property
    def deposit_schedule(self):
        """Gets the deposit_schedule of this AnnuityCalculatorDecumulationHorizonRequest.  # noqa: E501


        :return: The deposit_schedule of this AnnuityCalculatorDecumulationHorizonRequest.  # noqa: E501
        :rtype: AnnuityDepositSchedule
        """
        return self._deposit_schedule

    @deposit_schedule.setter
    def deposit_schedule(self, deposit_schedule):
        """Sets the deposit_schedule of this AnnuityCalculatorDecumulationHorizonRequest.


        :param deposit_schedule: The deposit_schedule of this AnnuityCalculatorDecumulationHorizonRequest.  # noqa: E501
        :type: AnnuityDepositSchedule
        """

        self._deposit_schedule = deposit_schedule

    @property
    def portfolio_return(self):
        """Gets the portfolio_return of this AnnuityCalculatorDecumulationHorizonRequest.  # noqa: E501


        :return: The portfolio_return of this AnnuityCalculatorDecumulationHorizonRequest.  # noqa: E501
        :rtype: float
        """
        return self._portfolio_return

    @portfolio_return.setter
    def portfolio_return(self, portfolio_return):
        """Sets the portfolio_return of this AnnuityCalculatorDecumulationHorizonRequest.


        :param portfolio_return: The portfolio_return of this AnnuityCalculatorDecumulationHorizonRequest.  # noqa: E501
        :type: float
        """
        if portfolio_return is None:
            raise ValueError("Invalid value for `portfolio_return`, must not be `None`")  # noqa: E501

        self._portfolio_return = portfolio_return

    @property
    def create_log(self):
        """Gets the create_log of this AnnuityCalculatorDecumulationHorizonRequest.  # noqa: E501


        :return: The create_log of this AnnuityCalculatorDecumulationHorizonRequest.  # noqa: E501
        :rtype: bool
        """
        return self._create_log

    @create_log.setter
    def create_log(self, create_log):
        """Sets the create_log of this AnnuityCalculatorDecumulationHorizonRequest.


        :param create_log: The create_log of this AnnuityCalculatorDecumulationHorizonRequest.  # noqa: E501
        :type: bool
        """

        self._create_log = create_log

    @property
    def aggregation_account_ids(self):
        """Gets the aggregation_account_ids of this AnnuityCalculatorDecumulationHorizonRequest.  # noqa: E501


        :return: The aggregation_account_ids of this AnnuityCalculatorDecumulationHorizonRequest.  # noqa: E501
        :rtype: list[str]
        """
        return self._aggregation_account_ids

    @aggregation_account_ids.setter
    def aggregation_account_ids(self, aggregation_account_ids):
        """Sets the aggregation_account_ids of this AnnuityCalculatorDecumulationHorizonRequest.


        :param aggregation_account_ids: The aggregation_account_ids of this AnnuityCalculatorDecumulationHorizonRequest.  # noqa: E501
        :type: list[str]
        """

        self._aggregation_account_ids = aggregation_account_ids

    @property
    def initial_balance(self):
        """Gets the initial_balance of this AnnuityCalculatorDecumulationHorizonRequest.  # noqa: E501


        :return: The initial_balance of this AnnuityCalculatorDecumulationHorizonRequest.  # noqa: E501
        :rtype: float
        """
        return self._initial_balance

    @initial_balance.setter
    def initial_balance(self, initial_balance):
        """Sets the initial_balance of this AnnuityCalculatorDecumulationHorizonRequest.


        :param initial_balance: The initial_balance of this AnnuityCalculatorDecumulationHorizonRequest.  # noqa: E501
        :type: float
        """
        if initial_balance is not None and initial_balance < 0:  # noqa: E501
            raise ValueError("Invalid value for `initial_balance`, must be a value greater than or equal to `0`")  # noqa: E501

        self._initial_balance = initial_balance

    @property
    def decumulation_horizon(self):
        """Gets the decumulation_horizon of this AnnuityCalculatorDecumulationHorizonRequest.  # noqa: E501


        :return: The decumulation_horizon of this AnnuityCalculatorDecumulationHorizonRequest.  # noqa: E501
        :rtype: int
        """
        return self._decumulation_horizon

    @decumulation_horizon.setter
    def decumulation_horizon(self, decumulation_horizon):
        """Sets the decumulation_horizon of this AnnuityCalculatorDecumulationHorizonRequest.


        :param decumulation_horizon: The decumulation_horizon of this AnnuityCalculatorDecumulationHorizonRequest.  # noqa: E501
        :type: int
        """
        if decumulation_horizon is not None and decumulation_horizon < 1:  # noqa: E501
            raise ValueError("Invalid value for `decumulation_horizon`, must be a value greater than or equal to `1`")  # noqa: E501

        self._decumulation_horizon = decumulation_horizon

    @property
    def tax_rate(self):
        """Gets the tax_rate of this AnnuityCalculatorDecumulationHorizonRequest.  # noqa: E501


        :return: The tax_rate of this AnnuityCalculatorDecumulationHorizonRequest.  # noqa: E501
        :rtype: float
        """
        return self._tax_rate

    @tax_rate.setter
    def tax_rate(self, tax_rate):
        """Sets the tax_rate of this AnnuityCalculatorDecumulationHorizonRequest.


        :param tax_rate: The tax_rate of this AnnuityCalculatorDecumulationHorizonRequest.  # noqa: E501
        :type: float
        """
        if tax_rate is not None and tax_rate > 1:  # noqa: E501
            raise ValueError("Invalid value for `tax_rate`, must be a value less than or equal to `1`")  # noqa: E501
        if tax_rate is not None and tax_rate < 0:  # noqa: E501
            raise ValueError("Invalid value for `tax_rate`, must be a value greater than or equal to `0`")  # noqa: E501

        self._tax_rate = tax_rate

    @property
    def account_ids(self):
        """Gets the account_ids of this AnnuityCalculatorDecumulationHorizonRequest.  # noqa: E501


        :return: The account_ids of this AnnuityCalculatorDecumulationHorizonRequest.  # noqa: E501
        :rtype: list[str]
        """
        return self._account_ids

    @account_ids.setter
    def account_ids(self, account_ids):
        """Sets the account_ids of this AnnuityCalculatorDecumulationHorizonRequest.


        :param account_ids: The account_ids of this AnnuityCalculatorDecumulationHorizonRequest.  # noqa: E501
        :type: list[str]
        """

        self._account_ids = account_ids

    @property
    def annuity_amount(self):
        """Gets the annuity_amount of this AnnuityCalculatorDecumulationHorizonRequest.  # noqa: E501


        :return: The annuity_amount of this AnnuityCalculatorDecumulationHorizonRequest.  # noqa: E501
        :rtype: float
        """
        return self._annuity_amount

    @annuity_amount.setter
    def annuity_amount(self, annuity_amount):
        """Sets the annuity_amount of this AnnuityCalculatorDecumulationHorizonRequest.


        :param annuity_amount: The annuity_amount of this AnnuityCalculatorDecumulationHorizonRequest.  # noqa: E501
        :type: float
        """
        if annuity_amount is None:
            raise ValueError("Invalid value for `annuity_amount`, must not be `None`")  # noqa: E501
        if annuity_amount is not None and annuity_amount < 0:  # noqa: E501
            raise ValueError("Invalid value for `annuity_amount`, must be a value greater than or equal to `0`")  # noqa: E501

        self._annuity_amount = annuity_amount

    @property
    def accumulation_horizon(self):
        """Gets the accumulation_horizon of this AnnuityCalculatorDecumulationHorizonRequest.  # noqa: E501


        :return: The accumulation_horizon of this AnnuityCalculatorDecumulationHorizonRequest.  # noqa: E501
        :rtype: int
        """
        return self._accumulation_horizon

    @accumulation_horizon.setter
    def accumulation_horizon(self, accumulation_horizon):
        """Sets the accumulation_horizon of this AnnuityCalculatorDecumulationHorizonRequest.


        :param accumulation_horizon: The accumulation_horizon of this AnnuityCalculatorDecumulationHorizonRequest.  # noqa: E501
        :type: int
        """
        if accumulation_horizon is None:
            raise ValueError("Invalid value for `accumulation_horizon`, must not be `None`")  # noqa: E501
        if accumulation_horizon is not None and accumulation_horizon < 0:  # noqa: E501
            raise ValueError("Invalid value for `accumulation_horizon`, must be a value greater than or equal to `0`")  # noqa: E501

        self._accumulation_horizon = accumulation_horizon

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
        if issubclass(AnnuityCalculatorDecumulationHorizonRequest, dict):
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
        if not isinstance(other, AnnuityCalculatorDecumulationHorizonRequest):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
