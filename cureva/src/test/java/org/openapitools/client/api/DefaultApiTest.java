/*
 * Clinical Match API
 * A simple API to match patients to clinical trials.
 *
 * The version of the OpenAPI document: 1.0.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import java.io.File;
import org.openapitools.client.model.V1ClinicalmatchPost200Response;
import org.openapitools.client.model.V1ClinicalmatchPost400Response;
import org.openapitools.client.model.V1ClinicalmatchPostRequestLocation;
import org.openapitools.client.model.VersionGet200Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
@Disabled
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    /**
     * Submit patient notes for clinical trial matching
     *
     * Submits a file containing doctor notes about a patient, and a byte count for the file, to find relevant clinical trials.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void v1ClinicalmatchPostTest() throws ApiException {
        File patientNotesFile = null;
        byte[] fileSizeBytes = null;
        V1ClinicalmatchPostRequestLocation location = null;
        V1ClinicalmatchPost200Response response = api.v1ClinicalmatchPost(patientNotesFile, fileSizeBytes, location);
        // TODO: test validations
    }

    /**
     * Get API version
     *
     * Returns the version of the Clinical Match API.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void versionGetTest() throws ApiException {
        VersionGet200Response response = api.versionGet();
        // TODO: test validations
    }

}
