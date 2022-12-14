package mobi.appcent.helium.request.account;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.common.FieldConstant;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.model.Pair;
import mobi.appcent.helium.request.BaseRequest;
import mobi.appcent.helium.response.account.AccountTotalRewardsResponse;
import okhttp3.Call;

import mobi.appcent.helium.exception.ApiException;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by erenalpaslan on 21.11.2022
 */
public class RewardTotalsForAccountRequest extends BaseRequest {
    private final HeliumSdkClient client;
    private final String address;
    private final String minTime;
    private String maxTime;
    private String bucket;

    public RewardTotalsForAccountRequest(HeliumSdkClient client, String address, String minTime) {
        this.client = client;
        this.address = address;
        this.minTime = minTime;
    }

    public RewardTotalsForAccountRequest bucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    public RewardTotalsForAccountRequest maxTime(String maxTime) {
        this.maxTime = maxTime;
        return this;
    }

    public AccountTotalRewardsResponse execute() throws ApiException {
        String path = UrlConstant.ACCOUNTS_PATH + "/" + address + "/rewards/sum";
        ArrayList<Pair> queryParams = new ArrayList<>();
        queryParams.add(Pair.create(FieldConstant.BUCKET, bucket));
        queryParams.add(Pair.create(FieldConstant.MAX_TIME, maxTime));
        queryParams.add(Pair.create(FieldConstant.MIN_TIME, minTime));
        Call call = client.buildCall(path, HttpMethod.GET, queryParams, null, null);
        Type type = TypeToken.get(AccountTotalRewardsResponse.class).getType();
        return execute(call, type);
    }
}
