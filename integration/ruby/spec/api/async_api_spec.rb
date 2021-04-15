=begin
#Hydrogen Integration API

#The Hydrogen Integration API

OpenAPI spec version: 1.2.1
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.18

=end

require 'spec_helper'
require 'json'

# Unit tests for IntegrationApi::AsyncApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'AsyncApi' do
  before do
    # run before each test
    @instance = IntegrationApi::AsyncApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of AsyncApi' do
    it 'should create an instance of AsyncApi' do
      expect(@instance).to be_instance_of(IntegrationApi::AsyncApi)
    end
  end

  # unit tests for get_async_data
  # Create async transaction for GET endpoints for bulk data
  # Create async transaction for GET endpoints for bulk data
  # @param id UUID id
  # @param integration_type String integration_type
  # @param service String service
  # @param [Hash] opts the optional parameters
  # @return [AsyncTransaction]
  describe 'get_async_data test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_async_data1
  # Create async transaction for GET endpoints for bulk data
  # Create async transaction for GET endpoints for bulk data
  # @param id UUID id
  # @param integration_type String integration_type
  # @param service String service
  # @param [Hash] opts the optional parameters
  # @return [AsyncTransaction]
  describe 'get_async_data1 test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_async_data2
  # Create async transaction for POST endpoints for bulk data
  # Create async transaction for POST endpoints for bulk data
  # @param data data
  # @param integration_type String integration_type
  # @param service String service
  # @param [Hash] opts the optional parameters
  # @return [AsyncTransaction]
  describe 'get_async_data2 test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_async_status
  # Get Status of async transaction created through GET/POST endpoints
  # Get Status of async transaction created through GET/POST endpoints
  # @param id UUID Async Transaction Id
  # @param [Hash] opts the optional parameters
  # @return [AsyncTransactionVO]
  describe 'get_async_status test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end