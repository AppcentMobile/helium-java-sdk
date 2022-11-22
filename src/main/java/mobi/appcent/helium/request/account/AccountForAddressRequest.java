package mobi.appcent.helium.request.account;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.api.AccountApi;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.request.BaseRequest;
import mobi.appcent.helium.response.account.AccountResponse;
import okhttp3.Call;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collections;

/**
 * Created by erenalpaslan on 21.11.2022
 */
public class AccountForAddressRequest extends BaseRequest {
    private final HeliumSdkClient client;
    private final String address;

    public AccountForAddressRequest(HeliumSdkClient client, String address) {
        this.client = client;
        this.address = address;
    }

    public AccountResponse execute() throws IOException {
        String path = UrlConstant.ACCOUNTS_PATH + "/" + address;
        Call call = client.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
        Type type = TypeToken.get(AccountResponse.class).getType();
        return execute(call, type);
    }
}