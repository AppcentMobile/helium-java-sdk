package mobi.appcent.helium.api;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.exception.ApiException;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.model.*;
import mobi.appcent.helium.response.challenge.ChallengesResponse;
import mobi.appcent.helium.response.election.ListOfElectionsResponse;
import mobi.appcent.helium.response.hotspot.*;
import mobi.appcent.helium.response.hotspot.HotspotRewardResponse;
import okhttp3.Call;
import org.jetbrains.annotations.NotNull;

import mobi.appcent.helium.exception.ApiException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import mobi.appcent.helium.request.hotspot.*;
import org.jetbrains.annotations.NotNull;


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
    public HotspotsRequest getHotspots() throws ApiException {
        return new HotspotsRequest(sdkClient);
    }

    @Override
    public HotspotByGivenAddressRequest getHotspotByGivenAddress() throws ApiException {
        return new HotspotByGivenAddressRequest(sdkClient);
    }

    @Override
    public HotspotsByGivenNameRequest getHotspotsByGivenName(String name) throws ApiException {
        return new HotspotsByGivenNameRequest(sdkClient, name);
    }

    @Override
    public SearchHotspotsByGivenNameRequest searchHotspotsByGivenName() throws ApiException {
        return new SearchHotspotsByGivenNameRequest(sdkClient);
    }

    @Override
    public SearchHotspotsByLocationDistanceRequest searchHotspotsByLocationDistance() throws ApiException {
        return new SearchHotspotsByLocationDistanceRequest(sdkClient);
    }

    @Override
    public SearchHotspotsByLocationBoxRequest searchHotspotsByLocationBox() throws ApiException {
        return new SearchHotspotsByLocationBoxRequest(sdkClient);
    }

    @Override
    public HotspotsByGivenH3IndexRequest getHotspotsByGivenH3Index(String index) throws ApiException {
        return new HotspotsByGivenH3IndexRequest(sdkClient, index);
    }

    @Override
    public HotspotRolesRequest getHotspotRoles(@NotNull String address) throws ApiException {
        return new HotspotRolesRequest(sdkClient, address);
    }

    @Override
    public HotspotsRolesCountRequest getHotspotsRolesCount(@NotNull String address) throws ApiException {
        return new HotspotsRolesCountRequest(sdkClient, address);
    }

    @Override
    public HotspotElectionsRequest getHotspotElections(@NotNull String address) throws ApiException {
        return new HotspotElectionsRequest(sdkClient, address);
    }

    @Override
    public ElectedHotspotsRequest getElectedHotspots() throws ApiException {
        return new ElectedHotspotsRequest(sdkClient);
    }

    @Override
    public HotspotChallengesRequest getHotspotChallanges(@NotNull String address) throws ApiException {
        return new HotspotChallengesRequest(sdkClient, address);
    }

    @Override
    public RewardsForHotspotsRequest getRewardsForHotspot(@NotNull String address) throws ApiException {
        return new RewardsForHotspotsRequest(sdkClient, address);
    }

    @Override
    public RewardsForHotspotsByGivenRewardBlockRequest getRewardsForHotspotByGivenRewardBlock(@NotNull String address) throws ApiException {
        return new RewardsForHotspotsByGivenRewardBlockRequest(sdkClient, address);
    }

    @Override
    public TotalRewardForHotspotRequest getTotalRewardForHotspot(@NotNull String address) throws ApiException {
        return new TotalRewardForHotspotRequest(sdkClient, address);
    }

    @Override
    public WitnessesForHotspotRequest getWitnessesForHotspot(@NotNull String address) throws ApiException {
        return new WitnessesForHotspotRequest(sdkClient, address);
    }

    @Override
    public WitnessedForHotspotRequest getWitnessedForHotspot(@NotNull String address) throws ApiException {
        return new WitnessedForHotspotRequest(sdkClient, address);
    }

}
