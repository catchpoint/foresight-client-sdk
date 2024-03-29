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
import com.runforesight.foresight.sdk.client.RepoDto;
import com.runforesight.foresight.sdk.client.WorkflowRunSummaryDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * WorkflowViewDto
 */
@JsonPropertyOrder({
  WorkflowViewDto.JSON_PROPERTY_AVERAGE_DURATION,
  WorkflowViewDto.JSON_PROPERTY_EXECUTION_COUNT,
  WorkflowViewDto.JSON_PROPERTY_FAIL_AVERAGE_DURATION,
  WorkflowViewDto.JSON_PROPERTY_FAIL_COUNT,
  WorkflowViewDto.JSON_PROPERTY_FAIL_MEDIAN_DURATION,
  WorkflowViewDto.JSON_PROPERTY_FAIL_P95_DURATION,
  WorkflowViewDto.JSON_PROPERTY_ID,
  WorkflowViewDto.JSON_PROPERTY_NAME,
  WorkflowViewDto.JSON_PROPERTY_OTHER_COUNT,
  WorkflowViewDto.JSON_PROPERTY_REPO,
  WorkflowViewDto.JSON_PROPERTY_SUCCESS_AVERAGE_DURATION,
  WorkflowViewDto.JSON_PROPERTY_SUCCESS_COUNT,
  WorkflowViewDto.JSON_PROPERTY_SUCCESS_MEDIAN_DURATION,
  WorkflowViewDto.JSON_PROPERTY_SUCCESS_P95_DURATION,
  WorkflowViewDto.JSON_PROPERTY_WORKFLOW_RUNS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-31T12:24:20.857460Z[Etc/UTC]")
public class WorkflowViewDto {
  public static final String JSON_PROPERTY_AVERAGE_DURATION = "averageDuration";
  private Double averageDuration;

  public static final String JSON_PROPERTY_EXECUTION_COUNT = "executionCount";
  private Long executionCount;

  public static final String JSON_PROPERTY_FAIL_AVERAGE_DURATION = "failAverageDuration";
  private Double failAverageDuration;

  public static final String JSON_PROPERTY_FAIL_COUNT = "failCount";
  private Long failCount;

  public static final String JSON_PROPERTY_FAIL_MEDIAN_DURATION = "failMedianDuration";
  private Double failMedianDuration;

  public static final String JSON_PROPERTY_FAIL_P95_DURATION = "failP95Duration";
  private Double failP95Duration;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OTHER_COUNT = "otherCount";
  private Long otherCount;

  public static final String JSON_PROPERTY_REPO = "repo";
  private RepoDto repo;

  public static final String JSON_PROPERTY_SUCCESS_AVERAGE_DURATION = "successAverageDuration";
  private Double successAverageDuration;

  public static final String JSON_PROPERTY_SUCCESS_COUNT = "successCount";
  private Long successCount;

  public static final String JSON_PROPERTY_SUCCESS_MEDIAN_DURATION = "successMedianDuration";
  private Double successMedianDuration;

  public static final String JSON_PROPERTY_SUCCESS_P95_DURATION = "successP95Duration";
  private Double successP95Duration;

  public static final String JSON_PROPERTY_WORKFLOW_RUNS = "workflowRuns";
  private List<WorkflowRunSummaryDto> workflowRuns = null;

  public WorkflowViewDto() {
  }

  public WorkflowViewDto averageDuration(Double averageDuration) {
    
    this.averageDuration = averageDuration;
    return this;
  }

   /**
   * Get averageDuration
   * @return averageDuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AVERAGE_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getAverageDuration() {
    return averageDuration;
  }


  @JsonProperty(JSON_PROPERTY_AVERAGE_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAverageDuration(Double averageDuration) {
    this.averageDuration = averageDuration;
  }


  public WorkflowViewDto executionCount(Long executionCount) {
    
    this.executionCount = executionCount;
    return this;
  }

   /**
   * Get executionCount
   * @return executionCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXECUTION_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getExecutionCount() {
    return executionCount;
  }


  @JsonProperty(JSON_PROPERTY_EXECUTION_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExecutionCount(Long executionCount) {
    this.executionCount = executionCount;
  }


  public WorkflowViewDto failAverageDuration(Double failAverageDuration) {
    
    this.failAverageDuration = failAverageDuration;
    return this;
  }

   /**
   * Get failAverageDuration
   * @return failAverageDuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FAIL_AVERAGE_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getFailAverageDuration() {
    return failAverageDuration;
  }


  @JsonProperty(JSON_PROPERTY_FAIL_AVERAGE_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailAverageDuration(Double failAverageDuration) {
    this.failAverageDuration = failAverageDuration;
  }


  public WorkflowViewDto failCount(Long failCount) {
    
    this.failCount = failCount;
    return this;
  }

   /**
   * Get failCount
   * @return failCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FAIL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getFailCount() {
    return failCount;
  }


  @JsonProperty(JSON_PROPERTY_FAIL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailCount(Long failCount) {
    this.failCount = failCount;
  }


  public WorkflowViewDto failMedianDuration(Double failMedianDuration) {
    
    this.failMedianDuration = failMedianDuration;
    return this;
  }

   /**
   * Get failMedianDuration
   * @return failMedianDuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FAIL_MEDIAN_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getFailMedianDuration() {
    return failMedianDuration;
  }


  @JsonProperty(JSON_PROPERTY_FAIL_MEDIAN_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailMedianDuration(Double failMedianDuration) {
    this.failMedianDuration = failMedianDuration;
  }


  public WorkflowViewDto failP95Duration(Double failP95Duration) {
    
    this.failP95Duration = failP95Duration;
    return this;
  }

   /**
   * Get failP95Duration
   * @return failP95Duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FAIL_P95_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getFailP95Duration() {
    return failP95Duration;
  }


  @JsonProperty(JSON_PROPERTY_FAIL_P95_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailP95Duration(Double failP95Duration) {
    this.failP95Duration = failP95Duration;
  }


  public WorkflowViewDto id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public WorkflowViewDto name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public WorkflowViewDto otherCount(Long otherCount) {
    
    this.otherCount = otherCount;
    return this;
  }

   /**
   * Get otherCount
   * @return otherCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OTHER_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getOtherCount() {
    return otherCount;
  }


  @JsonProperty(JSON_PROPERTY_OTHER_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtherCount(Long otherCount) {
    this.otherCount = otherCount;
  }


  public WorkflowViewDto repo(RepoDto repo) {
    
    this.repo = repo;
    return this;
  }

   /**
   * Get repo
   * @return repo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REPO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RepoDto getRepo() {
    return repo;
  }


  @JsonProperty(JSON_PROPERTY_REPO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRepo(RepoDto repo) {
    this.repo = repo;
  }


  public WorkflowViewDto successAverageDuration(Double successAverageDuration) {
    
    this.successAverageDuration = successAverageDuration;
    return this;
  }

   /**
   * Get successAverageDuration
   * @return successAverageDuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUCCESS_AVERAGE_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getSuccessAverageDuration() {
    return successAverageDuration;
  }


  @JsonProperty(JSON_PROPERTY_SUCCESS_AVERAGE_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuccessAverageDuration(Double successAverageDuration) {
    this.successAverageDuration = successAverageDuration;
  }


  public WorkflowViewDto successCount(Long successCount) {
    
    this.successCount = successCount;
    return this;
  }

   /**
   * Get successCount
   * @return successCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUCCESS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSuccessCount() {
    return successCount;
  }


  @JsonProperty(JSON_PROPERTY_SUCCESS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuccessCount(Long successCount) {
    this.successCount = successCount;
  }


  public WorkflowViewDto successMedianDuration(Double successMedianDuration) {
    
    this.successMedianDuration = successMedianDuration;
    return this;
  }

   /**
   * Get successMedianDuration
   * @return successMedianDuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUCCESS_MEDIAN_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getSuccessMedianDuration() {
    return successMedianDuration;
  }


  @JsonProperty(JSON_PROPERTY_SUCCESS_MEDIAN_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuccessMedianDuration(Double successMedianDuration) {
    this.successMedianDuration = successMedianDuration;
  }


  public WorkflowViewDto successP95Duration(Double successP95Duration) {
    
    this.successP95Duration = successP95Duration;
    return this;
  }

   /**
   * Get successP95Duration
   * @return successP95Duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUCCESS_P95_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getSuccessP95Duration() {
    return successP95Duration;
  }


  @JsonProperty(JSON_PROPERTY_SUCCESS_P95_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuccessP95Duration(Double successP95Duration) {
    this.successP95Duration = successP95Duration;
  }


  public WorkflowViewDto workflowRuns(List<WorkflowRunSummaryDto> workflowRuns) {
    
    this.workflowRuns = workflowRuns;
    return this;
  }

  public WorkflowViewDto addWorkflowRunsItem(WorkflowRunSummaryDto workflowRunsItem) {
    if (this.workflowRuns == null) {
      this.workflowRuns = new ArrayList<>();
    }
    this.workflowRuns.add(workflowRunsItem);
    return this;
  }

   /**
   * Get workflowRuns
   * @return workflowRuns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WORKFLOW_RUNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<WorkflowRunSummaryDto> getWorkflowRuns() {
    return workflowRuns;
  }


  @JsonProperty(JSON_PROPERTY_WORKFLOW_RUNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWorkflowRuns(List<WorkflowRunSummaryDto> workflowRuns) {
    this.workflowRuns = workflowRuns;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowViewDto workflowViewDto = (WorkflowViewDto) o;
    return Objects.equals(this.averageDuration, workflowViewDto.averageDuration) &&
        Objects.equals(this.executionCount, workflowViewDto.executionCount) &&
        Objects.equals(this.failAverageDuration, workflowViewDto.failAverageDuration) &&
        Objects.equals(this.failCount, workflowViewDto.failCount) &&
        Objects.equals(this.failMedianDuration, workflowViewDto.failMedianDuration) &&
        Objects.equals(this.failP95Duration, workflowViewDto.failP95Duration) &&
        Objects.equals(this.id, workflowViewDto.id) &&
        Objects.equals(this.name, workflowViewDto.name) &&
        Objects.equals(this.otherCount, workflowViewDto.otherCount) &&
        Objects.equals(this.repo, workflowViewDto.repo) &&
        Objects.equals(this.successAverageDuration, workflowViewDto.successAverageDuration) &&
        Objects.equals(this.successCount, workflowViewDto.successCount) &&
        Objects.equals(this.successMedianDuration, workflowViewDto.successMedianDuration) &&
        Objects.equals(this.successP95Duration, workflowViewDto.successP95Duration) &&
        Objects.equals(this.workflowRuns, workflowViewDto.workflowRuns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(averageDuration, executionCount, failAverageDuration, failCount, failMedianDuration, failP95Duration, id, name, otherCount, repo, successAverageDuration, successCount, successMedianDuration, successP95Duration, workflowRuns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowViewDto {\n");
    sb.append("    averageDuration: ").append(toIndentedString(averageDuration)).append("\n");
    sb.append("    executionCount: ").append(toIndentedString(executionCount)).append("\n");
    sb.append("    failAverageDuration: ").append(toIndentedString(failAverageDuration)).append("\n");
    sb.append("    failCount: ").append(toIndentedString(failCount)).append("\n");
    sb.append("    failMedianDuration: ").append(toIndentedString(failMedianDuration)).append("\n");
    sb.append("    failP95Duration: ").append(toIndentedString(failP95Duration)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    otherCount: ").append(toIndentedString(otherCount)).append("\n");
    sb.append("    repo: ").append(toIndentedString(repo)).append("\n");
    sb.append("    successAverageDuration: ").append(toIndentedString(successAverageDuration)).append("\n");
    sb.append("    successCount: ").append(toIndentedString(successCount)).append("\n");
    sb.append("    successMedianDuration: ").append(toIndentedString(successMedianDuration)).append("\n");
    sb.append("    successP95Duration: ").append(toIndentedString(successP95Duration)).append("\n");
    sb.append("    workflowRuns: ").append(toIndentedString(workflowRuns)).append("\n");
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

