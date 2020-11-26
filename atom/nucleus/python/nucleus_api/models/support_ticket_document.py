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


class SupportTicketDocument(object):
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
        'doc_file': 'str',
        'doc_name': 'str',
        'doc_size': 'int',
        'doc_type': 'str',
        'url_path': 'str'
    }

    attribute_map = {
        'doc_file': 'doc_file',
        'doc_name': 'doc_name',
        'doc_size': 'doc_size',
        'doc_type': 'doc_type',
        'url_path': 'url_path'
    }

    def __init__(self, doc_file=None, doc_name=None, doc_size=None, doc_type=None, url_path=None):  # noqa: E501
        """SupportTicketDocument - a model defined in Swagger"""  # noqa: E501

        self._doc_file = None
        self._doc_name = None
        self._doc_size = None
        self._doc_type = None
        self._url_path = None
        self.discriminator = None

        if doc_file is not None:
            self.doc_file = doc_file
        self.doc_name = doc_name
        if doc_size is not None:
            self.doc_size = doc_size
        if doc_type is not None:
            self.doc_type = doc_type
        if url_path is not None:
            self.url_path = url_path

    @property
    def doc_file(self):
        """Gets the doc_file of this SupportTicketDocument.  # noqa: E501

        docFile  # noqa: E501

        :return: The doc_file of this SupportTicketDocument.  # noqa: E501
        :rtype: str
        """
        return self._doc_file

    @doc_file.setter
    def doc_file(self, doc_file):
        """Sets the doc_file of this SupportTicketDocument.

        docFile  # noqa: E501

        :param doc_file: The doc_file of this SupportTicketDocument.  # noqa: E501
        :type: str
        """

        self._doc_file = doc_file

    @property
    def doc_name(self):
        """Gets the doc_name of this SupportTicketDocument.  # noqa: E501

        docName  # noqa: E501

        :return: The doc_name of this SupportTicketDocument.  # noqa: E501
        :rtype: str
        """
        return self._doc_name

    @doc_name.setter
    def doc_name(self, doc_name):
        """Sets the doc_name of this SupportTicketDocument.

        docName  # noqa: E501

        :param doc_name: The doc_name of this SupportTicketDocument.  # noqa: E501
        :type: str
        """
        if doc_name is None:
            raise ValueError("Invalid value for `doc_name`, must not be `None`")  # noqa: E501

        self._doc_name = doc_name

    @property
    def doc_size(self):
        """Gets the doc_size of this SupportTicketDocument.  # noqa: E501

        docSize  # noqa: E501

        :return: The doc_size of this SupportTicketDocument.  # noqa: E501
        :rtype: int
        """
        return self._doc_size

    @doc_size.setter
    def doc_size(self, doc_size):
        """Sets the doc_size of this SupportTicketDocument.

        docSize  # noqa: E501

        :param doc_size: The doc_size of this SupportTicketDocument.  # noqa: E501
        :type: int
        """

        self._doc_size = doc_size

    @property
    def doc_type(self):
        """Gets the doc_type of this SupportTicketDocument.  # noqa: E501

        docType  # noqa: E501

        :return: The doc_type of this SupportTicketDocument.  # noqa: E501
        :rtype: str
        """
        return self._doc_type

    @doc_type.setter
    def doc_type(self, doc_type):
        """Sets the doc_type of this SupportTicketDocument.

        docType  # noqa: E501

        :param doc_type: The doc_type of this SupportTicketDocument.  # noqa: E501
        :type: str
        """

        self._doc_type = doc_type

    @property
    def url_path(self):
        """Gets the url_path of this SupportTicketDocument.  # noqa: E501

        urlPath  # noqa: E501

        :return: The url_path of this SupportTicketDocument.  # noqa: E501
        :rtype: str
        """
        return self._url_path

    @url_path.setter
    def url_path(self, url_path):
        """Sets the url_path of this SupportTicketDocument.

        urlPath  # noqa: E501

        :param url_path: The url_path of this SupportTicketDocument.  # noqa: E501
        :type: str
        """

        self._url_path = url_path

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
        if issubclass(SupportTicketDocument, dict):
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
        if not isinstance(other, SupportTicketDocument):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
