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


class GoalConfig(object):
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
        'goal_amount': 'float',
        'goal_inflation': 'float'
    }

    attribute_map = {
        'goal_amount': 'goal_amount',
        'goal_inflation': 'goal_inflation'
    }

    def __init__(self, goal_amount=None, goal_inflation=0.0):  # noqa: E501
        """GoalConfig - a model defined in Swagger"""  # noqa: E501

        self._goal_amount = None
        self._goal_inflation = None
        self.discriminator = None

        if goal_amount is not None:
            self.goal_amount = goal_amount
        if goal_inflation is not None:
            self.goal_inflation = goal_inflation

    @property
    def goal_amount(self):
        """Gets the goal_amount of this GoalConfig.  # noqa: E501


        :return: The goal_amount of this GoalConfig.  # noqa: E501
        :rtype: float
        """
        return self._goal_amount

    @goal_amount.setter
    def goal_amount(self, goal_amount):
        """Sets the goal_amount of this GoalConfig.


        :param goal_amount: The goal_amount of this GoalConfig.  # noqa: E501
        :type: float
        """
        if goal_amount is not None and goal_amount < 0:  # noqa: E501
            raise ValueError("Invalid value for `goal_amount`, must be a value greater than or equal to `0`")  # noqa: E501

        self._goal_amount = goal_amount

    @property
    def goal_inflation(self):
        """Gets the goal_inflation of this GoalConfig.  # noqa: E501


        :return: The goal_inflation of this GoalConfig.  # noqa: E501
        :rtype: float
        """
        return self._goal_inflation

    @goal_inflation.setter
    def goal_inflation(self, goal_inflation):
        """Sets the goal_inflation of this GoalConfig.


        :param goal_inflation: The goal_inflation of this GoalConfig.  # noqa: E501
        :type: float
        """
        if goal_inflation is not None and goal_inflation < -1:  # noqa: E501
            raise ValueError("Invalid value for `goal_inflation`, must be a value greater than or equal to `-1`")  # noqa: E501

        self._goal_inflation = goal_inflation

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
        if issubclass(GoalConfig, dict):
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
        if not isinstance(other, GoalConfig):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
