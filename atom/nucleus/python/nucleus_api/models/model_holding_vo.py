# coding: utf-8

"""
    Hydrogen Nucleus API

    The Hydrogen Nucleus API  # noqa: E501

    OpenAPI spec version: 1.9.4
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from nucleus_api.configuration import Configuration


class ModelHoldingVO(object):
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
        'current_weight': 'float',
        '_date': 'date',
        'security_id': 'str',
        'strategic_weight': 'float'
    }

    attribute_map = {
        'current_weight': 'current_weight',
        '_date': 'date',
        'security_id': 'security_id',
        'strategic_weight': 'strategic_weight'
    }

    def __init__(self, current_weight=None, _date=None, security_id=None, strategic_weight=None, _configuration=None):  # noqa: E501
        """ModelHoldingVO - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._current_weight = None
        self.__date = None
        self._security_id = None
        self._strategic_weight = None
        self.discriminator = None

        if current_weight is not None:
            self.current_weight = current_weight
        if _date is not None:
            self._date = _date
        if security_id is not None:
            self.security_id = security_id
        if strategic_weight is not None:
            self.strategic_weight = strategic_weight

    @property
    def current_weight(self):
        """Gets the current_weight of this ModelHoldingVO.  # noqa: E501


        :return: The current_weight of this ModelHoldingVO.  # noqa: E501
        :rtype: float
        """
        return self._current_weight

    @current_weight.setter
    def current_weight(self, current_weight):
        """Sets the current_weight of this ModelHoldingVO.


        :param current_weight: The current_weight of this ModelHoldingVO.  # noqa: E501
        :type: float
        """

        self._current_weight = current_weight

    @property
    def _date(self):
        """Gets the _date of this ModelHoldingVO.  # noqa: E501


        :return: The _date of this ModelHoldingVO.  # noqa: E501
        :rtype: date
        """
        return self.__date

    @_date.setter
    def _date(self, _date):
        """Sets the _date of this ModelHoldingVO.


        :param _date: The _date of this ModelHoldingVO.  # noqa: E501
        :type: date
        """

        self.__date = _date

    @property
    def security_id(self):
        """Gets the security_id of this ModelHoldingVO.  # noqa: E501


        :return: The security_id of this ModelHoldingVO.  # noqa: E501
        :rtype: str
        """
        return self._security_id

    @security_id.setter
    def security_id(self, security_id):
        """Sets the security_id of this ModelHoldingVO.


        :param security_id: The security_id of this ModelHoldingVO.  # noqa: E501
        :type: str
        """

        self._security_id = security_id

    @property
    def strategic_weight(self):
        """Gets the strategic_weight of this ModelHoldingVO.  # noqa: E501


        :return: The strategic_weight of this ModelHoldingVO.  # noqa: E501
        :rtype: float
        """
        return self._strategic_weight

    @strategic_weight.setter
    def strategic_weight(self, strategic_weight):
        """Sets the strategic_weight of this ModelHoldingVO.


        :param strategic_weight: The strategic_weight of this ModelHoldingVO.  # noqa: E501
        :type: float
        """

        self._strategic_weight = strategic_weight

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
        if issubclass(ModelHoldingVO, dict):
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
        if not isinstance(other, ModelHoldingVO):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, ModelHoldingVO):
            return True

        return self.to_dict() != other.to_dict()
