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
public class DestinationAccount {

    @SerializedName("number")
    @Expose
    private String number = null;

    @SerializedName("customer")
    @Expose
    private Customer customer = Customer.builder().build();

    @Override
    public String toString() {
        return " { " +
                "\"number\": \"" + number + "\"" +
                ", \"customer\": " + customer +
                " }";
    }
}
