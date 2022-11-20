package mobi.appcent.helium.api;

/**
 * Created by erenalpaslan on 20.11.2022
 */
public interface IPendingTransactions {
    PendingTransactionsApi.PendingTransactionsStatusRequest getPendingTransactionsStatus(String hash);
    PendingTransactionsApi.PostSubmitNewTransactionRequest submitNewTransaction(String txn, String hash);
}
