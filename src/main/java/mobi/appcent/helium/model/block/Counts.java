package mobi.appcent.helium.model.block;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by erenalpaslan on 28.10.2022
 */
@Data
@AllArgsConstructor
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
