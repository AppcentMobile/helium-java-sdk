package mobi.appcent.helium.request.hotspot;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.api.HotspotApi;
import mobi.appcent.helium.common.FieldConstant;
import mobi.appcent.helium.common.UrlConstant;
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
public class SearchHotspotsByLocationDistanceRequest extends BaseRequest {
    private final HeliumSdkClient client;
    private Float lat;
    private Float lon;
    private Integer distance;
    public SearchHotspotsByLocationDistanceRequest(HeliumSdkClient client) {
        this.client = client;
    }
    public SearchHotspotsByLocationDistanceRequest lat(float lat) {
        this.lat = lat;
        return this;
    }

    public SearchHotspotsByLocationDistanceRequest lon(float lon) {
        this.lon = lon;
        return this;
    }

    public SearchHotspotsByLocationDistanceRequest distance(int distance) {
        this.distance = distance;
        return this;
    }
    public HotspotResponse execute() throws IOException {
        String path = UrlConstant.HOTSPOTS_PATH +"/location/distance";
        ArrayList<Pair> queryParams = new ArrayList<>();
        queryParams.add(Pair.create(FieldConstant.LAT, lat));
        queryParams.add(Pair.create(FieldConstant.LON, lon));
        queryParams.add(Pair.create(FieldConstant.DISTANCE, distance));
        Call call = client.buildCall(path, HttpMethod.GET, queryParams, null, null);
        Type type = TypeToken.get(HotspotResponse.class).getType();
        return execute(call, type);
    }
}
