package mobi.appcent.helium.api;

import mobi.appcent.helium.exception.ApiException;
import mobi.appcent.helium.request.stat.BlockchainStatsRequest;
import mobi.appcent.helium.request.stat.TokenSupplyRequest;


/**
 * Created by erenalpaslan on 28.10.2022
 */
public interface IStatApi {
    BlockchainStatsRequest getBlockchainStats() throws ApiException;

    TokenSupplyRequest getTokenSupply() throws ApiException;
}
