package mobi.appcent.helium.request.city;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.api.CityApi;
import mobi.appcent.helium.common.FieldConstant;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.exception.ApiException;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.model.Pair;
import mobi.appcent.helium.request.BaseRequest;
import mobi.appcent.helium.response.city.CitiesResponse;
import okhttp3.Call;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by erenalpaslan on 4.12.2022
 */
public class CitiesRequest extends BaseRequest {
    private final HeliumSdkClient client;
    private String search;
    private String cursor;

    public CitiesRequest(HeliumSdkClient client) {
        this.client = client;
    }

    public CitiesRequest search(String search) {
        this.search = search;
        return this;
    }

    public CitiesRequest cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public CitiesResponse execute() throws ApiException {
        ArrayList<Pair> queryParams = new ArrayList<>();
        queryParams.add(Pair.create(FieldConstant.SEARCH, search));
        queryParams.add(Pair.create(FieldConstant.CURSOR, cursor));
        Call call = client.buildCall(UrlConstant.CITY_PATH, HttpMethod.GET, queryParams, null, null);
        Type type = TypeToken.get(CitiesResponse.class).getType();
        return execute(call, type);
    }
}
