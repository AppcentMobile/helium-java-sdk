package mobi.appcent.helium;

import com.google.gson.Gson;
import mobi.appcent.helium.httpClient.HttpClient;
import mobi.appcent.helium.httpClient.HttpMethod;
import mobi.appcent.helium.model.Pair;
import okhttp3.*;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

public class HeliumSdkClient {
    private OkHttpClient client;
    protected static final Gson gson = new Gson();

    public HeliumSdkClient() {
    }

    public void initOkHttpClient() {
        this.client = HttpClient.client();
    }

    public void setOkHttpClient(OkHttpClient client) {
        if (client == null) {
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
        url.append(path);
        Boolean haveQueryParams = false;
        for (int i = 0; i < queryParams.size(); i++) {
            Pair pair = queryParams.get(i);
            if (pair.getValue() != null) {
                if (!haveQueryParams) {
                    url.append("?");
                    haveQueryParams = true;
                }else {
                    url.append("&");
                }
                url.append(pair.getKey()).append("=")
                        .append(pair.getValue());
            }
        }
        return url.toString();
    }

    private RequestBody buildRequestBody(Object body) {
        if (body != null)
            return RequestBody.create(gson.toJson(body).getBytes(StandardCharsets.UTF_8));

        return null;
    }
}
