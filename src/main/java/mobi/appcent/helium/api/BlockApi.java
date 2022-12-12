package mobi.appcent.helium.api;

import mobi.appcent.helium.request.block.*;
import org.jetbrains.annotations.NotNull;

import mobi.appcent.helium.exception.ApiException;

/**
 * Created by erenalpaslan on 28.10.2022
 */
public class BlockApi extends BaseApi implements IBlockApi{

    public static BlockApi getInstance() {
        return new BlockApi();
    }

    @Override
    String path() {
        return BASE_URL + "/blocks";
    }

    @Override
    public HeightRequest getHeight() throws ApiException {
        return new HeightRequest(sdkClient);
    }

    @Override
    public BlockStatsRequest getBlockStats() throws ApiException {
        return new BlockStatsRequest(sdkClient);
    }


    @Override
    public BlockDescriptionsRequest getBlockDescriptions() throws ApiException {
        return new BlockDescriptionsRequest(sdkClient);
    }

    @Override
    public BlockByGivenHeightRequest getBlockByGivenHeight(@NotNull Integer height) throws ApiException {
        return new BlockByGivenHeightRequest(sdkClient, height);
    }

    @Override
    public BlockTransactionsByGivenHeightRequest getBlockTransactionsByGivenHeight(@NotNull Integer height) throws ApiException {
        return new BlockTransactionsByGivenHeightRequest(sdkClient, height);
    }

    @Override
    public BlockByGivenHashRequest getBlockByGivenHash(@NotNull String hash) throws ApiException {
        return new BlockByGivenHashRequest(sdkClient, hash);
    }

    @Override
    public BlockTransactionsByGivenHashRequest getBlockTransactionsByGivenHash(@NotNull String hash) throws ApiException {
        return new BlockTransactionsByGivenHashRequest(sdkClient, hash);
    }

}
