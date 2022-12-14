package mobi.appcent.helium.api;

import mobi.appcent.helium.request.pendingtransactions.PendingTransactionsStatusRequest;
import mobi.appcent.helium.request.pendingtransactions.PostSubmitNewTransactionRequest;

/**
 * Created by erenalpaslan on 20.11.2022
 */
public class PendingTransactionsApi extends BaseApi implements IPendingTransactions {

    public static PendingTransactionsApi getInstance() {
        return new PendingTransactionsApi();
    }

    //region getPendingTransactionsStatus
    @Override
    public PendingTransactionsStatusRequest getPendingTransactionsStatus(String hash) {
        return new PendingTransactionsStatusRequest(sdkClient, hash);
    }
    //endregion

    @Override
    public PostSubmitNewTransactionRequest submitNewTransaction(String txn, String hash) {
        return new PostSubmitNewTransactionRequest(sdkClient, txn, hash);
    }
}
