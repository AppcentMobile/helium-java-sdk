package mobi.appcent.helium.response.hotspot;

import lombok.AllArgsConstructor;
import lombok.Data;
import mobi.appcent.helium.model.hotspot.Challenge;

import java.util.List;

/**
 * Created by erenalpaslan on 27.10.2022
 */
@Data
@AllArgsConstructor
public class HotspotChallangesResponse {
    public List<Challenge> data;
    public String cursor;
}
