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


class CreateUserRequest(object):
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
        'integration_type': 'str',
        'nucleus_business_id': 'str',
        'nucleus_client_id': 'str',
        'product': 'str',
        'tenant_id': 'str',
        'vendor_name': 'str',
        'vendor_request': 'object'
    }

    attribute_map = {
        'integration_type': 'integration_type',
        'nucleus_business_id': 'nucleus_business_id',
        'nucleus_client_id': 'nucleus_client_id',
        'product': 'product',
        'tenant_id': 'tenant_id',
        'vendor_name': 'vendor_name',
        'vendor_request': 'vendor_request'
    }

    def __init__(self, integration_type=None, nucleus_business_id=None, nucleus_client_id=None, product=None, tenant_id=None, vendor_name=None, vendor_request=None, _configuration=None):  # noqa: E501
        """CreateUserRequest - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._integration_type = None
        self._nucleus_business_id = None
        self._nucleus_client_id = None
        self._product = None
        self._tenant_id = None
        self._vendor_name = None
        self._vendor_request = None
        self.discriminator = None

        if integration_type is not None:
            self.integration_type = integration_type
        if nucleus_business_id is not None:
            self.nucleus_business_id = nucleus_business_id
        if nucleus_client_id is not None:
            self.nucleus_client_id = nucleus_client_id
        if product is not None:
            self.product = product
        if tenant_id is not None:
            self.tenant_id = tenant_id
        if vendor_name is not None:
            self.vendor_name = vendor_name
        if vendor_request is not None:
            self.vendor_request = vendor_request

    @property
    def integration_type(self):
        """Gets the integration_type of this CreateUserRequest.  # noqa: E501


        :return: The integration_type of this CreateUserRequest.  # noqa: E501
        :rtype: str
        """
        return self._integration_type

    @integration_type.setter
    def integration_type(self, integration_type):
        """Sets the integration_type of this CreateUserRequest.


        :param integration_type: The integration_type of this CreateUserRequest.  # noqa: E501
        :type: str
        """

        self._integration_type = integration_type

    @property
    def nucleus_business_id(self):
        """Gets the nucleus_business_id of this CreateUserRequest.  # noqa: E501


        :return: The nucleus_business_id of this CreateUserRequest.  # noqa: E501
        :rtype: str
        """
        return self._nucleus_business_id

    @nucleus_business_id.setter
    def nucleus_business_id(self, nucleus_business_id):
        """Sets the nucleus_business_id of this CreateUserRequest.


        :param nucleus_business_id: The nucleus_business_id of this CreateUserRequest.  # noqa: E501
        :type: str
        """

        self._nucleus_business_id = nucleus_business_id

    @property
    def nucleus_client_id(self):
        """Gets the nucleus_client_id of this CreateUserRequest.  # noqa: E501


        :return: The nucleus_client_id of this CreateUserRequest.  # noqa: E501
        :rtype: str
        """
        return self._nucleus_client_id

    @nucleus_client_id.setter
    def nucleus_client_id(self, nucleus_client_id):
        """Sets the nucleus_client_id of this CreateUserRequest.


        :param nucleus_client_id: The nucleus_client_id of this CreateUserRequest.  # noqa: E501
        :type: str
        """

        self._nucleus_client_id = nucleus_client_id

    @property
    def product(self):
        """Gets the product of this CreateUserRequest.  # noqa: E501


        :return: The product of this CreateUserRequest.  # noqa: E501
        :rtype: str
        """
        return self._product

    @product.setter
    def product(self, product):
        """Sets the product of this CreateUserRequest.


        :param product: The product of this CreateUserRequest.  # noqa: E501
        :type: str
        """

        self._product = product

    @property
    def tenant_id(self):
        """Gets the tenant_id of this CreateUserRequest.  # noqa: E501


        :return: The tenant_id of this CreateUserRequest.  # noqa: E501
        :rtype: str
        """
        return self._tenant_id

    @tenant_id.setter
    def tenant_id(self, tenant_id):
        """Sets the tenant_id of this CreateUserRequest.


        :param tenant_id: The tenant_id of this CreateUserRequest.  # noqa: E501
        :type: str
        """

        self._tenant_id = tenant_id

    @property
    def vendor_name(self):
        """Gets the vendor_name of this CreateUserRequest.  # noqa: E501


        :return: The vendor_name of this CreateUserRequest.  # noqa: E501
        :rtype: str
        """
        return self._vendor_name

    @vendor_name.setter
    def vendor_name(self, vendor_name):
        """Sets the vendor_name of this CreateUserRequest.


        :param vendor_name: The vendor_name of this CreateUserRequest.  # noqa: E501
        :type: str
        """

        self._vendor_name = vendor_name

    @property
    def vendor_request(self):
        """Gets the vendor_request of this CreateUserRequest.  # noqa: E501


        :return: The vendor_request of this CreateUserRequest.  # noqa: E501
        :rtype: object
        """
        return self._vendor_request

    @vendor_request.setter
    def vendor_request(self, vendor_request):
        """Sets the vendor_request of this CreateUserRequest.


        :param vendor_request: The vendor_request of this CreateUserRequest.  # noqa: E501
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
        if issubclass(CreateUserRequest, dict):
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
        if not isinstance(other, CreateUserRequest):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, CreateUserRequest):
            return True

        return self.to_dict() != other.to_dict()
