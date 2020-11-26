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

# Unit tests for NucleusApi::FinancialOfferApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'FinancialOfferApi' do
  before do
    # run before each test
    @instance = NucleusApi::FinancialOfferApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of FinancialOfferApi' do
    it 'should create an instance of FinancialOfferApi' do
      expect(@instance).to be_instance_of(NucleusApi::FinancialOfferApi)
    end
  end

  # unit tests for create_financial_offer_using_post
  # Create a comparison request
  # Create a new comparison request.
  # @param financial_offer financialOffer
  # @param [Hash] opts the optional parameters
  # @return [FinancialOffer]
  describe 'create_financial_offer_using_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_financial_offer_using_delete
  # Delete a comparison request
  # Permanently delete a comparison request.
  # @param financial_offer_id UUID financial_offer_id
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_financial_offer_using_delete test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_financial_offer_all_using_get
  # List all comparison requests
  # Get the information for all comparison requests.
  # @param [Hash] opts the optional parameters
  # @option opts [BOOLEAN] :ascending ascending
  # @option opts [String] :currency_conversion currency_conversion
  # @option opts [String] :filter filter
  # @option opts [String] :order_by order_by
  # @option opts [Integer] :page page
  # @option opts [Integer] :size size
  # @return [PageFinancialOffer]
  describe 'get_financial_offer_all_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_financial_offer_using_get
  # Retrieve a comparison request
  # Retrieve the information for a comparison request.
  # @param financial_offer_id UUID financial_offer_id
  # @param [Hash] opts the optional parameters
  # @option opts [String] :currency_conversion USD
  # @return [FinancialOffer]
  describe 'get_financial_offer_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_financial_offer_using_put
  # Update a comparison request
  # Update the information for a comparison request.
  # @param financial_offer financial_offer
  # @param financial_offer_id UUID financial_offer_id
  # @param [Hash] opts the optional parameters
  # @return [FinancialOffer]
  describe 'update_financial_offer_using_put test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
