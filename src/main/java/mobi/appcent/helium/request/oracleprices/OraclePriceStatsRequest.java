package mobi.appcent.helium.request.oracleprices;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.common.FieldConstant;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.model.Pair;
import mobi.appcent.helium.request.BaseRequest;
import mobi.appcent.helium.response.oracle.CurrentAndHistoricalOraclePricesResponse;
import mobi.appcent.helium.response.oracle.OraclePricesStatsResponse;
import okhttp3.Call;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by erenalpaslan on 26.11.2022
 */
public class OraclePriceStatsRequest extends BaseRequest {
    private final HeliumSdkClient client;
    private final String minTime;
    private String maxTime;

    public OraclePriceStatsRequest(HeliumSdkClient client, String minTime) {
        this.client = client;
        this.minTime = minTime;
    }

    public OraclePriceStatsRequest maxTime(String maxTime) {
        this.maxTime = maxTime;
        return this;
    }

    public OraclePricesStatsResponse execute() throws IOException {
        String path = UrlConstant.ORACLE_PRICES_PATH + "/prices/stats";
        ArrayList<Pair> queryParams = new ArrayList<>();
        queryParams.add(Pair.create(FieldConstant.MIN_TIME, minTime));
        queryParams.add(Pair.create(FieldConstant.MAX_TIME, maxTime));
        Call call = client.buildCall(path, HttpMethod.GET, queryParams, null, null);
        Type type = TypeToken.get(OraclePricesStatsResponse.class).getType();
        return execute(call, type);
    }
}
