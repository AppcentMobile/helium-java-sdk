package mobi.appcent.helium.request.account;

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
 * Created by erenalpaslan on 21.11.2022
 */
public class ValidatorsForAccountRequest extends BaseRequest {
    private final HeliumSdkClient client;
    private final String address;
    private String cursor;

    public ValidatorsForAccountRequest(HeliumSdkClient client, String address) {
        this.client = client;
        this.address = address;
    }

    public ValidatorsForAccountRequest cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public ValidatorsResponse execute() throws IOException {
        String path = UrlConstant.ACCOUNTS_PATH + "/" + address + "/validators";
        ArrayList<Pair> queryParams = new ArrayList<>();
        queryParams.add(Pair.create(FieldConstant.CURSOR, cursor));
        Call call = client.buildCall(path, HttpMethod.GET, queryParams, null, null);
        Type type = TypeToken.get(ValidatorsResponse.class).getType();
        return execute(call, type);
    }
}
