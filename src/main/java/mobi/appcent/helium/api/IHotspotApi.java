package mobi.appcent.helium.api;

import mobi.appcent.helium.model.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;

public interface IHotspotApi {
    public HotspotApi.APIgetHotspotsRequest getHotspots() throws IOException;

    public HotspotApi.APIgetHotspotByGivenAdressRequest getHotspotByGivenAdress() throws IOException;

    public HotspotApi.APIgetHotspotsByGivenName getHotspotsByGivenName() throws IOException;

    public HotspotApi.APIsearchHotspotsByGivenName searchHotspotsByGivenName() throws IOException;

    public HotspotApi.APIsearchHotspotsByLocationDistance searchHotspotsByLocationDistance() throws IOException;

    public HotspotApi.APIsearchHotspotsByLocationBox searchHotspotsByLocationBox() throws IOException;

    public HotspotApi.APIgetHotspotsByGivenH3Index getHotspotsByGivenH3Index(String index) throws IOException;

    public HotspotApi.APIgetHotspotRoles getHotspotRoles(@NotNull String address) throws IOException;

    public HotspotApi.APIgetHotspotsRolesCount getHotspotsRolesCount(@NotNull String address) throws IOException;

    public HotspotApi.APIgetHotspotElections getHotspotElections(@NotNull String address) throws IOException;

    public HotspotApi.APIgetElectedHotspots getElectedHotspots() throws IOException;

    public HotspotApi.APIgetHotspotChallanges getHotspotChallanges(@NotNull String address) throws IOException;

    public HotspotApi.APIgetRewardsForHotspot getRewardsForHotspot(@NotNull String address) throws IOException;

    public HotspotApi.APIgetRewardsForHotspotByGivenRewardBlock getRewardsForHotspotByGivenRewardBlock(@NotNull String address) throws IOException;

    public HotspotApi.APIgetTotalRewardForHotspot getTotalRewardForHotspot(@NotNull String address) throws IOException;

    public HotspotApi.APIgetWitnessesForHotspot getWitnessesForHotspot(@NotNull String address) throws IOException;

    public HotspotApi.APIgetWitnessedForHotspot getWitnessedForHotspot(@NotNull String address) throws IOException;

}
