package mobi.appcent.helium.api;

import mobi.appcent.helium.request.hotspot.*;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

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
    public HotspotsRequest getHotspots() throws IOException {
        return new HotspotsRequest(sdkClient);
    }

    @Override
    public HotspotByGivenAddressRequest getHotspotByGivenAddress() throws IOException {
        return new HotspotByGivenAddressRequest(sdkClient);
    }

    @Override
    public HotspotsByGivenNameRequest getHotspotsByGivenName(String name) throws IOException {
        return new HotspotsByGivenNameRequest(sdkClient, name);
    }

    @Override
    public SearchHotspotsByGivenNameRequest searchHotspotsByGivenName() throws IOException {
        return new SearchHotspotsByGivenNameRequest(sdkClient);
    }

    @Override
    public SearchHotspotsByLocationDistanceRequest searchHotspotsByLocationDistance() throws IOException {
        return new SearchHotspotsByLocationDistanceRequest(sdkClient);
    }

    @Override
    public SearchHotspotsByLocationBoxRequest searchHotspotsByLocationBox() throws IOException {
        return new SearchHotspotsByLocationBoxRequest(sdkClient);
    }

    @Override
    public HotspotsByGivenH3IndexRequest getHotspotsByGivenH3Index(String index) throws IOException {
        return new HotspotsByGivenH3IndexRequest(sdkClient, index);
    }

    @Override
    public HotspotRolesRequest getHotspotRoles(@NotNull String address) throws IOException {
        return new HotspotRolesRequest(sdkClient, address);
    }

    @Override
    public HotspotsRolesCountRequest getHotspotsRolesCount(@NotNull String address) throws IOException {
        return new HotspotsRolesCountRequest(sdkClient, address);
    }

    @Override
    public HotspotElectionsRequest getHotspotElections(@NotNull String address) throws IOException {
        return new HotspotElectionsRequest(sdkClient, address);
    }

    @Override
    public ElectedHotspotsRequest getElectedHotspots() throws IOException {
        return new ElectedHotspotsRequest(sdkClient);
    }

    @Override
    public HotspotChallengesRequest getHotspotChallanges(@NotNull String address) throws IOException {
        return new HotspotChallengesRequest(sdkClient, address);
    }

    @Override
    public RewardsForHotspotsRequest getRewardsForHotspot(@NotNull String address) throws IOException {
        return new RewardsForHotspotsRequest(sdkClient, address);
    }

    @Override
    public RewardsForHotspotsByGivenRewardBlockRequest getRewardsForHotspotByGivenRewardBlock(@NotNull String address) throws IOException {
        return new RewardsForHotspotsByGivenRewardBlockRequest(sdkClient, address);
    }

    @Override
    public TotalRewardForHotspotRequest getTotalRewardForHotspot(@NotNull String address) throws IOException {
        return new TotalRewardForHotspotRequest(sdkClient, address);
    }

    @Override
    public WitnessesForHotspotRequest getWitnessesForHotspot(@NotNull String address) throws IOException {
        return new WitnessesForHotspotRequest(sdkClient, address);
    }

    @Override
    public WitnessedForHotspotRequest getWitnessedForHotspot(@NotNull String address) throws IOException {
        return new WitnessedForHotspotRequest(sdkClient, address);
    }

}
