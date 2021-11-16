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


// Institution Object
type Institution struct {
	// code
	Code       string    `json:"code,omitempty"`
	CreateDate string `json:"create_date,omitempty"`
	Id         string    `json:"id,omitempty"`
	// logo_url_medium
	LogoUrlMedium string `json:"logo_url_medium,omitempty"`
	// logo_url_small
	LogoUrlSmall string `json:"logo_url_small,omitempty"`
	// name
	Name       string    `json:"name"`
	UpdateDate string `json:"update_date,omitempty"`
	// website_url
	WebsiteUrl string `json:"website_url,omitempty"`
}