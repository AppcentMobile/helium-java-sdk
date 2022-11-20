package mobi.appcent.helium.model.validator;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigInteger;

/**
 * Created by erenalpaslan on 20.11.2022
 */
@Data
@AllArgsConstructor
public class ValidatorPenalty {
    public String type;
    public BigInteger height;
    public Double amount;
}
