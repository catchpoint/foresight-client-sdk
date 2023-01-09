package com.runforesight.foresight.sdk.client;

import com.runforesight.foresight.sdk.ApiException;
import com.runforesight.foresight.sdk.ApiClient;
import com.runforesight.foresight.sdk.Configuration;
import com.runforesight.foresight.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.runforesight.foresight.sdk.client.WorkflowJobMetricDtoOfCPUMetricDto;
import com.runforesight.foresight.sdk.client.WorkflowJobMetricDtoOfDiskMetricDto;
import com.runforesight.foresight.sdk.client.WorkflowJobMetricDtoOfMemoryMetricDto;
import com.runforesight.foresight.sdk.client.WorkflowJobMetricDtoOfNetworkMetricDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-09T13:11:04.618466Z[Etc/UTC]")
public class MetricsApi {
  private ApiClient apiClient;

  public MetricsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MetricsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * getJobCPUMetrics
   * 
   * @param jobId jobId (required)
   * @param workflowRunId workflowRunId (required)
   * @return a {@code WorkflowJobMetricDtoOfCPUMetricDto}
   * @throws ApiException if fails to make API call
   */
  public WorkflowJobMetricDtoOfCPUMetricDto getJobCPUMetricsUsingGET(String jobId, String workflowRunId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'jobId' is set
    if (jobId == null) {
      throw new ApiException(400, "Missing the required parameter 'jobId' when calling getJobCPUMetricsUsingGET");
    }
    
    // verify the required parameter 'workflowRunId' is set
    if (workflowRunId == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowRunId' when calling getJobCPUMetricsUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/api/workflow-runs/{workflowRunId}/jobs/{jobId}/metrics/cpu".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "jobId" + "\\}", apiClient.escapeString(jobId.toString()))
      .replaceAll("\\{" + "workflowRunId" + "\\}", apiClient.escapeString(workflowRunId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKey" };

    GenericType<WorkflowJobMetricDtoOfCPUMetricDto> localVarReturnType = new GenericType<WorkflowJobMetricDtoOfCPUMetricDto>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getJobDiskMetrics
   * 
   * @param jobId jobId (required)
   * @param workflowRunId workflowRunId (required)
   * @return a {@code WorkflowJobMetricDtoOfDiskMetricDto}
   * @throws ApiException if fails to make API call
   */
  public WorkflowJobMetricDtoOfDiskMetricDto getJobDiskMetricsUsingGET(String jobId, String workflowRunId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'jobId' is set
    if (jobId == null) {
      throw new ApiException(400, "Missing the required parameter 'jobId' when calling getJobDiskMetricsUsingGET");
    }
    
    // verify the required parameter 'workflowRunId' is set
    if (workflowRunId == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowRunId' when calling getJobDiskMetricsUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/api/workflow-runs/{workflowRunId}/jobs/{jobId}/metrics/disk".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "jobId" + "\\}", apiClient.escapeString(jobId.toString()))
      .replaceAll("\\{" + "workflowRunId" + "\\}", apiClient.escapeString(workflowRunId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKey" };

    GenericType<WorkflowJobMetricDtoOfDiskMetricDto> localVarReturnType = new GenericType<WorkflowJobMetricDtoOfDiskMetricDto>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getJobMemoryMetrics
   * 
   * @param jobId jobId (required)
   * @param workflowRunId workflowRunId (required)
   * @return a {@code WorkflowJobMetricDtoOfMemoryMetricDto}
   * @throws ApiException if fails to make API call
   */
  public WorkflowJobMetricDtoOfMemoryMetricDto getJobMemoryMetricsUsingGET(String jobId, String workflowRunId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'jobId' is set
    if (jobId == null) {
      throw new ApiException(400, "Missing the required parameter 'jobId' when calling getJobMemoryMetricsUsingGET");
    }
    
    // verify the required parameter 'workflowRunId' is set
    if (workflowRunId == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowRunId' when calling getJobMemoryMetricsUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/api/workflow-runs/{workflowRunId}/jobs/{jobId}/metrics/memory".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "jobId" + "\\}", apiClient.escapeString(jobId.toString()))
      .replaceAll("\\{" + "workflowRunId" + "\\}", apiClient.escapeString(workflowRunId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKey" };

    GenericType<WorkflowJobMetricDtoOfMemoryMetricDto> localVarReturnType = new GenericType<WorkflowJobMetricDtoOfMemoryMetricDto>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getJobNetworkMetrics
   * 
   * @param jobId jobId (required)
   * @param workflowRunId workflowRunId (required)
   * @return a {@code WorkflowJobMetricDtoOfNetworkMetricDto}
   * @throws ApiException if fails to make API call
   */
  public WorkflowJobMetricDtoOfNetworkMetricDto getJobNetworkMetricsUsingGET(String jobId, String workflowRunId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'jobId' is set
    if (jobId == null) {
      throw new ApiException(400, "Missing the required parameter 'jobId' when calling getJobNetworkMetricsUsingGET");
    }
    
    // verify the required parameter 'workflowRunId' is set
    if (workflowRunId == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowRunId' when calling getJobNetworkMetricsUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/api/workflow-runs/{workflowRunId}/jobs/{jobId}/metrics/network".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "jobId" + "\\}", apiClient.escapeString(jobId.toString()))
      .replaceAll("\\{" + "workflowRunId" + "\\}", apiClient.escapeString(workflowRunId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKey" };

    GenericType<WorkflowJobMetricDtoOfNetworkMetricDto> localVarReturnType = new GenericType<WorkflowJobMetricDtoOfNetworkMetricDto>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
