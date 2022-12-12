package mobi.appcent.helium.request.statechannel;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.common.FieldConstant;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.model.Pair;
import mobi.appcent.helium.request.BaseRequest;
import mobi.appcent.helium.response.account.AccountsResponse;
import mobi.appcent.helium.response.statechannel.StateChannelClosesResponse;
import okhttp3.Call;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by erenalpaslan on 3.12.2022
 */
public class StateChannelClosesRequest extends BaseRequest {
    private final HeliumSdkClient client;
    private String cursor;
    private String minTime;
    private String maxTime;
    private Integer limit;

    public StateChannelClosesRequest(HeliumSdkClient client) {
        this.client = client;
    }

    public StateChannelClosesRequest cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public StateChannelClosesRequest minTime(String minTime) {
        this.minTime = minTime;
        return this;
    }

    public StateChannelClosesRequest maxTime(String maxTime) {
        this.maxTime = maxTime;
        return this;
    }

    public StateChannelClosesRequest limit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public StateChannelClosesResponse execute() throws IOException {
        ArrayList<Pair> queryParams = new ArrayList<>();
        queryParams.add(Pair.create(FieldConstant.CURSOR, cursor));
        queryParams.add(Pair.create(FieldConstant.MIN_TIME, minTime));
        queryParams.add(Pair.create(FieldConstant.MAX_TIME, maxTime));
        queryParams.add(Pair.create(FieldConstant.LIMIT, limit));
        Call call = client.buildCall(UrlConstant.STATE_CHANNELS_PATH, HttpMethod.GET, queryParams, null, null);
        Type type = TypeToken.get(StateChannelClosesResponse.class).getType();
        return execute(call, type);
    }
}
