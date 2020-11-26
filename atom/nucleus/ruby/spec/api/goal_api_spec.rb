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

# Unit tests for NucleusApi::GoalApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'GoalApi' do
  before do
    # run before each test
    @instance = NucleusApi::GoalApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of GoalApi' do
    it 'should create an instance of GoalApi' do
      expect(@instance).to be_instance_of(NucleusApi::GoalApi)
    end
  end

  # unit tests for create_goal_track_using_post
  # Create a goal track record
  # Create a goal track record for a goal under a client.
  # @param goal_track goalTrack
  # @param [Hash] opts the optional parameters
  # @return [GoalTrack]
  describe 'create_goal_track_using_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for create_goal_using_post
  # Create a goal
  # Create a new goal for your firm that clients can customize for themselves.
  # @param goal_request goalRequest
  # @param [Hash] opts the optional parameters
  # @return [Goal]
  describe 'create_goal_using_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_goal_track_using_delete
  # Delete a goal track record
  # Permanently delete an goal track record for a goal under a client.
  # @param goal_track_id UUID goal_track_id
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_goal_track_using_delete test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_goal_using_delete
  # Delete a goal
  # Permanently delete a goal for your firm.
  # @param goal_id UUID goal_id
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_goal_using_delete test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_goal_all_using_get
  # List all goals
  # Get the details for all goals defined by your firm.
  # @param [Hash] opts the optional parameters
  # @option opts [BOOLEAN] :ascending ascending
  # @option opts [String] :filter filter
  # @option opts [String] :order_by order_by
  # @option opts [Integer] :page page
  # @option opts [Integer] :size size
  # @return [PageGoal]
  describe 'get_goal_all_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_goal_asset_size_all_using_get
  # List goal asset sizes
  # Get a list of asset sizes per date for a goal for a specified client.
  # @param client_id client_id
  # @param goal_id UUID goal_id
  # @param [Hash] opts the optional parameters
  # @option opts [String] :currency_conversion Currency Code
  # @option opts [Date] :end_date end date
  # @option opts [BOOLEAN] :get_latest get_latest
  # @option opts [BOOLEAN] :portfolio_goal portfolio_goal
  # @option opts [String] :sort_type sort_type
  # @option opts [Date] :start_date start date
  # @return [Array<AvailableDateDoubleVO>]
  describe 'get_goal_asset_size_all_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_goal_holding_all_using_get
  # List goal holdings
  # Get the information for all the securities that are currently being held in portfolios associated with a particular goal.
  # @param client_id client_id
  # @param goal_id UUID goal_id
  # @param [Hash] opts the optional parameters
  # @option opts [String] :currency_conversion Currency Code
  # @option opts [Date] :end_date end date
  # @option opts [BOOLEAN] :portfolio_goal portfolio_goal
  # @option opts [Date] :start_date start date
  # @return [Array<PortfolioHoldingAgg>]
  describe 'get_goal_holding_all_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_goal_track_all_using_get
  # List all goal track records
  # Get information for all goal track records stored for your firm.
  # @param [Hash] opts the optional parameters
  # @option opts [BOOLEAN] :ascending ascending
  # @option opts [String] :end_date end date 
  # @option opts [String] :filter filter
  # @option opts [BOOLEAN] :get_latest true or false
  # @option opts [String] :order_by order_by
  # @option opts [Integer] :page page
  # @option opts [Integer] :size size
  # @option opts [String] :start_date start date 
  # @return [PageGoalTrack]
  describe 'get_goal_track_all_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_goal_track_using_get
  # Retrieve a goal track record
  # Retrieve the information for a specific goal track record for a goal under a client.
  # @param goal_track_id UUID goal_track_id
  # @param [Hash] opts the optional parameters
  # @return [GoalTrack]
  describe 'get_goal_track_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_goal_transaction_all_using_get
  # List goal transactions
  # Get the information for all transactions under portfolios associated with a particular goal.
  # @param client_id client_id
  # @param goal_id UUID goal_id
  # @param [Hash] opts the optional parameters
  # @option opts [BOOLEAN] :ascending ascending
  # @option opts [String] :currency_conversion Currency Code
  # @option opts [Date] :end_date end date
  # @option opts [String] :order_by order_by
  # @option opts [Integer] :page page
  # @option opts [BOOLEAN] :portfolio_goal portfolio_goal
  # @option opts [Integer] :size size
  # @option opts [Date] :start_date start date
  # @return [PagePortfolioTransaction]
  describe 'get_goal_transaction_all_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_goal_using_get
  # Retrieve a goal
  # Retrieve the information for a goal defined for your firm.
  # @param goal_id UUID goal_id
  # @param [Hash] opts the optional parameters
  # @return [Goal]
  describe 'get_goal_using_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_goal_track_using_put
  # Update a goal track record
  # Update the information for a goal track record.
  # @param goal_track goal_track
  # @param goal_track_id UUID goal_track_id
  # @param [Hash] opts the optional parameters
  # @return [GoalTrack]
  describe 'update_goal_track_using_put test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_goal_using_put
  # Update a goal
  # Update a goal defined for your firm.
  # @param goal goal
  # @param goal_id UUID goal_id
  # @param [Hash] opts the optional parameters
  # @return [Goal]
  describe 'update_goal_using_put test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
