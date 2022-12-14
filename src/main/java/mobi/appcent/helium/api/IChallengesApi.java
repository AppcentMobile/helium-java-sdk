package mobi.appcent.helium.api;

import mobi.appcent.helium.exception.ApiException;
import mobi.appcent.helium.request.challenge.ListOfChallengesReceiptRequest;

/**
 * Created by erenalpaslan on 27.11.2022
 */
public interface IChallengesApi {
    ListOfChallengesReceiptRequest getListOfChallengesReceipt() throws ApiException;
}
