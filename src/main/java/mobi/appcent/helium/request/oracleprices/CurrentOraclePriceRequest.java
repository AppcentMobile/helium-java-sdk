package mobi.appcent.helium.request.oracleprices;

import com.google.gson.reflect.TypeToken;
import lombok.AllArgsConstructor;
import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.common.UrlConstant;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.request.BaseRequest;
import mobi.appcent.helium.response.oracle.OraclePriceResponse;
import okhttp3.Call;

import mobi.appcent.helium.exception.ApiException;
import java.lang.reflect.Type;
import java.util.Collections;

/**
 * Created by erenalpaslan on 26.11.2022
 */
@AllArgsConstructor
public class CurrentOraclePriceRequest extends BaseRequest {
    private final HeliumSdkClient client;

    public OraclePriceResponse execute() throws ApiException {
        String path = UrlConstant.ORACLE_PRICES_PATH + "/prices/current";
        Call call = client.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
        Type type = TypeToken.get(OraclePriceResponse.class).getType();
        return execute(call, type);
    }
}
