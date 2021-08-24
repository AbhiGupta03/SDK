# coding: utf-8

"""
    Hydrogen Nucleus API

    The Hydrogen Nucleus API  # noqa: E501

    OpenAPI spec version: 1.9.4
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import unittest

import nucleus_api
from nucleus_api.api.admin_client_api import AdminClientApi  # noqa: E501
from nucleus_api.rest import ApiException


class TestAdminClientApi(unittest.TestCase):
    """AdminClientApi unit test stubs"""

    def setUp(self):
        self.api = nucleus_api.api.admin_client_api.AdminClientApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_create_admin_client_using_post(self):
        """Test case for create_admin_client_using_post

        create  # noqa: E501
        """
        pass

    def test_delete_admin_client_using_delete(self):
        """Test case for delete_admin_client_using_delete

        delete  # noqa: E501
        """
        pass

    def test_get_admin_client_using_get(self):
        """Test case for get_admin_client_using_get

        get  # noqa: E501
        """
        pass

    def test_get_all_admin_client_using_get(self):
        """Test case for get_all_admin_client_using_get

        getAllAdminClient  # noqa: E501
        """
        pass

    def test_update_admin_client_using_put(self):
        """Test case for update_admin_client_using_put

        update  # noqa: E501
        """
        pass

    def test_update_client_credentials_using_post(self):
        """Test case for update_client_credentials_using_post

        updateClientCredentials  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
