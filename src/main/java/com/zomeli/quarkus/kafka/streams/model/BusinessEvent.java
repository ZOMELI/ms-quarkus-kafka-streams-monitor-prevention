package com.zomeli.quarkus.kafka.streams.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BusinessEvent {

    @SerializedName("id")
    @Expose
    private String id = null;

    @SerializedName("type")
    @Expose
    private String type = null;

    @SerializedName("correlationId")
    @Expose
    private String correlationId = null;

    @SerializedName("data")
    @Expose
    private Data data = Data.builder().build();

    @Override
    public String toString() {
        return " { " +
                " \"id\": \"" + id + "\"" +
                ", \"type\": \"" + type + "\"" +
                ", \"correlationId\": \"" + correlationId + "\"" +
                ", \"data\": " + data +
                " }";
    }
}
