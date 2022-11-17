package mobi.appcent.helium.model.block;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by erenalpaslan on 28.10.2022
 */
@Data
@AllArgsConstructor
public class BlockTransaction {
    public Integer version;
    public String type;
    public String time;
    public String signature;
    @SerializedName("secret_hash")
    public String secretHash;
    public String owner;
    @SerializedName("onion_key_hash")
    public String onionKeyHash;
    public String location;
    public Double lng;
    public Double lat;
    public Integer height;
    public String hash;
    public Integer fee;
    public String challenger;
    @SerializedName("block_hash")
    public String blockHash;
}
