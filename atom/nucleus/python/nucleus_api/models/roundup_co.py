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


class RoundupCO(object):
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
        'funding_start_date': 'date',
        'roundup_setting_id': 'str',
        'transaction_end_date': 'datetime',
        'transaction_start_date': 'datetime',
        'update_transactions': 'bool'
    }

    attribute_map = {
        'funding_start_date': 'funding_start_date',
        'roundup_setting_id': 'roundup_setting_id',
        'transaction_end_date': 'transaction_end_date',
        'transaction_start_date': 'transaction_start_date',
        'update_transactions': 'update_transactions'
    }

    def __init__(self, funding_start_date=None, roundup_setting_id=None, transaction_end_date=None, transaction_start_date=None, update_transactions=None):  # noqa: E501
        """RoundupCO - a model defined in Swagger"""  # noqa: E501

        self._funding_start_date = None
        self._roundup_setting_id = None
        self._transaction_end_date = None
        self._transaction_start_date = None
        self._update_transactions = None
        self.discriminator = None

        self.funding_start_date = funding_start_date
        self.roundup_setting_id = roundup_setting_id
        if transaction_end_date is not None:
            self.transaction_end_date = transaction_end_date
        self.transaction_start_date = transaction_start_date
        if update_transactions is not None:
            self.update_transactions = update_transactions

    @property
    def funding_start_date(self):
        """Gets the funding_start_date of this RoundupCO.  # noqa: E501


        :return: The funding_start_date of this RoundupCO.  # noqa: E501
        :rtype: date
        """
        return self._funding_start_date

    @funding_start_date.setter
    def funding_start_date(self, funding_start_date):
        """Sets the funding_start_date of this RoundupCO.


        :param funding_start_date: The funding_start_date of this RoundupCO.  # noqa: E501
        :type: date
        """
        if funding_start_date is None:
            raise ValueError("Invalid value for `funding_start_date`, must not be `None`")  # noqa: E501

        self._funding_start_date = funding_start_date

    @property
    def roundup_setting_id(self):
        """Gets the roundup_setting_id of this RoundupCO.  # noqa: E501


        :return: The roundup_setting_id of this RoundupCO.  # noqa: E501
        :rtype: str
        """
        return self._roundup_setting_id

    @roundup_setting_id.setter
    def roundup_setting_id(self, roundup_setting_id):
        """Sets the roundup_setting_id of this RoundupCO.


        :param roundup_setting_id: The roundup_setting_id of this RoundupCO.  # noqa: E501
        :type: str
        """
        if roundup_setting_id is None:
            raise ValueError("Invalid value for `roundup_setting_id`, must not be `None`")  # noqa: E501

        self._roundup_setting_id = roundup_setting_id

    @property
    def transaction_end_date(self):
        """Gets the transaction_end_date of this RoundupCO.  # noqa: E501


        :return: The transaction_end_date of this RoundupCO.  # noqa: E501
        :rtype: datetime
        """
        return self._transaction_end_date

    @transaction_end_date.setter
    def transaction_end_date(self, transaction_end_date):
        """Sets the transaction_end_date of this RoundupCO.


        :param transaction_end_date: The transaction_end_date of this RoundupCO.  # noqa: E501
        :type: datetime
        """

        self._transaction_end_date = transaction_end_date

    @property
    def transaction_start_date(self):
        """Gets the transaction_start_date of this RoundupCO.  # noqa: E501


        :return: The transaction_start_date of this RoundupCO.  # noqa: E501
        :rtype: datetime
        """
        return self._transaction_start_date

    @transaction_start_date.setter
    def transaction_start_date(self, transaction_start_date):
        """Sets the transaction_start_date of this RoundupCO.


        :param transaction_start_date: The transaction_start_date of this RoundupCO.  # noqa: E501
        :type: datetime
        """
        if transaction_start_date is None:
            raise ValueError("Invalid value for `transaction_start_date`, must not be `None`")  # noqa: E501

        self._transaction_start_date = transaction_start_date

    @property
    def update_transactions(self):
        """Gets the update_transactions of this RoundupCO.  # noqa: E501


        :return: The update_transactions of this RoundupCO.  # noqa: E501
        :rtype: bool
        """
        return self._update_transactions

    @update_transactions.setter
    def update_transactions(self, update_transactions):
        """Sets the update_transactions of this RoundupCO.


        :param update_transactions: The update_transactions of this RoundupCO.  # noqa: E501
        :type: bool
        """

        self._update_transactions = update_transactions

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
        if issubclass(RoundupCO, dict):
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
        if not isinstance(other, RoundupCO):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
