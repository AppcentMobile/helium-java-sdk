package mobi.appcent.helium.model;

import com.google.gson.annotations.SerializedName;

import java.math.BigInteger;

/**
 * Created by erenalpaslan on 5.11.2022
 */
public class Payment {
    @SerializedName("token_type")
    public String tokenType;
    public String payee;
    public String memo;
    public Boolean max;
    public BigInteger amount;
}
