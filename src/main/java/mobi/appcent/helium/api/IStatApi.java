package mobi.appcent.helium.api;

import java.io.IOException;

/**
 * Created by erenalpaslan on 28.10.2022
 */
public interface IStatApi {
    public StatApi.APIgetBlockchainStatsRequest getBlockchainStats() throws IOException;

    public StatApi.APIgetTokenSupplyRequest getTokenSupply() throws IOException;
}
