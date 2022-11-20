package mobi.appcent.helium.response.pendingTransaction;

import lombok.AllArgsConstructor;
import lombok.Data;
import mobi.appcent.helium.model.pendingTransaction.SubmitTransaction;

/**
 * Created by erenalpaslan on 20.11.2022
 */
@Data
@AllArgsConstructor
public class SubmitTransactionResponse {
    public SubmitTransaction data;
}
