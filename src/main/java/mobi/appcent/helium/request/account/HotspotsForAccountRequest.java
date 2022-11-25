package mobi.appcent.helium.request.account;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.api.AccountApi;
import mobi.appcent.helium.common.FieldConstant;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.model.Pair;
import mobi.appcent.helium.request.BaseRequest;
import mobi.appcent.helium.response.hotspot.HotspotsResponse;
import okhttp3.Call;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by erenalpaslan on 21.11.2022
 */
public class HotspotsForAccountRequest extends BaseRequest {
    private final HeliumSdkClient client;
    private final String address;
    private String cursor;
    private String filterModes;

    public HotspotsForAccountRequest(HeliumSdkClient client, String address) {
        this.client = client;
        this.address = address;
    }

    public HotspotsForAccountRequest cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public HotspotsForAccountRequest filterModes(String filterModes) {
        this.filterModes = filterModes;
        return this;
    }

    public HotspotsResponse execute() throws IOException {
        String path = UrlConstant.ACCOUNTS_PATH + "/" + address + "/hotspots";
        ArrayList<Pair> queryParams = new ArrayList<>();
        queryParams.add(Pair.create(FieldConstant.CURSOR, cursor));
        queryParams.add(Pair.create(FieldConstant.FILTER_MODES, filterModes));
        Call call = client.buildCall(path, HttpMethod.GET, queryParams, null, null);
        Type type = TypeToken.get(HotspotsResponse.class).getType();
        return execute(call, type);
    }

}