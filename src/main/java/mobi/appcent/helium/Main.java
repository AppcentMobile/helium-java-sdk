package mobi.appcent.helium;

import com.google.gson.Gson;
import mobi.appcent.helium.api.HeliumApi;
import mobi.appcent.helium.model.*;
import mobi.appcent.helium.model.account.Account;
import mobi.appcent.helium.response.account.AccountsResponse;
import mobi.appcent.helium.response.city.CitiesResponse;

public class Main {

    public static void main(String[] args) {
        Gson gson = new Gson();

        try {
            HeliumApi heliumApi = new HeliumApi();

            System.out.println(
                    heliumApi.validators()
                            .getValidators()
                            .execute()
                            .toString()
            );

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
