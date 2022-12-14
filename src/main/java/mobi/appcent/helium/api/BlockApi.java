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
    public HeightRequest getHeight(){
        return new HeightRequest(sdkClient);
    }

    @Override
    public BlockStatsRequest getBlockStats(){
        return new BlockStatsRequest(sdkClient);
    }


    @Override
    public BlockDescriptionsRequest getBlockDescriptions(){
        return new BlockDescriptionsRequest(sdkClient);
    }

    @Override
    public BlockByGivenHeightRequest getBlockByGivenHeight(@NotNull Integer height){
        return new BlockByGivenHeightRequest(sdkClient, height);
    }

    @Override
    public BlockTransactionsByGivenHeightRequest getBlockTransactionsByGivenHeight(@NotNull Integer height){
        return new BlockTransactionsByGivenHeightRequest(sdkClient, height);
    }

    @Override
    public BlockByGivenHashRequest getBlockByGivenHash(@NotNull String hash){
        return new BlockByGivenHashRequest(sdkClient, hash);
    }

    @Override
    public BlockTransactionsByGivenHashRequest getBlockTransactionsByGivenHash(@NotNull String hash){
        return new BlockTransactionsByGivenHashRequest(sdkClient, hash);
    }

}
