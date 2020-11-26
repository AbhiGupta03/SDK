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


class CashAnalysisRequest(object):
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
        'scope': 'str',
        'show_outflow_details': 'bool',
        'show_history': 'bool',
        'client_id': 'str',
        'show_inflow_details': 'bool',
        'currency_conversion': 'str',
        'end_date': 'date',
        'currency_code': 'str',
        'start_date': 'date',
        'history_frequency_interval': 'str'
    }

    attribute_map = {
        'scope': 'scope',
        'show_outflow_details': 'show_outflow_details',
        'show_history': 'show_history',
        'client_id': 'client_id',
        'show_inflow_details': 'show_inflow_details',
        'currency_conversion': 'currency_conversion',
        'end_date': 'end_date',
        'currency_code': 'currency_code',
        'start_date': 'start_date',
        'history_frequency_interval': 'history_frequency_interval'
    }

    def __init__(self, scope='all', show_outflow_details=False, show_history=False, client_id=None, show_inflow_details=False, currency_conversion=None, end_date=None, currency_code=None, start_date=None, history_frequency_interval='month'):  # noqa: E501
        """CashAnalysisRequest - a model defined in Swagger"""  # noqa: E501

        self._scope = None
        self._show_outflow_details = None
        self._show_history = None
        self._client_id = None
        self._show_inflow_details = None
        self._currency_conversion = None
        self._end_date = None
        self._currency_code = None
        self._start_date = None
        self._history_frequency_interval = None
        self.discriminator = None

        if scope is not None:
            self.scope = scope
        if show_outflow_details is not None:
            self.show_outflow_details = show_outflow_details
        if show_history is not None:
            self.show_history = show_history
        if client_id is not None:
            self.client_id = client_id
        if show_inflow_details is not None:
            self.show_inflow_details = show_inflow_details
        if currency_conversion is not None:
            self.currency_conversion = currency_conversion
        if end_date is not None:
            self.end_date = end_date
        if currency_code is not None:
            self.currency_code = currency_code
        if start_date is not None:
            self.start_date = start_date
        if history_frequency_interval is not None:
            self.history_frequency_interval = history_frequency_interval

    @property
    def scope(self):
        """Gets the scope of this CashAnalysisRequest.  # noqa: E501


        :return: The scope of this CashAnalysisRequest.  # noqa: E501
        :rtype: str
        """
        return self._scope

    @scope.setter
    def scope(self, scope):
        """Sets the scope of this CashAnalysisRequest.


        :param scope: The scope of this CashAnalysisRequest.  # noqa: E501
        :type: str
        """
        allowed_values = ["all", "external", "internal"]  # noqa: E501
        if scope not in allowed_values:
            raise ValueError(
                "Invalid value for `scope` ({0}), must be one of {1}"  # noqa: E501
                .format(scope, allowed_values)
            )

        self._scope = scope

    @property
    def show_outflow_details(self):
        """Gets the show_outflow_details of this CashAnalysisRequest.  # noqa: E501


        :return: The show_outflow_details of this CashAnalysisRequest.  # noqa: E501
        :rtype: bool
        """
        return self._show_outflow_details

    @show_outflow_details.setter
    def show_outflow_details(self, show_outflow_details):
        """Sets the show_outflow_details of this CashAnalysisRequest.


        :param show_outflow_details: The show_outflow_details of this CashAnalysisRequest.  # noqa: E501
        :type: bool
        """

        self._show_outflow_details = show_outflow_details

    @property
    def show_history(self):
        """Gets the show_history of this CashAnalysisRequest.  # noqa: E501


        :return: The show_history of this CashAnalysisRequest.  # noqa: E501
        :rtype: bool
        """
        return self._show_history

    @show_history.setter
    def show_history(self, show_history):
        """Sets the show_history of this CashAnalysisRequest.


        :param show_history: The show_history of this CashAnalysisRequest.  # noqa: E501
        :type: bool
        """

        self._show_history = show_history

    @property
    def client_id(self):
        """Gets the client_id of this CashAnalysisRequest.  # noqa: E501


        :return: The client_id of this CashAnalysisRequest.  # noqa: E501
        :rtype: str
        """
        return self._client_id

    @client_id.setter
    def client_id(self, client_id):
        """Sets the client_id of this CashAnalysisRequest.


        :param client_id: The client_id of this CashAnalysisRequest.  # noqa: E501
        :type: str
        """

        self._client_id = client_id

    @property
    def show_inflow_details(self):
        """Gets the show_inflow_details of this CashAnalysisRequest.  # noqa: E501


        :return: The show_inflow_details of this CashAnalysisRequest.  # noqa: E501
        :rtype: bool
        """
        return self._show_inflow_details

    @show_inflow_details.setter
    def show_inflow_details(self, show_inflow_details):
        """Sets the show_inflow_details of this CashAnalysisRequest.


        :param show_inflow_details: The show_inflow_details of this CashAnalysisRequest.  # noqa: E501
        :type: bool
        """

        self._show_inflow_details = show_inflow_details

    @property
    def currency_conversion(self):
        """Gets the currency_conversion of this CashAnalysisRequest.  # noqa: E501


        :return: The currency_conversion of this CashAnalysisRequest.  # noqa: E501
        :rtype: str
        """
        return self._currency_conversion

    @currency_conversion.setter
    def currency_conversion(self, currency_conversion):
        """Sets the currency_conversion of this CashAnalysisRequest.


        :param currency_conversion: The currency_conversion of this CashAnalysisRequest.  # noqa: E501
        :type: str
        """

        self._currency_conversion = currency_conversion

    @property
    def end_date(self):
        """Gets the end_date of this CashAnalysisRequest.  # noqa: E501


        :return: The end_date of this CashAnalysisRequest.  # noqa: E501
        :rtype: date
        """
        return self._end_date

    @end_date.setter
    def end_date(self, end_date):
        """Sets the end_date of this CashAnalysisRequest.


        :param end_date: The end_date of this CashAnalysisRequest.  # noqa: E501
        :type: date
        """

        self._end_date = end_date

    @property
    def currency_code(self):
        """Gets the currency_code of this CashAnalysisRequest.  # noqa: E501


        :return: The currency_code of this CashAnalysisRequest.  # noqa: E501
        :rtype: str
        """
        return self._currency_code

    @currency_code.setter
    def currency_code(self, currency_code):
        """Sets the currency_code of this CashAnalysisRequest.


        :param currency_code: The currency_code of this CashAnalysisRequest.  # noqa: E501
        :type: str
        """

        self._currency_code = currency_code

    @property
    def start_date(self):
        """Gets the start_date of this CashAnalysisRequest.  # noqa: E501


        :return: The start_date of this CashAnalysisRequest.  # noqa: E501
        :rtype: date
        """
        return self._start_date

    @start_date.setter
    def start_date(self, start_date):
        """Sets the start_date of this CashAnalysisRequest.


        :param start_date: The start_date of this CashAnalysisRequest.  # noqa: E501
        :type: date
        """

        self._start_date = start_date

    @property
    def history_frequency_interval(self):
        """Gets the history_frequency_interval of this CashAnalysisRequest.  # noqa: E501


        :return: The history_frequency_interval of this CashAnalysisRequest.  # noqa: E501
        :rtype: str
        """
        return self._history_frequency_interval

    @history_frequency_interval.setter
    def history_frequency_interval(self, history_frequency_interval):
        """Sets the history_frequency_interval of this CashAnalysisRequest.


        :param history_frequency_interval: The history_frequency_interval of this CashAnalysisRequest.  # noqa: E501
        :type: str
        """
        allowed_values = ["day", "week", "month", "quarter", "year"]  # noqa: E501
        if history_frequency_interval not in allowed_values:
            raise ValueError(
                "Invalid value for `history_frequency_interval` ({0}), must be one of {1}"  # noqa: E501
                .format(history_frequency_interval, allowed_values)
            )

        self._history_frequency_interval = history_frequency_interval

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
        if issubclass(CashAnalysisRequest, dict):
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
        if not isinstance(other, CashAnalysisRequest):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
