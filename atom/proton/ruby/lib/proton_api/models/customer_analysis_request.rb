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
  class CustomerAnalysisRequest
    attr_accessor :customer_ids

    attr_accessor :benchmark_start_date

    attr_accessor :client_id

    attr_accessor :currency_conversion

    attr_accessor :response_limit

    attr_accessor :end_date

    attr_accessor :currency_code

    attr_accessor :start_date

    attr_accessor :benchmark_end_date

    attr_accessor :only_active_customers

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'customer_ids' => :'customer_ids',
        :'benchmark_start_date' => :'benchmark_start_date',
        :'client_id' => :'client_id',
        :'currency_conversion' => :'currency_conversion',
        :'response_limit' => :'response_limit',
        :'end_date' => :'end_date',
        :'currency_code' => :'currency_code',
        :'start_date' => :'start_date',
        :'benchmark_end_date' => :'benchmark_end_date',
        :'only_active_customers' => :'only_active_customers'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'customer_ids' => :'Array<String>',
        :'benchmark_start_date' => :'Date',
        :'client_id' => :'String',
        :'currency_conversion' => :'String',
        :'response_limit' => :'Integer',
        :'end_date' => :'Date',
        :'currency_code' => :'String',
        :'start_date' => :'Date',
        :'benchmark_end_date' => :'Date',
        :'only_active_customers' => :'BOOLEAN'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

      if attributes.has_key?(:'customer_ids')
        if (value = attributes[:'customer_ids']).is_a?(Array)
          self.customer_ids = value
        end
      end

      if attributes.has_key?(:'benchmark_start_date')
        self.benchmark_start_date = attributes[:'benchmark_start_date']
      end

      if attributes.has_key?(:'client_id')
        self.client_id = attributes[:'client_id']
      end

      if attributes.has_key?(:'currency_conversion')
        self.currency_conversion = attributes[:'currency_conversion']
      end

      if attributes.has_key?(:'response_limit')
        self.response_limit = attributes[:'response_limit']
      else
        self.response_limit = 10
      end

      if attributes.has_key?(:'end_date')
        self.end_date = attributes[:'end_date']
      end

      if attributes.has_key?(:'currency_code')
        self.currency_code = attributes[:'currency_code']
      end

      if attributes.has_key?(:'start_date')
        self.start_date = attributes[:'start_date']
      end

      if attributes.has_key?(:'benchmark_end_date')
        self.benchmark_end_date = attributes[:'benchmark_end_date']
      end

      if attributes.has_key?(:'only_active_customers')
        self.only_active_customers = attributes[:'only_active_customers']
      else
        self.only_active_customers = false
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          customer_ids == o.customer_ids &&
          benchmark_start_date == o.benchmark_start_date &&
          client_id == o.client_id &&
          currency_conversion == o.currency_conversion &&
          response_limit == o.response_limit &&
          end_date == o.end_date &&
          currency_code == o.currency_code &&
          start_date == o.start_date &&
          benchmark_end_date == o.benchmark_end_date &&
          only_active_customers == o.only_active_customers
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [customer_ids, benchmark_start_date, client_id, currency_conversion, response_limit, end_date, currency_code, start_date, benchmark_end_date, only_active_customers].hash
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
