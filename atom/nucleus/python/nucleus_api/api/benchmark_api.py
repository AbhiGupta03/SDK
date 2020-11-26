# coding: utf-8

"""
    Hydrogen Nucleus API

    The Hydrogen Nucleus API  # noqa: E501

    OpenAPI spec version: 1.8.0
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from nucleus_api.api_client import ApiClient


class BenchmarkApi(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def create_benchmark_using_post(self, benchmark, **kwargs):  # noqa: E501
        """Create a benchmark  # noqa: E501

        Create a new benchmark for your firm.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.create_benchmark_using_post(benchmark, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param Benchmark benchmark: benchmark (required)
        :return: Benchmark
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.create_benchmark_using_post_with_http_info(benchmark, **kwargs)  # noqa: E501
        else:
            (data) = self.create_benchmark_using_post_with_http_info(benchmark, **kwargs)  # noqa: E501
            return data

    def create_benchmark_using_post_with_http_info(self, benchmark, **kwargs):  # noqa: E501
        """Create a benchmark  # noqa: E501

        Create a new benchmark for your firm.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.create_benchmark_using_post_with_http_info(benchmark, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param Benchmark benchmark: benchmark (required)
        :return: Benchmark
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['benchmark']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method create_benchmark_using_post" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'benchmark' is set
        if ('benchmark' not in params or
                params['benchmark'] is None):
            raise ValueError("Missing the required parameter `benchmark` when calling `create_benchmark_using_post`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'benchmark' in params:
            body_params = params['benchmark']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['*/*'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['oauth2']  # noqa: E501

        return self.api_client.call_api(
            '/benchmark', 'POST',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='Benchmark',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def delete_benchmark_using_delete(self, benchmark_id, **kwargs):  # noqa: E501
        """Delete a benchmark  # noqa: E501

        Permanently delete a benchmark.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_benchmark_using_delete(benchmark_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str benchmark_id: UUID benchmark_id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.delete_benchmark_using_delete_with_http_info(benchmark_id, **kwargs)  # noqa: E501
        else:
            (data) = self.delete_benchmark_using_delete_with_http_info(benchmark_id, **kwargs)  # noqa: E501
            return data

    def delete_benchmark_using_delete_with_http_info(self, benchmark_id, **kwargs):  # noqa: E501
        """Delete a benchmark  # noqa: E501

        Permanently delete a benchmark.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.delete_benchmark_using_delete_with_http_info(benchmark_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str benchmark_id: UUID benchmark_id (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['benchmark_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method delete_benchmark_using_delete" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'benchmark_id' is set
        if ('benchmark_id' not in params or
                params['benchmark_id'] is None):
            raise ValueError("Missing the required parameter `benchmark_id` when calling `delete_benchmark_using_delete`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'benchmark_id' in params:
            path_params['benchmark_id'] = params['benchmark_id']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['*/*'])  # noqa: E501

        # Authentication setting
        auth_settings = ['oauth2']  # noqa: E501

        return self.api_client.call_api(
            '/benchmark/{benchmark_id}', 'DELETE',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type=None,  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_benchmark_all_using_get(self, **kwargs):  # noqa: E501
        """List all benchmarks  # noqa: E501

        Get details for all benchmarks defined for your firm.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_benchmark_all_using_get(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param bool ascending: ascending
        :param str filter: filter
        :param str order_by: order_by
        :param int page: page
        :param int size: size
        :return: PageBenchmark
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_benchmark_all_using_get_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.get_benchmark_all_using_get_with_http_info(**kwargs)  # noqa: E501
            return data

    def get_benchmark_all_using_get_with_http_info(self, **kwargs):  # noqa: E501
        """List all benchmarks  # noqa: E501

        Get details for all benchmarks defined for your firm.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_benchmark_all_using_get_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param bool ascending: ascending
        :param str filter: filter
        :param str order_by: order_by
        :param int page: page
        :param int size: size
        :return: PageBenchmark
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['ascending', 'filter', 'order_by', 'page', 'size']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_benchmark_all_using_get" % key
                )
            params[key] = val
        del params['kwargs']

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'ascending' in params:
            query_params.append(('ascending', params['ascending']))  # noqa: E501
        if 'filter' in params:
            query_params.append(('filter', params['filter']))  # noqa: E501
        if 'order_by' in params:
            query_params.append(('order_by', params['order_by']))  # noqa: E501
        if 'page' in params:
            query_params.append(('page', params['page']))  # noqa: E501
        if 'size' in params:
            query_params.append(('size', params['size']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['*/*'])  # noqa: E501

        # Authentication setting
        auth_settings = ['oauth2']  # noqa: E501

        return self.api_client.call_api(
            '/benchmark', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='PageBenchmark',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_benchmark_asset_size_all_using_get(self, benchmark_id, **kwargs):  # noqa: E501
        """List all benchmark asset sizes  # noqa: E501

        Get a list of asset sizes by date for a benchmark.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_benchmark_asset_size_all_using_get(benchmark_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str benchmark_id: UUID benchmark_id (required)
        :param date end_date: end date
        :param str sort_type: sort_type
        :param date start_date: start date
        :return: list[DateDoubleVO]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_benchmark_asset_size_all_using_get_with_http_info(benchmark_id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_benchmark_asset_size_all_using_get_with_http_info(benchmark_id, **kwargs)  # noqa: E501
            return data

    def get_benchmark_asset_size_all_using_get_with_http_info(self, benchmark_id, **kwargs):  # noqa: E501
        """List all benchmark asset sizes  # noqa: E501

        Get a list of asset sizes by date for a benchmark.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_benchmark_asset_size_all_using_get_with_http_info(benchmark_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str benchmark_id: UUID benchmark_id (required)
        :param date end_date: end date
        :param str sort_type: sort_type
        :param date start_date: start date
        :return: list[DateDoubleVO]
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['benchmark_id', 'end_date', 'sort_type', 'start_date']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_benchmark_asset_size_all_using_get" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'benchmark_id' is set
        if ('benchmark_id' not in params or
                params['benchmark_id'] is None):
            raise ValueError("Missing the required parameter `benchmark_id` when calling `get_benchmark_asset_size_all_using_get`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'benchmark_id' in params:
            path_params['benchmark_id'] = params['benchmark_id']  # noqa: E501

        query_params = []
        if 'end_date' in params:
            query_params.append(('end_date', params['end_date']))  # noqa: E501
        if 'sort_type' in params:
            query_params.append(('sort_type', params['sort_type']))  # noqa: E501
        if 'start_date' in params:
            query_params.append(('start_date', params['start_date']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['*/*'])  # noqa: E501

        # Authentication setting
        auth_settings = ['oauth2']  # noqa: E501

        return self.api_client.call_api(
            '/benchmark/{benchmark_id}/asset_size', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='list[DateDoubleVO]',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_benchmark_using_get(self, benchmark_id, **kwargs):  # noqa: E501
        """Retrieve a benchmark  # noqa: E501

        Retrieve the information for a benchmark.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_benchmark_using_get(benchmark_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str benchmark_id: UUID benchmark_id (required)
        :return: Benchmark
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_benchmark_using_get_with_http_info(benchmark_id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_benchmark_using_get_with_http_info(benchmark_id, **kwargs)  # noqa: E501
            return data

    def get_benchmark_using_get_with_http_info(self, benchmark_id, **kwargs):  # noqa: E501
        """Retrieve a benchmark  # noqa: E501

        Retrieve the information for a benchmark.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_benchmark_using_get_with_http_info(benchmark_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str benchmark_id: UUID benchmark_id (required)
        :return: Benchmark
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['benchmark_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_benchmark_using_get" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'benchmark_id' is set
        if ('benchmark_id' not in params or
                params['benchmark_id'] is None):
            raise ValueError("Missing the required parameter `benchmark_id` when calling `get_benchmark_using_get`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'benchmark_id' in params:
            path_params['benchmark_id'] = params['benchmark_id']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['*/*'])  # noqa: E501

        # Authentication setting
        auth_settings = ['oauth2']  # noqa: E501

        return self.api_client.call_api(
            '/benchmark/{benchmark_id}', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='Benchmark',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)

    def update_benchmark_using_put(self, benchmark, benchmark_id, **kwargs):  # noqa: E501
        """Update a benchmark  # noqa: E501

        Updated the information for a benchmark.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.update_benchmark_using_put(benchmark, benchmark_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param Benchmark benchmark: benchmark (required)
        :param str benchmark_id: UUID benchmark_id (required)
        :return: Benchmark
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.update_benchmark_using_put_with_http_info(benchmark, benchmark_id, **kwargs)  # noqa: E501
        else:
            (data) = self.update_benchmark_using_put_with_http_info(benchmark, benchmark_id, **kwargs)  # noqa: E501
            return data

    def update_benchmark_using_put_with_http_info(self, benchmark, benchmark_id, **kwargs):  # noqa: E501
        """Update a benchmark  # noqa: E501

        Updated the information for a benchmark.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.update_benchmark_using_put_with_http_info(benchmark, benchmark_id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param Benchmark benchmark: benchmark (required)
        :param str benchmark_id: UUID benchmark_id (required)
        :return: Benchmark
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['benchmark', 'benchmark_id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in six.iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method update_benchmark_using_put" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'benchmark' is set
        if ('benchmark' not in params or
                params['benchmark'] is None):
            raise ValueError("Missing the required parameter `benchmark` when calling `update_benchmark_using_put`")  # noqa: E501
        # verify the required parameter 'benchmark_id' is set
        if ('benchmark_id' not in params or
                params['benchmark_id'] is None):
            raise ValueError("Missing the required parameter `benchmark_id` when calling `update_benchmark_using_put`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'benchmark_id' in params:
            path_params['benchmark_id'] = params['benchmark_id']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'benchmark' in params:
            body_params = params['benchmark']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['*/*'])  # noqa: E501

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.select_header_content_type(  # noqa: E501
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['oauth2']  # noqa: E501

        return self.api_client.call_api(
            '/benchmark/{benchmark_id}', 'PUT',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='Benchmark',  # noqa: E501
            auth_settings=auth_settings,
            async_req=params.get('async_req'),
            _return_http_data_only=params.get('_return_http_data_only'),
            _preload_content=params.get('_preload_content', True),
            _request_timeout=params.get('_request_timeout'),
            collection_formats=collection_formats)
