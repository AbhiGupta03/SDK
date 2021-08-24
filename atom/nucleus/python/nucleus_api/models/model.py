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


class Model(object):
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
        'benchmark_id': 'str',
        'cash_sec': 'str',
        'category': 'str',
        'client_id': 'str',
        'create_date': 'datetime',
        'currency_code': 'str',
        'default_drift_factor': 'float',
        'description': 'str',
        'downside': 'bool',
        'drift_rebal': 'bool',
        'id': 'str',
        'is_active': 'bool',
        'metadata': 'dict(str, str)',
        'name': 'str',
        'node_map': 'list[AllocationNodeMap]',
        'period_rebal': 'bool',
        'rebalance_period': 'int',
        'safe_sec': 'str',
        'sec_rotation': 'bool',
        'secondary_id': 'str',
        'tax_efficiency_id': 'int',
        'update_date': 'datetime'
    }

    attribute_map = {
        'benchmark_id': 'benchmark_id',
        'cash_sec': 'cash_sec',
        'category': 'category',
        'client_id': 'client_id',
        'create_date': 'create_date',
        'currency_code': 'currency_code',
        'default_drift_factor': 'default_drift_factor',
        'description': 'description',
        'downside': 'downside',
        'drift_rebal': 'drift_rebal',
        'id': 'id',
        'is_active': 'is_active',
        'metadata': 'metadata',
        'name': 'name',
        'node_map': 'node_map',
        'period_rebal': 'period_rebal',
        'rebalance_period': 'rebalance_period',
        'safe_sec': 'safe_sec',
        'sec_rotation': 'sec_rotation',
        'secondary_id': 'secondary_id',
        'tax_efficiency_id': 'tax_efficiency_id',
        'update_date': 'update_date'
    }

    def __init__(self, benchmark_id=None, cash_sec=None, category=None, client_id=None, create_date=None, currency_code=None, default_drift_factor=None, description=None, downside=None, drift_rebal=None, id=None, is_active=None, metadata=None, name=None, node_map=None, period_rebal=None, rebalance_period=None, safe_sec=None, sec_rotation=None, secondary_id=None, tax_efficiency_id=None, update_date=None, _configuration=None):  # noqa: E501
        """Model - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._benchmark_id = None
        self._cash_sec = None
        self._category = None
        self._client_id = None
        self._create_date = None
        self._currency_code = None
        self._default_drift_factor = None
        self._description = None
        self._downside = None
        self._drift_rebal = None
        self._id = None
        self._is_active = None
        self._metadata = None
        self._name = None
        self._node_map = None
        self._period_rebal = None
        self._rebalance_period = None
        self._safe_sec = None
        self._sec_rotation = None
        self._secondary_id = None
        self._tax_efficiency_id = None
        self._update_date = None
        self.discriminator = None

        if benchmark_id is not None:
            self.benchmark_id = benchmark_id
        if cash_sec is not None:
            self.cash_sec = cash_sec
        if category is not None:
            self.category = category
        if client_id is not None:
            self.client_id = client_id
        if create_date is not None:
            self.create_date = create_date
        if currency_code is not None:
            self.currency_code = currency_code
        if default_drift_factor is not None:
            self.default_drift_factor = default_drift_factor
        if description is not None:
            self.description = description
        if downside is not None:
            self.downside = downside
        if drift_rebal is not None:
            self.drift_rebal = drift_rebal
        if id is not None:
            self.id = id
        if is_active is not None:
            self.is_active = is_active
        if metadata is not None:
            self.metadata = metadata
        self.name = name
        if node_map is not None:
            self.node_map = node_map
        if period_rebal is not None:
            self.period_rebal = period_rebal
        if rebalance_period is not None:
            self.rebalance_period = rebalance_period
        if safe_sec is not None:
            self.safe_sec = safe_sec
        if sec_rotation is not None:
            self.sec_rotation = sec_rotation
        if secondary_id is not None:
            self.secondary_id = secondary_id
        if tax_efficiency_id is not None:
            self.tax_efficiency_id = tax_efficiency_id
        if update_date is not None:
            self.update_date = update_date

    @property
    def benchmark_id(self):
        """Gets the benchmark_id of this Model.  # noqa: E501

        benchmarkId  # noqa: E501

        :return: The benchmark_id of this Model.  # noqa: E501
        :rtype: str
        """
        return self._benchmark_id

    @benchmark_id.setter
    def benchmark_id(self, benchmark_id):
        """Sets the benchmark_id of this Model.

        benchmarkId  # noqa: E501

        :param benchmark_id: The benchmark_id of this Model.  # noqa: E501
        :type: str
        """

        self._benchmark_id = benchmark_id

    @property
    def cash_sec(self):
        """Gets the cash_sec of this Model.  # noqa: E501

        cashSec  # noqa: E501

        :return: The cash_sec of this Model.  # noqa: E501
        :rtype: str
        """
        return self._cash_sec

    @cash_sec.setter
    def cash_sec(self, cash_sec):
        """Sets the cash_sec of this Model.

        cashSec  # noqa: E501

        :param cash_sec: The cash_sec of this Model.  # noqa: E501
        :type: str
        """

        self._cash_sec = cash_sec

    @property
    def category(self):
        """Gets the category of this Model.  # noqa: E501

        category  # noqa: E501

        :return: The category of this Model.  # noqa: E501
        :rtype: str
        """
        return self._category

    @category.setter
    def category(self, category):
        """Sets the category of this Model.

        category  # noqa: E501

        :param category: The category of this Model.  # noqa: E501
        :type: str
        """

        self._category = category

    @property
    def client_id(self):
        """Gets the client_id of this Model.  # noqa: E501

        clientId  # noqa: E501

        :return: The client_id of this Model.  # noqa: E501
        :rtype: str
        """
        return self._client_id

    @client_id.setter
    def client_id(self, client_id):
        """Sets the client_id of this Model.

        clientId  # noqa: E501

        :param client_id: The client_id of this Model.  # noqa: E501
        :type: str
        """

        self._client_id = client_id

    @property
    def create_date(self):
        """Gets the create_date of this Model.  # noqa: E501


        :return: The create_date of this Model.  # noqa: E501
        :rtype: datetime
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date):
        """Sets the create_date of this Model.


        :param create_date: The create_date of this Model.  # noqa: E501
        :type: datetime
        """

        self._create_date = create_date

    @property
    def currency_code(self):
        """Gets the currency_code of this Model.  # noqa: E501

        currency_code  # noqa: E501

        :return: The currency_code of this Model.  # noqa: E501
        :rtype: str
        """
        return self._currency_code

    @currency_code.setter
    def currency_code(self, currency_code):
        """Sets the currency_code of this Model.

        currency_code  # noqa: E501

        :param currency_code: The currency_code of this Model.  # noqa: E501
        :type: str
        """

        self._currency_code = currency_code

    @property
    def default_drift_factor(self):
        """Gets the default_drift_factor of this Model.  # noqa: E501

        defaultDriftFactor  # noqa: E501

        :return: The default_drift_factor of this Model.  # noqa: E501
        :rtype: float
        """
        return self._default_drift_factor

    @default_drift_factor.setter
    def default_drift_factor(self, default_drift_factor):
        """Sets the default_drift_factor of this Model.

        defaultDriftFactor  # noqa: E501

        :param default_drift_factor: The default_drift_factor of this Model.  # noqa: E501
        :type: float
        """

        self._default_drift_factor = default_drift_factor

    @property
    def description(self):
        """Gets the description of this Model.  # noqa: E501

        description  # noqa: E501

        :return: The description of this Model.  # noqa: E501
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this Model.

        description  # noqa: E501

        :param description: The description of this Model.  # noqa: E501
        :type: str
        """

        self._description = description

    @property
    def downside(self):
        """Gets the downside of this Model.  # noqa: E501

        downside  # noqa: E501

        :return: The downside of this Model.  # noqa: E501
        :rtype: bool
        """
        return self._downside

    @downside.setter
    def downside(self, downside):
        """Sets the downside of this Model.

        downside  # noqa: E501

        :param downside: The downside of this Model.  # noqa: E501
        :type: bool
        """

        self._downside = downside

    @property
    def drift_rebal(self):
        """Gets the drift_rebal of this Model.  # noqa: E501

        driftRebal  # noqa: E501

        :return: The drift_rebal of this Model.  # noqa: E501
        :rtype: bool
        """
        return self._drift_rebal

    @drift_rebal.setter
    def drift_rebal(self, drift_rebal):
        """Sets the drift_rebal of this Model.

        driftRebal  # noqa: E501

        :param drift_rebal: The drift_rebal of this Model.  # noqa: E501
        :type: bool
        """

        self._drift_rebal = drift_rebal

    @property
    def id(self):
        """Gets the id of this Model.  # noqa: E501


        :return: The id of this Model.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this Model.


        :param id: The id of this Model.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def is_active(self):
        """Gets the is_active of this Model.  # noqa: E501

        isActive  # noqa: E501

        :return: The is_active of this Model.  # noqa: E501
        :rtype: bool
        """
        return self._is_active

    @is_active.setter
    def is_active(self, is_active):
        """Sets the is_active of this Model.

        isActive  # noqa: E501

        :param is_active: The is_active of this Model.  # noqa: E501
        :type: bool
        """

        self._is_active = is_active

    @property
    def metadata(self):
        """Gets the metadata of this Model.  # noqa: E501


        :return: The metadata of this Model.  # noqa: E501
        :rtype: dict(str, str)
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata):
        """Sets the metadata of this Model.


        :param metadata: The metadata of this Model.  # noqa: E501
        :type: dict(str, str)
        """

        self._metadata = metadata

    @property
    def name(self):
        """Gets the name of this Model.  # noqa: E501

        name  # noqa: E501

        :return: The name of this Model.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this Model.

        name  # noqa: E501

        :param name: The name of this Model.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def node_map(self):
        """Gets the node_map of this Model.  # noqa: E501


        :return: The node_map of this Model.  # noqa: E501
        :rtype: list[AllocationNodeMap]
        """
        return self._node_map

    @node_map.setter
    def node_map(self, node_map):
        """Sets the node_map of this Model.


        :param node_map: The node_map of this Model.  # noqa: E501
        :type: list[AllocationNodeMap]
        """

        self._node_map = node_map

    @property
    def period_rebal(self):
        """Gets the period_rebal of this Model.  # noqa: E501

        periodRebal  # noqa: E501

        :return: The period_rebal of this Model.  # noqa: E501
        :rtype: bool
        """
        return self._period_rebal

    @period_rebal.setter
    def period_rebal(self, period_rebal):
        """Sets the period_rebal of this Model.

        periodRebal  # noqa: E501

        :param period_rebal: The period_rebal of this Model.  # noqa: E501
        :type: bool
        """

        self._period_rebal = period_rebal

    @property
    def rebalance_period(self):
        """Gets the rebalance_period of this Model.  # noqa: E501

        rebalancePeriod  # noqa: E501

        :return: The rebalance_period of this Model.  # noqa: E501
        :rtype: int
        """
        return self._rebalance_period

    @rebalance_period.setter
    def rebalance_period(self, rebalance_period):
        """Sets the rebalance_period of this Model.

        rebalancePeriod  # noqa: E501

        :param rebalance_period: The rebalance_period of this Model.  # noqa: E501
        :type: int
        """

        self._rebalance_period = rebalance_period

    @property
    def safe_sec(self):
        """Gets the safe_sec of this Model.  # noqa: E501

        safeSec  # noqa: E501

        :return: The safe_sec of this Model.  # noqa: E501
        :rtype: str
        """
        return self._safe_sec

    @safe_sec.setter
    def safe_sec(self, safe_sec):
        """Sets the safe_sec of this Model.

        safeSec  # noqa: E501

        :param safe_sec: The safe_sec of this Model.  # noqa: E501
        :type: str
        """

        self._safe_sec = safe_sec

    @property
    def sec_rotation(self):
        """Gets the sec_rotation of this Model.  # noqa: E501

        secRotation  # noqa: E501

        :return: The sec_rotation of this Model.  # noqa: E501
        :rtype: bool
        """
        return self._sec_rotation

    @sec_rotation.setter
    def sec_rotation(self, sec_rotation):
        """Sets the sec_rotation of this Model.

        secRotation  # noqa: E501

        :param sec_rotation: The sec_rotation of this Model.  # noqa: E501
        :type: bool
        """

        self._sec_rotation = sec_rotation

    @property
    def secondary_id(self):
        """Gets the secondary_id of this Model.  # noqa: E501


        :return: The secondary_id of this Model.  # noqa: E501
        :rtype: str
        """
        return self._secondary_id

    @secondary_id.setter
    def secondary_id(self, secondary_id):
        """Sets the secondary_id of this Model.


        :param secondary_id: The secondary_id of this Model.  # noqa: E501
        :type: str
        """

        self._secondary_id = secondary_id

    @property
    def tax_efficiency_id(self):
        """Gets the tax_efficiency_id of this Model.  # noqa: E501

        taxEfficiencyId  # noqa: E501

        :return: The tax_efficiency_id of this Model.  # noqa: E501
        :rtype: int
        """
        return self._tax_efficiency_id

    @tax_efficiency_id.setter
    def tax_efficiency_id(self, tax_efficiency_id):
        """Sets the tax_efficiency_id of this Model.

        taxEfficiencyId  # noqa: E501

        :param tax_efficiency_id: The tax_efficiency_id of this Model.  # noqa: E501
        :type: int
        """

        self._tax_efficiency_id = tax_efficiency_id

    @property
    def update_date(self):
        """Gets the update_date of this Model.  # noqa: E501


        :return: The update_date of this Model.  # noqa: E501
        :rtype: datetime
        """
        return self._update_date

    @update_date.setter
    def update_date(self, update_date):
        """Sets the update_date of this Model.


        :param update_date: The update_date of this Model.  # noqa: E501
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
        if issubclass(Model, dict):
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
        if not isinstance(other, Model):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, Model):
            return True

        return self.to_dict() != other.to_dict()
