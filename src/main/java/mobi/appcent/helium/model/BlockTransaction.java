package mobi.appcent.helium.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by erenalpaslan on 28.10.2022
 */
public class BlockTransaction {
    public int version;
    public String type;
    public String time;
    public String signature;
    @SerializedName("secret_hash")
    public String secretHash;
    public String owner;
    @SerializedName("onion_key_hash")
    public String onionKeyHash;
    public String location;
    public double lng;
    public double lat;
    public int height;
    public String hash;
    public int fee;
    public String challenger;
    @SerializedName("block_hash")
    public String blockHash;
}
