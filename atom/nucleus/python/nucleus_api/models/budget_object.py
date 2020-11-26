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


class BudgetObject(object):
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
        'category': 'str',
        'subcategory': 'str',
        'value': 'float'
    }

    attribute_map = {
        'category': 'category',
        'subcategory': 'subcategory',
        'value': 'value'
    }

    def __init__(self, category=None, subcategory=None, value=None):  # noqa: E501
        """BudgetObject - a model defined in Swagger"""  # noqa: E501

        self._category = None
        self._subcategory = None
        self._value = None
        self.discriminator = None

        self.category = category
        if subcategory is not None:
            self.subcategory = subcategory
        self.value = value

    @property
    def category(self):
        """Gets the category of this BudgetObject.  # noqa: E501

        category  # noqa: E501

        :return: The category of this BudgetObject.  # noqa: E501
        :rtype: str
        """
        return self._category

    @category.setter
    def category(self, category):
        """Sets the category of this BudgetObject.

        category  # noqa: E501

        :param category: The category of this BudgetObject.  # noqa: E501
        :type: str
        """
        if category is None:
            raise ValueError("Invalid value for `category`, must not be `None`")  # noqa: E501

        self._category = category

    @property
    def subcategory(self):
        """Gets the subcategory of this BudgetObject.  # noqa: E501

        subcategory  # noqa: E501

        :return: The subcategory of this BudgetObject.  # noqa: E501
        :rtype: str
        """
        return self._subcategory

    @subcategory.setter
    def subcategory(self, subcategory):
        """Sets the subcategory of this BudgetObject.

        subcategory  # noqa: E501

        :param subcategory: The subcategory of this BudgetObject.  # noqa: E501
        :type: str
        """

        self._subcategory = subcategory

    @property
    def value(self):
        """Gets the value of this BudgetObject.  # noqa: E501

        value  # noqa: E501

        :return: The value of this BudgetObject.  # noqa: E501
        :rtype: float
        """
        return self._value

    @value.setter
    def value(self, value):
        """Sets the value of this BudgetObject.

        value  # noqa: E501

        :param value: The value of this BudgetObject.  # noqa: E501
        :type: float
        """
        if value is None:
            raise ValueError("Invalid value for `value`, must not be `None`")  # noqa: E501

        self._value = value

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
        if issubclass(BudgetObject, dict):
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
        if not isinstance(other, BudgetObject):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
