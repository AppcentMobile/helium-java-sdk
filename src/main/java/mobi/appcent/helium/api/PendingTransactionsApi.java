package mobi.appcent.helium.api;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.model.pendingTransaction.SubmitTransaction;
import mobi.appcent.helium.request.SubmitTransactionRequest;
import mobi.appcent.helium.response.pendingTransaction.PendingTransactionsStatusResponse;
import mobi.appcent.helium.response.pendingTransaction.SubmitTransactionResponse;
import okhttp3.Call;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by erenalpaslan on 20.11.2022
 */
public class PendingTransactionsApi extends BaseApi implements IPendingTransactions {
    @Override
    String path() {
        return BASE_URL + "/pending_transactions";
    }

    public static PendingTransactionsApi getInstance() {
        return new PendingTransactionsApi();
    }

    //region getPendingTransactionsStatus
    @Override
    public PendingTransactionsStatusRequest getPendingTransactionsStatus(String hash) {
        return new PendingTransactionsStatusRequest(hash);
    }

    public class PendingTransactionsStatusRequest {
        private final String hash;

        private PendingTransactionsStatusRequest(String hash) {
            this.hash = hash;
        }

        public PendingTransactionsStatusResponse execute() throws IOException {
            String path = path() + "/" + hash;
            Call call = sdkClient.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
            Type type = TypeToken.get(PendingTransactionsStatusResponse.class).getType();
            return PendingTransactionsApi.this.execute(call, type);
        }
    }
    //endregion


    @Override
    public PostSubmitNewTransactionRequest submitNewTransaction(String txn, String hash) {
        return new PostSubmitNewTransactionRequest(txn, hash);
    }

    public class PostSubmitNewTransactionRequest {
        private final String txn;
        private final String hash;

        private PostSubmitNewTransactionRequest(String txn, String hash) {
            this.txn = txn;
            this.hash = hash;
        }

        public SubmitTransactionResponse execute() throws IOException {
            String path = path() + "/" + hash;
            SubmitTransactionRequest requestBody = new SubmitTransactionRequest(txn);
            Map<String, String> headers = new HashMap<>();
            headers.put("Content-Type", "application/json");
            Call call = sdkClient.buildCall(path, HttpMethod.POST, Collections.emptyList(), requestBody, headers);
            Type type = TypeToken.get(SubmitTransactionResponse.class).getType();
            return PendingTransactionsApi.this.execute(call, type);
        }
    }
}
