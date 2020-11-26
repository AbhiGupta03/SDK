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
  class FeatureApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Create a Feature Track
    # Create a new feature track.
    # @param feature_track featureTrack
    # @param [Hash] opts the optional parameters
    # @return [FeatureTrack]
    def create_feature_track_using_post(feature_track, opts = {})
      data, _status_code, _headers = create_feature_track_using_post_with_http_info(feature_track, opts)
      data
    end

    # Create a Feature Track
    # Create a new feature track.
    # @param feature_track featureTrack
    # @param [Hash] opts the optional parameters
    # @return [Array<(FeatureTrack, Fixnum, Hash)>] FeatureTrack data, response status code and response headers
    def create_feature_track_using_post_with_http_info(feature_track, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FeatureApi.create_feature_track_using_post ...'
      end
      # verify the required parameter 'feature_track' is set
      if @api_client.config.client_side_validation && feature_track.nil?
        fail ArgumentError, "Missing the required parameter 'feature_track' when calling FeatureApi.create_feature_track_using_post"
      end
      # resource path
      local_var_path = '/feature_track'

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
      post_body = @api_client.object_to_http_body(feature_track)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'FeatureTrack')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FeatureApi#create_feature_track_using_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Create a  Feature
    # Create a new feature.
    # @param feature feature
    # @param [Hash] opts the optional parameters
    # @return [Feature]
    def create_feature_using_post(feature, opts = {})
      data, _status_code, _headers = create_feature_using_post_with_http_info(feature, opts)
      data
    end

    # Create a  Feature
    # Create a new feature.
    # @param feature feature
    # @param [Hash] opts the optional parameters
    # @return [Array<(Feature, Fixnum, Hash)>] Feature data, response status code and response headers
    def create_feature_using_post_with_http_info(feature, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FeatureApi.create_feature_using_post ...'
      end
      # verify the required parameter 'feature' is set
      if @api_client.config.client_side_validation && feature.nil?
        fail ArgumentError, "Missing the required parameter 'feature' when calling FeatureApi.create_feature_using_post"
      end
      # resource path
      local_var_path = '/feature'

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
      post_body = @api_client.object_to_http_body(feature)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Feature')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FeatureApi#create_feature_using_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Delete a Feature Track
    # Permanently delete a feature track registered with your firm.
    # @param feature_track_id UUID feature_track_id
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def delete_feature_track_using_delete(feature_track_id, opts = {})
      delete_feature_track_using_delete_with_http_info(feature_track_id, opts)
      nil
    end

    # Delete a Feature Track
    # Permanently delete a feature track registered with your firm.
    # @param feature_track_id UUID feature_track_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Fixnum, Hash)>] nil, response status code and response headers
    def delete_feature_track_using_delete_with_http_info(feature_track_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FeatureApi.delete_feature_track_using_delete ...'
      end
      # verify the required parameter 'feature_track_id' is set
      if @api_client.config.client_side_validation && feature_track_id.nil?
        fail ArgumentError, "Missing the required parameter 'feature_track_id' when calling FeatureApi.delete_feature_track_using_delete"
      end
      # resource path
      local_var_path = '/feature_track/{feature_track_id}'.sub('{' + 'feature_track_id' + '}', feature_track_id.to_s)

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
        @api_client.config.logger.debug "API called: FeatureApi#delete_feature_track_using_delete\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Delete a Feature
    # Permanently delete a  feature registered with your firm.
    # @param feature_id UUID feature_id
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def delete_feature_using_delete(feature_id, opts = {})
      delete_feature_using_delete_with_http_info(feature_id, opts)
      nil
    end

    # Delete a Feature
    # Permanently delete a  feature registered with your firm.
    # @param feature_id UUID feature_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Fixnum, Hash)>] nil, response status code and response headers
    def delete_feature_using_delete_with_http_info(feature_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FeatureApi.delete_feature_using_delete ...'
      end
      # verify the required parameter 'feature_id' is set
      if @api_client.config.client_side_validation && feature_id.nil?
        fail ArgumentError, "Missing the required parameter 'feature_id' when calling FeatureApi.delete_feature_using_delete"
      end
      # resource path
      local_var_path = '/feature/{feature_id}'.sub('{' + 'feature_id' + '}', feature_id.to_s)

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
        @api_client.config.logger.debug "API called: FeatureApi#delete_feature_using_delete\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # List all Feature
    # Get details for all features.
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :ascending ascending (default to false)
    # @option opts [String] :filter filter
    # @option opts [String] :order_by order_by (default to update_date)
    # @option opts [Integer] :page page (default to 0)
    # @option opts [Integer] :size size (default to 25)
    # @return [PageFeature]
    def get_feature_all_using_get(opts = {})
      data, _status_code, _headers = get_feature_all_using_get_with_http_info(opts)
      data
    end

    # List all Feature
    # Get details for all features.
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :ascending ascending
    # @option opts [String] :filter filter
    # @option opts [String] :order_by order_by
    # @option opts [Integer] :page page
    # @option opts [Integer] :size size
    # @return [Array<(PageFeature, Fixnum, Hash)>] PageFeature data, response status code and response headers
    def get_feature_all_using_get_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FeatureApi.get_feature_all_using_get ...'
      end
      # resource path
      local_var_path = '/feature'

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
        :return_type => 'PageFeature')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FeatureApi#get_feature_all_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # List all Feature track
    # Get details for all feature track.
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :ascending ascending (default to false)
    # @option opts [String] :filter filter
    # @option opts [String] :order_by order_by (default to update_date)
    # @option opts [Integer] :page page (default to 0)
    # @option opts [Integer] :size size (default to 25)
    # @return [PageFeatureTrack]
    def get_feature_track_all_using_get(opts = {})
      data, _status_code, _headers = get_feature_track_all_using_get_with_http_info(opts)
      data
    end

    # List all Feature track
    # Get details for all feature track.
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :ascending ascending
    # @option opts [String] :filter filter
    # @option opts [String] :order_by order_by
    # @option opts [Integer] :page page
    # @option opts [Integer] :size size
    # @return [Array<(PageFeatureTrack, Fixnum, Hash)>] PageFeatureTrack data, response status code and response headers
    def get_feature_track_all_using_get_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FeatureApi.get_feature_track_all_using_get ...'
      end
      # resource path
      local_var_path = '/feature_track'

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
        :return_type => 'PageFeatureTrack')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FeatureApi#get_feature_track_all_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Retrieve a Feature track
    # Retrieve the information for a Feature track.
    # @param feature_track_id UUID feature_track_id
    # @param [Hash] opts the optional parameters
    # @return [FeatureTrack]
    def get_feature_track_using_get(feature_track_id, opts = {})
      data, _status_code, _headers = get_feature_track_using_get_with_http_info(feature_track_id, opts)
      data
    end

    # Retrieve a Feature track
    # Retrieve the information for a Feature track.
    # @param feature_track_id UUID feature_track_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(FeatureTrack, Fixnum, Hash)>] FeatureTrack data, response status code and response headers
    def get_feature_track_using_get_with_http_info(feature_track_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FeatureApi.get_feature_track_using_get ...'
      end
      # verify the required parameter 'feature_track_id' is set
      if @api_client.config.client_side_validation && feature_track_id.nil?
        fail ArgumentError, "Missing the required parameter 'feature_track_id' when calling FeatureApi.get_feature_track_using_get"
      end
      # resource path
      local_var_path = '/feature_track/{feature_track_id}'.sub('{' + 'feature_track_id' + '}', feature_track_id.to_s)

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
        :return_type => 'FeatureTrack')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FeatureApi#get_feature_track_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Retrieve a Feature
    # Retrieve the information for a Feature.
    # @param feature_id UUID feature_id
    # @param [Hash] opts the optional parameters
    # @return [Feature]
    def get_feature_using_get(feature_id, opts = {})
      data, _status_code, _headers = get_feature_using_get_with_http_info(feature_id, opts)
      data
    end

    # Retrieve a Feature
    # Retrieve the information for a Feature.
    # @param feature_id UUID feature_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(Feature, Fixnum, Hash)>] Feature data, response status code and response headers
    def get_feature_using_get_with_http_info(feature_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FeatureApi.get_feature_using_get ...'
      end
      # verify the required parameter 'feature_id' is set
      if @api_client.config.client_side_validation && feature_id.nil?
        fail ArgumentError, "Missing the required parameter 'feature_id' when calling FeatureApi.get_feature_using_get"
      end
      # resource path
      local_var_path = '/feature/{feature_id}'.sub('{' + 'feature_id' + '}', feature_id.to_s)

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
        :return_type => 'Feature')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FeatureApi#get_feature_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Update a Feature Track
    # Update the information for a Feature track registered with your firm.
    # @param feature_track feature_track
    # @param feature_track_id UUID feature_track_id
    # @param [Hash] opts the optional parameters
    # @return [FeatureTrack]
    def update_feature_track_using_put(feature_track, feature_track_id, opts = {})
      data, _status_code, _headers = update_feature_track_using_put_with_http_info(feature_track, feature_track_id, opts)
      data
    end

    # Update a Feature Track
    # Update the information for a Feature track registered with your firm.
    # @param feature_track feature_track
    # @param feature_track_id UUID feature_track_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(FeatureTrack, Fixnum, Hash)>] FeatureTrack data, response status code and response headers
    def update_feature_track_using_put_with_http_info(feature_track, feature_track_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FeatureApi.update_feature_track_using_put ...'
      end
      # verify the required parameter 'feature_track' is set
      if @api_client.config.client_side_validation && feature_track.nil?
        fail ArgumentError, "Missing the required parameter 'feature_track' when calling FeatureApi.update_feature_track_using_put"
      end
      # verify the required parameter 'feature_track_id' is set
      if @api_client.config.client_side_validation && feature_track_id.nil?
        fail ArgumentError, "Missing the required parameter 'feature_track_id' when calling FeatureApi.update_feature_track_using_put"
      end
      # resource path
      local_var_path = '/feature_track/{feature_track_id}'.sub('{' + 'feature_track_id' + '}', feature_track_id.to_s)

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
      post_body = @api_client.object_to_http_body(feature_track)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:PUT, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'FeatureTrack')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FeatureApi#update_feature_track_using_put\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Update a Feature
    # Update the information for a Feature registered with your firm.
    # @param feature feature
    # @param feature_id UUID feature_id
    # @param [Hash] opts the optional parameters
    # @return [Feature]
    def update_feature_using_put(feature, feature_id, opts = {})
      data, _status_code, _headers = update_feature_using_put_with_http_info(feature, feature_id, opts)
      data
    end

    # Update a Feature
    # Update the information for a Feature registered with your firm.
    # @param feature feature
    # @param feature_id UUID feature_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(Feature, Fixnum, Hash)>] Feature data, response status code and response headers
    def update_feature_using_put_with_http_info(feature, feature_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FeatureApi.update_feature_using_put ...'
      end
      # verify the required parameter 'feature' is set
      if @api_client.config.client_side_validation && feature.nil?
        fail ArgumentError, "Missing the required parameter 'feature' when calling FeatureApi.update_feature_using_put"
      end
      # verify the required parameter 'feature_id' is set
      if @api_client.config.client_side_validation && feature_id.nil?
        fail ArgumentError, "Missing the required parameter 'feature_id' when calling FeatureApi.update_feature_using_put"
      end
      # resource path
      local_var_path = '/feature/{feature_id}'.sub('{' + 'feature_id' + '}', feature_id.to_s)

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
      post_body = @api_client.object_to_http_body(feature)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:PUT, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Feature')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FeatureApi#update_feature_using_put\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
