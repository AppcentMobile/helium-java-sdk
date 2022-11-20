package mobi.appcent.helium.model.account;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * Created by erenalpaslan on 5.11.2022
 */
@Data
@AllArgsConstructor
public class Txn {
    @SerializedName("payment_v2")
    public String paymentV2;
    public List<Payment> payments;
    public String payer;
    public Integer nonce;
    public String hash;
    public Integer fee;
}
