package mobi.appcent.helium.request.dc;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.common.FieldConstant;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.model.Pair;
import mobi.appcent.helium.request.BaseRequest;
import mobi.appcent.helium.response.account.AccountsResponse;
import mobi.appcent.helium.response.dc.DCBurnStatsResponse;
import okhttp3.Call;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collections;

/**
 * Created by erenalpaslan on 27.11.2022
 */
public class DCBurnStatsRequest extends BaseRequest {
    private final HeliumSdkClient client;

    public DCBurnStatsRequest(HeliumSdkClient client) {
        this.client = client;
    }

    public DCBurnStatsResponse execute() throws IOException {
        String path = UrlConstant.DC_BURNS_PATH + "/stats";
        Call call = client.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
        Type type = TypeToken.get(DCBurnStatsResponse.class).getType();
        return execute(call, type);
    }
}
