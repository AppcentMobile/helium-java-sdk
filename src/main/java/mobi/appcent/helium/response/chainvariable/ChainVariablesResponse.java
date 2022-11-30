package mobi.appcent.helium.response.chainvariable;

import lombok.AllArgsConstructor;
import lombok.Data;
import mobi.appcent.helium.model.chainvariable.ChainVariable;

/**
 * Created by erenalpaslan on 26.11.2022
 */
@Data
@AllArgsConstructor
public class ChainVariablesResponse {
    private ChainVariable data;
}
