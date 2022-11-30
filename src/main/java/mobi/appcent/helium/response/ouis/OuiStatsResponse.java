package mobi.appcent.helium.response.ouis;

import lombok.AllArgsConstructor;
import lombok.Data;
import mobi.appcent.helium.model.ouis.OuiStats;

/**
 * Created by erenalpaslan on 26.11.2022
 */
@Data
@AllArgsConstructor
public class OuiStatsResponse {
    private OuiStats data;
}
