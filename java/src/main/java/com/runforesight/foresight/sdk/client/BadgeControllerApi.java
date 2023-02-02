package com.runforesight.foresight.sdk.client;

import com.runforesight.foresight.sdk.ApiException;
import com.runforesight.foresight.sdk.ApiClient;
import com.runforesight.foresight.sdk.Configuration;
import com.runforesight.foresight.sdk.Pair;

import javax.ws.rs.core.GenericType;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-31T12:24:20.857460Z[Etc/UTC]")
public class BadgeControllerApi {
  private ApiClient apiClient;

  public BadgeControllerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BadgeControllerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * pullRequestTestCountBadgeByRepoId
   * 
   * @param prNumber prNumber (required)
   * @param repoId repoId (required)
   * @return a {@code String}
   * @throws ApiException if fails to make API call
   */
  public String pullRequestTestCountBadgeByRepoIdUsingGET(Long prNumber, String repoId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'prNumber' is set
    if (prNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'prNumber' when calling pullRequestTestCountBadgeByRepoIdUsingGET");
    }
    
    // verify the required parameter 'repoId' is set
    if (repoId == null) {
      throw new ApiException(400, "Missing the required parameter 'repoId' when calling pullRequestTestCountBadgeByRepoIdUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/badge/repository/{repoId}/pull-request/{prNumber}/testCount".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "prNumber" + "\\}", apiClient.escapeString(prNumber.toString()))
      .replaceAll("\\{" + "repoId" + "\\}", apiClient.escapeString(repoId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "image/svg+xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKey" };

    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * pullRequestTestRunTotalDuration
   * 
   * @param prNumber prNumber (required)
   * @param repoId repoId (required)
   * @return a {@code String}
   * @throws ApiException if fails to make API call
   */
  public String pullRequestTestRunTotalDurationUsingGET(Long prNumber, String repoId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'prNumber' is set
    if (prNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'prNumber' when calling pullRequestTestRunTotalDurationUsingGET");
    }
    
    // verify the required parameter 'repoId' is set
    if (repoId == null) {
      throw new ApiException(400, "Missing the required parameter 'repoId' when calling pullRequestTestRunTotalDurationUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/badge/repository/{repoId}/pull-request/{prNumber}/testRunDuration".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "prNumber" + "\\}", apiClient.escapeString(prNumber.toString()))
      .replaceAll("\\{" + "repoId" + "\\}", apiClient.escapeString(repoId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "image/svg+xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKey" };

    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * pullRequestWorkflowConclusionsBadgeByRepoId
   * 
   * @param prNumber prNumber (required)
   * @param repoId repoId (required)
   * @return a {@code String}
   * @throws ApiException if fails to make API call
   */
  public String pullRequestWorkflowConclusionsBadgeByRepoIdUsingGET(Long prNumber, String repoId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'prNumber' is set
    if (prNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'prNumber' when calling pullRequestWorkflowConclusionsBadgeByRepoIdUsingGET");
    }
    
    // verify the required parameter 'repoId' is set
    if (repoId == null) {
      throw new ApiException(400, "Missing the required parameter 'repoId' when calling pullRequestWorkflowConclusionsBadgeByRepoIdUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/badge/repository/{repoId}/pull-request/{prNumber}/workflowConclusion".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "prNumber" + "\\}", apiClient.escapeString(prNumber.toString()))
      .replaceAll("\\{" + "repoId" + "\\}", apiClient.escapeString(repoId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "image/svg+xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKey" };

    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * pullRequestWorkflowRunTotalDuration
   * 
   * @param prNumber prNumber (required)
   * @param repoId repoId (required)
   * @return a {@code String}
   * @throws ApiException if fails to make API call
   */
  public String pullRequestWorkflowRunTotalDurationUsingGET(Long prNumber, String repoId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'prNumber' is set
    if (prNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'prNumber' when calling pullRequestWorkflowRunTotalDurationUsingGET");
    }
    
    // verify the required parameter 'repoId' is set
    if (repoId == null) {
      throw new ApiException(400, "Missing the required parameter 'repoId' when calling pullRequestWorkflowRunTotalDurationUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/badge/repository/{repoId}/pull-request/{prNumber}/workflowRunDuration".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "prNumber" + "\\}", apiClient.escapeString(prNumber.toString()))
      .replaceAll("\\{" + "repoId" + "\\}", apiClient.escapeString(repoId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "image/svg+xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKey" };

    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * successBadgeByRepoId
   * 
   * @param repoId repoId (required)
   * @param branch branch (optional)
   * @param workflowName workflowName (optional)
   * @return a {@code String}
   * @throws ApiException if fails to make API call
   */
  public String successBadgeByRepoIdUsingGET(String repoId, String branch, String workflowName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'repoId' is set
    if (repoId == null) {
      throw new ApiException(400, "Missing the required parameter 'repoId' when calling successBadgeByRepoIdUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/badge/success".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "branch", branch));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "repoId", repoId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "workflowName", workflowName));

    
    
    
    final String[] localVarAccepts = {
      "image/svg+xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKey" };

    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * testSummaryBadgeByRepoId
   * 
   * @param repoId repoId (required)
   * @param branch branch (optional)
   * @param workflowName workflowName (optional)
   * @return a {@code String}
   * @throws ApiException if fails to make API call
   */
  public String testSummaryBadgeByRepoIdUsingGET(String repoId, String branch, String workflowName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'repoId' is set
    if (repoId == null) {
      throw new ApiException(400, "Missing the required parameter 'repoId' when calling testSummaryBadgeByRepoIdUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/badge/test".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "branch", branch));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "repoId", repoId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "workflowName", workflowName));

    
    
    
    final String[] localVarAccepts = {
      "image/svg+xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKey" };

    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * utilizationBadgeByRepoId
   * 
   * @param repoId repoId (required)
   * @param branch branch (optional)
   * @param workflowName workflowName (optional)
   * @return a {@code String}
   * @throws ApiException if fails to make API call
   */
  public String utilizationBadgeByRepoIdUsingGET(String repoId, String branch, String workflowName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'repoId' is set
    if (repoId == null) {
      throw new ApiException(400, "Missing the required parameter 'repoId' when calling utilizationBadgeByRepoIdUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/badge/utilization".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "branch", branch));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "repoId", repoId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "workflowName", workflowName));

    
    
    
    final String[] localVarAccepts = {
      "image/svg+xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKey" };

    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
