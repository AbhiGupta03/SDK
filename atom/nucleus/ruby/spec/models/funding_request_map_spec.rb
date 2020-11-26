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
require 'date'

# Unit tests for NucleusApi::FundingRequestMap
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'FundingRequestMap' do
  before do
    # run before each test
    @instance = NucleusApi::FundingRequestMap.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of FundingRequestMap' do
    it 'should create an instance of FundingRequestMap' do
      expect(@instance).to be_instance_of(NucleusApi::FundingRequestMap)
    end
  end
  describe 'test attribute "funding_id"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
