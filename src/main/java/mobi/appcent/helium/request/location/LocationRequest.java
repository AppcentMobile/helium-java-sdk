package mobi.appcent.helium.request.location;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.common.FieldConstant;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.model.Pair;
import mobi.appcent.helium.request.BaseRequest;
import mobi.appcent.helium.response.account.AccountsResponse;
import mobi.appcent.helium.response.location.LocationResponse;
import okhttp3.Call;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by erenalpaslan on 3.12.2022
 */
public class LocationRequest extends BaseRequest {
    private final HeliumSdkClient client;
    private final String location;

    public LocationRequest(HeliumSdkClient client, String location) {
        this.client = client;
        this.location = location;
    }

    public LocationResponse execute() throws IOException {
        String path = UrlConstant.LOCATIONS_PATH + "/" + location;
        Call call = client.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
        Type type = TypeToken.get(LocationResponse.class).getType();
        return execute(call, type);
    }
}
