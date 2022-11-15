package mobi.appcent.helium.model.stat;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by erenalpaslan on 28.10.2022
 */
@Data
@AllArgsConstructor
public class TokenSupply {
    @SerializedName("token_supply")
    public double tokenSupply;
}
