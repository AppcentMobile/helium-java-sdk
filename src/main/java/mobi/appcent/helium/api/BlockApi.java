package mobi.appcent.helium.api;

import com.google.gson.reflect.TypeToken;
import javafx.util.Pair;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.model.*;
import okhttp3.Call;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;

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
    public APIgetHeightRequest getHeight() throws IOException {
        return new APIgetHeightRequest();
    }

    public class APIgetHeightRequest{
        private String maxTime;

        public APIgetHeightRequest() {}

        public APIgetHeightRequest maxTime(String maxTime) {
            this.maxTime = maxTime;
            return this;
        }

        public HeightResponse execute() throws IOException {
            String path = path() + "/height";
            ArrayList<Pair> queryParams = new ArrayList<>();
            queryParams.add(new Pair("max_time", maxTime));
            Call call = sdkClient.buildCall(path, HttpMethod.GET, queryParams, null, null);
            Type type = TypeToken.get(HeightResponse.class).getType();
            return BlockApi.this.execute(call, type);
        }
    }

    @Override
    public APIgetBlockStatsRequest getBlockStats() throws IOException {
        return new APIgetBlockStatsRequest();
    }

    public class APIgetBlockStatsRequest{

        public APIgetBlockStatsRequest() {}

        public BlockStatsResponse execute() throws IOException {
            String path = path() + "/stats";
            Call call = sdkClient.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
            Type type = TypeToken.get(BlockStatsResponse.class).getType();
            return BlockApi.this.execute(call, type);
        }
    }


    @Override
    public APIgetBlockDescriptionsRequest getBlockDescriptions() throws IOException {
        return new APIgetBlockDescriptionsRequest();
    }

    public class APIgetBlockDescriptionsRequest{

        private String cursor;

        public APIgetBlockDescriptionsRequest() {}

        public APIgetBlockDescriptionsRequest cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public BlockDescriptionsResponse execute() throws IOException {
            ArrayList<Pair> queryParams = new ArrayList<>();
            queryParams.add(new Pair("cursor", cursor));
            Call call = sdkClient.buildCall(path(), HttpMethod.GET, queryParams, null, null);
            Type type = TypeToken.get(BlockDescriptionsResponse.class).getType();
            return BlockApi.this.execute(call, type);
        }
    }

    @Override
    public APIgetBlockByGivenHeightRequest getBlockByGivenHeight(@NotNull Integer height) throws IOException {
        return new APIgetBlockByGivenHeightRequest(height);
    }

    public class APIgetBlockByGivenHeightRequest{

        private final int height;

        public APIgetBlockByGivenHeightRequest(int height) {
            this.height = height;
        }

        public BlockDescriptionResponse execute() throws IOException {
            String path = path() + "/" + height;
            Call call = sdkClient.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
            Type type = TypeToken.get(BlockDescriptionResponse.class).getType();
            return BlockApi.this.execute(call, type);
        }
    }

    @Override
    public APIgetBlockTransactionsByGivenHeightRequest getBlockTransactionsByGivenHeight(@NotNull Integer height) throws IOException {
        return new APIgetBlockTransactionsByGivenHeightRequest(height);
    }

    public class APIgetBlockTransactionsByGivenHeightRequest{

        private final int height;
        private String cursor;

        public APIgetBlockTransactionsByGivenHeightRequest(int height) {
            this.height = height;
        }

        public APIgetBlockTransactionsByGivenHeightRequest cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public BlockTransactionsResponse execute() throws IOException {
            String path = path() + "/" + height + "/transactions";
            ArrayList<Pair> queryParams = new ArrayList<>();
            queryParams.add(new Pair("cursor", cursor));
            Call call = sdkClient.buildCall(path, HttpMethod.GET, queryParams, null, null);
            Type type = TypeToken.get(BlockTransactionsResponse.class).getType();
            return BlockApi.this.execute(call, type);
        }
    }

    @Override
    public APIgetBlockByGivenHashRequest getBlockByGivenHash(@NotNull String hash) throws IOException {
        return new APIgetBlockByGivenHashRequest(hash);
    }

    public class APIgetBlockByGivenHashRequest{

        private final String hash;

        public APIgetBlockByGivenHashRequest(String hash) {
            this.hash = hash;
        }

        public BlockDescriptionResponse execute() throws IOException {
            String path = path() + "/hash/" + hash;
            Call call = sdkClient.buildCall(path, HttpMethod.GET, Collections.emptyList(), null, null);
            Type type = TypeToken.get(BlockDescriptionResponse.class).getType();
            return BlockApi.this.execute(call, type);
        }
    }

    @Override
    public APIgetBlockTransactionsByGivenHashRequest getBlockTransactionsByGivenHash(@NotNull String hash) throws IOException {
        return new APIgetBlockTransactionsByGivenHashRequest(hash);
    }

    public class APIgetBlockTransactionsByGivenHashRequest{

        private final String hash;
        private String cursor;

        public APIgetBlockTransactionsByGivenHashRequest(String hash) {
            this.hash = hash;
        }

        public APIgetBlockTransactionsByGivenHashRequest cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public BlockTransactionsResponse execute() throws IOException {
            String path = path() + "/hash/" + hash + "/transactions";
            ArrayList<Pair> queryParams = new ArrayList<>();
            queryParams.add(new Pair("cursor", cursor));
            Call call = sdkClient.buildCall(path, HttpMethod.GET, queryParams, null, null);
            Type type = TypeToken.get(BlockTransactionsResponse.class).getType();
            return BlockApi.this.execute(call, type);
        }
    }

}
