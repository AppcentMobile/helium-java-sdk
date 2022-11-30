package mobi.appcent.helium.model.validator;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by erenalpaslan on 8.11.2022
 */
@Data
@AllArgsConstructor
public class ValidatorsRewardsTotal {
    private Double avg;
    private Double max;
    private Double median;
    private Double min;
    private Double stddev;
    private Double sum;
    private Double total;
}

