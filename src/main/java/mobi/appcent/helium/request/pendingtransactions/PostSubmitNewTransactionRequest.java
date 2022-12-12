package mobi.appcent.helium.request.pendingtransactions;

import com.google.gson.reflect.TypeToken;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.common.HeaderConstant;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.exception.ApiException;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.request.BaseRequest;
import mobi.appcent.helium.response.pendingTransaction.SubmitTransactionResponse;
import okhttp3.Call;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by erenalpaslan on 26.11.2022
 */
@AllArgsConstructor
@Getter
@Setter
public class PostSubmitNewTransactionRequest extends BaseRequest {
    private final HeliumSdkClient client;
    private final String txn;
    private final String hash;

    public SubmitTransactionResponse execute() throws ApiException {
        String path = UrlConstant.PENDING_TRANSACTION_PATH + "/" + hash;
        SubmitTransactionRequest requestBody = new SubmitTransactionRequest(txn);
        Map<String, String> headers = new HashMap<>();
        headers.put(HeaderConstant.CONTENT_TYPE, HeaderConstant.APPLICATION_JSON);
        Call call = client.buildCall(path, HttpMethod.POST, Collections.emptyList(), requestBody, headers);
        Type type = TypeToken.get(SubmitTransactionResponse.class).getType();
        return execute(call, type);
    }
}
