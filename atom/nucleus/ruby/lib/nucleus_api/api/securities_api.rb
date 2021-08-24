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
  class SecuritiesApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Create a security exclusion
    # Create a new security exclusion for a specific account or portfolio.
    # @param security_exclusion_request securityExclusionRequest
    # @param [Hash] opts the optional parameters
    # @return [SecurityExclusion]
    def create_security_exclusion_using_post(security_exclusion_request, opts = {})
      data, _status_code, _headers = create_security_exclusion_using_post_with_http_info(security_exclusion_request, opts)
      data
    end

    # Create a security exclusion
    # Create a new security exclusion for a specific account or portfolio.
    # @param security_exclusion_request securityExclusionRequest
    # @param [Hash] opts the optional parameters
    # @return [Array<(SecurityExclusion, Fixnum, Hash)>] SecurityExclusion data, response status code and response headers
    def create_security_exclusion_using_post_with_http_info(security_exclusion_request, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: SecuritiesApi.create_security_exclusion_using_post ...'
      end
      # verify the required parameter 'security_exclusion_request' is set
      if @api_client.config.client_side_validation && security_exclusion_request.nil?
        fail ArgumentError, "Missing the required parameter 'security_exclusion_request' when calling SecuritiesApi.create_security_exclusion_using_post"
      end
      # resource path
      local_var_path = '/nucleus/v1/security_exclusion'

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
      post_body = @api_client.object_to_http_body(security_exclusion_request)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'SecurityExclusion')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: SecuritiesApi#create_security_exclusion_using_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Create a security price
    # Create a new price for a security defined for your firm.
    # @param security_price_request securityPriceRequest
    # @param [Hash] opts the optional parameters
    # @return [SecurityPrice]
    def create_security_price_using_post(security_price_request, opts = {})
      data, _status_code, _headers = create_security_price_using_post_with_http_info(security_price_request, opts)
      data
    end

    # Create a security price
    # Create a new price for a security defined for your firm.
    # @param security_price_request securityPriceRequest
    # @param [Hash] opts the optional parameters
    # @return [Array<(SecurityPrice, Fixnum, Hash)>] SecurityPrice data, response status code and response headers
    def create_security_price_using_post_with_http_info(security_price_request, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: SecuritiesApi.create_security_price_using_post ...'
      end
      # verify the required parameter 'security_price_request' is set
      if @api_client.config.client_side_validation && security_price_request.nil?
        fail ArgumentError, "Missing the required parameter 'security_price_request' when calling SecuritiesApi.create_security_price_using_post"
      end
      # resource path
      local_var_path = '/nucleus/v1/security_price'

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
      post_body = @api_client.object_to_http_body(security_price_request)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'SecurityPrice')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: SecuritiesApi#create_security_price_using_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Create a security
    # Create a new security for your firm.
    # @param securities_info_request securitiesInfoRequest
    # @param [Hash] opts the optional parameters
    # @return [Security]
    def create_security_using_post(securities_info_request, opts = {})
      data, _status_code, _headers = create_security_using_post_with_http_info(securities_info_request, opts)
      data
    end

    # Create a security
    # Create a new security for your firm.
    # @param securities_info_request securitiesInfoRequest
    # @param [Hash] opts the optional parameters
    # @return [Array<(Security, Fixnum, Hash)>] Security data, response status code and response headers
    def create_security_using_post_with_http_info(securities_info_request, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: SecuritiesApi.create_security_using_post ...'
      end
      # verify the required parameter 'securities_info_request' is set
      if @api_client.config.client_side_validation && securities_info_request.nil?
        fail ArgumentError, "Missing the required parameter 'securities_info_request' when calling SecuritiesApi.create_security_using_post"
      end
      # resource path
      local_var_path = '/nucleus/v1/security'

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
      post_body = @api_client.object_to_http_body(securities_info_request)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Security')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: SecuritiesApi#create_security_using_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Delete a security exclusion
    # Permanently delete a security exclusion
    # @param security_exclusion_id UUID security_exclusion_id
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def delete_security_exclusion_using_delete(security_exclusion_id, opts = {})
      delete_security_exclusion_using_delete_with_http_info(security_exclusion_id, opts)
      nil
    end

    # Delete a security exclusion
    # Permanently delete a security exclusion
    # @param security_exclusion_id UUID security_exclusion_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Fixnum, Hash)>] nil, response status code and response headers
    def delete_security_exclusion_using_delete_with_http_info(security_exclusion_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: SecuritiesApi.delete_security_exclusion_using_delete ...'
      end
      # verify the required parameter 'security_exclusion_id' is set
      if @api_client.config.client_side_validation && security_exclusion_id.nil?
        fail ArgumentError, "Missing the required parameter 'security_exclusion_id' when calling SecuritiesApi.delete_security_exclusion_using_delete"
      end
      # resource path
      local_var_path = '/nucleus/v1/security_exclusion/{security_exclusion_id}'.sub('{' + 'security_exclusion_id' + '}', security_exclusion_id.to_s)

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
        @api_client.config.logger.debug "API called: SecuritiesApi#delete_security_exclusion_using_delete\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Delete a security price
    # Permanently delete a security price from a security.
    # @param security_price_id UUID security_price_id
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def delete_security_price_using_delete(security_price_id, opts = {})
      delete_security_price_using_delete_with_http_info(security_price_id, opts)
      nil
    end

    # Delete a security price
    # Permanently delete a security price from a security.
    # @param security_price_id UUID security_price_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Fixnum, Hash)>] nil, response status code and response headers
    def delete_security_price_using_delete_with_http_info(security_price_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: SecuritiesApi.delete_security_price_using_delete ...'
      end
      # verify the required parameter 'security_price_id' is set
      if @api_client.config.client_side_validation && security_price_id.nil?
        fail ArgumentError, "Missing the required parameter 'security_price_id' when calling SecuritiesApi.delete_security_price_using_delete"
      end
      # resource path
      local_var_path = '/nucleus/v1/security_price/{security_price_id}'.sub('{' + 'security_price_id' + '}', security_price_id.to_s)

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
        @api_client.config.logger.debug "API called: SecuritiesApi#delete_security_price_using_delete\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Delete a security
    # Permanently delete a security for your firm.
    # @param security_id UUID security_id
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def delete_security_using_delete(security_id, opts = {})
      delete_security_using_delete_with_http_info(security_id, opts)
      nil
    end

    # Delete a security
    # Permanently delete a security for your firm.
    # @param security_id UUID security_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Fixnum, Hash)>] nil, response status code and response headers
    def delete_security_using_delete_with_http_info(security_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: SecuritiesApi.delete_security_using_delete ...'
      end
      # verify the required parameter 'security_id' is set
      if @api_client.config.client_side_validation && security_id.nil?
        fail ArgumentError, "Missing the required parameter 'security_id' when calling SecuritiesApi.delete_security_using_delete"
      end
      # resource path
      local_var_path = '/nucleus/v1/security/{security_id}'.sub('{' + 'security_id' + '}', security_id.to_s)

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
        @api_client.config.logger.debug "API called: SecuritiesApi#delete_security_using_delete\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # List all securities
    # Get details for all securities defined for your firm.
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :ascending ascending (default to false)
    # @option opts [String] :filter filter
    # @option opts [String] :order_by order_by (default to update_date)
    # @option opts [Integer] :page page (default to 0)
    # @option opts [Integer] :size size (default to 25)
    # @return [PageSecurity]
    def get_security_all_using_get(opts = {})
      data, _status_code, _headers = get_security_all_using_get_with_http_info(opts)
      data
    end

    # List all securities
    # Get details for all securities defined for your firm.
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :ascending ascending
    # @option opts [String] :filter filter
    # @option opts [String] :order_by order_by
    # @option opts [Integer] :page page
    # @option opts [Integer] :size size
    # @return [Array<(PageSecurity, Fixnum, Hash)>] PageSecurity data, response status code and response headers
    def get_security_all_using_get_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: SecuritiesApi.get_security_all_using_get ...'
      end
      # resource path
      local_var_path = '/nucleus/v1/security'

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
        :return_type => 'PageSecurity')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: SecuritiesApi#get_security_all_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # List all security exclusions
    # Get details for all security exclusions defined for your firm.
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :ascending ascending (default to false)
    # @option opts [String] :filter filter
    # @option opts [String] :order_by order_by (default to update_date)
    # @option opts [Integer] :page page (default to 0)
    # @option opts [Integer] :size size (default to 25)
    # @return [PageSecurityExclusion]
    def get_security_exclusion_all_using_get(opts = {})
      data, _status_code, _headers = get_security_exclusion_all_using_get_with_http_info(opts)
      data
    end

    # List all security exclusions
    # Get details for all security exclusions defined for your firm.
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :ascending ascending
    # @option opts [String] :filter filter
    # @option opts [String] :order_by order_by
    # @option opts [Integer] :page page
    # @option opts [Integer] :size size
    # @return [Array<(PageSecurityExclusion, Fixnum, Hash)>] PageSecurityExclusion data, response status code and response headers
    def get_security_exclusion_all_using_get_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: SecuritiesApi.get_security_exclusion_all_using_get ...'
      end
      # resource path
      local_var_path = '/nucleus/v1/security_exclusion'

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
        :return_type => 'PageSecurityExclusion')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: SecuritiesApi#get_security_exclusion_all_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Retrieve a security exclusion
    # Retrieve the information for a security exclusion.
    # @param security_exclusion_id UUID security_exclusion_id
    # @param [Hash] opts the optional parameters
    # @return [SecurityExclusion]
    def get_security_exclusion_using_get(security_exclusion_id, opts = {})
      data, _status_code, _headers = get_security_exclusion_using_get_with_http_info(security_exclusion_id, opts)
      data
    end

    # Retrieve a security exclusion
    # Retrieve the information for a security exclusion.
    # @param security_exclusion_id UUID security_exclusion_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(SecurityExclusion, Fixnum, Hash)>] SecurityExclusion data, response status code and response headers
    def get_security_exclusion_using_get_with_http_info(security_exclusion_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: SecuritiesApi.get_security_exclusion_using_get ...'
      end
      # verify the required parameter 'security_exclusion_id' is set
      if @api_client.config.client_side_validation && security_exclusion_id.nil?
        fail ArgumentError, "Missing the required parameter 'security_exclusion_id' when calling SecuritiesApi.get_security_exclusion_using_get"
      end
      # resource path
      local_var_path = '/nucleus/v1/security_exclusion/{security_exclusion_id}'.sub('{' + 'security_exclusion_id' + '}', security_exclusion_id.to_s)

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
        :return_type => 'SecurityExclusion')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: SecuritiesApi#get_security_exclusion_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # List all security prices
    # Get prices for all securities defined for your firm.
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :ascending ascending (default to false)
    # @option opts [String] :currency_conversion currency_conversion
    # @option opts [String] :filter filter
    # @option opts [String] :order_by order_by (default to update_date)
    # @option opts [Integer] :page page (default to 0)
    # @option opts [Integer] :size size (default to 25)
    # @return [PageSecurityPrice]
    def get_security_price_all_using_get(opts = {})
      data, _status_code, _headers = get_security_price_all_using_get_with_http_info(opts)
      data
    end

    # List all security prices
    # Get prices for all securities defined for your firm.
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :ascending ascending
    # @option opts [String] :currency_conversion currency_conversion
    # @option opts [String] :filter filter
    # @option opts [String] :order_by order_by
    # @option opts [Integer] :page page
    # @option opts [Integer] :size size
    # @return [Array<(PageSecurityPrice, Fixnum, Hash)>] PageSecurityPrice data, response status code and response headers
    def get_security_price_all_using_get_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: SecuritiesApi.get_security_price_all_using_get ...'
      end
      # resource path
      local_var_path = '/nucleus/v1/security_price'

      # query parameters
      query_params = {}
      query_params[:'ascending'] = opts[:'ascending'] if !opts[:'ascending'].nil?
      query_params[:'currency_conversion'] = opts[:'currency_conversion'] if !opts[:'currency_conversion'].nil?
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
        :return_type => 'PageSecurityPrice')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: SecuritiesApi#get_security_price_all_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Retrieve a security price
    # Retrieve the information for a security price for a security.
    # @param security_price_id UUID security_price_id
    # @param [Hash] opts the optional parameters
    # @option opts [String] :currency_conversion USD
    # @return [SecurityPrice]
    def get_security_price_using_get(security_price_id, opts = {})
      data, _status_code, _headers = get_security_price_using_get_with_http_info(security_price_id, opts)
      data
    end

    # Retrieve a security price
    # Retrieve the information for a security price for a security.
    # @param security_price_id UUID security_price_id
    # @param [Hash] opts the optional parameters
    # @option opts [String] :currency_conversion USD
    # @return [Array<(SecurityPrice, Fixnum, Hash)>] SecurityPrice data, response status code and response headers
    def get_security_price_using_get_with_http_info(security_price_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: SecuritiesApi.get_security_price_using_get ...'
      end
      # verify the required parameter 'security_price_id' is set
      if @api_client.config.client_side_validation && security_price_id.nil?
        fail ArgumentError, "Missing the required parameter 'security_price_id' when calling SecuritiesApi.get_security_price_using_get"
      end
      # resource path
      local_var_path = '/nucleus/v1/security_price/{security_price_id}'.sub('{' + 'security_price_id' + '}', security_price_id.to_s)

      # query parameters
      query_params = {}
      query_params[:'currency_conversion'] = opts[:'currency_conversion'] if !opts[:'currency_conversion'].nil?

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
        :return_type => 'SecurityPrice')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: SecuritiesApi#get_security_price_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Retrieve a security
    # Retrieve the information for a security defined for your firm.
    # @param security_id UUID security_id
    # @param [Hash] opts the optional parameters
    # @return [Security]
    def get_security_using_get(security_id, opts = {})
      data, _status_code, _headers = get_security_using_get_with_http_info(security_id, opts)
      data
    end

    # Retrieve a security
    # Retrieve the information for a security defined for your firm.
    # @param security_id UUID security_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(Security, Fixnum, Hash)>] Security data, response status code and response headers
    def get_security_using_get_with_http_info(security_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: SecuritiesApi.get_security_using_get ...'
      end
      # verify the required parameter 'security_id' is set
      if @api_client.config.client_side_validation && security_id.nil?
        fail ArgumentError, "Missing the required parameter 'security_id' when calling SecuritiesApi.get_security_using_get"
      end
      # resource path
      local_var_path = '/nucleus/v1/security/{security_id}'.sub('{' + 'security_id' + '}', security_id.to_s)

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
        :return_type => 'Security')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: SecuritiesApi#get_security_using_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Update a security exclusion
    # Update the information for a security exclusion.
    # @param security_exclusion security_exclusion
    # @param security_exclusion_id UUID security_exclusion_id
    # @param [Hash] opts the optional parameters
    # @return [SecurityExclusion]
    def update_security_exclusion_using_put(security_exclusion, security_exclusion_id, opts = {})
      data, _status_code, _headers = update_security_exclusion_using_put_with_http_info(security_exclusion, security_exclusion_id, opts)
      data
    end

    # Update a security exclusion
    # Update the information for a security exclusion.
    # @param security_exclusion security_exclusion
    # @param security_exclusion_id UUID security_exclusion_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(SecurityExclusion, Fixnum, Hash)>] SecurityExclusion data, response status code and response headers
    def update_security_exclusion_using_put_with_http_info(security_exclusion, security_exclusion_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: SecuritiesApi.update_security_exclusion_using_put ...'
      end
      # verify the required parameter 'security_exclusion' is set
      if @api_client.config.client_side_validation && security_exclusion.nil?
        fail ArgumentError, "Missing the required parameter 'security_exclusion' when calling SecuritiesApi.update_security_exclusion_using_put"
      end
      # verify the required parameter 'security_exclusion_id' is set
      if @api_client.config.client_side_validation && security_exclusion_id.nil?
        fail ArgumentError, "Missing the required parameter 'security_exclusion_id' when calling SecuritiesApi.update_security_exclusion_using_put"
      end
      # resource path
      local_var_path = '/nucleus/v1/security_exclusion/{security_exclusion_id}'.sub('{' + 'security_exclusion_id' + '}', security_exclusion_id.to_s)

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
      post_body = @api_client.object_to_http_body(security_exclusion)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:PUT, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'SecurityExclusion')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: SecuritiesApi#update_security_exclusion_using_put\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Update a security price
    # Update a security price for a security.
    # @param security_price security_price
    # @param security_price_id UUID security_price_id
    # @param [Hash] opts the optional parameters
    # @return [SecurityPrice]
    def update_security_price_using_put(security_price, security_price_id, opts = {})
      data, _status_code, _headers = update_security_price_using_put_with_http_info(security_price, security_price_id, opts)
      data
    end

    # Update a security price
    # Update a security price for a security.
    # @param security_price security_price
    # @param security_price_id UUID security_price_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(SecurityPrice, Fixnum, Hash)>] SecurityPrice data, response status code and response headers
    def update_security_price_using_put_with_http_info(security_price, security_price_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: SecuritiesApi.update_security_price_using_put ...'
      end
      # verify the required parameter 'security_price' is set
      if @api_client.config.client_side_validation && security_price.nil?
        fail ArgumentError, "Missing the required parameter 'security_price' when calling SecuritiesApi.update_security_price_using_put"
      end
      # verify the required parameter 'security_price_id' is set
      if @api_client.config.client_side_validation && security_price_id.nil?
        fail ArgumentError, "Missing the required parameter 'security_price_id' when calling SecuritiesApi.update_security_price_using_put"
      end
      # resource path
      local_var_path = '/nucleus/v1/security_price/{security_price_id}'.sub('{' + 'security_price_id' + '}', security_price_id.to_s)

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
      post_body = @api_client.object_to_http_body(security_price)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:PUT, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'SecurityPrice')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: SecuritiesApi#update_security_price_using_put\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Update a security
    # Update a security for your firm.
    # @param security security
    # @param security_id UUID security_id
    # @param [Hash] opts the optional parameters
    # @return [Security]
    def update_security_using_put(security, security_id, opts = {})
      data, _status_code, _headers = update_security_using_put_with_http_info(security, security_id, opts)
      data
    end

    # Update a security
    # Update a security for your firm.
    # @param security security
    # @param security_id UUID security_id
    # @param [Hash] opts the optional parameters
    # @return [Array<(Security, Fixnum, Hash)>] Security data, response status code and response headers
    def update_security_using_put_with_http_info(security, security_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: SecuritiesApi.update_security_using_put ...'
      end
      # verify the required parameter 'security' is set
      if @api_client.config.client_side_validation && security.nil?
        fail ArgumentError, "Missing the required parameter 'security' when calling SecuritiesApi.update_security_using_put"
      end
      # verify the required parameter 'security_id' is set
      if @api_client.config.client_side_validation && security_id.nil?
        fail ArgumentError, "Missing the required parameter 'security_id' when calling SecuritiesApi.update_security_using_put"
      end
      # resource path
      local_var_path = '/nucleus/v1/security/{security_id}'.sub('{' + 'security_id' + '}', security_id.to_s)

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
      post_body = @api_client.object_to_http_body(security)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:PUT, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Security')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: SecuritiesApi#update_security_using_put\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
