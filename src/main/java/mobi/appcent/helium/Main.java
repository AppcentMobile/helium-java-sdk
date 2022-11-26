package mobi.appcent.helium;

import mobi.appcent.helium.api.HeliumApi;
import mobi.appcent.helium.model.*;
import mobi.appcent.helium.model.account.Account;
import mobi.appcent.helium.response.account.AccountsResponse;
import mobi.appcent.helium.response.city.CitiesResponse;

public class Main {

    public static void main(String[] args) {
        try {
            HeliumApi heliumApi = new HeliumApi();
            System.out.println(
                    heliumApi.rewards()
                            .getRewardTotals("-7%20day")
                            .execute()
                            .toString()
            );

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
