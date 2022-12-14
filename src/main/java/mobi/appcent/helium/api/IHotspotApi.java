package mobi.appcent.helium.api;

import mobi.appcent.helium.request.hotspot.*;
import org.jetbrains.annotations.NotNull;

import mobi.appcent.helium.exception.ApiException;

public interface IHotspotApi {
    HotspotsRequest getHotspots() throws ApiException;

    HotspotByGivenAddressRequest getHotspotByGivenAddress() throws ApiException;

    HotspotsByGivenNameRequest getHotspotsByGivenName(String name) throws ApiException;

    SearchHotspotsByGivenNameRequest searchHotspotsByGivenName() throws ApiException;

    SearchHotspotsByLocationDistanceRequest searchHotspotsByLocationDistance() throws ApiException;

    SearchHotspotsByLocationBoxRequest searchHotspotsByLocationBox() throws ApiException;

    HotspotsByGivenH3IndexRequest getHotspotsByGivenH3Index(String index) throws ApiException;

    HotspotRolesRequest getHotspotRoles(@NotNull String address) throws ApiException;

    HotspotsRolesCountRequest getHotspotsRolesCount(@NotNull String address) throws ApiException;

    HotspotElectionsRequest getHotspotElections(@NotNull String address) throws ApiException;

    ElectedHotspotsRequest getElectedHotspots() throws ApiException;

    HotspotChallengesRequest getHotspotChallanges(@NotNull String address) throws ApiException;

    RewardsForHotspotsRequest getRewardsForHotspot(@NotNull String address) throws ApiException;

    RewardsForHotspotsByGivenRewardBlockRequest getRewardsForHotspotByGivenRewardBlock(@NotNull String address) throws ApiException;

    TotalRewardForHotspotRequest getTotalRewardForHotspot(@NotNull String address) throws ApiException;

    WitnessesForHotspotRequest getWitnessesForHotspot(@NotNull String address) throws ApiException;

    WitnessedForHotspotRequest getWitnessedForHotspot(@NotNull String address) throws ApiException;

}
