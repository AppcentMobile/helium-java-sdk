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
    private String versionHeartbeat;
    private ValidatorStatus status;
    @SerializedName("stake_status")
    private String stakeStatus;
    private BigInteger stake;
    private Double penalty;
    private List<ValidatorPenalty> penalties;
    private String owner;
    private String name;
    @SerializedName("last_heartbeat")
    private Integer lastHeartbeat;
    @SerializedName("block_added")
    private Integer blockAdded;
    private Integer block;
    private String address;
}
