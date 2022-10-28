package mobi.appcent.helium.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by erenalpaslan on 28.10.2022
 */
public class BlockDescription {
    @SerializedName("transaction_count")
    public int transaction_count;
    public String time;
    @SerializedName("snapshot_hash")
    public String snapshot_hash;
    @SerializedName("prev_hash")
    public String prev_hash;
    public int height;
    public String hash;
}
