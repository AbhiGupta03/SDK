# coding: utf-8

"""
    Hydrogen Atom API

    The Hydrogen Atom API  # noqa: E501

    OpenAPI spec version: 1.7.0
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six


class AllocationVO(object):
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
        'account_allocation_date': 'datetime',
        'account_allocation_id': 'str',
        'account_allocation_weight': 'float',
        'allocation_category': 'str',
        'allocation_description': 'str',
        'allocation_id': 'str',
        'allocation_name': 'str',
        'allocation_secondary_id': 'str'
    }

    attribute_map = {
        'account_allocation_date': 'account_allocation_date',
        'account_allocation_id': 'account_allocation_id',
        'account_allocation_weight': 'account_allocation_weight',
        'allocation_category': 'allocation_category',
        'allocation_description': 'allocation_description',
        'allocation_id': 'allocation_id',
        'allocation_name': 'allocation_name',
        'allocation_secondary_id': 'allocation_secondary_id'
    }

    def __init__(self, account_allocation_date=None, account_allocation_id=None, account_allocation_weight=None, allocation_category=None, allocation_description=None, allocation_id=None, allocation_name=None, allocation_secondary_id=None):  # noqa: E501
        """AllocationVO - a model defined in Swagger"""  # noqa: E501

        self._account_allocation_date = None
        self._account_allocation_id = None
        self._account_allocation_weight = None
        self._allocation_category = None
        self._allocation_description = None
        self._allocation_id = None
        self._allocation_name = None
        self._allocation_secondary_id = None
        self.discriminator = None

        if account_allocation_date is not None:
            self.account_allocation_date = account_allocation_date
        if account_allocation_id is not None:
            self.account_allocation_id = account_allocation_id
        if account_allocation_weight is not None:
            self.account_allocation_weight = account_allocation_weight
        if allocation_category is not None:
            self.allocation_category = allocation_category
        if allocation_description is not None:
            self.allocation_description = allocation_description
        if allocation_id is not None:
            self.allocation_id = allocation_id
        if allocation_name is not None:
            self.allocation_name = allocation_name
        if allocation_secondary_id is not None:
            self.allocation_secondary_id = allocation_secondary_id

    @property
    def account_allocation_date(self):
        """Gets the account_allocation_date of this AllocationVO.  # noqa: E501


        :return: The account_allocation_date of this AllocationVO.  # noqa: E501
        :rtype: datetime
        """
        return self._account_allocation_date

    @account_allocation_date.setter
    def account_allocation_date(self, account_allocation_date):
        """Sets the account_allocation_date of this AllocationVO.


        :param account_allocation_date: The account_allocation_date of this AllocationVO.  # noqa: E501
        :type: datetime
        """

        self._account_allocation_date = account_allocation_date

    @property
    def account_allocation_id(self):
        """Gets the account_allocation_id of this AllocationVO.  # noqa: E501


        :return: The account_allocation_id of this AllocationVO.  # noqa: E501
        :rtype: str
        """
        return self._account_allocation_id

    @account_allocation_id.setter
    def account_allocation_id(self, account_allocation_id):
        """Sets the account_allocation_id of this AllocationVO.


        :param account_allocation_id: The account_allocation_id of this AllocationVO.  # noqa: E501
        :type: str
        """

        self._account_allocation_id = account_allocation_id

    @property
    def account_allocation_weight(self):
        """Gets the account_allocation_weight of this AllocationVO.  # noqa: E501


        :return: The account_allocation_weight of this AllocationVO.  # noqa: E501
        :rtype: float
        """
        return self._account_allocation_weight

    @account_allocation_weight.setter
    def account_allocation_weight(self, account_allocation_weight):
        """Sets the account_allocation_weight of this AllocationVO.


        :param account_allocation_weight: The account_allocation_weight of this AllocationVO.  # noqa: E501
        :type: float
        """

        self._account_allocation_weight = account_allocation_weight

    @property
    def allocation_category(self):
        """Gets the allocation_category of this AllocationVO.  # noqa: E501


        :return: The allocation_category of this AllocationVO.  # noqa: E501
        :rtype: str
        """
        return self._allocation_category

    @allocation_category.setter
    def allocation_category(self, allocation_category):
        """Sets the allocation_category of this AllocationVO.


        :param allocation_category: The allocation_category of this AllocationVO.  # noqa: E501
        :type: str
        """

        self._allocation_category = allocation_category

    @property
    def allocation_description(self):
        """Gets the allocation_description of this AllocationVO.  # noqa: E501


        :return: The allocation_description of this AllocationVO.  # noqa: E501
        :rtype: str
        """
        return self._allocation_description

    @allocation_description.setter
    def allocation_description(self, allocation_description):
        """Sets the allocation_description of this AllocationVO.


        :param allocation_description: The allocation_description of this AllocationVO.  # noqa: E501
        :type: str
        """

        self._allocation_description = allocation_description

    @property
    def allocation_id(self):
        """Gets the allocation_id of this AllocationVO.  # noqa: E501


        :return: The allocation_id of this AllocationVO.  # noqa: E501
        :rtype: str
        """
        return self._allocation_id

    @allocation_id.setter
    def allocation_id(self, allocation_id):
        """Sets the allocation_id of this AllocationVO.


        :param allocation_id: The allocation_id of this AllocationVO.  # noqa: E501
        :type: str
        """

        self._allocation_id = allocation_id

    @property
    def allocation_name(self):
        """Gets the allocation_name of this AllocationVO.  # noqa: E501


        :return: The allocation_name of this AllocationVO.  # noqa: E501
        :rtype: str
        """
        return self._allocation_name

    @allocation_name.setter
    def allocation_name(self, allocation_name):
        """Sets the allocation_name of this AllocationVO.


        :param allocation_name: The allocation_name of this AllocationVO.  # noqa: E501
        :type: str
        """

        self._allocation_name = allocation_name

    @property
    def allocation_secondary_id(self):
        """Gets the allocation_secondary_id of this AllocationVO.  # noqa: E501


        :return: The allocation_secondary_id of this AllocationVO.  # noqa: E501
        :rtype: str
        """
        return self._allocation_secondary_id

    @allocation_secondary_id.setter
    def allocation_secondary_id(self, allocation_secondary_id):
        """Sets the allocation_secondary_id of this AllocationVO.


        :param allocation_secondary_id: The allocation_secondary_id of this AllocationVO.  # noqa: E501
        :type: str
        """

        self._allocation_secondary_id = allocation_secondary_id

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
        if issubclass(AllocationVO, dict):
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
        if not isinstance(other, AllocationVO):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other