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


// OrderTrack Object
type OrderTrack struct {
	// commission
	Commission float64   `json:"commission,omitempty"`
	CreateDate string `json:"create_date,omitempty"`
	// date
	Date string `json:"date"`
	// externalTrackId
	ExternalTrackId string `json:"external_track_id,omitempty"`
	// fee
	Fee float64 `json:"fee,omitempty"`
	Id  string  `json:"id,omitempty"`
	// metadata
	Metadata map[string]string `json:"metadata,omitempty"`
	// orderId
	OrderId string `json:"order_id"`
	// orderStatusId
	OrderStatusId string `json:"order_status_id"`
	// price
	Price float64 `json:"price,omitempty"`
	// quantity
	Quantity    float64   `json:"quantity,omitempty"`
	SecondaryId string    `json:"secondary_id,omitempty"`
	UpdateDate  string `json:"update_date,omitempty"`
}