package mobi.appcent.helium.api;

import mobi.appcent.helium.request.oracleprices.*;

/**
 * Created by erenalpaslan on 20.11.2022
 */
public interface IOraclePrices {
    CurrentOraclePriceRequest getCurrentOraclePrice();
    CurrentAndHistoricalOraclePricesRequest getCurrentAndHistoricalOraclePrices();
    OraclePriceStatsRequest getOraclePriceStats(String minTime);
    OraclePriceAtSpecificBlockRequest getOraclePriceAtSpecificBlock(String block);
    ListOfOracleActivityRequest getListOfOracleActivity();
    ListOfOracleForSpecificOracleRequest getListOfActivityForSpecificOracle(String address);
    PredictedHNTOraclePricesRequest getPredictedHNTOraclePrices();
}
