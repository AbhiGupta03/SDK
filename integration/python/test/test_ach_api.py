# coding: utf-8

"""
    Hydrogen Integration API

    The Hydrogen Integration API  # noqa: E501

    OpenAPI spec version: 1.3.1
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import unittest

import integration_api
from integration_api.api.ach_api import ACHApi  # noqa: E501
from integration_api.rest import ApiException


class TestACHApi(unittest.TestCase):
    """ACHApi unit test stubs"""

    def setUp(self):
        self.api = integration_api.api.ach_api.ACHApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_cancel_ach_transfer_using_delete(self):
        """Test case for cancel_ach_transfer_using_delete

        Cancel the ACH transfer  # noqa: E501
        """
        pass

    def test_create_ach_bank_link_using_post(self):
        """Test case for create_ach_bank_link_using_post

        Create bank link  # noqa: E501
        """
        pass

    def test_create_ach_beneficial_owner_using_post(self):
        """Test case for create_ach_beneficial_owner_using_post

        Create a beneficial owner  # noqa: E501
        """
        pass

    def test_create_ach_business_using_post(self):
        """Test case for create_ach_business_using_post

        Create a business  # noqa: E501
        """
        pass

    def test_create_ach_card_link_using_post(self):
        """Test case for create_ach_card_link_using_post

        Create an ACH card link  # noqa: E501
        """
        pass

    def test_create_ach_card_reserve_using_post(self):
        """Test case for create_ach_card_reserve_using_post

        Create an ACH card reserve  # noqa: E501
        """
        pass

    def test_create_ach_client_using_post(self):
        """Test case for create_ach_client_using_post

        Create a client  # noqa: E501
        """
        pass

    def test_create_ach_reserve_link_using_post(self):
        """Test case for create_ach_reserve_link_using_post

        Create an ACH reserve link  # noqa: E501
        """
        pass

    def test_delete_ach_bank_link_using_delete(self):
        """Test case for delete_ach_bank_link_using_delete

        Delete bank link  # noqa: E501
        """
        pass

    def test_get_ach_balance_using_get(self):
        """Test case for get_ach_balance_using_get

        Get balance  # noqa: E501
        """
        pass

    def test_get_ach_bank_link_using_get(self):
        """Test case for get_ach_bank_link_using_get

        Get bank link  # noqa: E501
        """
        pass

    def test_get_ach_bank_links_for_reserve_account_using_get(self):
        """Test case for get_ach_bank_links_for_reserve_account_using_get

        Get bank links for a reserve account  # noqa: E501
        """
        pass

    def test_get_ach_business_balance_using_get(self):
        """Test case for get_ach_business_balance_using_get

        Get business balance  # noqa: E501
        """
        pass

    def test_get_ach_client_bank_links_using_get(self):
        """Test case for get_ach_client_bank_links_using_get

        Get client bank links  # noqa: E501
        """
        pass

    def test_get_ach_status_using_get(self):
        """Test case for get_ach_status_using_get

        Get the ACH status  # noqa: E501
        """
        pass

    def test_get_ach_transfer_using_get(self):
        """Test case for get_ach_transfer_using_get

        Get the ACH transfer  # noqa: E501
        """
        pass

    def test_get_list_of_client_ach_transfers_using_get(self):
        """Test case for get_list_of_client_ach_transfers_using_get

        Get a list of client's ACH transfers  # noqa: E501
        """
        pass

    def test_submit_ach_transfer_using_post(self):
        """Test case for submit_ach_transfer_using_post

        Submit an ACH transfer  # noqa: E501
        """
        pass

    def test_update_ach_bank_link_using_put(self):
        """Test case for update_ach_bank_link_using_put

        Update bank link  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
