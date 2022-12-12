package mobi.appcent.helium.request.city;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.api.CityApi;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.exception.ApiException;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.request.BaseRequest;
import mobi.appcent.helium.response.hotspot.HotspotsResponse;
import okhttp3.Call;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collections;

/**
 * Created by erenalpaslan on 4.12.2022
 */
public class HotspotsByGivenCityIdRequest extends BaseRequest {
    private final HeliumSdkClient client;

    private final String cityId;

    public HotspotsByGivenCityIdRequest(HeliumSdkClient client, String id) {
        this.client = client;
        this.cityId = id;
    }

    public HotspotsResponse execute() throws ApiException {
        String path = UrlConstant.CITY_PATH +"/"+cityId+"/hotspots";
        Call call = client.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
        Type type = TypeToken.get(HotspotsResponse.class).getType();
        return execute(call, type);
    }
}
