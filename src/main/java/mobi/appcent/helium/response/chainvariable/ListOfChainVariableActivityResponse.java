package mobi.appcent.helium.response.chainvariable;

import lombok.AllArgsConstructor;
import lombok.Data;
import mobi.appcent.helium.model.chainvariable.ChainVariable;
import mobi.appcent.helium.model.chainvariable.ChainVariableActivity;

import java.util.List;

/**
 * Created by erenalpaslan on 26.11.2022
 */
@Data
@AllArgsConstructor
public class ListOfChainVariableActivityResponse {
    private List<ChainVariableActivity> data;
}
