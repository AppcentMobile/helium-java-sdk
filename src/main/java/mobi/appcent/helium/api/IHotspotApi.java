package mobi.appcent.helium.api;

import org.jetbrains.annotations.NotNull;

import mobi.appcent.helium.exception.ApiException;

public interface IHotspotApi {
    public HotspotApi.APIgetHotspotsRequest getHotspots() throws ApiException;

    public HotspotApi.APIgetHotspotByGivenAdressRequest getHotspotByGivenAdress() throws ApiException;

    public HotspotApi.APIgetHotspotsByGivenNameRequest getHotspotsByGivenName() throws ApiException;

    public HotspotApi.APIsearchHotspotsByGivenNameRequest searchHotspotsByGivenName() throws ApiException;

    public HotspotApi.APIsearchHotspotsByLocationDistanceRequest searchHotspotsByLocationDistance() throws ApiException;

    public HotspotApi.APIsearchHotspotsByLocationBoxRequest searchHotspotsByLocationBox() throws ApiException;

    public HotspotApi.APIgetHotspotsByGivenH3IndexRequest getHotspotsByGivenH3Index(String index) throws ApiException;

    public HotspotApi.APIgetHotspotRolesRequest getHotspotRoles(@NotNull String address) throws ApiException;

    public HotspotApi.APIgetHotspotsRolesCountRequest getHotspotsRolesCount(@NotNull String address) throws ApiException;

    public HotspotApi.APIgetHotspotElectionsRequest getHotspotElections(@NotNull String address) throws ApiException;

    public HotspotApi.APIgetElectedHotspotsRequest getElectedHotspots() throws ApiException;

    public HotspotApi.APIgetHotspotChallangesRequest getHotspotChallanges(@NotNull String address) throws ApiException;

    public HotspotApi.APIgetRewardsForHotspotRequest getRewardsForHotspot(@NotNull String address) throws ApiException;

    public HotspotApi.APIgetRewardsForHotspotByGivenRewardBlockRequest getRewardsForHotspotByGivenRewardBlock(@NotNull String address) throws ApiException;

    public HotspotApi.APIgetTotalRewardForHotspotRequest getTotalRewardForHotspot(@NotNull String address) throws ApiException;

    public HotspotApi.APIgetWitnessesForHotspotRequest getWitnessesForHotspot(@NotNull String address) throws ApiException;

    public HotspotApi.APIgetWitnessedForHotspotRequest getWitnessedForHotspot(@NotNull String address) throws ApiException;

}
