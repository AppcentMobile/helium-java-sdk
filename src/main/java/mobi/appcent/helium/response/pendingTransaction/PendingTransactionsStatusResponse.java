package mobi.appcent.helium.response.pendingTransaction;

import lombok.AllArgsConstructor;
import lombok.Data;
import mobi.appcent.helium.model.pendingtransaction.PendingTransactionStatus;

import java.util.List;

/**
 * Created by erenalpaslan on 20.11.2022
 */
@Data
@AllArgsConstructor
public class PendingTransactionsStatusResponse {
    public List<PendingTransactionStatus> data;
}
