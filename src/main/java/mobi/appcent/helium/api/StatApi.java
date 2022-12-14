package mobi.appcent.helium.api;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.exception.ApiException;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.request.stat.BlockchainStatsRequest;
import mobi.appcent.helium.request.stat.TokenSupplyRequest;
import mobi.appcent.helium.response.block.BlockchainStatsResponse;
import mobi.appcent.helium.model.Pair;
import mobi.appcent.helium.response.stat.TokenSupplyResponse;
import okhttp3.Call;

import mobi.appcent.helium.exception.ApiException;
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
    public BlockchainStatsRequest getBlockchainStats() {
        return new BlockchainStatsRequest(sdkClient);
    }

    @Override
    public TokenSupplyRequest getTokenSupply() {
        return new TokenSupplyRequest(sdkClient);
    }
}
