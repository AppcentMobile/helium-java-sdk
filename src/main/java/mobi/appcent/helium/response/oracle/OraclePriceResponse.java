package mobi.appcent.helium.response.oracle;

import lombok.AllArgsConstructor;
import lombok.Data;
import mobi.appcent.helium.model.oracle.OraclePrice;

/**
 * Created by erenalpaslan on 26.11.2022
 */
@Data
@AllArgsConstructor
public class OraclePriceResponse {
    private OraclePrice data;
}
