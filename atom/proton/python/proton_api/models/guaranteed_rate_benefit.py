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


class GuaranteedRateBenefit(object):
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
        'max_rate': 'float',
        'end_period': 'int',
        'min_rate': 'float',
        'start_period': 'int'
    }

    attribute_map = {
        'max_rate': 'max_rate',
        'end_period': 'end_period',
        'min_rate': 'min_rate',
        'start_period': 'start_period'
    }

    def __init__(self, max_rate=None, end_period=None, min_rate=0.0, start_period=1):  # noqa: E501
        """GuaranteedRateBenefit - a model defined in Swagger"""  # noqa: E501

        self._max_rate = None
        self._end_period = None
        self._min_rate = None
        self._start_period = None
        self.discriminator = None

        if max_rate is not None:
            self.max_rate = max_rate
        if end_period is not None:
            self.end_period = end_period
        if min_rate is not None:
            self.min_rate = min_rate
        if start_period is not None:
            self.start_period = start_period

    @property
    def max_rate(self):
        """Gets the max_rate of this GuaranteedRateBenefit.  # noqa: E501


        :return: The max_rate of this GuaranteedRateBenefit.  # noqa: E501
        :rtype: float
        """
        return self._max_rate

    @max_rate.setter
    def max_rate(self, max_rate):
        """Sets the max_rate of this GuaranteedRateBenefit.


        :param max_rate: The max_rate of this GuaranteedRateBenefit.  # noqa: E501
        :type: float
        """
        if max_rate is not None and max_rate < -1:  # noqa: E501
            raise ValueError("Invalid value for `max_rate`, must be a value greater than or equal to `-1`")  # noqa: E501

        self._max_rate = max_rate

    @property
    def end_period(self):
        """Gets the end_period of this GuaranteedRateBenefit.  # noqa: E501


        :return: The end_period of this GuaranteedRateBenefit.  # noqa: E501
        :rtype: int
        """
        return self._end_period

    @end_period.setter
    def end_period(self, end_period):
        """Sets the end_period of this GuaranteedRateBenefit.


        :param end_period: The end_period of this GuaranteedRateBenefit.  # noqa: E501
        :type: int
        """
        if end_period is not None and end_period < 1:  # noqa: E501
            raise ValueError("Invalid value for `end_period`, must be a value greater than or equal to `1`")  # noqa: E501

        self._end_period = end_period

    @property
    def min_rate(self):
        """Gets the min_rate of this GuaranteedRateBenefit.  # noqa: E501


        :return: The min_rate of this GuaranteedRateBenefit.  # noqa: E501
        :rtype: float
        """
        return self._min_rate

    @min_rate.setter
    def min_rate(self, min_rate):
        """Sets the min_rate of this GuaranteedRateBenefit.


        :param min_rate: The min_rate of this GuaranteedRateBenefit.  # noqa: E501
        :type: float
        """
        if min_rate is not None and min_rate < -1:  # noqa: E501
            raise ValueError("Invalid value for `min_rate`, must be a value greater than or equal to `-1`")  # noqa: E501

        self._min_rate = min_rate

    @property
    def start_period(self):
        """Gets the start_period of this GuaranteedRateBenefit.  # noqa: E501


        :return: The start_period of this GuaranteedRateBenefit.  # noqa: E501
        :rtype: int
        """
        return self._start_period

    @start_period.setter
    def start_period(self, start_period):
        """Sets the start_period of this GuaranteedRateBenefit.


        :param start_period: The start_period of this GuaranteedRateBenefit.  # noqa: E501
        :type: int
        """
        if start_period is not None and start_period < 1:  # noqa: E501
            raise ValueError("Invalid value for `start_period`, must be a value greater than or equal to `1`")  # noqa: E501

        self._start_period = start_period

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
        if issubclass(GuaranteedRateBenefit, dict):
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
        if not isinstance(other, GuaranteedRateBenefit):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
