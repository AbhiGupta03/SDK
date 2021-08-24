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
require 'date'

# Unit tests for NucleusApi::CheckImages
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'CheckImages' do
  before do
    # run before each test
    @instance = NucleusApi::CheckImages.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of CheckImages' do
    it 'should create an instance of CheckImages' do
      expect(@instance).to be_instance_of(NucleusApi::CheckImages)
    end
  end
  describe 'test attribute "image_type"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "image_url"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
