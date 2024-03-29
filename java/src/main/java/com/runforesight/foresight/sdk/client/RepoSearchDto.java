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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * RepoSearchDto
 */
@JsonPropertyOrder({
  RepoSearchDto.JSON_PROPERTY_BRANCHES,
  RepoSearchDto.JSON_PROPERTY_REPO_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-31T12:24:20.857460Z[Etc/UTC]")
public class RepoSearchDto {
  public static final String JSON_PROPERTY_BRANCHES = "branches";
  private List<String> branches = null;

  public static final String JSON_PROPERTY_REPO_ID = "repoId";
  private String repoId;

  public RepoSearchDto() {
  }

  public RepoSearchDto branches(List<String> branches) {
    
    this.branches = branches;
    return this;
  }

  public RepoSearchDto addBranchesItem(String branchesItem) {
    if (this.branches == null) {
      this.branches = new ArrayList<>();
    }
    this.branches.add(branchesItem);
    return this;
  }

   /**
   * Get branches
   * @return branches
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BRANCHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getBranches() {
    return branches;
  }


  @JsonProperty(JSON_PROPERTY_BRANCHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBranches(List<String> branches) {
    this.branches = branches;
  }


  public RepoSearchDto repoId(String repoId) {
    
    this.repoId = repoId;
    return this;
  }

   /**
   * Get repoId
   * @return repoId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REPO_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRepoId() {
    return repoId;
  }


  @JsonProperty(JSON_PROPERTY_REPO_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRepoId(String repoId) {
    this.repoId = repoId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepoSearchDto repoSearchDto = (RepoSearchDto) o;
    return Objects.equals(this.branches, repoSearchDto.branches) &&
        Objects.equals(this.repoId, repoSearchDto.repoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branches, repoId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepoSearchDto {\n");
    sb.append("    branches: ").append(toIndentedString(branches)).append("\n");
    sb.append("    repoId: ").append(toIndentedString(repoId)).append("\n");
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

