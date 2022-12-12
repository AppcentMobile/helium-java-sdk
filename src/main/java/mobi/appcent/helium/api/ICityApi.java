package mobi.appcent.helium.api;

import mobi.appcent.helium.request.city.CitiesRequest;
import mobi.appcent.helium.request.city.CityByGivenCityIdRequest;
import mobi.appcent.helium.request.city.HotspotsByGivenCityIdRequest;
import org.jetbrains.annotations.NotNull;

import mobi.appcent.helium.exception.ApiException;

/**
 * Created by erenalpaslan on 28.10.2022
 */
public interface ICityApi {
    CitiesRequest getCities() throws ApiException;
    CityByGivenCityIdRequest getCityByGivenCityId(@NotNull String cityId) throws ApiException;
    HotspotsByGivenCityIdRequest getHotspotsByGivenCityId(@NotNull String cityId) throws ApiException;
}
