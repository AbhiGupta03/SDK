/*
 * Hydrogen Proton API
 *
 * Financial engineering module of Hydrogen Atom
 *
 * API version: 1.9.2
 * Contact: info@hydrogenplatform.com
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */

package proton_api

type FinancialPictureRequest struct {
	CurrencyCode          string `json:"currency_code,omitempty"`
	ClientId              string `json:"client_id,omitempty"`
	ShowHistory           bool   `json:"show_history,omitempty"`
	EndDate               string `json:"end_date,omitempty"`
	CurrencyConversion    string `json:"currency_conversion,omitempty"`
	StartDate             string `json:"start_date,omitempty"`
	ShowCategoryBreakdown bool   `json:"show_category_breakdown,omitempty"`
	ShowChange            bool   `json:"show_change,omitempty"`
	HouseholdId           string `json:"household_id,omitempty"`
	CreateLog             bool   `json:"create_log,omitempty"`
}