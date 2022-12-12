package mobi.appcent.helium.api;

import mobi.appcent.helium.request.challenge.ListOfChallengesReceiptRequest;

/**
 * Created by erenalpaslan on 27.11.2022
 */
public class ChallengesApi extends BaseApi implements IChallengesApi{

    public static ChallengesApi getInstance() {
        return new ChallengesApi();
    }

    @Override
    public ListOfChallengesReceiptRequest getListOfChallengesReceipt() {
        return new ListOfChallengesReceiptRequest(sdkClient);
    }
}
