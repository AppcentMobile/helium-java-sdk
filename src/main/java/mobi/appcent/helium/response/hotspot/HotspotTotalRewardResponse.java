package mobi.appcent.helium.response.hotspot;

import lombok.AllArgsConstructor;
import lombok.Data;
import mobi.appcent.helium.model.hotspot.TotalReward;
import mobi.appcent.helium.model.reward.RewardTotal;
import mobi.appcent.helium.response.Meta;

import java.util.List;

/**
 * Created by erenalpaslan on 27.10.2022
 */
@Data
@AllArgsConstructor
public class HotspotTotalRewardResponse {
    public List<RewardTotal> data;
    public Meta meta;
}
