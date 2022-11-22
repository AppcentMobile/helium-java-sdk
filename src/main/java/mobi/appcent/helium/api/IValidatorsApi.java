package mobi.appcent.helium.api;

import mobi.appcent.helium.request.validator.*;

import java.io.IOException;

/**
 * Created by erenalpaslan on 7.11.2022
 */
public interface IValidatorsApi {
    ValidatorsRequest getValidators() throws IOException;
    ValidatorForAddressRequest getValidatorForAddress(String address) throws IOException;
    ValidatorsForNameRequest getValidatorsForName(String name) throws IOException;
    SearchValidatorsByNameRequest searchValidatorsByName() throws IOException;
    ValidatorRolesRequest getValidatorRoles(String address) throws IOException;
    ValidatorRolesCountsRequest getValidatorRolesCounts(String address) throws IOException;
    StatsForValidatorsRequest getStatsForValidators() throws IOException;
    CurrentlyElectedValidatorsRequest getCurrentlyElectedValidators() throws IOException;
    ElectedValidatorsAtBlockRequest getElectedValidatorsAtBlock(Integer height) throws IOException;
    ElectedValidatorsInElectionRequest getElectedValidatorsInElection(Integer hash) throws IOException;
    RewardsForValidatorRequest getRewardsForValidator(String address, String minTime, String maxTime) throws IOException;
    RewardTotalForValidatorRequest getRewardTotalForValidator(String address, String minTime, String maxTime) throws IOException;
    RewardTotalForAllValidatorsRequest getRewardTotalForAllValidators(String minTime, String maxTime) throws IOException;
}
