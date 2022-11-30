package mobi.appcent.helium.response.oracle;

import lombok.AllArgsConstructor;
import lombok.Data;
import mobi.appcent.helium.model.oracle.OraclePriceStat;
import mobi.appcent.helium.response.Meta;

/**
 * Created by erenalpaslan on 26.11.2022
 */
@Data
@AllArgsConstructor
public class OraclePricesStatsResponse {
    private OraclePriceStat data;
    private Meta meta;
}
