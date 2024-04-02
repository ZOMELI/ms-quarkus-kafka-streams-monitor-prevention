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
public class Header {

    @SerializedName("aws_request_id")
    @Expose
    private String awsRequestId = null;

    @SerializedName("x_request_id")
    @Expose
    private String xRequestId = null;

    @SerializedName("x_end_user_login")
    @Expose
    private String xEndUserLogin = null;

    @SerializedName("x_end_user_request_date_time")
    @Expose
    private String xEndUserRequestDateTime = null;

    @SerializedName("x_end_user_terminal")
    @Expose
    private String xEndUserTerminal = null;

    @SerializedName("x_end_user_last_logged_date_time")
    @Expose
    private String xEndUserLastLoggedDateTime = null;

    @SerializedName("x_authorization")
    @Expose
    private String xAuthorization = null;

    @SerializedName("x_financial_id")
    @Expose
    private String xFinancialId = null;

    @SerializedName("x_reverse")
    @Expose
    private String xReverse = null;

    @SerializedName("x_requestId_to_reverse")
    @Expose
    private String xRequestIdToReverse = null;

    @SerializedName("x_channel")
    @Expose
    private String xChannel = null;

    @SerializedName("accept_Language")
    @Expose
    private String acceptLanguage = null;

    @Override
    public String toString() {
        return " { " +
                "\"awsRequestId\": \"" + awsRequestId + "\"" +
                ", \"xRequestId\": \"" + xRequestId + "\"" +
                ", \"xEndUserLogin\": \"" + xEndUserLogin + "\"" +
                ", \"xEndUserRequestDateTime\": \"" + xEndUserRequestDateTime + "\"" +
                ", \"xEndUserTerminal\": \"" + xEndUserTerminal + "\"" +
                ", \"xEndUserLastLoggedDateTime\": \"" + xEndUserLastLoggedDateTime + "\"" +
                ", \"xAuthorization\": \"" + xAuthorization + "\"" +
                ", \"xFinancialId\": \"" + xFinancialId + "\"" +
                ", \"xReverse\": \"" + xReverse + "\"" +
                ", \"xRequestIdToReverse\": \"" + xRequestIdToReverse + "\"" +
                ", \"xChannel\": \"" + xChannel + "\"" +
                ", \"acceptLanguage\": \"" + acceptLanguage + "\"" +
                " }";
    }
}
