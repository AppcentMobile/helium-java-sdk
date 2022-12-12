package mobi.appcent.helium.api;

import mobi.appcent.helium.request.account.*;
import mobi.appcent.helium.response.account.*;
import mobi.appcent.helium.response.hotspot.*;
import mobi.appcent.helium.response.ouis.OuisResponse;
import mobi.appcent.helium.response.validator.ValidatorsResponse;
import okhttp3.Call;

import mobi.appcent.helium.exception.ApiException;
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
    public AccountsRequest getAccounts()throws ApiException{
        return new AccountsRequest(sdkClient);
    }
    //endregion

    //region getRichestAccounts
    @Override
    public RichestAccountsRequest getRichestAccounts()throws ApiException{
        return new RichestAccountsRequest(sdkClient);
    }
    //endregion

    //region getAccountForAddress
    @Override
    public AccountForAddressRequest getAccountForAddress(String address)throws ApiException{
        return new AccountForAddressRequest(sdkClient, address);
    }
    //endregion

    //region getHotspotsForAccount
    @Override
    public HotspotsForAccountRequest getHotspotsForAccount(String address)throws ApiException{
        return new HotspotsForAccountRequest(sdkClient, address);
    }
    //endregion

    //region getValidatorsForAccount
    @Override
    public ValidatorsForAccountRequest getValidatorsForAccount(String address)throws ApiException{
        return new ValidatorsForAccountRequest(sdkClient, address);
    }
    //endregion

    //region getOUIsForAccount
    @Override
    public OUIsForAccountRequest getOUIsForAccount(String address)throws ApiException{
        return new OUIsForAccountRequest(sdkClient, address);
    }
    //endregion

    //region getRolesForAccount
    @Override
    public RolesForAccountRequest getRolesForAccount(String address)throws ApiException{
        return new RolesForAccountRequest(sdkClient, address);
    }
    //endregion

    //region getRolesCountsForAccount
    @Override
    public RolesCountsForAccountRequest getRolesCountsForAccount(String address)throws ApiException{
        return new RolesCountsForAccountRequest(sdkClient, address);
    }
    //endregion

    //region getElectionsForAccount
    @Override
    public ElectionsForAccountRequest getElectionsForAccount(String address)throws ApiException{
        return new ElectionsForAccountRequest(sdkClient, address);
    }
    //endregion

    //region getChallengesForAccount
    @Override
    public ChallengesForAccountRequest getChallengesForAccount(String address)throws ApiException{
        return new ChallengesForAccountRequest(sdkClient, address);
    }
    //endregion

    //region getPendingTransactionsForAccount
    @Override
    public PendingTransactionsForAccountRequest getPendingTransactionsForAccount(String address)throws ApiException{
        return new PendingTransactionsForAccountRequest(sdkClient, address);
    }
    //endregion

    //region getRewardsForAccount
    @Override
    public RewardsForAccountRequest getRewardsForAccount(String address, String minTime)throws ApiException{
        return new RewardsForAccountRequest(sdkClient, address, minTime);
    }
    //endregion

    //region getRewardsByRewardsBlockForAccount
    @Override
    public RewardsByRewardsBlockForAccountRequest getRewardsByRewardsBlockForAccount(String address, String block)throws ApiException{
        return new RewardsByRewardsBlockForAccountRequest(sdkClient, address, block);
    }
    //endregion

    //region getRewardTotalsForAccount
    @Override
    public RewardTotalsForAccountRequest getRewardTotalsForAccount(String address, String minTime)throws ApiException{
        return new RewardTotalsForAccountRequest(sdkClient, address, minTime);
    }
    //endregion

    //TODO: 500 response
    private String getStatsForAccount(String address)throws ApiException{
        return null;
    }
}
