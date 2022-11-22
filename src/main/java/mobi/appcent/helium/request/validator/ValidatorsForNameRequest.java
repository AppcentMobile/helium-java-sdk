package mobi.appcent.helium.request.validator;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.api.ValidatorApi;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.model.ValidatorsResponse;
import mobi.appcent.helium.request.BaseRequest;
import okhttp3.Call;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collections;

/**
 * Created by erenalpaslan on 22.11.2022
 */
public class ValidatorsForNameRequest extends BaseRequest {
    private final HeliumSdkClient client;
    private final String name;

    public ValidatorsForNameRequest(HeliumSdkClient client, String name) {
        this.client = client;
        this.name = name;
    }

    public ValidatorsResponse execute() throws IOException {
        String path = UrlConstant.VALIDATORS_PATH + "/name/" + name;
        Call call = client.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
        Type type = TypeToken.get(ValidatorsResponse.class).getType();
        return execute(call, type);
    }
}
