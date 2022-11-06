package mobi.appcent.helium;

import mobi.appcent.helium.api.HeliumApi;
import mobi.appcent.helium.model.*;

public class Main {

    public static void main(String[] args) {
        try {
            HeliumApi heliumApi = new HeliumApi();
            HotspotRewardResponse resp = heliumApi.accounts()
                    .getRewardsForAccount("13W1uxU6hgWpra3FQjUp8vvTimd3VgJrvLeGQh49TQfXFBCKjnC")
                    .minTime("2020-08-27")
                    .maxTime("2020-08-28")
                    .execute();

            System.out.println(resp.getData().get(0).amount);
            /*for (Role a: resp.getData()) {
                System.out.println(a.getRole());
            }*/
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
