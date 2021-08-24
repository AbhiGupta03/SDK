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


class Invoice(object):
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
        'business_id': 'str',
        'client_id': 'str',
        'contact_id': 'str',
        'create_date': 'datetime',
        'currency_code': 'str',
        'department': 'str',
        'description': 'str',
        'document_id': 'str',
        'due_date': 'datetime',
        'id': 'str',
        'invoice_date': 'date',
        'invoice_name': 'str',
        'invoice_number': 'str',
        'is_active': 'bool',
        'is_bill': 'bool',
        'line_items': 'list[LineItems]',
        'metadata': 'dict(str, str)',
        'payment_instructions': 'str',
        'payment_terms': 'str',
        'secondary_id': 'str',
        'status': 'str',
        'total_amount': 'float',
        'total_discount': 'float',
        'total_due': 'float',
        'total_subtotal': 'float',
        'total_tax': 'float',
        'update_date': 'datetime'
    }

    attribute_map = {
        'business_id': 'business_id',
        'client_id': 'client_id',
        'contact_id': 'contact_id',
        'create_date': 'create_date',
        'currency_code': 'currency_code',
        'department': 'department',
        'description': 'description',
        'document_id': 'document_id',
        'due_date': 'due_date',
        'id': 'id',
        'invoice_date': 'invoice_date',
        'invoice_name': 'invoice_name',
        'invoice_number': 'invoice_number',
        'is_active': 'is_active',
        'is_bill': 'is_bill',
        'line_items': 'line_items',
        'metadata': 'metadata',
        'payment_instructions': 'payment_instructions',
        'payment_terms': 'payment_terms',
        'secondary_id': 'secondary_id',
        'status': 'status',
        'total_amount': 'total_amount',
        'total_discount': 'total_discount',
        'total_due': 'total_due',
        'total_subtotal': 'total_subtotal',
        'total_tax': 'total_tax',
        'update_date': 'update_date'
    }

    def __init__(self, business_id=None, client_id=None, contact_id=None, create_date=None, currency_code=None, department=None, description=None, document_id=None, due_date=None, id=None, invoice_date=None, invoice_name=None, invoice_number=None, is_active=None, is_bill=None, line_items=None, metadata=None, payment_instructions=None, payment_terms=None, secondary_id=None, status=None, total_amount=None, total_discount=None, total_due=None, total_subtotal=None, total_tax=None, update_date=None, _configuration=None):  # noqa: E501
        """Invoice - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._business_id = None
        self._client_id = None
        self._contact_id = None
        self._create_date = None
        self._currency_code = None
        self._department = None
        self._description = None
        self._document_id = None
        self._due_date = None
        self._id = None
        self._invoice_date = None
        self._invoice_name = None
        self._invoice_number = None
        self._is_active = None
        self._is_bill = None
        self._line_items = None
        self._metadata = None
        self._payment_instructions = None
        self._payment_terms = None
        self._secondary_id = None
        self._status = None
        self._total_amount = None
        self._total_discount = None
        self._total_due = None
        self._total_subtotal = None
        self._total_tax = None
        self._update_date = None
        self.discriminator = None

        if business_id is not None:
            self.business_id = business_id
        if client_id is not None:
            self.client_id = client_id
        self.contact_id = contact_id
        if create_date is not None:
            self.create_date = create_date
        self.currency_code = currency_code
        if department is not None:
            self.department = department
        if description is not None:
            self.description = description
        if document_id is not None:
            self.document_id = document_id
        self.due_date = due_date
        if id is not None:
            self.id = id
        self.invoice_date = invoice_date
        if invoice_name is not None:
            self.invoice_name = invoice_name
        self.invoice_number = invoice_number
        if is_active is not None:
            self.is_active = is_active
        if is_bill is not None:
            self.is_bill = is_bill
        if line_items is not None:
            self.line_items = line_items
        if metadata is not None:
            self.metadata = metadata
        if payment_instructions is not None:
            self.payment_instructions = payment_instructions
        if payment_terms is not None:
            self.payment_terms = payment_terms
        if secondary_id is not None:
            self.secondary_id = secondary_id
        if status is not None:
            self.status = status
        self.total_amount = total_amount
        if total_discount is not None:
            self.total_discount = total_discount
        if total_due is not None:
            self.total_due = total_due
        if total_subtotal is not None:
            self.total_subtotal = total_subtotal
        if total_tax is not None:
            self.total_tax = total_tax
        if update_date is not None:
            self.update_date = update_date

    @property
    def business_id(self):
        """Gets the business_id of this Invoice.  # noqa: E501

        businessId  # noqa: E501

        :return: The business_id of this Invoice.  # noqa: E501
        :rtype: str
        """
        return self._business_id

    @business_id.setter
    def business_id(self, business_id):
        """Sets the business_id of this Invoice.

        businessId  # noqa: E501

        :param business_id: The business_id of this Invoice.  # noqa: E501
        :type: str
        """

        self._business_id = business_id

    @property
    def client_id(self):
        """Gets the client_id of this Invoice.  # noqa: E501

        client_id  # noqa: E501

        :return: The client_id of this Invoice.  # noqa: E501
        :rtype: str
        """
        return self._client_id

    @client_id.setter
    def client_id(self, client_id):
        """Sets the client_id of this Invoice.

        client_id  # noqa: E501

        :param client_id: The client_id of this Invoice.  # noqa: E501
        :type: str
        """

        self._client_id = client_id

    @property
    def contact_id(self):
        """Gets the contact_id of this Invoice.  # noqa: E501

        contact_id  # noqa: E501

        :return: The contact_id of this Invoice.  # noqa: E501
        :rtype: str
        """
        return self._contact_id

    @contact_id.setter
    def contact_id(self, contact_id):
        """Sets the contact_id of this Invoice.

        contact_id  # noqa: E501

        :param contact_id: The contact_id of this Invoice.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and contact_id is None:
            raise ValueError("Invalid value for `contact_id`, must not be `None`")  # noqa: E501

        self._contact_id = contact_id

    @property
    def create_date(self):
        """Gets the create_date of this Invoice.  # noqa: E501


        :return: The create_date of this Invoice.  # noqa: E501
        :rtype: datetime
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date):
        """Sets the create_date of this Invoice.


        :param create_date: The create_date of this Invoice.  # noqa: E501
        :type: datetime
        """

        self._create_date = create_date

    @property
    def currency_code(self):
        """Gets the currency_code of this Invoice.  # noqa: E501

        currency_code  # noqa: E501

        :return: The currency_code of this Invoice.  # noqa: E501
        :rtype: str
        """
        return self._currency_code

    @currency_code.setter
    def currency_code(self, currency_code):
        """Sets the currency_code of this Invoice.

        currency_code  # noqa: E501

        :param currency_code: The currency_code of this Invoice.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and currency_code is None:
            raise ValueError("Invalid value for `currency_code`, must not be `None`")  # noqa: E501

        self._currency_code = currency_code

    @property
    def department(self):
        """Gets the department of this Invoice.  # noqa: E501

        department  # noqa: E501

        :return: The department of this Invoice.  # noqa: E501
        :rtype: str
        """
        return self._department

    @department.setter
    def department(self, department):
        """Sets the department of this Invoice.

        department  # noqa: E501

        :param department: The department of this Invoice.  # noqa: E501
        :type: str
        """

        self._department = department

    @property
    def description(self):
        """Gets the description of this Invoice.  # noqa: E501

        description  # noqa: E501

        :return: The description of this Invoice.  # noqa: E501
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this Invoice.

        description  # noqa: E501

        :param description: The description of this Invoice.  # noqa: E501
        :type: str
        """

        self._description = description

    @property
    def document_id(self):
        """Gets the document_id of this Invoice.  # noqa: E501

        document_id  # noqa: E501

        :return: The document_id of this Invoice.  # noqa: E501
        :rtype: str
        """
        return self._document_id

    @document_id.setter
    def document_id(self, document_id):
        """Sets the document_id of this Invoice.

        document_id  # noqa: E501

        :param document_id: The document_id of this Invoice.  # noqa: E501
        :type: str
        """

        self._document_id = document_id

    @property
    def due_date(self):
        """Gets the due_date of this Invoice.  # noqa: E501

        due_date  # noqa: E501

        :return: The due_date of this Invoice.  # noqa: E501
        :rtype: datetime
        """
        return self._due_date

    @due_date.setter
    def due_date(self, due_date):
        """Sets the due_date of this Invoice.

        due_date  # noqa: E501

        :param due_date: The due_date of this Invoice.  # noqa: E501
        :type: datetime
        """
        if self._configuration.client_side_validation and due_date is None:
            raise ValueError("Invalid value for `due_date`, must not be `None`")  # noqa: E501

        self._due_date = due_date

    @property
    def id(self):
        """Gets the id of this Invoice.  # noqa: E501


        :return: The id of this Invoice.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this Invoice.


        :param id: The id of this Invoice.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def invoice_date(self):
        """Gets the invoice_date of this Invoice.  # noqa: E501

        invoice_date  # noqa: E501

        :return: The invoice_date of this Invoice.  # noqa: E501
        :rtype: date
        """
        return self._invoice_date

    @invoice_date.setter
    def invoice_date(self, invoice_date):
        """Sets the invoice_date of this Invoice.

        invoice_date  # noqa: E501

        :param invoice_date: The invoice_date of this Invoice.  # noqa: E501
        :type: date
        """
        if self._configuration.client_side_validation and invoice_date is None:
            raise ValueError("Invalid value for `invoice_date`, must not be `None`")  # noqa: E501

        self._invoice_date = invoice_date

    @property
    def invoice_name(self):
        """Gets the invoice_name of this Invoice.  # noqa: E501

        invoice_name  # noqa: E501

        :return: The invoice_name of this Invoice.  # noqa: E501
        :rtype: str
        """
        return self._invoice_name

    @invoice_name.setter
    def invoice_name(self, invoice_name):
        """Sets the invoice_name of this Invoice.

        invoice_name  # noqa: E501

        :param invoice_name: The invoice_name of this Invoice.  # noqa: E501
        :type: str
        """

        self._invoice_name = invoice_name

    @property
    def invoice_number(self):
        """Gets the invoice_number of this Invoice.  # noqa: E501

        invoice_number  # noqa: E501

        :return: The invoice_number of this Invoice.  # noqa: E501
        :rtype: str
        """
        return self._invoice_number

    @invoice_number.setter
    def invoice_number(self, invoice_number):
        """Sets the invoice_number of this Invoice.

        invoice_number  # noqa: E501

        :param invoice_number: The invoice_number of this Invoice.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and invoice_number is None:
            raise ValueError("Invalid value for `invoice_number`, must not be `None`")  # noqa: E501

        self._invoice_number = invoice_number

    @property
    def is_active(self):
        """Gets the is_active of this Invoice.  # noqa: E501

        is_active  # noqa: E501

        :return: The is_active of this Invoice.  # noqa: E501
        :rtype: bool
        """
        return self._is_active

    @is_active.setter
    def is_active(self, is_active):
        """Sets the is_active of this Invoice.

        is_active  # noqa: E501

        :param is_active: The is_active of this Invoice.  # noqa: E501
        :type: bool
        """

        self._is_active = is_active

    @property
    def is_bill(self):
        """Gets the is_bill of this Invoice.  # noqa: E501

        is_bill  # noqa: E501

        :return: The is_bill of this Invoice.  # noqa: E501
        :rtype: bool
        """
        return self._is_bill

    @is_bill.setter
    def is_bill(self, is_bill):
        """Sets the is_bill of this Invoice.

        is_bill  # noqa: E501

        :param is_bill: The is_bill of this Invoice.  # noqa: E501
        :type: bool
        """

        self._is_bill = is_bill

    @property
    def line_items(self):
        """Gets the line_items of this Invoice.  # noqa: E501

        lineItems  # noqa: E501

        :return: The line_items of this Invoice.  # noqa: E501
        :rtype: list[LineItems]
        """
        return self._line_items

    @line_items.setter
    def line_items(self, line_items):
        """Sets the line_items of this Invoice.

        lineItems  # noqa: E501

        :param line_items: The line_items of this Invoice.  # noqa: E501
        :type: list[LineItems]
        """

        self._line_items = line_items

    @property
    def metadata(self):
        """Gets the metadata of this Invoice.  # noqa: E501


        :return: The metadata of this Invoice.  # noqa: E501
        :rtype: dict(str, str)
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata):
        """Sets the metadata of this Invoice.


        :param metadata: The metadata of this Invoice.  # noqa: E501
        :type: dict(str, str)
        """

        self._metadata = metadata

    @property
    def payment_instructions(self):
        """Gets the payment_instructions of this Invoice.  # noqa: E501

        paymentInstructions  # noqa: E501

        :return: The payment_instructions of this Invoice.  # noqa: E501
        :rtype: str
        """
        return self._payment_instructions

    @payment_instructions.setter
    def payment_instructions(self, payment_instructions):
        """Sets the payment_instructions of this Invoice.

        paymentInstructions  # noqa: E501

        :param payment_instructions: The payment_instructions of this Invoice.  # noqa: E501
        :type: str
        """

        self._payment_instructions = payment_instructions

    @property
    def payment_terms(self):
        """Gets the payment_terms of this Invoice.  # noqa: E501

        paymentTerms  # noqa: E501

        :return: The payment_terms of this Invoice.  # noqa: E501
        :rtype: str
        """
        return self._payment_terms

    @payment_terms.setter
    def payment_terms(self, payment_terms):
        """Sets the payment_terms of this Invoice.

        paymentTerms  # noqa: E501

        :param payment_terms: The payment_terms of this Invoice.  # noqa: E501
        :type: str
        """

        self._payment_terms = payment_terms

    @property
    def secondary_id(self):
        """Gets the secondary_id of this Invoice.  # noqa: E501


        :return: The secondary_id of this Invoice.  # noqa: E501
        :rtype: str
        """
        return self._secondary_id

    @secondary_id.setter
    def secondary_id(self, secondary_id):
        """Sets the secondary_id of this Invoice.


        :param secondary_id: The secondary_id of this Invoice.  # noqa: E501
        :type: str
        """

        self._secondary_id = secondary_id

    @property
    def status(self):
        """Gets the status of this Invoice.  # noqa: E501

        status  # noqa: E501

        :return: The status of this Invoice.  # noqa: E501
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """Sets the status of this Invoice.

        status  # noqa: E501

        :param status: The status of this Invoice.  # noqa: E501
        :type: str
        """

        self._status = status

    @property
    def total_amount(self):
        """Gets the total_amount of this Invoice.  # noqa: E501

        totalAmount  # noqa: E501

        :return: The total_amount of this Invoice.  # noqa: E501
        :rtype: float
        """
        return self._total_amount

    @total_amount.setter
    def total_amount(self, total_amount):
        """Sets the total_amount of this Invoice.

        totalAmount  # noqa: E501

        :param total_amount: The total_amount of this Invoice.  # noqa: E501
        :type: float
        """
        if self._configuration.client_side_validation and total_amount is None:
            raise ValueError("Invalid value for `total_amount`, must not be `None`")  # noqa: E501

        self._total_amount = total_amount

    @property
    def total_discount(self):
        """Gets the total_discount of this Invoice.  # noqa: E501

        totalDiscount  # noqa: E501

        :return: The total_discount of this Invoice.  # noqa: E501
        :rtype: float
        """
        return self._total_discount

    @total_discount.setter
    def total_discount(self, total_discount):
        """Sets the total_discount of this Invoice.

        totalDiscount  # noqa: E501

        :param total_discount: The total_discount of this Invoice.  # noqa: E501
        :type: float
        """

        self._total_discount = total_discount

    @property
    def total_due(self):
        """Gets the total_due of this Invoice.  # noqa: E501

        totalDue  # noqa: E501

        :return: The total_due of this Invoice.  # noqa: E501
        :rtype: float
        """
        return self._total_due

    @total_due.setter
    def total_due(self, total_due):
        """Sets the total_due of this Invoice.

        totalDue  # noqa: E501

        :param total_due: The total_due of this Invoice.  # noqa: E501
        :type: float
        """

        self._total_due = total_due

    @property
    def total_subtotal(self):
        """Gets the total_subtotal of this Invoice.  # noqa: E501

        totalSubtotal  # noqa: E501

        :return: The total_subtotal of this Invoice.  # noqa: E501
        :rtype: float
        """
        return self._total_subtotal

    @total_subtotal.setter
    def total_subtotal(self, total_subtotal):
        """Sets the total_subtotal of this Invoice.

        totalSubtotal  # noqa: E501

        :param total_subtotal: The total_subtotal of this Invoice.  # noqa: E501
        :type: float
        """

        self._total_subtotal = total_subtotal

    @property
    def total_tax(self):
        """Gets the total_tax of this Invoice.  # noqa: E501

        totalTax  # noqa: E501

        :return: The total_tax of this Invoice.  # noqa: E501
        :rtype: float
        """
        return self._total_tax

    @total_tax.setter
    def total_tax(self, total_tax):
        """Sets the total_tax of this Invoice.

        totalTax  # noqa: E501

        :param total_tax: The total_tax of this Invoice.  # noqa: E501
        :type: float
        """

        self._total_tax = total_tax

    @property
    def update_date(self):
        """Gets the update_date of this Invoice.  # noqa: E501


        :return: The update_date of this Invoice.  # noqa: E501
        :rtype: datetime
        """
        return self._update_date

    @update_date.setter
    def update_date(self, update_date):
        """Sets the update_date of this Invoice.


        :param update_date: The update_date of this Invoice.  # noqa: E501
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
        if issubclass(Invoice, dict):
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
        if not isinstance(other, Invoice):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, Invoice):
            return True

        return self.to_dict() != other.to_dict()
