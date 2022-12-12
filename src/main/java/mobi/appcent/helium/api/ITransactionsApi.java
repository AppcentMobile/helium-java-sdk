package mobi.appcent.helium.api;

import mobi.appcent.helium.exception.ApiException;
import mobi.appcent.helium.request.transaction.TransactionForHashRequest;

/**
 * Created by erenalpaslan on 2.12.2022
 */
public interface ITransactionsApi {
    TransactionForHashRequest getTransactionForHash(String hash) throws ApiException;
}
