package mobi.appcent.helium.response.reward;

import lombok.AllArgsConstructor;
import lombok.Data;
import mobi.appcent.helium.model.reward.RewardTotal;
import mobi.appcent.helium.response.Meta;

/**
 * Created by erenalpaslan on 26.11.2022
 */
@Data
@AllArgsConstructor
public class RewardTotalsResponse {
    private RewardTotal data;
    private Meta meta;
}
