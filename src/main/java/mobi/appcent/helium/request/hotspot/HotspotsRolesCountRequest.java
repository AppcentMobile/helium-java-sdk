package mobi.appcent.helium.request.hotspot;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.api.HotspotApi;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.exception.ApiException;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.model.Pair;
import mobi.appcent.helium.request.BaseRequest;
import mobi.appcent.helium.response.hotspot.HotspotsRolesCountResponse;
import okhttp3.Call;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by erenalpaslan on 3.12.2022
 */
public class HotspotsRolesCountRequest extends BaseRequest {
    private final HeliumSdkClient client;
    private final String address;
    private String filterTypes;

    public HotspotsRolesCountRequest(HeliumSdkClient client, String address) {
        this.client = client;
        this.address = address;
    }

    public HotspotsRolesCountRequest filterTypes(String filterTypes) {
        this.filterTypes = filterTypes;
        return this;
    }

    public HotspotsRolesCountResponse execute() throws ApiException {
        String path = UrlConstant.HOTSPOTS_PATH +"/"+address+"/roles/count";
        ArrayList<Pair> queryParams = new ArrayList<>();
        queryParams.add(Pair.create("filter_types", filterTypes));
        Call call = client.buildCall(path, HttpMethod.GET, queryParams, null, null);
        Type type = TypeToken.get(HotspotsRolesCountResponse.class).getType();
        return execute(call, type);
    }
}
