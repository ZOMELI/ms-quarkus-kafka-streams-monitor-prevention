package com.zomeli.quarkus.kafka.streams.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NotifyTransactionEntity {

    @SerializedName("aws_request_id")
    @Expose
    private String awsRequestId = null;

    @SerializedName("processing_type")
    @Expose
    private String processingType = null;

    @SerializedName("resource_name")
    @Expose
    private String resourceName = null;

    @SerializedName("resource_version")
    @Expose
    private String resourceVersion = null;

    @SerializedName("module")
    @Expose
    private String module = null;

    @SerializedName("successful")
    @Expose
    private Boolean successful = false;

    @SerializedName("process_date")
    @Expose
    private String processDate  = null;

    @SerializedName("authentication")
    @Expose
    private Authentication authentication = Authentication.builder().build();

    @SerializedName("header")
    @Expose
    private Header header = Header.builder().build();

    @SerializedName("status_code")
    @Expose
    private String statusCode = null;

    @SerializedName("transaction_code")
    @Expose
    private String transactionCode = null;

    @SerializedName("ssn")
    @Expose
    private String ssn = null;

    @SerializedName("transaction_name")
    @Expose
    private String transactionName = null;

    @SerializedName("execution_type")
    @Expose
    private String executionType = null;

    @SerializedName("additional_data")
    @Expose
    private AdditionalData additionalData = AdditionalData.builder().build();

    @Override
    public String toString() {
        return " { " +
                " \"awsRequestId\": \"" + awsRequestId + "\"" +
                ", \"processingType\": \"" + processingType + "\"" +
                ", \"resourceName\": \"" + resourceName +"\"" +
                ", \"resourceVersion\": \"" + resourceVersion + "\"" +
                ", \"module\": \"" + module + "\"" +
                ", \"successful\" : " + successful +
                ", \"processDate\": \"" + processDate + "\"" +
                ", \"authentication\" : " + authentication +
                ", \"header\" : " + header +
                ", \"statusCode\": \"" + statusCode + "\"" +
                ", \"transactionCode\": \"" + transactionCode + "\"" +
                ", \"ssn\": \"" + ssn + "\"" +
                ", \"transactionName\": \"" + transactionName + "\"" +
                ", \"executionType\": \"" + executionType + "\"" +
                ", \"additionalData\" : " + additionalData +
                " }";
    }
}
