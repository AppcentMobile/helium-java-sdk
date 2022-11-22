package mobi.appcent.helium.request.validator;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.api.ValidatorApi;
import mobi.appcent.helium.common.FieldConstant;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.model.Pair;
import mobi.appcent.helium.model.ValidatorsResponse;
import mobi.appcent.helium.request.BaseRequest;
import okhttp3.Call;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by erenalpaslan on 22.11.2022
 */
public class SearchValidatorsByNameRequest extends BaseRequest {
    private final HeliumSdkClient client;
    private String search;

    public SearchValidatorsByNameRequest(HeliumSdkClient client) {
        this.client = client;
    }

    public SearchValidatorsByNameRequest search(String search) {
        this.search = search;
        return this;
    }

    public ValidatorsResponse execute() throws IOException {
        String path = UrlConstant.VALIDATORS_PATH + "/name";
        ArrayList<Pair> queryParams = new ArrayList<>();
        queryParams.add(Pair.create(FieldConstant.SEARCH, search));
        Call call = client.buildCall(path, HttpMethod.GET, queryParams, null, null);
        Type type = TypeToken.get(ValidatorsResponse.class).getType();
        return execute(call, type);
    }
}
