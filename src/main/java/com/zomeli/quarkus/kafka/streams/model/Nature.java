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
public class Nature {

    @SerializedName("code")
    @Expose
    private String code = null;

    @SerializedName("description")
    @Expose
    private String description = null;

    @Override
    public String toString() {
        return " { " +
                "\"code\": \"" + code + "\"" +
                ", \"description\": \"" + description + "\"" +
                " }";
    }
}
