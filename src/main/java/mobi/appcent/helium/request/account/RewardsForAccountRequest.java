package mobi.appcent.helium.request.account;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.api.AccountApi;
import mobi.appcent.helium.common.FieldConstant;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.model.Pair;
import mobi.appcent.helium.request.BaseRequest;
import mobi.appcent.helium.response.hotspot.HotspotRewardResponse;
import okhttp3.Call;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by erenalpaslan on 21.11.2022
 */
public class RewardsForAccountRequest extends BaseRequest {
    private final HeliumSdkClient client;
    private final String address;
    private final String minTime;
    private String maxTime;
    private String cursor;

    public RewardsForAccountRequest(HeliumSdkClient client, String address, String minTime) {
        this.client = client;
        this.address = address;
        this.minTime = minTime;
    }

    public RewardsForAccountRequest maxTime(String maxTime) {
        this.maxTime = maxTime;
        return this;
    }

    public RewardsForAccountRequest cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public HotspotRewardResponse execute() throws IOException {
        String path = UrlConstant.ACCOUNTS_PATH + "/" + address + "/rewards";
        ArrayList<Pair> queryParams = new ArrayList<>();
        queryParams.add(Pair.create(FieldConstant.CURSOR, cursor));
        queryParams.add(Pair.create(FieldConstant.MAX_TIME, maxTime));
        queryParams.add(Pair.create(FieldConstant.MIN_TIME, minTime));
        Call call = client.buildCall(path, HttpMethod.GET, queryParams, null, null);
        Type type = TypeToken.get(HotspotRewardResponse.class).getType();
        return execute(call, type);
    }
}