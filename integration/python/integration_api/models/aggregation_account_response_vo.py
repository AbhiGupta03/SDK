# coding: utf-8

"""
    Hydrogen Integration API

    The Hydrogen Integration API  # noqa: E501

    OpenAPI spec version: 1.2.1
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six


class AggregationAccountResponseVO(object):
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
        'message': 'str',
        'nucleus_aggregation_account': 'AggregationAccountResponseInternalObjectVO',
        'nucleus_aggregation_account_id': 'str',
        'vendor_name': 'str'
    }

    attribute_map = {
        'message': 'message',
        'nucleus_aggregation_account': 'nucleus_aggregation_account',
        'nucleus_aggregation_account_id': 'nucleus_aggregation_account_id',
        'vendor_name': 'vendor_name'
    }

    def __init__(self, message=None, nucleus_aggregation_account=None, nucleus_aggregation_account_id=None, vendor_name=None):  # noqa: E501
        """AggregationAccountResponseVO - a model defined in Swagger"""  # noqa: E501

        self._message = None
        self._nucleus_aggregation_account = None
        self._nucleus_aggregation_account_id = None
        self._vendor_name = None
        self.discriminator = None

        if message is not None:
            self.message = message
        if nucleus_aggregation_account is not None:
            self.nucleus_aggregation_account = nucleus_aggregation_account
        if nucleus_aggregation_account_id is not None:
            self.nucleus_aggregation_account_id = nucleus_aggregation_account_id
        if vendor_name is not None:
            self.vendor_name = vendor_name

    @property
    def message(self):
        """Gets the message of this AggregationAccountResponseVO.  # noqa: E501


        :return: The message of this AggregationAccountResponseVO.  # noqa: E501
        :rtype: str
        """
        return self._message

    @message.setter
    def message(self, message):
        """Sets the message of this AggregationAccountResponseVO.


        :param message: The message of this AggregationAccountResponseVO.  # noqa: E501
        :type: str
        """

        self._message = message

    @property
    def nucleus_aggregation_account(self):
        """Gets the nucleus_aggregation_account of this AggregationAccountResponseVO.  # noqa: E501


        :return: The nucleus_aggregation_account of this AggregationAccountResponseVO.  # noqa: E501
        :rtype: AggregationAccountResponseInternalObjectVO
        """
        return self._nucleus_aggregation_account

    @nucleus_aggregation_account.setter
    def nucleus_aggregation_account(self, nucleus_aggregation_account):
        """Sets the nucleus_aggregation_account of this AggregationAccountResponseVO.


        :param nucleus_aggregation_account: The nucleus_aggregation_account of this AggregationAccountResponseVO.  # noqa: E501
        :type: AggregationAccountResponseInternalObjectVO
        """

        self._nucleus_aggregation_account = nucleus_aggregation_account

    @property
    def nucleus_aggregation_account_id(self):
        """Gets the nucleus_aggregation_account_id of this AggregationAccountResponseVO.  # noqa: E501


        :return: The nucleus_aggregation_account_id of this AggregationAccountResponseVO.  # noqa: E501
        :rtype: str
        """
        return self._nucleus_aggregation_account_id

    @nucleus_aggregation_account_id.setter
    def nucleus_aggregation_account_id(self, nucleus_aggregation_account_id):
        """Sets the nucleus_aggregation_account_id of this AggregationAccountResponseVO.


        :param nucleus_aggregation_account_id: The nucleus_aggregation_account_id of this AggregationAccountResponseVO.  # noqa: E501
        :type: str
        """

        self._nucleus_aggregation_account_id = nucleus_aggregation_account_id

    @property
    def vendor_name(self):
        """Gets the vendor_name of this AggregationAccountResponseVO.  # noqa: E501


        :return: The vendor_name of this AggregationAccountResponseVO.  # noqa: E501
        :rtype: str
        """
        return self._vendor_name

    @vendor_name.setter
    def vendor_name(self, vendor_name):
        """Sets the vendor_name of this AggregationAccountResponseVO.


        :param vendor_name: The vendor_name of this AggregationAccountResponseVO.  # noqa: E501
        :type: str
        """

        self._vendor_name = vendor_name

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
        if issubclass(AggregationAccountResponseVO, dict):
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
        if not isinstance(other, AggregationAccountResponseVO):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other