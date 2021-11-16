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

type WConfig1 struct {
	WMinMinor  float32 `json:"w_min_minor,omitempty"`
	WMinMajor  float32 `json:"w_min_major,omitempty"`
	CashAmount float32 `json:"cash_amount,omitempty"`
	WMaxMajor  float32 `json:"w_max_major,omitempty"`
	WMaxMinor  float32 `json:"w_max_minor,omitempty"`
}