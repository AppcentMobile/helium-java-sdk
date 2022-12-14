package mobi.appcent.helium.request.hotspot;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.api.HotspotApi;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.exception.ApiException;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.request.BaseRequest;
import mobi.appcent.helium.response.hotspot.HotspotRewardResponse;
import okhttp3.Call;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collections;

/**
 * Created by erenalpaslan on 4.12.2022
 */
public class RewardsForHotspotsByGivenRewardBlockRequest extends BaseRequest {
    private final HeliumSdkClient client;
    private final String address;

    public RewardsForHotspotsByGivenRewardBlockRequest(HeliumSdkClient client, String address) {
        this.client = client;
        this.address = address;
    }

    public HotspotRewardResponse execute() throws ApiException {
        String path = UrlConstant.HOTSPOTS_PATH +"/"+address+"/rewards/";
        Call call = client.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
        Type type = TypeToken.get(HotspotRewardResponse.class).getType();
        return execute(call, type);
    }
}
