package com.runforesight.foresight.sdk.client;

import com.runforesight.foresight.sdk.ApiException;
import com.runforesight.foresight.sdk.ApiClient;
import com.runforesight.foresight.sdk.Configuration;
import com.runforesight.foresight.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.runforesight.foresight.sdk.client.ProcessDto;
import com.runforesight.foresight.sdk.client.SpanDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-09T10:54:31.162605Z[Etc/UTC]")
public class ProcessesApi {
  private ApiClient apiClient;

  public ProcessesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProcessesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * getJobProcessSpans
   * 
   * @param jobId jobId (required)
   * @param workflowRunId workflowRunId (required)
   * @param sort sort (optional)
   * @return a {@code List<SpanDto>}
   * @throws ApiException if fails to make API call
   */
  public List<SpanDto> getJobProcessSpansUsingGET(String jobId, String workflowRunId, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'jobId' is set
    if (jobId == null) {
      throw new ApiException(400, "Missing the required parameter 'jobId' when calling getJobProcessSpansUsingGET");
    }
    
    // verify the required parameter 'workflowRunId' is set
    if (workflowRunId == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowRunId' when calling getJobProcessSpansUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/api/workflow-runs/{workflowRunId}/jobs/{jobId}/spans".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "jobId" + "\\}", apiClient.escapeString(jobId.toString()))
      .replaceAll("\\{" + "workflowRunId" + "\\}", apiClient.escapeString(workflowRunId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKey" };

    GenericType<List<SpanDto>> localVarReturnType = new GenericType<List<SpanDto>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getJobProcesses
   * 
   * @param jobId jobId (required)
   * @param workflowRunId workflowRunId (required)
   * @param sort sort (optional)
   * @return a {@code List<ProcessDto>}
   * @throws ApiException if fails to make API call
   */
  public List<ProcessDto> getJobProcessesUsingGET(String jobId, String workflowRunId, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'jobId' is set
    if (jobId == null) {
      throw new ApiException(400, "Missing the required parameter 'jobId' when calling getJobProcessesUsingGET");
    }
    
    // verify the required parameter 'workflowRunId' is set
    if (workflowRunId == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowRunId' when calling getJobProcessesUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/api/workflow-runs/{workflowRunId}/jobs/{jobId}/processes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "jobId" + "\\}", apiClient.escapeString(jobId.toString()))
      .replaceAll("\\{" + "workflowRunId" + "\\}", apiClient.escapeString(workflowRunId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    
    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKey" };

    GenericType<List<ProcessDto>> localVarReturnType = new GenericType<List<ProcessDto>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
