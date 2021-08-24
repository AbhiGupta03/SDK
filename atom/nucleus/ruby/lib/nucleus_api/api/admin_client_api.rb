=begin
#Hydrogen Nucleus API

#The Hydrogen Nucleus API

OpenAPI spec version: 1.9.4
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.19

=end

require 'uri'

module NucleusApi
  class AdminClientApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # create
    # @param client client
    # @param [Hash] opts the optional parameters
    # @return [AdminClient]
    def create_admin_client_using_post(client, opts = {})
      data, _status_code, _headers = create_admin_client_using_post_with_http_info(client, opts)
      data
    end

    # create
    # @param client client
    # @param [Hash] opts the optional parameters
    # @return [Array<(AdminClient, Fixnum, Hash)>] AdminClient data, response status code and response headers
    def create_admin_client_using_post_with_http_info(client, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: AdminClientApi.create_admin_client_using_post ...'
      end
      # verify the required parameter 'client' is set
      if @api_client.config.client_side_validation && client.nil?
        fail ArgumentError, "Missing the required parameter 'client' when calling AdminClientApi.create_admin_client_using_post"
      end
      # resource path
      local_var_path = '/admin/v1/client'

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
      post_body = @api_client.object_to_http_body(client)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'AdminClient')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AdminClientApi#create_admin_client_using_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # delete
    # @param client_id client_id
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def delete_admin_client_using_delete(client_id, opts = {})
      delete_admin_client_using_delete_with_http_info(client_id, opts)
      nil
    end

    # delete
    # @param client_id client_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Fixnum, Hash)>] nil, response status code and response headers
    def delete_admin_client_using_delete_with_http_info(client_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: AdminClientApi.delete_admin_client_using_delete ...'
      end
      # verify the required parameter 'client_id' is set
      if @api_client.config.client_side_validation && client_id.nil?
        fail ArgumentError, "Missing the required parameter 'client_id' when calling AdminClientApi.delete_admin_client_using_delete"
      end
      # resource path
      local_var_path = '/admin/v1/client/{client_id}'.sub('{' + 'client_id' + '}', client_id.to_s)

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
        @api_client.config.logger.debug "API called: AdminClientApi#delete_admin_client_using_delete\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # get
    # @param client_id client_id
    # @param [Hash] opts the optional parameters
    # @return [AdminClient]
    def get_admin_client_using_get(client_id, opts = {})
      data, _status_code, _headers = get_admin_client_using_get_with_http_info(client_id, opts)
      data
    end

    # get
    # @param client_id client_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(AdminClient, Fixnum, Hash)>] AdminClient data, response status code and response headers
    def get_admin_client_using_get_with_http_info(client_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: AdminClientApi.get_admin_client_using_get ...'
      end
      # verify the required parameter 'client_id' is set
      if @api_client.config.client_side_validation && client_id.nil?
        fail ArgumentError, "Missing the required parameter 'client_id' when calling AdminClientApi.get_admin_client_using_get"
      end
      # resource path
      local_var_path = '/admin/v1/client/{client_id}'.sub('{' + 'client_id' + '}', client_id.to_s)

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
        :return_type => 'AdminClient')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AdminClientApi#get_admin_client_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # getAllAdminClient
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :ascending ascending (default to false)
    # @option opts [String] :filter filter
    # @option opts [String] :order_by order_by (default to username)
    # @option opts [Integer] :page page (default to 0)
    # @option opts [Integer] :size size (default to 25)
    # @return [PageAdminClient]
    def get_all_admin_client_using_get(opts = {})
      data, _status_code, _headers = get_all_admin_client_using_get_with_http_info(opts)
      data
    end

    # getAllAdminClient
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :ascending ascending
    # @option opts [String] :filter filter
    # @option opts [String] :order_by order_by
    # @option opts [Integer] :page page
    # @option opts [Integer] :size size
    # @return [Array<(PageAdminClient, Fixnum, Hash)>] PageAdminClient data, response status code and response headers
    def get_all_admin_client_using_get_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: AdminClientApi.get_all_admin_client_using_get ...'
      end
      # resource path
      local_var_path = '/admin/v1/client'

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
        :return_type => 'PageAdminClient')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AdminClientApi#get_all_admin_client_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # update
    # @param client client
    # @param client_id client_id
    # @param [Hash] opts the optional parameters
    # @return [AdminClient]
    def update_admin_client_using_put(client, client_id, opts = {})
      data, _status_code, _headers = update_admin_client_using_put_with_http_info(client, client_id, opts)
      data
    end

    # update
    # @param client client
    # @param client_id client_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(AdminClient, Fixnum, Hash)>] AdminClient data, response status code and response headers
    def update_admin_client_using_put_with_http_info(client, client_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: AdminClientApi.update_admin_client_using_put ...'
      end
      # verify the required parameter 'client' is set
      if @api_client.config.client_side_validation && client.nil?
        fail ArgumentError, "Missing the required parameter 'client' when calling AdminClientApi.update_admin_client_using_put"
      end
      # verify the required parameter 'client_id' is set
      if @api_client.config.client_side_validation && client_id.nil?
        fail ArgumentError, "Missing the required parameter 'client_id' when calling AdminClientApi.update_admin_client_using_put"
      end
      # resource path
      local_var_path = '/admin/v1/client/{client_id}'.sub('{' + 'client_id' + '}', client_id.to_s)

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
      post_body = @api_client.object_to_http_body(client)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:PUT, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'AdminClient')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AdminClientApi#update_admin_client_using_put\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # updateClientCredentials
    # @param client_credentials clientCredentials
    # @param [Hash] opts the optional parameters
    # @option opts [String] :tenant_name tenant-name
    # @return [AdminClient]
    def update_client_credentials_using_post(client_credentials, opts = {})
      data, _status_code, _headers = update_client_credentials_using_post_with_http_info(client_credentials, opts)
      data
    end

    # updateClientCredentials
    # @param client_credentials clientCredentials
    # @param [Hash] opts the optional parameters
    # @option opts [String] :tenant_name tenant-name
    # @return [Array<(AdminClient, Fixnum, Hash)>] AdminClient data, response status code and response headers
    def update_client_credentials_using_post_with_http_info(client_credentials, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: AdminClientApi.update_client_credentials_using_post ...'
      end
      # verify the required parameter 'client_credentials' is set
      if @api_client.config.client_side_validation && client_credentials.nil?
        fail ArgumentError, "Missing the required parameter 'client_credentials' when calling AdminClientApi.update_client_credentials_using_post"
      end
      # resource path
      local_var_path = '/admin/v1/client_credentials'

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['*/*'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])
      header_params[:'tenant-name'] = opts[:'tenant_name'] if !opts[:'tenant_name'].nil?

      # form parameters
      form_params = {}

      # http body (model)
      post_body = @api_client.object_to_http_body(client_credentials)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'AdminClient')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AdminClientApi#update_client_credentials_using_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
