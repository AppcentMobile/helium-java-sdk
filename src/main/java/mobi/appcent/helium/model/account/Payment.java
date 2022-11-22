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
public class Payment {
    @SerializedName("token_type")
    private String tokenType;
    private String payee;
    private String memo;
    private Boolean max;
    private BigInteger amount;
}
