package com.runforesight.foresight.sdk.client;

import com.runforesight.foresight.sdk.ApiException;
import com.runforesight.foresight.sdk.ApiClient;
import com.runforesight.foresight.sdk.Configuration;
import com.runforesight.foresight.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.runforesight.foresight.sdk.client.CompletableFutureOfVoid;
import com.runforesight.foresight.sdk.client.WorkflowTelemetryRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-31T12:24:20.857460Z[Etc/UTC]")
public class TelemetryApi {
  private ApiClient apiClient;

  public TelemetryApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TelemetryApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * handleDoMetrics
   * 
   * @param workflowTelemetryRequest workflowTelemetryRequest (required)
   * @return a {@code CompletableFutureOfVoid}
   * @throws ApiException if fails to make API call
   */
  public CompletableFutureOfVoid handleDoMetricsUsingPOST(WorkflowTelemetryRequest workflowTelemetryRequest) throws ApiException {
    Object localVarPostBody = workflowTelemetryRequest;
    
    // verify the required parameter 'workflowTelemetryRequest' is set
    if (workflowTelemetryRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowTelemetryRequest' when calling handleDoMetricsUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/telemetry/metrics".replaceAll("\\{format\\}","json");

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

    GenericType<CompletableFutureOfVoid> localVarReturnType = new GenericType<CompletableFutureOfVoid>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * handleDoProcesses
   * 
   * @param workflowTelemetryRequest workflowTelemetryRequest (required)
   * @return a {@code CompletableFutureOfVoid}
   * @throws ApiException if fails to make API call
   */
  public CompletableFutureOfVoid handleDoProcessesUsingPOST(WorkflowTelemetryRequest workflowTelemetryRequest) throws ApiException {
    Object localVarPostBody = workflowTelemetryRequest;
    
    // verify the required parameter 'workflowTelemetryRequest' is set
    if (workflowTelemetryRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'workflowTelemetryRequest' when calling handleDoProcessesUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/telemetry/processes".replaceAll("\\{format\\}","json");

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

    GenericType<CompletableFutureOfVoid> localVarReturnType = new GenericType<CompletableFutureOfVoid>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
