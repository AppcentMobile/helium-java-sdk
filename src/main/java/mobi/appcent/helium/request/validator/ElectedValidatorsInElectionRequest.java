package mobi.appcent.helium.request.validator;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.request.BaseRequest;
import mobi.appcent.helium.response.validator.ValidatorsResponse;
import okhttp3.Call;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collections;

/**
 * Created by erenalpaslan on 22.11.2022
 */
public class ElectedValidatorsInElectionRequest extends BaseRequest {
    private final HeliumSdkClient client;
    private final Integer hash;

    public ElectedValidatorsInElectionRequest(HeliumSdkClient client, Integer hash) {
        this.client = client;
        this.hash = hash;
    }

    public ValidatorsResponse execute() throws IOException {
        String path = UrlConstant.VALIDATORS_PATH + "/elected/hash/" + hash;
        Call call = client.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
        Type type = TypeToken.get(ValidatorsResponse.class).getType();
        return execute(call, type);
    }
}