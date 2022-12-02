package mobi.appcent.helium.api;

import mobi.appcent.helium.request.dc.DCBurnEventsRequest;
import mobi.appcent.helium.request.dc.DCBurnStatsRequest;
import mobi.appcent.helium.request.dc.DCBurnTotalsRequest;

/**
 * Created by erenalpaslan on 27.11.2022
 */
public interface IDCBurnsApi {
    DCBurnTotalsRequest getDCBurnTotals(String minTime);
    DCBurnStatsRequest getDCBurnStats();
    DCBurnEventsRequest getDCBurnEvents();
}
