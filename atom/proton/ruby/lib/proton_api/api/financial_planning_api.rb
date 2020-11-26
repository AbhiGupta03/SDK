=begin
#Hydrogen Proton API

#Financial engineering module of Hydrogen Atom

OpenAPI spec version: 1.8.0
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.16

=end

require 'uri'

module ProtonApi
  class FinancialPlanningApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Education Calculator - Annual Cost
    # Calculate the achievable education costs
    # @param education_calculator_annual_cost_request Request payload for Education Calculator - Annual Cost
    # @param [Hash] opts the optional parameters
    # @return [Hash<String, Object>]
    def education_calculator_annual_cost(education_calculator_annual_cost_request, opts = {})
      data, _status_code, _headers = education_calculator_annual_cost_with_http_info(education_calculator_annual_cost_request, opts)
      data
    end

    # Education Calculator - Annual Cost
    # Calculate the achievable education costs
    # @param education_calculator_annual_cost_request Request payload for Education Calculator - Annual Cost
    # @param [Hash] opts the optional parameters
    # @return [Array<(Hash<String, Object>, Fixnum, Hash)>] Hash<String, Object> data, response status code and response headers
    def education_calculator_annual_cost_with_http_info(education_calculator_annual_cost_request, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FinancialPlanningApi.education_calculator_annual_cost ...'
      end
      # verify the required parameter 'education_calculator_annual_cost_request' is set
      if @api_client.config.client_side_validation && education_calculator_annual_cost_request.nil?
        fail ArgumentError, "Missing the required parameter 'education_calculator_annual_cost_request' when calling FinancialPlanningApi.education_calculator_annual_cost"
      end
      # resource path
      local_var_path = '/education_calculator/annual_cost'

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = @api_client.object_to_http_body(education_calculator_annual_cost_request)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Hash<String, Object>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FinancialPlanningApi#education_calculator_annual_cost\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Education Calculator - Deposit Amount
    # Calculate the necessary periodic deposit amount to achieve education costs
    # @param education_calculator_deposit_amount_request Request payload for Education Calculator - Deposit Amount
    # @param [Hash] opts the optional parameters
    # @return [Hash<String, Object>]
    def education_calculator_deposit_amount(education_calculator_deposit_amount_request, opts = {})
      data, _status_code, _headers = education_calculator_deposit_amount_with_http_info(education_calculator_deposit_amount_request, opts)
      data
    end

    # Education Calculator - Deposit Amount
    # Calculate the necessary periodic deposit amount to achieve education costs
    # @param education_calculator_deposit_amount_request Request payload for Education Calculator - Deposit Amount
    # @param [Hash] opts the optional parameters
    # @return [Array<(Hash<String, Object>, Fixnum, Hash)>] Hash<String, Object> data, response status code and response headers
    def education_calculator_deposit_amount_with_http_info(education_calculator_deposit_amount_request, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FinancialPlanningApi.education_calculator_deposit_amount ...'
      end
      # verify the required parameter 'education_calculator_deposit_amount_request' is set
      if @api_client.config.client_side_validation && education_calculator_deposit_amount_request.nil?
        fail ArgumentError, "Missing the required parameter 'education_calculator_deposit_amount_request' when calling FinancialPlanningApi.education_calculator_deposit_amount"
      end
      # resource path
      local_var_path = '/education_calculator/deposit_amount'

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = @api_client.object_to_http_body(education_calculator_deposit_amount_request)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Hash<String, Object>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FinancialPlanningApi#education_calculator_deposit_amount\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Education Calculator - Percent Covered
    # Calculate the achievable percentage of education costs that can be covered
    # @param education_calculator_percent_covered_request Request payload for Education Calculator - Percent Covered
    # @param [Hash] opts the optional parameters
    # @return [Hash<String, Object>]
    def education_calculator_percent_covered(education_calculator_percent_covered_request, opts = {})
      data, _status_code, _headers = education_calculator_percent_covered_with_http_info(education_calculator_percent_covered_request, opts)
      data
    end

    # Education Calculator - Percent Covered
    # Calculate the achievable percentage of education costs that can be covered
    # @param education_calculator_percent_covered_request Request payload for Education Calculator - Percent Covered
    # @param [Hash] opts the optional parameters
    # @return [Array<(Hash<String, Object>, Fixnum, Hash)>] Hash<String, Object> data, response status code and response headers
    def education_calculator_percent_covered_with_http_info(education_calculator_percent_covered_request, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FinancialPlanningApi.education_calculator_percent_covered ...'
      end
      # verify the required parameter 'education_calculator_percent_covered_request' is set
      if @api_client.config.client_side_validation && education_calculator_percent_covered_request.nil?
        fail ArgumentError, "Missing the required parameter 'education_calculator_percent_covered_request' when calling FinancialPlanningApi.education_calculator_percent_covered"
      end
      # resource path
      local_var_path = '/education_calculator/percent_covered'

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = @api_client.object_to_http_body(education_calculator_percent_covered_request)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Hash<String, Object>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FinancialPlanningApi#education_calculator_percent_covered\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Mortgage Calculator - Down Payment
    # Calculate the necessary down payment for the mortgage
    # @param mortgage_calculator_down_payment_request Request payload for Mortgage Calculator - Down Payment
    # @param [Hash] opts the optional parameters
    # @return [Hash<String, Object>]
    def mortgage_calculator_down_payment(mortgage_calculator_down_payment_request, opts = {})
      data, _status_code, _headers = mortgage_calculator_down_payment_with_http_info(mortgage_calculator_down_payment_request, opts)
      data
    end

    # Mortgage Calculator - Down Payment
    # Calculate the necessary down payment for the mortgage
    # @param mortgage_calculator_down_payment_request Request payload for Mortgage Calculator - Down Payment
    # @param [Hash] opts the optional parameters
    # @return [Array<(Hash<String, Object>, Fixnum, Hash)>] Hash<String, Object> data, response status code and response headers
    def mortgage_calculator_down_payment_with_http_info(mortgage_calculator_down_payment_request, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FinancialPlanningApi.mortgage_calculator_down_payment ...'
      end
      # verify the required parameter 'mortgage_calculator_down_payment_request' is set
      if @api_client.config.client_side_validation && mortgage_calculator_down_payment_request.nil?
        fail ArgumentError, "Missing the required parameter 'mortgage_calculator_down_payment_request' when calling FinancialPlanningApi.mortgage_calculator_down_payment"
      end
      # resource path
      local_var_path = '/mortgage_calculator/down_payment'

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = @api_client.object_to_http_body(mortgage_calculator_down_payment_request)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Hash<String, Object>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FinancialPlanningApi#mortgage_calculator_down_payment\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Mortgage Calculator - Home Price
    # Calculate the achievable home price for the mortgage
    # @param mortgage_calculator_home_price_request Request payload for Mortgage Calculator - Home Price
    # @param [Hash] opts the optional parameters
    # @return [Hash<String, Object>]
    def mortgage_calculator_home_price(mortgage_calculator_home_price_request, opts = {})
      data, _status_code, _headers = mortgage_calculator_home_price_with_http_info(mortgage_calculator_home_price_request, opts)
      data
    end

    # Mortgage Calculator - Home Price
    # Calculate the achievable home price for the mortgage
    # @param mortgage_calculator_home_price_request Request payload for Mortgage Calculator - Home Price
    # @param [Hash] opts the optional parameters
    # @return [Array<(Hash<String, Object>, Fixnum, Hash)>] Hash<String, Object> data, response status code and response headers
    def mortgage_calculator_home_price_with_http_info(mortgage_calculator_home_price_request, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FinancialPlanningApi.mortgage_calculator_home_price ...'
      end
      # verify the required parameter 'mortgage_calculator_home_price_request' is set
      if @api_client.config.client_side_validation && mortgage_calculator_home_price_request.nil?
        fail ArgumentError, "Missing the required parameter 'mortgage_calculator_home_price_request' when calling FinancialPlanningApi.mortgage_calculator_home_price"
      end
      # resource path
      local_var_path = '/mortgage_calculator/home_price'

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = @api_client.object_to_http_body(mortgage_calculator_home_price_request)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Hash<String, Object>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FinancialPlanningApi#mortgage_calculator_home_price\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Mortgage Calculator - Periodic Payment
    # Calculate the periodic payment for the mortgage
    # @param mortgage_calculator_periodic_payment_request Request payload for Mortgage Calculator - Periodic Payment
    # @param [Hash] opts the optional parameters
    # @return [Hash<String, Object>]
    def mortgage_calculator_periodic_payment(mortgage_calculator_periodic_payment_request, opts = {})
      data, _status_code, _headers = mortgage_calculator_periodic_payment_with_http_info(mortgage_calculator_periodic_payment_request, opts)
      data
    end

    # Mortgage Calculator - Periodic Payment
    # Calculate the periodic payment for the mortgage
    # @param mortgage_calculator_periodic_payment_request Request payload for Mortgage Calculator - Periodic Payment
    # @param [Hash] opts the optional parameters
    # @return [Array<(Hash<String, Object>, Fixnum, Hash)>] Hash<String, Object> data, response status code and response headers
    def mortgage_calculator_periodic_payment_with_http_info(mortgage_calculator_periodic_payment_request, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FinancialPlanningApi.mortgage_calculator_periodic_payment ...'
      end
      # verify the required parameter 'mortgage_calculator_periodic_payment_request' is set
      if @api_client.config.client_side_validation && mortgage_calculator_periodic_payment_request.nil?
        fail ArgumentError, "Missing the required parameter 'mortgage_calculator_periodic_payment_request' when calling FinancialPlanningApi.mortgage_calculator_periodic_payment"
      end
      # resource path
      local_var_path = '/mortgage_calculator/periodic_payment'

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = @api_client.object_to_http_body(mortgage_calculator_periodic_payment_request)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Hash<String, Object>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FinancialPlanningApi#mortgage_calculator_periodic_payment\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Purchase Calculator - Amount
    # Calculate the achievable purchase amount
    # @param purchase_calculator_amount_request Request payload for Purchase Calculator - Amount
    # @param [Hash] opts the optional parameters
    # @return [Hash<String, Object>]
    def purchase_calculator_amount(purchase_calculator_amount_request, opts = {})
      data, _status_code, _headers = purchase_calculator_amount_with_http_info(purchase_calculator_amount_request, opts)
      data
    end

    # Purchase Calculator - Amount
    # Calculate the achievable purchase amount
    # @param purchase_calculator_amount_request Request payload for Purchase Calculator - Amount
    # @param [Hash] opts the optional parameters
    # @return [Array<(Hash<String, Object>, Fixnum, Hash)>] Hash<String, Object> data, response status code and response headers
    def purchase_calculator_amount_with_http_info(purchase_calculator_amount_request, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FinancialPlanningApi.purchase_calculator_amount ...'
      end
      # verify the required parameter 'purchase_calculator_amount_request' is set
      if @api_client.config.client_side_validation && purchase_calculator_amount_request.nil?
        fail ArgumentError, "Missing the required parameter 'purchase_calculator_amount_request' when calling FinancialPlanningApi.purchase_calculator_amount"
      end
      # resource path
      local_var_path = '/purchase_calculator/amount'

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = @api_client.object_to_http_body(purchase_calculator_amount_request)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Hash<String, Object>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FinancialPlanningApi#purchase_calculator_amount\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Purchase Calculator - Deposit Amount
    # Calculate the necessary periodic deposit amount to achieve the purchase amount
    # @param purchase_calculator_deposit_amount_request Request payload for Purchase Calculator - Deposit Amount
    # @param [Hash] opts the optional parameters
    # @return [Hash<String, Object>]
    def purchase_calculator_deposit_amount(purchase_calculator_deposit_amount_request, opts = {})
      data, _status_code, _headers = purchase_calculator_deposit_amount_with_http_info(purchase_calculator_deposit_amount_request, opts)
      data
    end

    # Purchase Calculator - Deposit Amount
    # Calculate the necessary periodic deposit amount to achieve the purchase amount
    # @param purchase_calculator_deposit_amount_request Request payload for Purchase Calculator - Deposit Amount
    # @param [Hash] opts the optional parameters
    # @return [Array<(Hash<String, Object>, Fixnum, Hash)>] Hash<String, Object> data, response status code and response headers
    def purchase_calculator_deposit_amount_with_http_info(purchase_calculator_deposit_amount_request, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FinancialPlanningApi.purchase_calculator_deposit_amount ...'
      end
      # verify the required parameter 'purchase_calculator_deposit_amount_request' is set
      if @api_client.config.client_side_validation && purchase_calculator_deposit_amount_request.nil?
        fail ArgumentError, "Missing the required parameter 'purchase_calculator_deposit_amount_request' when calling FinancialPlanningApi.purchase_calculator_deposit_amount"
      end
      # resource path
      local_var_path = '/purchase_calculator/deposit_amount'

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = @api_client.object_to_http_body(purchase_calculator_deposit_amount_request)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Hash<String, Object>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FinancialPlanningApi#purchase_calculator_deposit_amount\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Purchase Calculator - Horizon
    # Calculate the necessary time horizon to achieve the purchase amount
    # @param purchase_calculator_horizon_request Request payload for Purchase Calculator - Horizon
    # @param [Hash] opts the optional parameters
    # @return [Hash<String, Object>]
    def purchase_calculator_horizon(purchase_calculator_horizon_request, opts = {})
      data, _status_code, _headers = purchase_calculator_horizon_with_http_info(purchase_calculator_horizon_request, opts)
      data
    end

    # Purchase Calculator - Horizon
    # Calculate the necessary time horizon to achieve the purchase amount
    # @param purchase_calculator_horizon_request Request payload for Purchase Calculator - Horizon
    # @param [Hash] opts the optional parameters
    # @return [Array<(Hash<String, Object>, Fixnum, Hash)>] Hash<String, Object> data, response status code and response headers
    def purchase_calculator_horizon_with_http_info(purchase_calculator_horizon_request, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FinancialPlanningApi.purchase_calculator_horizon ...'
      end
      # verify the required parameter 'purchase_calculator_horizon_request' is set
      if @api_client.config.client_side_validation && purchase_calculator_horizon_request.nil?
        fail ArgumentError, "Missing the required parameter 'purchase_calculator_horizon_request' when calling FinancialPlanningApi.purchase_calculator_horizon"
      end
      # resource path
      local_var_path = '/purchase_calculator/horizon'

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = @api_client.object_to_http_body(purchase_calculator_horizon_request)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Hash<String, Object>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FinancialPlanningApi#purchase_calculator_horizon\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Retirement Calculator - Deposit Amount
    # Calculate the necessary period deposit amount to achieve the retirement expenses
    # @param retirement_calculator_deposit_amount_request Request payload for Retirement Calculator - Deposit AMount
    # @param [Hash] opts the optional parameters
    # @return [Hash<String, Object>]
    def retirement_calculator_deposit_amount(retirement_calculator_deposit_amount_request, opts = {})
      data, _status_code, _headers = retirement_calculator_deposit_amount_with_http_info(retirement_calculator_deposit_amount_request, opts)
      data
    end

    # Retirement Calculator - Deposit Amount
    # Calculate the necessary period deposit amount to achieve the retirement expenses
    # @param retirement_calculator_deposit_amount_request Request payload for Retirement Calculator - Deposit AMount
    # @param [Hash] opts the optional parameters
    # @return [Array<(Hash<String, Object>, Fixnum, Hash)>] Hash<String, Object> data, response status code and response headers
    def retirement_calculator_deposit_amount_with_http_info(retirement_calculator_deposit_amount_request, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FinancialPlanningApi.retirement_calculator_deposit_amount ...'
      end
      # verify the required parameter 'retirement_calculator_deposit_amount_request' is set
      if @api_client.config.client_side_validation && retirement_calculator_deposit_amount_request.nil?
        fail ArgumentError, "Missing the required parameter 'retirement_calculator_deposit_amount_request' when calling FinancialPlanningApi.retirement_calculator_deposit_amount"
      end
      # resource path
      local_var_path = '/retirement_calculator/deposit_amount'

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = @api_client.object_to_http_body(retirement_calculator_deposit_amount_request)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Hash<String, Object>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FinancialPlanningApi#retirement_calculator_deposit_amount\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Retirement Calculator - Expenses
    # Calculate the achievable retirement expenses
    # @param retirement_calculator_expenses_request Request payload for Retirement Calculator - Expenses
    # @param [Hash] opts the optional parameters
    # @return [Hash<String, Object>]
    def retirement_calculator_expenses(retirement_calculator_expenses_request, opts = {})
      data, _status_code, _headers = retirement_calculator_expenses_with_http_info(retirement_calculator_expenses_request, opts)
      data
    end

    # Retirement Calculator - Expenses
    # Calculate the achievable retirement expenses
    # @param retirement_calculator_expenses_request Request payload for Retirement Calculator - Expenses
    # @param [Hash] opts the optional parameters
    # @return [Array<(Hash<String, Object>, Fixnum, Hash)>] Hash<String, Object> data, response status code and response headers
    def retirement_calculator_expenses_with_http_info(retirement_calculator_expenses_request, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FinancialPlanningApi.retirement_calculator_expenses ...'
      end
      # verify the required parameter 'retirement_calculator_expenses_request' is set
      if @api_client.config.client_side_validation && retirement_calculator_expenses_request.nil?
        fail ArgumentError, "Missing the required parameter 'retirement_calculator_expenses_request' when calling FinancialPlanningApi.retirement_calculator_expenses"
      end
      # resource path
      local_var_path = '/retirement_calculator/expenses'

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = @api_client.object_to_http_body(retirement_calculator_expenses_request)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Hash<String, Object>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FinancialPlanningApi#retirement_calculator_expenses\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Retirement Calculator - Percent Covered
    # Calculate the achievable percentage of retirement expenses that can be covered
    # @param retirement_calculator_percent_covered_request Request payload for Retirement Calculator - Percent Covered
    # @param [Hash] opts the optional parameters
    # @return [Hash<String, Object>]
    def retirement_calculator_percent_covered(retirement_calculator_percent_covered_request, opts = {})
      data, _status_code, _headers = retirement_calculator_percent_covered_with_http_info(retirement_calculator_percent_covered_request, opts)
      data
    end

    # Retirement Calculator - Percent Covered
    # Calculate the achievable percentage of retirement expenses that can be covered
    # @param retirement_calculator_percent_covered_request Request payload for Retirement Calculator - Percent Covered
    # @param [Hash] opts the optional parameters
    # @return [Array<(Hash<String, Object>, Fixnum, Hash)>] Hash<String, Object> data, response status code and response headers
    def retirement_calculator_percent_covered_with_http_info(retirement_calculator_percent_covered_request, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: FinancialPlanningApi.retirement_calculator_percent_covered ...'
      end
      # verify the required parameter 'retirement_calculator_percent_covered_request' is set
      if @api_client.config.client_side_validation && retirement_calculator_percent_covered_request.nil?
        fail ArgumentError, "Missing the required parameter 'retirement_calculator_percent_covered_request' when calling FinancialPlanningApi.retirement_calculator_percent_covered"
      end
      # resource path
      local_var_path = '/retirement_calculator/percent_covered'

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = @api_client.object_to_http_body(retirement_calculator_percent_covered_request)
      auth_names = ['oauth2']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Hash<String, Object>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: FinancialPlanningApi#retirement_calculator_percent_covered\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
