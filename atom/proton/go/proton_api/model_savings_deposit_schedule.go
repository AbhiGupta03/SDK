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

type SavingsDepositSchedule struct {
	DepositFrequencyInterval  string  `json:"deposit_frequency_interval,omitempty"`
	DepositAmount             float32 `json:"deposit_amount,omitempty"`
	DepositDuration           int32   `json:"deposit_duration,omitempty"`
	AdjustDepositForInflation bool    `json:"adjust_deposit_for_inflation,omitempty"`
}
