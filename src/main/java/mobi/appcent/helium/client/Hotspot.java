package mobi.appcent.helium.client;

import mobi.appcent.helium.api.HotspotApi;

import java.io.IOException;
import java.util.List;

public class Hotspot {
    private final HotspotApi api;

    private Hotspot(HotspotApi api) {
        this.api = api;
    }

    public static Hotspot getInstance(HotspotApi api) throws IOException {
        return new Hotspot(api);
    }

    public List<mobi.appcent.helium.model.Hotspot> getHotspots() throws IOException {
        return api.getHotspots("","").execute().body().get();
    }
}
