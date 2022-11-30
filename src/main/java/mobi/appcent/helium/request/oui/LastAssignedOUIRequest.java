package mobi.appcent.helium.request.oui;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.request.BaseRequest;
import mobi.appcent.helium.response.ouis.OuisResponse;
import okhttp3.Call;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collections;

/**
 * Created by erenalpaslan on 26.11.2022
 */
public class LastAssignedOUIRequest extends BaseRequest {
    private final HeliumSdkClient client;

    public LastAssignedOUIRequest(HeliumSdkClient client) {
        this.client = client;
    }

    public OuisResponse execute() throws IOException {
        String path = UrlConstant.OUIS_PATH + "/last";
        Call call = client.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
        Type type = TypeToken.get(OuisResponse.class).getType();
        return execute(call, type);
    }
}
