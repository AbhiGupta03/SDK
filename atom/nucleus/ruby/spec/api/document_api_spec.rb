=begin
#Hydrogen Nucleus API

#The Hydrogen Nucleus API

OpenAPI spec version: 1.8.0
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.15

=end

require 'spec_helper'
require 'json'

# Unit tests for NucleusApi::DocumentApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'DocumentApi' do
  before do
    # run before each test
    @instance = NucleusApi::DocumentApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of DocumentApi' do
    it 'should create an instance of DocumentApi' do
      expect(@instance).to be_instance_of(NucleusApi::DocumentApi)
    end
  end

  # unit tests for create_document_using_post
  # Create a Document
  # Create a new Document for your firm.
  # @param document_request documentRequest
  # @param [Hash] opts the optional parameters
  # @return [Document]
  describe 'create_document_using_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_document_using_delete
  # Delete a tenant document by Id
  # Permanently delete a tenant document by Id
  # @param document_id UUID document_id
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_document_using_delete test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_document_all_using_get
  # List all Documents
  # Get the information for all Documents 
  # @param [Hash] opts the optional parameters
  # @option opts [BOOLEAN] :ascending ascending
  # @option opts [String] :filter filter
  # @option opts [String] :order_by order_by
  # @option opts [Integer] :page page
  # @option opts [Integer] :size size
  # @return [PageDocument]
  describe 'get_document_all_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_document_using_get
  # Retrieve a Tenant Document by Document Id
  # Retrieve the information for a Tenant Document by Document Id
  # @param document_id UUID document_id
  # @param [Hash] opts the optional parameters
  # @return [Document]
  describe 'get_document_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_document_using_put
  # Update a Tenant Document
  # Updated the information for a Tenant Documents
  # @param document document
  # @param document_id UUID document_id
  # @param [Hash] opts the optional parameters
  # @return [Document]
  describe 'update_document_using_put test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
