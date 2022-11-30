package mobi.appcent.helium.response.dc;

import lombok.AllArgsConstructor;
import lombok.Data;
import mobi.appcent.helium.model.dc.DCBurnTotal;
import mobi.appcent.helium.response.Meta;

import java.util.List;

/**
 * Created by erenalpaslan on 27.11.2022
 */
@Data
@AllArgsConstructor
public class DCBurnTotalsResponse {
    private List<DCBurnTotal> data;
    private Meta meta;
}
