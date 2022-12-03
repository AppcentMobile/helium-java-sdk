package mobi.appcent.helium.api;

import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.model.hotspot.Election;
import okhttp3.OkHttpClient;

/**
 * Created by erenalpaslan on 26.10.2022
 */
public class HeliumApi {
    private final HotspotApi hotspotApi = HotspotApi.getInstance();
    private final StatApi statApi = StatApi.getInstance();
    private final CityApi cityApi = CityApi.getInstance();
    private final BlockApi blockApi = BlockApi.getInstance();
    private final AccountApi accountApi = AccountApi.getInstance();
    private final RewardApi rewardApi = RewardApi.getInstance();
    private final OUIsApi ouisApi = OUIsApi.getInstance();
    private final ChainVariablesApi chainVariablesApi = ChainVariablesApi.getInstance();
    private final ValidatorApi validatorApi = ValidatorApi.getInstance();
    private final ChallengesApi challengesApi = ChallengesApi.getInstance();
    private final DCBurnsApi dcBurnsApi = DCBurnsApi.getInstance();
    private final OraclePricesApi oraclePricesApi = OraclePricesApi.getInstance();
    private final ElectionsApi electionsApi = ElectionsApi.getInstance();
    private final TransactionsApi transactionsApi = TransactionsApi.getInstance();
    private static final HeliumSdkClient sdkClient = new HeliumSdkClient();

    public HeliumApi() {
        initOkHttpClients(null);
    }

    public HeliumApi(OkHttpClient client) {
        initOkHttpClients(client);
    }

    private void initOkHttpClients(OkHttpClient client) {
        sdkClient.setOkHttpClient(client);
        hotspotApi.setSdkClient(sdkClient);
        statApi.setSdkClient(sdkClient);
        cityApi.setSdkClient(sdkClient);
        blockApi.setSdkClient(sdkClient);
        accountApi.setSdkClient(sdkClient);
        rewardApi.setSdkClient(sdkClient);
        ouisApi.setSdkClient(sdkClient);
        chainVariablesApi.setSdkClient(sdkClient);
        validatorApi.setSdkClient(sdkClient);
        challengesApi.setSdkClient(sdkClient);
        dcBurnsApi.setSdkClient(sdkClient);
        oraclePricesApi.setSdkClient(sdkClient);
        electionsApi.setSdkClient(sdkClient);
        transactionsApi.setSdkClient(sdkClient);
    }

    public HotspotApi hotspots() {
        return hotspotApi;
    }

    public StatApi stats() {
        return statApi;
    }

    public CityApi cities() {
        return cityApi;
    }

    public BlockApi blocks() { return blockApi; }

    public AccountApi accounts() { return accountApi; }

    public RewardApi rewards() { return rewardApi; }

    public OUIsApi ouis() { return ouisApi; }

    public ChainVariablesApi chainVariables() { return chainVariablesApi; }

    public ValidatorApi validators() {return validatorApi; }

    public ChallengesApi challenges() { return challengesApi; }

    public DCBurnsApi dcBurns() { return dcBurnsApi; }

    public OraclePricesApi oraclePrices() { return oraclePricesApi; }

    public ElectionsApi elections() { return electionsApi; }

    public TransactionsApi transactions() { return transactionsApi; }
}
