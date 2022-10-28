package mobi.appcent.helium.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by erenalpaslan on 27.10.2022
 */
public class Challange {
    private String type;
    private String time;
    private String secret;
    private List<Path> path;
    @SerializedName("onion_key_hash")
    private String onionKeyHash;
    private int height;
    private String hash;
    private int fee;
    @SerializedName("challenger_owner")
    private String challangerOwner;
    @SerializedName("challanger_lon")
    private float challangerLon;
    @SerializedName("challanger_location")
    private String challangerLocation;
    @SerializedName("challanger_lat")
    private float challangerLat;
    private String challanger;
}