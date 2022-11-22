package mobi.appcent.helium.api;

import mobi.appcent.helium.request.account.*;

import java.io.IOException;

/**
 * Created by erenalpaslan on 5.11.2022
 */
public interface IAccountsApi {
    AccountsRequest getAccounts() throws IOException;
    RichestAccountsRequest getRichestAccounts() throws IOException;
    AccountForAddressRequest getAccountForAddress(String address) throws IOException;
    HotspotsForAccountRequest getHotspotsForAccount(String address) throws IOException;
    ValidatorsForAccountRequest getValidatorsForAccount(String address) throws IOException;
    OUIsForAccountRequest getOUIsForAccount(String address) throws IOException;
    RolesForAccountRequest getRolesForAccount(String address) throws IOException;
    RolesCountsForAccountRequest getRolesCountsForAccount(String address) throws IOException;
    ElectionsForAccountRequest getElectionsForAccount(String address) throws IOException;
    ChallengesForAccountRequest getChallengesForAccount(String address) throws IOException;
    PendingTransactionsForAccountRequest getPendingTransactionsForAccount(String address) throws IOException;
    RewardsForAccountRequest getRewardsForAccount(String address, String minTime) throws IOException;
    RewardsByRewardsBlockForAccountRequest getRewardsByRewardsBlockForAccount(String address, String block) throws IOException;
    RewardTotalsForAccountRequest getRewardTotalsForAccount(String address, String minTime) throws IOException;
}
