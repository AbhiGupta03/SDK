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
  class PurchaseCalculatorHorizonRequest
    attr_accessor :inflation_rate

    attr_accessor :investment_tax

    attr_accessor :portfolio_return

    attr_accessor :aggregation_account_ids

    attr_accessor :current_savings

    attr_accessor :deposit_schedule

    attr_accessor :purchase_amount

    attr_accessor :account_ids

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'inflation_rate' => :'inflation_rate',
        :'investment_tax' => :'investment_tax',
        :'portfolio_return' => :'portfolio_return',
        :'aggregation_account_ids' => :'aggregation_account_ids',
        :'current_savings' => :'current_savings',
        :'deposit_schedule' => :'deposit_schedule',
        :'purchase_amount' => :'purchase_amount',
        :'account_ids' => :'account_ids'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'inflation_rate' => :'Float',
        :'investment_tax' => :'Float',
        :'portfolio_return' => :'Float',
        :'aggregation_account_ids' => :'Array<String>',
        :'current_savings' => :'Float',
        :'deposit_schedule' => :'CalculatorDepositSchedule1',
        :'purchase_amount' => :'Float',
        :'account_ids' => :'Array<String>'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

      if attributes.has_key?(:'inflation_rate')
        self.inflation_rate = attributes[:'inflation_rate']
      else
        self.inflation_rate = 0.0
      end

      if attributes.has_key?(:'investment_tax')
        self.investment_tax = attributes[:'investment_tax']
      else
        self.investment_tax = 0.0
      end

      if attributes.has_key?(:'portfolio_return')
        self.portfolio_return = attributes[:'portfolio_return']
      end

      if attributes.has_key?(:'aggregation_account_ids')
        if (value = attributes[:'aggregation_account_ids']).is_a?(Array)
          self.aggregation_account_ids = value
        end
      end

      if attributes.has_key?(:'current_savings')
        self.current_savings = attributes[:'current_savings']
      else
        self.current_savings = 0.0
      end

      if attributes.has_key?(:'deposit_schedule')
        self.deposit_schedule = attributes[:'deposit_schedule']
      end

      if attributes.has_key?(:'purchase_amount')
        self.purchase_amount = attributes[:'purchase_amount']
      end

      if attributes.has_key?(:'account_ids')
        if (value = attributes[:'account_ids']).is_a?(Array)
          self.account_ids = value
        end
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if !@inflation_rate.nil? && @inflation_rate < -1
        invalid_properties.push('invalid value for "inflation_rate", must be greater than or equal to -1.')
      end

      if !@investment_tax.nil? && @investment_tax > 1
        invalid_properties.push('invalid value for "investment_tax", must be smaller than or equal to 1.')
      end

      if !@investment_tax.nil? && @investment_tax < 0
        invalid_properties.push('invalid value for "investment_tax", must be greater than or equal to 0.')
      end

      if @portfolio_return.nil?
        invalid_properties.push('invalid value for "portfolio_return", portfolio_return cannot be nil.')
      end

      if @portfolio_return < -1
        invalid_properties.push('invalid value for "portfolio_return", must be greater than or equal to -1.')
      end

      if !@current_savings.nil? && @current_savings < 0
        invalid_properties.push('invalid value for "current_savings", must be greater than or equal to 0.')
      end

      if @purchase_amount.nil?
        invalid_properties.push('invalid value for "purchase_amount", purchase_amount cannot be nil.')
      end

      if @purchase_amount < 0
        invalid_properties.push('invalid value for "purchase_amount", must be greater than or equal to 0.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if !@inflation_rate.nil? && @inflation_rate < -1
      return false if !@investment_tax.nil? && @investment_tax > 1
      return false if !@investment_tax.nil? && @investment_tax < 0
      return false if @portfolio_return.nil?
      return false if @portfolio_return < -1
      return false if !@current_savings.nil? && @current_savings < 0
      return false if @purchase_amount.nil?
      return false if @purchase_amount < 0
      true
    end

    # Custom attribute writer method with validation
    # @param [Object] inflation_rate Value to be assigned
    def inflation_rate=(inflation_rate)
      if !inflation_rate.nil? && inflation_rate < -1
        fail ArgumentError, 'invalid value for "inflation_rate", must be greater than or equal to -1.'
      end

      @inflation_rate = inflation_rate
    end

    # Custom attribute writer method with validation
    # @param [Object] investment_tax Value to be assigned
    def investment_tax=(investment_tax)
      if !investment_tax.nil? && investment_tax > 1
        fail ArgumentError, 'invalid value for "investment_tax", must be smaller than or equal to 1.'
      end

      if !investment_tax.nil? && investment_tax < 0
        fail ArgumentError, 'invalid value for "investment_tax", must be greater than or equal to 0.'
      end

      @investment_tax = investment_tax
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
    # @param [Object] current_savings Value to be assigned
    def current_savings=(current_savings)
      if !current_savings.nil? && current_savings < 0
        fail ArgumentError, 'invalid value for "current_savings", must be greater than or equal to 0.'
      end

      @current_savings = current_savings
    end

    # Custom attribute writer method with validation
    # @param [Object] purchase_amount Value to be assigned
    def purchase_amount=(purchase_amount)
      if purchase_amount.nil?
        fail ArgumentError, 'purchase_amount cannot be nil'
      end

      if purchase_amount < 0
        fail ArgumentError, 'invalid value for "purchase_amount", must be greater than or equal to 0.'
      end

      @purchase_amount = purchase_amount
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          inflation_rate == o.inflation_rate &&
          investment_tax == o.investment_tax &&
          portfolio_return == o.portfolio_return &&
          aggregation_account_ids == o.aggregation_account_ids &&
          current_savings == o.current_savings &&
          deposit_schedule == o.deposit_schedule &&
          purchase_amount == o.purchase_amount &&
          account_ids == o.account_ids
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [inflation_rate, investment_tax, portfolio_return, aggregation_account_ids, current_savings, deposit_schedule, purchase_amount, account_ids].hash
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
