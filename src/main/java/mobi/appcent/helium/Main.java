package mobi.appcent.helium;

import mobi.appcent.helium.api.HeliumApi;
import mobi.appcent.helium.model.*;
import mobi.appcent.helium.model.account.Account;
import mobi.appcent.helium.response.account.AccountsResponse;
import mobi.appcent.helium.response.city.CitiesResponse;
import mobi.appcent.helium.response.hotspot.HotspotsResponse;
import mobi.appcent.helium.response.pendingTransaction.SubmitTransactionResponse;


public class Main {

    public static void main(String[] args) {
        try {
            HeliumApi heliumApi = new HeliumApi();
            System.out.println(
                    heliumApi.pendingTransactions()
                            .getPendingTransactionsStatus("14jXMm32j612aYGBsSRxMW9DV5oxWtJUKPnZFxqZA22jW7kRBE4")
                            .execute()
                            .toString()
            );
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
