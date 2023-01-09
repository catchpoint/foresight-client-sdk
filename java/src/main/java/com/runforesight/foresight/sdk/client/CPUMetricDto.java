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
 * CPUMetricDto
 */
@JsonPropertyOrder({
  CPUMetricDto.JSON_PROPERTY_CPU_LOAD_SYSTEM,
  CPUMetricDto.JSON_PROPERTY_CPU_LOAD_TOTAL,
  CPUMetricDto.JSON_PROPERTY_CPU_LOAD_USER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-09T13:11:04.618466Z[Etc/UTC]")
public class CPUMetricDto {
  public static final String JSON_PROPERTY_CPU_LOAD_SYSTEM = "cpuLoadSystem";
  private Double cpuLoadSystem;

  public static final String JSON_PROPERTY_CPU_LOAD_TOTAL = "cpuLoadTotal";
  private Double cpuLoadTotal;

  public static final String JSON_PROPERTY_CPU_LOAD_USER = "cpuLoadUser";
  private Double cpuLoadUser;

  public CPUMetricDto() {
  }

  public CPUMetricDto cpuLoadSystem(Double cpuLoadSystem) {
    
    this.cpuLoadSystem = cpuLoadSystem;
    return this;
  }

   /**
   * Get cpuLoadSystem
   * @return cpuLoadSystem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CPU_LOAD_SYSTEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getCpuLoadSystem() {
    return cpuLoadSystem;
  }


  @JsonProperty(JSON_PROPERTY_CPU_LOAD_SYSTEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCpuLoadSystem(Double cpuLoadSystem) {
    this.cpuLoadSystem = cpuLoadSystem;
  }


  public CPUMetricDto cpuLoadTotal(Double cpuLoadTotal) {
    
    this.cpuLoadTotal = cpuLoadTotal;
    return this;
  }

   /**
   * Get cpuLoadTotal
   * @return cpuLoadTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CPU_LOAD_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getCpuLoadTotal() {
    return cpuLoadTotal;
  }


  @JsonProperty(JSON_PROPERTY_CPU_LOAD_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCpuLoadTotal(Double cpuLoadTotal) {
    this.cpuLoadTotal = cpuLoadTotal;
  }


  public CPUMetricDto cpuLoadUser(Double cpuLoadUser) {
    
    this.cpuLoadUser = cpuLoadUser;
    return this;
  }

   /**
   * Get cpuLoadUser
   * @return cpuLoadUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CPU_LOAD_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getCpuLoadUser() {
    return cpuLoadUser;
  }


  @JsonProperty(JSON_PROPERTY_CPU_LOAD_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCpuLoadUser(Double cpuLoadUser) {
    this.cpuLoadUser = cpuLoadUser;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CPUMetricDto cpUMetricDto = (CPUMetricDto) o;
    return Objects.equals(this.cpuLoadSystem, cpUMetricDto.cpuLoadSystem) &&
        Objects.equals(this.cpuLoadTotal, cpUMetricDto.cpuLoadTotal) &&
        Objects.equals(this.cpuLoadUser, cpUMetricDto.cpuLoadUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpuLoadSystem, cpuLoadTotal, cpuLoadUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CPUMetricDto {\n");
    sb.append("    cpuLoadSystem: ").append(toIndentedString(cpuLoadSystem)).append("\n");
    sb.append("    cpuLoadTotal: ").append(toIndentedString(cpuLoadTotal)).append("\n");
    sb.append("    cpuLoadUser: ").append(toIndentedString(cpuLoadUser)).append("\n");
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

