package mobi.appcent.helium.response.ouis;

import lombok.AllArgsConstructor;
import lombok.Data;
import mobi.appcent.helium.model.ouis.Ouis;

/**
 * Created by erenalpaslan on 5.11.2022
 */
@Data
@AllArgsConstructor
public class OuisResponse {
    private Ouis data;
}
