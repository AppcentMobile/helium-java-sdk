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
    private String paymentV2;
    private List<Payment> payments;
    private String payer;
    private Integer nonce;
    private String hash;
    private Integer fee;
}
