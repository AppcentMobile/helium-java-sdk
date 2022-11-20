package mobi.appcent.helium.response.validator;

import lombok.AllArgsConstructor;
import lombok.Data;
import mobi.appcent.helium.model.validator.Validator;

import java.util.List;

/**
 * Created by erenalpaslan on 20.11.2022
 */
@Data
@AllArgsConstructor
public class ValidatorsResponse {
    public List<Validator> data;
    public String cursor;
}
