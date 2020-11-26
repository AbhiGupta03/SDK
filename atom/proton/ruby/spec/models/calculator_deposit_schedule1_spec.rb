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

# Unit tests for ProtonApi::CalculatorDepositSchedule1
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'CalculatorDepositSchedule1' do
  before do
    # run before each test
    @instance = ProtonApi::CalculatorDepositSchedule1.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of CalculatorDepositSchedule1' do
    it 'should create an instance of CalculatorDepositSchedule1' do
      expect(@instance).to be_instance_of(ProtonApi::CalculatorDepositSchedule1)
    end
  end
  describe 'test attribute "deposit_amount"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "adjust_deposit_for_inflation"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "deposit_frequency_interval"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
      # validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["year", "month", "quarter", "week", "day"])
      # validator.allowable_values.each do |value|
      #   expect { @instance.deposit_frequency_interval = value }.not_to raise_error
      # end
    end
  end

end
