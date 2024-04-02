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
public class TransactionAccount {

    private String transactionType = null;

    @SerializedName("code")
    @Expose
    private Integer code = 0;

    @SerializedName("correctionSequential")
    @Expose
    private Integer correctionSequential = 0;

    @SerializedName("status")
    @Expose
    private String status = null;

    @SerializedName("postingDate")
    @Expose
    private String postingDate = null;

    @SerializedName("originalTransaction")
    @Expose
    private Integer originalTransaction = 0;

    @SerializedName("subsidiary")
    @Expose
    private Subsidiary subsidiary = Subsidiary.builder().build();

    @SerializedName("branch")
    @Expose
    private Branch branch = Branch.builder().build();

    @SerializedName("transactionUser")
    @Expose
    private TransactionUser transactionUser = TransactionUser.builder().build();

    @SerializedName("terminal")
    @Expose
    private String terminal = null;

    @SerializedName("operation")
    @Expose
    private String operation = null;

    @SerializedName("totalAmount")
    @Expose
    private Double totalAmount = 0.0;

    @SerializedName("currency")
    @Expose
    private Currency currency = Currency.builder().build();

    @SerializedName("nature")
    @Expose
    private Nature nature = Nature.builder().build();

    @SerializedName("accountingBalance")
    @Expose
    private Double accountingBalance = 0.0;

    @SerializedName("availableBalance")
    @Expose
    private Double availableBalance = 0.0;

    @SerializedName("account")
    @Expose
    private Account account = Account.builder().build();

    @SerializedName("destinationAccount")
    @Expose
    private DestinationAccount destinationAccount = DestinationAccount.builder().build();

    @SerializedName("checkNumber")
    @Expose
    private Integer checkNumber = 0;

    @SerializedName("concept")
    @Expose
    private String concept = null;

    @SerializedName("transactionTime")
    @Expose
    private String transactionTime = null;

    @SerializedName("channel")
    @Expose
    private Channel channel = Channel.builder().build();

    @SerializedName("transaction")
    @Expose
    private Integer transaction = null;

    @SerializedName("sourceFile")
    @Expose
    private String sourceFile = null;

    @SerializedName("voucherId")
    @Expose
    private String voucherId = null;

    @Override
    public String toString() {
        NumberFormat formatter = new DecimalFormat("#0.00");
        return " { " +
                " \"transactionType\" : \"" + transactionType + "\"" +
                ", \"code\" : " + code +
                ", \"correctionSequential\" : " + correctionSequential +
                ", \"status\": \"" + status + "\"" +
                ", \"postingDate\": \"" + postingDate + "\"" +
                ", \"originalTransaction\" : " + originalTransaction +
                ", \"subsidiary\" : " + subsidiary +
                ", \"branch\" : " + branch +
                ", \"transactionUser\" : " + transactionUser +
                ", \"terminal\": \"" + terminal + "\"" +
                ", \"operation\": \"" + operation + "\"" +
                ", \"totalAmount\" : " + formatter.format(totalAmount) +
                ", \"currency\" : " + currency +
                ", \"nature\" : " + nature +
                ", \"accountingBalance\" : " + formatter.format(accountingBalance) +
                ", \"availableBalance\" : " + formatter.format(availableBalance) +
                ", \"account\" : " + account +
                ", \"destinationAccount\" : " + destinationAccount +
                ", \"checkNumber\" : " + checkNumber +
                ", \"concept\": \"" + concept + "\"" +
                ", \"transactionTime\": \"" + transactionTime + "\"" +
                ", \"channel\" : " + channel +
                ", \"transaction\" : " + transaction +
                ", \"sourceFile\": \"" + sourceFile + "\"" +
                ", \"voucherId\" : \"" + voucherId + "\"" +
                " }";
    }
}
