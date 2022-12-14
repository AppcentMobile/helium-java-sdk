package mobi.appcent.helium.request.reward;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.common.FieldConstant;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.model.Pair;
import mobi.appcent.helium.request.BaseRequest;
import mobi.appcent.helium.response.reward.RewardTotalsResponse;
import okhttp3.Call;

import mobi.appcent.helium.exception.ApiException;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by erenalpaslan on 26.11.2022
 */
public class RewardTotalsRequest extends BaseRequest {
    private final HeliumSdkClient client;
    private final String minTime;
    private String maxTime;
    private String bucket;

    public RewardTotalsRequest(HeliumSdkClient client, String minTime) {
        this.client = client;
        this.minTime = minTime;
    }

    public RewardTotalsRequest maxTime(String maxTime) {
        this.maxTime = maxTime;
        return this;
    }

    public RewardTotalsRequest bucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    public RewardTotalsResponse execute() throws ApiException {
        String path = UrlConstant.REWARDS_PATH + "/sum";
        ArrayList<Pair> queryParams = new ArrayList<>();
        queryParams.add(Pair.create(FieldConstant.MIN_TIME, minTime));
        queryParams.add(Pair.create(FieldConstant.MAX_TIME, maxTime));
        queryParams.add(Pair.create(FieldConstant.BUCKET, bucket));
        Call call = client.buildCall(path, HttpMethod.GET, queryParams, null, null);
        Type type = TypeToken.get(RewardTotalsResponse.class).getType();
        return execute(call, type);
    }
}
