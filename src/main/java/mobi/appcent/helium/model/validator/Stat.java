package mobi.appcent.helium.model.validator;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigInteger;

/**
 * Created by erenalpaslan on 8.11.2022
 */
@Data
@AllArgsConstructor
public class Stat {
    private Double amount;
    private Integer count;
}