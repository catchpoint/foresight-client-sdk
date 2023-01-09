package com.runforesight.foresight.sdk.client;

import com.runforesight.foresight.sdk.ApiException;
import com.runforesight.foresight.sdk.ApiClient;
import com.runforesight.foresight.sdk.Configuration;
import com.runforesight.foresight.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.runforesight.foresight.sdk.client.RepoSummaryDto;
import com.runforesight.foresight.sdk.client.UnwatchRepoDto;
import com.runforesight.foresight.sdk.client.WatchRepoDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-09T10:54:31.162605Z[Etc/UTC]")
public class ReposApi {
  private ApiClient apiClient;

  public ReposApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ReposApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * getAllRepos
   * 
   * @param provider provider (required)
   * @return a {@code List<RepoSummaryDto>}
   * @throws ApiException if fails to make API call
   */
  public List<RepoSummaryDto> getAllReposUsingGET(String provider) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'provider' is set
    if (provider == null) {
      throw new ApiException(400, "Missing the required parameter 'provider' when calling getAllReposUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/repos/{provider}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "provider" + "\\}", apiClient.escapeString(provider.toString()));

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

    GenericType<List<RepoSummaryDto>> localVarReturnType = new GenericType<List<RepoSummaryDto>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getAllWatchedRepos
   * 
   * @param projectId projectId (required)
   * @param provider provider (required)
   * @return a {@code List<RepoSummaryDto>}
   * @throws ApiException if fails to make API call
   */
  public List<RepoSummaryDto> getAllWatchedReposUsingGET(String projectId, String provider) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling getAllWatchedReposUsingGET");
    }
    
    // verify the required parameter 'provider' is set
    if (provider == null) {
      throw new ApiException(400, "Missing the required parameter 'provider' when calling getAllWatchedReposUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/repos/{provider}/project/{projectId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "projectId" + "\\}", apiClient.escapeString(projectId.toString()))
      .replaceAll("\\{" + "provider" + "\\}", apiClient.escapeString(provider.toString()));

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

    GenericType<List<RepoSummaryDto>> localVarReturnType = new GenericType<List<RepoSummaryDto>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * unwatchRepo
   * 
   * @param provider provider (required)
   * @param dto dto (required)
   * @throws ApiException if fails to make API call
   */
  public void unwatchRepoUsingPATCH(String provider, UnwatchRepoDto dto) throws ApiException {
    Object localVarPostBody = dto;
    
    // verify the required parameter 'provider' is set
    if (provider == null) {
      throw new ApiException(400, "Missing the required parameter 'provider' when calling unwatchRepoUsingPATCH");
    }
    
    // verify the required parameter 'dto' is set
    if (dto == null) {
      throw new ApiException(400, "Missing the required parameter 'dto' when calling unwatchRepoUsingPATCH");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/repos/{provider}/unwatch".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "provider" + "\\}", apiClient.escapeString(provider.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKey" };


    apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * watchRepo
   * 
   * @param provider provider (required)
   * @param dto dto (required)
   * @throws ApiException if fails to make API call
   */
  public void watchRepoUsingPUT(String provider, WatchRepoDto dto) throws ApiException {
    Object localVarPostBody = dto;
    
    // verify the required parameter 'provider' is set
    if (provider == null) {
      throw new ApiException(400, "Missing the required parameter 'provider' when calling watchRepoUsingPUT");
    }
    
    // verify the required parameter 'dto' is set
    if (dto == null) {
      throw new ApiException(400, "Missing the required parameter 'dto' when calling watchRepoUsingPUT");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/repos/{provider}/watch".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "provider" + "\\}", apiClient.escapeString(provider.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKey" };


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
