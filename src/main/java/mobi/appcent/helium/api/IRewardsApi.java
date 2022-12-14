package mobi.appcent.helium.api;

import mobi.appcent.helium.exception.ApiException;
import mobi.appcent.helium.request.reward.RewardTotalsRequest;

/**
 * Created by erenalpaslan on 26.11.2022
 */
public interface IRewardsApi {
    RewardTotalsRequest getRewardTotals(String minTime) throws ApiException;
}
