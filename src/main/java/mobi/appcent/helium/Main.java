package mobi.appcent.helium;

import mobi.appcent.helium.api.HeliumApi;
import mobi.appcent.helium.model.*;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            HeliumApi heliumApi = new HeliumApi();
            TokenSupplyResponse d = heliumApi.stats().getTokenSupply().execute();
            System.out.println(d.getData().tokenSupply);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    
}
