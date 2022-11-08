package mobi.appcent.helium.api;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.model.*;
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
    public APIgetValidatorsRequest getValidators() throws IOException {
        return new APIgetValidatorsRequest();
    }

    public class APIgetValidatorsRequest {
        private String cursor;

        private APIgetValidatorsRequest() {}

        public APIgetValidatorsRequest cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public ValidatorsResponse execute() throws IOException {
            ArrayList<Pair> queryParams = new ArrayList<>();
            queryParams.add(Pair.create("cursor", cursor));
            Call call = sdkClient.buildCall(path(), HttpMethod.GET, queryParams, null, null);
            Type type = TypeToken.get(ValidatorsResponse.class).getType();
            return ValidatorApi.this.execute(call, type);
        }
    }

    @Override
    public APIgetValidatorForAddressRequest getValidatorForAddress(String address) throws IOException {
        return new APIgetValidatorForAddressRequest(address);
    }

    public class APIgetValidatorForAddressRequest {
        private final String address;

        public APIgetValidatorForAddressRequest(String address) {
            this.address = address;
        }

        public ValidatorResponse execute() throws IOException {
            String path = path() + "/" + address;
            Call call = sdkClient.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
            Type type = TypeToken.get(ValidatorResponse.class).getType();
            return ValidatorApi.this.execute(call, type);
        }
    }

    @Override
    public APIgetValidatorsForNameRequest getValidatorsForName(String name) throws IOException {
        return new APIgetValidatorsForNameRequest(name);
    }

    public class APIgetValidatorsForNameRequest {
        private final String name;

        public APIgetValidatorsForNameRequest(String name) {
            this.name = name;
        }

        public ValidatorsResponse execute() throws IOException {
            String path = path() + "/name/" + name;
            Call call = sdkClient.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
            Type type = TypeToken.get(ValidatorsResponse.class).getType();
            return ValidatorApi.this.execute(call, type);
        }
    }

    @Override
    public APIsearchValidatorsByNameRequest searchValidatorsByName() throws IOException {
        return new APIsearchValidatorsByNameRequest();
    }

    public class APIsearchValidatorsByNameRequest {
        private String search;

        private APIsearchValidatorsByNameRequest() {}

        public APIsearchValidatorsByNameRequest search(String search) {
            this.search = search;
            return this;
        }

        public ValidatorsResponse execute() throws IOException {
            String path = path() + "/name";
            ArrayList<Pair> queryParams = new ArrayList<>();
            queryParams.add(Pair.create("search", search));
            Call call = sdkClient.buildCall(path, HttpMethod.GET, queryParams, null, null);
            Type type = TypeToken.get(ValidatorsResponse.class).getType();
            return ValidatorApi.this.execute(call, type);
        }
    }

    @Override
    public APIgetValidatorRolesRequest getValidatorRoles(String address) throws IOException {
        return new APIgetValidatorRolesRequest(address);
    }

    public class APIgetValidatorRolesRequest {
        private final String address;
        private String cursor;
        private String filterTypes;
        private String minTime;
        private String maxTime;
        private int limit;

        private APIgetValidatorRolesRequest(String address) {
            this.address = address;
        }

        public APIgetValidatorRolesRequest cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public APIgetValidatorRolesRequest filterTypes(String filterTypes) {
            this.filterTypes = filterTypes;
            return this;
        }

        public APIgetValidatorRolesRequest minTime(String minTime) {
            this.minTime = minTime;
            return this;
        }

        public APIgetValidatorRolesRequest maxTime(String maxTime) {
            this.maxTime = maxTime;
            return this;
        }

        public APIgetValidatorRolesRequest limit(int limit) {
            this.limit = limit;
            return this;
        }

        public HotspotRolesResponse execute() throws IOException {
            String path = path() + "/" + address + "/roles";
            ArrayList<Pair> queryParams = new ArrayList<>();
            queryParams.add(Pair.create("cursor", cursor));
            queryParams.add(Pair.create("filter_types", filterTypes));
            queryParams.add(Pair.create("min_time", minTime));
            queryParams.add(Pair.create("max_time", maxTime));
            queryParams.add(Pair.create("limit", limit));
            Call call = sdkClient.buildCall(path, HttpMethod.GET, queryParams, null, null);
            Type type = TypeToken.get(HotspotRolesResponse.class).getType();
            return ValidatorApi.this.execute(call, type);
        }
    }

    @Override
    public APIgetValidatorRolesCountsRequest getValidatorRolesCounts(String address) throws IOException {
        return new APIgetValidatorRolesCountsRequest(address);
    }

    public class APIgetValidatorRolesCountsRequest {
        private final String address;
        private String filterTypes;

        private APIgetValidatorRolesCountsRequest(String address) {
            this.address = address;
        }

        public APIgetValidatorRolesCountsRequest filterTypes(String filterTypes) {
            this.filterTypes = filterTypes;
            return this;
        }

        public AccountRolesCountResponse execute() throws IOException {
            String path = path() + address + "/roles/count";
            ArrayList<Pair> queryParams = new ArrayList<>();
            queryParams.add(Pair.create("filter_types", filterTypes));
            Call call = sdkClient.buildCall(path, HttpMethod.GET, queryParams, null, null);
            Type type = TypeToken.get(AccountRolesCountResponse.class).getType();
            return ValidatorApi.this.execute(call, type);
        }
    }

    @Override
    public APIgetStatsForValidatorsRequest getStatsForValidators() throws IOException {
        return new APIgetStatsForValidatorsRequest();
    }

    public class APIgetStatsForValidatorsRequest {

        public ValidatorsStatsResponse execute() throws IOException {
            String path = path() + "/stats";
            Call call = sdkClient.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
            Type type = TypeToken.get(ValidatorsStatsResponse.class).getType();
            return ValidatorApi.this.execute(call, type);
        }

    }

    @Override
    public APIgetCurrentlyElectedValidatorsRequest getCurrentlyElectedValidators() throws IOException {
        return new APIgetCurrentlyElectedValidatorsRequest();
    }

    public class APIgetCurrentlyElectedValidatorsRequest {

        public ValidatorsResponse execute() throws IOException {
            String path = path() + "/elected";
            Call call = sdkClient.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
            Type type = TypeToken.get(ValidatorsResponse.class).getType();
            return ValidatorApi.this.execute(call, type);
        }

    }

    @Override
    public APIgetElectedValidatorsAtBlockRequest getElectedValidatorsAtBlock(Integer height) throws IOException {
        return new APIgetElectedValidatorsAtBlockRequest(height);
    }

    public class APIgetElectedValidatorsAtBlockRequest {
        private final Integer height;

        public APIgetElectedValidatorsAtBlockRequest(Integer height) {
            this.height = height;
        }

        public ValidatorsResponse execute() throws IOException {
            String path = path() + "/elected/" + height;
            Call call = sdkClient.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
            Type type = TypeToken.get(ValidatorsResponse.class).getType();
            return ValidatorApi.this.execute(call, type);
        }
    }

    @Override
    public APIgetElectedValidatorsInElectionRequest getElectedValidatorsInElection(Integer hash) throws IOException {
        return new APIgetElectedValidatorsInElectionRequest(hash);
    }

    public class APIgetElectedValidatorsInElectionRequest {
        private final Integer hash;

        public APIgetElectedValidatorsInElectionRequest(Integer hash) {
            this.hash = hash;
        }

        public ValidatorsResponse execute() throws IOException {
            String path = path() + "/elected/hash/" + hash;
            Call call = sdkClient.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
            Type type = TypeToken.get(ValidatorsResponse.class).getType();
            return ValidatorApi.this.execute(call, type);
        }
    }

    @Override
    public APIgetRewardsForValidatorRequest getRewardsForValidator(String address, String minTime, String maxTime) throws IOException {
        return new APIgetRewardsForValidatorRequest(address, minTime, maxTime);
    }

    public class APIgetRewardsForValidatorRequest {
        private final String address;
        private final String minTime;
        private final String maxTime;
        private String cursor;

        public APIgetRewardsForValidatorRequest(String address, String minTime, String maxTime) {
            this.address = address;
            this.minTime = minTime;
            this.maxTime = maxTime;
        }

        public APIgetRewardsForValidatorRequest cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public HotspotRewardResponse execute() throws IOException {
            String path = path() + "/" + address + "/rewards";
            ArrayList<Pair> queryParams = new ArrayList<>();
            queryParams.add(Pair.create("cursor", cursor));
            queryParams.add(Pair.create("max_time", maxTime));
            queryParams.add(Pair.create("min_time", minTime));
            Call call = sdkClient.buildCall(path, HttpMethod.GET, queryParams, null, null);
            Type type = TypeToken.get(HotspotRewardResponse.class).getType();
            return ValidatorApi.this.execute(call, type);
        }

    }

    @Override
    public APIgetRewardTotalForValidatorRequest getRewardTotalForValidator(String address, String minTime, String maxTime) throws IOException {
        return new APIgetRewardTotalForValidatorRequest(address, minTime, maxTime);
    }

    public class APIgetRewardTotalForValidatorRequest {
        private final String address;
        private final String minTime;
        private final String maxTime;
        private String bucket;

        public APIgetRewardTotalForValidatorRequest(String address, String minTime, String maxTime) {
            this.address = address;
            this.minTime = minTime;
            this.maxTime = maxTime;
        }

        public APIgetRewardTotalForValidatorRequest bucket(String bucket) {
            this.bucket = bucket;
            return this;
        }

        public ValidatorsRewardsTotalResponse execute() throws IOException {
            String path = path() + "/" + address + "/rewards/sum";
            ArrayList<Pair> queryParams = new ArrayList<>();
            queryParams.add(Pair.create("max_time", maxTime));
            queryParams.add(Pair.create("min_time", minTime));
            queryParams.add(Pair.create("bucket", bucket));
            Call call = sdkClient.buildCall(path, HttpMethod.GET, queryParams, null, null);
            Type type = TypeToken.get(ValidatorsRewardsTotalResponse.class).getType();
            return ValidatorApi.this.execute(call, type);
        }
    }

    @Override
    public APIgetRewardTotalForAllValidatorsRequest getRewardTotalForAllValidators(String minTime, String maxTime) throws IOException {
        return new APIgetRewardTotalForAllValidatorsRequest(minTime, maxTime);
    }

    public class APIgetRewardTotalForAllValidatorsRequest {
        private final String minTime;
        private final String maxTime;

        public APIgetRewardTotalForAllValidatorsRequest(String minTime, String maxTime) {
            this.minTime = minTime;
            this.maxTime = maxTime;
        }

        public ValidatorsRewardsTotalResponse execute() throws IOException {
            String path = path() + "/rewards/sum";
            ArrayList<Pair> queryParams = new ArrayList<>();
            queryParams.add(Pair.create("max_time", maxTime));
            queryParams.add(Pair.create("min_time", minTime));
            Call call = sdkClient.buildCall(path, HttpMethod.GET, queryParams, null, null);
            Type type = TypeToken.get(ValidatorsRewardsTotalResponse.class).getType();
            return ValidatorApi.this.execute(call, type);
        }
    }
}
