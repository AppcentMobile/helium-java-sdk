package mobi.appcent.helium.api;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.exception.ApiException;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.request.city.CitiesRequest;
import mobi.appcent.helium.request.city.CityByGivenCityIdRequest;
import mobi.appcent.helium.request.city.HotspotsByGivenCityIdRequest;
import mobi.appcent.helium.response.city.CitiesResponse;
import mobi.appcent.helium.response.city.CityResponse;
import mobi.appcent.helium.response.hotspot.HotspotsResponse;
import mobi.appcent.helium.model.Pair;
import okhttp3.Call;
import org.jetbrains.annotations.NotNull;

import mobi.appcent.helium.exception.ApiException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by erenalpaslan on 28.10.2022
 */
public class CityApi extends BaseApi implements ICityApi{

    public static CityApi getInstance() {
        return new CityApi();
    }

    @Override
    String path() {
        return BASE_URL + "/cities";
    }

    @Override
    public CitiesRequest getCities(){
        return new CitiesRequest(sdkClient);
    }

    @Override
    public CityByGivenCityIdRequest getCityByGivenCityId(@NotNull String cityId){
        return new CityByGivenCityIdRequest(sdkClient, cityId);
    }

    @Override
    public HotspotsByGivenCityIdRequest getHotspotsByGivenCityId(@NotNull String cityId){
        return new HotspotsByGivenCityIdRequest(sdkClient, cityId);
    }
}
