package mobi.appcent.helium.request.block;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.common.FieldConstant;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.model.Pair;
import mobi.appcent.helium.request.BaseRequest;
import mobi.appcent.helium.response.block.BlockTransactionsResponse;
import okhttp3.Call;

import mobi.appcent.helium.exception.ApiException;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by erenalpaslan on 4.12.2022
 */
public class BlockTransactionsByGivenHeightRequest extends BaseRequest {
    private final HeliumSdkClient client;
    private final int height;
    private String cursor;

    public BlockTransactionsByGivenHeightRequest(HeliumSdkClient client, int height) {
        this.client = client;
        this.height = height;
    }

    public BlockTransactionsByGivenHeightRequest cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public BlockTransactionsResponse execute() throws ApiException {
        String path = UrlConstant.BLOCKS_PATH + "/" + height + "/transactions";
        ArrayList<Pair> queryParams = new ArrayList<>();
        queryParams.add(Pair.create(FieldConstant.CURSOR, cursor));
        Call call = client.buildCall(path, HttpMethod.GET, queryParams, null, null);
        Type type = TypeToken.get(BlockTransactionsResponse.class).getType();
        return execute(call, type);
    }
}
