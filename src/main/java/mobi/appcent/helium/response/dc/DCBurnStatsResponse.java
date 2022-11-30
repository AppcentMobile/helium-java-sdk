package mobi.appcent.helium.response.dc;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import mobi.appcent.helium.model.dc.DCBurnStat;
import mobi.appcent.helium.model.dc.DCBurnTotal;
import mobi.appcent.helium.response.Meta;

/**
 * Created by erenalpaslan on 27.11.2022
 */
@Data
@AllArgsConstructor
public class DCBurnStatsResponse {
    private DCBurnStat data;
    private Meta meta;
}
