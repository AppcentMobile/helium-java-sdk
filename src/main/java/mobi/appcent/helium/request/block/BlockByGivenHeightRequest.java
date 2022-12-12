package mobi.appcent.helium.request.block;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.request.BaseRequest;
import mobi.appcent.helium.response.block.BlockDescriptionResponse;
import okhttp3.Call;

import mobi.appcent.helium.exception.ApiException;
import java.lang.reflect.Type;
import java.util.Collections;

/**
 * Created by erenalpaslan on 4.12.2022
 */
public class BlockByGivenHeightRequest extends BaseRequest {
    private final HeliumSdkClient client;

    private final int height;

    public BlockByGivenHeightRequest(HeliumSdkClient client, int height) {
        this.client = client;
        this.height = height;
    }

    public BlockDescriptionResponse execute() throws ApiException {
        String path = UrlConstant.BLOCKS_PATH + "/" + height;
        Call call = client.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
        Type type = TypeToken.get(BlockDescriptionResponse.class).getType();
        return execute(call, type);
    }
}
