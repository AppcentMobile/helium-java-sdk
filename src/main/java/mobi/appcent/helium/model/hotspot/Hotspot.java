package mobi.appcent.helium.model.hotspot;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Hotspot {
    @SerializedName(value = "score_update_height")
    private int scoreUpdateHeight;
    private int score;
    private String owner;
    private String name;
    private int nonce;
    @SerializedName(value = "reward_scale")
    private float rewardScale;
    private String payer;
    private String location;
    @SerializedName(value = "location_hex")
    private String locationHex;
    private float lng;
    private float lat;
    private long block;
    private Geocode geocode;
    private String address;
    private Status status;
    @SerializedName(value = "speculative_nonce")
    private int speculativeNonce;
    @SerializedName(value = "block_added")
    private long blockAdded;
    @SerializedName(value = "timestamp_added")
    private String timestampAdded;
    @SerializedName(value = "last_poc_challenge")
    private int lastPocChallenge;
    @SerializedName(value = "last_change_block")
    private int lastChangeBlock;
    private int gain;
    private int elevation;
    private String mode;
}

