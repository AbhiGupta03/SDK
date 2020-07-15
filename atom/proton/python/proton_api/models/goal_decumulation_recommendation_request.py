# coding: utf-8

"""
    Hydrogen Proton API

    Financial engineering module of Hydrogen Atom  # noqa: E501

    OpenAPI spec version: 1.7.18
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six


class GoalDecumulationRecommendationRequest(object):
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
        'client_id': 'str',
        'adjust_for_compounding': 'bool',
        'compounding_rate': 'float',
        'horizon_frequency': 'str',
        'conf_tgt': 'float',
        'd_horizon': 'int',
        'trading_days_per_year': 'int',
        'withdrawal_tax': 'float',
        'thresh_type': 'str',
        'recommend_type': 'str',
        'goal_id': 'str',
        'deposit_config': 'list[object]',
        'n': 'int',
        'recommendation_config': 'object',
        'thresh': 'float',
        'a_horizon': 'int',
        'withdrawal_config': 'list[GoalWithdrawalConfig]',
        'curr_inv': 'float',
        'p_ret': 'list[float]',
        'p_risk': 'list[float]',
        'remove_outliers': 'bool'
    }

    attribute_map = {
        'client_id': 'client_id',
        'adjust_for_compounding': 'adjust_for_compounding',
        'compounding_rate': 'compounding_rate',
        'horizon_frequency': 'horizon_frequency',
        'conf_tgt': 'conf_tgt',
        'd_horizon': 'd_horizon',
        'trading_days_per_year': 'trading_days_per_year',
        'withdrawal_tax': 'withdrawal_tax',
        'thresh_type': 'thresh_type',
        'recommend_type': 'recommend_type',
        'goal_id': 'goal_id',
        'deposit_config': 'deposit_config',
        'n': 'n',
        'recommendation_config': 'recommendation_config',
        'thresh': 'thresh',
        'a_horizon': 'a_horizon',
        'withdrawal_config': 'withdrawal_config',
        'curr_inv': 'curr_inv',
        'p_ret': 'p_ret',
        'p_risk': 'p_risk',
        'remove_outliers': 'remove_outliers'
    }

    def __init__(self, client_id=None, adjust_for_compounding=False, compounding_rate=0.0, horizon_frequency='year', conf_tgt=0.9, d_horizon=None, trading_days_per_year=252, withdrawal_tax=0.0, thresh_type='perc', recommend_type='horizon', goal_id=None, deposit_config=None, n=1000, recommendation_config=None, thresh=None, a_horizon=None, withdrawal_config=None, curr_inv=None, p_ret=None, p_risk=None, remove_outliers=True):  # noqa: E501
        """GoalDecumulationRecommendationRequest - a model defined in Swagger"""  # noqa: E501

        self._client_id = None
        self._adjust_for_compounding = None
        self._compounding_rate = None
        self._horizon_frequency = None
        self._conf_tgt = None
        self._d_horizon = None
        self._trading_days_per_year = None
        self._withdrawal_tax = None
        self._thresh_type = None
        self._recommend_type = None
        self._goal_id = None
        self._deposit_config = None
        self._n = None
        self._recommendation_config = None
        self._thresh = None
        self._a_horizon = None
        self._withdrawal_config = None
        self._curr_inv = None
        self._p_ret = None
        self._p_risk = None
        self._remove_outliers = None
        self.discriminator = None

        if client_id is not None:
            self.client_id = client_id
        if adjust_for_compounding is not None:
            self.adjust_for_compounding = adjust_for_compounding
        if compounding_rate is not None:
            self.compounding_rate = compounding_rate
        if horizon_frequency is not None:
            self.horizon_frequency = horizon_frequency
        if conf_tgt is not None:
            self.conf_tgt = conf_tgt
        if d_horizon is not None:
            self.d_horizon = d_horizon
        if trading_days_per_year is not None:
            self.trading_days_per_year = trading_days_per_year
        if withdrawal_tax is not None:
            self.withdrawal_tax = withdrawal_tax
        if thresh_type is not None:
            self.thresh_type = thresh_type
        if recommend_type is not None:
            self.recommend_type = recommend_type
        if goal_id is not None:
            self.goal_id = goal_id
        if deposit_config is not None:
            self.deposit_config = deposit_config
        if n is not None:
            self.n = n
        if recommendation_config is not None:
            self.recommendation_config = recommendation_config
        if thresh is not None:
            self.thresh = thresh
        if a_horizon is not None:
            self.a_horizon = a_horizon
        if withdrawal_config is not None:
            self.withdrawal_config = withdrawal_config
        if curr_inv is not None:
            self.curr_inv = curr_inv
        self.p_ret = p_ret
        self.p_risk = p_risk
        if remove_outliers is not None:
            self.remove_outliers = remove_outliers

    @property
    def client_id(self):
        """Gets the client_id of this GoalDecumulationRecommendationRequest.  # noqa: E501


        :return: The client_id of this GoalDecumulationRecommendationRequest.  # noqa: E501
        :rtype: str
        """
        return self._client_id

    @client_id.setter
    def client_id(self, client_id):
        """Sets the client_id of this GoalDecumulationRecommendationRequest.


        :param client_id: The client_id of this GoalDecumulationRecommendationRequest.  # noqa: E501
        :type: str
        """

        self._client_id = client_id

    @property
    def adjust_for_compounding(self):
        """Gets the adjust_for_compounding of this GoalDecumulationRecommendationRequest.  # noqa: E501


        :return: The adjust_for_compounding of this GoalDecumulationRecommendationRequest.  # noqa: E501
        :rtype: bool
        """
        return self._adjust_for_compounding

    @adjust_for_compounding.setter
    def adjust_for_compounding(self, adjust_for_compounding):
        """Sets the adjust_for_compounding of this GoalDecumulationRecommendationRequest.


        :param adjust_for_compounding: The adjust_for_compounding of this GoalDecumulationRecommendationRequest.  # noqa: E501
        :type: bool
        """

        self._adjust_for_compounding = adjust_for_compounding

    @property
    def compounding_rate(self):
        """Gets the compounding_rate of this GoalDecumulationRecommendationRequest.  # noqa: E501


        :return: The compounding_rate of this GoalDecumulationRecommendationRequest.  # noqa: E501
        :rtype: float
        """
        return self._compounding_rate

    @compounding_rate.setter
    def compounding_rate(self, compounding_rate):
        """Sets the compounding_rate of this GoalDecumulationRecommendationRequest.


        :param compounding_rate: The compounding_rate of this GoalDecumulationRecommendationRequest.  # noqa: E501
        :type: float
        """
        if compounding_rate is not None and compounding_rate < -1:  # noqa: E501
            raise ValueError("Invalid value for `compounding_rate`, must be a value greater than or equal to `-1`")  # noqa: E501

        self._compounding_rate = compounding_rate

    @property
    def horizon_frequency(self):
        """Gets the horizon_frequency of this GoalDecumulationRecommendationRequest.  # noqa: E501


        :return: The horizon_frequency of this GoalDecumulationRecommendationRequest.  # noqa: E501
        :rtype: str
        """
        return self._horizon_frequency

    @horizon_frequency.setter
    def horizon_frequency(self, horizon_frequency):
        """Sets the horizon_frequency of this GoalDecumulationRecommendationRequest.


        :param horizon_frequency: The horizon_frequency of this GoalDecumulationRecommendationRequest.  # noqa: E501
        :type: str
        """
        allowed_values = ["year", "six_months", "quarter", "month", "two_weeks", "week", "day"]  # noqa: E501
        if horizon_frequency is not None and horizon_frequency.lower() not in allowed_values:
            raise ValueError(
                "Invalid value for `horizon_frequency` ({0}), must be one of {1}"  # noqa: E501
                .format(horizon_frequency, allowed_values)
            )

        self._horizon_frequency = horizon_frequency

    @property
    def conf_tgt(self):
        """Gets the conf_tgt of this GoalDecumulationRecommendationRequest.  # noqa: E501


        :return: The conf_tgt of this GoalDecumulationRecommendationRequest.  # noqa: E501
        :rtype: float
        """
        return self._conf_tgt

    @conf_tgt.setter
    def conf_tgt(self, conf_tgt):
        """Sets the conf_tgt of this GoalDecumulationRecommendationRequest.


        :param conf_tgt: The conf_tgt of this GoalDecumulationRecommendationRequest.  # noqa: E501
        :type: float
        """
        if conf_tgt is not None and conf_tgt > 1:  # noqa: E501
            raise ValueError("Invalid value for `conf_tgt`, must be a value less than or equal to `1`")  # noqa: E501
        if conf_tgt is not None and conf_tgt < 0:  # noqa: E501
            raise ValueError("Invalid value for `conf_tgt`, must be a value greater than or equal to `0`")  # noqa: E501

        self._conf_tgt = conf_tgt

    @property
    def d_horizon(self):
        """Gets the d_horizon of this GoalDecumulationRecommendationRequest.  # noqa: E501


        :return: The d_horizon of this GoalDecumulationRecommendationRequest.  # noqa: E501
        :rtype: int
        """
        return self._d_horizon

    @d_horizon.setter
    def d_horizon(self, d_horizon):
        """Sets the d_horizon of this GoalDecumulationRecommendationRequest.


        :param d_horizon: The d_horizon of this GoalDecumulationRecommendationRequest.  # noqa: E501
        :type: int
        """
        if d_horizon is not None and d_horizon > 350:  # noqa: E501
            raise ValueError("Invalid value for `d_horizon`, must be a value less than or equal to `350`")  # noqa: E501
        if d_horizon is not None and d_horizon < 0:  # noqa: E501
            raise ValueError("Invalid value for `d_horizon`, must be a value greater than or equal to `0`")  # noqa: E501

        self._d_horizon = d_horizon

    @property
    def trading_days_per_year(self):
        """Gets the trading_days_per_year of this GoalDecumulationRecommendationRequest.  # noqa: E501


        :return: The trading_days_per_year of this GoalDecumulationRecommendationRequest.  # noqa: E501
        :rtype: int
        """
        return self._trading_days_per_year

    @trading_days_per_year.setter
    def trading_days_per_year(self, trading_days_per_year):
        """Sets the trading_days_per_year of this GoalDecumulationRecommendationRequest.


        :param trading_days_per_year: The trading_days_per_year of this GoalDecumulationRecommendationRequest.  # noqa: E501
        :type: int
        """
        if trading_days_per_year is not None and trading_days_per_year > 365:  # noqa: E501
            raise ValueError("Invalid value for `trading_days_per_year`, must be a value less than or equal to `365`")  # noqa: E501
        if trading_days_per_year is not None and trading_days_per_year < 1:  # noqa: E501
            raise ValueError("Invalid value for `trading_days_per_year`, must be a value greater than or equal to `1`")  # noqa: E501

        self._trading_days_per_year = trading_days_per_year

    @property
    def withdrawal_tax(self):
        """Gets the withdrawal_tax of this GoalDecumulationRecommendationRequest.  # noqa: E501


        :return: The withdrawal_tax of this GoalDecumulationRecommendationRequest.  # noqa: E501
        :rtype: float
        """
        return self._withdrawal_tax

    @withdrawal_tax.setter
    def withdrawal_tax(self, withdrawal_tax):
        """Sets the withdrawal_tax of this GoalDecumulationRecommendationRequest.


        :param withdrawal_tax: The withdrawal_tax of this GoalDecumulationRecommendationRequest.  # noqa: E501
        :type: float
        """
        if withdrawal_tax is not None and withdrawal_tax > 1:  # noqa: E501
            raise ValueError("Invalid value for `withdrawal_tax`, must be a value less than or equal to `1`")  # noqa: E501
        if withdrawal_tax is not None and withdrawal_tax < 0:  # noqa: E501
            raise ValueError("Invalid value for `withdrawal_tax`, must be a value greater than or equal to `0`")  # noqa: E501

        self._withdrawal_tax = withdrawal_tax

    @property
    def thresh_type(self):
        """Gets the thresh_type of this GoalDecumulationRecommendationRequest.  # noqa: E501


        :return: The thresh_type of this GoalDecumulationRecommendationRequest.  # noqa: E501
        :rtype: str
        """
        return self._thresh_type

    @thresh_type.setter
    def thresh_type(self, thresh_type):
        """Sets the thresh_type of this GoalDecumulationRecommendationRequest.


        :param thresh_type: The thresh_type of this GoalDecumulationRecommendationRequest.  # noqa: E501
        :type: str
        """
        allowed_values = ["amnt", "perc"]  # noqa: E501
        if thresh_type is not None and thresh_type.lower() not in allowed_values:
            raise ValueError(
                "Invalid value for `thresh_type` ({0}), must be one of {1}"  # noqa: E501
                .format(thresh_type, allowed_values)
            )

        self._thresh_type = thresh_type

    @property
    def recommend_type(self):
        """Gets the recommend_type of this GoalDecumulationRecommendationRequest.  # noqa: E501


        :return: The recommend_type of this GoalDecumulationRecommendationRequest.  # noqa: E501
        :rtype: str
        """
        return self._recommend_type

    @recommend_type.setter
    def recommend_type(self, recommend_type):
        """Sets the recommend_type of this GoalDecumulationRecommendationRequest.


        :param recommend_type: The recommend_type of this GoalDecumulationRecommendationRequest.  # noqa: E501
        :type: str
        """
        allowed_values = ["recurring", "one-time", "combo", "horizon"]  # noqa: E501
        if recommend_type is not None and recommend_type.lower() not in allowed_values:
            raise ValueError(
                "Invalid value for `recommend_type` ({0}), must be one of {1}"  # noqa: E501
                .format(recommend_type, allowed_values)
            )

        self._recommend_type = recommend_type

    @property
    def goal_id(self):
        """Gets the goal_id of this GoalDecumulationRecommendationRequest.  # noqa: E501


        :return: The goal_id of this GoalDecumulationRecommendationRequest.  # noqa: E501
        :rtype: str
        """
        return self._goal_id

    @goal_id.setter
    def goal_id(self, goal_id):
        """Sets the goal_id of this GoalDecumulationRecommendationRequest.


        :param goal_id: The goal_id of this GoalDecumulationRecommendationRequest.  # noqa: E501
        :type: str
        """

        self._goal_id = goal_id

    @property
    def deposit_config(self):
        """Gets the deposit_config of this GoalDecumulationRecommendationRequest.  # noqa: E501


        :return: The deposit_config of this GoalDecumulationRecommendationRequest.  # noqa: E501
        :rtype: list[object]
        """
        return self._deposit_config

    @deposit_config.setter
    def deposit_config(self, deposit_config):
        """Sets the deposit_config of this GoalDecumulationRecommendationRequest.


        :param deposit_config: The deposit_config of this GoalDecumulationRecommendationRequest.  # noqa: E501
        :type: list[object]
        """

        self._deposit_config = deposit_config

    @property
    def n(self):
        """Gets the n of this GoalDecumulationRecommendationRequest.  # noqa: E501


        :return: The n of this GoalDecumulationRecommendationRequest.  # noqa: E501
        :rtype: int
        """
        return self._n

    @n.setter
    def n(self, n):
        """Sets the n of this GoalDecumulationRecommendationRequest.


        :param n: The n of this GoalDecumulationRecommendationRequest.  # noqa: E501
        :type: int
        """
        if n is not None and n > 10000:  # noqa: E501
            raise ValueError("Invalid value for `n`, must be a value less than or equal to `10000`")  # noqa: E501
        if n is not None and n < 1:  # noqa: E501
            raise ValueError("Invalid value for `n`, must be a value greater than or equal to `1`")  # noqa: E501

        self._n = n

    @property
    def recommendation_config(self):
        """Gets the recommendation_config of this GoalDecumulationRecommendationRequest.  # noqa: E501


        :return: The recommendation_config of this GoalDecumulationRecommendationRequest.  # noqa: E501
        :rtype: object
        """
        return self._recommendation_config

    @recommendation_config.setter
    def recommendation_config(self, recommendation_config):
        """Sets the recommendation_config of this GoalDecumulationRecommendationRequest.


        :param recommendation_config: The recommendation_config of this GoalDecumulationRecommendationRequest.  # noqa: E501
        :type: object
        """

        self._recommendation_config = recommendation_config

    @property
    def thresh(self):
        """Gets the thresh of this GoalDecumulationRecommendationRequest.  # noqa: E501


        :return: The thresh of this GoalDecumulationRecommendationRequest.  # noqa: E501
        :rtype: float
        """
        return self._thresh

    @thresh.setter
    def thresh(self, thresh):
        """Sets the thresh of this GoalDecumulationRecommendationRequest.


        :param thresh: The thresh of this GoalDecumulationRecommendationRequest.  # noqa: E501
        :type: float
        """
        if thresh is not None and thresh < 0:  # noqa: E501
            raise ValueError("Invalid value for `thresh`, must be a value greater than or equal to `0`")  # noqa: E501

        self._thresh = thresh

    @property
    def a_horizon(self):
        """Gets the a_horizon of this GoalDecumulationRecommendationRequest.  # noqa: E501


        :return: The a_horizon of this GoalDecumulationRecommendationRequest.  # noqa: E501
        :rtype: int
        """
        return self._a_horizon

    @a_horizon.setter
    def a_horizon(self, a_horizon):
        """Sets the a_horizon of this GoalDecumulationRecommendationRequest.


        :param a_horizon: The a_horizon of this GoalDecumulationRecommendationRequest.  # noqa: E501
        :type: int
        """
        if a_horizon is not None and a_horizon > 350:  # noqa: E501
            raise ValueError("Invalid value for `a_horizon`, must be a value less than or equal to `350`")  # noqa: E501
        if a_horizon is not None and a_horizon < 0:  # noqa: E501
            raise ValueError("Invalid value for `a_horizon`, must be a value greater than or equal to `0`")  # noqa: E501

        self._a_horizon = a_horizon

    @property
    def withdrawal_config(self):
        """Gets the withdrawal_config of this GoalDecumulationRecommendationRequest.  # noqa: E501


        :return: The withdrawal_config of this GoalDecumulationRecommendationRequest.  # noqa: E501
        :rtype: list[GoalWithdrawalConfig]
        """
        return self._withdrawal_config

    @withdrawal_config.setter
    def withdrawal_config(self, withdrawal_config):
        """Sets the withdrawal_config of this GoalDecumulationRecommendationRequest.


        :param withdrawal_config: The withdrawal_config of this GoalDecumulationRecommendationRequest.  # noqa: E501
        :type: list[GoalWithdrawalConfig]
        """

        self._withdrawal_config = withdrawal_config

    @property
    def curr_inv(self):
        """Gets the curr_inv of this GoalDecumulationRecommendationRequest.  # noqa: E501


        :return: The curr_inv of this GoalDecumulationRecommendationRequest.  # noqa: E501
        :rtype: float
        """
        return self._curr_inv

    @curr_inv.setter
    def curr_inv(self, curr_inv):
        """Sets the curr_inv of this GoalDecumulationRecommendationRequest.


        :param curr_inv: The curr_inv of this GoalDecumulationRecommendationRequest.  # noqa: E501
        :type: float
        """
        if curr_inv is not None and curr_inv < 0:  # noqa: E501
            raise ValueError("Invalid value for `curr_inv`, must be a value greater than or equal to `0`")  # noqa: E501

        self._curr_inv = curr_inv

    @property
    def p_ret(self):
        """Gets the p_ret of this GoalDecumulationRecommendationRequest.  # noqa: E501


        :return: The p_ret of this GoalDecumulationRecommendationRequest.  # noqa: E501
        :rtype: list[float]
        """
        return self._p_ret

    @p_ret.setter
    def p_ret(self, p_ret):
        """Sets the p_ret of this GoalDecumulationRecommendationRequest.


        :param p_ret: The p_ret of this GoalDecumulationRecommendationRequest.  # noqa: E501
        :type: list[float]
        """
        if p_ret is None:
            raise ValueError("Invalid value for `p_ret`, must not be `None`")  # noqa: E501

        self._p_ret = p_ret

    @property
    def p_risk(self):
        """Gets the p_risk of this GoalDecumulationRecommendationRequest.  # noqa: E501


        :return: The p_risk of this GoalDecumulationRecommendationRequest.  # noqa: E501
        :rtype: list[float]
        """
        return self._p_risk

    @p_risk.setter
    def p_risk(self, p_risk):
        """Sets the p_risk of this GoalDecumulationRecommendationRequest.


        :param p_risk: The p_risk of this GoalDecumulationRecommendationRequest.  # noqa: E501
        :type: list[float]
        """
        if p_risk is None:
            raise ValueError("Invalid value for `p_risk`, must not be `None`")  # noqa: E501

        self._p_risk = p_risk

    @property
    def remove_outliers(self):
        """Gets the remove_outliers of this GoalDecumulationRecommendationRequest.  # noqa: E501


        :return: The remove_outliers of this GoalDecumulationRecommendationRequest.  # noqa: E501
        :rtype: bool
        """
        return self._remove_outliers

    @remove_outliers.setter
    def remove_outliers(self, remove_outliers):
        """Sets the remove_outliers of this GoalDecumulationRecommendationRequest.


        :param remove_outliers: The remove_outliers of this GoalDecumulationRecommendationRequest.  # noqa: E501
        :type: bool
        """

        self._remove_outliers = remove_outliers

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
        if issubclass(GoalDecumulationRecommendationRequest, dict):
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
        if not isinstance(other, GoalDecumulationRecommendationRequest):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
