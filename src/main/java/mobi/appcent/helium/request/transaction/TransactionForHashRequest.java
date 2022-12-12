package mobi.appcent.helium.request.transaction;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.request.BaseRequest;
import mobi.appcent.helium.response.transaction.TransactionForHashResponse;
import okhttp3.Call;

import mobi.appcent.helium.exception.ApiException;
import java.lang.reflect.Type;
import java.util.Collections;

/**
 * Created by erenalpaslan on 2.12.2022
 */
public class TransactionForHashRequest extends BaseRequest {
    private final HeliumSdkClient client;
    private final String hash;

    public TransactionForHashRequest(HeliumSdkClient client, String hash) {
        this.client = client;
        this.hash = hash;
    }

    public TransactionForHashResponse execute() throws ApiException {
        String path = UrlConstant.TRANSACTIONS_PATH + "/" + hash;
        Call call = client.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
        Type type = TypeToken.get(TransactionForHashResponse.class).getType();
        return execute(call, type);
    }
}
