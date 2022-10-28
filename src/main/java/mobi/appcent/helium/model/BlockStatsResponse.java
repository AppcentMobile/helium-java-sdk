package mobi.appcent.helium.model;

/**
 * Created by erenalpaslan on 28.10.2022
 */
public class BlockStatsResponse {
    private BlockTimes data;

    public BlockStatsResponse(BlockTimes data) {
        this.data = data;
    }

    public BlockTimes getData() {
        return data;
    }

    public void setData(BlockTimes data) {
        this.data = data;
    }
}
