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
    public ValidatorsRequest getValidators(){
        return new ValidatorsRequest(sdkClient);
    }

    @Override
    public ValidatorForAddressRequest getValidatorForAddress(String address) {
        return new ValidatorForAddressRequest(sdkClient, address);
    }

    @Override
    public ValidatorsForNameRequest getValidatorsForName(String name){
        return new ValidatorsForNameRequest(sdkClient, name);
    }

    @Override
    public SearchValidatorsByNameRequest searchValidatorsByName(){
        return new SearchValidatorsByNameRequest(sdkClient);
    }

    @Override
    public ValidatorRolesRequest getValidatorRoles(String address){
        return new ValidatorRolesRequest(sdkClient, address);
    }

    @Override
    public ValidatorRolesCountsRequest getValidatorRolesCounts(String address){
        return new ValidatorRolesCountsRequest(sdkClient, address);
    }

    @Override
    public StatsForValidatorsRequest getStatsForValidators(){
        return new StatsForValidatorsRequest(sdkClient);
    }

    @Override
    public CurrentlyElectedValidatorsRequest getCurrentlyElectedValidators(){
        return new CurrentlyElectedValidatorsRequest(sdkClient);
    }

    @Override
    public ElectedValidatorsAtBlockRequest getElectedValidatorsAtBlock(Integer height){
        return new ElectedValidatorsAtBlockRequest(sdkClient, height);
    }

    @Override
    public ElectedValidatorsInElectionRequest getElectedValidatorsInElection(Integer hash){
        return new ElectedValidatorsInElectionRequest(sdkClient, hash);
    }

    @Override
    public RewardsForValidatorRequest getRewardsForValidator(String address, String minTime, String maxTime){
        return new RewardsForValidatorRequest(sdkClient, address, minTime, maxTime);
    }

    @Override
    public RewardTotalForValidatorRequest getRewardTotalForValidator(String address, String minTime, String maxTime){
        return new RewardTotalForValidatorRequest(sdkClient, address, minTime, maxTime);
    }

    @Override
    public RewardTotalForAllValidatorsRequest getRewardTotalForAllValidators(String address, String minTime, String maxTime){
        return new RewardTotalForAllValidatorsRequest(sdkClient, address, minTime, maxTime);
    }
}
