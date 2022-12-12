package mobi.appcent.helium;

import mobi.appcent.helium.api.HeliumApi;
import mobi.appcent.helium.exception.ApiException;
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
