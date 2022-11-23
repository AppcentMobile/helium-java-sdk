package mobi.appcent.helium.request.validator;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.common.FieldConstant;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.model.Pair;
import mobi.appcent.helium.request.BaseRequest;
import mobi.appcent.helium.response.validator.ValidatorsResponse;
import okhttp3.Call;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by erenalpaslan on 22.11.2022
 */
public class ValidatorsRequest extends BaseRequest {
    private final HeliumSdkClient client;
    private String cursor;

    public ValidatorsRequest(HeliumSdkClient client) {
        this.client = client;
    }

    public ValidatorsRequest cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public ValidatorsResponse execute() throws IOException {
        ArrayList<Pair> queryParams = new ArrayList<>();
        queryParams.add(Pair.create(FieldConstant.CURSOR, cursor));
        Call call = client.buildCall(UrlConstant.VALIDATORS_PATH, HttpMethod.GET, queryParams, null, null);
        Type type = TypeToken.get(ValidatorsResponse.class).getType();
        return execute(call, type);
    }
}
