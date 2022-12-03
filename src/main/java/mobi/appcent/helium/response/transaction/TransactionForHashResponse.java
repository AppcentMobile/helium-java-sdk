package mobi.appcent.helium.response.transaction;

import lombok.AllArgsConstructor;
import lombok.Data;
import mobi.appcent.helium.model.transaction.Transaction;

/**
 * Created by erenalpaslan on 3.12.2022
 */
@Data
@AllArgsConstructor
public class TransactionForHashResponse {
    private Transaction data;
}
