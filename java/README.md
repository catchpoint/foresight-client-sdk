#### Foresight Java Client

Java client for programmatically integration with Foresight.

#### Usage

You can take your APIKEY from Foresight.

APIKEY must be configured like below.

```java
    ApiClient apiClient = new ApiClient();
    apiClient.setBasePath("https://api.service.runforesight.com");
    apiClient.setApiKey("<YOUR_APIKEY>");
    apiClient.setApiKeyPrefix("ApiKey");
    
    Configuration.setDefaultApiClient(apiClient);
    
    ProjectsApi api = new ProjectsApi();
    
    List<ProjectSummaryDto> response = api.getProjectsUsingGET();
```

#### Issues

For problems directly related to the Client, [add an issue on GitHub](https://github.com/runforesight/foresight-client-sdk/issues/new).

[Contributors](https://github.com/runforesight/foresight-client-sdk/issues/new/contributors)