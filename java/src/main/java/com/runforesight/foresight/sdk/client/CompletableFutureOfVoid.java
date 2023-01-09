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
 * CompletableFutureOfVoid
 */
@JsonPropertyOrder({
  CompletableFutureOfVoid.JSON_PROPERTY_CANCELLED,
  CompletableFutureOfVoid.JSON_PROPERTY_COMPLETED_EXCEPTIONALLY,
  CompletableFutureOfVoid.JSON_PROPERTY_DONE,
  CompletableFutureOfVoid.JSON_PROPERTY_NUMBER_OF_DEPENDENTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-09T13:11:04.618466Z[Etc/UTC]")
public class CompletableFutureOfVoid {
  public static final String JSON_PROPERTY_CANCELLED = "cancelled";
  private Boolean cancelled;

  public static final String JSON_PROPERTY_COMPLETED_EXCEPTIONALLY = "completedExceptionally";
  private Boolean completedExceptionally;

  public static final String JSON_PROPERTY_DONE = "done";
  private Boolean done;

  public static final String JSON_PROPERTY_NUMBER_OF_DEPENDENTS = "numberOfDependents";
  private Integer numberOfDependents;

  public CompletableFutureOfVoid() {
  }

  public CompletableFutureOfVoid cancelled(Boolean cancelled) {
    
    this.cancelled = cancelled;
    return this;
  }

   /**
   * Get cancelled
   * @return cancelled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CANCELLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCancelled() {
    return cancelled;
  }


  @JsonProperty(JSON_PROPERTY_CANCELLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCancelled(Boolean cancelled) {
    this.cancelled = cancelled;
  }


  public CompletableFutureOfVoid completedExceptionally(Boolean completedExceptionally) {
    
    this.completedExceptionally = completedExceptionally;
    return this;
  }

   /**
   * Get completedExceptionally
   * @return completedExceptionally
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMPLETED_EXCEPTIONALLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCompletedExceptionally() {
    return completedExceptionally;
  }


  @JsonProperty(JSON_PROPERTY_COMPLETED_EXCEPTIONALLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompletedExceptionally(Boolean completedExceptionally) {
    this.completedExceptionally = completedExceptionally;
  }


  public CompletableFutureOfVoid done(Boolean done) {
    
    this.done = done;
    return this;
  }

   /**
   * Get done
   * @return done
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDone() {
    return done;
  }


  @JsonProperty(JSON_PROPERTY_DONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDone(Boolean done) {
    this.done = done;
  }


  public CompletableFutureOfVoid numberOfDependents(Integer numberOfDependents) {
    
    this.numberOfDependents = numberOfDependents;
    return this;
  }

   /**
   * Get numberOfDependents
   * @return numberOfDependents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_DEPENDENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberOfDependents() {
    return numberOfDependents;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_DEPENDENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfDependents(Integer numberOfDependents) {
    this.numberOfDependents = numberOfDependents;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompletableFutureOfVoid completableFutureOfVoid = (CompletableFutureOfVoid) o;
    return Objects.equals(this.cancelled, completableFutureOfVoid.cancelled) &&
        Objects.equals(this.completedExceptionally, completableFutureOfVoid.completedExceptionally) &&
        Objects.equals(this.done, completableFutureOfVoid.done) &&
        Objects.equals(this.numberOfDependents, completableFutureOfVoid.numberOfDependents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancelled, completedExceptionally, done, numberOfDependents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompletableFutureOfVoid {\n");
    sb.append("    cancelled: ").append(toIndentedString(cancelled)).append("\n");
    sb.append("    completedExceptionally: ").append(toIndentedString(completedExceptionally)).append("\n");
    sb.append("    done: ").append(toIndentedString(done)).append("\n");
    sb.append("    numberOfDependents: ").append(toIndentedString(numberOfDependents)).append("\n");
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

