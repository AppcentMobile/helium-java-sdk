package mobi.appcent.helium;

import okhttp3.OkHttpClient;
import okhttp3.Request;


public class HttpClient {
    private final OkHttpClient httpClient;

    private HttpClient(String baseApiUrl) {
        httpClient = new OkHttpClient().newBuilder().addInterceptor(chain -> {
            Request originalRequest = chain.request();
            Request.Builder builder = originalRequest.newBuilder().header("User-agent", "user-agent");
            Request newRequest = builder.build();
            return chain.proceed(newRequest);
        }).build();
    }

    public static OkHttpClient client(String baseApiUrl) {
        return new HttpClient(baseApiUrl).httpClient;
    }

}
