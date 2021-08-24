=begin
#Hydrogen Nucleus API

#The Hydrogen Nucleus API

OpenAPI spec version: 1.9.4
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.19

=end

require 'spec_helper'
require 'json'

# Unit tests for NucleusApi::RoundupApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'RoundupApi' do
  before do
    # run before each test
    @instance = NucleusApi::RoundupApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of RoundupApi' do
    it 'should create an instance of RoundupApi' do
      expect(@instance).to be_instance_of(NucleusApi::RoundupApi)
    end
  end

  # unit tests for create_roundup_settings_using_post
  # Create a Roundup Settings
  # Create a Roundup Settings for Roundup amount with your firm.
  # @param roundup_settings roundupSettings
  # @param [Hash] opts the optional parameters
  # @return [RoundupSettings]
  describe 'create_roundup_settings_using_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for create_roundup_using_post
  # Create a roundup
  # Create a new roundup with your firm.
  # @param roundup_co roundupCO
  # @param [Hash] opts the optional parameters
  # @return [Roundup]
  describe 'create_roundup_using_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_roundup_settings_using_delete
  # Delete a roundup settings
  # Permanently delete a  roundup settings registered with your firm.
  # @param roundup_setting_id UUID roundup_setting_id
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_roundup_settings_using_delete test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_roundup_all_using_get
  # List all roundups
  # Get details for all roundups.
  # @param [Hash] opts the optional parameters
  # @option opts [BOOLEAN] :ascending ascending
  # @option opts [String] :filter filter
  # @option opts [String] :order_by order_by
  # @option opts [Integer] :page page
  # @option opts [Integer] :size size
  # @return [PageRoundup]
  describe 'get_roundup_all_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_roundup_settings_all_using_get
  # List all roundup settings
  # Get details for all roundup setting with your firm.
  # @param [Hash] opts the optional parameters
  # @option opts [BOOLEAN] :ascending ascending
  # @option opts [String] :filter filter
  # @option opts [String] :order_by order_by
  # @option opts [Integer] :page page
  # @option opts [Integer] :size size
  # @return [PageRoundupSettings]
  describe 'get_roundup_settings_all_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_roundup_settings_using_get
  # Retrieve a Roundup Setting
  # Retrieve the information for a Roundup Settings with your firm.
  # @param roundup_setting_id UUID roundup_setting_id
  # @param [Hash] opts the optional parameters
  # @return [RoundupSettings]
  describe 'get_roundup_settings_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_roundup_using_get
  # Retrieve a Roundup
  # Retrieve the information for a Roundup.
  # @param roundup_id UUID roundup_id
  # @param [Hash] opts the optional parameters
  # @return [Roundup]
  describe 'get_roundup_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_roundup_settings_using_put
  # Update a roundup settings
  # Update the information for a roundup setting registered with your firm.
  # @param roundup_setting roundup_setting
  # @param roundup_setting_id UUID roundup_setting_id
  # @param [Hash] opts the optional parameters
  # @return [RoundupSettings]
  describe 'update_roundup_settings_using_put test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
