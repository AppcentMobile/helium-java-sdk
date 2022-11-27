package mobi.appcent.helium.model.validator;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by erenalpaslan on 8.11.2022
 */
@Data
@AllArgsConstructor
public class ValidatorsStats {
    private Integer active;
    private Stat cooldown;
    private Stat staked;
    private Stat unstaked;
}
