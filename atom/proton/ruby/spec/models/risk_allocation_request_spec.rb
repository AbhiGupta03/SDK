=begin
#Hydrogen Proton API

#Financial engineering module of Hydrogen Atom

OpenAPI spec version: 1.8.0
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.16

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for ProtonApi::RiskAllocationRequest
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'RiskAllocationRequest' do
  before do
    # run before each test
    @instance = ProtonApi::RiskAllocationRequest.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of RiskAllocationRequest' do
    it 'should create an instance of RiskAllocationRequest' do
      expect(@instance).to be_instance_of(ProtonApi::RiskAllocationRequest)
    end
  end
  describe 'test attribute "opt_config"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "allocations"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "client_id"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "allocation_method"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
      # validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["select", "create"])
      # validator.allowable_values.each do |value|
      #   expect { @instance.allocation_method = value }.not_to raise_error
      # end
    end
  end

  describe 'test attribute "risk_score"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "use_proxy_data"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "market_data_source"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
      # validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["nucleus", "integration"])
      # validator.allowable_values.each do |value|
      #   expect { @instance.market_data_source = value }.not_to raise_error
      # end
    end
  end

end
