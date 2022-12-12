package mobi.appcent.helium.request.oui;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.request.BaseRequest;
import mobi.appcent.helium.response.ouis.OuisResponse;
import okhttp3.Call;

import mobi.appcent.helium.exception.ApiException;
import java.lang.reflect.Type;
import java.util.Collections;

/**
 * Created by erenalpaslan on 26.11.2022
 */
public class OUIRequest extends BaseRequest {
    private final HeliumSdkClient client;
    private final String oui;

    public OUIRequest(HeliumSdkClient client, String oui) {
        this.client = client;
        this.oui = oui;
    }

    public OuisResponse execute() throws ApiException {
        String path = UrlConstant.OUIS_PATH + "/" + oui;
        Call call = client.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
        Type type = TypeToken.get(OuisResponse.class).getType();
        return execute(call, type);
    }
}
