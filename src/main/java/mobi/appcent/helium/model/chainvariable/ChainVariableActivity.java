package mobi.appcent.helium.model.chainvariable;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import mobi.appcent.helium.model.chainvariable.ChainVariableActivityVars;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by erenalpaslan on 26.11.2022
 */
@Data
@AllArgsConstructor
public class ChainVariableActivity {
    private List<String> cancels;
    private String hash;
    private BigInteger height;
    @SerializedName("key_proof")
    private String keyProof;
    @SerializedName("master_key")
    private String masterKey;
    private Integer nonce;
    private String proof;
    private Long time;
    private String type;
    private List<String> unsets;
    private ChainVariableActivityVars vars;
    @SerializedName("version_predicate")
    private Integer versionPerdicate;

}
