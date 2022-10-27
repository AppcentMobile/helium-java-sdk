package mobi.appcent.helium;

import mobi.appcent.helium.api.HeliumApi;
import mobi.appcent.helium.model.ApiResponse;
import mobi.appcent.helium.model.Hotspot;
import mobi.appcent.helium.model.HotspotsResponse;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        HeliumApi apiClient = new HeliumApi();
        ApiResponse<HotspotsResponse> resp = apiClient.hotspots().getHotspots();

    }
    
}
