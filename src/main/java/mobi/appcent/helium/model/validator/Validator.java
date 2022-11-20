package mobi.appcent.helium.model.validator;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import mobi.appcent.helium.model.hotspot.Status;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by erenalpaslan on 19.11.2022
 */
@Data
@AllArgsConstructor
public class Validator {
    @SerializedName("version_heartbeat")
    public String versionHeartbeat;
    public ValidatorStatus status;
    @SerializedName("stake_status")
    public String stakeStatus;
    public BigInteger stake;
    public Double penalty;
    public List<ValidatorPenalty> penalties;
    public String owner;
    public String name;
    @SerializedName("last_heartbeat")
    public Integer lastHeartbeat;
    @SerializedName("block_added")
    public Integer blockAdded;
    public Integer block;
    public String address;
}
