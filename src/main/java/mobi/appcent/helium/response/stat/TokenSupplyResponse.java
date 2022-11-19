package mobi.appcent.helium.response.stat;

import lombok.AllArgsConstructor;
import lombok.Data;
import mobi.appcent.helium.model.stat.TokenSupply;

/**
 * Created by erenalpaslan on 28.10.2022
 */
@Data
@AllArgsConstructor
public class TokenSupplyResponse {
    private TokenSupply data;
}
