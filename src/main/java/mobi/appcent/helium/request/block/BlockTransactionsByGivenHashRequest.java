package mobi.appcent.helium.request.block;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.api.BlockApi;
import mobi.appcent.helium.common.FieldConstant;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.model.Pair;
import mobi.appcent.helium.request.BaseRequest;
import mobi.appcent.helium.response.block.BlockTransactionsResponse;
import okhttp3.Call;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by erenalpaslan on 4.12.2022
 */
public class BlockTransactionsByGivenHashRequest extends BaseRequest {
    private final HeliumSdkClient client;
    private final String hash;
    private String cursor;

    public BlockTransactionsByGivenHashRequest(HeliumSdkClient client, String hash) {
        this.client = client;
        this.hash = hash;
    }

    public BlockTransactionsByGivenHashRequest cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public BlockTransactionsResponse execute() throws IOException {
        String path = UrlConstant.BLOCKS_PATH + "/hash/" + hash + "/transactions";
        ArrayList<Pair> queryParams = new ArrayList<>();
        queryParams.add(Pair.create(FieldConstant.CURSOR, cursor));
        Call call = client.buildCall(path, HttpMethod.GET, queryParams, null, null);
        Type type = TypeToken.get(BlockTransactionsResponse.class).getType();
        return execute(call, type);
    }
}
