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
  class DecumulationGoalDepositConfig
    attr_accessor :dep_end_reference

    attr_accessor :dep_inflation

    attr_accessor :dep_amount

    attr_accessor :dep_start_reference

    attr_accessor :dep_frequency

    attr_accessor :dep_end_period

    attr_accessor :dep_start_period

    class EnumAttributeValidator
      attr_reader :datatype
      attr_reader :allowable_values

      def initialize(datatype, allowable_values)
        @allowable_values = allowable_values.map do |value|
          case datatype.to_s
          when /Integer/i
            value.to_i
          when /Float/i
            value.to_f
          else
            value
          end
        end
      end

      def valid?(value)
        !value || allowable_values.include?(value)
      end
    end

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'dep_end_reference' => :'dep_end_reference',
        :'dep_inflation' => :'dep_inflation',
        :'dep_amount' => :'dep_amount',
        :'dep_start_reference' => :'dep_start_reference',
        :'dep_frequency' => :'dep_frequency',
        :'dep_end_period' => :'dep_end_period',
        :'dep_start_period' => :'dep_start_period'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'dep_end_reference' => :'String',
        :'dep_inflation' => :'Float',
        :'dep_amount' => :'Float',
        :'dep_start_reference' => :'String',
        :'dep_frequency' => :'String',
        :'dep_end_period' => :'Integer',
        :'dep_start_period' => :'Integer'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

      if attributes.has_key?(:'dep_end_reference')
        self.dep_end_reference = attributes[:'dep_end_reference']
      else
        self.dep_end_reference = 'a_end'
      end

      if attributes.has_key?(:'dep_inflation')
        self.dep_inflation = attributes[:'dep_inflation']
      else
        self.dep_inflation = 0.0
      end

      if attributes.has_key?(:'dep_amount')
        self.dep_amount = attributes[:'dep_amount']
      end

      if attributes.has_key?(:'dep_start_reference')
        self.dep_start_reference = attributes[:'dep_start_reference']
      else
        self.dep_start_reference = 'a_start'
      end

      if attributes.has_key?(:'dep_frequency')
        self.dep_frequency = attributes[:'dep_frequency']
      else
        self.dep_frequency = 'year'
      end

      if attributes.has_key?(:'dep_end_period')
        self.dep_end_period = attributes[:'dep_end_period']
      else
        self.dep_end_period = 0
      end

      if attributes.has_key?(:'dep_start_period')
        self.dep_start_period = attributes[:'dep_start_period']
      else
        self.dep_start_period = 0
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if !@dep_inflation.nil? && @dep_inflation < -1
        invalid_properties.push('invalid value for "dep_inflation", must be greater than or equal to -1.')
      end

      if !@dep_amount.nil? && @dep_amount < 0
        invalid_properties.push('invalid value for "dep_amount", must be greater than or equal to 0.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      dep_end_reference_validator = EnumAttributeValidator.new('String', ['a_start', 'a_end', 'd_end'])
      return false unless dep_end_reference_validator.valid?(@dep_end_reference)
      return false if !@dep_inflation.nil? && @dep_inflation < -1
      return false if !@dep_amount.nil? && @dep_amount < 0
      dep_start_reference_validator = EnumAttributeValidator.new('String', ['a_start', 'a_end', 'd_end'])
      return false unless dep_start_reference_validator.valid?(@dep_start_reference)
      dep_frequency_validator = EnumAttributeValidator.new('String', ['year', 'six_months', 'quarter', 'month', 'two_weeks', 'week', 'day'])
      return false unless dep_frequency_validator.valid?(@dep_frequency)
      true
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] dep_end_reference Object to be assigned
    def dep_end_reference=(dep_end_reference)
      validator = EnumAttributeValidator.new('String', ['a_start', 'a_end', 'd_end'])
      unless validator.valid?(dep_end_reference)
        fail ArgumentError, 'invalid value for "dep_end_reference", must be one of #{validator.allowable_values}.'
      end
      @dep_end_reference = dep_end_reference
    end

    # Custom attribute writer method with validation
    # @param [Object] dep_inflation Value to be assigned
    def dep_inflation=(dep_inflation)
      if !dep_inflation.nil? && dep_inflation < -1
        fail ArgumentError, 'invalid value for "dep_inflation", must be greater than or equal to -1.'
      end

      @dep_inflation = dep_inflation
    end

    # Custom attribute writer method with validation
    # @param [Object] dep_amount Value to be assigned
    def dep_amount=(dep_amount)
      if !dep_amount.nil? && dep_amount < 0
        fail ArgumentError, 'invalid value for "dep_amount", must be greater than or equal to 0.'
      end

      @dep_amount = dep_amount
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] dep_start_reference Object to be assigned
    def dep_start_reference=(dep_start_reference)
      validator = EnumAttributeValidator.new('String', ['a_start', 'a_end', 'd_end'])
      unless validator.valid?(dep_start_reference)
        fail ArgumentError, 'invalid value for "dep_start_reference", must be one of #{validator.allowable_values}.'
      end
      @dep_start_reference = dep_start_reference
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] dep_frequency Object to be assigned
    def dep_frequency=(dep_frequency)
      validator = EnumAttributeValidator.new('String', ['year', 'six_months', 'quarter', 'month', 'two_weeks', 'week', 'day'])
      unless validator.valid?(dep_frequency)
        fail ArgumentError, 'invalid value for "dep_frequency", must be one of #{validator.allowable_values}.'
      end
      @dep_frequency = dep_frequency
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          dep_end_reference == o.dep_end_reference &&
          dep_inflation == o.dep_inflation &&
          dep_amount == o.dep_amount &&
          dep_start_reference == o.dep_start_reference &&
          dep_frequency == o.dep_frequency &&
          dep_end_period == o.dep_end_period &&
          dep_start_period == o.dep_start_period
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [dep_end_reference, dep_inflation, dep_amount, dep_start_reference, dep_frequency, dep_end_period, dep_start_period].hash
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
