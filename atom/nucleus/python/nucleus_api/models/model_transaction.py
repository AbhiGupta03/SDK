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


class ModelTransaction(object):
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
        '_date': 'date',
        'id': 'str',
        'model_id': 'str',
        'price': 'float',
        'secondary_id': 'str',
        'security_id': 'str',
        'shares': 'float',
        'transaction_code_id': 'str',
        'update_date': 'datetime'
    }

    attribute_map = {
        'create_date': 'create_date',
        '_date': 'date',
        'id': 'id',
        'model_id': 'model_id',
        'price': 'price',
        'secondary_id': 'secondary_id',
        'security_id': 'security_id',
        'shares': 'shares',
        'transaction_code_id': 'transaction_code_id',
        'update_date': 'update_date'
    }

    def __init__(self, create_date=None, _date=None, id=None, model_id=None, price=None, secondary_id=None, security_id=None, shares=None, transaction_code_id=None, update_date=None):  # noqa: E501
        """ModelTransaction - a model defined in Swagger"""  # noqa: E501

        self._create_date = None
        self.__date = None
        self._id = None
        self._model_id = None
        self._price = None
        self._secondary_id = None
        self._security_id = None
        self._shares = None
        self._transaction_code_id = None
        self._update_date = None
        self.discriminator = None

        if create_date is not None:
            self.create_date = create_date
        self._date = _date
        if id is not None:
            self.id = id
        self.model_id = model_id
        self.price = price
        if secondary_id is not None:
            self.secondary_id = secondary_id
        self.security_id = security_id
        self.shares = shares
        self.transaction_code_id = transaction_code_id
        if update_date is not None:
            self.update_date = update_date

    @property
    def create_date(self):
        """Gets the create_date of this ModelTransaction.  # noqa: E501


        :return: The create_date of this ModelTransaction.  # noqa: E501
        :rtype: datetime
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date):
        """Sets the create_date of this ModelTransaction.


        :param create_date: The create_date of this ModelTransaction.  # noqa: E501
        :type: datetime
        """

        self._create_date = create_date

    @property
    def _date(self):
        """Gets the _date of this ModelTransaction.  # noqa: E501

        Date  # noqa: E501

        :return: The _date of this ModelTransaction.  # noqa: E501
        :rtype: date
        """
        return self.__date

    @_date.setter
    def _date(self, _date):
        """Sets the _date of this ModelTransaction.

        Date  # noqa: E501

        :param _date: The _date of this ModelTransaction.  # noqa: E501
        :type: date
        """
        if _date is None:
            raise ValueError("Invalid value for `_date`, must not be `None`")  # noqa: E501

        self.__date = _date

    @property
    def id(self):
        """Gets the id of this ModelTransaction.  # noqa: E501


        :return: The id of this ModelTransaction.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this ModelTransaction.


        :param id: The id of this ModelTransaction.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def model_id(self):
        """Gets the model_id of this ModelTransaction.  # noqa: E501

        modelId  # noqa: E501

        :return: The model_id of this ModelTransaction.  # noqa: E501
        :rtype: str
        """
        return self._model_id

    @model_id.setter
    def model_id(self, model_id):
        """Sets the model_id of this ModelTransaction.

        modelId  # noqa: E501

        :param model_id: The model_id of this ModelTransaction.  # noqa: E501
        :type: str
        """
        if model_id is None:
            raise ValueError("Invalid value for `model_id`, must not be `None`")  # noqa: E501

        self._model_id = model_id

    @property
    def price(self):
        """Gets the price of this ModelTransaction.  # noqa: E501

        price  # noqa: E501

        :return: The price of this ModelTransaction.  # noqa: E501
        :rtype: float
        """
        return self._price

    @price.setter
    def price(self, price):
        """Sets the price of this ModelTransaction.

        price  # noqa: E501

        :param price: The price of this ModelTransaction.  # noqa: E501
        :type: float
        """
        if price is None:
            raise ValueError("Invalid value for `price`, must not be `None`")  # noqa: E501

        self._price = price

    @property
    def secondary_id(self):
        """Gets the secondary_id of this ModelTransaction.  # noqa: E501


        :return: The secondary_id of this ModelTransaction.  # noqa: E501
        :rtype: str
        """
        return self._secondary_id

    @secondary_id.setter
    def secondary_id(self, secondary_id):
        """Sets the secondary_id of this ModelTransaction.


        :param secondary_id: The secondary_id of this ModelTransaction.  # noqa: E501
        :type: str
        """

        self._secondary_id = secondary_id

    @property
    def security_id(self):
        """Gets the security_id of this ModelTransaction.  # noqa: E501

        securityId  # noqa: E501

        :return: The security_id of this ModelTransaction.  # noqa: E501
        :rtype: str
        """
        return self._security_id

    @security_id.setter
    def security_id(self, security_id):
        """Sets the security_id of this ModelTransaction.

        securityId  # noqa: E501

        :param security_id: The security_id of this ModelTransaction.  # noqa: E501
        :type: str
        """
        if security_id is None:
            raise ValueError("Invalid value for `security_id`, must not be `None`")  # noqa: E501

        self._security_id = security_id

    @property
    def shares(self):
        """Gets the shares of this ModelTransaction.  # noqa: E501

        shares  # noqa: E501

        :return: The shares of this ModelTransaction.  # noqa: E501
        :rtype: float
        """
        return self._shares

    @shares.setter
    def shares(self, shares):
        """Sets the shares of this ModelTransaction.

        shares  # noqa: E501

        :param shares: The shares of this ModelTransaction.  # noqa: E501
        :type: float
        """
        if shares is None:
            raise ValueError("Invalid value for `shares`, must not be `None`")  # noqa: E501

        self._shares = shares

    @property
    def transaction_code_id(self):
        """Gets the transaction_code_id of this ModelTransaction.  # noqa: E501

        transactionCodeId  # noqa: E501

        :return: The transaction_code_id of this ModelTransaction.  # noqa: E501
        :rtype: str
        """
        return self._transaction_code_id

    @transaction_code_id.setter
    def transaction_code_id(self, transaction_code_id):
        """Sets the transaction_code_id of this ModelTransaction.

        transactionCodeId  # noqa: E501

        :param transaction_code_id: The transaction_code_id of this ModelTransaction.  # noqa: E501
        :type: str
        """
        if transaction_code_id is None:
            raise ValueError("Invalid value for `transaction_code_id`, must not be `None`")  # noqa: E501

        self._transaction_code_id = transaction_code_id

    @property
    def update_date(self):
        """Gets the update_date of this ModelTransaction.  # noqa: E501


        :return: The update_date of this ModelTransaction.  # noqa: E501
        :rtype: datetime
        """
        return self._update_date

    @update_date.setter
    def update_date(self, update_date):
        """Sets the update_date of this ModelTransaction.


        :param update_date: The update_date of this ModelTransaction.  # noqa: E501
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
        if issubclass(ModelTransaction, dict):
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
        if not isinstance(other, ModelTransaction):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
