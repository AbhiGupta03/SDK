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


class SupportTicketComment(object):
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
        'create_date': 'datetime',
        'description': 'str',
        'has_attachment': 'bool',
        'id': 'str',
        'is_admin': 'bool',
        'is_read': 'bool',
        'metadata': 'dict(str, str)',
        'secondary_id': 'str',
        'support_ticket_documents': 'list[SupportTicketDocument]',
        'support_ticket_id': 'str',
        'update_date': 'datetime'
    }

    attribute_map = {
        'create_date': 'create_date',
        'description': 'description',
        'has_attachment': 'has_attachment',
        'id': 'id',
        'is_admin': 'is_admin',
        'is_read': 'is_read',
        'metadata': 'metadata',
        'secondary_id': 'secondary_id',
        'support_ticket_documents': 'support_ticket_documents',
        'support_ticket_id': 'support_ticket_id',
        'update_date': 'update_date'
    }

    def __init__(self, create_date=None, description=None, has_attachment=None, id=None, is_admin=None, is_read=None, metadata=None, secondary_id=None, support_ticket_documents=None, support_ticket_id=None, update_date=None):  # noqa: E501
        """SupportTicketComment - a model defined in Swagger"""  # noqa: E501

        self._create_date = None
        self._description = None
        self._has_attachment = None
        self._id = None
        self._is_admin = None
        self._is_read = None
        self._metadata = None
        self._secondary_id = None
        self._support_ticket_documents = None
        self._support_ticket_id = None
        self._update_date = None
        self.discriminator = None

        if create_date is not None:
            self.create_date = create_date
        if description is not None:
            self.description = description
        if has_attachment is not None:
            self.has_attachment = has_attachment
        if id is not None:
            self.id = id
        if is_admin is not None:
            self.is_admin = is_admin
        if is_read is not None:
            self.is_read = is_read
        if metadata is not None:
            self.metadata = metadata
        if secondary_id is not None:
            self.secondary_id = secondary_id
        if support_ticket_documents is not None:
            self.support_ticket_documents = support_ticket_documents
        self.support_ticket_id = support_ticket_id
        if update_date is not None:
            self.update_date = update_date

    @property
    def create_date(self):
        """Gets the create_date of this SupportTicketComment.  # noqa: E501


        :return: The create_date of this SupportTicketComment.  # noqa: E501
        :rtype: datetime
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date):
        """Sets the create_date of this SupportTicketComment.


        :param create_date: The create_date of this SupportTicketComment.  # noqa: E501
        :type: datetime
        """

        self._create_date = create_date

    @property
    def description(self):
        """Gets the description of this SupportTicketComment.  # noqa: E501

        SupportTicket Comment Description  # noqa: E501

        :return: The description of this SupportTicketComment.  # noqa: E501
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this SupportTicketComment.

        SupportTicket Comment Description  # noqa: E501

        :param description: The description of this SupportTicketComment.  # noqa: E501
        :type: str
        """

        self._description = description

    @property
    def has_attachment(self):
        """Gets the has_attachment of this SupportTicketComment.  # noqa: E501

        Does the SupportTicket Comment contain an attachment  # noqa: E501

        :return: The has_attachment of this SupportTicketComment.  # noqa: E501
        :rtype: bool
        """
        return self._has_attachment

    @has_attachment.setter
    def has_attachment(self, has_attachment):
        """Sets the has_attachment of this SupportTicketComment.

        Does the SupportTicket Comment contain an attachment  # noqa: E501

        :param has_attachment: The has_attachment of this SupportTicketComment.  # noqa: E501
        :type: bool
        """

        self._has_attachment = has_attachment

    @property
    def id(self):
        """Gets the id of this SupportTicketComment.  # noqa: E501


        :return: The id of this SupportTicketComment.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this SupportTicketComment.


        :param id: The id of this SupportTicketComment.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def is_admin(self):
        """Gets the is_admin of this SupportTicketComment.  # noqa: E501

        Is the SupportTicket Comment an admin  # noqa: E501

        :return: The is_admin of this SupportTicketComment.  # noqa: E501
        :rtype: bool
        """
        return self._is_admin

    @is_admin.setter
    def is_admin(self, is_admin):
        """Sets the is_admin of this SupportTicketComment.

        Is the SupportTicket Comment an admin  # noqa: E501

        :param is_admin: The is_admin of this SupportTicketComment.  # noqa: E501
        :type: bool
        """

        self._is_admin = is_admin

    @property
    def is_read(self):
        """Gets the is_read of this SupportTicketComment.  # noqa: E501

        Is the SupportTicket Comment read  # noqa: E501

        :return: The is_read of this SupportTicketComment.  # noqa: E501
        :rtype: bool
        """
        return self._is_read

    @is_read.setter
    def is_read(self, is_read):
        """Sets the is_read of this SupportTicketComment.

        Is the SupportTicket Comment read  # noqa: E501

        :param is_read: The is_read of this SupportTicketComment.  # noqa: E501
        :type: bool
        """

        self._is_read = is_read

    @property
    def metadata(self):
        """Gets the metadata of this SupportTicketComment.  # noqa: E501


        :return: The metadata of this SupportTicketComment.  # noqa: E501
        :rtype: dict(str, str)
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata):
        """Sets the metadata of this SupportTicketComment.


        :param metadata: The metadata of this SupportTicketComment.  # noqa: E501
        :type: dict(str, str)
        """

        self._metadata = metadata

    @property
    def secondary_id(self):
        """Gets the secondary_id of this SupportTicketComment.  # noqa: E501


        :return: The secondary_id of this SupportTicketComment.  # noqa: E501
        :rtype: str
        """
        return self._secondary_id

    @secondary_id.setter
    def secondary_id(self, secondary_id):
        """Sets the secondary_id of this SupportTicketComment.


        :param secondary_id: The secondary_id of this SupportTicketComment.  # noqa: E501
        :type: str
        """

        self._secondary_id = secondary_id

    @property
    def support_ticket_documents(self):
        """Gets the support_ticket_documents of this SupportTicketComment.  # noqa: E501


        :return: The support_ticket_documents of this SupportTicketComment.  # noqa: E501
        :rtype: list[SupportTicketDocument]
        """
        return self._support_ticket_documents

    @support_ticket_documents.setter
    def support_ticket_documents(self, support_ticket_documents):
        """Sets the support_ticket_documents of this SupportTicketComment.


        :param support_ticket_documents: The support_ticket_documents of this SupportTicketComment.  # noqa: E501
        :type: list[SupportTicketDocument]
        """

        self._support_ticket_documents = support_ticket_documents

    @property
    def support_ticket_id(self):
        """Gets the support_ticket_id of this SupportTicketComment.  # noqa: E501

        SupportTicket Id  # noqa: E501

        :return: The support_ticket_id of this SupportTicketComment.  # noqa: E501
        :rtype: str
        """
        return self._support_ticket_id

    @support_ticket_id.setter
    def support_ticket_id(self, support_ticket_id):
        """Sets the support_ticket_id of this SupportTicketComment.

        SupportTicket Id  # noqa: E501

        :param support_ticket_id: The support_ticket_id of this SupportTicketComment.  # noqa: E501
        :type: str
        """
        if support_ticket_id is None:
            raise ValueError("Invalid value for `support_ticket_id`, must not be `None`")  # noqa: E501

        self._support_ticket_id = support_ticket_id

    @property
    def update_date(self):
        """Gets the update_date of this SupportTicketComment.  # noqa: E501


        :return: The update_date of this SupportTicketComment.  # noqa: E501
        :rtype: datetime
        """
        return self._update_date

    @update_date.setter
    def update_date(self, update_date):
        """Sets the update_date of this SupportTicketComment.


        :param update_date: The update_date of this SupportTicketComment.  # noqa: E501
        :type: datetime
        """

        self._update_date = update_date

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
        if issubclass(SupportTicketComment, dict):
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
        if not isinstance(other, SupportTicketComment):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
