package mobi.appcent.helium.api;

import mobi.appcent.helium.request.oui.LastAssignedOUIRequest;
import mobi.appcent.helium.request.oui.ListOfOUIsRequest;
import mobi.appcent.helium.request.oui.OUIRequest;
import mobi.appcent.helium.request.oui.OUIStatsRequest;

/**
 * Created by erenalpaslan on 26.11.2022
 */
public class OUIsApi extends BaseApi implements IOUIsApi{

    public static OUIsApi getInstance() {
        return new OUIsApi();
    }

    @Override
    public ListOfOUIsRequest getListOfOUIs() {
        return new ListOfOUIsRequest(sdkClient);
    }

    @Override
    public OUIRequest getAnOUI(String oui) {
        return new OUIRequest(sdkClient, oui);
    }

    @Override
    public LastAssignedOUIRequest getLastAssignedOUI() {
        return new LastAssignedOUIRequest(sdkClient);
    }

    @Override
    public OUIStatsRequest getOUIStats() {
        return new OUIStatsRequest(sdkClient);
    }
}
