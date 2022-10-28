package mobi.appcent.helium.api;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

/**
 * Created by erenalpaslan on 28.10.2022
 */
public interface ICityApi {
    public CityApi.APIgetCitiesRequest getCities() throws IOException;
    public CityApi.APIgetCityByGivenCityIdRequest getCityByGivenCityId(@NotNull String cityId) throws IOException;
    public CityApi.APIgetHotspotsByGivenCityIdRequest getHotspotsByGivenCityId(@NotNull String cityId) throws IOException;
}
