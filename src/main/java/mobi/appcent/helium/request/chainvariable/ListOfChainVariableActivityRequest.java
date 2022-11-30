package mobi.appcent.helium.request.chainvariable;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.common.FieldConstant;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.model.Pair;
import mobi.appcent.helium.request.BaseRequest;
import mobi.appcent.helium.response.chainvariable.ChainVariablesResponse;
import mobi.appcent.helium.response.chainvariable.ListOfChainVariableActivityResponse;
import okhttp3.Call;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by erenalpaslan on 26.11.2022
 */
public class ListOfChainVariableActivityRequest extends BaseRequest {
    private final HeliumSdkClient client;
    private String cursor;

    public ListOfChainVariableActivityRequest(HeliumSdkClient client) {
        this.client = client;
    }

    public ListOfChainVariableActivityRequest cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public ListOfChainVariableActivityResponse execute() throws IOException {
        String path = UrlConstant.CHAIN_VARIABLES_PATH + "/activity";
        ArrayList<Pair> queryParams = new ArrayList<>();
        queryParams.add(Pair.create(FieldConstant.CURSOR, cursor));
        Call call = client.buildCall(path, HttpMethod.GET, queryParams, null, null);
        Type type = TypeToken.get(ListOfChainVariableActivityResponse.class).getType();
        return execute(call, type);
    }
}
