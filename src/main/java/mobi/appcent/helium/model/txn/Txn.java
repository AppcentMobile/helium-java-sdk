package mobi.appcent.helium.model.txn;

import lombok.AllArgsConstructor;
import lombok.Data;
import mobi.appcent.helium.model.payment.Payment;

import java.util.List;

/**
 * Created by erenalpaslan on 20.11.2022
 */
@Data
@AllArgsConstructor
public class Txn {
    private String type;
    private List<Payment> payments;
    private String payer;
    private Integer nonce;
    private String hash;
    private Integer fee;
}
