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


class ClientRelationship(object):
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
        'member': 'Member',
        'relationship': 'str'
    }

    attribute_map = {
        'client_id': 'client_id',
        'member': 'member',
        'relationship': 'relationship'
    }

    def __init__(self, client_id=None, member=None, relationship=None):  # noqa: E501
        """ClientRelationship - a model defined in Swagger"""  # noqa: E501

        self._client_id = None
        self._member = None
        self._relationship = None
        self.discriminator = None

        self.client_id = client_id
        if member is not None:
            self.member = member
        self.relationship = relationship

    @property
    def client_id(self):
        """Gets the client_id of this ClientRelationship.  # noqa: E501


        :return: The client_id of this ClientRelationship.  # noqa: E501
        :rtype: str
        """
        return self._client_id

    @client_id.setter
    def client_id(self, client_id):
        """Sets the client_id of this ClientRelationship.


        :param client_id: The client_id of this ClientRelationship.  # noqa: E501
        :type: str
        """
        if client_id is None:
            raise ValueError("Invalid value for `client_id`, must not be `None`")  # noqa: E501

        self._client_id = client_id

    @property
    def member(self):
        """Gets the member of this ClientRelationship.  # noqa: E501


        :return: The member of this ClientRelationship.  # noqa: E501
        :rtype: Member
        """
        return self._member

    @member.setter
    def member(self, member):
        """Sets the member of this ClientRelationship.


        :param member: The member of this ClientRelationship.  # noqa: E501
        :type: Member
        """

        self._member = member

    @property
    def relationship(self):
        """Gets the relationship of this ClientRelationship.  # noqa: E501


        :return: The relationship of this ClientRelationship.  # noqa: E501
        :rtype: str
        """
        return self._relationship

    @relationship.setter
    def relationship(self, relationship):
        """Sets the relationship of this ClientRelationship.


        :param relationship: The relationship of this ClientRelationship.  # noqa: E501
        :type: str
        """
        if relationship is None:
            raise ValueError("Invalid value for `relationship`, must not be `None`")  # noqa: E501

        self._relationship = relationship

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
        if issubclass(ClientRelationship, dict):
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
        if not isinstance(other, ClientRelationship):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other