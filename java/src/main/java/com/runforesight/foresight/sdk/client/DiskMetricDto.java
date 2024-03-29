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
 * DiskMetricDto
 */
@JsonPropertyOrder({
  DiskMetricDto.JSON_PROPERTY_DISK_I_O_RX_MB,
  DiskMetricDto.JSON_PROPERTY_DISK_I_O_WX_MB
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-31T12:24:20.857460Z[Etc/UTC]")
public class DiskMetricDto {
  public static final String JSON_PROPERTY_DISK_I_O_RX_MB = "diskIORxMb";
  private Long diskIORxMb;

  public static final String JSON_PROPERTY_DISK_I_O_WX_MB = "diskIOWxMb";
  private Long diskIOWxMb;

  public DiskMetricDto() {
  }

  public DiskMetricDto diskIORxMb(Long diskIORxMb) {
    
    this.diskIORxMb = diskIORxMb;
    return this;
  }

   /**
   * Get diskIORxMb
   * @return diskIORxMb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISK_I_O_RX_MB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDiskIORxMb() {
    return diskIORxMb;
  }


  @JsonProperty(JSON_PROPERTY_DISK_I_O_RX_MB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDiskIORxMb(Long diskIORxMb) {
    this.diskIORxMb = diskIORxMb;
  }


  public DiskMetricDto diskIOWxMb(Long diskIOWxMb) {
    
    this.diskIOWxMb = diskIOWxMb;
    return this;
  }

   /**
   * Get diskIOWxMb
   * @return diskIOWxMb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISK_I_O_WX_MB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDiskIOWxMb() {
    return diskIOWxMb;
  }


  @JsonProperty(JSON_PROPERTY_DISK_I_O_WX_MB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDiskIOWxMb(Long diskIOWxMb) {
    this.diskIOWxMb = diskIOWxMb;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiskMetricDto diskMetricDto = (DiskMetricDto) o;
    return Objects.equals(this.diskIORxMb, diskMetricDto.diskIORxMb) &&
        Objects.equals(this.diskIOWxMb, diskMetricDto.diskIOWxMb);
  }

  @Override
  public int hashCode() {
    return Objects.hash(diskIORxMb, diskIOWxMb);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiskMetricDto {\n");
    sb.append("    diskIORxMb: ").append(toIndentedString(diskIORxMb)).append("\n");
    sb.append("    diskIOWxMb: ").append(toIndentedString(diskIOWxMb)).append("\n");
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

