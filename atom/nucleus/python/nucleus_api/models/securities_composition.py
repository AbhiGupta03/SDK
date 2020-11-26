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


class SecuritiesComposition(object):
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
        'component_id': 'str',
        'end_date': 'date',
        'start_date': 'date',
        'weight': 'float'
    }

    attribute_map = {
        'component_id': 'component_id',
        'end_date': 'end_date',
        'start_date': 'start_date',
        'weight': 'weight'
    }

    def __init__(self, component_id=None, end_date=None, start_date=None, weight=None):  # noqa: E501
        """SecuritiesComposition - a model defined in Swagger"""  # noqa: E501

        self._component_id = None
        self._end_date = None
        self._start_date = None
        self._weight = None
        self.discriminator = None

        self.component_id = component_id
        self.end_date = end_date
        self.start_date = start_date
        self.weight = weight

    @property
    def component_id(self):
        """Gets the component_id of this SecuritiesComposition.  # noqa: E501

        Securities Composition component Id  # noqa: E501

        :return: The component_id of this SecuritiesComposition.  # noqa: E501
        :rtype: str
        """
        return self._component_id

    @component_id.setter
    def component_id(self, component_id):
        """Sets the component_id of this SecuritiesComposition.

        Securities Composition component Id  # noqa: E501

        :param component_id: The component_id of this SecuritiesComposition.  # noqa: E501
        :type: str
        """
        if component_id is None:
            raise ValueError("Invalid value for `component_id`, must not be `None`")  # noqa: E501

        self._component_id = component_id

    @property
    def end_date(self):
        """Gets the end_date of this SecuritiesComposition.  # noqa: E501

        Securities Composition End Date  # noqa: E501

        :return: The end_date of this SecuritiesComposition.  # noqa: E501
        :rtype: date
        """
        return self._end_date

    @end_date.setter
    def end_date(self, end_date):
        """Sets the end_date of this SecuritiesComposition.

        Securities Composition End Date  # noqa: E501

        :param end_date: The end_date of this SecuritiesComposition.  # noqa: E501
        :type: date
        """
        if end_date is None:
            raise ValueError("Invalid value for `end_date`, must not be `None`")  # noqa: E501

        self._end_date = end_date

    @property
    def start_date(self):
        """Gets the start_date of this SecuritiesComposition.  # noqa: E501

        Securities Composition Start Date  # noqa: E501

        :return: The start_date of this SecuritiesComposition.  # noqa: E501
        :rtype: date
        """
        return self._start_date

    @start_date.setter
    def start_date(self, start_date):
        """Sets the start_date of this SecuritiesComposition.

        Securities Composition Start Date  # noqa: E501

        :param start_date: The start_date of this SecuritiesComposition.  # noqa: E501
        :type: date
        """
        if start_date is None:
            raise ValueError("Invalid value for `start_date`, must not be `None`")  # noqa: E501

        self._start_date = start_date

    @property
    def weight(self):
        """Gets the weight of this SecuritiesComposition.  # noqa: E501

        Securities Composition weight  # noqa: E501

        :return: The weight of this SecuritiesComposition.  # noqa: E501
        :rtype: float
        """
        return self._weight

    @weight.setter
    def weight(self, weight):
        """Sets the weight of this SecuritiesComposition.

        Securities Composition weight  # noqa: E501

        :param weight: The weight of this SecuritiesComposition.  # noqa: E501
        :type: float
        """
        if weight is None:
            raise ValueError("Invalid value for `weight`, must not be `None`")  # noqa: E501

        self._weight = weight

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
        if issubclass(SecuritiesComposition, dict):
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
        if not isinstance(other, SecuritiesComposition):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
