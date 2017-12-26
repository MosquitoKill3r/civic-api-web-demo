# Web Demo Application for civic-api

Given demo shows basic usage for **civic-api** in web application. This demo gets the JWT from civic server, sends it to **civic-api** for user data retrieval and shows it on page.

You can find **civic-api** sources at [http://github.io/MosquitoKill3r/civic-api](http://github.io/MosquitoKill3r/civic-api).

### Installation
Given sample project uses **Gradle** as build tool. **civic-api** published using [JitPack](http://jitpack.io).
Add the following configuration to your `build.gradle` file in `repositories` section:
```
    maven { url 'https://jitpack.io' }
```

Add dependency to you `build.gradle` file:
```
    compile("com.github.MosquitoKill3r:civic-api:-SNAPSHOT")
```

That's it!
