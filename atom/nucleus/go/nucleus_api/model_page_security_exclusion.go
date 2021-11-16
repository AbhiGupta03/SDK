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

// Page Object
type PageSecurityExclusion struct {
	Content          []SecurityExclusion `json:"content,omitempty"`
	First            bool                `json:"first,omitempty"`
	Last             bool                `json:"last,omitempty"`
	Number           int32               `json:"number,omitempty"`
	NumberOfElements int32               `json:"number_of_elements,omitempty"`
	Size             int32               `json:"size,omitempty"`
	Sort             []Sort              `json:"sort,omitempty"`
	TotalElements    int64               `json:"total_elements,omitempty"`
	TotalPages       int32               `json:"total_pages,omitempty"`
}