package mobi.appcent.helium;

import mobi.appcent.helium.api.HeliumApi;
import mobi.appcent.helium.model.*;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            HeliumApi heliumApi = new HeliumApi();
            HotspotsResponse resp = heliumApi.hotspots().getHotspots()
                    .execute();
            String address = resp.getData().get(0).getAddress();
            HotspotChallangesResponse r = heliumApi.hotspots().getHotspotChallanges(address).limit(2).execute();
            System.out.println(r.getData().size());
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    
}
