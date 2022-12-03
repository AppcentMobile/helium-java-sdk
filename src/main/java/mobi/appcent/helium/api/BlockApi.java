package mobi.appcent.helium.api;

import mobi.appcent.helium.request.block.*;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

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
    public HeightRequest getHeight() throws IOException {
        return new HeightRequest(sdkClient);
    }

    @Override
    public BlockStatsRequest getBlockStats() throws IOException {
        return new BlockStatsRequest(sdkClient);
    }


    @Override
    public BlockDescriptionsRequest getBlockDescriptions() throws IOException {
        return new BlockDescriptionsRequest(sdkClient);
    }

    @Override
    public BlockByGivenHeightRequest getBlockByGivenHeight(@NotNull Integer height) throws IOException {
        return new BlockByGivenHeightRequest(sdkClient, height);
    }

    @Override
    public BlockTransactionsByGivenHeightRequest getBlockTransactionsByGivenHeight(@NotNull Integer height) throws IOException {
        return new BlockTransactionsByGivenHeightRequest(sdkClient, height);
    }

    @Override
    public BlockByGivenHashRequest getBlockByGivenHash(@NotNull String hash) throws IOException {
        return new BlockByGivenHashRequest(sdkClient, hash);
    }

    @Override
    public BlockTransactionsByGivenHashRequest getBlockTransactionsByGivenHash(@NotNull String hash) throws IOException {
        return new BlockTransactionsByGivenHashRequest(sdkClient, hash);
    }

}
