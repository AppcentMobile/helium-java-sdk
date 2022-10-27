package mobi.appcent.helium;

import com.google.gson.Gson;
import javafx.util.Pair;
import mobi.appcent.helium.httpClient.HttpClient;
import mobi.appcent.helium.httpClient.HttpMethod;
import okhttp3.*;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

public class HeliumSdkClient {
    private static final String BASE_API_URL = "https://api.helium.io/v1/";
    private OkHttpClient client;
    protected static final Gson gson = new Gson();

    public HeliumSdkClient() {
    }

    public void initOkHttpClient() {
        this.client = HttpClient.client(BASE_API_URL);
    }

    //TODO: Override base url
    public void setOkHttpClient(OkHttpClient client) {
        if (this.client == null) {
            initOkHttpClient();
        }else {
            this.client = client;
        }
    }

    public OkHttpClient getOkHttpClient() {
        return this.client;
    }


    public Call buildCall(String path, HttpMethod method, List<Pair> queryParams, Object requestBody, Map<String, String> headers) {
        String url = buildUrl(path, queryParams);
        RequestBody body = buildRequestBody(requestBody);
        Request.Builder builder = new Request.Builder()
                .method(method.toString(), body)
                .url(url);
        if (headers != null) {
            builder.headers(Headers.of(headers));
        }
        return client.newCall(builder.build());
    }

    private String buildUrl(String path, List<Pair> queryParams) {
        final StringBuilder url = new StringBuilder();
        url.append(path).append("?");
        for (int i = 0; i < queryParams.size(); i++) {
            Pair pair = queryParams.get(i);
            url.append(pair.getKey().toString()).append("=")
                    .append(pair.getValue().toString());
            if (i != queryParams.size() - 1)
                url.append("&");
        }
        return url.toString();
    }

    private RequestBody buildRequestBody(Object body) {
        if (body != null)
            return RequestBody.create(gson.toJson(body).getBytes(StandardCharsets.UTF_8));

        return null;
    }
}
