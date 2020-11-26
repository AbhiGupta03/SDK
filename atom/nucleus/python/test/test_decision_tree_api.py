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
from nucleus_api.api.decision_tree_api import DecisionTreeApi  # noqa: E501
from nucleus_api.rest import ApiException


class TestDecisionTreeApi(unittest.TestCase):
    """DecisionTreeApi unit test stubs"""

    def setUp(self):
        self.api = nucleus_api.api.decision_tree_api.DecisionTreeApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_create_decision_tree_result_using_post(self):
        """Test case for create_decision_tree_result_using_post

        Decision tree result  # noqa: E501
        """
        pass

    def test_create_decision_tree_using_post(self):
        """Test case for create_decision_tree_using_post

        Create a decision tree  # noqa: E501
        """
        pass

    def test_create_node_relationship_using_post(self):
        """Test case for create_node_relationship_using_post

        Create a node relationship  # noqa: E501
        """
        pass

    def test_create_node_using_post(self):
        """Test case for create_node_using_post

        Create a node  # noqa: E501
        """
        pass

    def test_delete_decision_tree_using_delete(self):
        """Test case for delete_decision_tree_using_delete

        Delete a decision tree  # noqa: E501
        """
        pass

    def test_delete_node_relationship_using_delete(self):
        """Test case for delete_node_relationship_using_delete

        Delete a node relationship  # noqa: E501
        """
        pass

    def test_delete_node_using_delete(self):
        """Test case for delete_node_using_delete

        Delete a node  # noqa: E501
        """
        pass

    def test_get_decision_tree_all_using_get(self):
        """Test case for get_decision_tree_all_using_get

        List all decision tree  # noqa: E501
        """
        pass

    def test_get_decision_tree_using_get(self):
        """Test case for get_decision_tree_using_get

        Retrieve a decision tree  # noqa: E501
        """
        pass

    def test_get_node_all_using_get(self):
        """Test case for get_node_all_using_get

        List all nodes  # noqa: E501
        """
        pass

    def test_get_node_relationship_all_using_get(self):
        """Test case for get_node_relationship_all_using_get

        List all node relationships  # noqa: E501
        """
        pass

    def test_get_node_relationship_using_get(self):
        """Test case for get_node_relationship_using_get

        Retrieve a node relationship  # noqa: E501
        """
        pass

    def test_get_node_using_get(self):
        """Test case for get_node_using_get

        Retrieve a node  # noqa: E501
        """
        pass

    def test_update_decision_tree_using_put(self):
        """Test case for update_decision_tree_using_put

        Update a decision tree  # noqa: E501
        """
        pass

    def test_update_node_relationship_using_put(self):
        """Test case for update_node_relationship_using_put

        Update a node relationship  # noqa: E501
        """
        pass

    def test_update_node_using_put(self):
        """Test case for update_node_using_put

        Update a node  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
