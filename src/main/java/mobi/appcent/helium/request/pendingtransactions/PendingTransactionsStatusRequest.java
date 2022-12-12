package mobi.appcent.helium.request.pendingtransactions;

import com.google.gson.reflect.TypeToken;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.api.PendingTransactionsApi;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.request.BaseRequest;
import mobi.appcent.helium.response.pendingTransaction.PendingTransactionsStatusResponse;
import okhttp3.Call;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collections;

/**
 * Created by erenalpaslan on 26.11.2022
 */
@AllArgsConstructor
@Getter
@Setter
public class PendingTransactionsStatusRequest extends BaseRequest {
    private final HeliumSdkClient client;
    private final String hash;

    public PendingTransactionsStatusResponse execute() throws IOException {
        String path = UrlConstant.PENDING_TRANSACTION_PATH + "/" + hash;
        Call call = client.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
        Type type = TypeToken.get(PendingTransactionsStatusResponse.class).getType();
        return execute(call, type);
    }
}
