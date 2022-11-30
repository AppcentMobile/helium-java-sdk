package mobi.appcent.helium.model.oracle;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigInteger;

/**
 * Created by erenalpaslan on 26.11.2022
 */
@Data
@AllArgsConstructor
public class OracleActivity {
    @SerializedName("block_height")
    private Integer blockHeight;
    private Integer fee;
    private String hash;
    private BigInteger height;
    private BigInteger price;
    @SerializedName("public_key")
    private String publicKey;
    private BigInteger time;
    private String type;
}
