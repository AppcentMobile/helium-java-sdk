package mobi.appcent.helium.request.hotspot;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.common.FieldConstant;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.exception.ApiException;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.model.Pair;
import mobi.appcent.helium.request.BaseRequest;
import mobi.appcent.helium.response.hotspot.HotspotsResponse;
import okhttp3.Call;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by erenalpaslan on 3.12.2022
 */
public class HotspotsRequest extends BaseRequest {
    private final HeliumSdkClient client;
    private String cursor;
    private String filterModes;

    public HotspotsRequest(HeliumSdkClient client) {
        this.client = client;
    }

    public HotspotsRequest cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public HotspotsRequest filterModes(String filterModes) {
        this.filterModes = filterModes;
        return this;
    }

    public HotspotsResponse execute() throws ApiException {
        ArrayList<Pair> queryParams = new ArrayList<>();
        queryParams.add(Pair.create(FieldConstant.CURSOR, cursor));
        queryParams.add(Pair.create(FieldConstant.FILTER_MODES, filterModes));
        Call call = client.buildCall(UrlConstant.HOTSPOTS_PATH, HttpMethod.GET, queryParams, null, null);
        Type type = TypeToken.get(HotspotsResponse.class).getType();
        return execute(call, type);
    }
}
