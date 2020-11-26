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


class ClientHydro(object):
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
        'create_date': 'datetime',
        'hydro_id': 'str',
        'id': 'str',
        'is_client_raindrop_enabled': 'bool',
        'is_client_raindrop_linked': 'bool',
        'is_hydro_id_verified': 'bool',
        'metadata': 'dict(str, str)',
        'secondary_id': 'str',
        'update_date': 'datetime'
    }

    attribute_map = {
        'client_id': 'client_id',
        'create_date': 'create_date',
        'hydro_id': 'hydro_id',
        'id': 'id',
        'is_client_raindrop_enabled': 'is_client_raindrop_enabled',
        'is_client_raindrop_linked': 'is_client_raindrop_linked',
        'is_hydro_id_verified': 'is_hydro_id_verified',
        'metadata': 'metadata',
        'secondary_id': 'secondary_id',
        'update_date': 'update_date'
    }

    def __init__(self, client_id=None, create_date=None, hydro_id=None, id=None, is_client_raindrop_enabled=None, is_client_raindrop_linked=None, is_hydro_id_verified=None, metadata=None, secondary_id=None, update_date=None):  # noqa: E501
        """ClientHydro - a model defined in Swagger"""  # noqa: E501

        self._client_id = None
        self._create_date = None
        self._hydro_id = None
        self._id = None
        self._is_client_raindrop_enabled = None
        self._is_client_raindrop_linked = None
        self._is_hydro_id_verified = None
        self._metadata = None
        self._secondary_id = None
        self._update_date = None
        self.discriminator = None

        self.client_id = client_id
        if create_date is not None:
            self.create_date = create_date
        self.hydro_id = hydro_id
        if id is not None:
            self.id = id
        if is_client_raindrop_enabled is not None:
            self.is_client_raindrop_enabled = is_client_raindrop_enabled
        if is_client_raindrop_linked is not None:
            self.is_client_raindrop_linked = is_client_raindrop_linked
        if is_hydro_id_verified is not None:
            self.is_hydro_id_verified = is_hydro_id_verified
        if metadata is not None:
            self.metadata = metadata
        if secondary_id is not None:
            self.secondary_id = secondary_id
        if update_date is not None:
            self.update_date = update_date

    @property
    def client_id(self):
        """Gets the client_id of this ClientHydro.  # noqa: E501

        clientId  # noqa: E501

        :return: The client_id of this ClientHydro.  # noqa: E501
        :rtype: str
        """
        return self._client_id

    @client_id.setter
    def client_id(self, client_id):
        """Sets the client_id of this ClientHydro.

        clientId  # noqa: E501

        :param client_id: The client_id of this ClientHydro.  # noqa: E501
        :type: str
        """
        if client_id is None:
            raise ValueError("Invalid value for `client_id`, must not be `None`")  # noqa: E501

        self._client_id = client_id

    @property
    def create_date(self):
        """Gets the create_date of this ClientHydro.  # noqa: E501


        :return: The create_date of this ClientHydro.  # noqa: E501
        :rtype: datetime
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date):
        """Sets the create_date of this ClientHydro.


        :param create_date: The create_date of this ClientHydro.  # noqa: E501
        :type: datetime
        """

        self._create_date = create_date

    @property
    def hydro_id(self):
        """Gets the hydro_id of this ClientHydro.  # noqa: E501

        hydroId  # noqa: E501

        :return: The hydro_id of this ClientHydro.  # noqa: E501
        :rtype: str
        """
        return self._hydro_id

    @hydro_id.setter
    def hydro_id(self, hydro_id):
        """Sets the hydro_id of this ClientHydro.

        hydroId  # noqa: E501

        :param hydro_id: The hydro_id of this ClientHydro.  # noqa: E501
        :type: str
        """
        if hydro_id is None:
            raise ValueError("Invalid value for `hydro_id`, must not be `None`")  # noqa: E501

        self._hydro_id = hydro_id

    @property
    def id(self):
        """Gets the id of this ClientHydro.  # noqa: E501


        :return: The id of this ClientHydro.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this ClientHydro.


        :param id: The id of this ClientHydro.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def is_client_raindrop_enabled(self):
        """Gets the is_client_raindrop_enabled of this ClientHydro.  # noqa: E501


        :return: The is_client_raindrop_enabled of this ClientHydro.  # noqa: E501
        :rtype: bool
        """
        return self._is_client_raindrop_enabled

    @is_client_raindrop_enabled.setter
    def is_client_raindrop_enabled(self, is_client_raindrop_enabled):
        """Sets the is_client_raindrop_enabled of this ClientHydro.


        :param is_client_raindrop_enabled: The is_client_raindrop_enabled of this ClientHydro.  # noqa: E501
        :type: bool
        """

        self._is_client_raindrop_enabled = is_client_raindrop_enabled

    @property
    def is_client_raindrop_linked(self):
        """Gets the is_client_raindrop_linked of this ClientHydro.  # noqa: E501


        :return: The is_client_raindrop_linked of this ClientHydro.  # noqa: E501
        :rtype: bool
        """
        return self._is_client_raindrop_linked

    @is_client_raindrop_linked.setter
    def is_client_raindrop_linked(self, is_client_raindrop_linked):
        """Sets the is_client_raindrop_linked of this ClientHydro.


        :param is_client_raindrop_linked: The is_client_raindrop_linked of this ClientHydro.  # noqa: E501
        :type: bool
        """

        self._is_client_raindrop_linked = is_client_raindrop_linked

    @property
    def is_hydro_id_verified(self):
        """Gets the is_hydro_id_verified of this ClientHydro.  # noqa: E501

        isHydroIdVerified  # noqa: E501

        :return: The is_hydro_id_verified of this ClientHydro.  # noqa: E501
        :rtype: bool
        """
        return self._is_hydro_id_verified

    @is_hydro_id_verified.setter
    def is_hydro_id_verified(self, is_hydro_id_verified):
        """Sets the is_hydro_id_verified of this ClientHydro.

        isHydroIdVerified  # noqa: E501

        :param is_hydro_id_verified: The is_hydro_id_verified of this ClientHydro.  # noqa: E501
        :type: bool
        """

        self._is_hydro_id_verified = is_hydro_id_verified

    @property
    def metadata(self):
        """Gets the metadata of this ClientHydro.  # noqa: E501

        metadata  # noqa: E501

        :return: The metadata of this ClientHydro.  # noqa: E501
        :rtype: dict(str, str)
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata):
        """Sets the metadata of this ClientHydro.

        metadata  # noqa: E501

        :param metadata: The metadata of this ClientHydro.  # noqa: E501
        :type: dict(str, str)
        """

        self._metadata = metadata

    @property
    def secondary_id(self):
        """Gets the secondary_id of this ClientHydro.  # noqa: E501


        :return: The secondary_id of this ClientHydro.  # noqa: E501
        :rtype: str
        """
        return self._secondary_id

    @secondary_id.setter
    def secondary_id(self, secondary_id):
        """Sets the secondary_id of this ClientHydro.


        :param secondary_id: The secondary_id of this ClientHydro.  # noqa: E501
        :type: str
        """

        self._secondary_id = secondary_id

    @property
    def update_date(self):
        """Gets the update_date of this ClientHydro.  # noqa: E501


        :return: The update_date of this ClientHydro.  # noqa: E501
        :rtype: datetime
        """
        return self._update_date

    @update_date.setter
    def update_date(self, update_date):
        """Sets the update_date of this ClientHydro.


        :param update_date: The update_date of this ClientHydro.  # noqa: E501
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
        if issubclass(ClientHydro, dict):
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
        if not isinstance(other, ClientHydro):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
