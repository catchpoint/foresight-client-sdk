package com.runforesight.foresight.sdk.client;

import com.runforesight.foresight.sdk.ApiException;
import com.runforesight.foresight.sdk.ApiClient;
import com.runforesight.foresight.sdk.Configuration;
import com.runforesight.foresight.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.runforesight.foresight.sdk.client.WorkflowJobMetricDtoCPUMetricDto;
import com.runforesight.foresight.sdk.client.WorkflowJobMetricDtoDiskMetricDto;
import com.runforesight.foresight.sdk.client.WorkflowJobMetricDtoMemoryMetricDto;
import com.runforesight.foresight.sdk.client.WorkflowJobMetricDtoNetworkMetricDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-09T10:54:31.162605Z[Etc/UTC]")
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
   * @return a {@code WorkflowJobMetricDtoCPUMetricDto}
   * @throws ApiException if fails to make API call
   */
  public WorkflowJobMetricDtoCPUMetricDto getJobCPUMetricsUsingGET(String jobId, String workflowRunId) throws ApiException {
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

    GenericType<WorkflowJobMetricDtoCPUMetricDto> localVarReturnType = new GenericType<WorkflowJobMetricDtoCPUMetricDto>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getJobDiskMetrics
   * 
   * @param jobId jobId (required)
   * @param workflowRunId workflowRunId (required)
   * @return a {@code WorkflowJobMetricDtoDiskMetricDto}
   * @throws ApiException if fails to make API call
   */
  public WorkflowJobMetricDtoDiskMetricDto getJobDiskMetricsUsingGET(String jobId, String workflowRunId) throws ApiException {
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

    GenericType<WorkflowJobMetricDtoDiskMetricDto> localVarReturnType = new GenericType<WorkflowJobMetricDtoDiskMetricDto>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getJobMemoryMetrics
   * 
   * @param jobId jobId (required)
   * @param workflowRunId workflowRunId (required)
   * @return a {@code WorkflowJobMetricDtoMemoryMetricDto}
   * @throws ApiException if fails to make API call
   */
  public WorkflowJobMetricDtoMemoryMetricDto getJobMemoryMetricsUsingGET(String jobId, String workflowRunId) throws ApiException {
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

    GenericType<WorkflowJobMetricDtoMemoryMetricDto> localVarReturnType = new GenericType<WorkflowJobMetricDtoMemoryMetricDto>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getJobNetworkMetrics
   * 
   * @param jobId jobId (required)
   * @param workflowRunId workflowRunId (required)
   * @return a {@code WorkflowJobMetricDtoNetworkMetricDto}
   * @throws ApiException if fails to make API call
   */
  public WorkflowJobMetricDtoNetworkMetricDto getJobNetworkMetricsUsingGET(String jobId, String workflowRunId) throws ApiException {
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

    GenericType<WorkflowJobMetricDtoNetworkMetricDto> localVarReturnType = new GenericType<WorkflowJobMetricDtoNetworkMetricDto>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
