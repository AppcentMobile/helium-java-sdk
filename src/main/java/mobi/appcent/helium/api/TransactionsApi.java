package mobi.appcent.helium.api;

import mobi.appcent.helium.request.transaction.TransactionForHashRequest;

/**
 * Created by erenalpaslan on 2.12.2022
 */
public class TransactionsApi extends BaseApi implements ITransactionsApi {

    public static TransactionsApi getInstance() {
        return new TransactionsApi();
    }

    @Override
    public TransactionForHashRequest getTransactionForHash(String hash) {
        return new TransactionForHashRequest(sdkClient, hash);
    }

}
