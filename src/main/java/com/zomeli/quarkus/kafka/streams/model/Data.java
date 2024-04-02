package com.zomeli.quarkus.kafka.streams.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Data {

    @SerializedName("transactionAccount")
    @Expose
    private List<TransactionAccount> transactionAccount = new ArrayList<>();

    @Override
    public String toString() {
        return " { " +
                " \"transactionAccount\": " + transactionAccount +
                " }";
    }
}
