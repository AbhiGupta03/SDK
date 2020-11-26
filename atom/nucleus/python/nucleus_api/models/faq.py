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


class Faq(object):
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
        'answer': 'str',
        'category': 'str',
        'create_date': 'datetime',
        'faq_keywords': 'list[FAQKeyword]',
        'id': 'str',
        'is_active': 'bool',
        'is_featured': 'bool',
        'metadata': 'dict(str, str)',
        'number': 'int',
        'question': 'str',
        'secondary_id': 'str',
        'seo_name': 'str',
        'subcategory': 'str',
        'update_date': 'datetime'
    }

    attribute_map = {
        'answer': 'answer',
        'category': 'category',
        'create_date': 'create_date',
        'faq_keywords': 'faq_keywords',
        'id': 'id',
        'is_active': 'is_active',
        'is_featured': 'is_featured',
        'metadata': 'metadata',
        'number': 'number',
        'question': 'question',
        'secondary_id': 'secondary_id',
        'seo_name': 'seo_name',
        'subcategory': 'subcategory',
        'update_date': 'update_date'
    }

    def __init__(self, answer=None, category=None, create_date=None, faq_keywords=None, id=None, is_active=None, is_featured=None, metadata=None, number=None, question=None, secondary_id=None, seo_name=None, subcategory=None, update_date=None):  # noqa: E501
        """Faq - a model defined in Swagger"""  # noqa: E501

        self._answer = None
        self._category = None
        self._create_date = None
        self._faq_keywords = None
        self._id = None
        self._is_active = None
        self._is_featured = None
        self._metadata = None
        self._number = None
        self._question = None
        self._secondary_id = None
        self._seo_name = None
        self._subcategory = None
        self._update_date = None
        self.discriminator = None

        self.answer = answer
        if category is not None:
            self.category = category
        if create_date is not None:
            self.create_date = create_date
        if faq_keywords is not None:
            self.faq_keywords = faq_keywords
        if id is not None:
            self.id = id
        if is_active is not None:
            self.is_active = is_active
        if is_featured is not None:
            self.is_featured = is_featured
        if metadata is not None:
            self.metadata = metadata
        if number is not None:
            self.number = number
        self.question = question
        if secondary_id is not None:
            self.secondary_id = secondary_id
        if seo_name is not None:
            self.seo_name = seo_name
        if subcategory is not None:
            self.subcategory = subcategory
        if update_date is not None:
            self.update_date = update_date

    @property
    def answer(self):
        """Gets the answer of this Faq.  # noqa: E501

        answer  # noqa: E501

        :return: The answer of this Faq.  # noqa: E501
        :rtype: str
        """
        return self._answer

    @answer.setter
    def answer(self, answer):
        """Sets the answer of this Faq.

        answer  # noqa: E501

        :param answer: The answer of this Faq.  # noqa: E501
        :type: str
        """
        if answer is None:
            raise ValueError("Invalid value for `answer`, must not be `None`")  # noqa: E501

        self._answer = answer

    @property
    def category(self):
        """Gets the category of this Faq.  # noqa: E501

        category  # noqa: E501

        :return: The category of this Faq.  # noqa: E501
        :rtype: str
        """
        return self._category

    @category.setter
    def category(self, category):
        """Sets the category of this Faq.

        category  # noqa: E501

        :param category: The category of this Faq.  # noqa: E501
        :type: str
        """

        self._category = category

    @property
    def create_date(self):
        """Gets the create_date of this Faq.  # noqa: E501


        :return: The create_date of this Faq.  # noqa: E501
        :rtype: datetime
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date):
        """Sets the create_date of this Faq.


        :param create_date: The create_date of this Faq.  # noqa: E501
        :type: datetime
        """

        self._create_date = create_date

    @property
    def faq_keywords(self):
        """Gets the faq_keywords of this Faq.  # noqa: E501


        :return: The faq_keywords of this Faq.  # noqa: E501
        :rtype: list[FAQKeyword]
        """
        return self._faq_keywords

    @faq_keywords.setter
    def faq_keywords(self, faq_keywords):
        """Sets the faq_keywords of this Faq.


        :param faq_keywords: The faq_keywords of this Faq.  # noqa: E501
        :type: list[FAQKeyword]
        """

        self._faq_keywords = faq_keywords

    @property
    def id(self):
        """Gets the id of this Faq.  # noqa: E501


        :return: The id of this Faq.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this Faq.


        :param id: The id of this Faq.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def is_active(self):
        """Gets the is_active of this Faq.  # noqa: E501

        isActive  # noqa: E501

        :return: The is_active of this Faq.  # noqa: E501
        :rtype: bool
        """
        return self._is_active

    @is_active.setter
    def is_active(self, is_active):
        """Sets the is_active of this Faq.

        isActive  # noqa: E501

        :param is_active: The is_active of this Faq.  # noqa: E501
        :type: bool
        """

        self._is_active = is_active

    @property
    def is_featured(self):
        """Gets the is_featured of this Faq.  # noqa: E501

        isFeatured  # noqa: E501

        :return: The is_featured of this Faq.  # noqa: E501
        :rtype: bool
        """
        return self._is_featured

    @is_featured.setter
    def is_featured(self, is_featured):
        """Sets the is_featured of this Faq.

        isFeatured  # noqa: E501

        :param is_featured: The is_featured of this Faq.  # noqa: E501
        :type: bool
        """

        self._is_featured = is_featured

    @property
    def metadata(self):
        """Gets the metadata of this Faq.  # noqa: E501


        :return: The metadata of this Faq.  # noqa: E501
        :rtype: dict(str, str)
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata):
        """Sets the metadata of this Faq.


        :param metadata: The metadata of this Faq.  # noqa: E501
        :type: dict(str, str)
        """

        self._metadata = metadata

    @property
    def number(self):
        """Gets the number of this Faq.  # noqa: E501

        number  # noqa: E501

        :return: The number of this Faq.  # noqa: E501
        :rtype: int
        """
        return self._number

    @number.setter
    def number(self, number):
        """Sets the number of this Faq.

        number  # noqa: E501

        :param number: The number of this Faq.  # noqa: E501
        :type: int
        """

        self._number = number

    @property
    def question(self):
        """Gets the question of this Faq.  # noqa: E501

        question  # noqa: E501

        :return: The question of this Faq.  # noqa: E501
        :rtype: str
        """
        return self._question

    @question.setter
    def question(self, question):
        """Sets the question of this Faq.

        question  # noqa: E501

        :param question: The question of this Faq.  # noqa: E501
        :type: str
        """
        if question is None:
            raise ValueError("Invalid value for `question`, must not be `None`")  # noqa: E501

        self._question = question

    @property
    def secondary_id(self):
        """Gets the secondary_id of this Faq.  # noqa: E501


        :return: The secondary_id of this Faq.  # noqa: E501
        :rtype: str
        """
        return self._secondary_id

    @secondary_id.setter
    def secondary_id(self, secondary_id):
        """Sets the secondary_id of this Faq.


        :param secondary_id: The secondary_id of this Faq.  # noqa: E501
        :type: str
        """

        self._secondary_id = secondary_id

    @property
    def seo_name(self):
        """Gets the seo_name of this Faq.  # noqa: E501

        seoName  # noqa: E501

        :return: The seo_name of this Faq.  # noqa: E501
        :rtype: str
        """
        return self._seo_name

    @seo_name.setter
    def seo_name(self, seo_name):
        """Sets the seo_name of this Faq.

        seoName  # noqa: E501

        :param seo_name: The seo_name of this Faq.  # noqa: E501
        :type: str
        """

        self._seo_name = seo_name

    @property
    def subcategory(self):
        """Gets the subcategory of this Faq.  # noqa: E501

        subcategory  # noqa: E501

        :return: The subcategory of this Faq.  # noqa: E501
        :rtype: str
        """
        return self._subcategory

    @subcategory.setter
    def subcategory(self, subcategory):
        """Sets the subcategory of this Faq.

        subcategory  # noqa: E501

        :param subcategory: The subcategory of this Faq.  # noqa: E501
        :type: str
        """

        self._subcategory = subcategory

    @property
    def update_date(self):
        """Gets the update_date of this Faq.  # noqa: E501


        :return: The update_date of this Faq.  # noqa: E501
        :rtype: datetime
        """
        return self._update_date

    @update_date.setter
    def update_date(self, update_date):
        """Sets the update_date of this Faq.


        :param update_date: The update_date of this Faq.  # noqa: E501
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
        if issubclass(Faq, dict):
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
        if not isinstance(other, Faq):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
