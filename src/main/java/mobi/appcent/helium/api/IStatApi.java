package mobi.appcent.helium.api;

import mobi.appcent.helium.exception.ApiException;

/**
 * Created by erenalpaslan on 28.10.2022
 */
public interface IStatApi {
    public StatApi.APIgetBlockchainStatsRequest getBlockchainStats() throws ApiException;

    public StatApi.APIgetTokenSupplyRequest getTokenSupply() throws ApiException;
}
