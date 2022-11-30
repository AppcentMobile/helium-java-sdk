package mobi.appcent.helium.request.oracleprices;

import com.google.gson.reflect.TypeToken;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.request.BaseRequest;
import mobi.appcent.helium.response.oracle.OraclePriceResponse;
import okhttp3.Call;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collections;

/**
 * Created by erenalpaslan on 26.11.2022
 */
@AllArgsConstructor
@Getter
@Setter
public class OraclePriceAtSpecificBlockRequest extends BaseRequest {
    private final HeliumSdkClient client;
    private final String block;

    public OraclePriceResponse execute() throws IOException {
        String path = UrlConstant.ORACLE_PRICES_PATH + "/prices/" + block;
        Call call = client.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
        Type type = TypeToken.get(OraclePriceResponse.class).getType();
        return execute(call, type);
    }
}
