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
public class SearchHotspotsByLocationBoxRequest extends BaseRequest {
    private final HeliumSdkClient client;
    private Float swlat;
    private Float swlon;
    private Integer nelat;
    private Integer nelon;

    public SearchHotspotsByLocationBoxRequest(HeliumSdkClient client) {
        this.client = client;
    }

    public SearchHotspotsByLocationBoxRequest swlat(float swlat) {
        this.swlat = swlat;
        return this;
    }

    public SearchHotspotsByLocationBoxRequest swlon(float swlon) {
        this.swlon = swlon;
        return this;
    }

    public SearchHotspotsByLocationBoxRequest nelat(int nelat) {
        this.nelat = nelat;
        return this;
    }

    public SearchHotspotsByLocationBoxRequest nelon(int nelon) {
        this.nelon = nelon;
        return this;
    }
    public HotspotResponse execute() throws ApiException {
        String path = UrlConstant.HOTSPOTS_PATH +"/location/box";
        ArrayList<Pair> queryParams = new ArrayList<>();
        queryParams.add(Pair.create(FieldConstant.SWLAT, swlat));
        queryParams.add(Pair.create(FieldConstant.SWLON, swlon));
        queryParams.add(Pair.create(FieldConstant.NELAT, nelat));
        queryParams.add(Pair.create(FieldConstant.NELON, nelon));
        Call call = client.buildCall(path, HttpMethod.GET, queryParams, null, null);
        Type type = TypeToken.get(HotspotResponse.class).getType();
        return execute(call, type);
    }
}
