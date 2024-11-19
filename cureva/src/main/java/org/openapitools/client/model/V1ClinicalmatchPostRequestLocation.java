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


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * The geographic location of the patient encounter.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-18T19:57:05.929993-05:00[America/New_York]", comments = "Generator version: 7.10.0")
public class V1ClinicalmatchPostRequestLocation {
  public static final String SERIALIZED_NAME_LATITUDE = "latitude";
  @SerializedName(SERIALIZED_NAME_LATITUDE)
  @javax.annotation.Nonnull
  private Float latitude;

  public static final String SERIALIZED_NAME_LONGITUDE = "longitude";
  @SerializedName(SERIALIZED_NAME_LONGITUDE)
  @javax.annotation.Nonnull
  private Float longitude;

  public V1ClinicalmatchPostRequestLocation() {
  }

  public V1ClinicalmatchPostRequestLocation latitude(@javax.annotation.Nonnull Float latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * The latitude of the location.
   * @return latitude
   */
  @javax.annotation.Nonnull
  public Float getLatitude() {
    return latitude;
  }

  public void setLatitude(@javax.annotation.Nonnull Float latitude) {
    this.latitude = latitude;
  }


  public V1ClinicalmatchPostRequestLocation longitude(@javax.annotation.Nonnull Float longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * The longitude of the location.
   * @return longitude
   */
  @javax.annotation.Nonnull
  public Float getLongitude() {
    return longitude;
  }

  public void setLongitude(@javax.annotation.Nonnull Float longitude) {
    this.longitude = longitude;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ClinicalmatchPostRequestLocation v1ClinicalmatchPostRequestLocation = (V1ClinicalmatchPostRequestLocation) o;
    return Objects.equals(this.latitude, v1ClinicalmatchPostRequestLocation.latitude) &&
        Objects.equals(this.longitude, v1ClinicalmatchPostRequestLocation.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ClinicalmatchPostRequestLocation {\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("latitude");
    openapiFields.add("longitude");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("latitude");
    openapiRequiredFields.add("longitude");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1ClinicalmatchPostRequestLocation
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1ClinicalmatchPostRequestLocation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ClinicalmatchPostRequestLocation is not found in the empty JSON string", V1ClinicalmatchPostRequestLocation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1ClinicalmatchPostRequestLocation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ClinicalmatchPostRequestLocation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1ClinicalmatchPostRequestLocation.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ClinicalmatchPostRequestLocation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ClinicalmatchPostRequestLocation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ClinicalmatchPostRequestLocation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ClinicalmatchPostRequestLocation.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ClinicalmatchPostRequestLocation>() {
           @Override
           public void write(JsonWriter out, V1ClinicalmatchPostRequestLocation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ClinicalmatchPostRequestLocation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1ClinicalmatchPostRequestLocation given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1ClinicalmatchPostRequestLocation
   * @throws IOException if the JSON string is invalid with respect to V1ClinicalmatchPostRequestLocation
   */
  public static V1ClinicalmatchPostRequestLocation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ClinicalmatchPostRequestLocation.class);
  }

  /**
   * Convert an instance of V1ClinicalmatchPostRequestLocation to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

