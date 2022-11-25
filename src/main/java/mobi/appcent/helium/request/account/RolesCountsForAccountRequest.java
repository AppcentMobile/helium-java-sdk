package mobi.appcent.helium.request.account;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.api.AccountApi;
import mobi.appcent.helium.common.FieldConstant;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.model.Pair;
import mobi.appcent.helium.request.BaseRequest;
import mobi.appcent.helium.response.account.AccountRolesCountResponse;
import okhttp3.Call;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by erenalpaslan on 21.11.2022
 */
public class RolesCountsForAccountRequest extends BaseRequest {
    private final HeliumSdkClient client;
    private final String address;
    private String filterTypes;

    public RolesCountsForAccountRequest(HeliumSdkClient client, String address) {
        this.client = client;
        this.address = address;
    }

    public RolesCountsForAccountRequest filterTypes(String filterTypes) {
        this.filterTypes = filterTypes;
        return this;
    }

    public AccountRolesCountResponse execute() throws IOException {
        String path = UrlConstant.ACCOUNTS_PATH + "/" + address + "/roles/count";
        ArrayList<Pair> queryParams = new ArrayList<>();
        queryParams.add(Pair.create(FieldConstant.FILTER_TYPES, filterTypes));
        Call call = client.buildCall(path, HttpMethod.GET, queryParams, null, null);
        Type type = TypeToken.get(AccountRolesCountResponse.class).getType();
        return execute(call, type);
    }
}
