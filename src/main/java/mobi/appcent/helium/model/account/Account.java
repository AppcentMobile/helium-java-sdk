package mobi.appcent.helium.model.account;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigInteger;

/**
 * Created by erenalpaslan on 5.11.2022
 */
@Data
@AllArgsConstructor
public class Account {
    @SerializedName("validator_count")
    private Integer validatorCount;
    @SerializedName("staked_balance")
    private BigInteger stakedBalance;
    @SerializedName("speculative_sec_nonce")
    private Integer speculativeSecNonce;
    @SerializedName("speculative_nonce")
    private Integer speculativeNonce;
    @SerializedName("sec_nonce")
    private Integer secNonce;
    @SerializedName("sec_balance")
    private BigInteger secBalance;
    @SerializedName("nonce")
    private Integer nonce;
    @SerializedName("mobile_balance")
    private BigInteger mobileBalance;
    @SerializedName("iot_balance")
    private BigInteger iotBalance;
    @SerializedName("dc_nonce")
    private Integer dcNonce;
    @SerializedName("dc_balance")
    private BigInteger dcBalance;
    private Integer block;
    private BigInteger balance;
    private String address;
}