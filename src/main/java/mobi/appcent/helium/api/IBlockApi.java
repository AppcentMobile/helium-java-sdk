package mobi.appcent.helium.api;

import mobi.appcent.helium.request.block.*;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

/**
 * Created by erenalpaslan on 28.10.2022
 */
public interface IBlockApi {
    HeightRequest getHeight() throws IOException;
    BlockStatsRequest getBlockStats() throws IOException;
    BlockDescriptionsRequest getBlockDescriptions() throws IOException;
    BlockByGivenHeightRequest getBlockByGivenHeight(@NotNull Integer height) throws IOException;
    BlockTransactionsByGivenHeightRequest getBlockTransactionsByGivenHeight(@NotNull Integer height) throws IOException;
    BlockByGivenHashRequest getBlockByGivenHash(@NotNull String hash) throws IOException;
    BlockTransactionsByGivenHashRequest getBlockTransactionsByGivenHash(@NotNull String hash) throws IOException;
}
