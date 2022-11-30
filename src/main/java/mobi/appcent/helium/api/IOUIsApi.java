package mobi.appcent.helium.api;

import mobi.appcent.helium.request.oui.LastAssignedOUIRequest;
import mobi.appcent.helium.request.oui.ListOfOUIsRequest;
import mobi.appcent.helium.request.oui.OUIRequest;
import mobi.appcent.helium.request.oui.OUIStatsRequest;

/**
 * Created by erenalpaslan on 26.11.2022
 */
public interface IOUIsApi {
    ListOfOUIsRequest getListOfOUIs();
    OUIRequest getAnOUI(String oui);
    LastAssignedOUIRequest getLastAssignedOUI();
    OUIStatsRequest getOUIStats();
}
