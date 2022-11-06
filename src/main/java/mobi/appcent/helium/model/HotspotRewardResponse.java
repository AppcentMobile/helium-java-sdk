package mobi.appcent.helium.model;

import java.util.List;

/**
 * Created by erenalpaslan on 27.10.2022
 */
public class HotspotRewardResponse {
    private List<Reward> data;
    private String cursor;

    public HotspotRewardResponse(List<Reward> data, String cursor) {
        this.data = data;
        this.cursor = cursor;
    }

    public List<Reward> getData() {
        return data;
    }
    public String getCursor() {
        return cursor;
    }
}
