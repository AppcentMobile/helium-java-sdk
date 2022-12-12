package mobi.appcent.helium.request.block;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.api.BlockApi;
import mobi.appcent.helium.common.FieldConstant;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.model.Pair;
import mobi.appcent.helium.request.BaseRequest;
import mobi.appcent.helium.response.block.BlockHeightResponse;
import okhttp3.Call;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by erenalpaslan on 4.12.2022
 */
public class HeightRequest extends BaseRequest {
    private final HeliumSdkClient client;
    private String maxTime;

    public HeightRequest(HeliumSdkClient client) {
        this.client = client;
    }

    public HeightRequest maxTime(String maxTime) {
        this.maxTime = maxTime;
        return this;
    }

    public BlockHeightResponse execute() throws IOException {
        String path = UrlConstant.BLOCKS_PATH + "/height";
        ArrayList<Pair> queryParams = new ArrayList<>();
        queryParams.add(Pair.create(FieldConstant.MAX_TIME, maxTime));
        Call call = client.buildCall(path, HttpMethod.GET, queryParams, null, null);
        Type type = TypeToken.get(BlockHeightResponse.class).getType();
        return execute(call, type);
    }
}
