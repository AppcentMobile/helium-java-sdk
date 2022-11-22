package mobi.appcent.helium.response.city;

import lombok.AllArgsConstructor;
import lombok.Data;
import mobi.appcent.helium.model.city.City;

/**
 * Created by erenalpaslan on 28.10.2022
 */
@Data
@AllArgsConstructor
public class CityResponse {
    public City data;
}
