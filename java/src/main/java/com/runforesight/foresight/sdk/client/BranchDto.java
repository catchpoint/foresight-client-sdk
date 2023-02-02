/*
 * Foresight Private REST API
 * \"Foresight Private REST API for clients\"
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: info@runforesight.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.runforesight.foresight.sdk.client;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * BranchDto
 */
@JsonPropertyOrder({
  BranchDto.JSON_PROPERTY_BRANCH_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-31T12:24:20.857460Z[Etc/UTC]")
public class BranchDto {
  public static final String JSON_PROPERTY_BRANCH_NAME = "branchName";
  private String branchName;

  public BranchDto() {
  }

  public BranchDto branchName(String branchName) {
    
    this.branchName = branchName;
    return this;
  }

   /**
   * Get branchName
   * @return branchName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BRANCH_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBranchName() {
    return branchName;
  }


  @JsonProperty(JSON_PROPERTY_BRANCH_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBranchName(String branchName) {
    this.branchName = branchName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BranchDto branchDto = (BranchDto) o;
    return Objects.equals(this.branchName, branchDto.branchName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branchName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BranchDto {\n");
    sb.append("    branchName: ").append(toIndentedString(branchName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

