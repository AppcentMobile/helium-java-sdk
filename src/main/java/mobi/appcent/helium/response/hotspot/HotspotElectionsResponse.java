package mobi.appcent.helium.response.hotspot;

import lombok.AllArgsConstructor;
import lombok.Data;
import mobi.appcent.helium.model.hotspot.Election;

import java.util.List;

/**
 * Created by erenalpaslan on 27.10.2022
 */
@Data
@AllArgsConstructor
public class HotspotElectionsResponse {
    public List<Election> data;
}
