package mobi.appcent.helium.model.validator;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by erenalpaslan on 8.11.2022
 */
@Data
@AllArgsConstructor
public class ValidatorsRewardsTotalMeta {
    @SerializedName("max_time")
    private String maxTime;
    @SerializedName("min_time")
    private String minTime;
}
