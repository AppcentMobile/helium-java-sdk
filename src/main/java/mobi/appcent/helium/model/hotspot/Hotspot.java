package mobi.appcent.helium.model.hotspot;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Hotspot {
    @SerializedName(value = "score_update_height")
    private Integer scoreUpdateHeight;
    private Integer score;
    private String owner;
    private String name;
    private Integer nonce;
    @SerializedName(value = "reward_scale")
    private Float rewardScale;
    private String payer;
    private String location;
    @SerializedName(value = "location_hex")
    private String locationHex;
    private Float lng;
    private Float lat;
    private Long block;
    private Geocode geocode;
    private String address;
    private Status status;
    @SerializedName(value = "speculative_nonce")
    private Integer speculativeNonce;
    @SerializedName(value = "block_added")
    private Long blockAdded;
    @SerializedName(value = "timestamp_added")
    private String timestampAdded;
    @SerializedName(value = "last_poc_challenge")
    private Integer lastPocChallenge;
    @SerializedName(value = "last_change_block")
    private Integer lastChangeBlock;
    private Integer gain;
    private Integer elevation;
    private String mode;
}

