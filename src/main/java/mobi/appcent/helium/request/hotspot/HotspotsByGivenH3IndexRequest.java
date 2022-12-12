package mobi.appcent.helium.request.hotspot;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.api.HotspotApi;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.request.BaseRequest;
import mobi.appcent.helium.response.hotspot.HotspotResponse;
import okhttp3.Call;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collections;

/**
 * Created by erenalpaslan on 3.12.2022
 */
public class HotspotsByGivenH3IndexRequest extends BaseRequest {
    private final HeliumSdkClient client;
    private String index;

    public HotspotsByGivenH3IndexRequest(HeliumSdkClient client, String index) {
        this.client = client;
        this.index = index; }

    public HotspotResponse execute() throws IOException {
        String path = UrlConstant.HOTSPOTS_PATH +"/hex/"+index;
        Call call = client.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
        Type type = TypeToken.get(HotspotResponse.class).getType();
        return execute(call, type);
    }
}
