package mobi.appcent.helium;

import mobi.appcent.helium.api.HeliumApi;


public class Main {

    public static void main(String[] args) {
        try {
            HeliumApi heliumApi = new HeliumApi();
            System.out.println(
                    heliumApi.assertLocations()
                            .getListOfAssertLocations()
                            .execute()
                            .toString()
            );
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
