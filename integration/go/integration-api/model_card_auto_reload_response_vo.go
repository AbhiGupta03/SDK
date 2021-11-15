/*
 * Hydrogen Integration API
 *
 * The Hydrogen Integration API
 *
 * API version: 1.3.1
 * Contact: info@hydrogenplatform.com
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */

package integration_api

type CardAutoReloadResponseVo struct {
	Message         string      `json:"message,omitempty"`
	NucleusClientId string      `json:"nucleus_client_id,omitempty"`
	ReloadAmount    float64     `json:"reload_amount,omitempty"`
	ThresholdAmount float64     `json:"threshold_amount,omitempty"`
	VendorName      string      `json:"vendor_name,omitempty"`
	VendorResponse  interface{} `json:"vendor_response,omitempty"`
}
