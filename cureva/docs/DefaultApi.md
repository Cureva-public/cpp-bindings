# DefaultApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v1ClinicalmatchPost**](DefaultApi.md#v1ClinicalmatchPost) | **POST** /v1/clinicalmatch | Submit patient notes for clinical trial matching |
| [**versionGet**](DefaultApi.md#versionGet) | **GET** /version | Get API version |


<a id="v1ClinicalmatchPost"></a>
# **v1ClinicalmatchPost**
> V1ClinicalmatchPost200Response v1ClinicalmatchPost(patientNotesFile, fileSizeBytes, location)

Submit patient notes for clinical trial matching

Submits a file containing doctor notes about a patient, and a byte count for the file, to find relevant clinical trials.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    File patientNotesFile = new File("/path/to/file"); // File | The file containing notes about the patient from the doctor visit in plain text format.
    byte[] fileSizeBytes = null; // byte[] | The number of bytes in the patient notes file.
    V1ClinicalmatchPostRequestLocation location = new V1ClinicalmatchPostRequestLocation(); // V1ClinicalmatchPostRequestLocation | 
    try {
      V1ClinicalmatchPost200Response result = apiInstance.v1ClinicalmatchPost(patientNotesFile, fileSizeBytes, location);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#v1ClinicalmatchPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **patientNotesFile** | **File**| The file containing notes about the patient from the doctor visit in plain text format. | |
| **fileSizeBytes** | **byte[]**| The number of bytes in the patient notes file. | |
| **location** | [**V1ClinicalmatchPostRequestLocation**](V1ClinicalmatchPostRequestLocation.md)|  | [optional] |

### Return type

[**V1ClinicalmatchPost200Response**](V1ClinicalmatchPost200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Matching clinical trials |  -  |
| **400** | Invalid request format or file size mismatch |  -  |

<a id="versionGet"></a>
# **versionGet**
> VersionGet200Response versionGet()

Get API version

Returns the version of the Clinical Match API.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      VersionGet200Response result = apiInstance.versionGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#versionGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**VersionGet200Response**](VersionGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | API version information |  -  |

