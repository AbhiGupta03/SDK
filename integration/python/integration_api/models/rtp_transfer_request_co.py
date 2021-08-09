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


class RtpTransferRequestCO(object):
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
        'nucleus_funding_id': 'str',
        'vendor_request': 'object'
    }

    attribute_map = {
        'nucleus_funding_id': 'nucleus_funding_id',
        'vendor_request': 'vendor_request'
    }

    def __init__(self, nucleus_funding_id=None, vendor_request=None, _configuration=None):  # noqa: E501
        """RtpTransferRequestCO - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._nucleus_funding_id = None
        self._vendor_request = None
        self.discriminator = None

        if nucleus_funding_id is not None:
            self.nucleus_funding_id = nucleus_funding_id
        if vendor_request is not None:
            self.vendor_request = vendor_request

    @property
    def nucleus_funding_id(self):
        """Gets the nucleus_funding_id of this RtpTransferRequestCO.  # noqa: E501


        :return: The nucleus_funding_id of this RtpTransferRequestCO.  # noqa: E501
        :rtype: str
        """
        return self._nucleus_funding_id

    @nucleus_funding_id.setter
    def nucleus_funding_id(self, nucleus_funding_id):
        """Sets the nucleus_funding_id of this RtpTransferRequestCO.


        :param nucleus_funding_id: The nucleus_funding_id of this RtpTransferRequestCO.  # noqa: E501
        :type: str
        """

        self._nucleus_funding_id = nucleus_funding_id

    @property
    def vendor_request(self):
        """Gets the vendor_request of this RtpTransferRequestCO.  # noqa: E501


        :return: The vendor_request of this RtpTransferRequestCO.  # noqa: E501
        :rtype: object
        """
        return self._vendor_request

    @vendor_request.setter
    def vendor_request(self, vendor_request):
        """Sets the vendor_request of this RtpTransferRequestCO.


        :param vendor_request: The vendor_request of this RtpTransferRequestCO.  # noqa: E501
        :type: object
        """

        self._vendor_request = vendor_request

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
        if issubclass(RtpTransferRequestCO, dict):
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
        if not isinstance(other, RtpTransferRequestCO):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, RtpTransferRequestCO):
            return True

        return self.to_dict() != other.to_dict()
