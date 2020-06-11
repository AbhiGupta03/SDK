/*
 * Hydrogen Molecule API
 * The Hydrogen Molecule API
 *
 * OpenAPI spec version: 1.0.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;

/**
 * WalletKeyGeneratorPayload
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-18T13:48:07.846-05:00")
public class WalletKeyGeneratorPayload {
  @SerializedName("wallet_id")
  private UUID walletId = null;

  public WalletKeyGeneratorPayload walletId(UUID walletId) {
    this.walletId = walletId;
    return this;
  }

   /**
   * The ID of the wallet the keys are generating for
   * @return walletId
  **/
  @ApiModelProperty(required = true, value = "The ID of the wallet the keys are generating for")
  public UUID getWalletId() {
    return walletId;
  }

  public void setWalletId(UUID walletId) {
    this.walletId = walletId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletKeyGeneratorPayload walletKeyGeneratorPayload = (WalletKeyGeneratorPayload) o;
    return Objects.equals(this.walletId, walletKeyGeneratorPayload.walletId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(walletId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletKeyGeneratorPayload {\n");
    
    sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
