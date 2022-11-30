package mobi.appcent.helium.model.dc;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by erenalpaslan on 27.11.2022
 */
@Data
@AllArgsConstructor
public class DCBurnStat {
    @SerializedName("last_day")
    private DCBurnTotal lastDay;
    @SerializedName("last_month")
    private DCBurnTotal lastMonth;
    @SerializedName("last_week")
    private DCBurnTotal lastWeek;
}
