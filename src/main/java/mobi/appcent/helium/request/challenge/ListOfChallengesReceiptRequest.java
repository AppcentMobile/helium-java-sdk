package mobi.appcent.helium.request.challenge;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.common.FieldConstant;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.model.Pair;
import mobi.appcent.helium.request.BaseRequest;
import mobi.appcent.helium.response.challenge.ChallengesResponse;
import okhttp3.Call;

import mobi.appcent.helium.exception.ApiException;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by erenalpaslan on 27.11.2022
 */
public class ListOfChallengesReceiptRequest extends BaseRequest {
    private final HeliumSdkClient client;
    private String cursor;
    private String minTime;
    private String maxTime;
    private Integer limit;

    public ListOfChallengesReceiptRequest(HeliumSdkClient client) {
        this.client = client;
    }

    public ListOfChallengesReceiptRequest cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public ListOfChallengesReceiptRequest minTime(String minTime) {
        this.minTime = minTime;
        return this;
    }

    public ListOfChallengesReceiptRequest maxTime(String maxTime) {
        this.maxTime = maxTime;
        return this;
    }

    public ListOfChallengesReceiptRequest limit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public ChallengesResponse execute() throws ApiException {
        ArrayList<Pair> queryParams = new ArrayList<>();
        queryParams.add(Pair.create(FieldConstant.CURSOR, cursor));
        queryParams.add(Pair.create(FieldConstant.MIN_TIME, minTime));
        queryParams.add(Pair.create(FieldConstant.MAX_TIME, maxTime));
        queryParams.add(Pair.create(FieldConstant.LIMIT, limit));
        Call call = client.buildCall(UrlConstant.CHALLENGES_PATH, HttpMethod.GET, queryParams, null, null);
        Type type = TypeToken.get(ChallengesResponse.class).getType();
        return execute(call, type);
    }
}
