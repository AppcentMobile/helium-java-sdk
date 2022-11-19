package mobi.appcent.helium;

import mobi.appcent.helium.api.HeliumApi;
import mobi.appcent.helium.model.hotspot.Hotspot;
import mobi.appcent.helium.response.city.CitiesResponse;
import mobi.appcent.helium.response.hotspot.HotspotsResponse;

public class Main {

    public static void main(String[] args) {
        try {
            HeliumApi heliumApi = new HeliumApi();
            CitiesResponse resp = heliumApi.cities().getCities()
                    .execute();

            System.out.println(resp.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
