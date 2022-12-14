package mobi.appcent.helium.request.hotspot;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.common.FieldConstant;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.exception.ApiException;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.model.Pair;
import mobi.appcent.helium.request.BaseRequest;
import mobi.appcent.helium.response.challenge.ChallengesResponse;
import okhttp3.Call;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by erenalpaslan on 3.12.2022
 */
public class HotspotChallengesRequest extends BaseRequest {
    private final HeliumSdkClient client;
    private final String address;
    private String cursor;
    private String minTime;
    private String maxTime;
    private Integer limit;

    public HotspotChallengesRequest cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public HotspotChallengesRequest maxTime(String maxTime) {
        this.maxTime = maxTime;
        return this;
    }
    public HotspotChallengesRequest limit(int limit) {
        this.limit = limit;
        return this;
    }
    public HotspotChallengesRequest minTime(String minTime) {
        this.minTime = minTime;
        return this;
    }
    public HotspotChallengesRequest(HeliumSdkClient client, String address) {
        this.client = client;
        this.address = address; }

    public ChallengesResponse execute() throws ApiException {
        String path = UrlConstant.HOTSPOTS_PATH +"/"+address+"/challenges";
        ArrayList<Pair> queryParams = new ArrayList<>();
        queryParams.add(Pair.create(FieldConstant.CURSOR, cursor));
        queryParams.add(Pair.create(FieldConstant.MIN_TIME, minTime));
        queryParams.add(Pair.create(FieldConstant.MAX_TIME, maxTime));
        queryParams.add(Pair.create(FieldConstant.LIMIT, limit));
        Call call = client.buildCall(path, HttpMethod.GET, queryParams, null, null);
        Type type = TypeToken.get(ChallengesResponse.class).getType();
        return execute(call, type);
    }
}
