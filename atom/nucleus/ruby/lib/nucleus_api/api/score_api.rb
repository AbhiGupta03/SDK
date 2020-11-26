=begin
#Hydrogen Nucleus API

#The Hydrogen Nucleus API

OpenAPI spec version: 1.8.0
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.15

=end

require 'uri'

module NucleusApi
  class ScoreApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Create a score
    # Create a score for a client, account, goal, portfolio, allocation, model, benchmark or security.
    # @param score score
    # @param [Hash] opts the optional parameters
    # @return [Score]
    def create_score_using_post(score, opts = {})
      data, _status_code, _headers = create_score_using_post_with_http_info(score, opts)
      data
    end

    # Create a score
    # Create a score for a client, account, goal, portfolio, allocation, model, benchmark or security.
    # @param score score
    # @param [Hash] opts the optional parameters
    # @return [Array<(Score, Fixnum, Hash)>] Score data, response status code and response headers
    def create_score_using_post_with_http_info(score, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: ScoreApi.create_score_using_post ...'
      end
      # verify the required parameter 'score' is set
      if @api_client.config.client_side_validation && score.nil?
        fail ArgumentError, "Missing the required parameter 'score' when calling ScoreApi.create_score_using_post"
      end
      # resource path
      local_var_path = '/score'

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['*/*'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = @api_client.object_to_http_body(score)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Score')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: ScoreApi#create_score_using_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Delete a score
    # Permanently delete a score
    # @param score_id UUID score_id
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def delete_score_using_delete(score_id, opts = {})
      delete_score_using_delete_with_http_info(score_id, opts)
      nil
    end

    # Delete a score
    # Permanently delete a score
    # @param score_id UUID score_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Fixnum, Hash)>] nil, response status code and response headers
    def delete_score_using_delete_with_http_info(score_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: ScoreApi.delete_score_using_delete ...'
      end
      # verify the required parameter 'score_id' is set
      if @api_client.config.client_side_validation && score_id.nil?
        fail ArgumentError, "Missing the required parameter 'score_id' when calling ScoreApi.delete_score_using_delete"
      end
      # resource path
      local_var_path = '/score/{score_id}'.sub('{' + 'score_id' + '}', score_id.to_s)

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['*/*'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:DELETE, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: ScoreApi#delete_score_using_delete\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # List all scores
    # Get information for all scores stored for your firm.
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :ascending ascending (default to false)
    # @option opts [String] :filter filter
    # @option opts [String] :order_by order_by (default to update_date)
    # @option opts [Integer] :page page (default to 0)
    # @option opts [Integer] :size size (default to 25)
    # @return [PageScore]
    def get_score_all_using_get(opts = {})
      data, _status_code, _headers = get_score_all_using_get_with_http_info(opts)
      data
    end

    # List all scores
    # Get information for all scores stored for your firm.
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :ascending ascending
    # @option opts [String] :filter filter
    # @option opts [String] :order_by order_by
    # @option opts [Integer] :page page
    # @option opts [Integer] :size size
    # @return [Array<(PageScore, Fixnum, Hash)>] PageScore data, response status code and response headers
    def get_score_all_using_get_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: ScoreApi.get_score_all_using_get ...'
      end
      # resource path
      local_var_path = '/score'

      # query parameters
      query_params = {}
      query_params[:'ascending'] = opts[:'ascending'] if !opts[:'ascending'].nil?
      query_params[:'filter'] = opts[:'filter'] if !opts[:'filter'].nil?
      query_params[:'order_by'] = opts[:'order_by'] if !opts[:'order_by'].nil?
      query_params[:'page'] = opts[:'page'] if !opts[:'page'].nil?
      query_params[:'size'] = opts[:'size'] if !opts[:'size'].nil?

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['*/*'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'PageScore')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: ScoreApi#get_score_all_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Retrieve a score
    # Retrieve the information for a specific score associated with a client, account, goal, portfolio, allocation, model, benchmark or security.
    # @param score_id UUID score_id
    # @param [Hash] opts the optional parameters
    # @return [Score]
    def get_score_using_get(score_id, opts = {})
      data, _status_code, _headers = get_score_using_get_with_http_info(score_id, opts)
      data
    end

    # Retrieve a score
    # Retrieve the information for a specific score associated with a client, account, goal, portfolio, allocation, model, benchmark or security.
    # @param score_id UUID score_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(Score, Fixnum, Hash)>] Score data, response status code and response headers
    def get_score_using_get_with_http_info(score_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: ScoreApi.get_score_using_get ...'
      end
      # verify the required parameter 'score_id' is set
      if @api_client.config.client_side_validation && score_id.nil?
        fail ArgumentError, "Missing the required parameter 'score_id' when calling ScoreApi.get_score_using_get"
      end
      # resource path
      local_var_path = '/score/{score_id}'.sub('{' + 'score_id' + '}', score_id.to_s)

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['*/*'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Score')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: ScoreApi#get_score_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Update a score
    # Update the information for a score.
    # @param score score
    # @param score_id UUID score_id
    # @param [Hash] opts the optional parameters
    # @return [Score]
    def update_score_using_put(score, score_id, opts = {})
      data, _status_code, _headers = update_score_using_put_with_http_info(score, score_id, opts)
      data
    end

    # Update a score
    # Update the information for a score.
    # @param score score
    # @param score_id UUID score_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(Score, Fixnum, Hash)>] Score data, response status code and response headers
    def update_score_using_put_with_http_info(score, score_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: ScoreApi.update_score_using_put ...'
      end
      # verify the required parameter 'score' is set
      if @api_client.config.client_side_validation && score.nil?
        fail ArgumentError, "Missing the required parameter 'score' when calling ScoreApi.update_score_using_put"
      end
      # verify the required parameter 'score_id' is set
      if @api_client.config.client_side_validation && score_id.nil?
        fail ArgumentError, "Missing the required parameter 'score_id' when calling ScoreApi.update_score_using_put"
      end
      # resource path
      local_var_path = '/score/{score_id}'.sub('{' + 'score_id' + '}', score_id.to_s)

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['*/*'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = @api_client.object_to_http_body(score)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:PUT, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Score')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: ScoreApi#update_score_using_put\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
