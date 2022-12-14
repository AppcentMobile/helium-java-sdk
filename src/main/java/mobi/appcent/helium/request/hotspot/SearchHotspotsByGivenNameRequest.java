package mobi.appcent.helium.request.hotspot;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.api.HotspotApi;
import mobi.appcent.helium.common.FieldConstant;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.exception.ApiException;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.model.Pair;
import mobi.appcent.helium.request.BaseRequest;
import mobi.appcent.helium.response.hotspot.HotspotResponse;
import okhttp3.Call;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by erenalpaslan on 3.12.2022
 */
public class SearchHotspotsByGivenNameRequest extends BaseRequest {
    private final HeliumSdkClient client;
    private String name;
    public SearchHotspotsByGivenNameRequest(HeliumSdkClient client) {
        this.client = client;
    }

    public SearchHotspotsByGivenNameRequest name(String name) {
        this.name = name;
        return this;
    }

    public HotspotResponse execute() throws ApiException {
        String path = UrlConstant.HOTSPOTS_PATH +"/name";
        ArrayList<Pair> queryParams = new ArrayList<>();
        queryParams.add(Pair.create(FieldConstant.SEARCH, name));
        Call call = client.buildCall(path, HttpMethod.GET, queryParams, null, null);
        Type type = TypeToken.get(HotspotResponse.class).getType();
        return execute(call, type);
    }
}
