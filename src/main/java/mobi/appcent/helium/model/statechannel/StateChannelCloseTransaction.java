package mobi.appcent.helium.model.statechannel;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigInteger;

/**
 * Created by erenalpaslan on 3.12.2022
 */
@Data
@AllArgsConstructor
public class StateChannelCloseTransaction {
    private String type;
    private Long time;
    @SerializedName("state_channel")
    private StateChannel stateChannel;
    private BigInteger height;
    private String hash;
    @SerializedName("conflicts_with")
    private String conflictsWith;
    private String closer;
}