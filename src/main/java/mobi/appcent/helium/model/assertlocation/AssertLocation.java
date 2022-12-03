package mobi.appcent.helium.model.assertlocation;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigInteger;

/**
 * Created by erenalpaslan on 3.12.2022
 */
@Data
@AllArgsConstructor
public class AssertLocation {
    private Integer elevation;
    private Integer fee;
    private Integer gain;
    private String gateway;
    private String hash;
    private BigInteger height;
    private Double lat;
    private Double lng;
    private String location;
    private Integer nonce;
    private String owner;
    private String payer;
    @SerializedName("staking_fee")
    private BigInteger stakingFee;
    private Long time;
    private String type;
}
