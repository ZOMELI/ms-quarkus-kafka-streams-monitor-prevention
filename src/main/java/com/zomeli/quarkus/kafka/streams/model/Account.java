package com.zomeli.quarkus.kafka.streams.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Account {

    @SerializedName("number")
    @Expose
    private String number = null;

    @SerializedName("product")
    @Expose
    private Product product = Product.builder().build();

    @SerializedName("originationDate")
    @Expose
    private String originationDate = null;

    @SerializedName("customer")
    @Expose
    private Customer customer = Customer.builder().build();

    @SerializedName("availableBalance")
    @Expose
    private Double availableBalance = 0.0;

    @SerializedName("accountSubtype")
    @Expose
    private AccountSubtype accountSubtype = AccountSubtype.builder().build();

    @Override
    public String toString() {
        NumberFormat formatter = new DecimalFormat("#0.00");
        return " { " +
                " \"number\" : \"" + number + "\"" +
                ", \"product\" : " + product +
                ", \"originationDate\" : \"" + originationDate + "\"" +
                ", \"customer\" : " + customer +
                ", \"availableBalance\" : " + formatter.format(availableBalance) +
                ", \"accountSubtype\" : " + accountSubtype +
                " }";
    }
}
