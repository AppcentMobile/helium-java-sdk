package mobi.appcent.helium.api;

import java.io.IOException;

/**
 * Created by erenalpaslan on 7.11.2022
 */
public interface IValidatorsApi {
    ValidatorApi.APIgetValidatorsRequest getValidators() throws IOException;
    ValidatorApi.APIgetValidatorForAddressRequest getValidatorForAddress(String address) throws IOException;
    ValidatorApi.APIgetValidatorsForNameRequest getValidatorsForName(String name) throws IOException;
    ValidatorApi.APIsearchValidatorsByNameRequest searchValidatorsByName() throws IOException;
    ValidatorApi.APIgetValidatorRolesRequest getValidatorRoles(String address) throws IOException;
    ValidatorApi.APIgetValidatorRolesCountsRequest getValidatorRolesCounts(String address) throws IOException;
    ValidatorApi.APIgetStatsForValidatorsRequest getStatsForValidators() throws IOException;
    ValidatorApi.APIgetCurrentlyElectedValidatorsRequest getCurrentlyElectedValidators() throws IOException;
    ValidatorApi.APIgetElectedValidatorsAtBlockRequest getElectedValidatorsAtBlock(Integer height) throws IOException;
    ValidatorApi.APIgetElectedValidatorsInElectionRequest getElectedValidatorsInElection(Integer hash) throws IOException;
    ValidatorApi.APIgetRewardsForValidatorRequest getRewardsForValidator(String address, String minTime, String maxTime) throws IOException;
    ValidatorApi.APIgetRewardTotalForValidatorRequest getRewardTotalForValidator(String address, String minTime, String maxTime) throws IOException;
    ValidatorApi.APIgetRewardTotalForAllValidatorsRequest getRewardTotalForAllValidators(String minTime, String maxTime) throws IOException;
}
