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


class ModelHolding(object):
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
        'current_weight': 'float',
        '_date': 'date',
        'drift_factor': 'float',
        'id': 'str',
        'is_cash': 'bool',
        'is_initial_holding': 'bool',
        'is_safe_security': 'bool',
        'metadata': 'dict(str, str)',
        'model_description': 'str',
        'model_id': 'str',
        'model_name': 'str',
        'model_weight': 'float',
        'sec_price': 'float',
        'secondary_id': 'str',
        'security_id': 'str',
        'strategic_weight': 'float',
        'update_date': 'datetime'
    }

    attribute_map = {
        'create_date': 'create_date',
        'current_weight': 'current_weight',
        '_date': 'date',
        'drift_factor': 'drift_factor',
        'id': 'id',
        'is_cash': 'is_cash',
        'is_initial_holding': 'is_initial_holding',
        'is_safe_security': 'is_safe_security',
        'metadata': 'metadata',
        'model_description': 'model_description',
        'model_id': 'model_id',
        'model_name': 'model_name',
        'model_weight': 'model_weight',
        'sec_price': 'sec_price',
        'secondary_id': 'secondary_id',
        'security_id': 'security_id',
        'strategic_weight': 'strategic_weight',
        'update_date': 'update_date'
    }

    def __init__(self, create_date=None, current_weight=None, _date=None, drift_factor=None, id=None, is_cash=None, is_initial_holding=None, is_safe_security=None, metadata=None, model_description=None, model_id=None, model_name=None, model_weight=None, sec_price=None, secondary_id=None, security_id=None, strategic_weight=None, update_date=None):  # noqa: E501
        """ModelHolding - a model defined in Swagger"""  # noqa: E501

        self._create_date = None
        self._current_weight = None
        self.__date = None
        self._drift_factor = None
        self._id = None
        self._is_cash = None
        self._is_initial_holding = None
        self._is_safe_security = None
        self._metadata = None
        self._model_description = None
        self._model_id = None
        self._model_name = None
        self._model_weight = None
        self._sec_price = None
        self._secondary_id = None
        self._security_id = None
        self._strategic_weight = None
        self._update_date = None
        self.discriminator = None

        if create_date is not None:
            self.create_date = create_date
        self.current_weight = current_weight
        self._date = _date
        if drift_factor is not None:
            self.drift_factor = drift_factor
        if id is not None:
            self.id = id
        if is_cash is not None:
            self.is_cash = is_cash
        if is_initial_holding is not None:
            self.is_initial_holding = is_initial_holding
        if is_safe_security is not None:
            self.is_safe_security = is_safe_security
        if metadata is not None:
            self.metadata = metadata
        if model_description is not None:
            self.model_description = model_description
        self.model_id = model_id
        if model_name is not None:
            self.model_name = model_name
        if model_weight is not None:
            self.model_weight = model_weight
        if sec_price is not None:
            self.sec_price = sec_price
        if secondary_id is not None:
            self.secondary_id = secondary_id
        self.security_id = security_id
        self.strategic_weight = strategic_weight
        if update_date is not None:
            self.update_date = update_date

    @property
    def create_date(self):
        """Gets the create_date of this ModelHolding.  # noqa: E501


        :return: The create_date of this ModelHolding.  # noqa: E501
        :rtype: datetime
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date):
        """Sets the create_date of this ModelHolding.


        :param create_date: The create_date of this ModelHolding.  # noqa: E501
        :type: datetime
        """

        self._create_date = create_date

    @property
    def current_weight(self):
        """Gets the current_weight of this ModelHolding.  # noqa: E501

        Model Holding current weight  # noqa: E501

        :return: The current_weight of this ModelHolding.  # noqa: E501
        :rtype: float
        """
        return self._current_weight

    @current_weight.setter
    def current_weight(self, current_weight):
        """Sets the current_weight of this ModelHolding.

        Model Holding current weight  # noqa: E501

        :param current_weight: The current_weight of this ModelHolding.  # noqa: E501
        :type: float
        """
        if current_weight is None:
            raise ValueError("Invalid value for `current_weight`, must not be `None`")  # noqa: E501

        self._current_weight = current_weight

    @property
    def _date(self):
        """Gets the _date of this ModelHolding.  # noqa: E501

        Model Holding date  # noqa: E501

        :return: The _date of this ModelHolding.  # noqa: E501
        :rtype: date
        """
        return self.__date

    @_date.setter
    def _date(self, _date):
        """Sets the _date of this ModelHolding.

        Model Holding date  # noqa: E501

        :param _date: The _date of this ModelHolding.  # noqa: E501
        :type: date
        """
        if _date is None:
            raise ValueError("Invalid value for `_date`, must not be `None`")  # noqa: E501

        self.__date = _date

    @property
    def drift_factor(self):
        """Gets the drift_factor of this ModelHolding.  # noqa: E501

        driftFactor  # noqa: E501

        :return: The drift_factor of this ModelHolding.  # noqa: E501
        :rtype: float
        """
        return self._drift_factor

    @drift_factor.setter
    def drift_factor(self, drift_factor):
        """Sets the drift_factor of this ModelHolding.

        driftFactor  # noqa: E501

        :param drift_factor: The drift_factor of this ModelHolding.  # noqa: E501
        :type: float
        """

        self._drift_factor = drift_factor

    @property
    def id(self):
        """Gets the id of this ModelHolding.  # noqa: E501


        :return: The id of this ModelHolding.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this ModelHolding.


        :param id: The id of this ModelHolding.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def is_cash(self):
        """Gets the is_cash of this ModelHolding.  # noqa: E501

        isCash  # noqa: E501

        :return: The is_cash of this ModelHolding.  # noqa: E501
        :rtype: bool
        """
        return self._is_cash

    @is_cash.setter
    def is_cash(self, is_cash):
        """Sets the is_cash of this ModelHolding.

        isCash  # noqa: E501

        :param is_cash: The is_cash of this ModelHolding.  # noqa: E501
        :type: bool
        """

        self._is_cash = is_cash

    @property
    def is_initial_holding(self):
        """Gets the is_initial_holding of this ModelHolding.  # noqa: E501

        isInitialHolding  # noqa: E501

        :return: The is_initial_holding of this ModelHolding.  # noqa: E501
        :rtype: bool
        """
        return self._is_initial_holding

    @is_initial_holding.setter
    def is_initial_holding(self, is_initial_holding):
        """Sets the is_initial_holding of this ModelHolding.

        isInitialHolding  # noqa: E501

        :param is_initial_holding: The is_initial_holding of this ModelHolding.  # noqa: E501
        :type: bool
        """

        self._is_initial_holding = is_initial_holding

    @property
    def is_safe_security(self):
        """Gets the is_safe_security of this ModelHolding.  # noqa: E501

        isSafeSecurity  # noqa: E501

        :return: The is_safe_security of this ModelHolding.  # noqa: E501
        :rtype: bool
        """
        return self._is_safe_security

    @is_safe_security.setter
    def is_safe_security(self, is_safe_security):
        """Sets the is_safe_security of this ModelHolding.

        isSafeSecurity  # noqa: E501

        :param is_safe_security: The is_safe_security of this ModelHolding.  # noqa: E501
        :type: bool
        """

        self._is_safe_security = is_safe_security

    @property
    def metadata(self):
        """Gets the metadata of this ModelHolding.  # noqa: E501


        :return: The metadata of this ModelHolding.  # noqa: E501
        :rtype: dict(str, str)
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata):
        """Sets the metadata of this ModelHolding.


        :param metadata: The metadata of this ModelHolding.  # noqa: E501
        :type: dict(str, str)
        """

        self._metadata = metadata

    @property
    def model_description(self):
        """Gets the model_description of this ModelHolding.  # noqa: E501


        :return: The model_description of this ModelHolding.  # noqa: E501
        :rtype: str
        """
        return self._model_description

    @model_description.setter
    def model_description(self, model_description):
        """Sets the model_description of this ModelHolding.


        :param model_description: The model_description of this ModelHolding.  # noqa: E501
        :type: str
        """

        self._model_description = model_description

    @property
    def model_id(self):
        """Gets the model_id of this ModelHolding.  # noqa: E501

        modelId  # noqa: E501

        :return: The model_id of this ModelHolding.  # noqa: E501
        :rtype: str
        """
        return self._model_id

    @model_id.setter
    def model_id(self, model_id):
        """Sets the model_id of this ModelHolding.

        modelId  # noqa: E501

        :param model_id: The model_id of this ModelHolding.  # noqa: E501
        :type: str
        """
        if model_id is None:
            raise ValueError("Invalid value for `model_id`, must not be `None`")  # noqa: E501

        self._model_id = model_id

    @property
    def model_name(self):
        """Gets the model_name of this ModelHolding.  # noqa: E501


        :return: The model_name of this ModelHolding.  # noqa: E501
        :rtype: str
        """
        return self._model_name

    @model_name.setter
    def model_name(self, model_name):
        """Sets the model_name of this ModelHolding.


        :param model_name: The model_name of this ModelHolding.  # noqa: E501
        :type: str
        """

        self._model_name = model_name

    @property
    def model_weight(self):
        """Gets the model_weight of this ModelHolding.  # noqa: E501


        :return: The model_weight of this ModelHolding.  # noqa: E501
        :rtype: float
        """
        return self._model_weight

    @model_weight.setter
    def model_weight(self, model_weight):
        """Sets the model_weight of this ModelHolding.


        :param model_weight: The model_weight of this ModelHolding.  # noqa: E501
        :type: float
        """

        self._model_weight = model_weight

    @property
    def sec_price(self):
        """Gets the sec_price of this ModelHolding.  # noqa: E501


        :return: The sec_price of this ModelHolding.  # noqa: E501
        :rtype: float
        """
        return self._sec_price

    @sec_price.setter
    def sec_price(self, sec_price):
        """Sets the sec_price of this ModelHolding.


        :param sec_price: The sec_price of this ModelHolding.  # noqa: E501
        :type: float
        """

        self._sec_price = sec_price

    @property
    def secondary_id(self):
        """Gets the secondary_id of this ModelHolding.  # noqa: E501


        :return: The secondary_id of this ModelHolding.  # noqa: E501
        :rtype: str
        """
        return self._secondary_id

    @secondary_id.setter
    def secondary_id(self, secondary_id):
        """Sets the secondary_id of this ModelHolding.


        :param secondary_id: The secondary_id of this ModelHolding.  # noqa: E501
        :type: str
        """

        self._secondary_id = secondary_id

    @property
    def security_id(self):
        """Gets the security_id of this ModelHolding.  # noqa: E501

        securityId  # noqa: E501

        :return: The security_id of this ModelHolding.  # noqa: E501
        :rtype: str
        """
        return self._security_id

    @security_id.setter
    def security_id(self, security_id):
        """Sets the security_id of this ModelHolding.

        securityId  # noqa: E501

        :param security_id: The security_id of this ModelHolding.  # noqa: E501
        :type: str
        """
        if security_id is None:
            raise ValueError("Invalid value for `security_id`, must not be `None`")  # noqa: E501

        self._security_id = security_id

    @property
    def strategic_weight(self):
        """Gets the strategic_weight of this ModelHolding.  # noqa: E501

        Model Holding strategicWeight  # noqa: E501

        :return: The strategic_weight of this ModelHolding.  # noqa: E501
        :rtype: float
        """
        return self._strategic_weight

    @strategic_weight.setter
    def strategic_weight(self, strategic_weight):
        """Sets the strategic_weight of this ModelHolding.

        Model Holding strategicWeight  # noqa: E501

        :param strategic_weight: The strategic_weight of this ModelHolding.  # noqa: E501
        :type: float
        """
        if strategic_weight is None:
            raise ValueError("Invalid value for `strategic_weight`, must not be `None`")  # noqa: E501

        self._strategic_weight = strategic_weight

    @property
    def update_date(self):
        """Gets the update_date of this ModelHolding.  # noqa: E501


        :return: The update_date of this ModelHolding.  # noqa: E501
        :rtype: datetime
        """
        return self._update_date

    @update_date.setter
    def update_date(self, update_date):
        """Sets the update_date of this ModelHolding.


        :param update_date: The update_date of this ModelHolding.  # noqa: E501
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
        if issubclass(ModelHolding, dict):
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
        if not isinstance(other, ModelHolding):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
