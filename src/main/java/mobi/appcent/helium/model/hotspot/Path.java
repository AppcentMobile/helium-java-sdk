package mobi.appcent.helium.model.hotspot;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * Created by erenalpaslan on 27.10.2022
 */
@Data
@AllArgsConstructor
public class Path {
    private List<Witness> witnesses;
    private Receipt receipt;
    private Geocode geocode;
    @SerializedName("challengee_owner")
    private String challangeeOwner;
    @SerializedName("challengee_lon")
    private Float challangeeLon;
    @SerializedName("challengee_location")
    private String challangeeLocation;
    @SerializedName("challengee_lat")
    private Float challangeeLat;
    private String challangee;
}
