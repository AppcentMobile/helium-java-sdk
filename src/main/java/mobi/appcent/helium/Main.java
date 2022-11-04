package mobi.appcent.helium;

import mobi.appcent.helium.api.HeliumApi;
import mobi.appcent.helium.model.HotspotResponse;

public class Main {

    public static void main(String[] args) {
        try {
            HeliumApi heliumApi = new HeliumApi();
            HotspotResponse resp = heliumApi.hotspots().searchHotspotsByLocationBox()
                    .nelat(0)
                    .nelon(0)
                    .swlat(4f)
                    .swlon(5f)
                    .execute();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
