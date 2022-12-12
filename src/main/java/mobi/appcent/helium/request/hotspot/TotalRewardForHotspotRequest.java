package mobi.appcent.helium.request.hotspot;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.api.HotspotApi;
import mobi.appcent.helium.common.FieldConstant;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.model.Pair;
import mobi.appcent.helium.request.BaseRequest;
import mobi.appcent.helium.response.hotspot.HotspotTotalRewardResponse;
import okhttp3.Call;
import okhttp3.Response;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by erenalpaslan on 4.12.2022
 */
public class TotalRewardForHotspotRequest extends BaseRequest {
    private final HeliumSdkClient client;
    private final String address;
    private String maxTime;
    private String minTime;
    private String bucket;

    public TotalRewardForHotspotRequest(HeliumSdkClient client, String address) {
        this.client = client;
        this.address = address; }

    public TotalRewardForHotspotRequest maxTime(String maxTime) {
        this.maxTime = maxTime;
        return this;
    }

    public TotalRewardForHotspotRequest minTime(String minTime) {
        this.minTime = minTime;
        return this;
    }

    public TotalRewardForHotspotRequest bucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    public HotspotTotalRewardResponse execute() throws IOException {
        String path = UrlConstant.HOTSPOTS_PATH +"/"+address+"/rewards/sum";
        ArrayList<Pair> queryParams = new ArrayList<>();
        queryParams.add(Pair.create(FieldConstant.MIN_TIME, minTime));
        queryParams.add(Pair.create(FieldConstant.MAX_TIME, maxTime));
        queryParams.add(Pair.create(FieldConstant.BUCKET, bucket));
        Call call = client.buildCall(path, HttpMethod.GET, queryParams, null, null);
        Type type = TypeToken.get(HotspotTotalRewardResponse.class).getType();
        return execute(call, type);
    }

    @Override
    public <T> T handleResponse(Response response, Type returnType) throws IOException {
        if(response.isSuccessful()) {
            if (response.body() != null) {
                JsonObject obj = new JsonParser().parse(response.body().string()).getAsJsonObject();
                JsonElement data = obj.get("data");
                if (!isJsonArray(data)) {
                    convertToJsonArray(obj, data);
                }

                return deserialize(obj.toString(), returnType);
            }
        }
        return null;
    }
}
