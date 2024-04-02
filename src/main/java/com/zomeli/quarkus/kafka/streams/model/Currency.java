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
public class Currency {

    @SerializedName("code")
    @Expose
    private Integer code = 0;

    @Override
    public String toString() {
        return " { " +
                "\"code\": " + code +
                " }";
    }
}
