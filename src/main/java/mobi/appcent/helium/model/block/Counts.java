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
    public Integer validators;
    public Integer ouis;
    @SerializedName("hotspots_dataonly")
    public Integer hotspotsDataonly;
    public Integer blocks;
    public Integer challenges;
    public Integer cities;
    @SerializedName("consensus_groups")
    public Integer consensusGroups;
    public Integer countries;
    public Integer hotspots;
    public Integer transactions;
}
