package mobi.appcent.helium.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by erenalpaslan on 27.10.2022
 */
public class TotalReward {
    @SerializedName("max_time")
    private String maxTime;
    @SerializedName("min_time")
    private String minTime;
    private String sum;

    public TotalReward(String maxTime, String minTime, String sum) {
        this.maxTime = maxTime;
        this.minTime = minTime;
        this.sum = sum;
    }

    public String getMaxTime() {
        return maxTime;
    }

    public void setMaxTime(String maxTime) {
        this.maxTime = maxTime;
    }

    public String getMinTime() {
        return minTime;
    }

    public void setMinTime(String minTime) {
        this.minTime = minTime;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }
}
