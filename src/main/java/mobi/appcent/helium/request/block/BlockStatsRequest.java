package mobi.appcent.helium.request.block;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.api.BlockApi;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.request.BaseRequest;
import mobi.appcent.helium.response.block.BlockStatsResponse;
import okhttp3.Call;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collections;

/**
 * Created by erenalpaslan on 4.12.2022
 */
public class BlockStatsRequest extends BaseRequest {
    private final HeliumSdkClient client;

    public BlockStatsRequest(HeliumSdkClient client) {
        this.client = client;
    }

    public BlockStatsResponse execute() throws IOException {
        String path = UrlConstant.BLOCKS_PATH + "/stats";
        Call call = client.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
        Type type = TypeToken.get(BlockStatsResponse.class).getType();
        return execute(call, type);
    }
}
