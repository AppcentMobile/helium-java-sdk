package mobi.appcent.helium.api;

import org.jetbrains.annotations.NotNull;

import mobi.appcent.helium.exception.ApiException;

/**
 * Created by erenalpaslan on 28.10.2022
 */
public interface ICityApi {
    public CityApi.APIgetCitiesRequest getCities() throws ApiException;
    public CityApi.APIgetCityByGivenCityIdRequest getCityByGivenCityId(@NotNull String cityId) throws ApiException;
    public CityApi.APIgetHotspotsByGivenCityIdRequest getHotspotsByGivenCityId(@NotNull String cityId) throws ApiException;
}
