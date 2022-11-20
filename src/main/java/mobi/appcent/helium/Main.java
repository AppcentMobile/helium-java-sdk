package mobi.appcent.helium;

import mobi.appcent.helium.api.HeliumApi;
import mobi.appcent.helium.model.hotspot.Hotspot;
import mobi.appcent.helium.response.city.CitiesResponse;
import mobi.appcent.helium.response.hotspot.HotspotsResponse;
import mobi.appcent.helium.response.pendingTransaction.SubmitTransactionResponse;

public class Main {

    public static void main(String[] args) {
        try {
            HeliumApi heliumApi = new HeliumApi();
            SubmitTransactionResponse resp = heliumApi.pendingTransactions()
                    .submitNewTransaction("", "bUc6-LQXdR6zOBaR_8TPWlf3THCpb4wI6WPXJHJfnYw")
                    .execute();

            System.out.println(resp.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
