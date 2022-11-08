package mobi.appcent.helium;

import com.google.gson.Gson;
import mobi.appcent.helium.api.HeliumApi;
import mobi.appcent.helium.model.*;

public class Main {

    public static void main(String[] args) {
        Gson gson = new Gson();

        try {
            HeliumApi heliumApi = new HeliumApi();
            ValidatorsResponse resp = heliumApi.validators().searchValidatorsByName()
                    .search("jellyfish")
                    .execute();
            System.out.println(gson.toJson(resp));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
