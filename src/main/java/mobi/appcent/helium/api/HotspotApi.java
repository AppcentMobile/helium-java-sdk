package mobi.appcent.helium.api;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.model.*;
import mobi.appcent.helium.response.hotspot.*;
import mobi.appcent.helium.response.hotspot.HotspotRewardResponse;
import okhttp3.Call;
import org.jetbrains.annotations.NotNull;

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
            queryParams.add(Pair.create("cursor", cursor));
            queryParams.add(Pair.create("filter_modes", filterModes));
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
    public APIgetHotspotsByGivenNameRequest getHotspotsByGivenName() throws IOException {
        return new APIgetHotspotsByGivenNameRequest();
    }

    public class APIgetHotspotsByGivenNameRequest {
        private String name;
        public APIgetHotspotsByGivenNameRequest() {}
        public APIgetHotspotsByGivenNameRequest name(String name) {
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
    public APIsearchHotspotsByGivenNameRequest searchHotspotsByGivenName() throws IOException {
        return new APIsearchHotspotsByGivenNameRequest();
    }

    public class APIsearchHotspotsByGivenNameRequest {
        private String name;
        public APIsearchHotspotsByGivenNameRequest() {}
        public APIsearchHotspotsByGivenNameRequest name(String name) {
            this.name = name;
            return this;
        }

        public HotspotResponse execute() throws IOException {
            String path = path()+"/name";
            ArrayList<Pair> queryParams = new ArrayList<>();
            queryParams.add(Pair.create("search", name));
            Call call = sdkClient.buildCall(path, HttpMethod.GET, queryParams, null, null);
            Type type = TypeToken.get(HotspotResponse.class).getType();
            return HotspotApi.this.execute(call, type);
        }
    }

    @Override
    public APIsearchHotspotsByLocationDistanceRequest searchHotspotsByLocationDistance() throws IOException {
        return new APIsearchHotspotsByLocationDistanceRequest();
    }

    public class APIsearchHotspotsByLocationDistanceRequest {
        private Float lat;
        private Float lon;
        private Integer distance;
        public APIsearchHotspotsByLocationDistanceRequest() {}
        public APIsearchHotspotsByLocationDistanceRequest lat(float lat) {
            this.lat = lat;
            return this;
        }

        public APIsearchHotspotsByLocationDistanceRequest lon(float lon) {
            this.lon = lon;
            return this;
        }

        public APIsearchHotspotsByLocationDistanceRequest distance(int distance) {
            this.distance = distance;
            return this;
        }
        public HotspotResponse execute() throws IOException {
            String path = path()+"/location/distance";
            ArrayList<Pair> queryParams = new ArrayList<>();
            queryParams.add(Pair.create("lat", lat));
            queryParams.add(Pair.create("lon", lon));
            queryParams.add(Pair.create("distance", distance));
            Call call = sdkClient.buildCall(path, HttpMethod.GET, queryParams, null, null);
            Type type = TypeToken.get(HotspotResponse.class).getType();
            return HotspotApi.this.execute(call, type);
        }
    }

    @Override
    public APIsearchHotspotsByLocationBoxRequest searchHotspotsByLocationBox() throws IOException {
        return new APIsearchHotspotsByLocationBoxRequest();
    }

    public class APIsearchHotspotsByLocationBoxRequest {
        private Float swlat;
        private Float swlon;
        private Integer nelat;
        private Integer nelon;
        public APIsearchHotspotsByLocationBoxRequest() {}
        public APIsearchHotspotsByLocationBoxRequest swlat(float swlat) {
            this.swlat = swlat;
            return this;
        }

        public APIsearchHotspotsByLocationBoxRequest swlon(float swlon) {
            this.swlon = swlon;
            return this;
        }

        public APIsearchHotspotsByLocationBoxRequest nelat(int nelat) {
            this.nelat = nelat;
            return this;
        }

        public APIsearchHotspotsByLocationBoxRequest nelon(int nelon) {
            this.nelon = nelon;
            return this;
        }
        public HotspotResponse execute() throws IOException {
            String path = path()+"/location/box";
            ArrayList<Pair> queryParams = new ArrayList<>();
            queryParams.add(Pair.create("swlat", swlat));
            queryParams.add(Pair.create("swlon", swlon));
            queryParams.add(Pair.create("nelat", nelat));
            queryParams.add(Pair.create("nelon", nelon));
            Call call = sdkClient.buildCall(path, HttpMethod.GET, queryParams, null, null);
            Type type = TypeToken.get(HotspotResponse.class).getType();
            return HotspotApi.this.execute(call, type);
        }
    }

    @Override
    public APIgetHotspotsByGivenH3IndexRequest getHotspotsByGivenH3Index(String index) throws IOException {
        return new APIgetHotspotsByGivenH3IndexRequest(index);
    }

    public class APIgetHotspotsByGivenH3IndexRequest {
        private String index;
        public APIgetHotspotsByGivenH3IndexRequest(String index) { this.index = index; }

        public HotspotResponse execute() throws IOException {
            String path = path()+"/hex/"+index;
            Call call = sdkClient.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
            Type type = TypeToken.get(HotspotResponse.class).getType();
            return HotspotApi.this.execute(call, type);
        }
    }

    @Override
    public APIgetHotspotRolesRequest getHotspotRoles(@NotNull String address) throws IOException {
        return new APIgetHotspotRolesRequest(address);
    }

    public class APIgetHotspotRolesRequest {
        private final String address;
        private String cursor;
        private String filterTypes;
        private String minTime;
        private String maxTime;
        private Integer limit;
        public APIgetHotspotRolesRequest(String address) { this.address = address; }
        public APIgetHotspotRolesRequest cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public APIgetHotspotRolesRequest filterTypes(String filterTypes) {
            this.filterTypes = filterTypes;
            return this;
        }

        public APIgetHotspotRolesRequest maxTime(String maxTime) {
            this.maxTime = maxTime;
            return this;
        }
        public APIgetHotspotRolesRequest limit(int limit) {
            this.limit = limit;
            return this;
        }
        public APIgetHotspotRolesRequest minTime(String minTime) {
            this.minTime = minTime;
            return this;
        }


        public HotspotRolesResponse execute() throws IOException {
            String path = path()+"/"+address+"/roles";
            ArrayList<Pair> queryParams = new ArrayList<>();
            queryParams.add(Pair.create("cursor", cursor));
            queryParams.add(Pair.create("filter_types", filterTypes));
            queryParams.add(Pair.create("min_time", minTime));
            queryParams.add(Pair.create("max_time", maxTime));
            queryParams.add(Pair.create("limit", limit));
            Call call = sdkClient.buildCall(path, HttpMethod.GET, queryParams, null, null);
            Type type = TypeToken.get(HotspotRolesResponse.class).getType();
            return HotspotApi.this.execute(call, type);
        }
    }

    @Override
    public APIgetHotspotsRolesCountRequest getHotspotsRolesCount(@NotNull String address) throws IOException {
        return new APIgetHotspotsRolesCountRequest(address);
    }

    public class APIgetHotspotsRolesCountRequest {
        private final String address;
        private String filterTypes;
        public APIgetHotspotsRolesCountRequest(String address) { this.address = address; }

        public APIgetHotspotsRolesCountRequest filterTypes(String filterTypes) {
            this.filterTypes = filterTypes;
            return this;
        }

        public HotspotsRolesCountResponse execute() throws IOException {
            String path = path()+"/"+address+"/roles/count";
            ArrayList<Pair> queryParams = new ArrayList<>();
            queryParams.add(Pair.create("filter_types", filterTypes));
            Call call = sdkClient.buildCall(path, HttpMethod.GET, queryParams, null, null);
            Type type = TypeToken.get(HotspotsRolesCountResponse.class).getType();
            return HotspotApi.this.execute(call, type);
        }
    }

    @Override
    public APIgetHotspotElectionsRequest getHotspotElections(@NotNull String address) throws IOException {
        return new APIgetHotspotElectionsRequest(address);
    }

    public class APIgetHotspotElectionsRequest {
        private final String address;
        private String cursor;
        private String minTime;
        private String maxTime;
        private Integer limit;

        public APIgetHotspotElectionsRequest cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public APIgetHotspotElectionsRequest maxTime(String maxTime) {
            this.maxTime = maxTime;
            return this;
        }
        public APIgetHotspotElectionsRequest limit(int limit) {
            this.limit = limit;
            return this;
        }
        public APIgetHotspotElectionsRequest minTime(String minTime) {
            this.minTime = minTime;
            return this;
        }
        public APIgetHotspotElectionsRequest(String address) { this.address = address; }

        public HotspotElectionsResponse execute() throws IOException {
            String path = path()+"/"+address+"/elections";
            ArrayList<Pair> queryParams = new ArrayList<>();
            queryParams.add(Pair.create("cursor", cursor));
            queryParams.add(Pair.create("min_time", minTime));
            queryParams.add(Pair.create("max_time", maxTime));
            queryParams.add(Pair.create("limit", limit));
            Call call = sdkClient.buildCall(path, HttpMethod.GET, queryParams, null, null);
            Type type = TypeToken.get(HotspotElectionsResponse.class).getType();
            return HotspotApi.this.execute(call, type);
        }
    }

    @Override
    public APIgetElectedHotspotsRequest getElectedHotspots() throws IOException {
        return new APIgetElectedHotspotsRequest();
    }

    public class APIgetElectedHotspotsRequest {
        public APIgetElectedHotspotsRequest() {  }

        public HotspotsResponse execute() throws IOException {
            String path = path()+"/elected";
            Call call = sdkClient.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
            Type type = TypeToken.get(HotspotsResponse.class).getType();
            return HotspotApi.this.execute(call, type);
        }
    }

    @Override
    public APIgetHotspotChallangesRequest getHotspotChallanges(@NotNull String address) throws IOException {
        return new APIgetHotspotChallangesRequest(address);
    }

    public class APIgetHotspotChallangesRequest {
        private final String address;
        private String cursor;
        private String minTime;
        private String maxTime;
        private Integer limit;

        public APIgetHotspotChallangesRequest cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public APIgetHotspotChallangesRequest maxTime(String maxTime) {
            this.maxTime = maxTime;
            return this;
        }
        public APIgetHotspotChallangesRequest limit(int limit) {
            this.limit = limit;
            return this;
        }
        public APIgetHotspotChallangesRequest minTime(String minTime) {
            this.minTime = minTime;
            return this;
        }
        public APIgetHotspotChallangesRequest(String address) { this.address = address; }

        public HotspotChallangesResponse execute() throws IOException {
            String path = path()+"/"+address+"/challenges";
            ArrayList<Pair> queryParams = new ArrayList<>();
            queryParams.add(Pair.create("cursor", cursor));
            queryParams.add(Pair.create("min_time", minTime));
            queryParams.add(Pair.create("max_time", maxTime));
            queryParams.add(Pair.create("limit", limit));
            Call call = sdkClient.buildCall(path, HttpMethod.GET, queryParams, null, null);
            Type type = TypeToken.get(HotspotChallangesResponse.class).getType();
            return HotspotApi.this.execute(call, type);
        }
    }

    @Override
    public APIgetRewardsForHotspotRequest getRewardsForHotspot(@NotNull String address) throws IOException {
        return new APIgetRewardsForHotspotRequest(address);
    }

    public class APIgetRewardsForHotspotRequest {
        private final String address;
        private String cursor;
        private String minTime;
        private String maxTime;

        public APIgetRewardsForHotspotRequest cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public APIgetRewardsForHotspotRequest maxTime(String maxTime) {
            this.maxTime = maxTime;
            return this;
        }

        public APIgetRewardsForHotspotRequest minTime(String minTime) {
            this.minTime = minTime;
            return this;
        }
        public APIgetRewardsForHotspotRequest(String address) { this.address = address; }

        public HotspotRewardResponse execute() throws IOException {
            String path = path()+"/"+address+"/rewards";
            ArrayList<Pair> queryParams = new ArrayList<>();
            queryParams.add(Pair.create("cursor", cursor));
            queryParams.add(Pair.create("min_time", minTime));
            queryParams.add(Pair.create("max_time", maxTime));
            Call call = sdkClient.buildCall(path, HttpMethod.GET, queryParams, null, null);
            Type type = TypeToken.get(HotspotRewardResponse.class).getType();
            return HotspotApi.this.execute(call, type);
        }
    }

    //TODO Docs doesn't have block param
    @Override
    public APIgetRewardsForHotspotByGivenRewardBlockRequest getRewardsForHotspotByGivenRewardBlock(@NotNull String address) throws IOException {
        return new APIgetRewardsForHotspotByGivenRewardBlockRequest(address);
    }

    public class APIgetRewardsForHotspotByGivenRewardBlockRequest {
        private final String address;

        public APIgetRewardsForHotspotByGivenRewardBlockRequest(String address) { this.address = address; }

        public HotspotRewardResponse execute() throws IOException {
            String path = path()+"/"+address+"/rewards/";
            Call call = sdkClient.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
            Type type = TypeToken.get(HotspotRewardResponse.class).getType();
            return HotspotApi.this.execute(call, type);
        }
    }

    //TODO actual response is different from docs
    @Override
    public APIgetTotalRewardForHotspotRequest getTotalRewardForHotspot(@NotNull String address) throws IOException {
        return new APIgetTotalRewardForHotspotRequest(address);
    }

    public class APIgetTotalRewardForHotspotRequest {
        private final String address;
        private String maxTime;
        private String minTime;
        private String bucket;

        public APIgetTotalRewardForHotspotRequest(String address) { this.address = address; }

        public APIgetTotalRewardForHotspotRequest maxTime(String maxTime) {
            this.maxTime = maxTime;
            return this;
        }

        public APIgetTotalRewardForHotspotRequest minTime(String minTime) {
            this.minTime = minTime;
            return this;
        }

        public APIgetTotalRewardForHotspotRequest bucket(String bucket) {
            this.bucket = bucket;
            return this;
        }

        public HotspotTotalRewardResponse execute() throws IOException {
            String path = path()+"/"+address+"/rewards/sum";
            ArrayList<Pair> queryParams = new ArrayList<>();
            queryParams.add(Pair.create("min_time", minTime));
            queryParams.add(Pair.create("max_time", maxTime));
            queryParams.add(Pair.create("bucket", bucket));
            Call call = sdkClient.buildCall(path, HttpMethod.GET, queryParams, null, null);
            Type type = TypeToken.get(HotspotTotalRewardResponse.class).getType();
            return HotspotApi.this.execute(call, type);
        }
    }

    @Override
    public APIgetWitnessesForHotspotRequest getWitnessesForHotspot(@NotNull String address) throws IOException {
        return new APIgetWitnessesForHotspotRequest(address);
    }

    public class APIgetWitnessesForHotspotRequest {
        private final String address;

        public APIgetWitnessesForHotspotRequest(String address) { this.address = address; }

        public HotspotsResponse execute() throws IOException {
            String path = path()+"/"+address+"/witnesses";
            Call call = sdkClient.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
            Type type = TypeToken.get(HotspotsResponse.class).getType();
            return HotspotApi.this.execute(call, type);
        }
    }

    @Override
    public APIgetWitnessedForHotspotRequest getWitnessedForHotspot(@NotNull String address) throws IOException {
        return new APIgetWitnessedForHotspotRequest(address);
    }

    public class APIgetWitnessedForHotspotRequest {
        private final String address;

        public APIgetWitnessedForHotspotRequest(String address) { this.address = address; }

        public HotspotsResponse execute() throws IOException {
            String path = path()+"/"+address+"/witnessed";
            Call call = sdkClient.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
            Type type = TypeToken.get(HotspotsResponse.class).getType();
            return HotspotApi.this.execute(call, type);
        }
    }

}
