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
public class Customer {

    @SerializedName("code")
    @Expose
    private Integer code = 0;

    @SerializedName("names")
    @Expose
    private String names = null;

    @SerializedName("category")
    @Expose
    private Category category = Category.builder().build();

    @Override
    public String toString() {
        return " { " +
                " \"code\" : " + code +
                ", \"names\" : \"" + names + "\"" +
                ", \"category\" : " + category +
                " }";
    }
}
