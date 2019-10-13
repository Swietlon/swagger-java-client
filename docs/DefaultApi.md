# DefaultApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**additionGet**](DefaultApi.md#additionGet) | **GET** /addition | 
[**divisionGet**](DefaultApi.md#divisionGet) | **GET** /division | 
[**multiplicationGet**](DefaultApi.md#multiplicationGet) | **GET** /multiplication | 
[**substractionGet**](DefaultApi.md#substractionGet) | **GET** /substraction | 

<a name="additionGet"></a>
# **additionGet**
> Float additionGet(x, y)



Returns sum of x and y

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Float x = 3.4F; // Float | First element of sum
Float y = 3.4F; // Float | Second element of sum
try {
    Float result = apiInstance.additionGet(x, y);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#additionGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x** | **Float**| First element of sum |
 **y** | **Float**| Second element of sum |

### Return type

**Float**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="divisionGet"></a>
# **divisionGet**
> Float divisionGet(x, y)



Returns quotient of x and y

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Float x = 3.4F; // Float | The dividend
Float y = 3.4F; // Float | The divider
try {
    Float result = apiInstance.divisionGet(x, y);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#divisionGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x** | **Float**| The dividend |
 **y** | **Float**| The divider |

### Return type

**Float**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="multiplicationGet"></a>
# **multiplicationGet**
> Float multiplicationGet(x, y)



Returns product of x and y

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Float x = 3.4F; // Float | First element of product
Float y = 3.4F; // Float | Second element of product
try {
    Float result = apiInstance.multiplicationGet(x, y);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#multiplicationGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x** | **Float**| First element of product |
 **y** | **Float**| Second element of product |

### Return type

**Float**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="substractionGet"></a>
# **substractionGet**
> Float substractionGet(x, y)



Returns the difference x and y

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Float x = 3.4F; // Float | The minuend
Float y = 3.4F; // Float | The subtrahend
try {
    Float result = apiInstance.substractionGet(x, y);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#substractionGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x** | **Float**| The minuend |
 **y** | **Float**| The subtrahend |

### Return type

**Float**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

