package mobi.appcent.helium.api;

import com.github.jasminb.jsonapi.JSONAPIDocument;
import mobi.appcent.helium.model.Hotspot;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

public interface HotspotApi {
    @GET("hotspots")
    Call<JSONAPIDocument<List<Hotspot>>> getHotspots(@Query(value = "cursor") String cursor, @Query(value = "filter_modes") String filterModes);

    @GET("hotspots/{address}")
    Call<JSONAPIDocument<Hotspot>> getHotspot(@Path(value = "address") String address);

    @GET("hotspots/name/{name}")
    Call<JSONAPIDocument<List<Hotspot>>> getHotspotsByName(@Path(value = "name") String name);

    @GET("hotspots/name")
    Call<JSONAPIDocument<List<Hotspot>>> searchHotspotsByName(@Query(value = "search") String search);

    @GET("hotspots/location/distance")
    Call<JSONAPIDocument<List<Hotspot>>> getHotspotsByLocation(@Query(value = "lat") float lat, @Query(value = "lon") float lon, @Query(value = "distance") int distance);

    @GET("hotspots/location/box")
    Call<JSONAPIDocument<List<Hotspot>>> getHotspotsInSpecificAreas(@Query(value = "swlat") float swlat, @Query(value = "swlon") float swlon, @Query(value = "nelat") float nelat, @Query(value = "nelon") float nelon);

    @GET("hotspots/hex/{h3_index}")
    Call<JSONAPIDocument<List<Hotspot>>> getHotspotsByGivenH3Index(@Path(value = "h3_index") String h3Index);

    @GET("hotspots/{address}/roles")
    Call<JSONAPIDocument<List<Hotspot>>> getHotspotsRoles(@Path(value = "address") String address, @Query(value = "cursor") String cursor,
                                                         @Query(value = "filter_types") String filterTypes, @Query(value = "min_time") String minTime,
                                                         @Query(value = "max_time") String maxTime, @Query(value = "limit") int limit);
    @GET("hotspots/{address}/roles/count")
    Call<JSONAPIDocument<Hotspot>> getHotspotsRolesCount(@Path(value = "address") String address, @Query(value = "filter_types") String filterTypes);

    @GET("hotspots/{address}/elections")
    Call<JSONAPIDocument<List<Hotspot>>> getHotspotsElections(@Path(value = "address") String address, @Query(value = "cursor") String cursor,
                                                             @Query(value = "filter_types") String filterTypes, @Query(value = "min_time") String minTime,
                                                             @Query(value = "max_time") String maxTime, @Query(value = "limit") int limit);
    @GET("hotspots/elected")
    Call<JSONAPIDocument<List<Hotspot>>> getElectedHotspots();



}
