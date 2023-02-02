package com.runforesight.foresight.sdk.client;

import com.runforesight.foresight.sdk.ApiException;
import com.runforesight.foresight.sdk.ApiClient;
import com.runforesight.foresight.sdk.Configuration;
import com.runforesight.foresight.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.runforesight.foresight.sdk.client.ErroneousWorkflowDto;
import com.runforesight.foresight.sdk.client.WorkflowHighlightsQueryDto;
import com.runforesight.foresight.sdk.client.WorkflowSearchDto;
import com.runforesight.foresight.sdk.client.WorkflowStepHistoryDto;
import com.runforesight.foresight.sdk.client.WorkflowStepHistoryRequestDto;
import com.runforesight.foresight.sdk.client.WorkflowViewDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-31T12:24:20.857460Z[Etc/UTC]")
public class WorkflowsApi {
  private ApiClient apiClient;

  public WorkflowsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WorkflowsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * getErroneousWorkflow
   * 
   * @param query query (required)
   * @return a {@code List<ErroneousWorkflowDto>}
   * @throws ApiException if fails to make API call
   */
  public List<ErroneousWorkflowDto> getErroneousWorkflowUsingPOST(WorkflowHighlightsQueryDto query) throws ApiException {
    Object localVarPostBody = query;
    
    // verify the required parameter 'query' is set
    if (query == null) {
      throw new ApiException(400, "Missing the required parameter 'query' when calling getErroneousWorkflowUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/workflows/erroneous".replaceAll("\\{format\\}","json");

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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKey" };

    GenericType<List<ErroneousWorkflowDto>> localVarReturnType = new GenericType<List<ErroneousWorkflowDto>>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getWorkflowStepHistories
   * 
   * @param workflowId workflowId (required)
   * @param requestDto requestDto (required)
   * @return a {@code List<WorkflowStepHistoryDto>}
   * @throws ApiException if fails to make API call
   */
  public List<WorkflowStepHistoryDto> getWorkflowStepHistoriesUsingPOST(String workflowId, WorkflowStepHistoryRequestDto requestDto) throws ApiException {
    Object localVarPostBody = requestDto;
    
    // verify the required parameter 'workflowId' is set
    if (workflowId == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowId' when calling getWorkflowStepHistoriesUsingPOST");
    }
    
    // verify the required parameter 'requestDto' is set
    if (requestDto == null) {
      throw new ApiException(400, "Missing the required parameter 'requestDto' when calling getWorkflowStepHistoriesUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/api/workflows/{workflowId}/step/history".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "workflowId" + "\\}", apiClient.escapeString(workflowId.toString()));

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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKey" };

    GenericType<List<WorkflowStepHistoryDto>> localVarReturnType = new GenericType<List<WorkflowStepHistoryDto>>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getWorkflows
   * 
   * @param dto dto (required)
   * @return a {@code List<WorkflowViewDto>}
   * @throws ApiException if fails to make API call
   */
  public List<WorkflowViewDto> getWorkflowsUsingPOST(WorkflowSearchDto dto) throws ApiException {
    Object localVarPostBody = dto;
    
    // verify the required parameter 'dto' is set
    if (dto == null) {
      throw new ApiException(400, "Missing the required parameter 'dto' when calling getWorkflowsUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/workflows".replaceAll("\\{format\\}","json");

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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKey" };

    GenericType<List<WorkflowViewDto>> localVarReturnType = new GenericType<List<WorkflowViewDto>>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
