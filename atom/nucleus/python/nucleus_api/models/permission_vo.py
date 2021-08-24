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


class PermissionVO(object):
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
        'client_id': 'str',
        'permission_type': 'str'
    }

    attribute_map = {
        'client_id': 'client_id',
        'permission_type': 'permission_type'
    }

    def __init__(self, client_id=None, permission_type=None, _configuration=None):  # noqa: E501
        """PermissionVO - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._client_id = None
        self._permission_type = None
        self.discriminator = None

        if client_id is not None:
            self.client_id = client_id
        if permission_type is not None:
            self.permission_type = permission_type

    @property
    def client_id(self):
        """Gets the client_id of this PermissionVO.  # noqa: E501

        clientId  # noqa: E501

        :return: The client_id of this PermissionVO.  # noqa: E501
        :rtype: str
        """
        return self._client_id

    @client_id.setter
    def client_id(self, client_id):
        """Sets the client_id of this PermissionVO.

        clientId  # noqa: E501

        :param client_id: The client_id of this PermissionVO.  # noqa: E501
        :type: str
        """

        self._client_id = client_id

    @property
    def permission_type(self):
        """Gets the permission_type of this PermissionVO.  # noqa: E501

        permissionType  # noqa: E501

        :return: The permission_type of this PermissionVO.  # noqa: E501
        :rtype: str
        """
        return self._permission_type

    @permission_type.setter
    def permission_type(self, permission_type):
        """Sets the permission_type of this PermissionVO.

        permissionType  # noqa: E501

        :param permission_type: The permission_type of this PermissionVO.  # noqa: E501
        :type: str
        """
        allowed_values = ["INQUIRY_ACCESS", "LIMITED_AUTHORITY", "FULL_AUTHORITY", "POWER_OF_ATTORNEY"]  # noqa: E501
        if (self._configuration.client_side_validation and
                permission_type not in allowed_values):
            raise ValueError(
                "Invalid value for `permission_type` ({0}), must be one of {1}"  # noqa: E501
                .format(permission_type, allowed_values)
            )

        self._permission_type = permission_type

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
        if issubclass(PermissionVO, dict):
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
        if not isinstance(other, PermissionVO):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, PermissionVO):
            return True

        return self.to_dict() != other.to_dict()
