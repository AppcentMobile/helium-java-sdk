package mobi.appcent.helium.request.validator;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.response.validator.ValidatorResponse;
import mobi.appcent.helium.request.BaseRequest;
import okhttp3.Call;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collections;

/**
 * Created by erenalpaslan on 22.11.2022
 */
public class ValidatorForAddressRequest extends BaseRequest {
    private final HeliumSdkClient client;
    private final String address;

    public ValidatorForAddressRequest(HeliumSdkClient client, String address) {
        this.client = client;
        this.address = address;
    }

    public ValidatorResponse execute() throws IOException {
        String path = UrlConstant.VALIDATORS_PATH + "/" + address;
        Call call = client.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
        Type type = TypeToken.get(ValidatorResponse.class).getType();
        return execute(call, type);
    }
}
