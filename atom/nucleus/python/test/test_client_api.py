# coding: utf-8

"""
    Hydrogen Nucleus API

    The Hydrogen Nucleus API  # noqa: E501

    OpenAPI spec version: 1.8.0
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import unittest

import nucleus_api
from nucleus_api.api.client_api import ClientApi  # noqa: E501
from nucleus_api.rest import ApiException


class TestClientApi(unittest.TestCase):
    """ClientApi unit test stubs"""

    def setUp(self):
        self.api = nucleus_api.api.client_api.ClientApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_create_client_hydro_using_post(self):
        """Test case for create_client_hydro_using_post

        Create a client-hydro relationship  # noqa: E501
        """
        pass

    def test_create_client_status_using_post(self):
        """Test case for create_client_status_using_post

        Create an client status  # noqa: E501
        """
        pass

    def test_create_client_using_post(self):
        """Test case for create_client_using_post

        Create a client  # noqa: E501
        """
        pass

    def test_delete_client_hydro_using_delete(self):
        """Test case for delete_client_hydro_using_delete

        Delete a client-hydro relationship  # noqa: E501
        """
        pass

    def test_delete_client_status_using_delete(self):
        """Test case for delete_client_status_using_delete

        Delete an client status  # noqa: E501
        """
        pass

    def test_delete_client_using_delete(self):
        """Test case for delete_client_using_delete

        Delete a client  # noqa: E501
        """
        pass

    def test_get_client_account_overview_using_get(self):
        """Test case for get_client_account_overview_using_get

        List all client Account overview  # noqa: E501
        """
        pass

    def test_get_client_advisor_overview_using_get(self):
        """Test case for get_client_advisor_overview_using_get

        Advisor overview  # noqa: E501
        """
        pass

    def test_get_client_all_using_get(self):
        """Test case for get_client_all_using_get

        List all clients  # noqa: E501
        """
        pass

    def test_get_client_asset_size_using_get(self):
        """Test case for get_client_asset_size_using_get

        List all client asset sizes  # noqa: E501
        """
        pass

    def test_get_client_goal_overview_using_get(self):
        """Test case for get_client_goal_overview_using_get

        Retrieve client's goal details   # noqa: E501
        """
        pass

    def test_get_client_holding_using_get(self):
        """Test case for get_client_holding_using_get

        List all client holdings  # noqa: E501
        """
        pass

    def test_get_client_hydro_all_using_get(self):
        """Test case for get_client_hydro_all_using_get

        List all client-hydro relationship  # noqa: E501
        """
        pass

    def test_get_client_hydro_using_get(self):
        """Test case for get_client_hydro_using_get

        Retrieve a client-hydro relationship  # noqa: E501
        """
        pass

    def test_get_client_status_all_using_get(self):
        """Test case for get_client_status_all_using_get

        List all client statuses  # noqa: E501
        """
        pass

    def test_get_client_status_using_get(self):
        """Test case for get_client_status_using_get

        Retrieve an client status  # noqa: E501
        """
        pass

    def test_get_client_transaction_all_using_get(self):
        """Test case for get_client_transaction_all_using_get

        List all client transactions  # noqa: E501
        """
        pass

    def test_get_client_using_get(self):
        """Test case for get_client_using_get

        Retrieve a client  # noqa: E501
        """
        pass

    def test_update_client_hydro_using_put(self):
        """Test case for update_client_hydro_using_put

        Update a client-hydro relationship  # noqa: E501
        """
        pass

    def test_update_client_status_using_put(self):
        """Test case for update_client_status_using_put

        Update an client status  # noqa: E501
        """
        pass

    def test_update_client_using_put(self):
        """Test case for update_client_using_put

        Update a client  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
