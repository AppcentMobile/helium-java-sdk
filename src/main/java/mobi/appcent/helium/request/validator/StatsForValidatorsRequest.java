package mobi.appcent.helium.request.validator;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.response.validator.ValidatorsStatsResponse;
import mobi.appcent.helium.request.BaseRequest;
import okhttp3.Call;

import mobi.appcent.helium.exception.ApiException;
import java.lang.reflect.Type;
import java.util.Collections;

/**
 * Created by erenalpaslan on 22.11.2022
 */
public class StatsForValidatorsRequest extends BaseRequest {
    private final HeliumSdkClient client;

    public StatsForValidatorsRequest(HeliumSdkClient client) {
        this.client = client;
    }

    public ValidatorsStatsResponse execute() throws ApiException {
        String path = UrlConstant.VALIDATORS_PATH + "/stats";
        Call call = client.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
        Type type = TypeToken.get(ValidatorsStatsResponse.class).getType();
        return execute(call, type);
    }

}
