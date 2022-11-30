package mobi.appcent.helium.model.challenge;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * Created by erenalpaslan on 27.10.2022
 */
@Data
@AllArgsConstructor
public class Challenge {
    private String type;
    private String time;
    private String secret;
    private List<Path> path;
    @SerializedName("onion_key_hash")
    private String onionKeyHash;
    private Integer height;
    private String hash;
    private Integer fee;
    @SerializedName("challenger_owner")
    private String challangerOwner;
    @SerializedName("challanger_lon")
    private Float challangerLon;
    @SerializedName("challanger_location")
    private String challangerLocation;
    @SerializedName("challanger_lat")
    private Float challangerLat;
    private String challanger;
}