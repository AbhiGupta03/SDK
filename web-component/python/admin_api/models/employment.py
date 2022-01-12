# coding: utf-8

"""
    Hydrogen Admin API

    The Hydrogen Admin API  # noqa: E501

    OpenAPI spec version: 1.0.0
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from admin_api.configuration import Configuration


class Employment(object):
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
        'employer': 'str',
        'employment_status': 'str',
        'job_title': 'str',
        'occupation': 'str'
    }

    attribute_map = {
        'employer': 'employer',
        'employment_status': 'employment_status',
        'job_title': 'job_title',
        'occupation': 'occupation'
    }

    def __init__(self, employer=None, employment_status=None, job_title=None, occupation=None, _configuration=None):  # noqa: E501
        """Employment - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._employer = None
        self._employment_status = None
        self._job_title = None
        self._occupation = None
        self.discriminator = None

        if employer is not None:
            self.employer = employer
        if employment_status is not None:
            self.employment_status = employment_status
        if job_title is not None:
            self.job_title = job_title
        if occupation is not None:
            self.occupation = occupation

    @property
    def employer(self):
        """Gets the employer of this Employment.  # noqa: E501

        employer  # noqa: E501

        :return: The employer of this Employment.  # noqa: E501
        :rtype: str
        """
        return self._employer

    @employer.setter
    def employer(self, employer):
        """Sets the employer of this Employment.

        employer  # noqa: E501

        :param employer: The employer of this Employment.  # noqa: E501
        :type: str
        """

        self._employer = employer

    @property
    def employment_status(self):
        """Gets the employment_status of this Employment.  # noqa: E501

        employmentStatus  # noqa: E501

        :return: The employment_status of this Employment.  # noqa: E501
        :rtype: str
        """
        return self._employment_status

    @employment_status.setter
    def employment_status(self, employment_status):
        """Sets the employment_status of this Employment.

        employmentStatus  # noqa: E501

        :param employment_status: The employment_status of this Employment.  # noqa: E501
        :type: str
        """

        self._employment_status = employment_status

    @property
    def job_title(self):
        """Gets the job_title of this Employment.  # noqa: E501

        jobTitle  # noqa: E501

        :return: The job_title of this Employment.  # noqa: E501
        :rtype: str
        """
        return self._job_title

    @job_title.setter
    def job_title(self, job_title):
        """Sets the job_title of this Employment.

        jobTitle  # noqa: E501

        :param job_title: The job_title of this Employment.  # noqa: E501
        :type: str
        """

        self._job_title = job_title

    @property
    def occupation(self):
        """Gets the occupation of this Employment.  # noqa: E501

        occupation  # noqa: E501

        :return: The occupation of this Employment.  # noqa: E501
        :rtype: str
        """
        return self._occupation

    @occupation.setter
    def occupation(self, occupation):
        """Sets the occupation of this Employment.

        occupation  # noqa: E501

        :param occupation: The occupation of this Employment.  # noqa: E501
        :type: str
        """

        self._occupation = occupation

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
        if issubclass(Employment, dict):
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
        if not isinstance(other, Employment):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, Employment):
            return True

        return self.to_dict() != other.to_dict()
