package mobi.appcent.helium.api;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public interface IHotspotApi {
    public HotspotApi.APIgetHotspotsRequest getHotspots() throws IOException;

    public HotspotApi.APIgetHotspotByGivenAdressRequest getHotspotByGivenAdress() throws IOException;

    public HotspotApi.APIgetHotspotsByGivenNameRequest getHotspotsByGivenName() throws IOException;

    public HotspotApi.APIsearchHotspotsByGivenNameRequest searchHotspotsByGivenName() throws IOException;

    public HotspotApi.APIsearchHotspotsByLocationDistanceRequest searchHotspotsByLocationDistance() throws IOException;

    public HotspotApi.APIsearchHotspotsByLocationBoxRequest searchHotspotsByLocationBox() throws IOException;

    public HotspotApi.APIgetHotspotsByGivenH3IndexRequest getHotspotsByGivenH3Index(String index) throws IOException;

    public HotspotApi.APIgetHotspotRolesRequest getHotspotRoles(@NotNull String address) throws IOException;

    public HotspotApi.APIgetHotspotsRolesCountRequest getHotspotsRolesCount(@NotNull String address) throws IOException;

    public HotspotApi.APIgetHotspotElectionsRequest getHotspotElections(@NotNull String address) throws IOException;

    public HotspotApi.APIgetElectedHotspotsRequest getElectedHotspots() throws IOException;

    public HotspotApi.APIgetHotspotChallangesRequest getHotspotChallanges(@NotNull String address) throws IOException;

    public HotspotApi.APIgetRewardsForHotspotRequest getRewardsForHotspot(@NotNull String address) throws IOException;

    public HotspotApi.APIgetRewardsForHotspotByGivenRewardBlockRequest getRewardsForHotspotByGivenRewardBlock(@NotNull String address) throws IOException;

    public HotspotApi.APIgetTotalRewardForHotspotRequest getTotalRewardForHotspot(@NotNull String address) throws IOException;

    public HotspotApi.APIgetWitnessesForHotspotRequest getWitnessesForHotspot(@NotNull String address) throws IOException;

    public HotspotApi.APIgetWitnessedForHotspotRequest getWitnessedForHotspot(@NotNull String address) throws IOException;

}
