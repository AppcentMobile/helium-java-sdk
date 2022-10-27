package mobi.appcent.helium.api;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.model.ApiResponse;
import mobi.appcent.helium.model.Hotspot;
import mobi.appcent.helium.model.HotspotsResponse;
import okhttp3.Call;
import okhttp3.Request;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

public class HotspotApi extends BaseApi implements IHotspotApi {

    private HotspotApi() {
    }

    public static HotspotApi getInstance() {
        return new HotspotApi();
    }

    @Override
    String path() {
        return BASE_URL + "/hotspots";
    }

    @Override
    public ApiResponse<HotspotsResponse> getHotspots() throws IOException {
        Call call = sdkClient.buildCall(path(), HttpMethod.GET, Collections.emptyList(), null, null);
        Type type = TypeToken.get(HotspotsResponse.class).getType();
        return execute(call, type);
    }
}
