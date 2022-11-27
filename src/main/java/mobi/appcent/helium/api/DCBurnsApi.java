package mobi.appcent.helium.api;

import mobi.appcent.helium.request.dc.DCBurnEventsRequest;
import mobi.appcent.helium.request.dc.DCBurnStatsRequest;
import mobi.appcent.helium.request.dc.DCBurnTotalsRequest;

/**
 * Created by erenalpaslan on 27.11.2022
 */
public class DCBurnsApi extends BaseApi implements IDCBurnsApi{

    @Override
    String path() {
        return null;
    }

    public static DCBurnsApi getInstance() {
        return new DCBurnsApi();
    }

    @Override
    public DCBurnTotalsRequest getDCBurnTotals(String minTime) {
        return new DCBurnTotalsRequest(sdkClient, minTime);
    }

    @Override
    public DCBurnStatsRequest getDCBurnStats() {
        return new DCBurnStatsRequest(sdkClient);
    }

    @Override
    public DCBurnEventsRequest getDCBurnEvents() {
        return new DCBurnEventsRequest(sdkClient);
    }
}
