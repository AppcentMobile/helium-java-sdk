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
 * Created by erenalpaslan on 5.11.2022
 */
public class AccountApi extends BaseApi implements IAccountsApi{

    public static AccountApi getInstance() {
        return new AccountApi();
    }

    @Override
    String path() {
        return BASE_URL + "/accounts";
    }

    @Override
    public APIgetAccountsRequest getAccounts() throws IOException {
        return new APIgetAccountsRequest();
    }

    public class APIgetAccountsRequest {
        private String cursor;

        private APIgetAccountsRequest() {}

        public APIgetAccountsRequest cursor(String cursor) {
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

    @Override
    public APIgetRichestAccountsRequest getRichestAccounts() throws IOException {
        return new APIgetRichestAccountsRequest();
    }

    public class APIgetRichestAccountsRequest {

        private String limit;

        private APIgetRichestAccountsRequest() {}

        public AccountsResponse execute() throws IOException {
            String path = path() + "/rich";
            ArrayList<Pair> queryParams = new ArrayList<>();
            queryParams.add(Pair.create("limit", limit));
            Call call = sdkClient.buildCall(path, HttpMethod.GET, queryParams, null, null);
            Type type = TypeToken.get(AccountsResponse.class).getType();
            return AccountApi.this.execute(call, type);
        }

    }

    @Override
    public APIgetAccountForAddressRequest getAccountForAddress(String address) throws IOException {
        return new APIgetAccountForAddressRequest(address);
    }

    public class APIgetAccountForAddressRequest {
        private final String address;

        private APIgetAccountForAddressRequest(String address) {
            this.address = address;
        }

        public AccountResponse execute() throws IOException {
            String path = path() + "/" + address;
            Call call = sdkClient.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
            Type type = TypeToken.get(AccountResponse.class).getType();
            return AccountApi.this.execute(call, type);
        }
    }

    @Override
    public APIgetHotspotsForAccountRequest getHotspotsForAccount(String address) throws IOException {
        return new APIgetHotspotsForAccountRequest(address);
    }

    public class APIgetHotspotsForAccountRequest {
        private final String address;
        private String cursor;
        private String filterModes;

        public APIgetHotspotsForAccountRequest(String address) {
            this.address = address;
        }

        public APIgetHotspotsForAccountRequest cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public APIgetHotspotsForAccountRequest filterModes(String filterModes) {
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

    //TODO: adds response with validator api
    @Override
    public String getValidatorsForAccount(String address) throws IOException {
        return null;
    }

    @Override
    public APIgetOUIsForAccountRequest getOUIsForAccount(String address) throws IOException {
        return new APIgetOUIsForAccountRequest(address);
    }

    public class APIgetOUIsForAccountRequest {
        private final String address;
        private String cursor;

        private APIgetOUIsForAccountRequest(String address) {
            this.address = address;
        }

        public APIgetOUIsForAccountRequest cursor(String cursor) {
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

    @Override
    public APIgetRolesForAccountRequest getRolesForAccount(String address) throws IOException {
        return new APIgetRolesForAccountRequest(address);
    }

    public class APIgetRolesForAccountRequest {
        private final String address;
        private String filterTypes;
        private String minTime;
        private String maxTime;
        private String limit;

        public APIgetRolesForAccountRequest(String address) {
            this.address = address;
        }

        public APIgetRolesForAccountRequest filterTypes(String filterTypes) {
            this.filterTypes = filterTypes;
            return this;
        }

        public APIgetRolesForAccountRequest minTime(String minTime) {
            this.minTime = minTime;
            return this;
        }

        public APIgetRolesForAccountRequest maxTime(String maxTime) {
            this.maxTime = maxTime;
            return this;
        }

        public APIgetRolesForAccountRequest limit(String limit) {
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

    @Override
    public APIgetRolesCountsForAccountRequest getRolesCountsForAccount(String address) throws IOException {
        return new APIgetRolesCountsForAccountRequest(address);
    }

    public class APIgetRolesCountsForAccountRequest {
        private final String address;
        private String filterTypes;

        public APIgetRolesCountsForAccountRequest(String address) {
            this.address = address;
        }

        public APIgetRolesCountsForAccountRequest filterTypes(String filterTypes) {
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

    @Override
    public APIgetElectionsForAccountRequest getElectionsForAccount(String address) throws IOException {
        return new APIgetElectionsForAccountRequest(address);
    }

    public class APIgetElectionsForAccountRequest{
        private final String address;
        private String minTime;
        private String maxTime;
        private String limit;

        public APIgetElectionsForAccountRequest(String address) {
            this.address = address;
        }

        public APIgetElectionsForAccountRequest minTime(String minTime) {
            this.minTime = minTime;
            return this;
        }

        public APIgetElectionsForAccountRequest maxTime(String maxTime) {
            this.maxTime = maxTime;
            return this;
        }

        public APIgetElectionsForAccountRequest limit(String limit) {
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

    @Override
    public APIgetChallengesForAccountRequest getChallengesForAccount(String address) throws IOException {
        return new APIgetChallengesForAccountRequest(address);
    }

    public class APIgetChallengesForAccountRequest{
        private final String address;
        private String minTime;
        private String maxTime;
        private String limit;

        public APIgetChallengesForAccountRequest(String address) {
            this.address = address;
        }


        public APIgetChallengesForAccountRequest minTime(String minTime) {
            this.minTime = minTime;
            return this;
        }

        public APIgetChallengesForAccountRequest maxTime(String maxTime) {
            this.maxTime = maxTime;
            return this;
        }

        public APIgetChallengesForAccountRequest limit(String limit) {
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

    @Override
    public APIgetPendingTransactionsForAccountRequest getPendingTransactionsForAccount(String address) throws IOException {
        return new APIgetPendingTransactionsForAccountRequest(address);
    }

    public class APIgetPendingTransactionsForAccountRequest{
        private final String address;
        private String cursor;

        public APIgetPendingTransactionsForAccountRequest(String address) {
            this.address = address;
        }


        public APIgetPendingTransactionsForAccountRequest cursor(String cursor) {
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

    @Override
    public APIgetRewardsForAccountRequest getRewardsForAccount(String address) throws IOException {
        return new APIgetRewardsForAccountRequest(address);
    }

    public class APIgetRewardsForAccountRequest {
        private final String address;
        private String minTime;
        private String maxTime;
        private String cursor;

        public APIgetRewardsForAccountRequest(String address) {
            this.address = address;
        }

        public APIgetRewardsForAccountRequest minTime(String minTime) {
            this.minTime = minTime;
            return this;
        }

        public APIgetRewardsForAccountRequest maxTime(String maxTime) {
            this.maxTime = maxTime;
            return this;
        }

        public APIgetRewardsForAccountRequest cursor(String cursor) {
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

    @Override
    public String getRewardsByRewardsBlockForAccount(String address, String block) throws IOException {
        return null;
    }

    public class APIgetRewardsByRewardsBlockForAccountRequest {
        private final String address;
        private final String block;

        private APIgetRewardsByRewardsBlockForAccountRequest(String address, String block) {
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

    @Override
    public String getRewardTotalsForAccount(String address) throws IOException {
        return null;
    }

    public class APIgetRewardTotalsForAccountRequest {
        private final String address;
        private String minTime;
        private String maxTime;
        private String bucket;

        private APIgetRewardTotalsForAccountRequest(String address) {
            this.address = address;
        }

        public APIgetRewardTotalsForAccountRequest maxTime(String maxTime) {
            this.maxTime = maxTime;
            return this;
        }

        public APIgetRewardTotalsForAccountRequest bucket(String bucket) {
            this.bucket = bucket;
            return this;
        }

        public APIgetRewardTotalsForAccountRequest minTime(String minTime) {
            this.minTime = minTime;
            return this;
        }

        public HotspotTotalRewardResponse execute() throws IOException {
            String path = path() + "/" + address + "/rewards/sum";
            ArrayList<Pair> queryParams = new ArrayList<>();
            queryParams.add(Pair.create("bucket", bucket));
            queryParams.add(Pair.create("max_time", maxTime));
            queryParams.add(Pair.create("min_time", minTime));
            Call call = sdkClient.buildCall(path, HttpMethod.GET, queryParams, null, null);
            Type type = TypeToken.get(HotspotTotalRewardResponse.class).getType();
            return AccountApi.this.execute(call, type);
        }
    }

    //TODO 500 response
    @Override
    public String getStatsForAccount(String address) throws IOException {
        return null;
    }
}
