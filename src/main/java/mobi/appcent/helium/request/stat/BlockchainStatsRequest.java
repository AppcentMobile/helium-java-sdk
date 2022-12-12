package mobi.appcent.helium.request.stat;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.api.StatApi;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.request.BaseRequest;
import mobi.appcent.helium.response.block.BlockchainStatsResponse;
import okhttp3.Call;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collections;

/**
 * Created by erenalpaslan on 4.12.2022
 */
public class BlockchainStatsRequest extends BaseRequest {
    private final HeliumSdkClient client;

    public BlockchainStatsRequest(HeliumSdkClient client) {
        this.client = client;
    }

    public BlockchainStatsResponse execute() throws IOException {
        Call call = client.buildCall(UrlConstant.STAT_PATH, HttpMethod.GET, Collections.emptyList(), null, null);
        Type type = TypeToken.get(BlockchainStatsResponse.class).getType();
        return execute(call, type);
    }
}
