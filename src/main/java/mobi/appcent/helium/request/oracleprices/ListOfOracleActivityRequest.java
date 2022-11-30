package mobi.appcent.helium.request.oracleprices;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.common.FieldConstant;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.model.Pair;
import mobi.appcent.helium.request.BaseRequest;
import mobi.appcent.helium.response.oracle.ListOfOracleActivityResponse;
import mobi.appcent.helium.response.oracle.OraclePriceResponse;
import okhttp3.Call;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by erenalpaslan on 26.11.2022
 */
public class ListOfOracleActivityRequest extends BaseRequest {
    private final HeliumSdkClient client;
    private String cursor;
    private String minTime;
    private String maxTime;
    private Integer limit;


    public ListOfOracleActivityRequest(HeliumSdkClient client) {
        this.client = client;
    }

    public ListOfOracleActivityRequest cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public ListOfOracleActivityRequest minTime(String minTime) {
        this.minTime = minTime;
        return this;
    }

    public ListOfOracleActivityRequest maxTime(String maxTime) {
        this.maxTime = maxTime;
        return this;
    }

    public ListOfOracleActivityRequest limit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public ListOfOracleActivityResponse execute() throws IOException {
        String path = UrlConstant.ORACLE_PRICES_PATH + "/activity";
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
