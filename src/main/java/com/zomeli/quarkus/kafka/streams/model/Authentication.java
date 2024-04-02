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
public class Authentication {

    @SerializedName("login")
    @Expose
    private String login = null;

    @SerializedName("name")
    @Expose
    private String name = null;

    @SerializedName("subsidiary_code")
    @Expose
    private String subsidiaryCode = null;

    @SerializedName("branch_code")
    @Expose
    private String branchCode = null;

    @SerializedName("role_code")
    @Expose
    private String roleCode = null;

    @SerializedName("channel_code")
    @Expose
    private String channelCode = null;

    @SerializedName("terminal")
    @Expose
    private String terminal = null;

    @SerializedName("session_id")
    @Expose
    private String sessionId = null;

    @Override
    public String toString() {
        return " { " +
                " \"login\": \"" + login +  "\"" +
                ", \"name\": \"" + name +  "\"" +
                ", \"subsidiaryCode\": \"" + subsidiaryCode +  "\"" +
                ", \"branchCode\": \"" + branchCode +  "\"" +
                ", \"roleCode\": \"" + roleCode +  "\"" +
                ", \"channelCode\": \"" + channelCode +  "\"" +
                ", \"terminal\": \"" + terminal +  "\"" +
                ", \"sessionId\": \"" + sessionId +  "\"" +
                " }";
    }
}
