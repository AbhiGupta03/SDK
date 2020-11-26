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


class VariableAnnuityRequest(object):
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
        'guaranteed_accumulation_benefit': 'float',
        'p': 'float',
        'aggregation_account_id': 'str',
        'allocation_id': 'str',
        'portfolio_weights': 'list[float]',
        'end_date': 'str',
        'n': 'int',
        'account_id': 'str',
        'portfolio_tickers': 'list[str]',
        'initial_balance': 'float',
        'remove_outliers': 'bool',
        'model_id': 'str',
        'guaranteed_rate_benefit': 'list[GuaranteedRateBenefit]',
        'deposit_schedule': 'AnnuityDepositSchedule',
        'use_proxy_data': 'bool',
        'accumulation_horizon': 'int',
        'inflation_rate': 'float',
        'annuitization_rate': 'float',
        'result_type': 'str',
        'start_date': 'str',
        'portfolio_id': 'str',
        'market_data_source': 'str',
        'trading_days_per_year': 'int',
        'frequency_interval': 'str',
        'create_log': 'bool',
        'decumulation_horizon': 'int',
        'tax_rate': 'float'
    }

    attribute_map = {
        'guaranteed_accumulation_benefit': 'guaranteed_accumulation_benefit',
        'p': 'p',
        'aggregation_account_id': 'aggregation_account_id',
        'allocation_id': 'allocation_id',
        'portfolio_weights': 'portfolio_weights',
        'end_date': 'end_date',
        'n': 'n',
        'account_id': 'account_id',
        'portfolio_tickers': 'portfolio_tickers',
        'initial_balance': 'initial_balance',
        'remove_outliers': 'remove_outliers',
        'model_id': 'model_id',
        'guaranteed_rate_benefit': 'guaranteed_rate_benefit',
        'deposit_schedule': 'deposit_schedule',
        'use_proxy_data': 'use_proxy_data',
        'accumulation_horizon': 'accumulation_horizon',
        'inflation_rate': 'inflation_rate',
        'annuitization_rate': 'annuitization_rate',
        'result_type': 'result_type',
        'start_date': 'start_date',
        'portfolio_id': 'portfolio_id',
        'market_data_source': 'market_data_source',
        'trading_days_per_year': 'trading_days_per_year',
        'frequency_interval': 'frequency_interval',
        'create_log': 'create_log',
        'decumulation_horizon': 'decumulation_horizon',
        'tax_rate': 'tax_rate'
    }

    def __init__(self, guaranteed_accumulation_benefit=0.0, p=None, aggregation_account_id=None, allocation_id=None, portfolio_weights=None, end_date=None, n=1000, account_id=None, portfolio_tickers=None, initial_balance=0.0, remove_outliers=False, model_id=None, guaranteed_rate_benefit=None, deposit_schedule=None, use_proxy_data=False, accumulation_horizon=None, inflation_rate=0.0, annuitization_rate=0.0, result_type='median', start_date=None, portfolio_id=None, market_data_source='nucleus', trading_days_per_year=252, frequency_interval='year', create_log=False, decumulation_horizon=None, tax_rate=0.0):  # noqa: E501
        """VariableAnnuityRequest - a model defined in Swagger"""  # noqa: E501

        self._guaranteed_accumulation_benefit = None
        self._p = None
        self._aggregation_account_id = None
        self._allocation_id = None
        self._portfolio_weights = None
        self._end_date = None
        self._n = None
        self._account_id = None
        self._portfolio_tickers = None
        self._initial_balance = None
        self._remove_outliers = None
        self._model_id = None
        self._guaranteed_rate_benefit = None
        self._deposit_schedule = None
        self._use_proxy_data = None
        self._accumulation_horizon = None
        self._inflation_rate = None
        self._annuitization_rate = None
        self._result_type = None
        self._start_date = None
        self._portfolio_id = None
        self._market_data_source = None
        self._trading_days_per_year = None
        self._frequency_interval = None
        self._create_log = None
        self._decumulation_horizon = None
        self._tax_rate = None
        self.discriminator = None

        if guaranteed_accumulation_benefit is not None:
            self.guaranteed_accumulation_benefit = guaranteed_accumulation_benefit
        if p is not None:
            self.p = p
        if aggregation_account_id is not None:
            self.aggregation_account_id = aggregation_account_id
        if allocation_id is not None:
            self.allocation_id = allocation_id
        if portfolio_weights is not None:
            self.portfolio_weights = portfolio_weights
        if end_date is not None:
            self.end_date = end_date
        if n is not None:
            self.n = n
        if account_id is not None:
            self.account_id = account_id
        if portfolio_tickers is not None:
            self.portfolio_tickers = portfolio_tickers
        if initial_balance is not None:
            self.initial_balance = initial_balance
        if remove_outliers is not None:
            self.remove_outliers = remove_outliers
        if model_id is not None:
            self.model_id = model_id
        if guaranteed_rate_benefit is not None:
            self.guaranteed_rate_benefit = guaranteed_rate_benefit
        if deposit_schedule is not None:
            self.deposit_schedule = deposit_schedule
        if use_proxy_data is not None:
            self.use_proxy_data = use_proxy_data
        self.accumulation_horizon = accumulation_horizon
        if inflation_rate is not None:
            self.inflation_rate = inflation_rate
        if annuitization_rate is not None:
            self.annuitization_rate = annuitization_rate
        if result_type is not None:
            self.result_type = result_type
        if start_date is not None:
            self.start_date = start_date
        if portfolio_id is not None:
            self.portfolio_id = portfolio_id
        if market_data_source is not None:
            self.market_data_source = market_data_source
        if trading_days_per_year is not None:
            self.trading_days_per_year = trading_days_per_year
        if frequency_interval is not None:
            self.frequency_interval = frequency_interval
        if create_log is not None:
            self.create_log = create_log
        self.decumulation_horizon = decumulation_horizon
        if tax_rate is not None:
            self.tax_rate = tax_rate

    @property
    def guaranteed_accumulation_benefit(self):
        """Gets the guaranteed_accumulation_benefit of this VariableAnnuityRequest.  # noqa: E501


        :return: The guaranteed_accumulation_benefit of this VariableAnnuityRequest.  # noqa: E501
        :rtype: float
        """
        return self._guaranteed_accumulation_benefit

    @guaranteed_accumulation_benefit.setter
    def guaranteed_accumulation_benefit(self, guaranteed_accumulation_benefit):
        """Sets the guaranteed_accumulation_benefit of this VariableAnnuityRequest.


        :param guaranteed_accumulation_benefit: The guaranteed_accumulation_benefit of this VariableAnnuityRequest.  # noqa: E501
        :type: float
        """
        if guaranteed_accumulation_benefit is not None and guaranteed_accumulation_benefit < 0:  # noqa: E501
            raise ValueError("Invalid value for `guaranteed_accumulation_benefit`, must be a value greater than or equal to `0`")  # noqa: E501

        self._guaranteed_accumulation_benefit = guaranteed_accumulation_benefit

    @property
    def p(self):
        """Gets the p of this VariableAnnuityRequest.  # noqa: E501


        :return: The p of this VariableAnnuityRequest.  # noqa: E501
        :rtype: float
        """
        return self._p

    @p.setter
    def p(self, p):
        """Sets the p of this VariableAnnuityRequest.


        :param p: The p of this VariableAnnuityRequest.  # noqa: E501
        :type: float
        """
        if p is not None and p > 100:  # noqa: E501
            raise ValueError("Invalid value for `p`, must be a value less than or equal to `100`")  # noqa: E501
        if p is not None and p < 0:  # noqa: E501
            raise ValueError("Invalid value for `p`, must be a value greater than or equal to `0`")  # noqa: E501

        self._p = p

    @property
    def aggregation_account_id(self):
        """Gets the aggregation_account_id of this VariableAnnuityRequest.  # noqa: E501


        :return: The aggregation_account_id of this VariableAnnuityRequest.  # noqa: E501
        :rtype: str
        """
        return self._aggregation_account_id

    @aggregation_account_id.setter
    def aggregation_account_id(self, aggregation_account_id):
        """Sets the aggregation_account_id of this VariableAnnuityRequest.


        :param aggregation_account_id: The aggregation_account_id of this VariableAnnuityRequest.  # noqa: E501
        :type: str
        """

        self._aggregation_account_id = aggregation_account_id

    @property
    def allocation_id(self):
        """Gets the allocation_id of this VariableAnnuityRequest.  # noqa: E501


        :return: The allocation_id of this VariableAnnuityRequest.  # noqa: E501
        :rtype: str
        """
        return self._allocation_id

    @allocation_id.setter
    def allocation_id(self, allocation_id):
        """Sets the allocation_id of this VariableAnnuityRequest.


        :param allocation_id: The allocation_id of this VariableAnnuityRequest.  # noqa: E501
        :type: str
        """

        self._allocation_id = allocation_id

    @property
    def portfolio_weights(self):
        """Gets the portfolio_weights of this VariableAnnuityRequest.  # noqa: E501


        :return: The portfolio_weights of this VariableAnnuityRequest.  # noqa: E501
        :rtype: list[float]
        """
        return self._portfolio_weights

    @portfolio_weights.setter
    def portfolio_weights(self, portfolio_weights):
        """Sets the portfolio_weights of this VariableAnnuityRequest.


        :param portfolio_weights: The portfolio_weights of this VariableAnnuityRequest.  # noqa: E501
        :type: list[float]
        """

        self._portfolio_weights = portfolio_weights

    @property
    def end_date(self):
        """Gets the end_date of this VariableAnnuityRequest.  # noqa: E501


        :return: The end_date of this VariableAnnuityRequest.  # noqa: E501
        :rtype: str
        """
        return self._end_date

    @end_date.setter
    def end_date(self, end_date):
        """Sets the end_date of this VariableAnnuityRequest.


        :param end_date: The end_date of this VariableAnnuityRequest.  # noqa: E501
        :type: str
        """

        self._end_date = end_date

    @property
    def n(self):
        """Gets the n of this VariableAnnuityRequest.  # noqa: E501


        :return: The n of this VariableAnnuityRequest.  # noqa: E501
        :rtype: int
        """
        return self._n

    @n.setter
    def n(self, n):
        """Sets the n of this VariableAnnuityRequest.


        :param n: The n of this VariableAnnuityRequest.  # noqa: E501
        :type: int
        """
        if n is not None and n < 1:  # noqa: E501
            raise ValueError("Invalid value for `n`, must be a value greater than or equal to `1`")  # noqa: E501

        self._n = n

    @property
    def account_id(self):
        """Gets the account_id of this VariableAnnuityRequest.  # noqa: E501


        :return: The account_id of this VariableAnnuityRequest.  # noqa: E501
        :rtype: str
        """
        return self._account_id

    @account_id.setter
    def account_id(self, account_id):
        """Sets the account_id of this VariableAnnuityRequest.


        :param account_id: The account_id of this VariableAnnuityRequest.  # noqa: E501
        :type: str
        """

        self._account_id = account_id

    @property
    def portfolio_tickers(self):
        """Gets the portfolio_tickers of this VariableAnnuityRequest.  # noqa: E501


        :return: The portfolio_tickers of this VariableAnnuityRequest.  # noqa: E501
        :rtype: list[str]
        """
        return self._portfolio_tickers

    @portfolio_tickers.setter
    def portfolio_tickers(self, portfolio_tickers):
        """Sets the portfolio_tickers of this VariableAnnuityRequest.


        :param portfolio_tickers: The portfolio_tickers of this VariableAnnuityRequest.  # noqa: E501
        :type: list[str]
        """

        self._portfolio_tickers = portfolio_tickers

    @property
    def initial_balance(self):
        """Gets the initial_balance of this VariableAnnuityRequest.  # noqa: E501


        :return: The initial_balance of this VariableAnnuityRequest.  # noqa: E501
        :rtype: float
        """
        return self._initial_balance

    @initial_balance.setter
    def initial_balance(self, initial_balance):
        """Sets the initial_balance of this VariableAnnuityRequest.


        :param initial_balance: The initial_balance of this VariableAnnuityRequest.  # noqa: E501
        :type: float
        """
        if initial_balance is not None and initial_balance < 0:  # noqa: E501
            raise ValueError("Invalid value for `initial_balance`, must be a value greater than or equal to `0`")  # noqa: E501

        self._initial_balance = initial_balance

    @property
    def remove_outliers(self):
        """Gets the remove_outliers of this VariableAnnuityRequest.  # noqa: E501


        :return: The remove_outliers of this VariableAnnuityRequest.  # noqa: E501
        :rtype: bool
        """
        return self._remove_outliers

    @remove_outliers.setter
    def remove_outliers(self, remove_outliers):
        """Sets the remove_outliers of this VariableAnnuityRequest.


        :param remove_outliers: The remove_outliers of this VariableAnnuityRequest.  # noqa: E501
        :type: bool
        """

        self._remove_outliers = remove_outliers

    @property
    def model_id(self):
        """Gets the model_id of this VariableAnnuityRequest.  # noqa: E501


        :return: The model_id of this VariableAnnuityRequest.  # noqa: E501
        :rtype: str
        """
        return self._model_id

    @model_id.setter
    def model_id(self, model_id):
        """Sets the model_id of this VariableAnnuityRequest.


        :param model_id: The model_id of this VariableAnnuityRequest.  # noqa: E501
        :type: str
        """

        self._model_id = model_id

    @property
    def guaranteed_rate_benefit(self):
        """Gets the guaranteed_rate_benefit of this VariableAnnuityRequest.  # noqa: E501


        :return: The guaranteed_rate_benefit of this VariableAnnuityRequest.  # noqa: E501
        :rtype: list[GuaranteedRateBenefit]
        """
        return self._guaranteed_rate_benefit

    @guaranteed_rate_benefit.setter
    def guaranteed_rate_benefit(self, guaranteed_rate_benefit):
        """Sets the guaranteed_rate_benefit of this VariableAnnuityRequest.


        :param guaranteed_rate_benefit: The guaranteed_rate_benefit of this VariableAnnuityRequest.  # noqa: E501
        :type: list[GuaranteedRateBenefit]
        """

        self._guaranteed_rate_benefit = guaranteed_rate_benefit

    @property
    def deposit_schedule(self):
        """Gets the deposit_schedule of this VariableAnnuityRequest.  # noqa: E501


        :return: The deposit_schedule of this VariableAnnuityRequest.  # noqa: E501
        :rtype: AnnuityDepositSchedule
        """
        return self._deposit_schedule

    @deposit_schedule.setter
    def deposit_schedule(self, deposit_schedule):
        """Sets the deposit_schedule of this VariableAnnuityRequest.


        :param deposit_schedule: The deposit_schedule of this VariableAnnuityRequest.  # noqa: E501
        :type: AnnuityDepositSchedule
        """

        self._deposit_schedule = deposit_schedule

    @property
    def use_proxy_data(self):
        """Gets the use_proxy_data of this VariableAnnuityRequest.  # noqa: E501


        :return: The use_proxy_data of this VariableAnnuityRequest.  # noqa: E501
        :rtype: bool
        """
        return self._use_proxy_data

    @use_proxy_data.setter
    def use_proxy_data(self, use_proxy_data):
        """Sets the use_proxy_data of this VariableAnnuityRequest.


        :param use_proxy_data: The use_proxy_data of this VariableAnnuityRequest.  # noqa: E501
        :type: bool
        """

        self._use_proxy_data = use_proxy_data

    @property
    def accumulation_horizon(self):
        """Gets the accumulation_horizon of this VariableAnnuityRequest.  # noqa: E501


        :return: The accumulation_horizon of this VariableAnnuityRequest.  # noqa: E501
        :rtype: int
        """
        return self._accumulation_horizon

    @accumulation_horizon.setter
    def accumulation_horizon(self, accumulation_horizon):
        """Sets the accumulation_horizon of this VariableAnnuityRequest.


        :param accumulation_horizon: The accumulation_horizon of this VariableAnnuityRequest.  # noqa: E501
        :type: int
        """
        if accumulation_horizon is None:
            raise ValueError("Invalid value for `accumulation_horizon`, must not be `None`")  # noqa: E501
        if accumulation_horizon is not None and accumulation_horizon < 0:  # noqa: E501
            raise ValueError("Invalid value for `accumulation_horizon`, must be a value greater than or equal to `0`")  # noqa: E501

        self._accumulation_horizon = accumulation_horizon

    @property
    def inflation_rate(self):
        """Gets the inflation_rate of this VariableAnnuityRequest.  # noqa: E501


        :return: The inflation_rate of this VariableAnnuityRequest.  # noqa: E501
        :rtype: float
        """
        return self._inflation_rate

    @inflation_rate.setter
    def inflation_rate(self, inflation_rate):
        """Sets the inflation_rate of this VariableAnnuityRequest.


        :param inflation_rate: The inflation_rate of this VariableAnnuityRequest.  # noqa: E501
        :type: float
        """
        if inflation_rate is not None and inflation_rate > 20:  # noqa: E501
            raise ValueError("Invalid value for `inflation_rate`, must be a value less than or equal to `20`")  # noqa: E501
        if inflation_rate is not None and inflation_rate < -1:  # noqa: E501
            raise ValueError("Invalid value for `inflation_rate`, must be a value greater than or equal to `-1`")  # noqa: E501

        self._inflation_rate = inflation_rate

    @property
    def annuitization_rate(self):
        """Gets the annuitization_rate of this VariableAnnuityRequest.  # noqa: E501


        :return: The annuitization_rate of this VariableAnnuityRequest.  # noqa: E501
        :rtype: float
        """
        return self._annuitization_rate

    @annuitization_rate.setter
    def annuitization_rate(self, annuitization_rate):
        """Sets the annuitization_rate of this VariableAnnuityRequest.


        :param annuitization_rate: The annuitization_rate of this VariableAnnuityRequest.  # noqa: E501
        :type: float
        """
        if annuitization_rate is not None and annuitization_rate < -1:  # noqa: E501
            raise ValueError("Invalid value for `annuitization_rate`, must be a value greater than or equal to `-1`")  # noqa: E501

        self._annuitization_rate = annuitization_rate

    @property
    def result_type(self):
        """Gets the result_type of this VariableAnnuityRequest.  # noqa: E501


        :return: The result_type of this VariableAnnuityRequest.  # noqa: E501
        :rtype: str
        """
        return self._result_type

    @result_type.setter
    def result_type(self, result_type):
        """Sets the result_type of this VariableAnnuityRequest.


        :param result_type: The result_type of this VariableAnnuityRequest.  # noqa: E501
        :type: str
        """
        allowed_values = ["mean", "median", "custom"]  # noqa: E501
        if result_type not in allowed_values:
            raise ValueError(
                "Invalid value for `result_type` ({0}), must be one of {1}"  # noqa: E501
                .format(result_type, allowed_values)
            )

        self._result_type = result_type

    @property
    def start_date(self):
        """Gets the start_date of this VariableAnnuityRequest.  # noqa: E501


        :return: The start_date of this VariableAnnuityRequest.  # noqa: E501
        :rtype: str
        """
        return self._start_date

    @start_date.setter
    def start_date(self, start_date):
        """Sets the start_date of this VariableAnnuityRequest.


        :param start_date: The start_date of this VariableAnnuityRequest.  # noqa: E501
        :type: str
        """

        self._start_date = start_date

    @property
    def portfolio_id(self):
        """Gets the portfolio_id of this VariableAnnuityRequest.  # noqa: E501


        :return: The portfolio_id of this VariableAnnuityRequest.  # noqa: E501
        :rtype: str
        """
        return self._portfolio_id

    @portfolio_id.setter
    def portfolio_id(self, portfolio_id):
        """Sets the portfolio_id of this VariableAnnuityRequest.


        :param portfolio_id: The portfolio_id of this VariableAnnuityRequest.  # noqa: E501
        :type: str
        """

        self._portfolio_id = portfolio_id

    @property
    def market_data_source(self):
        """Gets the market_data_source of this VariableAnnuityRequest.  # noqa: E501


        :return: The market_data_source of this VariableAnnuityRequest.  # noqa: E501
        :rtype: str
        """
        return self._market_data_source

    @market_data_source.setter
    def market_data_source(self, market_data_source):
        """Sets the market_data_source of this VariableAnnuityRequest.


        :param market_data_source: The market_data_source of this VariableAnnuityRequest.  # noqa: E501
        :type: str
        """
        allowed_values = ["nucleus", "integration"]  # noqa: E501
        if market_data_source not in allowed_values:
            raise ValueError(
                "Invalid value for `market_data_source` ({0}), must be one of {1}"  # noqa: E501
                .format(market_data_source, allowed_values)
            )

        self._market_data_source = market_data_source

    @property
    def trading_days_per_year(self):
        """Gets the trading_days_per_year of this VariableAnnuityRequest.  # noqa: E501


        :return: The trading_days_per_year of this VariableAnnuityRequest.  # noqa: E501
        :rtype: int
        """
        return self._trading_days_per_year

    @trading_days_per_year.setter
    def trading_days_per_year(self, trading_days_per_year):
        """Sets the trading_days_per_year of this VariableAnnuityRequest.


        :param trading_days_per_year: The trading_days_per_year of this VariableAnnuityRequest.  # noqa: E501
        :type: int
        """
        if trading_days_per_year is not None and trading_days_per_year < 1:  # noqa: E501
            raise ValueError("Invalid value for `trading_days_per_year`, must be a value greater than or equal to `1`")  # noqa: E501

        self._trading_days_per_year = trading_days_per_year

    @property
    def frequency_interval(self):
        """Gets the frequency_interval of this VariableAnnuityRequest.  # noqa: E501


        :return: The frequency_interval of this VariableAnnuityRequest.  # noqa: E501
        :rtype: str
        """
        return self._frequency_interval

    @frequency_interval.setter
    def frequency_interval(self, frequency_interval):
        """Sets the frequency_interval of this VariableAnnuityRequest.


        :param frequency_interval: The frequency_interval of this VariableAnnuityRequest.  # noqa: E501
        :type: str
        """
        allowed_values = ["year", "quarter", "month", "week", "day"]  # noqa: E501
        if frequency_interval not in allowed_values:
            raise ValueError(
                "Invalid value for `frequency_interval` ({0}), must be one of {1}"  # noqa: E501
                .format(frequency_interval, allowed_values)
            )

        self._frequency_interval = frequency_interval

    @property
    def create_log(self):
        """Gets the create_log of this VariableAnnuityRequest.  # noqa: E501


        :return: The create_log of this VariableAnnuityRequest.  # noqa: E501
        :rtype: bool
        """
        return self._create_log

    @create_log.setter
    def create_log(self, create_log):
        """Sets the create_log of this VariableAnnuityRequest.


        :param create_log: The create_log of this VariableAnnuityRequest.  # noqa: E501
        :type: bool
        """

        self._create_log = create_log

    @property
    def decumulation_horizon(self):
        """Gets the decumulation_horizon of this VariableAnnuityRequest.  # noqa: E501


        :return: The decumulation_horizon of this VariableAnnuityRequest.  # noqa: E501
        :rtype: int
        """
        return self._decumulation_horizon

    @decumulation_horizon.setter
    def decumulation_horizon(self, decumulation_horizon):
        """Sets the decumulation_horizon of this VariableAnnuityRequest.


        :param decumulation_horizon: The decumulation_horizon of this VariableAnnuityRequest.  # noqa: E501
        :type: int
        """
        if decumulation_horizon is None:
            raise ValueError("Invalid value for `decumulation_horizon`, must not be `None`")  # noqa: E501
        if decumulation_horizon is not None and decumulation_horizon < 1:  # noqa: E501
            raise ValueError("Invalid value for `decumulation_horizon`, must be a value greater than or equal to `1`")  # noqa: E501

        self._decumulation_horizon = decumulation_horizon

    @property
    def tax_rate(self):
        """Gets the tax_rate of this VariableAnnuityRequest.  # noqa: E501


        :return: The tax_rate of this VariableAnnuityRequest.  # noqa: E501
        :rtype: float
        """
        return self._tax_rate

    @tax_rate.setter
    def tax_rate(self, tax_rate):
        """Sets the tax_rate of this VariableAnnuityRequest.


        :param tax_rate: The tax_rate of this VariableAnnuityRequest.  # noqa: E501
        :type: float
        """
        if tax_rate is not None and tax_rate > 1:  # noqa: E501
            raise ValueError("Invalid value for `tax_rate`, must be a value less than or equal to `1`")  # noqa: E501
        if tax_rate is not None and tax_rate < 0:  # noqa: E501
            raise ValueError("Invalid value for `tax_rate`, must be a value greater than or equal to `0`")  # noqa: E501

        self._tax_rate = tax_rate

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
        if issubclass(VariableAnnuityRequest, dict):
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
        if not isinstance(other, VariableAnnuityRequest):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
