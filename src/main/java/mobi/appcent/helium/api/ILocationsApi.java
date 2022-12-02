package mobi.appcent.helium.api;

import mobi.appcent.helium.request.location.LocationRequest;

/**
 * Created by erenalpaslan on 3.12.2022
 */
public interface ILocationsApi {
    LocationRequest getLocation(String location);
}
