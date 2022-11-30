package mobi.appcent.helium.response.oracle;

import lombok.AllArgsConstructor;
import lombok.Data;
import mobi.appcent.helium.model.oracle.OracleActivity;

import java.util.List;

/**
 * Created by erenalpaslan on 26.11.2022
 */
@Data
@AllArgsConstructor
public class ListOfOracleActivityResponse {
    private List<OracleActivity> data;
    private String cursor;
}
