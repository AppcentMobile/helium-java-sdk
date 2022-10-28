package mobi.appcent.helium;

import mobi.appcent.helium.api.HeliumApi;
import mobi.appcent.helium.model.*;

public class Main {

    public static void main(String[] args) {
        try {
            HeliumApi heliumApi = new HeliumApi();
            BlockDescriptionsResponse resp =  heliumApi.blocks().getBlockDescriptions().execute();
            BlockTransactionsResponse r = heliumApi.blocks().getBlockTransactionsByGivenHash(resp.getData().get(0).hash).execute();
            System.out.println(r.getData().get(0).challenger);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
