package com.runforesight.foresight.sdk.client;

import com.runforesight.foresight.sdk.ApiException;
import com.runforesight.foresight.sdk.ApiClient;
import com.runforesight.foresight.sdk.Configuration;
import com.runforesight.foresight.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.runforesight.foresight.sdk.client.WorkflowStepHistoryDto;
import com.runforesight.foresight.sdk.client.WorkflowStepHistoryRequestDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-09T10:54:31.162605Z[Etc/UTC]")
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
}
