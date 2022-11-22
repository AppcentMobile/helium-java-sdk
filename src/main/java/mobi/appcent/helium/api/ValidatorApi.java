package mobi.appcent.helium.api;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.model.*;
import mobi.appcent.helium.request.validator.*;
import okhttp3.Call;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;

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
    public ValidatorsRequest getValidators() throws IOException {
        return new ValidatorsRequest(sdkClient);
    }

    @Override
    public ValidatorForAddressRequest getValidatorForAddress(String address) throws IOException {
        return new ValidatorForAddressRequest(sdkClient, address);
    }

    @Override
    public ValidatorsForNameRequest getValidatorsForName(String name) throws IOException {
        return new ValidatorsForNameRequest(sdkClient, name);
    }

    @Override
    public SearchValidatorsByNameRequest searchValidatorsByName() throws IOException {
        return new SearchValidatorsByNameRequest(sdkClient);
    }

    @Override
    public ValidatorRolesRequest getValidatorRoles(String address) throws IOException {
        return new ValidatorRolesRequest(sdkClient, address);
    }

    @Override
    public ValidatorRolesCountsRequest getValidatorRolesCounts(String address) throws IOException {
        return new ValidatorRolesCountsRequest(sdkClient, address);
    }

    @Override
    public StatsForValidatorsRequest getStatsForValidators() throws IOException {
        return new StatsForValidatorsRequest(sdkClient);
    }

    @Override
    public CurrentlyElectedValidatorsRequest getCurrentlyElectedValidators() throws IOException {
        return new CurrentlyElectedValidatorsRequest(sdkClient);
    }

    @Override
    public ElectedValidatorsAtBlockRequest getElectedValidatorsAtBlock(Integer height) throws IOException {
        return new ElectedValidatorsAtBlockRequest(sdkClient, height);
    }

    @Override
    public ElectedValidatorsInElectionRequest getElectedValidatorsInElection(Integer hash) throws IOException {
        return new ElectedValidatorsInElectionRequest(sdkClient, hash);
    }

    @Override
    public RewardsForValidatorRequest getRewardsForValidator(String address, String minTime, String maxTime) throws IOException {
        return new RewardsForValidatorRequest(sdkClient, address, minTime, maxTime);
    }

    @Override
    public RewardTotalForValidatorRequest getRewardTotalForValidator(String address, String minTime, String maxTime) throws IOException {
        return new RewardTotalForValidatorRequest(sdkClient, address, minTime, maxTime);
    }

    @Override
    public RewardTotalForAllValidatorsRequest getRewardTotalForAllValidators(String minTime, String maxTime) throws IOException {
        return new RewardTotalForAllValidatorsRequest(sdkClient, minTime, maxTime);
    }
}
