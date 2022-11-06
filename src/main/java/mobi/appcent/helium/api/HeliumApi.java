package mobi.appcent.helium.api;

import mobi.appcent.helium.HeliumSdkClient;
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
}
