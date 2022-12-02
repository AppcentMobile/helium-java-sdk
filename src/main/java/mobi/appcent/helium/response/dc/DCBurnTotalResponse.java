package mobi.appcent.helium.response.dc;

import lombok.AllArgsConstructor;
import lombok.Data;
import mobi.appcent.helium.model.dc.DCBurnTotal;
import mobi.appcent.helium.response.Meta;

/**
 * Created by erenalpaslan on 27.11.2022
 */
@Data
@AllArgsConstructor
public class DCBurnTotalResponse {
    private DCBurnTotal data;
    private Meta meta;
}
