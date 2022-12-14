package mobi.appcent.helium.api;

import mobi.appcent.helium.request.location.LocationRequest;

/**
 * Created by erenalpaslan on 3.12.2022
 */
public class LocationsApi extends BaseApi implements ILocationsApi{

    public static LocationsApi getInstance() {
        return new LocationsApi();
    }

    @Override
    public LocationRequest getLocation(String location) {
        return new LocationRequest(sdkClient, location);
    }
}
