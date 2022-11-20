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
    public String type;
    public List<Payment> payments;
    public String payer;
    public Integer nonce;
    public String hash;
    public Integer fee;
}
