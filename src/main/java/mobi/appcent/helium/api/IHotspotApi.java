package mobi.appcent.helium.api;

import mobi.appcent.helium.request.hotspot.*;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public interface IHotspotApi {
    HotspotsRequest getHotspots() throws IOException;

    HotspotByGivenAddressRequest getHotspotByGivenAddress() throws IOException;

    HotspotsByGivenNameRequest getHotspotsByGivenName(String name) throws IOException;

    SearchHotspotsByGivenNameRequest searchHotspotsByGivenName() throws IOException;

    SearchHotspotsByLocationDistanceRequest searchHotspotsByLocationDistance() throws IOException;

    SearchHotspotsByLocationBoxRequest searchHotspotsByLocationBox() throws IOException;

    HotspotsByGivenH3IndexRequest getHotspotsByGivenH3Index(String index) throws IOException;

    HotspotRolesRequest getHotspotRoles(@NotNull String address) throws IOException;

    HotspotsRolesCountRequest getHotspotsRolesCount(@NotNull String address) throws IOException;

    HotspotElectionsRequest getHotspotElections(@NotNull String address) throws IOException;

    ElectedHotspotsRequest getElectedHotspots() throws IOException;

    HotspotChallengesRequest getHotspotChallanges(@NotNull String address) throws IOException;

    RewardsForHotspotsRequest getRewardsForHotspot(@NotNull String address) throws IOException;

    RewardsForHotspotsByGivenRewardBlockRequest getRewardsForHotspotByGivenRewardBlock(@NotNull String address) throws IOException;

    TotalRewardForHotspotRequest getTotalRewardForHotspot(@NotNull String address) throws IOException;

    WitnessesForHotspotRequest getWitnessesForHotspot(@NotNull String address) throws IOException;

    WitnessedForHotspotRequest getWitnessedForHotspot(@NotNull String address) throws IOException;

}
