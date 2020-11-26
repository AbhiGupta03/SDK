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


class EmergencyFundCalculatorRequest(object):
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
        'telecom_payments': 'float',
        'savings_horizon': 'list[int]',
        'insurance_payments': 'float',
        'client_id': 'str',
        'aggregation_account_ids': 'list[str]',
        'interest_rate': 'float',
        'other_expenses': 'object',
        'emergency_fund_duration': 'int',
        'debt_payments': 'float',
        'housing_cost': 'float',
        'food_costs': 'float',
        'utility_payments': 'float',
        'account_ids': 'list[str]',
        'transportation_costs': 'float',
        'lookback_periods': 'int',
        'current_emergency_fund_balance': 'float',
        'frequency_unit': 'str'
    }

    attribute_map = {
        'telecom_payments': 'telecom_payments',
        'savings_horizon': 'savings_horizon',
        'insurance_payments': 'insurance_payments',
        'client_id': 'client_id',
        'aggregation_account_ids': 'aggregation_account_ids',
        'interest_rate': 'interest_rate',
        'other_expenses': 'other_expenses',
        'emergency_fund_duration': 'emergency_fund_duration',
        'debt_payments': 'debt_payments',
        'housing_cost': 'housing_cost',
        'food_costs': 'food_costs',
        'utility_payments': 'utility_payments',
        'account_ids': 'account_ids',
        'transportation_costs': 'transportation_costs',
        'lookback_periods': 'lookback_periods',
        'current_emergency_fund_balance': 'current_emergency_fund_balance',
        'frequency_unit': 'frequency_unit'
    }

    def __init__(self, telecom_payments=0.0, savings_horizon=None, insurance_payments=0.0, client_id=None, aggregation_account_ids=None, interest_rate=0.0, other_expenses=None, emergency_fund_duration=None, debt_payments=0.0, housing_cost=0.0, food_costs=0.0, utility_payments=0.0, account_ids=None, transportation_costs=0.0, lookback_periods=3, current_emergency_fund_balance=0.0, frequency_unit='month'):  # noqa: E501
        """EmergencyFundCalculatorRequest - a model defined in Swagger"""  # noqa: E501

        self._telecom_payments = None
        self._savings_horizon = None
        self._insurance_payments = None
        self._client_id = None
        self._aggregation_account_ids = None
        self._interest_rate = None
        self._other_expenses = None
        self._emergency_fund_duration = None
        self._debt_payments = None
        self._housing_cost = None
        self._food_costs = None
        self._utility_payments = None
        self._account_ids = None
        self._transportation_costs = None
        self._lookback_periods = None
        self._current_emergency_fund_balance = None
        self._frequency_unit = None
        self.discriminator = None

        if telecom_payments is not None:
            self.telecom_payments = telecom_payments
        if savings_horizon is not None:
            self.savings_horizon = savings_horizon
        if insurance_payments is not None:
            self.insurance_payments = insurance_payments
        if client_id is not None:
            self.client_id = client_id
        if aggregation_account_ids is not None:
            self.aggregation_account_ids = aggregation_account_ids
        if interest_rate is not None:
            self.interest_rate = interest_rate
        if other_expenses is not None:
            self.other_expenses = other_expenses
        self.emergency_fund_duration = emergency_fund_duration
        if debt_payments is not None:
            self.debt_payments = debt_payments
        if housing_cost is not None:
            self.housing_cost = housing_cost
        if food_costs is not None:
            self.food_costs = food_costs
        if utility_payments is not None:
            self.utility_payments = utility_payments
        if account_ids is not None:
            self.account_ids = account_ids
        if transportation_costs is not None:
            self.transportation_costs = transportation_costs
        if lookback_periods is not None:
            self.lookback_periods = lookback_periods
        if current_emergency_fund_balance is not None:
            self.current_emergency_fund_balance = current_emergency_fund_balance
        if frequency_unit is not None:
            self.frequency_unit = frequency_unit

    @property
    def telecom_payments(self):
        """Gets the telecom_payments of this EmergencyFundCalculatorRequest.  # noqa: E501


        :return: The telecom_payments of this EmergencyFundCalculatorRequest.  # noqa: E501
        :rtype: float
        """
        return self._telecom_payments

    @telecom_payments.setter
    def telecom_payments(self, telecom_payments):
        """Sets the telecom_payments of this EmergencyFundCalculatorRequest.


        :param telecom_payments: The telecom_payments of this EmergencyFundCalculatorRequest.  # noqa: E501
        :type: float
        """
        if telecom_payments is not None and telecom_payments < 0:  # noqa: E501
            raise ValueError("Invalid value for `telecom_payments`, must be a value greater than or equal to `0`")  # noqa: E501

        self._telecom_payments = telecom_payments

    @property
    def savings_horizon(self):
        """Gets the savings_horizon of this EmergencyFundCalculatorRequest.  # noqa: E501


        :return: The savings_horizon of this EmergencyFundCalculatorRequest.  # noqa: E501
        :rtype: list[int]
        """
        return self._savings_horizon

    @savings_horizon.setter
    def savings_horizon(self, savings_horizon):
        """Sets the savings_horizon of this EmergencyFundCalculatorRequest.


        :param savings_horizon: The savings_horizon of this EmergencyFundCalculatorRequest.  # noqa: E501
        :type: list[int]
        """

        self._savings_horizon = savings_horizon

    @property
    def insurance_payments(self):
        """Gets the insurance_payments of this EmergencyFundCalculatorRequest.  # noqa: E501


        :return: The insurance_payments of this EmergencyFundCalculatorRequest.  # noqa: E501
        :rtype: float
        """
        return self._insurance_payments

    @insurance_payments.setter
    def insurance_payments(self, insurance_payments):
        """Sets the insurance_payments of this EmergencyFundCalculatorRequest.


        :param insurance_payments: The insurance_payments of this EmergencyFundCalculatorRequest.  # noqa: E501
        :type: float
        """
        if insurance_payments is not None and insurance_payments < 0:  # noqa: E501
            raise ValueError("Invalid value for `insurance_payments`, must be a value greater than or equal to `0`")  # noqa: E501

        self._insurance_payments = insurance_payments

    @property
    def client_id(self):
        """Gets the client_id of this EmergencyFundCalculatorRequest.  # noqa: E501


        :return: The client_id of this EmergencyFundCalculatorRequest.  # noqa: E501
        :rtype: str
        """
        return self._client_id

    @client_id.setter
    def client_id(self, client_id):
        """Sets the client_id of this EmergencyFundCalculatorRequest.


        :param client_id: The client_id of this EmergencyFundCalculatorRequest.  # noqa: E501
        :type: str
        """

        self._client_id = client_id

    @property
    def aggregation_account_ids(self):
        """Gets the aggregation_account_ids of this EmergencyFundCalculatorRequest.  # noqa: E501


        :return: The aggregation_account_ids of this EmergencyFundCalculatorRequest.  # noqa: E501
        :rtype: list[str]
        """
        return self._aggregation_account_ids

    @aggregation_account_ids.setter
    def aggregation_account_ids(self, aggregation_account_ids):
        """Sets the aggregation_account_ids of this EmergencyFundCalculatorRequest.


        :param aggregation_account_ids: The aggregation_account_ids of this EmergencyFundCalculatorRequest.  # noqa: E501
        :type: list[str]
        """

        self._aggregation_account_ids = aggregation_account_ids

    @property
    def interest_rate(self):
        """Gets the interest_rate of this EmergencyFundCalculatorRequest.  # noqa: E501


        :return: The interest_rate of this EmergencyFundCalculatorRequest.  # noqa: E501
        :rtype: float
        """
        return self._interest_rate

    @interest_rate.setter
    def interest_rate(self, interest_rate):
        """Sets the interest_rate of this EmergencyFundCalculatorRequest.


        :param interest_rate: The interest_rate of this EmergencyFundCalculatorRequest.  # noqa: E501
        :type: float
        """
        if interest_rate is not None and interest_rate < 0:  # noqa: E501
            raise ValueError("Invalid value for `interest_rate`, must be a value greater than or equal to `0`")  # noqa: E501

        self._interest_rate = interest_rate

    @property
    def other_expenses(self):
        """Gets the other_expenses of this EmergencyFundCalculatorRequest.  # noqa: E501


        :return: The other_expenses of this EmergencyFundCalculatorRequest.  # noqa: E501
        :rtype: object
        """
        return self._other_expenses

    @other_expenses.setter
    def other_expenses(self, other_expenses):
        """Sets the other_expenses of this EmergencyFundCalculatorRequest.


        :param other_expenses: The other_expenses of this EmergencyFundCalculatorRequest.  # noqa: E501
        :type: object
        """

        self._other_expenses = other_expenses

    @property
    def emergency_fund_duration(self):
        """Gets the emergency_fund_duration of this EmergencyFundCalculatorRequest.  # noqa: E501


        :return: The emergency_fund_duration of this EmergencyFundCalculatorRequest.  # noqa: E501
        :rtype: int
        """
        return self._emergency_fund_duration

    @emergency_fund_duration.setter
    def emergency_fund_duration(self, emergency_fund_duration):
        """Sets the emergency_fund_duration of this EmergencyFundCalculatorRequest.


        :param emergency_fund_duration: The emergency_fund_duration of this EmergencyFundCalculatorRequest.  # noqa: E501
        :type: int
        """
        if emergency_fund_duration is None:
            raise ValueError("Invalid value for `emergency_fund_duration`, must not be `None`")  # noqa: E501
        if emergency_fund_duration is not None and emergency_fund_duration < 1:  # noqa: E501
            raise ValueError("Invalid value for `emergency_fund_duration`, must be a value greater than or equal to `1`")  # noqa: E501

        self._emergency_fund_duration = emergency_fund_duration

    @property
    def debt_payments(self):
        """Gets the debt_payments of this EmergencyFundCalculatorRequest.  # noqa: E501


        :return: The debt_payments of this EmergencyFundCalculatorRequest.  # noqa: E501
        :rtype: float
        """
        return self._debt_payments

    @debt_payments.setter
    def debt_payments(self, debt_payments):
        """Sets the debt_payments of this EmergencyFundCalculatorRequest.


        :param debt_payments: The debt_payments of this EmergencyFundCalculatorRequest.  # noqa: E501
        :type: float
        """
        if debt_payments is not None and debt_payments < 0:  # noqa: E501
            raise ValueError("Invalid value for `debt_payments`, must be a value greater than or equal to `0`")  # noqa: E501

        self._debt_payments = debt_payments

    @property
    def housing_cost(self):
        """Gets the housing_cost of this EmergencyFundCalculatorRequest.  # noqa: E501


        :return: The housing_cost of this EmergencyFundCalculatorRequest.  # noqa: E501
        :rtype: float
        """
        return self._housing_cost

    @housing_cost.setter
    def housing_cost(self, housing_cost):
        """Sets the housing_cost of this EmergencyFundCalculatorRequest.


        :param housing_cost: The housing_cost of this EmergencyFundCalculatorRequest.  # noqa: E501
        :type: float
        """
        if housing_cost is not None and housing_cost < 0:  # noqa: E501
            raise ValueError("Invalid value for `housing_cost`, must be a value greater than or equal to `0`")  # noqa: E501

        self._housing_cost = housing_cost

    @property
    def food_costs(self):
        """Gets the food_costs of this EmergencyFundCalculatorRequest.  # noqa: E501


        :return: The food_costs of this EmergencyFundCalculatorRequest.  # noqa: E501
        :rtype: float
        """
        return self._food_costs

    @food_costs.setter
    def food_costs(self, food_costs):
        """Sets the food_costs of this EmergencyFundCalculatorRequest.


        :param food_costs: The food_costs of this EmergencyFundCalculatorRequest.  # noqa: E501
        :type: float
        """
        if food_costs is not None and food_costs < 0:  # noqa: E501
            raise ValueError("Invalid value for `food_costs`, must be a value greater than or equal to `0`")  # noqa: E501

        self._food_costs = food_costs

    @property
    def utility_payments(self):
        """Gets the utility_payments of this EmergencyFundCalculatorRequest.  # noqa: E501


        :return: The utility_payments of this EmergencyFundCalculatorRequest.  # noqa: E501
        :rtype: float
        """
        return self._utility_payments

    @utility_payments.setter
    def utility_payments(self, utility_payments):
        """Sets the utility_payments of this EmergencyFundCalculatorRequest.


        :param utility_payments: The utility_payments of this EmergencyFundCalculatorRequest.  # noqa: E501
        :type: float
        """
        if utility_payments is not None and utility_payments < 0:  # noqa: E501
            raise ValueError("Invalid value for `utility_payments`, must be a value greater than or equal to `0`")  # noqa: E501

        self._utility_payments = utility_payments

    @property
    def account_ids(self):
        """Gets the account_ids of this EmergencyFundCalculatorRequest.  # noqa: E501


        :return: The account_ids of this EmergencyFundCalculatorRequest.  # noqa: E501
        :rtype: list[str]
        """
        return self._account_ids

    @account_ids.setter
    def account_ids(self, account_ids):
        """Sets the account_ids of this EmergencyFundCalculatorRequest.


        :param account_ids: The account_ids of this EmergencyFundCalculatorRequest.  # noqa: E501
        :type: list[str]
        """

        self._account_ids = account_ids

    @property
    def transportation_costs(self):
        """Gets the transportation_costs of this EmergencyFundCalculatorRequest.  # noqa: E501


        :return: The transportation_costs of this EmergencyFundCalculatorRequest.  # noqa: E501
        :rtype: float
        """
        return self._transportation_costs

    @transportation_costs.setter
    def transportation_costs(self, transportation_costs):
        """Sets the transportation_costs of this EmergencyFundCalculatorRequest.


        :param transportation_costs: The transportation_costs of this EmergencyFundCalculatorRequest.  # noqa: E501
        :type: float
        """
        if transportation_costs is not None and transportation_costs < 0:  # noqa: E501
            raise ValueError("Invalid value for `transportation_costs`, must be a value greater than or equal to `0`")  # noqa: E501

        self._transportation_costs = transportation_costs

    @property
    def lookback_periods(self):
        """Gets the lookback_periods of this EmergencyFundCalculatorRequest.  # noqa: E501


        :return: The lookback_periods of this EmergencyFundCalculatorRequest.  # noqa: E501
        :rtype: int
        """
        return self._lookback_periods

    @lookback_periods.setter
    def lookback_periods(self, lookback_periods):
        """Sets the lookback_periods of this EmergencyFundCalculatorRequest.


        :param lookback_periods: The lookback_periods of this EmergencyFundCalculatorRequest.  # noqa: E501
        :type: int
        """
        if lookback_periods is not None and lookback_periods < 1:  # noqa: E501
            raise ValueError("Invalid value for `lookback_periods`, must be a value greater than or equal to `1`")  # noqa: E501

        self._lookback_periods = lookback_periods

    @property
    def current_emergency_fund_balance(self):
        """Gets the current_emergency_fund_balance of this EmergencyFundCalculatorRequest.  # noqa: E501


        :return: The current_emergency_fund_balance of this EmergencyFundCalculatorRequest.  # noqa: E501
        :rtype: float
        """
        return self._current_emergency_fund_balance

    @current_emergency_fund_balance.setter
    def current_emergency_fund_balance(self, current_emergency_fund_balance):
        """Sets the current_emergency_fund_balance of this EmergencyFundCalculatorRequest.


        :param current_emergency_fund_balance: The current_emergency_fund_balance of this EmergencyFundCalculatorRequest.  # noqa: E501
        :type: float
        """
        if current_emergency_fund_balance is not None and current_emergency_fund_balance < 0:  # noqa: E501
            raise ValueError("Invalid value for `current_emergency_fund_balance`, must be a value greater than or equal to `0`")  # noqa: E501

        self._current_emergency_fund_balance = current_emergency_fund_balance

    @property
    def frequency_unit(self):
        """Gets the frequency_unit of this EmergencyFundCalculatorRequest.  # noqa: E501


        :return: The frequency_unit of this EmergencyFundCalculatorRequest.  # noqa: E501
        :rtype: str
        """
        return self._frequency_unit

    @frequency_unit.setter
    def frequency_unit(self, frequency_unit):
        """Sets the frequency_unit of this EmergencyFundCalculatorRequest.


        :param frequency_unit: The frequency_unit of this EmergencyFundCalculatorRequest.  # noqa: E501
        :type: str
        """
        allowed_values = ["year", "six_months", "quarter", "month", "two_weeks", "week"]  # noqa: E501
        if frequency_unit not in allowed_values:
            raise ValueError(
                "Invalid value for `frequency_unit` ({0}), must be one of {1}"  # noqa: E501
                .format(frequency_unit, allowed_values)
            )

        self._frequency_unit = frequency_unit

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
        if issubclass(EmergencyFundCalculatorRequest, dict):
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
        if not isinstance(other, EmergencyFundCalculatorRequest):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
