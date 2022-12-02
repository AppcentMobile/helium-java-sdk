package mobi.appcent.helium;

import mobi.appcent.helium.api.HeliumApi;


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
