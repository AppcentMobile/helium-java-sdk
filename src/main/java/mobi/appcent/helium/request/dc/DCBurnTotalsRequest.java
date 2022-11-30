package mobi.appcent.helium.request.dc;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.common.FieldConstant;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.model.Pair;
import mobi.appcent.helium.request.BaseRequest;
import mobi.appcent.helium.response.account.AccountsResponse;
import mobi.appcent.helium.response.dc.DCBurnTotalResponse;
import mobi.appcent.helium.response.dc.DCBurnTotalsResponse;
import okhttp3.Call;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by erenalpaslan on 27.11.2022
 */
public class DCBurnTotalsRequest extends BaseRequest {
    private final HeliumSdkClient client;
    private final String minTime;
    private String maxTime;
    private String bucket;

    public DCBurnTotalsRequest(HeliumSdkClient client, String minTime) {
        this.client = client;
        this.minTime = minTime;
    }

    public DCBurnTotalsRequest maxTime(String maxTime) {
        this.maxTime = maxTime;
        return this;
    }

    public DCBurnTotalsRequest bucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    public DCBurnTotalsResponse execute() throws IOException {
        String path = UrlConstant.DC_BURNS_PATH + "/sum";
        ArrayList<Pair> queryParams = new ArrayList<>();
        queryParams.add(Pair.create(FieldConstant.MIN_TIME, minTime));
        queryParams.add(Pair.create(FieldConstant.MAX_TIME, maxTime));
        queryParams.add(Pair.create(FieldConstant.BUCKET, bucket));
        Call call = client.buildCall(path, HttpMethod.GET, queryParams, null, null);
        Type type = TypeToken.get(DCBurnTotalsResponse.class).getType();
        return execute(call, type);
    }
}
