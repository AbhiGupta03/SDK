=begin
#Hydrogen Nucleus API

#The Hydrogen Nucleus API

OpenAPI spec version: 1.8.0
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.15

=end

require 'date'

module NucleusApi
  # Score Object
  class Score
    # accountId
    attr_accessor :account_id

    # allocationId
    attr_accessor :allocation_id

    # benchmarkId
    attr_accessor :benchmark_id

    # clientId
    attr_accessor :client_id

    attr_accessor :create_date

    # goalId
    attr_accessor :goal_id

    attr_accessor :id

    # metadata
    attr_accessor :metadata

    # modelId
    attr_accessor :model_id

    # portfolioId
    attr_accessor :portfolio_id

    attr_accessor :score_time_stamp

    # scoreType
    attr_accessor :score_type

    # scoreValue
    attr_accessor :score_value

    attr_accessor :secondary_id

    # securityId
    attr_accessor :security_id

    attr_accessor :update_date

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
        :'account_id' => :'account_id',
        :'allocation_id' => :'allocation_id',
        :'benchmark_id' => :'benchmark_id',
        :'client_id' => :'client_id',
        :'create_date' => :'create_date',
        :'goal_id' => :'goal_id',
        :'id' => :'id',
        :'metadata' => :'metadata',
        :'model_id' => :'model_id',
        :'portfolio_id' => :'portfolio_id',
        :'score_time_stamp' => :'score_time_stamp',
        :'score_type' => :'score_type',
        :'score_value' => :'score_value',
        :'secondary_id' => :'secondary_id',
        :'security_id' => :'security_id',
        :'update_date' => :'update_date'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'account_id' => :'String',
        :'allocation_id' => :'String',
        :'benchmark_id' => :'String',
        :'client_id' => :'String',
        :'create_date' => :'DateTime',
        :'goal_id' => :'String',
        :'id' => :'String',
        :'metadata' => :'Hash<String, String>',
        :'model_id' => :'String',
        :'portfolio_id' => :'String',
        :'score_time_stamp' => :'DateTime',
        :'score_type' => :'String',
        :'score_value' => :'String',
        :'secondary_id' => :'String',
        :'security_id' => :'String',
        :'update_date' => :'DateTime'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

      if attributes.has_key?(:'account_id')
        self.account_id = attributes[:'account_id']
      end

      if attributes.has_key?(:'allocation_id')
        self.allocation_id = attributes[:'allocation_id']
      end

      if attributes.has_key?(:'benchmark_id')
        self.benchmark_id = attributes[:'benchmark_id']
      end

      if attributes.has_key?(:'client_id')
        self.client_id = attributes[:'client_id']
      end

      if attributes.has_key?(:'create_date')
        self.create_date = attributes[:'create_date']
      end

      if attributes.has_key?(:'goal_id')
        self.goal_id = attributes[:'goal_id']
      end

      if attributes.has_key?(:'id')
        self.id = attributes[:'id']
      end

      if attributes.has_key?(:'metadata')
        if (value = attributes[:'metadata']).is_a?(Hash)
          self.metadata = value
        end
      end

      if attributes.has_key?(:'model_id')
        self.model_id = attributes[:'model_id']
      end

      if attributes.has_key?(:'portfolio_id')
        self.portfolio_id = attributes[:'portfolio_id']
      end

      if attributes.has_key?(:'score_time_stamp')
        self.score_time_stamp = attributes[:'score_time_stamp']
      end

      if attributes.has_key?(:'score_type')
        self.score_type = attributes[:'score_type']
      end

      if attributes.has_key?(:'score_value')
        self.score_value = attributes[:'score_value']
      end

      if attributes.has_key?(:'secondary_id')
        self.secondary_id = attributes[:'secondary_id']
      end

      if attributes.has_key?(:'security_id')
        self.security_id = attributes[:'security_id']
      end

      if attributes.has_key?(:'update_date')
        self.update_date = attributes[:'update_date']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @score_type.nil?
        invalid_properties.push('invalid value for "score_type", score_type cannot be nil.')
      end

      if @score_value.nil?
        invalid_properties.push('invalid value for "score_value", score_value cannot be nil.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @score_type.nil?
      score_type_validator = EnumAttributeValidator.new('String', ['goal_achievement_score', 'portfolio_optimization_score', 'credit_score', 'dimensional_risk_score', 'diversification_score', 'risk_score', 'risk_profile'])
      return false unless score_type_validator.valid?(@score_type.downcase)
      return false if @score_value.nil?
      true
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] score_type Object to be assigned
    def score_type=(score_type)
      validator = EnumAttributeValidator.new('String', ['goal_achievement_score', 'portfolio_optimization_score', 'credit_score', 'dimensional_risk_score', 'diversification_score', 'risk_score', 'risk_profile'])
      unless validator.valid?(score_type.downcase)
        fail ArgumentError, 'invalid value for "score_type", must be one of #{validator.allowable_values}.'
      end
      @score_type = score_type
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          account_id == o.account_id &&
          allocation_id == o.allocation_id &&
          benchmark_id == o.benchmark_id &&
          client_id == o.client_id &&
          create_date == o.create_date &&
          goal_id == o.goal_id &&
          id == o.id &&
          metadata == o.metadata &&
          model_id == o.model_id &&
          portfolio_id == o.portfolio_id &&
          score_time_stamp == o.score_time_stamp &&
          score_type == o.score_type &&
          score_value == o.score_value &&
          secondary_id == o.secondary_id &&
          security_id == o.security_id &&
          update_date == o.update_date
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [account_id, allocation_id, benchmark_id, client_id, create_date, goal_id, id, metadata, model_id, portfolio_id, score_time_stamp, score_type, score_value, secondary_id, security_id, update_date].hash
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
        DateTime.parse(value)
      when :Date
        Date.parse(value)
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
        temp_model = NucleusApi.const_get(type).new
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
        next if value.nil?
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
