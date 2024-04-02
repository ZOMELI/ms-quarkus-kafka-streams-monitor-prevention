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
public class Channel {

    @SerializedName("code")
    @Expose
    private String code = null;

    @Override
    public String toString() {
        return " { " +
                "\"code\": \"" + code +  "\"" +
                " }";
    }
}
