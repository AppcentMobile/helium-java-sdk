package mobi.appcent.helium.request.validator;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.api.ValidatorApi;
import mobi.appcent.helium.common.FieldConstant;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.model.AccountRolesCountResponse;
import mobi.appcent.helium.model.Pair;
import mobi.appcent.helium.request.BaseRequest;
import okhttp3.Call;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by erenalpaslan on 22.11.2022
 */
public class ValidatorRolesCountsRequest extends BaseRequest {
    private final HeliumSdkClient client;
    private final String address;
    private String filterTypes;

    public ValidatorRolesCountsRequest(HeliumSdkClient client, String address) {
        this.client = client;
        this.address = address;
    }

    public ValidatorRolesCountsRequest filterTypes(String filterTypes) {
        this.filterTypes = filterTypes;
        return this;
    }

    public AccountRolesCountResponse execute() throws IOException {
        String path = UrlConstant.VALIDATORS_PATH + address + "/roles/count";
        ArrayList<Pair> queryParams = new ArrayList<>();
        queryParams.add(Pair.create(FieldConstant.FILTER_TYPES, filterTypes));
        Call call = client.buildCall(path, HttpMethod.GET, queryParams, null, null);
        Type type = TypeToken.get(AccountRolesCountResponse.class).getType();
        return execute(call, type);
    }
}
