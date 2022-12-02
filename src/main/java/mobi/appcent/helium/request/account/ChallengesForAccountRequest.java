package mobi.appcent.helium.request.account;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.common.FieldConstant;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.model.Pair;
import mobi.appcent.helium.request.BaseRequest;
import mobi.appcent.helium.response.challenge.ChallengesResponse;
import okhttp3.Call;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by erenalpaslan on 21.11.2022
 */
public class ChallengesForAccountRequest extends BaseRequest {
    private final HeliumSdkClient client;
    private final String address;
    private String minTime;
    private String maxTime;
    private String limit;

    public ChallengesForAccountRequest(HeliumSdkClient client, String address) {
        this.client = client;
        this.address = address;
    }


    public ChallengesForAccountRequest minTime(String minTime) {
        this.minTime = minTime;
        return this;
    }

    public ChallengesForAccountRequest maxTime(String maxTime) {
        this.maxTime = maxTime;
        return this;
    }

    public ChallengesForAccountRequest limit(String limit) {
        this.limit = limit;
        return this;
    }

    public ChallengesResponse execute() throws IOException {
        String path = UrlConstant.ACCOUNTS_PATH + "/" + address + "/challenges";
        ArrayList<Pair> queryParams = new ArrayList<>();
        queryParams.add(Pair.create(FieldConstant.MIN_TIME, minTime));
        queryParams.add(Pair.create(FieldConstant.MAX_TIME, maxTime));
        queryParams.add(Pair.create(FieldConstant.LIMIT, limit));
        Call call = client.buildCall(path, HttpMethod.GET, queryParams, null, null);
        Type type = TypeToken.get(ChallengesResponse.class).getType();
        return execute(call, type);
    }

}
