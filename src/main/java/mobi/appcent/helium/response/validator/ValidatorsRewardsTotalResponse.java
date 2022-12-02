package mobi.appcent.helium.response.validator;

import lombok.AllArgsConstructor;
import lombok.Data;
import mobi.appcent.helium.model.validator.ValidatorsRewardsTotal;
import mobi.appcent.helium.model.validator.ValidatorsRewardsTotalMeta;

/**
 * Created by erenalpaslan on 8.11.2022
 */
@Data
@AllArgsConstructor
public class ValidatorsRewardsTotalResponse {
    private ValidatorsRewardsTotal data;
    private ValidatorsRewardsTotalMeta meta;
}
