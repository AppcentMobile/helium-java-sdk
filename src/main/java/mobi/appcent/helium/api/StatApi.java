package mobi.appcent.helium.api;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.model.BlockchainStatsResponse;
import mobi.appcent.helium.model.Pair;
import mobi.appcent.helium.model.TokenSupplyResponse;
import okhttp3.Call;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by erenalpaslan on 28.10.2022
 */
public class StatApi extends BaseApi implements IStatApi {

    public static StatApi getInstance() {
        return new StatApi();
    }

    @Override
    String path() {
        return BASE_URL + "/stats";
    }

    @Override
    public APIgetBlockchainStatsRequest getBlockchainStats() throws IOException {
        return new APIgetBlockchainStatsRequest();
    }

    public class APIgetBlockchainStatsRequest {

        public APIgetBlockchainStatsRequest() {}

        public BlockchainStatsResponse execute() throws IOException {
            Call call = sdkClient.buildCall(path(), HttpMethod.GET, Collections.emptyList(), null, null);
            Type type = TypeToken.get(BlockchainStatsResponse.class).getType();
            return StatApi.this.execute(call, type);
        }
    }

    @Override
    public APIgetTokenSupplyRequest getTokenSupply() throws IOException {
        return new APIgetTokenSupplyRequest();
    }

    public class APIgetTokenSupplyRequest {

        private String format;

        public APIgetTokenSupplyRequest() {}

        public APIgetTokenSupplyRequest format(String format) {
            this.format = format;
            return this;
        }

        public TokenSupplyResponse execute() throws IOException {
            String path = path() + "/token_supply";
            ArrayList<Pair> queryParams = new ArrayList<>();
            queryParams.add(Pair.create("format", format));
            Call call = sdkClient.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
            Type type = TypeToken.get(TokenSupplyResponse.class).getType();
            return StatApi.this.execute(call, type);
        }
    }
}
