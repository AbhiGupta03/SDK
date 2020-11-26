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
  # Aggregation Account Transaction Object
  class AggregationAccountTransaction
    # aggregationAccountId
    attr_accessor :aggregation_account_id

    attr_accessor :bank_credit

    attr_accessor :cash

    attr_accessor :create_date

    # currencyCode
    attr_accessor :currency_code

    attr_accessor :id

    attr_accessor :investment

    attr_accessor :is_excluded_analysis

    attr_accessor :is_fee

    attr_accessor :is_recurring

    attr_accessor :is_transfer

    attr_accessor :metadata

    attr_accessor :secondary_id

    # status
    attr_accessor :status

    # transactionDate
    attr_accessor :transaction_date

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
          :'aggregation_account_id' => :'aggregation_account_id',
          :'bank_credit' => :'bank_credit',
          :'cash' => :'cash',
          :'create_date' => :'create_date',
          :'currency_code' => :'currency_code',
          :'id' => :'id',
          :'investment' => :'investment',
          :'is_excluded_analysis' => :'is_excluded_analysis',
          :'is_fee' => :'is_fee',
          :'is_recurring' => :'is_recurring',
          :'is_transfer' => :'is_transfer',
          :'metadata' => :'metadata',
          :'secondary_id' => :'secondary_id',
          :'status' => :'status',
          :'transaction_date' => :'transaction_date',
          :'update_date' => :'update_date'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
          :'aggregation_account_id' => :'String',
          :'bank_credit' => :'BankCredit',
          :'cash' => :'Cash',
          :'create_date' => :'DateTime',
          :'currency_code' => :'String',
          :'id' => :'String',
          :'investment' => :'Investment',
          :'is_excluded_analysis' => :'BOOLEAN',
          :'is_fee' => :'String',
          :'is_recurring' => :'BOOLEAN',
          :'is_transfer' => :'String',
          :'metadata' => :'Hash<String, String>',
          :'secondary_id' => :'String',
          :'status' => :'String',
          :'transaction_date' => :'DateTime',
          :'update_date' => :'DateTime'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

      if attributes.has_key?(:'aggregation_account_id')
        self.aggregation_account_id = attributes[:'aggregation_account_id']
      end

      if attributes.has_key?(:'bank_credit')
        self.bank_credit = attributes[:'bank_credit']
      end

      if attributes.has_key?(:'cash')
        self.cash = attributes[:'cash']
      end

      if attributes.has_key?(:'create_date')
        self.create_date = attributes[:'create_date']
      end

      if attributes.has_key?(:'currency_code')
        self.currency_code = attributes[:'currency_code']
      end

      if attributes.has_key?(:'id')
        self.id = attributes[:'id']
      end

      if attributes.has_key?(:'investment')
        self.investment = attributes[:'investment']
      end

      if attributes.has_key?(:'is_excluded_analysis')
        self.is_excluded_analysis = attributes[:'is_excluded_analysis']
      end

      if attributes.has_key?(:'is_fee')
        self.is_fee = attributes[:'is_fee']
      end

      if attributes.has_key?(:'is_recurring')
        self.is_recurring = attributes[:'is_recurring']
      end

      if attributes.has_key?(:'is_transfer')
        self.is_transfer = attributes[:'is_transfer']
      end

      if attributes.has_key?(:'metadata')
        if (value = attributes[:'metadata']).is_a?(Hash)
          self.metadata = value
        end
      end

      if attributes.has_key?(:'secondary_id')
        self.secondary_id = attributes[:'secondary_id']
      end

      if attributes.has_key?(:'status')
        self.status = attributes[:'status']
      end

      if attributes.has_key?(:'transaction_date')
        self.transaction_date = attributes[:'transaction_date']
      end

      if attributes.has_key?(:'update_date')
        self.update_date = attributes[:'update_date']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @currency_code.nil?
        invalid_properties.push('invalid value for "currency_code", currency_code cannot be nil.')
      end

      if @transaction_date.nil?
        invalid_properties.push('invalid value for "transaction_date", transaction_date cannot be nil.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @currency_code.nil?
      return false if @transaction_date.nil?
      true
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] is_fee Object to be assigned
    def is_fee=(is_fee)
      @is_fee = is_fee
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] is_transfer Object to be assigned
    def is_transfer=(is_transfer)
      @is_transfer = is_transfer
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          aggregation_account_id == o.aggregation_account_id &&
          bank_credit == o.bank_credit &&
          cash == o.cash &&
          create_date == o.create_date &&
          currency_code == o.currency_code &&
          id == o.id &&
          investment == o.investment &&
          is_excluded_analysis == o.is_excluded_analysis &&
          is_fee == o.is_fee &&
          is_recurring == o.is_recurring &&
          is_transfer == o.is_transfer &&
          metadata == o.metadata &&
          secondary_id == o.secondary_id &&
          status == o.status &&
          transaction_date == o.transaction_date &&
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
      [aggregation_account_id, bank_credit, cash, create_date, currency_code, id, investment, is_excluded_analysis, is_fee, is_recurring, is_transfer, metadata, secondary_id, status, transaction_date, update_date].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def build_from_hash(attributes)
      self.class.swagger_types.each_pair do |key, type|
        if type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the the attribute
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
