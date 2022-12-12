package mobi.appcent.helium.api;

import mobi.appcent.helium.request.account.*;
import mobi.appcent.helium.exception.ApiException;

/**
 * Created by erenalpaslan on 5.11.2022
 */
public interface IAccountsApi {
    AccountsRequest getAccounts() throws ApiException;
    RichestAccountsRequest getRichestAccounts() throws ApiException;
    AccountForAddressRequest getAccountForAddress(String address) throws ApiException;
    HotspotsForAccountRequest getHotspotsForAccount(String address) throws ApiException;
    ValidatorsForAccountRequest getValidatorsForAccount(String address) throws ApiException;
    OUIsForAccountRequest getOUIsForAccount(String address) throws ApiException;
    RolesForAccountRequest getRolesForAccount(String address) throws ApiException;
    RolesCountsForAccountRequest getRolesCountsForAccount(String address) throws ApiException;
    ElectionsForAccountRequest getElectionsForAccount(String address) throws ApiException;
    ChallengesForAccountRequest getChallengesForAccount(String address) throws ApiException;
    PendingTransactionsForAccountRequest getPendingTransactionsForAccount(String address) throws ApiException;
    RewardsForAccountRequest getRewardsForAccount(String address, String minTime) throws ApiException;
    RewardsByRewardsBlockForAccountRequest getRewardsByRewardsBlockForAccount(String address, String block) throws ApiException;
    RewardTotalsForAccountRequest getRewardTotalsForAccount(String address, String minTime) throws ApiException;

}
