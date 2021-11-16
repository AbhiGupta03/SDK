/*
 * Hydrogen Nucleus API
 *
 * The Hydrogen Nucleus API
 *
 * API version: 1.9.4
 * Contact: info@hydrogenplatform.com
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */

package nucleus_api



// AccountType Object
type AccountType struct {
	// category
	Category string `json:"category,omitempty"`
	// code
	Code       string    `json:"code,omitempty"`
	CreateDate string `json:"create_date,omitempty"`
	Id         string    `json:"id,omitempty"`
	// isActive
	IsActive bool `json:"is_active,omitempty"`
	// isAsset
	IsAsset bool `json:"is_asset,omitempty"`
	// isBusiness
	IsBusiness bool `json:"is_business,omitempty"`
	// isCash
	IsCash bool `json:"is_cash,omitempty"`
	// isInvestment
	IsInvestment bool `json:"is_investment,omitempty"`
	// isTaxable
	IsTaxable bool              `json:"is_taxable,omitempty"`
	Metadata  map[string]string `json:"metadata,omitempty"`
	// name
	Name        string `json:"name"`
	SecondaryId string `json:"secondary_id,omitempty"`
	// shortName
	ShortName string `json:"short_name,omitempty"`
	// subcategory
	Subcategory string    `json:"subcategory,omitempty"`
	UpdateDate  string `json:"update_date,omitempty"`
}