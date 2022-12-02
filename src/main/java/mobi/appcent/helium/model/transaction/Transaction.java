package mobi.appcent.helium.model.transaction;

import lombok.AllArgsConstructor;
import lombok.Data;
import mobi.appcent.helium.model.account.Payment;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by erenalpaslan on 3.12.2022
 */
@Data
@AllArgsConstructor
public class Transaction {
    private String type;
    private Long time;
    private List<Payment> payments;
    private String payer;
    private Integer nonce;
    private BigInteger height;
    private String hash;
    private Integer fee;
}
