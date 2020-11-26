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


class PortfolioConstructionApi(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def mvo(self, mvo_request, **kwargs):  # noqa: E501
        """MVO  # noqa: E501

        Run a mean-variance optimization for a group of potential investments  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.mvo(mvo_request, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param MvoRequest mvo_request: Request payload for MVO (required)
        :return: dict(str, object)
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.mvo_with_http_info(mvo_request, **kwargs)  # noqa: E501
        else:
            (data) = self.mvo_with_http_info(mvo_request, **kwargs)  # noqa: E501
            return data

    def mvo_with_http_info(self, mvo_request, **kwargs):  # noqa: E501
        """MVO  # noqa: E501

        Run a mean-variance optimization for a group of potential investments  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.mvo_with_http_info(mvo_request, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param MvoRequest mvo_request: Request payload for MVO (required)
        :return: dict(str, object)
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['mvo_request']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method mvo" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'mvo_request' is set
        if ('mvo_request' not in params or
                params['mvo_request'] is None):
            raise ValueError("Missing the required parameter `mvo_request` when calling `mvo`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'mvo_request' in params:
            body_params = params['mvo_request']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['oauth2']  # noqa: E501

        return self.api_client.call_api(
            '/mvo', 'POST',
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
