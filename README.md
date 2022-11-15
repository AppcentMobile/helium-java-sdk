# helium-java-sdk

> **Warning**
> This project is at a very very early stage and not ready to be used in the wild.

A Java SDK for [Helium Blockchain APIs](https://docs.helium.com/api/blockchain/introduction/). 

Easily integrate to Helium Blockhain API in your java applications for `Android`, `Backend`, `Console`...

The SDK is based on `Java 1.8` and makes use of the following dependencies:

* OkHttp3
* Gson

# Usage

## Installation

The SDK is not available on any maven repository yet. Currently only way to include it in your projects is by copying the source code. 

When we feel comfortable on releasing first alpha, it will be available on a maven repository.

## Initialization

Create an instance by calling the constructor of `HeliumApi`.

```java
HeliumApi heliumApi = new HeliumApi();
```

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

Some of the APIs return results in pages. In order to fetch multiple pages you should transfer previous response's `cursor` property to the next request. Currently this is responsibility of the SDK user. 

//TODO add example.

# Contributing

We value all kind of contributions and try to be as welcoming as possible. Please see [CONTRIBUTING.md](CONTRIBUTING.md).

## Building the project

Maven is used as the build tool. Currently build process is quite simple so not sharing much details here.

## Branch Model & Versioning

We use [GitFlow Workflow](https://nvie.com/posts/a-successful-git-branching-model/) and [Semantic Versioning](https://semver.org/).


# Licensing

This project is licensed under the Apache License Version 2.0 - see the [LICENSE](LICENSE) file for details.


