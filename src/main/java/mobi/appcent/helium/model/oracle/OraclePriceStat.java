package mobi.appcent.helium.model.oracle;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by erenalpaslan on 26.11.2022
 */
@Data
@AllArgsConstructor
public class OraclePriceStat {
    private Double stddev;
    private Double min;
    private Double median;
    private Double max;
    private Double avg;
}
