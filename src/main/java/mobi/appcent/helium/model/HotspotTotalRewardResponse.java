package mobi.appcent.helium.model;

/**
 * Created by erenalpaslan on 27.10.2022
 */
public class HotspotTotalRewardResponse {
    private TotalReward data;

    public HotspotTotalRewardResponse(TotalReward data) {
        this.data = data;
    }

    public TotalReward getData() {
        return data;
    }

    public void setData(TotalReward data) {
        this.data = data;
    }
}
