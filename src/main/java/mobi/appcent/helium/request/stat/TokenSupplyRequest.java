package mobi.appcent.helium.request.stat;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.api.StatApi;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.model.Pair;
import mobi.appcent.helium.request.BaseRequest;
import mobi.appcent.helium.response.stat.TokenSupplyResponse;
import okhttp3.Call;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by erenalpaslan on 4.12.2022
 */
public class TokenSupplyRequest extends BaseRequest {
    private final HeliumSdkClient client;
    private String format;

    public TokenSupplyRequest(HeliumSdkClient client) {
        this.client = client;
    }

    public TokenSupplyRequest format(String format) {
        this.format = format;
        return this;
    }

    public TokenSupplyResponse execute() throws IOException {
        String path = UrlConstant.STAT_PATH + "/token_supply";
        ArrayList<Pair> queryParams = new ArrayList<>();
        queryParams.add(Pair.create("format", format));
        Call call = client.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
        Type type = TypeToken.get(TokenSupplyResponse.class).getType();
        return execute(call, type);
    }
}
