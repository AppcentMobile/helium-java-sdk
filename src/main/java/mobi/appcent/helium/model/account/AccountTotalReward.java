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
    public String total;
    public String timestamp;
    public BigInteger sum;
    public Double stddev;
    public Double min;
    public Double median;
    public Double max;
    public Double avg;
}