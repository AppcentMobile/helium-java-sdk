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
    public APIgetHotspotsRequest getHotspots() throws IOException {
        return new APIgetHotspotsRequest();
    }

    public class APIgetHotspotsRequest{
        private String cursor;
        private String filterModes;

        public APIgetHotspotsRequest() {}
        public APIgetHotspotsRequest cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public APIgetHotspotsRequest filterModes(String filterModes) {
            this.filterModes = filterModes;
            return this;
        }

        public HotspotsResponse execute() throws IOException {
            ArrayList<Pair> queryParams = new ArrayList<>();
            queryParams.add(new Pair("cursor", cursor));
            queryParams.add(new Pair("filter_modes", filterModes));
            Call call = sdkClient.buildCall(path(), HttpMethod.GET, queryParams, null, null);
            Type type = TypeToken.get(HotspotsResponse.class).getType();
            return HotspotApi.this.execute(call, type);
        }
    }

    @Override
    public APIgetHotspotByGivenAdressRequest getHotspotByGivenAdress() throws IOException {
        return new APIgetHotspotByGivenAdressRequest();
    }

    public class APIgetHotspotByGivenAdressRequest{
        private String address;
        public APIgetHotspotByGivenAdressRequest() {}
        public APIgetHotspotByGivenAdressRequest address(String address) {
            this.address = address;
            return this;
        }

        public HotspotResponse execute() throws IOException {
            String path = path()+"/"+address;
            Call call = sdkClient.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
            Type type = TypeToken.get(HotspotResponse.class).getType();
            return HotspotApi.this.execute(call, type);
        }
    }

    @Override
    public APIgetHotspotsByGivenName getHotspotsByGivenName() throws IOException {
        return new APIgetHotspotsByGivenName();
    }

    public class APIgetHotspotsByGivenName{
        private String name;
        public APIgetHotspotsByGivenName() {}
        public APIgetHotspotsByGivenName name(String name) {
            this.name = name;
            return this;
        }

        public HotspotResponse execute() throws IOException {
            String path = path()+"/name/"+name;
            Call call = sdkClient.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
            Type type = TypeToken.get(HotspotResponse.class).getType();
            return HotspotApi.this.execute(call, type);
        }
    }

    @Override
    public APIsearchHotspotsByGivenName searchHotspotsByGivenName() throws IOException {
        return new APIsearchHotspotsByGivenName();
    }

    public class APIsearchHotspotsByGivenName{
        private String name;
        public APIsearchHotspotsByGivenName() {}
        public APIsearchHotspotsByGivenName name(String name) {
            this.name = name;
            return this;
        }

        public HotspotResponse execute() throws IOException {
            String path = path()+"/name";
            ArrayList<Pair> queryParams = new ArrayList<>();
            queryParams.add(new Pair("search", name));
            Call call = sdkClient.buildCall(path, HttpMethod.GET, queryParams, null, null);
            Type type = TypeToken.get(HotspotResponse.class).getType();
            return HotspotApi.this.execute(call, type);
        }
    }

    @Override
    public APIsearchHotspotsByLocationDistance searchHotspotsByLocationDistance() throws IOException {
        return new APIsearchHotspotsByLocationDistance();
    }

    public class APIsearchHotspotsByLocationDistance{
        private float lat;
        private float lon;
        private int distance;
        public APIsearchHotspotsByLocationDistance() {}
        public APIsearchHotspotsByLocationDistance lat(float lat) {
            this.lat = lat;
            return this;
        }

        public APIsearchHotspotsByLocationDistance lon(float lon) {
            this.lon = lon;
            return this;
        }

        public APIsearchHotspotsByLocationDistance distance(int distance) {
            this.distance = distance;
            return this;
        }
        public HotspotResponse execute() throws IOException {
            String path = path()+"/location/distance";
            ArrayList<Pair> queryParams = new ArrayList<>();
            queryParams.add(new Pair("lat", lat));
            queryParams.add(new Pair("lon", lon));
            queryParams.add(new Pair("distance", distance));
            Call call = sdkClient.buildCall(path, HttpMethod.GET, queryParams, null, null);
            Type type = TypeToken.get(HotspotResponse.class).getType();
            return HotspotApi.this.execute(call, type);
        }
    }

    @Override
    public APIsearchHotspotsByLocationBox searchHotspotsByLocationBox() throws IOException {
        return new APIsearchHotspotsByLocationBox();
    }

    public class APIsearchHotspotsByLocationBox{
        private float swlat;
        private float swlon;
        private float nelat;
        private float nelon;
        public APIsearchHotspotsByLocationBox() {}
        public APIsearchHotspotsByLocationBox swlat(float swlat) {
            this.swlat = swlat;
            return this;
        }

        public APIsearchHotspotsByLocationBox swlon(float swlon) {
            this.swlon = swlon;
            return this;
        }

        public APIsearchHotspotsByLocationBox nelat(int nelat) {
            this.nelat = nelat;
            return this;
        }

        public APIsearchHotspotsByLocationBox nelon(int nelon) {
            this.nelon = nelon;
            return this;
        }
        public HotspotResponse execute() throws IOException {
            String path = path()+"/location/box";
            ArrayList<Pair> queryParams = new ArrayList<>();
            queryParams.add(new Pair("swlat", swlat));
            queryParams.add(new Pair("swlon", swlon));
            queryParams.add(new Pair("nelat", nelat));
            queryParams.add(new Pair("nelon", nelon));
            Call call = sdkClient.buildCall(path, HttpMethod.GET, queryParams, null, null);
            Type type = TypeToken.get(HotspotResponse.class).getType();
            return HotspotApi.this.execute(call, type);
        }
    }

    @Override
    public APIgetHotspotsByGivenH3Index getHotspotsByGivenH3Index(String index) throws IOException {
        return new APIgetHotspotsByGivenH3Index(index);
    }

    public class APIgetHotspotsByGivenH3Index{
        private String index;
        public APIgetHotspotsByGivenH3Index(String index) { this.index = index; }

        public HotspotResponse execute() throws IOException {
            String path = path()+"/hex/"+index;
            Call call = sdkClient.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
            Type type = TypeToken.get(HotspotResponse.class).getType();
            return HotspotApi.this.execute(call, type);
        }
    }

    @Override
    public APIgetHotspotRoles getHotspotRoles(@NotNull String address) throws IOException {
        return new APIgetHotspotRoles(address);
    }

    public class APIgetHotspotRoles{
        private final String address;
        private String cursor;
        private String filterTypes;
        private String minTime;
        private String maxTime;
        private int limit;
        public APIgetHotspotRoles(String address) { this.address = address; }
        public APIgetHotspotRoles cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public APIgetHotspotRoles filterTypes(String filterTypes) {
            this.filterTypes = filterTypes;
            return this;
        }

        public APIgetHotspotRoles maxTime(String maxTime) {
            this.maxTime = maxTime;
            return this;
        }
        public APIgetHotspotRoles limit(int limit) {
            this.limit = limit;
            return this;
        }
        public APIgetHotspotRoles minTime(String minTime) {
            this.minTime = minTime;
            return this;
        }


        public HotspotRolesResponse execute() throws IOException {
            String path = path()+"/"+address+"/roles";
            ArrayList<Pair> queryParams = new ArrayList<>();
            queryParams.add(new Pair("cursor", cursor));
            queryParams.add(new Pair("filter_types", filterTypes));
            queryParams.add(new Pair("min_time", minTime));
            queryParams.add(new Pair("max_time", maxTime));
            queryParams.add(new Pair("limit", limit));
            Call call = sdkClient.buildCall(path, HttpMethod.GET, queryParams, null, null);
            Type type = TypeToken.get(HotspotRolesResponse.class).getType();
            return HotspotApi.this.execute(call, type);
        }
    }

    @Override
    public APIgetHotspotsRolesCount getHotspotsRolesCount(@NotNull String address) throws IOException {
        return new APIgetHotspotsRolesCount(address);
    }

    public class APIgetHotspotsRolesCount{
        private final String address;
        private String filterTypes;
        public APIgetHotspotsRolesCount(String address) { this.address = address; }

        public APIgetHotspotsRolesCount filterTypes(String filterTypes) {
            this.filterTypes = filterTypes;
            return this;
        }

        public HotspotsRolesCountResponse execute() throws IOException {
            String path = path()+"/"+address+"/roles/count";
            ArrayList<Pair> queryParams = new ArrayList<>();
            queryParams.add(new Pair("filter_types", filterTypes));
            Call call = sdkClient.buildCall(path, HttpMethod.GET, queryParams, null, null);
            Type type = TypeToken.get(HotspotsRolesCountResponse.class).getType();
            return HotspotApi.this.execute(call, type);
        }
    }

    @Override
    public APIgetHotspotElections getHotspotElections(@NotNull String address) throws IOException {
        return new APIgetHotspotElections(address);
    }

    public class APIgetHotspotElections{
        private final String address;
        private String cursor;
        private String minTime;
        private String maxTime;
        private int limit;

        public APIgetHotspotElections cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public APIgetHotspotElections maxTime(String maxTime) {
            this.maxTime = maxTime;
            return this;
        }
        public APIgetHotspotElections limit(int limit) {
            this.limit = limit;
            return this;
        }
        public APIgetHotspotElections minTime(String minTime) {
            this.minTime = minTime;
            return this;
        }
        public APIgetHotspotElections(String address) { this.address = address; }

        public HotspotElectionsResponse execute() throws IOException {
            String path = path()+"/"+address+"/elections";
            ArrayList<Pair> queryParams = new ArrayList<>();
            queryParams.add(new Pair("cursor", cursor));
            queryParams.add(new Pair("min_time", minTime));
            queryParams.add(new Pair("max_time", maxTime));
            queryParams.add(new Pair("limit", limit));
            Call call = sdkClient.buildCall(path, HttpMethod.GET, queryParams, null, null);
            Type type = TypeToken.get(HotspotElectionsResponse.class).getType();
            return HotspotApi.this.execute(call, type);
        }
    }

    @Override
    public APIgetElectedHotspots getElectedHotspots() throws IOException {
        return new APIgetElectedHotspots();
    }

    public class APIgetElectedHotspots{
        public APIgetElectedHotspots() {  }

        public HotspotsResponse execute() throws IOException {
            String path = path()+"/elected";
            Call call = sdkClient.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
            Type type = TypeToken.get(HotspotsResponse.class).getType();
            return HotspotApi.this.execute(call, type);
        }
    }

    @Override
    public APIgetHotspotChallanges getHotspotChallanges(@NotNull String address) throws IOException {
        return new APIgetHotspotChallanges(address);
    }

    public class APIgetHotspotChallanges{
        private final String address;
        private String cursor;
        private String minTime;
        private String maxTime;
        private int limit;

        public APIgetHotspotChallanges cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public APIgetHotspotChallanges maxTime(String maxTime) {
            this.maxTime = maxTime;
            return this;
        }
        public APIgetHotspotChallanges limit(int limit) {
            this.limit = limit;
            return this;
        }
        public APIgetHotspotChallanges minTime(String minTime) {
            this.minTime = minTime;
            return this;
        }
        public APIgetHotspotChallanges(String address) { this.address = address; }

        public HotspotChallangesResponse execute() throws IOException {
            String path = path()+"/"+address+"/challenges";
            ArrayList<Pair> queryParams = new ArrayList<>();
            queryParams.add(new Pair("cursor", cursor));
            queryParams.add(new Pair("min_time", minTime));
            queryParams.add(new Pair("max_time", maxTime));
            queryParams.add(new Pair("limit", limit));
            Call call = sdkClient.buildCall(path, HttpMethod.GET, queryParams, null, null);
            Type type = TypeToken.get(HotspotChallangesResponse.class).getType();
            return HotspotApi.this.execute(call, type);
        }
    }

    @Override
    public APIgetRewardsForHotspot getRewardsForHotspot(@NotNull String address) throws IOException {
        return new APIgetRewardsForHotspot(address);
    }

    public class APIgetRewardsForHotspot{
        private final String address;
        private String cursor;
        private String minTime;
        private String maxTime;

        public APIgetRewardsForHotspot cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public APIgetRewardsForHotspot maxTime(String maxTime) {
            this.maxTime = maxTime;
            return this;
        }

        public APIgetRewardsForHotspot minTime(String minTime) {
            this.minTime = minTime;
            return this;
        }
        public APIgetRewardsForHotspot(String address) { this.address = address; }

        public HotspotRewardResponse execute() throws IOException {
            String path = path()+"/"+address+"/rewards";
            ArrayList<Pair> queryParams = new ArrayList<>();
            queryParams.add(new Pair("cursor", cursor));
            queryParams.add(new Pair("min_time", minTime));
            queryParams.add(new Pair("max_time", maxTime));
            Call call = sdkClient.buildCall(path, HttpMethod.GET, queryParams, null, null);
            Type type = TypeToken.get(HotspotRewardResponse.class).getType();
            return HotspotApi.this.execute(call, type);
        }
    }

    //TODO Docs doesn't have block param
    @Override
    public APIgetRewardsForHotspotByGivenRewardBlock getRewardsForHotspotByGivenRewardBlock(@NotNull String address) throws IOException {
        return new APIgetRewardsForHotspotByGivenRewardBlock(address);
    }

    public class APIgetRewardsForHotspotByGivenRewardBlock{
        private final String address;

        public APIgetRewardsForHotspotByGivenRewardBlock(String address) { this.address = address; }

        public HotspotRewardResponse execute() throws IOException {
            String path = path()+"/"+address+"/rewards/";
            Call call = sdkClient.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
            Type type = TypeToken.get(HotspotRewardResponse.class).getType();
            return HotspotApi.this.execute(call, type);
        }
    }

    //TODO actual response is different from docs
    @Override
    public APIgetTotalRewardForHotspot getTotalRewardForHotspot(@NotNull String address) throws IOException {
        return new APIgetTotalRewardForHotspot(address);
    }

    public class APIgetTotalRewardForHotspot{
        private final String address;
        private String maxTime;
        private String minTime;
        private String bucket;

        public APIgetTotalRewardForHotspot(String address) { this.address = address; }

        public APIgetTotalRewardForHotspot maxTime(String maxTime) {
            this.maxTime = maxTime;
            return this;
        }

        public APIgetTotalRewardForHotspot minTime(String minTime) {
            this.minTime = minTime;
            return this;
        }

        public APIgetTotalRewardForHotspot bucket(String bucket) {
            this.bucket = bucket;
            return this;
        }

        public HotspotTotalRewardResponse execute() throws IOException {
            String path = path()+"/"+address+"/rewards/sum";
            ArrayList<Pair> queryParams = new ArrayList<>();
            queryParams.add(new Pair("min_time", minTime));
            queryParams.add(new Pair("max_time", maxTime));
            queryParams.add(new Pair("bucket", bucket));
            Call call = sdkClient.buildCall(path, HttpMethod.GET, queryParams, null, null);
            Type type = TypeToken.get(HotspotTotalRewardResponse.class).getType();
            return HotspotApi.this.execute(call, type);
        }
    }

    @Override
    public APIgetWitnessesForHotspot getWitnessesForHotspot(@NotNull String address) throws IOException {
        return new APIgetWitnessesForHotspot(address);
    }

    public class APIgetWitnessesForHotspot{
        private final String address;

        public APIgetWitnessesForHotspot(String address) { this.address = address; }

        public HotspotsResponse execute() throws IOException {
            String path = path()+"/"+address+"/witnesses";
            Call call = sdkClient.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
            Type type = TypeToken.get(HotspotsResponse.class).getType();
            return HotspotApi.this.execute(call, type);
        }
    }

    @Override
    public APIgetWitnessedForHotspot getWitnessedForHotspot(@NotNull String address) throws IOException {
        return new APIgetWitnessedForHotspot(address);
    }

    public class APIgetWitnessedForHotspot{
        private final String address;

        public APIgetWitnessedForHotspot(String address) { this.address = address; }

        public HotspotsResponse execute() throws IOException {
            String path = path()+"/"+address+"/witnessed";
            Call call = sdkClient.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
            Type type = TypeToken.get(HotspotsResponse.class).getType();
            return HotspotApi.this.execute(call, type);
        }
    }

}
