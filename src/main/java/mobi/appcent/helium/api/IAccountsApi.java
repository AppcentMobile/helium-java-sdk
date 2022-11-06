package mobi.appcent.helium.api;

import java.io.IOException;

/**
 * Created by erenalpaslan on 5.11.2022
 */
public interface IAccountsApi {
    AccountApi.APIgetAccountsRequest getAccounts() throws IOException;
    AccountApi.APIgetRichestAccountsRequest getRichestAccounts() throws IOException;
    AccountApi.APIgetAccountForAddressRequest getAccountForAddress(String address) throws IOException;
    AccountApi.APIgetHotspotsForAccountRequest getHotspotsForAccount(String address) throws IOException;
    String getValidatorsForAccount(String address) throws IOException;
    AccountApi.APIgetOUIsForAccountRequest getOUIsForAccount(String address) throws IOException;
    AccountApi.APIgetRolesForAccountRequest getRolesForAccount(String address) throws IOException;
    AccountApi.APIgetRolesCountsForAccountRequest getRolesCountsForAccount(String address) throws IOException;
    AccountApi.APIgetElectionsForAccountRequest getElectionsForAccount(String address) throws IOException;
    AccountApi.APIgetChallengesForAccountRequest getChallengesForAccount(String address) throws IOException;
    AccountApi.APIgetPendingTransactionsForAccountRequest getPendingTransactionsForAccount(String address) throws IOException;
    AccountApi.APIgetRewardsForAccountRequest getRewardsForAccount(String address) throws IOException;
    String getRewardsByRewardsBlockForAccount(String address, String block) throws IOException;
    String getRewardTotalsForAccount(String address) throws IOException;
    String getStatsForAccount(String address) throws IOException;
}
