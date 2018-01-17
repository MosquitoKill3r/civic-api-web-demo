# Web Demo Application for civic-sip-api-java

Given demo shows basic usage for **civic-sip-api-java** in web application. This demo gets the JWT from civic server, sends it to **civic-sip-api-java** for user data retrieval and shows it on page.

You can find **civic-sip-api-java** sources [here](https://github.com/civic-community/civic-sip-api-java).

### Installation
Given sample project uses **Gradle** as build tool. **civic-sip-api-java** published using [JitPack](http://jitpack.io).
Add the following configuration to your `build.gradle` file in `repositories` section:
```
    maven { url 'https://jitpack.io' }
```

Add dependency to you `build.gradle` file:
```
    compile("com.github.civic-community:civic-sip-api-java:0.0.3")
```

That's it!
