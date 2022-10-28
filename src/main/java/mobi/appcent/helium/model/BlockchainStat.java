package mobi.appcent.helium.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by erenalpaslan on 28.10.2022
 */
public class BlockchainStat{
    @SerializedName("block_times")
    public BlockTimes blockTimes;
    @SerializedName("challenge_counts")
    public ChallengeCounts challengeCounts;
    public Counts counts;
    @SerializedName("election_times")
    public BlockTimes electionTimes;
    @SerializedName("token_supply")
    public double tokenSupply;
}
