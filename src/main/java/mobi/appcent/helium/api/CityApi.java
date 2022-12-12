package mobi.appcent.helium.api;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.exception.ApiException;
import mobi.appcent.helium.httpClient.HttpMethod;
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
    public APIgetCitiesRequest getCities() throws ApiException {
        return new APIgetCitiesRequest();
    }

    public class APIgetCitiesRequest {
        private String search;
        private String cursor;

        public APIgetCitiesRequest() {}

        public APIgetCitiesRequest search(String search) {
            this.search = search;
            return this;
        }

        public APIgetCitiesRequest cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public CitiesResponse execute() throws ApiException {
            ArrayList<Pair> queryParams = new ArrayList<>();
            queryParams.add(Pair.create("search", search));
            queryParams.add(Pair.create("cursor", cursor));
            Call call = sdkClient.buildCall(path(), HttpMethod.GET, queryParams, null, null);
            Type type = TypeToken.get(CitiesResponse.class).getType();
            return CityApi.this.execute(call, type);
        }
    }

    @Override
    public APIgetCityByGivenCityIdRequest getCityByGivenCityId(@NotNull String cityId) throws ApiException {
        return new APIgetCityByGivenCityIdRequest(cityId);
    }

    public class APIgetCityByGivenCityIdRequest {

        private final String cityId;

        public APIgetCityByGivenCityIdRequest(String id) {
            this.cityId = id;
        }

        public CityResponse execute() throws ApiException {
            String path = path()+"/"+cityId;
            Call call = sdkClient.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
            Type type = TypeToken.get(CityResponse.class).getType();
            return CityApi.this.execute(call, type);
        }
    }

    @Override
    public APIgetHotspotsByGivenCityIdRequest getHotspotsByGivenCityId(@NotNull String cityId) throws ApiException {
        return new APIgetHotspotsByGivenCityIdRequest(cityId);
    }

    public class APIgetHotspotsByGivenCityIdRequest {

        private final String cityId;

        public APIgetHotspotsByGivenCityIdRequest(String id) {
            this.cityId = id;
        }

        public HotspotsResponse execute() throws ApiException {
            String path = path()+"/"+cityId+"/hotspots";
            Call call = sdkClient.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
            Type type = TypeToken.get(HotspotsResponse.class).getType();
            return CityApi.this.execute(call, type);
        }
    }
}
