package mobi.appcent.helium;

import mobi.appcent.helium.api.HeliumApi;
import mobi.appcent.helium.model.*;

public class Main {

    public static void main(String[] args) {
        try {
            HeliumApi heliumApi = new HeliumApi();
            HotspotTotalRewardResponse resp = heliumApi.accounts()
                    .getRewardTotalsForAccount("13W1uxU6hgWpra3FQjUp8vvTimd3VgJrvLeGQh49TQfXFBCKjnC", "2020-08-27", "2020-08-28")
                    .bucket("day")
                    .execute();

            System.out.println(resp.getData().getSum());
            /*for (Role a: resp.getData()) {
                System.out.println(a.getRole());
            }*/
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
