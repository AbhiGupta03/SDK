# coding: utf-8

"""
    Hydrogen Integration API

    The Hydrogen Integration API  # noqa: E501

    OpenAPI spec version: 1.3.1
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from integration_api.configuration import Configuration


class WidgetUrlVO(object):
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
        'vendor_name': 'str',
        'widget_url': 'str'
    }

    attribute_map = {
        'vendor_name': 'vendor_name',
        'widget_url': 'widget_url'
    }

    def __init__(self, vendor_name=None, widget_url=None, _configuration=None):  # noqa: E501
        """WidgetUrlVO - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._vendor_name = None
        self._widget_url = None
        self.discriminator = None

        if vendor_name is not None:
            self.vendor_name = vendor_name
        if widget_url is not None:
            self.widget_url = widget_url

    @property
    def vendor_name(self):
        """Gets the vendor_name of this WidgetUrlVO.  # noqa: E501


        :return: The vendor_name of this WidgetUrlVO.  # noqa: E501
        :rtype: str
        """
        return self._vendor_name

    @vendor_name.setter
    def vendor_name(self, vendor_name):
        """Sets the vendor_name of this WidgetUrlVO.


        :param vendor_name: The vendor_name of this WidgetUrlVO.  # noqa: E501
        :type: str
        """

        self._vendor_name = vendor_name

    @property
    def widget_url(self):
        """Gets the widget_url of this WidgetUrlVO.  # noqa: E501


        :return: The widget_url of this WidgetUrlVO.  # noqa: E501
        :rtype: str
        """
        return self._widget_url

    @widget_url.setter
    def widget_url(self, widget_url):
        """Sets the widget_url of this WidgetUrlVO.


        :param widget_url: The widget_url of this WidgetUrlVO.  # noqa: E501
        :type: str
        """

        self._widget_url = widget_url

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
        if issubclass(WidgetUrlVO, dict):
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
        if not isinstance(other, WidgetUrlVO):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, WidgetUrlVO):
            return True

        return self.to_dict() != other.to_dict()
