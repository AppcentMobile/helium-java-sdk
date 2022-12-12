package mobi.appcent.helium;

import com.google.gson.Gson;
import mobi.appcent.helium.api.HeliumApi;
import mobi.appcent.helium.exception.ApiException;
import mobi.appcent.helium.model.*;
import mobi.appcent.helium.model.account.Account;
import mobi.appcent.helium.response.account.AccountsResponse;
import mobi.appcent.helium.response.city.CitiesResponse;
import mobi.appcent.helium.response.validator.ValidatorsResponse;

public class Main {

    public static void main(String[] args) {
        try {
            HeliumApi heliumApi = new HeliumApi();

            ValidatorsResponse resp = heliumApi.validators()
                    .getValidators()
                    .execute();
            System.out.println(resp.toString());
        } catch (ApiException e) {
            System.out.println(e);
        }

    }

}
