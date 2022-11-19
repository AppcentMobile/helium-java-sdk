package mobi.appcent.helium.model.hotspot;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by erenalpaslan on 27.10.2022
 */
@Data
@AllArgsConstructor
public class TotalReward {
    @SerializedName("max_time")
    private String maxTime;
    @SerializedName("min_time")
    private String minTime;
    private String sum;
}
