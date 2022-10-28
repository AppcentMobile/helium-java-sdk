package mobi.appcent.helium.api;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

/**
 * Created by erenalpaslan on 28.10.2022
 */
public interface IBlockApi {
    public BlockApi.APIgetHeightRequest getHeight() throws IOException;
    public BlockApi.APIgetBlockStatsRequest getBlockStats() throws IOException;
    public BlockApi.APIgetBlockDescriptionsRequest getBlockDescriptions() throws IOException;
    public BlockApi.APIgetBlockByGivenHeightRequest getBlockByGivenHeight(@NotNull Integer height) throws IOException;
    public BlockApi.APIgetBlockTransactionsByGivenHeightRequest getBlockTransactionsByGivenHeight(@NotNull Integer height) throws IOException;
    public BlockApi.APIgetBlockByGivenHashRequest getBlockByGivenHash(@NotNull String hash) throws IOException;
    public BlockApi.APIgetBlockTransactionsByGivenHashRequest getBlockTransactionsByGivenHash(@NotNull String hash) throws IOException;
}
