package mobi.appcent.helium.api;

import com.google.gson.reflect.TypeToken;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.model.*;
import mobi.appcent.helium.response.account.*;
import mobi.appcent.helium.response.hotspot.*;
import mobi.appcent.helium.response.ouis.OuisResponse;
import mobi.appcent.helium.response.validator.ValidatorsResponse;
import okhttp3.Call;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by erenalpaslan on 5.11.2022
 */
public class AccountApi extends BaseApi implements IAccountsApi {

    public static AccountApi getInstance() {
        return new AccountApi();
    }

    @Override
    String path() {
        return BASE_URL + "/accounts";
    }

    //region getAccounts
    @Override
    public AccountsRequest getAccounts() throws IOException {
        return new AccountsRequest();
    }

    public class AccountsRequest {
        private String cursor;

        private AccountsRequest() {
        }

        public AccountsRequest cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public AccountsResponse execute() throws IOException {
            ArrayList<Pair> queryParams = new ArrayList<>();
            queryParams.add(Pair.create("cursor", cursor));
            Call call = sdkClient.buildCall(path(), HttpMethod.GET, queryParams, null, null);
            Type type = TypeToken.get(AccountsResponse.class).getType();
            return AccountApi.this.execute(call, type);
        }
    }
    //endregion

    //region getRichestAccounts
    @Override
    public RichestAccountsRequest getRichestAccounts() throws IOException {
        return new RichestAccountsRequest();
    }

    public class RichestAccountsRequest {

        private String limit;

        private RichestAccountsRequest() {
        }

        public AccountsResponse execute() throws IOException {
            String path = path() + "/rich";
            ArrayList<Pair> queryParams = new ArrayList<>();
            queryParams.add(Pair.create("limit", limit));
            Call call = sdkClient.buildCall(path, HttpMethod.GET, queryParams, null, null);
            Type type = TypeToken.get(AccountsResponse.class).getType();
            return AccountApi.this.execute(call, type);
        }

    }
    //endregion

    //region getAccountForAddress
    @Override
    public AccountForAddressRequest getAccountForAddress(String address) throws IOException {
        return new AccountForAddressRequest(address);
    }

    public class AccountForAddressRequest {
        private final String address;

        private AccountForAddressRequest(String address) {
            this.address = address;
        }

        public AccountResponse execute() throws IOException {
            String path = path() + "/" + address;
            Call call = sdkClient.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
            Type type = TypeToken.get(AccountResponse.class).getType();
            return AccountApi.this.execute(call, type);
        }
    }
    //endregion

    //region getHotspotsForAccount
    @Override
    public HotspotsForAccountRequest getHotspotsForAccount(String address) throws IOException {
        return new HotspotsForAccountRequest(address);
    }

    public class HotspotsForAccountRequest {
        private final String address;
        private String cursor;
        private String filterModes;

        public HotspotsForAccountRequest(String address) {
            this.address = address;
        }

        public HotspotsForAccountRequest cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public HotspotsForAccountRequest filterModes(String filterModes) {
            this.filterModes = filterModes;
            return this;
        }

        public HotspotsResponse execute() throws IOException {
            String path = path() + "/" + address + "/hotspots";
            ArrayList<Pair> queryParams = new ArrayList<>();
            queryParams.add(Pair.create("cursor", cursor));
            queryParams.add(Pair.create("filter_modes", filterModes));
            Call call = sdkClient.buildCall(path, HttpMethod.GET, queryParams, null, null);
            Type type = TypeToken.get(HotspotsResponse.class).getType();
            return AccountApi.this.execute(call, type);
        }

    }
    //endregion

    //region getValidatorsForAccount
    @Override
    public ValidatorsForAccountRequest getValidatorsForAccount(String address) throws IOException {
        return new ValidatorsForAccountRequest(address);
    }

    public class ValidatorsForAccountRequest {
        private final String address;
        private String cursor;

        private ValidatorsForAccountRequest(String address) {
            this.address = address;
        }

        public ValidatorsForAccountRequest cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public ValidatorsResponse execute() throws IOException {
            String path = path() + "/" + address + "/validators";
            ArrayList<Pair> queryParams = new ArrayList<>();
            queryParams.add(Pair.create("cursor", cursor));
            Call call = sdkClient.buildCall(path, HttpMethod.GET, queryParams, null, null);
            Type type = TypeToken.get(ValidatorsResponse.class).getType();
            return AccountApi.this.execute(call, type);
        }
    }
    //endregion

    //region getOUIsForAccount
    @Override
    public OUIsForAccountRequest getOUIsForAccount(String address) throws IOException {
        return new OUIsForAccountRequest(address);
    }

    public class OUIsForAccountRequest {
        private final String address;
        private String cursor;

        private OUIsForAccountRequest(String address) {
            this.address = address;
        }

        public OUIsForAccountRequest cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public OuisResponse execute() throws IOException {
            String path = path() + "/" + address + "/ouis";
            ArrayList<Pair> queryParams = new ArrayList<>();
            queryParams.add(Pair.create("cursor", cursor));
            Call call = sdkClient.buildCall(path, HttpMethod.GET, queryParams, null, null);
            Type type = TypeToken.get(OuisResponse.class).getType();
            return AccountApi.this.execute(call, type);
        }
    }
    //endregion

    //region getRolesForAccount
    @Override
    public RolesForAccountRequest getRolesForAccount(String address) throws IOException {
        return new RolesForAccountRequest(address);
    }

    public class RolesForAccountRequest {
        private final String address;
        private String filterTypes;
        private String minTime;
        private String maxTime;
        private String limit;

        public RolesForAccountRequest(String address) {
            this.address = address;
        }

        public RolesForAccountRequest filterTypes(String filterTypes) {
            this.filterTypes = filterTypes;
            return this;
        }

        public RolesForAccountRequest minTime(String minTime) {
            this.minTime = minTime;
            return this;
        }

        public RolesForAccountRequest maxTime(String maxTime) {
            this.maxTime = maxTime;
            return this;
        }

        public RolesForAccountRequest limit(String limit) {
            this.limit = limit;
            return this;
        }

        public HotspotRolesResponse execute() throws IOException {
            String path = path() + "/" + address + "/roles";
            ArrayList<Pair> queryParams = new ArrayList<>();
            queryParams.add(Pair.create("filter_types", filterTypes));
            queryParams.add(Pair.create("min_time", minTime));
            queryParams.add(Pair.create("max_time", maxTime));
            queryParams.add(Pair.create("limit", limit));
            Call call = sdkClient.buildCall(path, HttpMethod.GET, queryParams, null, null);
            Type type = TypeToken.get(HotspotRolesResponse.class).getType();
            return AccountApi.this.execute(call, type);
        }

    }
    //endregion

    //region getRolesCountsForAccount
    @Override
    public RolesCountsForAccountRequest getRolesCountsForAccount(String address) throws IOException {
        return new RolesCountsForAccountRequest(address);
    }

    public class RolesCountsForAccountRequest {
        private final String address;
        private String filterTypes;

        public RolesCountsForAccountRequest(String address) {
            this.address = address;
        }

        public RolesCountsForAccountRequest filterTypes(String filterTypes) {
            this.filterTypes = filterTypes;
            return this;
        }

        public AccountRolesCountResponse execute() throws IOException {
            String path = path() + "/" + address + "/roles/count";
            ArrayList<Pair> queryParams = new ArrayList<>();
            queryParams.add(Pair.create("filter_types", filterTypes));
            Call call = sdkClient.buildCall(path, HttpMethod.GET, queryParams, null, null);
            Type type = TypeToken.get(AccountRolesCountResponse.class).getType();
            return AccountApi.this.execute(call, type);
        }
    }
    //endregion

    //region getElectionsForAccount
    @Override
    public ElectionsForAccountRequest getElectionsForAccount(String address) throws IOException {
        return new ElectionsForAccountRequest(address);
    }

    public class ElectionsForAccountRequest {
        private final String address;
        private String minTime;
        private String maxTime;
        private String limit;

        public ElectionsForAccountRequest(String address) {
            this.address = address;
        }

        public ElectionsForAccountRequest minTime(String minTime) {
            this.minTime = minTime;
            return this;
        }

        public ElectionsForAccountRequest maxTime(String maxTime) {
            this.maxTime = maxTime;
            return this;
        }

        public ElectionsForAccountRequest limit(String limit) {
            this.limit = limit;
            return this;
        }

        public HotspotElectionsResponse execute() throws IOException {
            String path = path() + "/" + address + "/elections";
            ArrayList<Pair> queryParams = new ArrayList<>();
            queryParams.add(Pair.create("min_time", minTime));
            queryParams.add(Pair.create("max_time", maxTime));
            queryParams.add(Pair.create("limit", limit));
            Call call = sdkClient.buildCall(path, HttpMethod.GET, queryParams, null, null);
            Type type = TypeToken.get(HotspotElectionsResponse.class).getType();
            return AccountApi.this.execute(call, type);
        }
    }
    //endregion

    //region getChallengesForAccount
    @Override
    public ChallengesForAccountRequest getChallengesForAccount(String address) throws IOException {
        return new ChallengesForAccountRequest(address);
    }

    public class ChallengesForAccountRequest {
        private final String address;
        private String minTime;
        private String maxTime;
        private String limit;

        public ChallengesForAccountRequest(String address) {
            this.address = address;
        }


        public ChallengesForAccountRequest minTime(String minTime) {
            this.minTime = minTime;
            return this;
        }

        public ChallengesForAccountRequest maxTime(String maxTime) {
            this.maxTime = maxTime;
            return this;
        }

        public ChallengesForAccountRequest limit(String limit) {
            this.limit = limit;
            return this;
        }

        public HotspotChallangesResponse execute() throws IOException {
            String path = path() + "/" + address + "/challenges";
            ArrayList<Pair> queryParams = new ArrayList<>();
            queryParams.add(Pair.create("min_time", minTime));
            queryParams.add(Pair.create("max_time", maxTime));
            queryParams.add(Pair.create("limit", limit));
            Call call = sdkClient.buildCall(path, HttpMethod.GET, queryParams, null, null);
            Type type = TypeToken.get(HotspotChallangesResponse.class).getType();
            return AccountApi.this.execute(call, type);
        }

    }
    //endregion

    //region getPendingTransactionsForAccount
    @Override
    public PendingTransactionsForAccountRequest getPendingTransactionsForAccount(String address) throws IOException {
        return new PendingTransactionsForAccountRequest(address);
    }

    public class PendingTransactionsForAccountRequest {
        private final String address;
        private String cursor;

        public PendingTransactionsForAccountRequest(String address) {
            this.address = address;
        }


        public PendingTransactionsForAccountRequest cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public AccountTransactionsResponse execute() throws IOException {
            String path = path() + "/" + address + "/pending_transactions";
            ArrayList<Pair> queryParams = new ArrayList<>();
            queryParams.add(Pair.create("cursor", cursor));
            Call call = sdkClient.buildCall(path, HttpMethod.GET, queryParams, null, null);
            Type type = TypeToken.get(AccountTransactionsResponse.class).getType();
            return AccountApi.this.execute(call, type);
        }

    }
    //endregion

    //region getRewardsForAccount
    @Override
    public RewardsForAccountRequest getRewardsForAccount(String address, String minTime) throws IOException {
        return new RewardsForAccountRequest(address, minTime);
    }

    public class RewardsForAccountRequest {
        private final String address;
        private final String minTime;
        private String maxTime;
        private String cursor;

        public RewardsForAccountRequest(String address, String minTime) {
            this.address = address;
            this.minTime = minTime;
        }

        public RewardsForAccountRequest maxTime(String maxTime) {
            this.maxTime = maxTime;
            return this;
        }

        public RewardsForAccountRequest cursor(String cursor) {
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
            return AccountApi.this.execute(call, type);
        }
    }
    //endregion

    //region getRewardsByRewardsBlockForAccount
    @Override
    public RewardsByRewardsBlockForAccountRequest getRewardsByRewardsBlockForAccount(String address, String block) throws IOException {
        return new RewardsByRewardsBlockForAccountRequest(address, block);
    }

    public class RewardsByRewardsBlockForAccountRequest {
        private final String address;
        private final String block;

        private RewardsByRewardsBlockForAccountRequest(String address, String block) {
            this.address = address;
            this.block = block;
        }

        public HotspotRewardResponse execute() throws IOException {
            String path = path() + "/" + address + "/rewards/" + block;
            Call call = sdkClient.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
            Type type = TypeToken.get(HotspotRewardResponse.class).getType();
            return AccountApi.this.execute(call, type);
        }
    }
    //endregion

    //region getRewardTotalsForAccount
    @Override
    public RewardTotalsForAccountRequest getRewardTotalsForAccount(String address, String minTime) throws IOException {
        return new RewardTotalsForAccountRequest(address, minTime);
    }

    public class RewardTotalsForAccountRequest {
        private final String address;
        private final String minTime;
        private String maxTime;
        private String bucket;

        private RewardTotalsForAccountRequest(String address, String minTime) {
            this.address = address;
            this.minTime = minTime;
        }

        public RewardTotalsForAccountRequest bucket(String bucket) {
            this.bucket = bucket;
            return this;
        }

        public RewardTotalsForAccountRequest maxTime(String maxTime) {
            this.maxTime = maxTime;
            return this;
        }

        public AccountTotalRewardsResponse execute() throws IOException {
            String path = path() + "/" + address + "/rewards/sum";
            ArrayList<Pair> queryParams = new ArrayList<>();
            queryParams.add(Pair.create("bucket", bucket));
            queryParams.add(Pair.create("max_time", maxTime));
            queryParams.add(Pair.create("min_time", minTime));
            Call call = sdkClient.buildCall(path, HttpMethod.GET, queryParams, null, null);
            Type type = TypeToken.get(AccountTotalRewardsResponse.class).getType();
            return AccountApi.this.execute(call, type);
        }
    }
    //endregion

    //TODO: 500 response
    private String getStatsForAccount(String address) throws IOException {
        return null;
    }
}
