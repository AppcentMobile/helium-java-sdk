package mobi.appcent.helium.model.dc;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigInteger;

/**
 * Created by erenalpaslan on 27.11.2022
 */
@Data
@AllArgsConstructor
public class DCBurnTotal {
    private BigInteger total;
    @SerializedName("state_channel")
    private BigInteger stateChannel;
    private BigInteger fee;
    @SerializedName("assert_location")
    private BigInteger assertLocation;
    @SerializedName("add_gateway")
    private BigInteger addGateway;
    private Integer routing;
}
