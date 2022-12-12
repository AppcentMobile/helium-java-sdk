package mobi.appcent.helium.request.oracleprices;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.common.FieldConstant;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.model.Pair;
import mobi.appcent.helium.request.BaseRequest;
import mobi.appcent.helium.response.oracle.CurrentAndHistoricalOraclePricesResponse;
import okhttp3.Call;

import mobi.appcent.helium.exception.ApiException;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by erenalpaslan on 26.11.2022
 */
public class CurrentAndHistoricalOraclePricesRequest extends BaseRequest {
    private final HeliumSdkClient client;
    private Integer maxBlock;
    private String cursor;

    public CurrentAndHistoricalOraclePricesRequest(HeliumSdkClient client) {
        this.client = client;
    }

    public CurrentAndHistoricalOraclePricesRequest maxBlock(Integer maxBlock) {
        this.maxBlock = maxBlock;
        return this;
    }

    public CurrentAndHistoricalOraclePricesRequest cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public CurrentAndHistoricalOraclePricesResponse execute() throws ApiException {
        String path = UrlConstant.ORACLE_PRICES_PATH + "/prices";
        ArrayList<Pair> queryParams = new ArrayList<>();
        queryParams.add(Pair.create(FieldConstant.MAX_BLOCK, maxBlock));
        queryParams.add(Pair.create(FieldConstant.CURSOR, cursor));
        Call call = client.buildCall(path, HttpMethod.GET, queryParams, null, null);
        Type type = TypeToken.get(CurrentAndHistoricalOraclePricesResponse.class).getType();
        return execute(call, type);
    }
}
