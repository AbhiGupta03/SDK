# coding: utf-8

"""
    Hydrogen Proton API

    Financial engineering module of Hydrogen Atom  # noqa: E501

    OpenAPI spec version: 1.8.0
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from proton_api.api_client import ApiClient


class BusinessFinancialManagementApi(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def business_financial_health_check(self, business_financial_health_check_request, **kwargs):  # noqa: E501
        """Business Financial Health Check  # noqa: E501

        Calculate a series of financial ratios to assess business financial health  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.business_financial_health_check(business_financial_health_check_request, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param BusinessFinancialHealthCheckRequest business_financial_health_check_request: Request payload for Business Financial Health Check (required)
        :return: dict(str, object)
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.business_financial_health_check_with_http_info(business_financial_health_check_request, **kwargs)  # noqa: E501
        else:
            (data) = self.business_financial_health_check_with_http_info(business_financial_health_check_request, **kwargs)  # noqa: E501
            return data

    def business_financial_health_check_with_http_info(self, business_financial_health_check_request, **kwargs):  # noqa: E501
        """Business Financial Health Check  # noqa: E501

        Calculate a series of financial ratios to assess business financial health  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.business_financial_health_check_with_http_info(business_financial_health_check_request, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param BusinessFinancialHealthCheckRequest business_financial_health_check_request: Request payload for Business Financial Health Check (required)
        :return: dict(str, object)
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['business_financial_health_check_request']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method business_financial_health_check" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'business_financial_health_check_request' is set
        if ('business_financial_health_check_request' not in params or
                params['business_financial_health_check_request'] is None):
            raise ValueError("Missing the required parameter `business_financial_health_check_request` when calling `business_financial_health_check`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'business_financial_health_check_request' in params:
            body_params = params['business_financial_health_check_request']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['oauth2']  # noqa: E501

        return self.api_client.call_api(
            '/business/financial_health_check', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='dict(str, object)',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def cash_analysis(self, cash_analysis_request, **kwargs):  # noqa: E501
        """Cash Analysis  # noqa: E501

        Analyze cash activity over time  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.cash_analysis(cash_analysis_request, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param CashAnalysisRequest cash_analysis_request: Request payload for Cash Analysis (required)
        :return: dict(str, object)
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.cash_analysis_with_http_info(cash_analysis_request, **kwargs)  # noqa: E501
        else:
            (data) = self.cash_analysis_with_http_info(cash_analysis_request, **kwargs)  # noqa: E501
            return data

    def cash_analysis_with_http_info(self, cash_analysis_request, **kwargs):  # noqa: E501
        """Cash Analysis  # noqa: E501

        Analyze cash activity over time  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.cash_analysis_with_http_info(cash_analysis_request, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param CashAnalysisRequest cash_analysis_request: Request payload for Cash Analysis (required)
        :return: dict(str, object)
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['cash_analysis_request']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method cash_analysis" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'cash_analysis_request' is set
        if ('cash_analysis_request' not in params or
                params['cash_analysis_request'] is None):
            raise ValueError("Missing the required parameter `cash_analysis_request` when calling `cash_analysis`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'cash_analysis_request' in params:
            body_params = params['cash_analysis_request']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['oauth2']  # noqa: E501

        return self.api_client.call_api(
            '/business/cash_analysis', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='dict(str, object)',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def customer_analysis(self, customer_analysis_request, **kwargs):  # noqa: E501
        """Customer Analysis  # noqa: E501

        Analyze customer revenues over a time period  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.customer_analysis(customer_analysis_request, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param CustomerAnalysisRequest customer_analysis_request: Request payload for Customer Analysis (required)
        :return: dict(str, object)
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.customer_analysis_with_http_info(customer_analysis_request, **kwargs)  # noqa: E501
        else:
            (data) = self.customer_analysis_with_http_info(customer_analysis_request, **kwargs)  # noqa: E501
            return data

    def customer_analysis_with_http_info(self, customer_analysis_request, **kwargs):  # noqa: E501
        """Customer Analysis  # noqa: E501

        Analyze customer revenues over a time period  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.customer_analysis_with_http_info(customer_analysis_request, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param CustomerAnalysisRequest customer_analysis_request: Request payload for Customer Analysis (required)
        :return: dict(str, object)
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['customer_analysis_request']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method customer_analysis" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'customer_analysis_request' is set
        if ('customer_analysis_request' not in params or
                params['customer_analysis_request'] is None):
            raise ValueError("Missing the required parameter `customer_analysis_request` when calling `customer_analysis`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'customer_analysis_request' in params:
            body_params = params['customer_analysis_request']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['oauth2']  # noqa: E501

        return self.api_client.call_api(
            '/business/customer_analysis', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='dict(str, object)',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def financial_statement_analysis(self, financial_statement_analysis_request, **kwargs):  # noqa: E501
        """Financial Statement Analysis  # noqa: E501

        Analyze financial statement accounting data for a business  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.financial_statement_analysis(financial_statement_analysis_request, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param FinancialStatementAnalysisRequest financial_statement_analysis_request: Request payload for Financial Statement Analysis (required)
        :return: dict(str, object)
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.financial_statement_analysis_with_http_info(financial_statement_analysis_request, **kwargs)  # noqa: E501
        else:
            (data) = self.financial_statement_analysis_with_http_info(financial_statement_analysis_request, **kwargs)  # noqa: E501
            return data

    def financial_statement_analysis_with_http_info(self, financial_statement_analysis_request, **kwargs):  # noqa: E501
        """Financial Statement Analysis  # noqa: E501

        Analyze financial statement accounting data for a business  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.financial_statement_analysis_with_http_info(financial_statement_analysis_request, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param FinancialStatementAnalysisRequest financial_statement_analysis_request: Request payload for Financial Statement Analysis (required)
        :return: dict(str, object)
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['financial_statement_analysis_request']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method financial_statement_analysis" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'financial_statement_analysis_request' is set
        if ('financial_statement_analysis_request' not in params or
                params['financial_statement_analysis_request'] is None):
            raise ValueError("Missing the required parameter `financial_statement_analysis_request` when calling `financial_statement_analysis`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'financial_statement_analysis_request' in params:
            body_params = params['financial_statement_analysis_request']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['oauth2']  # noqa: E501

        return self.api_client.call_api(
            '/business/financial_statement_analysis', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='dict(str, object)',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def invoice_analysis(self, invoice_analysis_request, **kwargs):  # noqa: E501
        """Invoice Analysis  # noqa: E501

        Analyze invoices to understand the context of money owed and paid to a business  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.invoice_analysis(invoice_analysis_request, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param BusinessInvoiceAnalysisRequest invoice_analysis_request: Request payload for Invoice Analysis (required)
        :return: dict(str, object)
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.invoice_analysis_with_http_info(invoice_analysis_request, **kwargs)  # noqa: E501
        else:
            (data) = self.invoice_analysis_with_http_info(invoice_analysis_request, **kwargs)  # noqa: E501
            return data

    def invoice_analysis_with_http_info(self, invoice_analysis_request, **kwargs):  # noqa: E501
        """Invoice Analysis  # noqa: E501

        Analyze invoices to understand the context of money owed and paid to a business  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.invoice_analysis_with_http_info(invoice_analysis_request, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param BusinessInvoiceAnalysisRequest invoice_analysis_request: Request payload for Invoice Analysis (required)
        :return: dict(str, object)
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['invoice_analysis_request']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method invoice_analysis" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'invoice_analysis_request' is set
        if ('invoice_analysis_request' not in params or
                params['invoice_analysis_request'] is None):
            raise ValueError("Missing the required parameter `invoice_analysis_request` when calling `invoice_analysis`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'invoice_analysis_request' in params:
            body_params = params['invoice_analysis_request']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['oauth2']  # noqa: E501

        return self.api_client.call_api(
            '/business/invoice_analysis', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='dict(str, object)',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)
