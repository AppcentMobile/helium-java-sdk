package mobi.appcent.helium.response;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by erenalpaslan on 19.11.2022
 */
@Data
@AllArgsConstructor
public class Meta {
    @SerializedName("min_time")
    private String minTime;
    @SerializedName("max_time")
    private String maxTime;
    @SerializedName("bucket")
    private String bucket;
}