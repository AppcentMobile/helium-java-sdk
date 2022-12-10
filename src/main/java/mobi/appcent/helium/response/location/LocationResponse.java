package mobi.appcent.helium.response.location;

import lombok.AllArgsConstructor;
import lombok.Data;
import mobi.appcent.helium.model.location.Location;

/**
 * Created by erenalpaslan on 3.12.2022
 */
@Data
@AllArgsConstructor
public class LocationResponse {
    private Location data;
}
