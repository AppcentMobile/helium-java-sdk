package mobi.appcent.helium.api;

import com.google.gson.reflect.TypeToken;
import javafx.util.Pair;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.model.*;
import okhttp3.Call;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;

public class HotspotApi extends BaseApi implements IHotspotApi {

    private HotspotApi() {
    }

    public static HotspotApi getInstance() {
        return new HotspotApi();
    }

    @Override
    String path() {
        return BASE_URL + "/hotspots";
    }

    @Override
    public HotspotsResponse getHotspots(@Nullable  String cursor, @Nullable String filterModes) throws IOException {
        ArrayList<Pair> queryParams = new ArrayList<>();
        queryParams.add(new Pair("cursor", cursor));
        queryParams.add(new Pair("filter_modes", filterModes));
        Call call = sdkClient.buildCall(path(), HttpMethod.GET, queryParams, null, null);
        Type type = TypeToken.get(HotspotsResponse.class).getType();
        return execute(call, type);
    }

    @Override
    public HotspotResponse getHotspotByGivenAdress(@Nullable String address) throws IOException {
        String path = path()+"/"+address;
        Call call = sdkClient.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
        Type type = TypeToken.get(HotspotResponse.class).getType();
        return execute(call, type);
    }

    @Override
    public HotspotsResponse getHotspotsByGivenName(@Nullable String name) throws IOException {
        String path = path()+"/name/"+name;
        Call call = sdkClient.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
        Type type = TypeToken.get(HotspotResponse.class).getType();
        return execute(call, type);
    }

    @Override
    public HotspotsResponse searchHotspotsByGivenName(@Nullable String name) throws IOException {
        String path = path()+"/name";
        ArrayList<Pair> queryParams = new ArrayList<>();
        queryParams.add(new Pair("search", name));
        Call call = sdkClient.buildCall(path, HttpMethod.GET, queryParams, null, null);
        Type type = TypeToken.get(HotspotResponse.class).getType();
        return execute(call, type);
    }

    @Override
    public HotspotsResponse searchHotspotsByLocationDistance(float lat, float lon, int distance) throws IOException {
        String path = path()+"/location/distance";
        ArrayList<Pair> queryParams = new ArrayList<>();
        queryParams.add(new Pair("lat", lat));
        queryParams.add(new Pair("lon", lon));
        queryParams.add(new Pair("distance", distance));
        Call call = sdkClient.buildCall(path, HttpMethod.GET, queryParams, null, null);
        Type type = TypeToken.get(HotspotResponse.class).getType();
        return execute(call, type);
    }

    @Override
    public HotspotsResponse searchHotspotsByLocationBox(float swlat, float swlon, float nelat, float nelon) throws IOException {
        String path = path()+"/location/box";
        ArrayList<Pair> queryParams = new ArrayList<>();
        queryParams.add(new Pair("swlat", swlat));
        queryParams.add(new Pair("swlon", swlon));
        queryParams.add(new Pair("nelat", nelat));
        queryParams.add(new Pair("nelon", nelon));
        Call call = sdkClient.buildCall(path, HttpMethod.GET, queryParams, null, null);
        Type type = TypeToken.get(HotspotResponse.class).getType();
        return execute(call, type);
    }

    @Override
    public HotspotsResponse getHotspotsByGivenH3Index(String index) throws IOException {
        String path = path()+"/hex/"+index;
        Call call = sdkClient.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
        Type type = TypeToken.get(HotspotResponse.class).getType();
        return execute(call, type);
    }

    @Override
    public HotspotRolesResponse getHotspotRoles(@NotNull String address, @Nullable String cursor, @Nullable String filterTypes, @Nullable String minTime, @Nullable String maxTime, @Nullable String limit) throws IOException {
        String path = path()+"/"+address+"/roles";
        ArrayList<Pair> queryParams = new ArrayList<>();
        queryParams.add(new Pair("cursor", cursor));
        queryParams.add(new Pair("filter_types", filterTypes));
        queryParams.add(new Pair("min_time", minTime));
        queryParams.add(new Pair("max_time", maxTime));
        queryParams.add(new Pair("limit", limit));
        Call call = sdkClient.buildCall(path, HttpMethod.GET, queryParams, null, null);
        Type type = TypeToken.get(HotspotRolesResponse.class).getType();
        return execute(call, type);
    }

    @Override
    public HotspotsRolesCountResponse getHotspotsRolesCount(@NotNull String address, @Nullable String filterTypes) throws IOException {
        String path = path()+"/"+address+"/roles/count";
        ArrayList<Pair> queryParams = new ArrayList<>();
        queryParams.add(new Pair("filter_types", filterTypes));
        Call call = sdkClient.buildCall(path, HttpMethod.GET, queryParams, null, null);
        Type type = TypeToken.get(HotspotsRolesCountResponse.class).getType();
        return execute(call, type);
    }

    @Override
    public HotspotElectionsResponse getHotspotElections(@NotNull String address, @Nullable String cursor, @Nullable String minTime, @Nullable String maxTime, @Nullable String limit) throws IOException {
        String path = path()+"/"+address+"/elections";
        ArrayList<Pair> queryParams = new ArrayList<>();
        queryParams.add(new Pair("cursor", cursor));
        queryParams.add(new Pair("min_time", minTime));
        queryParams.add(new Pair("max_time", maxTime));
        queryParams.add(new Pair("limit", limit));
        Call call = sdkClient.buildCall(path, HttpMethod.GET, queryParams, null, null);
        Type type = TypeToken.get(HotspotElectionsResponse.class).getType();
        return execute(call, type);
    }

    @Override
    public HotspotsResponse getElectedHotspots() throws IOException {
        String path = path()+"/elected";
        Call call = sdkClient.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
        Type type = TypeToken.get(HotspotsResponse.class).getType();
        return execute(call, type);
    }

    @Override
    public HotspotChallangesResponse getHotspotChallanges(@NotNull String address, @Nullable String cursor, @Nullable String minTime, @Nullable String maxTime, @Nullable String limit) throws IOException {
        String path = path()+"/"+address+"/challenges";
        ArrayList<Pair> queryParams = new ArrayList<>();
        queryParams.add(new Pair("cursor", cursor));
        queryParams.add(new Pair("min_time", minTime));
        queryParams.add(new Pair("max_time", maxTime));
        queryParams.add(new Pair("limit", limit));
        Call call = sdkClient.buildCall(path, HttpMethod.GET, queryParams, null, null);
        Type type = TypeToken.get(HotspotChallangesResponse.class).getType();
        return execute(call, type);
    }

    @Override
    public HotspotRewardResponse getRewardsForHotspot(@NotNull String address, @Nullable String cursor, @Nullable String maxTime, @Nullable String minTime) throws IOException {
        String path = path()+"/"+address+"/rewards";
        ArrayList<Pair> queryParams = new ArrayList<>();
        queryParams.add(new Pair("cursor", cursor));
        queryParams.add(new Pair("min_time", minTime));
        queryParams.add(new Pair("max_time", maxTime));
        Call call = sdkClient.buildCall(path, HttpMethod.GET, queryParams, null, null);
        Type type = TypeToken.get(HotspotRewardResponse.class).getType();
        return execute(call, type);
    }

    //TODO Docs doesn't have block param
    @Override
    public HotspotRewardResponse getRewardsForHotspotByGivenRewardBlock(@NotNull String address) throws IOException {
        String path = path()+"/"+address+"/rewards/";
        Call call = sdkClient.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
        Type type = TypeToken.get(HotspotRewardResponse.class).getType();
        return execute(call, type);
    }

    @Override
    public HotspotTotalRewardResponse getTotalRewardForHotspot(@NotNull String address, @Nullable String maxTime, @Nullable String minTime, @Nullable String bucket) throws IOException {
        String path = path()+"/"+address+"/rewards/sum";
        ArrayList<Pair> queryParams = new ArrayList<>();
        queryParams.add(new Pair("min_time", minTime));
        queryParams.add(new Pair("max_time", maxTime));
        queryParams.add(new Pair("bucket", bucket));
        Call call = sdkClient.buildCall(path, HttpMethod.GET, queryParams, null, null);
        Type type = TypeToken.get(HotspotTotalRewardResponse.class).getType();
        return execute(call, type);
    }

    @Override
    public HotspotsResponse getWitnessesForHotspot(@NotNull String address) throws IOException {
        String path = path()+"/"+address+"/witnesses";
        Call call = sdkClient.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
        Type type = TypeToken.get(HotspotsResponse.class).getType();
        return execute(call, type);
    }

    @Override
    public HotspotsResponse getWitnessedForHotspot(@NotNull String address) throws IOException {
        String path = path()+"/"+address+"/witnessed";
        Call call = sdkClient.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
        Type type = TypeToken.get(HotspotsResponse.class).getType();
        return execute(call, type);
    }

}
