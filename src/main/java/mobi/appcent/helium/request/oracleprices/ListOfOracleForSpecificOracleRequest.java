package mobi.appcent.helium.request.oracleprices;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.common.FieldConstant;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.model.Pair;
import mobi.appcent.helium.request.BaseRequest;
import mobi.appcent.helium.response.oracle.ListOfOracleActivityResponse;
import okhttp3.Call;

import mobi.appcent.helium.exception.ApiException;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by erenalpaslan on 26.11.2022
 */
public class ListOfOracleForSpecificOracleRequest extends BaseRequest {
    private final HeliumSdkClient client;
    private final String address;
    private String cursor;
    private String minTime;
    private String maxTime;
    private Integer limit;

    public ListOfOracleForSpecificOracleRequest(HeliumSdkClient client, String address) {
        this.client = client;
        this.address = address;
    }

    public ListOfOracleForSpecificOracleRequest cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public ListOfOracleForSpecificOracleRequest minTime(String minTime) {
        this.minTime = minTime;
        return this;
    }

    public ListOfOracleForSpecificOracleRequest maxTime(String maxTime) {
        this.maxTime = maxTime;
        return this;
    }

    public ListOfOracleForSpecificOracleRequest limit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public ListOfOracleActivityResponse execute() throws ApiException {
        String path = UrlConstant.ORACLE_PRICES_PATH + "/" + address +"/activity";
        ArrayList<Pair> queryParams = new ArrayList<>();
        queryParams.add(Pair.create(FieldConstant.CURSOR, cursor));
        queryParams.add(Pair.create(FieldConstant.MIN_TIME, minTime));
        queryParams.add(Pair.create(FieldConstant.MAX_TIME, maxTime));
        queryParams.add(Pair.create(FieldConstant.LIMIT, limit));
        Call call = client.buildCall(path, HttpMethod.GET, queryParams, null, null);
        Type type = TypeToken.get(ListOfOracleActivityResponse.class).getType();
        return execute(call, type);
    }
}
