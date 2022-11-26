package mobi.appcent.helium.model.chainvariable;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by erenalpaslan on 26.11.2022
 */
@Data
@AllArgsConstructor
public class ChainVariableActivityVars {
    @SerializedName("price_oracle_height_delta")
    private Integer priceOracleHeightDelta;
    @SerializedName("price_oracle_price_scan_delay")
    private Integer priceOraclePriceScanDelay;
    @SerializedName("price_oracle_price_scan_max")
    private Integer priceOraclePriceScanMax;
    @SerializedName("price_oracle_public_keys")
    private String priceOraclePublicKeys;
    private Integer priceOracleRefreshInterval;
}