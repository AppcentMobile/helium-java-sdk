package mobi.appcent.helium.response.validator;

import lombok.AllArgsConstructor;
import lombok.Data;
import mobi.appcent.helium.model.validator.ValidatorsStats;

/**
 * Created by erenalpaslan on 8.11.2022
 */
@Data
@AllArgsConstructor
public class ValidatorsStatsResponse {
    private ValidatorsStats data;
}
