package mobi.appcent.helium.response.election;

import lombok.AllArgsConstructor;
import lombok.Data;
import mobi.appcent.helium.model.hotspot.Election;

import java.util.List;

/**
 * Created by erenalpaslan on 3.12.2022
 */
@Data
@AllArgsConstructor
public class ListOfElectionsResponse {
    private List<Election> data;
    private String cursor;
}
