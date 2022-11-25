package mobi.appcent.helium.model.account;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigInteger;

/**
 * Created by erenalpaslan on 19.11.2022
 */
@Data
@AllArgsConstructor
public class AccountTotalReward {
    private String total;
    private String timestamp;
    private BigInteger sum;
    private Double stddev;
    private Double min;
    private Double median;
    private Double max;
    private Double avg;
}