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


class FAQKeyword(object):
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
        'keyword': 'str',
        'priority': 'int'
    }

    attribute_map = {
        'keyword': 'keyword',
        'priority': 'priority'
    }

    def __init__(self, keyword=None, priority=None):  # noqa: E501
        """FAQKeyword - a model defined in Swagger"""  # noqa: E501

        self._keyword = None
        self._priority = None
        self.discriminator = None

        self.keyword = keyword
        self.priority = priority

    @property
    def keyword(self):
        """Gets the keyword of this FAQKeyword.  # noqa: E501

        keyword  # noqa: E501

        :return: The keyword of this FAQKeyword.  # noqa: E501
        :rtype: str
        """
        return self._keyword

    @keyword.setter
    def keyword(self, keyword):
        """Sets the keyword of this FAQKeyword.

        keyword  # noqa: E501

        :param keyword: The keyword of this FAQKeyword.  # noqa: E501
        :type: str
        """
        if keyword is None:
            raise ValueError("Invalid value for `keyword`, must not be `None`")  # noqa: E501

        self._keyword = keyword

    @property
    def priority(self):
        """Gets the priority of this FAQKeyword.  # noqa: E501

        priority  # noqa: E501

        :return: The priority of this FAQKeyword.  # noqa: E501
        :rtype: int
        """
        return self._priority

    @priority.setter
    def priority(self, priority):
        """Sets the priority of this FAQKeyword.

        priority  # noqa: E501

        :param priority: The priority of this FAQKeyword.  # noqa: E501
        :type: int
        """
        if priority is None:
            raise ValueError("Invalid value for `priority`, must not be `None`")  # noqa: E501

        self._priority = priority

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
        if issubclass(FAQKeyword, dict):
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
        if not isinstance(other, FAQKeyword):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
