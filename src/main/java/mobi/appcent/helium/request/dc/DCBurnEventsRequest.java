package mobi.appcent.helium.request.dc;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.common.FieldConstant;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.model.Pair;
import mobi.appcent.helium.request.BaseRequest;
import mobi.appcent.helium.response.dc.DCBurnEventsResponse;
import mobi.appcent.helium.response.dc.DCBurnStatsResponse;
import okhttp3.Call;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by erenalpaslan on 27.11.2022
 */
public class DCBurnEventsRequest extends BaseRequest {
    private final HeliumSdkClient client;
    private String cursor;

    public DCBurnEventsRequest(HeliumSdkClient client) {
        this.client = client;
    }

    public DCBurnEventsRequest cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public DCBurnEventsResponse execute() throws IOException {
        ArrayList<Pair> queryParams = new ArrayList<>();
        queryParams.add(Pair.create(FieldConstant.CURSOR, cursor));
        Call call = client.buildCall(UrlConstant.DC_BURNS_PATH, HttpMethod.GET, queryParams, null, null);
        Type type = TypeToken.get(DCBurnEventsResponse.class).getType();
        return execute(call, type);
    }
}
