package mobi.appcent.helium.request.account;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.common.FieldConstant;
import mobi.appcent.helium.common.UrlConstant;
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
public class RichestAccountsRequest extends BaseRequest {

    private final HeliumSdkClient client;
    private String limit;

    public RichestAccountsRequest(HeliumSdkClient client) {
        this.client = client;
    }

    public RichestAccountsRequest limit(String limit) {
        this.limit = limit;
        return this;
    }

    public AccountsResponse execute() throws ApiException {
        String path = UrlConstant.ACCOUNTS_PATH + "/rich";
        ArrayList<Pair> queryParams = new ArrayList<>();
        queryParams.add(Pair.create(FieldConstant.LIMIT, limit));
        Call call = client.buildCall(path, HttpMethod.GET, queryParams, null, null);
        Type type = TypeToken.get(AccountsResponse.class).getType();
        return execute(call, type);
    }

}
