package mobi.appcent.helium.response.city;

import lombok.AllArgsConstructor;
import lombok.Data;
import mobi.appcent.helium.model.city.City;

import java.util.List;

/**
 * Created by erenalpaslan on 28.10.2022
 */
@Data
@AllArgsConstructor
public class CitiesResponse {
    public List<City> data;
    public String cursor;
}
