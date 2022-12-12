package mobi.appcent.helium.api;

import mobi.appcent.helium.request.pendingtransactions.PendingTransactionsStatusRequest;
import mobi.appcent.helium.request.pendingtransactions.PostSubmitNewTransactionRequest;

/**
 * Created by erenalpaslan on 20.11.2022
 */
public interface IPendingTransactions {
    PendingTransactionsStatusRequest getPendingTransactionsStatus(String hash);
    PostSubmitNewTransactionRequest submitNewTransaction(String txn, String hash);
}
