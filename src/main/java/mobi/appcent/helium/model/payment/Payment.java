package mobi.appcent.helium.model.payment;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigInteger;

/**
 * Created by erenalpaslan on 20.11.2022
 */
@Data
@AllArgsConstructor
public class Payment {
    @SerializedName("token_type")
    public String tokenType;
    public String payee;
    public String memo;
    public Boolean max;
    public BigInteger amount;
}