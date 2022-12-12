package mobi.appcent.helium.api;

import mobi.appcent.helium.request.stat.BlockchainStatsRequest;
import mobi.appcent.helium.request.stat.TokenSupplyRequest;

import java.io.IOException;

/**
 * Created by erenalpaslan on 28.10.2022
 */
public interface IStatApi {
    BlockchainStatsRequest getBlockchainStats() throws IOException;

    TokenSupplyRequest getTokenSupply() throws IOException;
}
