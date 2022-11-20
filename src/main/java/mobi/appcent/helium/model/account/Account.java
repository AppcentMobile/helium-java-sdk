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
    public Integer validatorCount;
    @SerializedName("staked_balance")
    public BigInteger stakedBalance;
    @SerializedName("speculative_sec_nonce")
    public Integer speculativeSecNonce;
    @SerializedName("speculative_nonce")
    public Integer speculativeNonce;
    @SerializedName("sec_nonce")
    public Integer secNonce;
    @SerializedName("sec_balance")
    public BigInteger secBalance;
    @SerializedName("nonce")
    public Integer nonce;
    @SerializedName("mobile_balance")
    public BigInteger mobileBalance;
    @SerializedName("iot_balance")
    public BigInteger iotBalance;
    @SerializedName("dc_nonce")
    public Integer dcNonce;
    @SerializedName("dc_balance")
    public BigInteger dcBalance;
    public Integer block;
    public BigInteger balance;
    public String address;
}