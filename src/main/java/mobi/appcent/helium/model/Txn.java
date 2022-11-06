package mobi.appcent.helium.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by erenalpaslan on 5.11.2022
 */
public class Txn {
    @SerializedName("payment_v2")
    public String paymentV2;
    public List<Payment> payments;
    public String payer;
    public Integer nonce;
    public String hash;
    public Integer fee;
}
