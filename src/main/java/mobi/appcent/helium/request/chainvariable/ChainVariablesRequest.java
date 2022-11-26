package mobi.appcent.helium.request.chainvariable;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.common.FieldConstant;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.model.Pair;
import mobi.appcent.helium.request.BaseRequest;
import mobi.appcent.helium.response.account.AccountsResponse;
import mobi.appcent.helium.response.chainvariable.ChainVariablesResponse;
import okhttp3.Call;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by erenalpaslan on 26.11.2022
 */
public class ChainVariablesRequest extends BaseRequest {
    private final HeliumSdkClient client;
    private String minTime;
    private String maxTime;
    private Integer limit;

    public ChainVariablesRequest(HeliumSdkClient client) {
        this.client = client;
    }

    public ChainVariablesRequest minTime(String minTime) {
        this.minTime = minTime;
        return this;
    }

    public ChainVariablesRequest maxTime(String maxTime) {
        this.maxTime = maxTime;
        return this;
    }

    public ChainVariablesRequest limit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public ChainVariablesResponse execute() throws IOException {
        ArrayList<Pair> queryParams = new ArrayList<>();
        queryParams.add(Pair.create(FieldConstant.MIN_TIME, minTime));
        queryParams.add(Pair.create(FieldConstant.MAX_TIME, maxTime));
        queryParams.add(Pair.create(FieldConstant.LIMIT, limit));
        Call call = client.buildCall(UrlConstant.CHAIN_VARIABLES_PATH, HttpMethod.GET, queryParams, null, null);
        Type type = TypeToken.get(ChainVariablesResponse.class).getType();
        return execute(call, type);
    }
}
