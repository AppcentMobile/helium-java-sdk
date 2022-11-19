package mobi.appcent.helium.model.block;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by erenalpaslan on 28.10.2022
 */
@Data
@AllArgsConstructor
public class BlockTimes{
    @SerializedName("last_day")
    public LastTime lastDay;
    @SerializedName("last_hour")
    public LastTime lastHour;
    @SerializedName("last_month")
    public LastTime lastMonth;
    @SerializedName("last_week")
    public LastTime lastWeek;
}
