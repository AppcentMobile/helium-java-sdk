package mobi.appcent.helium.request.account;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.common.FieldConstant;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.exception.ApiException;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.model.Pair;
import mobi.appcent.helium.request.BaseRequest;
import mobi.appcent.helium.response.account.AccountsResponse;
import okhttp3.Call;

import mobi.appcent.helium.exception.ApiException;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by erenalpaslan on 21.11.2022
 */
public class AccountsRequest extends BaseRequest {
    private final HeliumSdkClient client;
    private String cursor;

    public AccountsRequest(HeliumSdkClient client) {
        this.client = client;
    }

    public AccountsRequest cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public AccountsResponse execute() throws ApiException {
        ArrayList<Pair> queryParams = new ArrayList<>();
        queryParams.add(Pair.create(FieldConstant.CURSOR, cursor));
        Call call = client.buildCall(UrlConstant.ACCOUNTS_PATH, HttpMethod.GET, queryParams, null, null);
        Type type = TypeToken.get(AccountsResponse.class).getType();
        return execute(call, type);
    }
}