package mobi.appcent.helium.api;

import mobi.appcent.helium.request.reward.RewardTotalsRequest;

/**
 * Created by erenalpaslan on 26.11.2022
 */
public class RewardApi extends BaseApi implements IRewardsApi {

    public static RewardApi getInstance() {
        return new RewardApi();
    }

    @Override
    public RewardTotalsRequest getRewardTotals(String minTime) {
        return new RewardTotalsRequest(sdkClient, minTime);
    }
}
