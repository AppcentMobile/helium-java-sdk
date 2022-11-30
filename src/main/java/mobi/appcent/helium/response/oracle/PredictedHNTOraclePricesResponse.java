package mobi.appcent.helium.response.oracle;

import lombok.AllArgsConstructor;
import lombok.Data;
import mobi.appcent.helium.model.oracle.PredictedOraclePrice;

import java.util.List;

/**
 * Created by erenalpaslan on 26.11.2022
 */
@Data
@AllArgsConstructor
public class PredictedHNTOraclePricesResponse {
    private final List<PredictedOraclePrice> data;
}
