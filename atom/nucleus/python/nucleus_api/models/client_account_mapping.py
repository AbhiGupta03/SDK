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


class ClientAccountMapping(object):
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
        'client_account_association_type': 'str',
        'client_id': 'str',
        'signature_data': 'str'
    }

    attribute_map = {
        'client_account_association_type': 'client_account_association_type',
        'client_id': 'client_id',
        'signature_data': 'signature_data'
    }

    def __init__(self, client_account_association_type=None, client_id=None, signature_data=None):  # noqa: E501
        """ClientAccountMapping - a model defined in Swagger"""  # noqa: E501

        self._client_account_association_type = None
        self._client_id = None
        self._signature_data = None
        self.discriminator = None

        self.client_account_association_type = client_account_association_type
        self.client_id = client_id
        if signature_data is not None:
            self.signature_data = signature_data

    @property
    def client_account_association_type(self):
        """Gets the client_account_association_type of this ClientAccountMapping.  # noqa: E501

        clientAccountAssociationType  # noqa: E501

        :return: The client_account_association_type of this ClientAccountMapping.  # noqa: E501
        :rtype: str
        """
        return self._client_account_association_type

    @client_account_association_type.setter
    def client_account_association_type(self, client_account_association_type):
        """Sets the client_account_association_type of this ClientAccountMapping.

        clientAccountAssociationType  # noqa: E501

        :param client_account_association_type: The client_account_association_type of this ClientAccountMapping.  # noqa: E501
        :type: str
        """
        if client_account_association_type is None:
            raise ValueError("Invalid value for `client_account_association_type`, must not be `None`")  # noqa: E501

        self._client_account_association_type = client_account_association_type

    @property
    def client_id(self):
        """Gets the client_id of this ClientAccountMapping.  # noqa: E501

        clientId  # noqa: E501

        :return: The client_id of this ClientAccountMapping.  # noqa: E501
        :rtype: str
        """
        return self._client_id

    @client_id.setter
    def client_id(self, client_id):
        """Sets the client_id of this ClientAccountMapping.

        clientId  # noqa: E501

        :param client_id: The client_id of this ClientAccountMapping.  # noqa: E501
        :type: str
        """
        if client_id is None:
            raise ValueError("Invalid value for `client_id`, must not be `None`")  # noqa: E501

        self._client_id = client_id

    @property
    def signature_data(self):
        """Gets the signature_data of this ClientAccountMapping.  # noqa: E501


        :return: The signature_data of this ClientAccountMapping.  # noqa: E501
        :rtype: str
        """
        return self._signature_data

    @signature_data.setter
    def signature_data(self, signature_data):
        """Sets the signature_data of this ClientAccountMapping.


        :param signature_data: The signature_data of this ClientAccountMapping.  # noqa: E501
        :type: str
        """

        self._signature_data = signature_data

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
        if issubclass(ClientAccountMapping, dict):
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
        if not isinstance(other, ClientAccountMapping):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
