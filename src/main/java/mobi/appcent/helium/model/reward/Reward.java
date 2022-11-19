package mobi.appcent.helium.model.reward;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by erenalpaslan on 27.10.2022
 */
@Data
@AllArgsConstructor
public class Reward {
    private String account;
    private Integer amount;
    private Integer block;
    private String gateway;
    private String hash;
    private String timestamp;
}
