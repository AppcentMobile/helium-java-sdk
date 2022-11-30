package mobi.appcent.helium.response.dc;

import lombok.AllArgsConstructor;
import lombok.Data;
import mobi.appcent.helium.model.dc.DCBurnEvent;

import java.util.List;

/**
 * Created by erenalpaslan on 27.11.2022
 */
@Data
@AllArgsConstructor
public class DCBurnEventsResponse {
    private List<DCBurnEvent> data;
    private String cursor;
}
