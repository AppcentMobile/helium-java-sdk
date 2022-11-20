package mobi.appcent.helium.api;

import java.io.IOException;

/**
 * Created by erenalpaslan on 5.11.2022
 */
public interface IAccountsApi {
    AccountApi.AccountsRequest getAccounts() throws IOException;
    AccountApi.RichestAccountsRequest getRichestAccounts() throws IOException;
    AccountApi.AccountForAddressRequest getAccountForAddress(String address) throws IOException;
    AccountApi.HotspotsForAccountRequest getHotspotsForAccount(String address) throws IOException;
    AccountApi.ValidatorsForAccountRequest getValidatorsForAccount(String address) throws IOException;
    AccountApi.OUIsForAccountRequest getOUIsForAccount(String address) throws IOException;
    AccountApi.RolesForAccountRequest getRolesForAccount(String address) throws IOException;
    AccountApi.RolesCountsForAccountRequest getRolesCountsForAccount(String address) throws IOException;
    AccountApi.ElectionsForAccountRequest getElectionsForAccount(String address) throws IOException;
    AccountApi.ChallengesForAccountRequest getChallengesForAccount(String address) throws IOException;
    AccountApi.PendingTransactionsForAccountRequest getPendingTransactionsForAccount(String address) throws IOException;
    AccountApi.RewardsForAccountRequest getRewardsForAccount(String address, String minTime) throws IOException;
    AccountApi.RewardsByRewardsBlockForAccountRequest getRewardsByRewardsBlockForAccount(String address, String block) throws IOException;
    AccountApi.RewardTotalsForAccountRequest getRewardTotalsForAccount(String address, String minTime) throws IOException;
}
