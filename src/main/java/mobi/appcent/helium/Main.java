package mobi.appcent.helium;

import mobi.appcent.helium.api.HeliumApi;
import mobi.appcent.helium.model.*;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            HeliumApi heliumApi = new HeliumApi();
            HotspotsResponse resp = heliumApi.hotspots().getHotspots(null, null);
            String address = resp.getData().get(0).getAddress();
            HotspotTotalRewardResponse hotspot = heliumApi.hotspots().getTotalRewardForHotspot(address, null, null, null);
            System.out.println(hotspot.getData().getSum());
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    
}
