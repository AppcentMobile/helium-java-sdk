# helium-java-sdk

A Java SDK for [Helium Blockchain APIs](https://docs.helium.com/api/blockchain/introduction/). 

Easily integrate to Helium Blockhain API in your java applications for `Android`, `Backend`, `Console`...

The SDK is based on `Java 1.8` and uses the following dependencies:

* OkHttp3
* Gson  

# Usage

## Installation
You can add `helium-java-sdk` to your project by using popular build systems like Gradle or Maven. 

### Gradle
Add JitPack repository in your root build.gradle file.
```groovy
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

Add the dependency in your module level build.gradle file.
```groovy
dependencies {
    implementation 'com.github.AppcentMobile:helium-java-sdk:1.0.0-SNAPSHOT'
}
```

### Maven
Add JitPack repository to your build file.
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```
Add the dependency.
```xml
<dependency>
    <groupId>com.github.AppcentMobile</groupId>
    <artifactId>helium-java-sdk</artifactId>
    <version>1.0.0-SNAPSHOT</version>
</dependency>
```


## Initialization

Create an instance by calling the constructor of `HeliumApi`.

```java
HeliumApi heliumApi = new HeliumApi();
```

If you need more configuration, use `HeliumApi(OkHttpClient client)`.

## Accessing APIs in a Type-Safe way

Access the Blockchain APIs like `hotspots`, `accounts` and `rewards` through corresponding methods of the `HeliumApi` instance. The SDK uses builder pattern to create requests. And it is possible to get the response through the synchronous `execute()` call.

```java
HotspotResponse resp = heliumApi.hotspots().searchHotspotsByLocationBox()
    .nelat(0)
    .nelon(0)
    .swlat(4f)
    .swlon(5f)
    .execute();
```

## Pagination

Some of the APIs return results in pages. In order to fetch multiple pages you should transfer previous response's `cursor` property to the next request. Currently, this is responsibility of the SDK user. 

```java
HeliumApi heliumApi = new HeliumApi();

HotspotsResponse firstPage = heliumApi.hotspots().getHotspots().execute();
HotspotsResponse secondPage = heliumApi.hotspots().getHotspots().cursor(firstPage.cursor).execute();

System.out.println(secondPage.data);
```

# Contributing

We value all kind of contributions and try to be as welcoming as possible. Please see [CONTRIBUTING.md](CONTRIBUTING.md).

## Building the project

Maven is used as the build tool. Currently build process is quite simple so not sharing much details here.

## Branch Model & Versioning

We use [GitFlow Workflow](https://nvie.com/posts/a-successful-git-branching-model/) and [Semantic Versioning](https://semver.org/).


# Licensing

This project is licensed under the Apache License Version 2.0 - see the [LICENSE](LICENSE) file for details.


