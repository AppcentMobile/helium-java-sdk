package mobi.appcent.helium.model.oracle;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigInteger;

/**
 * Created by erenalpaslan on 26.11.2022
 */
@Data
@AllArgsConstructor
public class OraclePrice {
    private String timestamp;
    private BigInteger price;
    private BigInteger block;
}
