package mobi.appcent.helium.api;

import mobi.appcent.helium.model.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;

public interface IHotspotApi {
    public HotspotsResponse getHotspots(@Nullable String cursor, @Nullable String filterModes) throws IOException;

    public HotspotResponse getHotspotByGivenAdress(@Nullable String address) throws IOException;

    public HotspotsResponse getHotspotsByGivenName(@Nullable String name) throws IOException;

    public HotspotsResponse searchHotspotsByGivenName(@Nullable String name) throws IOException;

    public HotspotsResponse searchHotspotsByLocationDistance(float lat, float lon, int distance) throws IOException;

    public HotspotsResponse searchHotspotsByLocationBox(float swlat, float swlon, float nelat, float nelon) throws IOException;

    public HotspotsResponse getHotspotsByGivenH3Index(String index) throws IOException;

    public HotspotRolesResponse getHotspotRoles(@NotNull String address, @Nullable String cursor, @Nullable String filterTypes, @Nullable String minTime, @Nullable String maxTime, @Nullable String limit) throws IOException;

    public HotspotsRolesCountResponse getHotspotsRolesCount(@NotNull String address, @Nullable String filterTypes) throws IOException;

    public HotspotElectionsResponse getHotspotElections(@NotNull String address, @Nullable String cursor, @Nullable String minTime, @Nullable String maxTime, @Nullable String limit) throws IOException;

    public HotspotsResponse getElectedHotspots() throws IOException;

    public HotspotChallangesResponse getHotspotChallanges(@NotNull String address, @Nullable String cursor, @Nullable String minTime, @Nullable String maxTime, @Nullable String limit) throws IOException;

    public HotspotRewardResponse getRewardsForHotspot(@NotNull String address, @Nullable String cursor, @Nullable String maxTime, @Nullable String minTime) throws IOException;

    public HotspotRewardResponse getRewardsForHotspotByGivenRewardBlock(@NotNull String address) throws IOException;

    public HotspotTotalRewardResponse getTotalRewardForHotspot(@NotNull String address, @Nullable String maxTime, @Nullable String minTime, @Nullable String bucket) throws IOException;

    public HotspotsResponse getWitnessesForHotspot(@NotNull String address) throws IOException;

    public HotspotsResponse getWitnessedForHotspot(@NotNull String address) throws IOException;

}
