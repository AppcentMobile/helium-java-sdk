package mobi.appcent.helium.request.validator;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.api.ValidatorApi;
import mobi.appcent.helium.common.FieldConstant;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.model.Pair;
import mobi.appcent.helium.request.BaseRequest;
import mobi.appcent.helium.response.hotspot.HotspotRolesResponse;
import okhttp3.Call;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by erenalpaslan on 22.11.2022
 */
public class ValidatorRolesRequest extends BaseRequest {
    private final HeliumSdkClient client;
    private final String address;
    private String cursor;
    private String filterTypes;
    private String minTime;
    private String maxTime;
    private Integer limit;

    public ValidatorRolesRequest(HeliumSdkClient client, String address) {
        this.client = client;
        this.address = address;
    }

    public ValidatorRolesRequest cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public ValidatorRolesRequest filterTypes(String filterTypes) {
        this.filterTypes = filterTypes;
        return this;
    }

    public ValidatorRolesRequest minTime(String minTime) {
        this.minTime = minTime;
        return this;
    }

    public ValidatorRolesRequest maxTime(String maxTime) {
        this.maxTime = maxTime;
        return this;
    }

    public ValidatorRolesRequest limit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public HotspotRolesResponse execute() throws IOException {
        String path = UrlConstant.VALIDATORS_PATH + "/" + address + "/roles";
        ArrayList<Pair> queryParams = new ArrayList<>();
        queryParams.add(Pair.create(FieldConstant.CURSOR, cursor));
        queryParams.add(Pair.create(FieldConstant.FILTER_TYPES, filterTypes));
        queryParams.add(Pair.create(FieldConstant.MIN_TIME, minTime));
        queryParams.add(Pair.create(FieldConstant.MAX_TIME, maxTime));
        queryParams.add(Pair.create(FieldConstant.LIMIT, limit));
        Call call = client.buildCall(path, HttpMethod.GET, queryParams, null, null);
        Type type = TypeToken.get(HotspotRolesResponse.class).getType();
        return execute(call, type);
    }
}

