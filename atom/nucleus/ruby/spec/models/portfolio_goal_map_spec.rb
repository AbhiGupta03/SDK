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

# Unit tests for NucleusApi::PortfolioGoalMap
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'PortfolioGoalMap' do
  before do
    # run before each test
    @instance = NucleusApi::PortfolioGoalMap.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of PortfolioGoalMap' do
    it 'should create an instance of PortfolioGoalMap' do
      expect(@instance).to be_instance_of(NucleusApi::PortfolioGoalMap)
    end
  end
  describe 'test attribute "goal_id"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "weight"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
