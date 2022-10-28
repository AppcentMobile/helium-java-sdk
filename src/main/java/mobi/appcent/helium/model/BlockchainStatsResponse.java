package mobi.appcent.helium.model;

/**
 * Created by erenalpaslan on 28.10.2022
 */
public class BlockchainStatsResponse {
    private BlockchainStat data;

    public BlockchainStatsResponse(BlockchainStat data) {
        this.data = data;
    }

    public BlockchainStat getData() {
        return data;
    }

    public void setData(BlockchainStat data) {
        this.data = data;
    }
}
