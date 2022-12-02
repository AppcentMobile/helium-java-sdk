package mobi.appcent.helium.model.dc;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigInteger;
import java.net.Inet4Address;

/**
 * Created by erenalpaslan on 27.11.2022
 */
@Data
@AllArgsConstructor
public class DCBurnEvent {
    private String address;
    private Integer amount;
    private Integer block;
    @SerializedName("oracle_price")
    private BigInteger oraclePrice;
    private String type;
}
