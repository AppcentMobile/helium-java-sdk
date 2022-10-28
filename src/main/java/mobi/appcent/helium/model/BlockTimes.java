package mobi.appcent.helium.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by erenalpaslan on 28.10.2022
 */
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
