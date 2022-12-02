package mobi.appcent.helium.model.reward;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigInteger;

/**
 * Created by erenalpaslan on 26.11.2022
 */
@Data
@AllArgsConstructor
public class RewardTotal {
    private Double total;
    private BigInteger sum;
    private Double stddev;
    private Double min;
    private Double median;
    private Double max;
    private Double avg;
}
