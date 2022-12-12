package mobi.appcent.helium.model.statechannel;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by erenalpaslan on 3.12.2022
 */
@Data
@AllArgsConstructor
public class StateChannel {
    private List<Summary> summaries;
    private String state;
    @SerializedName("root_hash")
    private String rootHash;
    private String owner;
    private Integer nonce;
    private String id;
    @SerializedName("expire_at_block")
    private BigInteger expireAtBlock;
}