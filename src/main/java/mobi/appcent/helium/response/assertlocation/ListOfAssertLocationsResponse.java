package mobi.appcent.helium.response.assertlocation;

import lombok.AllArgsConstructor;
import lombok.Data;
import mobi.appcent.helium.model.assertlocation.AssertLocation;

import java.util.List;

/**
 * Created by erenalpaslan on 3.12.2022
 */
@Data
@AllArgsConstructor
public class ListOfAssertLocationsResponse {
    private List<AssertLocation> data;
    private String cursor;
}
