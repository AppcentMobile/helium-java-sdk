package mobi.appcent.helium.api;

import mobi.appcent.helium.request.validator.*;

import mobi.appcent.helium.exception.ApiException;

/**
 * Created by erenalpaslan on 7.11.2022
 */
public interface IValidatorsApi {
    ValidatorsRequest getValidators() throws ApiException;
    ValidatorForAddressRequest getValidatorForAddress(String address) throws ApiException;
    ValidatorsForNameRequest getValidatorsForName(String name) throws ApiException;
    SearchValidatorsByNameRequest searchValidatorsByName() throws ApiException;
    ValidatorRolesRequest getValidatorRoles(String address) throws ApiException;
    ValidatorRolesCountsRequest getValidatorRolesCounts(String address) throws ApiException;
    StatsForValidatorsRequest getStatsForValidators() throws ApiException;
    CurrentlyElectedValidatorsRequest getCurrentlyElectedValidators() throws ApiException;
    ElectedValidatorsAtBlockRequest getElectedValidatorsAtBlock(Integer height) throws ApiException;
    ElectedValidatorsInElectionRequest getElectedValidatorsInElection(Integer hash) throws ApiException;
    RewardsForValidatorRequest getRewardsForValidator(String address, String minTime, String maxTime) throws ApiException;
    RewardTotalForValidatorRequest getRewardTotalForValidator(String address, String minTime, String maxTime) throws ApiException;
    RewardTotalForAllValidatorsRequest getRewardTotalForAllValidators(String address, String minTime, String maxTime) throws ApiException;
}
