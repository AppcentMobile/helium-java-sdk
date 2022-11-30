package mobi.appcent.helium.request.oui;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.request.BaseRequest;
import mobi.appcent.helium.response.ouis.OuiStatsResponse;
import mobi.appcent.helium.response.ouis.OuisResponse;
import okhttp3.Call;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collections;

/**
 * Created by erenalpaslan on 26.11.2022
 */
public class OUIStatsRequest extends BaseRequest {
    private final HeliumSdkClient client;

    public OUIStatsRequest(HeliumSdkClient client) {
        this.client = client;
    }

    public OuiStatsResponse execute() throws IOException {
        String path = UrlConstant.OUIS_PATH + "/stats";
        Call call = client.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
        Type type = TypeToken.get(OuiStatsResponse.class).getType();
        return execute(call, type);
    }
}
