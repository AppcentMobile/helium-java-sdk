package mobi.appcent.helium.api;

import mobi.appcent.helium.request.block.*;
import org.jetbrains.annotations.NotNull;

import mobi.appcent.helium.exception.ApiException;

/**
 * Created by erenalpaslan on 28.10.2022
 */
public interface IBlockApi {
    HeightRequest getHeight() throws ApiException;
    BlockStatsRequest getBlockStats() throws ApiException;
    BlockDescriptionsRequest getBlockDescriptions() throws ApiException;
    BlockByGivenHeightRequest getBlockByGivenHeight(@NotNull Integer height) throws ApiException;
    BlockTransactionsByGivenHeightRequest getBlockTransactionsByGivenHeight(@NotNull Integer height) throws ApiException;
    BlockByGivenHashRequest getBlockByGivenHash(@NotNull String hash) throws ApiException;
    BlockTransactionsByGivenHashRequest getBlockTransactionsByGivenHash(@NotNull String hash) throws ApiException;
}
