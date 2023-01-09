#### Foresight Javascript Client

Javascript client for programmatically integration with Foresight.

#### Installation

```bash
npm install -g @runforesight/foresight-javascript-client
```

##### Local Build

If you want to build your own client.

```bash
npm install
```

```bash
npm build
```

#### Usage

You can take your APIKEY from Foresight.

APIKEY must be configured like below.

```ts
import * as api from 'foresight-client-sdk';

const apiKey = 'ApiKey <YOUR_APIKEY>';
const basePath = 'https://api.service.runforesight.com';

(async() => {
    const projectApi = new api.ProjectsApi(new api.Configuration({
        apiKey,
    }));

    const result = await projectApi.getProjectsUsingGET();
})()
.catch(err => console.error(err));
```

#### Issues

For problems directly related to the Client, [add an issue on GitHub](https://github.com/runforesight/foresight-client-sdk/issues/new).

[Contributors](https://github.com/runforesight/foresight-client-sdk/issues/new/contributors)