package mobi.appcent.helium.model.block;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by erenalpaslan on 28.10.2022
 */
@Data
@AllArgsConstructor
public class BlockchainStat{
    @SerializedName("block_times")
    public BlockTimes blockTimes;
    @SerializedName("challenge_counts")
    public ChallengeCounts challengeCounts;
    public Counts counts;
    @SerializedName("election_times")
    public BlockTimes electionTimes;
    @SerializedName("token_supply")
    public Double tokenSupply;
}
