package mobi.appcent.helium.api;

import mobi.appcent.helium.exception.ApiException;
import mobi.appcent.helium.request.oracleprices.*;

/**
 * Created by erenalpaslan on 20.11.2022
 */
public interface IOraclePrices {
    CurrentOraclePriceRequest getCurrentOraclePrice() throws ApiException;
    CurrentAndHistoricalOraclePricesRequest getCurrentAndHistoricalOraclePrices() throws ApiException;
    OraclePriceStatsRequest getOraclePriceStats(String minTime) throws ApiException;
    OraclePriceAtSpecificBlockRequest getOraclePriceAtSpecificBlock(String block) throws ApiException;
    ListOfOracleActivityRequest getListOfOracleActivity() throws ApiException;
    ListOfOracleForSpecificOracleRequest getListOfActivityForSpecificOracle(String address) throws ApiException;
    PredictedHNTOraclePricesRequest getPredictedHNTOraclePrices() throws ApiException;
}
