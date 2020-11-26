=begin
#Hydrogen Proton API

#Financial engineering module of Hydrogen Atom

OpenAPI spec version: 1.8.0
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.16

=end

require 'date'

module ProtonApi
  class EducationCalculatorPercentCoveredRequest
    attr_accessor :total_annual_cost

    attr_accessor :general_inflation_rate

    attr_accessor :education_inflation_rate

    attr_accessor :deposit_schedule

    attr_accessor :portfolio_return

    attr_accessor :aggregation_account_ids

    attr_accessor :initial_balance

    attr_accessor :decumulation_horizon

    attr_accessor :tax_rate

    attr_accessor :account_ids

    attr_accessor :accumulation_horizon

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'total_annual_cost' => :'total_annual_cost',
        :'general_inflation_rate' => :'general_inflation_rate',
        :'education_inflation_rate' => :'education_inflation_rate',
        :'deposit_schedule' => :'deposit_schedule',
        :'portfolio_return' => :'portfolio_return',
        :'aggregation_account_ids' => :'aggregation_account_ids',
        :'initial_balance' => :'initial_balance',
        :'decumulation_horizon' => :'decumulation_horizon',
        :'tax_rate' => :'tax_rate',
        :'account_ids' => :'account_ids',
        :'accumulation_horizon' => :'accumulation_horizon'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'total_annual_cost' => :'Float',
        :'general_inflation_rate' => :'Float',
        :'education_inflation_rate' => :'Float',
        :'deposit_schedule' => :'CalculatorDepositSchedule1',
        :'portfolio_return' => :'Float',
        :'aggregation_account_ids' => :'Array<String>',
        :'initial_balance' => :'Float',
        :'decumulation_horizon' => :'Integer',
        :'tax_rate' => :'Float',
        :'account_ids' => :'Array<String>',
        :'accumulation_horizon' => :'Integer'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

      if attributes.has_key?(:'total_annual_cost')
        self.total_annual_cost = attributes[:'total_annual_cost']
      end

      if attributes.has_key?(:'general_inflation_rate')
        self.general_inflation_rate = attributes[:'general_inflation_rate']
      else
        self.general_inflation_rate = 0.0
      end

      if attributes.has_key?(:'education_inflation_rate')
        self.education_inflation_rate = attributes[:'education_inflation_rate']
      else
        self.education_inflation_rate = 0.05
      end

      if attributes.has_key?(:'deposit_schedule')
        self.deposit_schedule = attributes[:'deposit_schedule']
      end

      if attributes.has_key?(:'portfolio_return')
        self.portfolio_return = attributes[:'portfolio_return']
      end

      if attributes.has_key?(:'aggregation_account_ids')
        if (value = attributes[:'aggregation_account_ids']).is_a?(Array)
          self.aggregation_account_ids = value
        end
      end

      if attributes.has_key?(:'initial_balance')
        self.initial_balance = attributes[:'initial_balance']
      else
        self.initial_balance = 0.0
      end

      if attributes.has_key?(:'decumulation_horizon')
        self.decumulation_horizon = attributes[:'decumulation_horizon']
      end

      if attributes.has_key?(:'tax_rate')
        self.tax_rate = attributes[:'tax_rate']
      else
        self.tax_rate = 0.0
      end

      if attributes.has_key?(:'account_ids')
        if (value = attributes[:'account_ids']).is_a?(Array)
          self.account_ids = value
        end
      end

      if attributes.has_key?(:'accumulation_horizon')
        self.accumulation_horizon = attributes[:'accumulation_horizon']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @total_annual_cost.nil?
        invalid_properties.push('invalid value for "total_annual_cost", total_annual_cost cannot be nil.')
      end

      if @total_annual_cost < 0
        invalid_properties.push('invalid value for "total_annual_cost", must be greater than or equal to 0.')
      end

      if !@general_inflation_rate.nil? && @general_inflation_rate < -1
        invalid_properties.push('invalid value for "general_inflation_rate", must be greater than or equal to -1.')
      end

      if !@education_inflation_rate.nil? && @education_inflation_rate < -1
        invalid_properties.push('invalid value for "education_inflation_rate", must be greater than or equal to -1.')
      end

      if @portfolio_return.nil?
        invalid_properties.push('invalid value for "portfolio_return", portfolio_return cannot be nil.')
      end

      if @portfolio_return < -1
        invalid_properties.push('invalid value for "portfolio_return", must be greater than or equal to -1.')
      end

      if !@initial_balance.nil? && @initial_balance < 0
        invalid_properties.push('invalid value for "initial_balance", must be greater than or equal to 0.')
      end

      if @decumulation_horizon.nil?
        invalid_properties.push('invalid value for "decumulation_horizon", decumulation_horizon cannot be nil.')
      end

      if @decumulation_horizon < 0
        invalid_properties.push('invalid value for "decumulation_horizon", must be greater than or equal to 0.')
      end

      if !@tax_rate.nil? && @tax_rate > 1
        invalid_properties.push('invalid value for "tax_rate", must be smaller than or equal to 1.')
      end

      if !@tax_rate.nil? && @tax_rate < 0
        invalid_properties.push('invalid value for "tax_rate", must be greater than or equal to 0.')
      end

      if @accumulation_horizon.nil?
        invalid_properties.push('invalid value for "accumulation_horizon", accumulation_horizon cannot be nil.')
      end

      if @accumulation_horizon < 0
        invalid_properties.push('invalid value for "accumulation_horizon", must be greater than or equal to 0.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @total_annual_cost.nil?
      return false if @total_annual_cost < 0
      return false if !@general_inflation_rate.nil? && @general_inflation_rate < -1
      return false if !@education_inflation_rate.nil? && @education_inflation_rate < -1
      return false if @portfolio_return.nil?
      return false if @portfolio_return < -1
      return false if !@initial_balance.nil? && @initial_balance < 0
      return false if @decumulation_horizon.nil?
      return false if @decumulation_horizon < 0
      return false if !@tax_rate.nil? && @tax_rate > 1
      return false if !@tax_rate.nil? && @tax_rate < 0
      return false if @accumulation_horizon.nil?
      return false if @accumulation_horizon < 0
      true
    end

    # Custom attribute writer method with validation
    # @param [Object] total_annual_cost Value to be assigned
    def total_annual_cost=(total_annual_cost)
      if total_annual_cost.nil?
        fail ArgumentError, 'total_annual_cost cannot be nil'
      end

      if total_annual_cost < 0
        fail ArgumentError, 'invalid value for "total_annual_cost", must be greater than or equal to 0.'
      end

      @total_annual_cost = total_annual_cost
    end

    # Custom attribute writer method with validation
    # @param [Object] general_inflation_rate Value to be assigned
    def general_inflation_rate=(general_inflation_rate)
      if !general_inflation_rate.nil? && general_inflation_rate < -1
        fail ArgumentError, 'invalid value for "general_inflation_rate", must be greater than or equal to -1.'
      end

      @general_inflation_rate = general_inflation_rate
    end

    # Custom attribute writer method with validation
    # @param [Object] education_inflation_rate Value to be assigned
    def education_inflation_rate=(education_inflation_rate)
      if !education_inflation_rate.nil? && education_inflation_rate < -1
        fail ArgumentError, 'invalid value for "education_inflation_rate", must be greater than or equal to -1.'
      end

      @education_inflation_rate = education_inflation_rate
    end

    # Custom attribute writer method with validation
    # @param [Object] portfolio_return Value to be assigned
    def portfolio_return=(portfolio_return)
      if portfolio_return.nil?
        fail ArgumentError, 'portfolio_return cannot be nil'
      end

      if portfolio_return < -1
        fail ArgumentError, 'invalid value for "portfolio_return", must be greater than or equal to -1.'
      end

      @portfolio_return = portfolio_return
    end

    # Custom attribute writer method with validation
    # @param [Object] initial_balance Value to be assigned
    def initial_balance=(initial_balance)
      if !initial_balance.nil? && initial_balance < 0
        fail ArgumentError, 'invalid value for "initial_balance", must be greater than or equal to 0.'
      end

      @initial_balance = initial_balance
    end

    # Custom attribute writer method with validation
    # @param [Object] decumulation_horizon Value to be assigned
    def decumulation_horizon=(decumulation_horizon)
      if decumulation_horizon.nil?
        fail ArgumentError, 'decumulation_horizon cannot be nil'
      end

      if decumulation_horizon < 0
        fail ArgumentError, 'invalid value for "decumulation_horizon", must be greater than or equal to 0.'
      end

      @decumulation_horizon = decumulation_horizon
    end

    # Custom attribute writer method with validation
    # @param [Object] tax_rate Value to be assigned
    def tax_rate=(tax_rate)
      if !tax_rate.nil? && tax_rate > 1
        fail ArgumentError, 'invalid value for "tax_rate", must be smaller than or equal to 1.'
      end

      if !tax_rate.nil? && tax_rate < 0
        fail ArgumentError, 'invalid value for "tax_rate", must be greater than or equal to 0.'
      end

      @tax_rate = tax_rate
    end

    # Custom attribute writer method with validation
    # @param [Object] accumulation_horizon Value to be assigned
    def accumulation_horizon=(accumulation_horizon)
      if accumulation_horizon.nil?
        fail ArgumentError, 'accumulation_horizon cannot be nil'
      end

      if accumulation_horizon < 0
        fail ArgumentError, 'invalid value for "accumulation_horizon", must be greater than or equal to 0.'
      end

      @accumulation_horizon = accumulation_horizon
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          total_annual_cost == o.total_annual_cost &&
          general_inflation_rate == o.general_inflation_rate &&
          education_inflation_rate == o.education_inflation_rate &&
          deposit_schedule == o.deposit_schedule &&
          portfolio_return == o.portfolio_return &&
          aggregation_account_ids == o.aggregation_account_ids &&
          initial_balance == o.initial_balance &&
          decumulation_horizon == o.decumulation_horizon &&
          tax_rate == o.tax_rate &&
          account_ids == o.account_ids &&
          accumulation_horizon == o.accumulation_horizon
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [total_annual_cost, general_inflation_rate, education_inflation_rate, deposit_schedule, portfolio_return, aggregation_account_ids, initial_balance, decumulation_horizon, tax_rate, account_ids, accumulation_horizon].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      self.class.swagger_types.each_pair do |key, type|
        if type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the attribute
          # is documented as an array but the input is not
          if attributes[self.class.attribute_map[key]].is_a?(Array)
            self.send("#{key}=", attributes[self.class.attribute_map[key]].map { |v| _deserialize($1, v) })
          end
        elsif !attributes[self.class.attribute_map[key]].nil?
          self.send("#{key}=", _deserialize(type, attributes[self.class.attribute_map[key]]))
        elsif attributes[self.class.attribute_map[key]].nil?
          self.send("#{key}=", attributes[self.class.attribute_map[key]])
        end # or else data not found in attributes(hash), not an issue as the data can be optional
      end
      self
    end
# Deserializes the data based on type
    # @param string type Data type
    # @param string value Value to be deserialized
    # @return [Object] Deserialized data
    def _deserialize(type, value)
      case type.to_sym
      when :DateTime
        (value)
      when :Date
        (value)
      when :String
        value.to_s
      when :Integer
        value.to_i
      when :Float
        value.to_f
      when :BOOLEAN
        if value.to_s =~ /\A(true|t|yes|y|1)\z/i
          true
        else
          false
        end
      when :Object
        # generic object (usually a Hash), return directly
        value
      when /\AArray<(?<inner_type>.+)>\z/
        inner_type = Regexp.last_match[:inner_type]
        value.map { |v| _deserialize(inner_type, v) }
      when /\AHash<(?<k_type>.+?), (?<v_type>.+)>\z/
        k_type = Regexp.last_match[:k_type]
        v_type = Regexp.last_match[:v_type]
        {}.tap do |hash|
          value.each do |k, v|
            hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
          end
        end
      else # model
        temp_model = ProtonApi.const_get(type).new
        temp_model.build_from_hash(value)
      end
    end

    # Returns the string representation of the object
    # @return [String] String presentation of the object
    def to_s
      to_hash.to_s
    end

    # to_body is an alias to to_hash (backward compatibility)
    # @return [Hash] Returns the object in the form of hash
    def to_body
      to_hash
    end

    # Returns the object in the form of hash
    # @return [Hash] Returns the object in the form of hash
    def to_hash
      hash = {}
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        hash[param] = _to_hash(value)
      end
      hash
    end


    # Outputs non-array value in the form of hash
    # For object, use to_hash. Otherwise, just return the value
    # @param [Object] value Any valid value
    # @return [Hash] Returns the value in the form of hash
    def _to_hash(value)
      if value.is_a?(Array)
        value.compact.map { |v| _to_hash(v) }
      elsif value.is_a?(Hash)
        {}.tap do |hash|
          value.each { |k, v| hash[k] = _to_hash(v) }
        end
      elsif value.respond_to? :to_hash
        value.to_hash
      else
        value
      end
    end

  end
end
