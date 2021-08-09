=begin
#Hydrogen Integration API

#The Hydrogen Integration API

OpenAPI spec version: 1.3.1
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.21

=end

require 'spec_helper'
require 'json'

# Unit tests for IntegrationApi::IAVApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'IAVApi' do
  before do
    # run before each test
    @instance = IntegrationApi::IAVApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of IAVApi' do
    it 'should create an instance of IAVApi' do
      expect(@instance).to be_instance_of(IntegrationApi::IAVApi)
    end
  end

  # unit tests for create_iav_using_post
  # Instant Account Verification of an account.
  # Endpoint is used to verify account.
  # @param iav_request_co iavRequestCO
  # @param [Hash] opts the optional parameters
  # @return [IavResponseVo]
  describe 'create_iav_using_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_bank_link_using_delete
  # De-Link mapping between client,vendor,tenant
  # De-Link mapping between client,vendor,tenant
  # @param nucleus_bank_link_id nucleus_bank_link_id
  # @param [Hash] opts the optional parameters
  # @option opts [String] :delete_type delete_type
  # @option opts [String] :nucleus_data nucleus_data
  # @return [nil]
  describe 'delete_bank_link_using_delete test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_iav_using_get
  # Get verified account based on id.
  # Get verified account based on id.
  # @param nucleus_bank_link_id nucleus_bank_link_id
  # @param [Hash] opts the optional parameters
  # @return [IavResponseVo]
  describe 'get_iav_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
