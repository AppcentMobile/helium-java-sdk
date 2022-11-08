package mobi.appcent.helium.model;

import com.google.gson.annotations.SerializedName;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by erenalpaslan on 7.11.2022
 */
public class Validator {
    @SerializedName("version_heartbeat")
    public BigInteger versionHeartbeat;
    public ValidatorStatus status;
    @SerializedName("stake_status")
    public String stakeStatus;
    public BigInteger stake;
    public Double penalty;
    public List<Penalty> penalties;
    public String owner;
    public String name;
    @SerializedName("last_heartbeat")
    public BigInteger lastHeartbeat;
    @SerializedName("block_added")
    public BigInteger blockAdded;
    @SerializedName("block")
    public BigInteger block;
    public String address;
}