package mobi.appcent.helium.api;

import mobi.appcent.helium.request.city.CitiesRequest;
import mobi.appcent.helium.request.city.CityByGivenCityIdRequest;
import mobi.appcent.helium.request.city.HotspotsByGivenCityIdRequest;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

/**
 * Created by erenalpaslan on 28.10.2022
 */
public interface ICityApi {
    CitiesRequest getCities() throws IOException;
    CityByGivenCityIdRequest getCityByGivenCityId(@NotNull String cityId) throws IOException;
    HotspotsByGivenCityIdRequest getHotspotsByGivenCityId(@NotNull String cityId) throws IOException;
}
