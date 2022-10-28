package mobi.appcent.helium.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by erenalpaslan on 28.10.2022
 */
public class Counts{
    public int validators;
    public int ouis;
    @SerializedName("hotspots_dataonly")
    public int hotspotsDataonly;
    public int blocks;
    public int challenges;
    public int cities;
    @SerializedName("consensus_groups")
    public int consensusGroups;
    public int countries;
    public int hotspots;
    public int transactions;
}
