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


class MXMerchantRes(object):
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
        'guid': 'str',
        'id': 'str',
        'logo_url': 'str',
        'name': 'str',
        'update_date': 'datetime',
        'website_url': 'str'
    }

    attribute_map = {
        'create_date': 'create_date',
        'guid': 'guid',
        'id': 'id',
        'logo_url': 'logo_url',
        'name': 'name',
        'update_date': 'update_date',
        'website_url': 'website_url'
    }

    def __init__(self, create_date=None, guid=None, id=None, logo_url=None, name=None, update_date=None, website_url=None, _configuration=None):  # noqa: E501
        """MXMerchantRes - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._create_date = None
        self._guid = None
        self._id = None
        self._logo_url = None
        self._name = None
        self._update_date = None
        self._website_url = None
        self.discriminator = None

        if create_date is not None:
            self.create_date = create_date
        if guid is not None:
            self.guid = guid
        if id is not None:
            self.id = id
        if logo_url is not None:
            self.logo_url = logo_url
        if name is not None:
            self.name = name
        if update_date is not None:
            self.update_date = update_date
        if website_url is not None:
            self.website_url = website_url

    @property
    def create_date(self):
        """Gets the create_date of this MXMerchantRes.  # noqa: E501


        :return: The create_date of this MXMerchantRes.  # noqa: E501
        :rtype: datetime
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date):
        """Sets the create_date of this MXMerchantRes.


        :param create_date: The create_date of this MXMerchantRes.  # noqa: E501
        :type: datetime
        """

        self._create_date = create_date

    @property
    def guid(self):
        """Gets the guid of this MXMerchantRes.  # noqa: E501


        :return: The guid of this MXMerchantRes.  # noqa: E501
        :rtype: str
        """
        return self._guid

    @guid.setter
    def guid(self, guid):
        """Sets the guid of this MXMerchantRes.


        :param guid: The guid of this MXMerchantRes.  # noqa: E501
        :type: str
        """

        self._guid = guid

    @property
    def id(self):
        """Gets the id of this MXMerchantRes.  # noqa: E501


        :return: The id of this MXMerchantRes.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this MXMerchantRes.


        :param id: The id of this MXMerchantRes.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def logo_url(self):
        """Gets the logo_url of this MXMerchantRes.  # noqa: E501


        :return: The logo_url of this MXMerchantRes.  # noqa: E501
        :rtype: str
        """
        return self._logo_url

    @logo_url.setter
    def logo_url(self, logo_url):
        """Sets the logo_url of this MXMerchantRes.


        :param logo_url: The logo_url of this MXMerchantRes.  # noqa: E501
        :type: str
        """

        self._logo_url = logo_url

    @property
    def name(self):
        """Gets the name of this MXMerchantRes.  # noqa: E501


        :return: The name of this MXMerchantRes.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this MXMerchantRes.


        :param name: The name of this MXMerchantRes.  # noqa: E501
        :type: str
        """

        self._name = name

    @property
    def update_date(self):
        """Gets the update_date of this MXMerchantRes.  # noqa: E501


        :return: The update_date of this MXMerchantRes.  # noqa: E501
        :rtype: datetime
        """
        return self._update_date

    @update_date.setter
    def update_date(self, update_date):
        """Sets the update_date of this MXMerchantRes.


        :param update_date: The update_date of this MXMerchantRes.  # noqa: E501
        :type: datetime
        """

        self._update_date = update_date

    @property
    def website_url(self):
        """Gets the website_url of this MXMerchantRes.  # noqa: E501


        :return: The website_url of this MXMerchantRes.  # noqa: E501
        :rtype: str
        """
        return self._website_url

    @website_url.setter
    def website_url(self, website_url):
        """Sets the website_url of this MXMerchantRes.


        :param website_url: The website_url of this MXMerchantRes.  # noqa: E501
        :type: str
        """

        self._website_url = website_url

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
        if issubclass(MXMerchantRes, dict):
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
        if not isinstance(other, MXMerchantRes):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, MXMerchantRes):
            return True

        return self.to_dict() != other.to_dict()
