package mobi.appcent.helium.request.hotspot;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.exception.ApiException;
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
public class HotspotByGivenAddressRequest extends BaseRequest {
    private final HeliumSdkClient client;
    private String address;

    public HotspotByGivenAddressRequest(HeliumSdkClient client) {
        this.client = client;
    }

    public HotspotByGivenAddressRequest address(String address) {
        this.address = address;
        return this;
    }

    public HotspotResponse execute() throws ApiException {
        String path = UrlConstant.HOTSPOTS_PATH  + "/" + address;
        Call call = client.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
        Type type = TypeToken.get(HotspotResponse.class).getType();
        return execute(call, type);
    }
}