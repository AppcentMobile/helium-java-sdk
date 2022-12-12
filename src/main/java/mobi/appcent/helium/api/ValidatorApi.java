package mobi.appcent.helium.api;

import mobi.appcent.helium.request.validator.*;

import mobi.appcent.helium.exception.ApiException;

/**
 * Created by erenalpaslan on 7.11.2022
 */
public class ValidatorApi extends BaseApi implements IValidatorsApi{

    public static ValidatorApi getInstance() {
        return new ValidatorApi();
    }
    @Override
    String path() {
        return BASE_URL + "/validators";
    }

    @Override
    public ValidatorsRequest getValidators()throws ApiException{
        return new ValidatorsRequest(sdkClient);
    }

    @Override
    public ValidatorForAddressRequest getValidatorForAddress(String address) throws ApiException{
        return new ValidatorForAddressRequest(sdkClient, address);
    }

    @Override
    public ValidatorsForNameRequest getValidatorsForName(String name)throws ApiException{
        return new ValidatorsForNameRequest(sdkClient, name);
    }

    @Override
    public SearchValidatorsByNameRequest searchValidatorsByName()throws ApiException{
        return new SearchValidatorsByNameRequest(sdkClient);
    }

    @Override
    public ValidatorRolesRequest getValidatorRoles(String address)throws ApiException{
        return new ValidatorRolesRequest(sdkClient, address);
    }

    @Override
    public ValidatorRolesCountsRequest getValidatorRolesCounts(String address)throws ApiException{
        return new ValidatorRolesCountsRequest(sdkClient, address);
    }

    @Override
    public StatsForValidatorsRequest getStatsForValidators()throws ApiException{
        return new StatsForValidatorsRequest(sdkClient);
    }

    @Override
    public CurrentlyElectedValidatorsRequest getCurrentlyElectedValidators()throws ApiException{
        return new CurrentlyElectedValidatorsRequest(sdkClient);
    }

    @Override
    public ElectedValidatorsAtBlockRequest getElectedValidatorsAtBlock(Integer height)throws ApiException{
        return new ElectedValidatorsAtBlockRequest(sdkClient, height);
    }

    @Override
    public ElectedValidatorsInElectionRequest getElectedValidatorsInElection(Integer hash)throws ApiException{
        return new ElectedValidatorsInElectionRequest(sdkClient, hash);
    }

    @Override
    public RewardsForValidatorRequest getRewardsForValidator(String address, String minTime, String maxTime)throws ApiException{
        return new RewardsForValidatorRequest(sdkClient, address, minTime, maxTime);
    }

    @Override
    public RewardTotalForValidatorRequest getRewardTotalForValidator(String address, String minTime, String maxTime)throws ApiException{
        return new RewardTotalForValidatorRequest(sdkClient, address, minTime, maxTime);
    }

    @Override
    public RewardTotalForAllValidatorsRequest getRewardTotalForAllValidators(String address, String minTime, String maxTime)throws ApiException{
        return new RewardTotalForAllValidatorsRequest(sdkClient, address, minTime, maxTime);
    }
}
