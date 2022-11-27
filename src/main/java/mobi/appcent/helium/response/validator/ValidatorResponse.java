package mobi.appcent.helium.response.validator;

import lombok.AllArgsConstructor;
import lombok.Data;
import mobi.appcent.helium.model.validator.Validator;

/**
 * Created by erenalpaslan on 7.11.2022
 */
@Data
@AllArgsConstructor
public class ValidatorResponse {
    private Validator data;
    private String cursor;
}
