package mobi.appcent.helium.api;

import mobi.appcent.helium.request.oracleprices.*;

/**
 * Created by erenalpaslan on 20.11.2022
 */
public class OraclePricesApi extends BaseApi implements IOraclePrices{

    public static OraclePricesApi getInstance() {
        return new OraclePricesApi();
    }

    @Override
    public CurrentOraclePriceRequest getCurrentOraclePrice() {
        return new CurrentOraclePriceRequest(sdkClient);
    }

    @Override
    public CurrentAndHistoricalOraclePricesRequest getCurrentAndHistoricalOraclePrices() {
        return new CurrentAndHistoricalOraclePricesRequest(sdkClient);
    }

    @Override
    public OraclePriceStatsRequest getOraclePriceStats(String minTime) {
        return new OraclePriceStatsRequest(sdkClient, minTime);
    }

    @Override
    public OraclePriceAtSpecificBlockRequest getOraclePriceAtSpecificBlock(String block) {
        return new OraclePriceAtSpecificBlockRequest(sdkClient, block);
    }

    @Override
    public ListOfOracleActivityRequest getListOfOracleActivity() {
        return new ListOfOracleActivityRequest(sdkClient);
    }

    @Override
    public ListOfOracleForSpecificOracleRequest getListOfActivityForSpecificOracle(String address) {
        return new ListOfOracleForSpecificOracleRequest(sdkClient, address);
    }

    @Override
    public PredictedHNTOraclePricesRequest getPredictedHNTOraclePrices() {
        return new PredictedHNTOraclePricesRequest(sdkClient);
    }
}
