package mobi.appcent.helium.api;

import mobi.appcent.helium.HeliumSdkClient;
import mobi.appcent.helium.api.HotspotApi;
import okhttp3.OkHttpClient;

/**
 * Created by erenalpaslan on 26.10.2022
 */
public class HeliumApi {
    private final HotspotApi hotspotApi = HotspotApi.getInstance();
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
    }

    public HotspotApi hotspots() {
        return hotspotApi;
    }
}
