=begin
#Hydrogen Nucleus API

#The Hydrogen Nucleus API

OpenAPI spec version: 1.9.4
Contact: info@hydrogenplatform.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.19

=end

require 'date'

module NucleusApi
  # Card Object
  class Card
    attr_accessor :address

    # businessId
    attr_accessor :business_id

    # cardHolderName
    attr_accessor :card_holder_name

    # card_image
    attr_accessor :card_image

    # cardIssuance
    attr_accessor :card_issuance

    # cardName
    attr_accessor :card_name

    # cardNetwork
    attr_accessor :card_network

    # cardProgramId
    attr_accessor :card_program_id

    # cardType
    attr_accessor :card_type

    # clientId
    attr_accessor :client_id

    attr_accessor :create_date

    # creditLimit
    attr_accessor :credit_limit

    # currencyCode
    attr_accessor :currency_code

    # expiryDate
    attr_accessor :expiry_date

    # fulfillment
    attr_accessor :fulfillment

    attr_accessor :id

    # institutionId
    attr_accessor :institution_id

    # institutionName
    attr_accessor :institution_name

    # is_active
    attr_accessor :is_active

    # is_pin_set
    attr_accessor :is_pin_set

    # is_primary
    attr_accessor :is_primary

    # is_reloadable
    attr_accessor :is_reloadable

    # mask
    attr_accessor :mask

    attr_accessor :metadata

    # phoneNumber
    attr_accessor :phone_number

    # portfolioId
    attr_accessor :portfolio_id

    # prepaidAmount
    attr_accessor :prepaid_amount

    attr_accessor :secondary_id

    # status
    attr_accessor :status

    attr_accessor :update_date

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'address' => :'address',
        :'business_id' => :'business_id',
        :'card_holder_name' => :'card_holder_name',
        :'card_image' => :'card_image',
        :'card_issuance' => :'card_issuance',
        :'card_name' => :'card_name',
        :'card_network' => :'card_network',
        :'card_program_id' => :'card_program_id',
        :'card_type' => :'card_type',
        :'client_id' => :'client_id',
        :'create_date' => :'create_date',
        :'credit_limit' => :'credit_limit',
        :'currency_code' => :'currency_code',
        :'expiry_date' => :'expiry_date',
        :'fulfillment' => :'fulfillment',
        :'id' => :'id',
        :'institution_id' => :'institution_id',
        :'institution_name' => :'institution_name',
        :'is_active' => :'is_active',
        :'is_pin_set' => :'is_pin_set',
        :'is_primary' => :'is_primary',
        :'is_reloadable' => :'is_reloadable',
        :'mask' => :'mask',
        :'metadata' => :'metadata',
        :'phone_number' => :'phone_number',
        :'portfolio_id' => :'portfolio_id',
        :'prepaid_amount' => :'prepaid_amount',
        :'secondary_id' => :'secondary_id',
        :'status' => :'status',
        :'update_date' => :'update_date'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'address' => :'Array<CardAddress>',
        :'business_id' => :'String',
        :'card_holder_name' => :'String',
        :'card_image' => :'String',
        :'card_issuance' => :'String',
        :'card_name' => :'String',
        :'card_network' => :'String',
        :'card_program_id' => :'String',
        :'card_type' => :'String',
        :'client_id' => :'String',
        :'create_date' => :'DateTime',
        :'credit_limit' => :'Float',
        :'currency_code' => :'String',
        :'expiry_date' => :'Date',
        :'fulfillment' => :'String',
        :'id' => :'String',
        :'institution_id' => :'String',
        :'institution_name' => :'String',
        :'is_active' => :'BOOLEAN',
        :'is_pin_set' => :'BOOLEAN',
        :'is_primary' => :'BOOLEAN',
        :'is_reloadable' => :'BOOLEAN',
        :'mask' => :'String',
        :'metadata' => :'Hash<String, String>',
        :'phone_number' => :'String',
        :'portfolio_id' => :'String',
        :'prepaid_amount' => :'Float',
        :'secondary_id' => :'String',
        :'status' => :'String',
        :'update_date' => :'DateTime'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

      if attributes.has_key?(:'address')
        if (value = attributes[:'address']).is_a?(Array)
          self.address = value
        end
      end

      if attributes.has_key?(:'business_id')
        self.business_id = attributes[:'business_id']
      end

      if attributes.has_key?(:'card_holder_name')
        self.card_holder_name = attributes[:'card_holder_name']
      end

      if attributes.has_key?(:'card_image')
        self.card_image = attributes[:'card_image']
      end

      if attributes.has_key?(:'card_issuance')
        self.card_issuance = attributes[:'card_issuance']
      end

      if attributes.has_key?(:'card_name')
        self.card_name = attributes[:'card_name']
      end

      if attributes.has_key?(:'card_network')
        self.card_network = attributes[:'card_network']
      end

      if attributes.has_key?(:'card_program_id')
        self.card_program_id = attributes[:'card_program_id']
      end

      if attributes.has_key?(:'card_type')
        self.card_type = attributes[:'card_type']
      end

      if attributes.has_key?(:'client_id')
        self.client_id = attributes[:'client_id']
      end

      if attributes.has_key?(:'create_date')
        self.create_date = attributes[:'create_date']
      end

      if attributes.has_key?(:'credit_limit')
        self.credit_limit = attributes[:'credit_limit']
      end

      if attributes.has_key?(:'currency_code')
        self.currency_code = attributes[:'currency_code']
      end

      if attributes.has_key?(:'expiry_date')
        self.expiry_date = attributes[:'expiry_date']
      end

      if attributes.has_key?(:'fulfillment')
        self.fulfillment = attributes[:'fulfillment']
      end

      if attributes.has_key?(:'id')
        self.id = attributes[:'id']
      end

      if attributes.has_key?(:'institution_id')
        self.institution_id = attributes[:'institution_id']
      end

      if attributes.has_key?(:'institution_name')
        self.institution_name = attributes[:'institution_name']
      end

      if attributes.has_key?(:'is_active')
        self.is_active = attributes[:'is_active']
      end

      if attributes.has_key?(:'is_pin_set')
        self.is_pin_set = attributes[:'is_pin_set']
      end

      if attributes.has_key?(:'is_primary')
        self.is_primary = attributes[:'is_primary']
      end

      if attributes.has_key?(:'is_reloadable')
        self.is_reloadable = attributes[:'is_reloadable']
      end

      if attributes.has_key?(:'mask')
        self.mask = attributes[:'mask']
      end

      if attributes.has_key?(:'metadata')
        if (value = attributes[:'metadata']).is_a?(Hash)
          self.metadata = value
        end
      end

      if attributes.has_key?(:'phone_number')
        self.phone_number = attributes[:'phone_number']
      end

      if attributes.has_key?(:'portfolio_id')
        self.portfolio_id = attributes[:'portfolio_id']
      end

      if attributes.has_key?(:'prepaid_amount')
        self.prepaid_amount = attributes[:'prepaid_amount']
      end

      if attributes.has_key?(:'secondary_id')
        self.secondary_id = attributes[:'secondary_id']
      end

      if attributes.has_key?(:'status')
        self.status = attributes[:'status']
      end

      if attributes.has_key?(:'update_date')
        self.update_date = attributes[:'update_date']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @card_holder_name.nil?
        invalid_properties.push('invalid value for "card_holder_name", card_holder_name cannot be nil.')
      end

      if @card_issuance.nil?
        invalid_properties.push('invalid value for "card_issuance", card_issuance cannot be nil.')
      end

      if @card_name.nil?
        invalid_properties.push('invalid value for "card_name", card_name cannot be nil.')
      end

      if @card_type.nil?
        invalid_properties.push('invalid value for "card_type", card_type cannot be nil.')
      end

      if @portfolio_id.nil?
        invalid_properties.push('invalid value for "portfolio_id", portfolio_id cannot be nil.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @card_holder_name.nil?
      return false if @card_issuance.nil?
      return false if @card_name.nil?
      return false if @card_type.nil?
      return false if @portfolio_id.nil?
      true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          address == o.address &&
          business_id == o.business_id &&
          card_holder_name == o.card_holder_name &&
          card_image == o.card_image &&
          card_issuance == o.card_issuance &&
          card_name == o.card_name &&
          card_network == o.card_network &&
          card_program_id == o.card_program_id &&
          card_type == o.card_type &&
          client_id == o.client_id &&
          create_date == o.create_date &&
          credit_limit == o.credit_limit &&
          currency_code == o.currency_code &&
          expiry_date == o.expiry_date &&
          fulfillment == o.fulfillment &&
          id == o.id &&
          institution_id == o.institution_id &&
          institution_name == o.institution_name &&
          is_active == o.is_active &&
          is_pin_set == o.is_pin_set &&
          is_primary == o.is_primary &&
          is_reloadable == o.is_reloadable &&
          mask == o.mask &&
          metadata == o.metadata &&
          phone_number == o.phone_number &&
          portfolio_id == o.portfolio_id &&
          prepaid_amount == o.prepaid_amount &&
          secondary_id == o.secondary_id &&
          status == o.status &&
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
      [address, business_id, card_holder_name, card_image, card_issuance, card_name, card_network, card_program_id, card_type, client_id, create_date, credit_limit, currency_code, expiry_date, fulfillment, id, institution_id, institution_name, is_active, is_pin_set, is_primary, is_reloadable, mask, metadata, phone_number, portfolio_id, prepaid_amount, secondary_id, status, update_date].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def build_from_hash(attributes)
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
